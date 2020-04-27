package lu.luxlunch.microservice.account;

import com.fasterxml.jackson.databind.DeserializationFeature;
import io.swagger.client.Configuration;
import io.swagger.client.api.UserApi;
import io.swagger.client.api.UserApiImpl;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.serviceproxy.ServiceBinder;
import lu.luxlunch.microservice.account.api.RestUserAccountAPIVerticle;
import lu.luxlunch.microservice.account.impl.JdbcAccountServiceImpl;
import lu.luxlunch.microservice.common.BaseMicroserviceVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;

import static lu.luxlunch.microservice.account.AccountService.SERVICE_ADDRESS;
import static lu.luxlunch.microservice.account.AccountService.SERVICE_NAME;


/**
 * A verticle publishing the user service.
 *
 * @author Eric Zhao
 */
public class UserAccountVerticle extends BaseMicroserviceVerticle {

  private static final Logger logger = LoggerFactory.getLogger(UserAccountVerticle.class);

  private AccountService accountService;

  @Override
  public void start(Future<Void> future) throws Exception {
    super.start();

    // create the service instance
    accountService = new JdbcAccountServiceImpl(vertx, config());
    // register the service proxy on event bus
    new ServiceBinder(vertx)
            .setAddress(SERVICE_ADDRESS)
            .register(AccountService.class, accountService);
    // publish the service and REST endpoint in the discovery infrastructure
    publishEventBusService(SERVICE_NAME, SERVICE_ADDRESS, AccountService.class)
      //.compose(servicePublished -> deployRestVerticle())
      .setHandler(future.completer());

    JsonObject treezorConfig = config().getJsonObject("treezor-api-config");
    String apiKey = treezorConfig.getString("api-key");
    Configuration.setupDefaultApiClient(vertx, treezorConfig).setApiKey(apiKey).setApiKeyPrefix("Bearer");
    DatabindCodec.mapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)
            .disable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)
            .enable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
    UserApi userApi = new UserApiImpl();
    userApi.getUsers( apiKey,"", null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      responseAsync -> {
        if (responseAsync.succeeded()) {
          logger.info(responseAsync.result().toString());
        } else {
          logger.error(responseAsync.cause());
        }
      });
  }

  private Future<Void> deployRestVerticle() {
    Future<String> future = Future.future();
    vertx.deployVerticle(new RestUserAccountAPIVerticle(accountService),
      new DeploymentOptions().setConfig(config()),
      future.completer());
    return future.map(r -> null);
  }
}
