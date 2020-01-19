package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20010;
import com.treezor.sandbox.model.InlineResponse2009;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CardtransactionApi {

    void getCardtransaction(Long id, Handler<AsyncResult<InlineResponse20010>> handler);

    void readCardTransaction(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardtransactionId, Integer cardId, Integer walletId, Integer merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy, Handler<AsyncResult<InlineResponse2009>> handler);

}
