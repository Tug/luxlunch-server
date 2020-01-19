package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20028;
import com.treezor.sandbox.model.InlineResponseDefault;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface WalletApi {

    void deleteWallet(Integer id, String origin, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse20028>> handler);

    void getWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<InlineResponse20028>> handler);

    void getWallets(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, String eventAlias, OffsetDateTime eventPayinStartDate, OffsetDateTime eventPayinEndDate, Integer tariffId, Integer payinCount, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<InlineResponse20028>> handler);

    void postWallets(Integer walletTypeId, Integer tariffId, Integer userId, String currency, String eventName, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer jointUserId, String walletTag, String eventAlias, LocalDate eventDate, String eventMessage, LocalDate eventPayinStartDate, LocalDate eventPayinEndDate, Handler<AsyncResult<InlineResponse20028>> handler);

    void putWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String walletTypeId, String eventName, String eventAlias, String eventDate, String eventMessage, String eventPayinStartDate, String eventPayinEndDate, String urlImage, String imageName, String tariffId, Handler<AsyncResult<InlineResponse20028>> handler);

}
