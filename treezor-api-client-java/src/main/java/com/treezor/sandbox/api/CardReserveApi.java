package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Body2;
import com.treezor.sandbox.model.Body3;
import com.treezor.sandbox.model.InlineResponse2008;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CardReserveApi {

    void cardReserveAddTo(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body2 body, Handler<AsyncResult<Float>> handler);

    void cardReserveCheck(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body3 body, Handler<AsyncResult<Boolean>> handler);

    void cardReserveGet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2008>> handler);

}
