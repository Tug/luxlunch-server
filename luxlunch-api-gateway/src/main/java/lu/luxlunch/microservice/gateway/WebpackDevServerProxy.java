package lu.luxlunch.microservice.gateway;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class WebpackDevServerProxy {
    public static void create(Vertx vertx, Router router, String host, int port) {
        router.route("/static/*").handler(HTTPProxyHandler.create(vertx, host, port));
        router.route("/sockjs-node").handler(SockJSBridge.create(vertx, host, port));
    }
}
