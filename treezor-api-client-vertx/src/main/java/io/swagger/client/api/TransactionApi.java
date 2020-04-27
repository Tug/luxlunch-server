package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20022;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TransactionApi {

    void getTransaction(Long id, Handler<AsyncResult<TreezorInlineResponse20022>> handler);

    void getTransactions(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transactionId, String transactionType, Integer walletId, Integer userId, String name, String description, String amount, String currency, OffsetDateTime valueDate, OffsetDateTime executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, Handler<AsyncResult<TreezorInlineResponse20022>> handler);

}
