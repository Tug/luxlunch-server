package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20018;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PayinrefundApi {

    void deletePayinrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20018>> handler);

    void getPayinrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20018>> handler);

    void getPayinrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, OffsetDateTime payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20018>> handler);

    void postPayinrefunds(Integer payinId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinrefundTag, String comment, Handler<AsyncResult<TreezorInlineResponse20018>> handler);

}
