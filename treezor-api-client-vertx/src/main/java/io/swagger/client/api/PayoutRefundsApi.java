package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20020;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PayoutRefundsApi {

    void getPayoutRefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer id, String tag, String codeStatus, String informationStatus, Integer payoutId, Integer pageNumber, Handler<AsyncResult<TreezorInlineResponse20020>> handler);

}
