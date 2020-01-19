package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse2005;
import com.treezor.sandbox.model.InlineResponse2006;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CardApi {

    void cardimagesGet(Integer cardId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2006>> handler);

    void cardsCreateVirtualPost(Integer userId, Integer walletId, String permsGroup, String cardPrint, String accessSignature, String cardTag, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsGet(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdActivatePut(Integer id, String accessToken, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdChangePINPut(Integer id, String currentPIN, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdConvertVirtualPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdGet(Long id, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdLimitsPut(Integer id, String accessSignature, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdLockUnlockPut(Integer id, Integer lockStatus, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdOptionsPut(Integer id, Integer foreign, Integer online, Integer atm, Integer nfc, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdPut(Integer id, String accessSignature, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdRegeneratePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdSetPINPut(Integer id, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsIdUnblockPINPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsRegister3DSPost(Integer cardId, String accessSignature, Handler<AsyncResult<InlineResponse2005>> handler);

    void cardsRequestPhysicalPost(Integer userId, Integer walletId, String permsGroup, String cardTag, String cardPrint, String accessSignature, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse2005>> handler);

}
