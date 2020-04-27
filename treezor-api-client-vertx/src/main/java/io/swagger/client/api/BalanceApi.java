package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse200;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BalanceApi {

    void getBalances(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer walletId, Integer userId, Handler<AsyncResult<TreezorInlineResponse200>> handler);

}
