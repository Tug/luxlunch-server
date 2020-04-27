package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20021;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TaxResidenceApi {

    void taxResidencesGet(String accessSignature, Integer id, Integer userId, Handler<AsyncResult<TreezorInlineResponse20021>> handler);

    void taxResidencesIdDelete(Integer id, String accessSignature, Handler<AsyncResult<TreezorInlineResponse20021>> handler);

    void taxResidencesIdGet(Integer id, String accessSignature, Handler<AsyncResult<TreezorInlineResponse20021>> handler);

    void taxResidencesIdPut(Integer id, String accessSignature, Integer userId, String country, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<TreezorInlineResponse20021>> handler);

    void taxResidencesPost(Integer userId, String country, String accessSignature, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<TreezorInlineResponse20021>> handler);

}
