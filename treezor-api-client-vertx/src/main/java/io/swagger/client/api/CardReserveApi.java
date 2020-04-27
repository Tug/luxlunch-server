package io.swagger.client.api;

import io.swagger.client.model.TreezorBody2;
import io.swagger.client.model.TreezorBody3;
import io.swagger.client.model.TreezorInlineResponse2008;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CardReserveApi {

    void cardReserveAddTo(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody2 body, Handler<AsyncResult<Float>> handler);

    void cardReserveCheck(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody3 body, Handler<AsyncResult<Boolean>> handler);

    void cardReserveGet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2008>> handler);

}
