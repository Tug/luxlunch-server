package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse200;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BalanceApi {

    void getBalances(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer walletId, Integer userId, Handler<AsyncResult<InlineResponse200>> handler);

}
