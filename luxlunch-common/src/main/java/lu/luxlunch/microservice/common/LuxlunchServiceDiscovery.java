package lu.luxlunch.microservice.common;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.servicediscovery.ServiceDiscovery;
import io.vertx.servicediscovery.ServiceDiscoveryOptions;

public class LuxlunchServiceDiscovery {

    public static ServiceDiscovery create(Vertx vertx) {
        JsonObject verticleConfig = vertx.getOrCreateContext().config();
        ServiceDiscoveryOptions serviceDiscoveryOptions = new ServiceDiscoveryOptions();
        serviceDiscoveryOptions.setBackendConfiguration(verticleConfig.getJsonObject("service-discovery-options"));

        // init service discovery instance from config
        return ServiceDiscovery.create(vertx, serviceDiscoveryOptions);
    }
}
