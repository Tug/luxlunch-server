package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20023;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TransferApi {

    void deleteTransfer(Long id, Handler<AsyncResult<InlineResponse20023>> handler);

    void getTransfer(Long id, Handler<AsyncResult<InlineResponse20023>> handler);

    void getTransfers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, OffsetDateTime transferDate, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse20023>> handler);

    void postTransfers(Integer walletId, Integer beneficiaryWalletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferTag, String label, Integer transferTypeId, Handler<AsyncResult<InlineResponse20023>> handler);

}
