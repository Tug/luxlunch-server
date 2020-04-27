package lu.luxlunch.microservice.gateway;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.sockjs.SockJSHandler;

/**
 * Handles routing contexts bridging to the event bus via sockjs.
 *
 */
public class SockJSBridge implements Handler<RoutingContext> {

	private Vertx vertx;

	public SockJSBridge(Vertx vertx) {
		this.vertx = vertx;
	}

	public static Handler<RoutingContext> create(Vertx vertx, String host, int port) {
		return new SockJSBridge(vertx);
	}

	/*
	private Handler<RoutingContext> createDelegate(Vertx vertx, String host, int port) {

		return SockJSHandler.create(vertx).socketHandler(sockJSSocket -> {
			//
			//Pump.createPump(sock, sock).start();
		});
	}*/

	@Override
	public void handle(RoutingContext event) {

	}

}
