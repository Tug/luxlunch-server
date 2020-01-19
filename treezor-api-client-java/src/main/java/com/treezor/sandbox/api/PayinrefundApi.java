package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20018;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PayinrefundApi {

    void deletePayinrefund(Long id, Handler<AsyncResult<InlineResponse20018>> handler);

    void getPayinrefund(Long id, Handler<AsyncResult<InlineResponse20018>> handler);

    void getPayinrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, OffsetDateTime payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse20018>> handler);

    void postPayinrefunds(Integer payinId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinrefundTag, String comment, Handler<AsyncResult<InlineResponse20018>> handler);

}
