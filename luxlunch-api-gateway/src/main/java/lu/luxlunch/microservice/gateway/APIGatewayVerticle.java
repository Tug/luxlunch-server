package lu.luxlunch.microservice.gateway;

import io.vertx.core.Promise;
import io.vertx.core.http.*;
import io.vertx.ext.auth.User;
import io.vertx.ext.auth.oauth2.KeycloakHelper;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CorsHandler;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.rxjava.ext.auth.oauth2.AccessToken;
import lu.luxlunch.microservice.account.Account;
import lu.luxlunch.microservice.account.AccountService;
import lu.luxlunch.microservice.common.RestAPIVerticle;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.servicediscovery.Record;
import io.vertx.servicediscovery.ServiceDiscovery;
import io.vertx.servicediscovery.types.EventBusService;
import io.vertx.servicediscovery.types.HttpEndpoint;

import java.util.*;

/**
 * A verticle for global API gateway.
 * This API gateway uses HTTP-HTTP pattern. It's also responsible for
 * load balance and failure handling.
 *
 * @author Eric Zhao
 */
public class APIGatewayVerticle extends RestAPIVerticle {

  private static final int DEFAULT_PORT = 8787;

  private static final Logger logger = LoggerFactory.getLogger(APIGatewayVerticle.class);

  @Override
  public void start(Future<Void> future) throws Exception {
    super.start();

    // get HTTP host and port from configuration, or use default value
    String host = config().getString("api.gateway.http.address", "localhost");
    int port = config().getInteger("api.gateway.http.port", DEFAULT_PORT);

    Router router = Router.router(vertx);

    // secure only in production
    if (!config().getString("emv", "development").equals("development")) {
      System.setProperty("vertx.development", "false");
      System.setProperty("vertx.production", "true");
      logger.info("Running in production mode");
    } else {
      System.setProperty("vertx.development", "true");
      System.setProperty("vertx.production", "false");
      logger.info("Running in development mode");
    }
    boolean __DEV__ = Boolean.getBoolean("vertx.development");

    if (!__DEV__) {
      SecurityConfig.setupSecurity(vertx, router);
    }

    // CORS
    setupCORS(router);

    // body handler
    router.route().handler(BodyHandler.create());

    router.errorHandler(500, rc -> {
      System.err.println("Handling failure");
      Throwable failure = rc.failure();
      if (failure != null) {
        failure.printStackTrace();
      }
    });
    router.route().failureHandler(this::error);

    // version handler
    router.get("/v").handler(this::apiVersion);

    //authProvider = OAuthProvider.create(vertx, router);
    //router.route().handler(authProvider);
    //router.get("/uaa").handler(this::authUaaHandler);

    AuthConfig authConfig = AuthConfig.create(vertx, config().getJsonObject("keycloak-auth-options"));
    router.route().handler(authConfig);
    router.get("/rest/userinfo").handler(authConfig::getUserInfo);

    // api dispatcher
    router.route("/rest/*")
            .handler(this::dispatchRequests);
            //.consumes("application/json")
            //.produces("application/json");

    // static content
    // TODO: proxy to localhost:3000 on dev or serve static content
    if ( __DEV__ ) {
      //WebpackDevServerProxy.create(vertx, router, "localhost", 3000);
    }

    router.route("/*").handler(StaticHandler.create().setCachingEnabled(!__DEV__));

    // create http server
    vertx.createHttpServer()//httpServerOptions)
      .requestHandler(router::accept)
      .listen(port, host, ar -> {
        if (ar.succeeded()) {
          publishApiGateway(host, port);
          future.complete();
          logger.info("API Gateway is running on port " + port);
          // publish log
          publishGatewayLog("api_gateway_init_success:" + port);
        } else {
          future.fail(ar.cause());
        }
      });
  }

  private void setupCORS(Router router) {
    List<String> allowedOrigins = new ArrayList<>();
    config().getJsonArray("allowed-origins").forEach( origin -> allowedOrigins.add((String) origin));

    Set<String> allowedHeaders = new HashSet<>();
    allowedHeaders.add("x-requested-with");
    allowedHeaders.add("Access-Control-Allow-Origin");
    allowedHeaders.add("origin");
    allowedHeaders.add("Content-Type");
    allowedHeaders.add("accept");
    allowedHeaders.add("authorization");

    Set<HttpMethod> allowedMethods = new HashSet<>();
    allowedMethods.add(HttpMethod.GET);
    allowedMethods.add(HttpMethod.POST);
    allowedMethods.add(HttpMethod.OPTIONS);
    allowedMethods.add(HttpMethod.DELETE);
    allowedMethods.add(HttpMethod.PATCH);
    allowedMethods.add(HttpMethod.PUT);

    CorsHandler handler = CorsHandler
            .create(String.join("|", allowedOrigins))
            .allowCredentials(true)
            .allowedHeaders(allowedHeaders)
            .allowedMethods(allowedMethods);

    router.route().handler(handler);
  }

  private void dispatchRequests(RoutingContext context) {
    logger.debug("dispatchRequests");
    int initialOffset = 5; // length of `/api/`
    // run with circuit breaker in order to deal with failure
    circuitBreaker.execute(future -> {
      getAllEndpoints().setHandler(ar -> {
        if (ar.succeeded()) {
          List<Record> recordList = ar.result();
          // get relative path and retrieve prefix to dispatch client
          String path = context.request().uri();
          logger.info(recordList.size() + " records found for request " + path);

          if (path.length() <= initialOffset) {
            notFound(context);
            future.complete();
            return;
          }
          String prefix = (path.substring(initialOffset)
            .split("/"))[0];
          // generate new relative path
          String newPath = path.substring(initialOffset + prefix.length());
          // get one relevant HTTP client, may not exist
          Optional<Record> client = recordList.stream()
            .filter(record -> record.getMetadata().getString("api.name") != null)
            .filter(record -> record.getMetadata().getString("api.name").equals(prefix))
            .findAny(); // simple load balance

          if (client.isPresent()) {
            logger.info("Client found for prefix " + prefix);
            doDispatch(context, newPath, discovery.getReference(client.get()).get(), future);
          } else {
            logger.info("Client NOT found for prefix " + prefix);
            notFound(context);
            future.complete();
          }
        } else {
          future.fail(ar.cause());
        }
      });
    }).setHandler(ar -> {
      if (ar.failed()) {
        badGateway(ar.cause(), context);
      }
    });
  }

  /**
   * Dispatch the request to the downstream REST layers.
   *
   * @param context routing context instance
   * @param path    relative path
   * @param client  relevant HTTP client
   */
  private void doDispatch(RoutingContext context, String path, HttpClient client, Promise<Object> cbFuture) {
    HttpClientRequest toReq = client
      .request(context.request().method(), path, response -> {
        response.bodyHandler(body -> {
          if (response.statusCode() >= 500) { // api endpoint server error, circuit breaker should fail
            cbFuture.fail(response.statusCode() + ": " + body.toString());
          } else {
            HttpServerResponse toRsp = context.response();
            toRsp.setStatusCode(response.statusCode());
            toRsp.headers().setAll(response.headers());
            // send response
            toRsp.end(body);
            cbFuture.complete();
          }
          ServiceDiscovery.releaseServiceObject(discovery, client);
        });
      });
    // set headers
    toReq.headers().setAll(context.request().headers());
    if (context.user() != null) {

      toReq.putHeader("user-principal", context.user().principal().encode());
    }
    // send request
    if (context.getBody() == null) {
      toReq.end();
    } else {
      toReq.end(context.getBody());
    }
  }

  private void authUaaHandler(RoutingContext context) {
    if (context.user() != null) {
      User user = context.user();
      String username = KeycloakHelper.preferredUsername(user.principal());
      if (username == null) {
        context.response()
                .putHeader("content-type", "application/json")
                .end(new Account().setId("TEST666").setUsername("Eric").toString()); // TODO: no username should be an error
      } else {
        Future<AccountService> future = Future.future();
        EventBusService.getProxy(discovery, AccountService.class, future.completer());
        future.compose(accountService -> {
          Future<Account> accountFuture = Future.future();
          accountService.retrieveByUsername(username, accountFuture.completer());
          return accountFuture.map(a -> {
            ServiceDiscovery.releaseServiceObject(discovery, accountService);
            return a;
          });
        }).setHandler(resultHandlerNonEmpty(context)); // if user does not exist, should return 404
      }
    } else {
      context.fail(401);
    }
  }

  private void apiVersion(RoutingContext context) {
    context.response()
      .end(new JsonObject().put("version", "v1").encodePrettily());
  }

  /**
   * Get all REST endpoints from the service discovery infrastructure.
   *
   * @return async result
   */
  private Future<List<Record>> getAllEndpoints() {
    Future<List<Record>> future = Future.future();
    discovery.getRecords(record -> record.getType().equals(HttpEndpoint.TYPE),
      future.completer());
    return future;
  }

  // log methods

  private void publishGatewayLog(String info) {
    JsonObject message = new JsonObject()
      .put("info", info)
      .put("time", System.currentTimeMillis());
    publishLogEvent("gateway", message);
  }

  private void publishGatewayLog(JsonObject msg) {
    JsonObject message = msg.copy()
      .put("time", System.currentTimeMillis());
    publishLogEvent("gateway", message);
  }

  // auth

}
