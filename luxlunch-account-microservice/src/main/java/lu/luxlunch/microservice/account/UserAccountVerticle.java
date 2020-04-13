package lu.luxlunch.microservice.account;

import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.serviceproxy.ServiceBinder;
import lu.luxlunch.microservice.account.api.RestUserAccountAPIVerticle;
import lu.luxlunch.microservice.account.impl.JdbcAccountServiceImpl;
import lu.luxlunch.microservice.common.BaseMicroserviceVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.serviceproxy.ProxyHelper;

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
      .compose(servicePublished -> deployRestVerticle())
      .setHandler(future.completer());
  }

  private Future<Void> deployRestVerticle() {
    Future<String> future = Future.future();
    vertx.deployVerticle(new RestUserAccountAPIVerticle(accountService),
      new DeploymentOptions().setConfig(config()),
      future.completer());
    return future.map(r -> null);
  }
}
