package lu.luxlunch.microservice.gateway;

import com.google.common.base.Strings;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.auth.PubSecKeyOptions;
import io.vertx.ext.auth.User;
import io.vertx.ext.auth.jwt.JWTAuth;
import io.vertx.ext.auth.jwt.JWTAuthOptions;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.ext.auth.oauth2.providers.KeycloakAuth;
import io.vertx.ext.jwt.JWTOptions;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.impl.HttpStatusException;

public class AuthConfig implements Handler<RoutingContext> {
    private static final Logger logger = LoggerFactory.getLogger(AuthConfig.class);

    //private final OAuth2Auth oauth2password;
    //private final OAuth2Auth oauth2;
    private final JWTAuth jwtAuthProvider;

    public static AuthConfig create(Vertx vertx, JsonObject authConfig) {
        return new AuthConfig(vertx, authConfig);
    }

    private AuthConfig(Vertx vertx, JsonObject keycloakConfig) {
        /*JsonObject jwtConfig = new JsonObject()
                .put("realm", keycloakConfig.getString("realm"))
                .put("realm-public-key", keycloakConfig.getString("realm-public-key"))
                .put("auth-server-url", keycloakConfig.getString("auth-server-url"))
                .put("ssl-required", keycloakConfig.getString("ssl-required"))
                .put("resource", "luxlunch-web-frontend-dev")
                .put("public-client", true);
        oauth2 = KeycloakAuth.create(vertx,  OAuth2FlowType.AUTH_JWT, jwtConfig);*/
        // TODO: check if we can replace with OAuth2Auth instance since it can decode JWT
        // start with `authenticateAccessToken` and check implementation:
        // https://github.com/vert-x3/vertx-auth/blob/ed6ee90e9e00bfe27398aa7cd807600693b93cad/vertx-auth-oauth2/src/main/java/io/vertx/ext/auth/oauth2/impl/OAuth2AuthProviderImpl.java#L39
        String issuer = keycloakConfig.getString("auth-server-url") + "/auth/realms/" + keycloakConfig.getString("realm");
        JWTAuthOptions config = new JWTAuthOptions()
                .addPubSecKey(new PubSecKeyOptions()
                        .setAlgorithm("RS256")
                        .setPublicKey(keycloakConfig.getString("realm-public-key")))
                        .setPermissionsClaimKey("realm_access/roles")
                .setJWTOptions(new JWTOptions()
                        .setExpiresInMinutes(10_080) // 7 days
                        .setIssuer(issuer)
                        .addAudience("luxlunch-web-frontend-dev"));
        jwtAuthProvider = JWTAuth.create(vertx, config);
        //oauth2password = KeycloakAuth.create(vertx,  OAuth2FlowType.PASSWORD, jwtConfig);
    }

    @Override
    public void handle(RoutingContext context) {
        authenticateJWT(context, userAsyncResultJWT -> {
            if (userAsyncResultJWT.succeeded()) {
                context.setUser(userAsyncResultJWT.result());
            }
            context.next();
            /*authenticatePassword(context, userAsyncResultPassword -> {
                if (userAsyncResultPassword.failed()) {
                    if (userAsyncResultJWT.failed()) {
                        context.fail(userAsyncResultJWT.cause());
                    } else {
                        context.fail(userAsyncResultPassword.cause());
                    }
                    return;
                }
                context.setUser(userAsyncResultPassword.result());
                context.next();
            });*/
        });
    }

    private void authenticateJWT(RoutingContext context, Handler<AsyncResult<User>> asyncResultHandler) {
        final String authorization = context.request().getHeader(HttpHeaders.AUTHORIZATION);
        final String tokenType = "Bearer";

        if (Strings.isNullOrEmpty(authorization) || !authorization.startsWith(tokenType)) {
            asyncResultHandler.handle(Future.failedFuture("Authorization header missing"));
            return;
        }

        String token = authorization.substring(tokenType.length()+1).trim();
        jwtAuthProvider.authenticate(new JsonObject().put("jwt", token), asyncResultHandler);
    }
/*
    private void authenticatePassword(RoutingContext context, Handler<AsyncResult<User>> asyncResultHandler) {
        JsonObject body = context.getBodyAsJson();
        if ( body == null || body.getString("username") == null || body.getString("password") == null) {
            asyncResultHandler.handle(Future.failedFuture("Authorization header missing"));
            return;
        }
        oauth2password.authenticate(new JsonObject()
                .put("username", body.getString("username"))
                .put("password", body.getString("password")), asyncResultHandler);
    }

    private void authenticateAccessToken(RoutingContext context, Handler<AsyncResult<User>> asyncResultHandler) {
        final String authorization = context.request().getHeader(HttpHeaders.AUTHORIZATION);
        final String tokenType = "Bearer";

        if (Strings.isNullOrEmpty(authorization) || !authorization.startsWith(tokenType)) {
            asyncResultHandler.handle(Future.failedFuture("Authorization header missing"));
            return;
        }

        String token = authorization.substring(tokenType.length()+1).trim();
        oauth2.authenticate(new JsonObject().put("access_token", token).put("token_type", tokenType), asyncResultHandler);
    }
*/
    public void getUserInfo(RoutingContext context) {
        logger.info("getUserInfo");
        if (context.user() == null) {
            throw new HttpStatusException(400);
        }
        context.response()
                .putHeader("content-type", "application/json")
                .end(context.user().principal().encode());
    }
}
