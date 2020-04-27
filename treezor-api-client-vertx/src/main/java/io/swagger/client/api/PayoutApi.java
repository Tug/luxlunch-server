package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20019;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PayoutApi {

    void deletePayout(Long id, Handler<AsyncResult<TreezorInlineResponse20019>> handler);

    void getPayout(Long id, Handler<AsyncResult<TreezorInlineResponse20019>> handler);

    void getPayouts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payoutId, String payoutTag, String payoutStatus, Integer payoutTypeId, Integer walletId, Integer userId, OffsetDateTime payoutDate, Integer bankaccountId, Integer beneficiaryId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20019>> handler);

    void postPayout(Integer walletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payoutTag, Integer bankaccountId, Integer beneficiaryId, String label, String supportingFileLink, Handler<AsyncResult<TreezorInlineResponse20019>> handler);

}
