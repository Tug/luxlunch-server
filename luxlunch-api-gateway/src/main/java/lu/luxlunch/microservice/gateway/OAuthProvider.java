package lu.luxlunch.microservice.gateway;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.auth.AuthProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.ext.auth.oauth2.providers.KeycloakAuth;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.SessionHandler;
import io.vertx.ext.web.sstore.LocalSessionStore;
import io.vertx.ext.web.sstore.SessionStore;

public class OAuthProvider implements Handler<RoutingContext> {

    private static final Logger logger = LoggerFactory.getLogger(OAuthProvider.class);

    private final SessionHandler sessionHandler;
    private final OAuth2Auth oauth2;
    private final String originURI;
    private final String authServerHostURI;
    private final JsonObject config;

    public static OAuthProvider create(Vertx vertx, Router router) {
        SessionStore sessionStore = LocalSessionStore.create(vertx);
        JsonObject config = vertx.getOrCreateContext().config();

        OAuth2Auth oauth2 = KeycloakAuth.create(vertx, OAuth2FlowType.AUTH_CODE, config.getJsonObject("keycloak-auth-options"));
        return new OAuthProvider(router, oauth2, sessionStore, config);
    }

    private OAuthProvider(Router router, OAuth2Auth oauth2, SessionStore sessionStore, JsonObject config) {
        this.sessionHandler = SessionHandler.create(sessionStore).setAuthProvider(oauth2);
        this.oauth2 = oauth2;
        this.config = config;

        int port = config.getInteger("api.gateway.http.port.external", 8787 );
        final String host = config.getString("api.gateway.http.address.external", "localhost");
        this.originURI = String.format("http://%s:%d", host, port); // https://
        this.authServerHostURI = config.getString("keycloak.http.hostURI", null);

        registerRoutes(router);
    }

    private void registerRoutes(Router router) {
        // set auth callback handler
        router.route("/callback").handler(this::authCallbackHandler);
        // KeycloakAuth only supports the redirect flow
        router.get("/login").handler(this::loginEntryHandler);
        router.post("/logout").handler(this::logoutHandler);
    }


    private void authCallbackHandler(RoutingContext context) {
        final String code = context.request().getParam("code");
        // code is a required value
        if (code == null) {
            context.fail(400);
            return;
        }
        final String redirectTo = context.request().getParam("redirect_uri");
        final String redirectURI = originURI + context.currentRoute().getPath() + "?redirect_uri=" + redirectTo;
        oauth2.authenticate(new JsonObject().put("code", code).put("redirect_uri", redirectURI), ar -> {
            if (ar.failed()) {
                logger.warn("Auth fail");
                context.fail(ar.cause());
            } else {
                logger.info("Auth success");
                context.setUser(ar.result());
                context.response()
                        .putHeader("Location", redirectTo)
                        .setStatusCode(302)
                        .end();
            }
        });
    }

    private void loginEntryHandler(RoutingContext context) {
        context.response()
                .putHeader("Location", generateAuthRedirectURI(originURI))
                .setStatusCode(302)
                .end();
    }

    private void logoutHandler(RoutingContext context) {
        context.clearUser();
        context.session().destroy();
        context.response().setStatusCode(204).end();
    }

    private String generateAuthRedirectURI(String from) {
        String authorizeUrl = oauth2.authorizeURL(new JsonObject()
                .put("redirect_uri", from + "/callback?redirect_uri=" + from)
                .put("scope", "openid profile")
                .put("state", ""));
        if ( authServerHostURI != null ) {
            authorizeUrl = authorizeUrl.replace(config.getString("auth-server-url"), authServerHostURI);
        }
        return authorizeUrl;
    }

    @Override
    public void handle(RoutingContext context) {
        // check authenticated
        sessionHandler.handle(context);
    }
}
