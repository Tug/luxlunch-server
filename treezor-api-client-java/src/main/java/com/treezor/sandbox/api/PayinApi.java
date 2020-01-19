package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20017;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PayinApi {

    void deletePayin(Long id, Handler<AsyncResult<InlineResponse20017>> handler);

    void getPayin(Long id, Handler<AsyncResult<InlineResponse20017>> handler);

    void getPayins(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer payinId, Integer walletId, String payinTag, String payinStatus, Integer userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse20017>> handler);

    void postPayin(Integer walletId, Integer userId, Integer paymentMethodId, Float amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinTag, Integer oneclickcardId, String paymentAcceptedUrl, String paymentWaitingUrl, String paymentRefusedUrl, String paymentCanceledUrl, String paymentExceptionUrl, Float distributorFee, String messageToUser, String language, String createdIp, String payinDate, Integer mandateId, Handler<AsyncResult<InlineResponse20017>> handler);

}
