package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20020;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PayoutRefundsApi {

    void getPayoutRefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer id, String tag, String codeStatus, String informationStatus, Integer payoutId, Integer pageNumber, Handler<AsyncResult<InlineResponse20020>> handler);

}
