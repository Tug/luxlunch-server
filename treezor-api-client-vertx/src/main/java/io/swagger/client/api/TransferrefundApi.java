package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20024;
import io.swagger.client.model.TreezorInlineResponse20025;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TransferrefundApi {

    void deleteTransferrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20024>> handler);

    void getTransferrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20024>> handler);

    void getTransferrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferrefundId, String transferrefundTag, String transferrefundStatus, Integer walletId, Integer transferId, Integer transferrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20024>> handler);

    void postTransferrefunds(Integer transferId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferrefundTag, String comment, Handler<AsyncResult<TreezorInlineResponse20025>> handler);

}
