package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20021;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TaxResidenceApi {

    void taxResidencesGet(String accessSignature, Integer id, Integer userId, Handler<AsyncResult<InlineResponse20021>> handler);

    void taxResidencesIdDelete(Integer id, String accessSignature, Handler<AsyncResult<InlineResponse20021>> handler);

    void taxResidencesIdGet(Integer id, String accessSignature, Handler<AsyncResult<InlineResponse20021>> handler);

    void taxResidencesIdPut(Integer id, String accessSignature, Integer userId, String country, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<InlineResponse20021>> handler);

    void taxResidencesPost(Integer userId, String country, String accessSignature, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<InlineResponse20021>> handler);

}
