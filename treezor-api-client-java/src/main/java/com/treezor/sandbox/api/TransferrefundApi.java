package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20024;
import com.treezor.sandbox.model.InlineResponse20025;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TransferrefundApi {

    void deleteTransferrefund(Long id, Handler<AsyncResult<InlineResponse20024>> handler);

    void getTransferrefund(Long id, Handler<AsyncResult<InlineResponse20024>> handler);

    void getTransferrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferrefundId, String transferrefundTag, String transferrefundStatus, Integer walletId, Integer transferId, Integer transferrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse20024>> handler);

    void postTransferrefunds(Integer transferId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferrefundTag, String comment, Handler<AsyncResult<InlineResponse20025>> handler);

}
