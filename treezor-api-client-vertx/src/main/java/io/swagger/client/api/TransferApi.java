package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20023;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TransferApi {

    void deleteTransfer(Long id, Handler<AsyncResult<TreezorInlineResponse20023>> handler);

    void getTransfer(Long id, Handler<AsyncResult<TreezorInlineResponse20023>> handler);

    void getTransfers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, OffsetDateTime transferDate, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20023>> handler);

    void postTransfers(Integer walletId, Integer beneficiaryWalletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferTag, String label, Integer transferTypeId, Handler<AsyncResult<TreezorInlineResponse20023>> handler);

}
