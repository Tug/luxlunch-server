package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse2001;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BankaccountApi {

    void deleteBankaccount(Long id, Handler<AsyncResult<InlineResponse2001>> handler);

    void getBankaccount(Long id, Handler<AsyncResult<InlineResponse2001>> handler);

    void getBankaccounts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer bankaccountId, String bankaccountStatus, Integer userId, String bankaccountIBAN, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse2001>> handler);

    void postBankaccount(Integer userId, String bankaccountOwnerName, String bankaccountOwnerAddress, String bankaccountIBAN, String bankaccountBIC, String bankaccountType, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String bankaccountTag, String name, Handler<AsyncResult<InlineResponse2001>> handler);

}
