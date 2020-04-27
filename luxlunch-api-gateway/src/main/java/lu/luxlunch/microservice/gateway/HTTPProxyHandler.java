package lu.luxlunch.microservice.gateway;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.*;
import io.vertx.core.net.SocketAddress;
//import io.vertx.core.streams.Pump;
import io.vertx.ext.web.RoutingContext;

public class HTTPProxyHandler implements Handler<RoutingContext> {

    private final String destinationHost;
    private final int destinationPort;
    private HttpClient httpClient;

    public static HTTPProxyHandler create(Vertx vertx, String destinationHost, int destinationPort) {
        HttpClientOptions options = new HttpClientOptions()
                .setDefaultHost(destinationHost)
                .setDefaultPort(destinationPort);
        HttpClient httpClient = vertx.createHttpClient(options);
        return new HTTPProxyHandler(httpClient, destinationHost, destinationPort);
    }

    private HTTPProxyHandler(HttpClient httpClient, String destinationHost, int destinationPort) {
        this.destinationHost = destinationHost;
        this.destinationPort = destinationPort;
        this.httpClient = httpClient;
    }

    @Override
    public void handle(RoutingContext context) {
        HttpServerRequest incomingRequest = context.request();
        HttpServerResponse outgoingResponse = context.response();
        SocketAddress serverAddress = SocketAddress.inetSocketAddress(destinationPort, destinationHost);
        HttpClientRequest request = httpClient.request(
                incomingRequest.method(),
                serverAddress,
                destinationPort,
                destinationHost,
                incomingRequest.uri(),
                destinationResponse -> {
                    outgoingResponse.setChunked(true);
                    outgoingResponse.setStatusCode(destinationResponse.statusCode());
                    outgoingResponse.headers().setAll(destinationResponse.headers());
                    // TODO: test with Pump instead: Pump.pump(destinationResponse, response);
                    destinationResponse.handler(outgoingResponse::write);
                    destinationResponse.endHandler((v)->outgoingResponse.end());
                });
        request.setChunked(true);
        request.headers().setAll(incomingRequest.headers());
        incomingRequest.handler(request::write);
        incomingRequest.endHandler((v)->request.end());
    }
}
