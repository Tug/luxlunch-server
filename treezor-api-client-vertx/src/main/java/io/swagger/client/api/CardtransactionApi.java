package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20010;
import io.swagger.client.model.TreezorInlineResponse2009;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CardtransactionApi {

    void getCardtransaction(Long id, Handler<AsyncResult<TreezorInlineResponse20010>> handler);

    void readCardTransaction(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardtransactionId, Integer cardId, Integer walletId, Integer merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy, Handler<AsyncResult<TreezorInlineResponse2009>> handler);

}
