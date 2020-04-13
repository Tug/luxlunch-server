package lu.luxlunch.dev;

import io.vertx.config.ConfigRetriever
import io.vertx.config.ConfigRetrieverOptions
import io.vertx.config.ConfigStoreOptions
import io.vertx.core.AbstractVerticle
import io.vertx.core.DeploymentOptions
import kotlin.reflect.KClass
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.core.deploymentOptionsOf

class AppStarterVerticle : AbstractVerticle() {
    override fun start() {
        runVerticleWithLocalConfig( lu.luxlunch.microservice.account.UserAccountVerticle::class, "luxlunch-account-microservice" )
        runVerticleWithLocalConfig( lu.luxlunch.microservice.gateway.APIGatewayVerticle::class, "luxlunch-api-gateway" )
        runVerticleWithLocalConfig( lu.luxlunch.microservice.monitor.MonitorDashboardVerticle::class, "luxlunch-monitor-dashboard" )
    }

    private fun <V : AbstractVerticle> runVerticleWithLocalConfig( verticleClass: KClass<V>, projectName: String) {
        // this should be relative to where the `mvn vertx:run` command is run
        // let's run it from the root folder `luxlunch-server`
        val localConfigFilePath = "./$projectName/src/config/local.json"
        val configStoreOptions = ConfigStoreOptions().setType( "file" ).setConfig( JsonObject().put( "path", localConfigFilePath ) )
        val retriever = ConfigRetriever.create( vertx, ConfigRetrieverOptions().addStore( configStoreOptions ) )

        retriever.getConfig { json ->
            println( "Deploying verticle " + verticleClass.simpleName + " with config:" )
            println( json.result().encodePrettily() )
            vertx.deployVerticle( verticleClass.qualifiedName, deploymentOptionsOf( config = json.result() ));
        }
    }
}
