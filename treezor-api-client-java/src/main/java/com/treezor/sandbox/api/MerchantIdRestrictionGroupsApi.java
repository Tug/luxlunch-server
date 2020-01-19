package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Body10;
import com.treezor.sandbox.model.Body11;
import com.treezor.sandbox.model.Body9;
import com.treezor.sandbox.model.InlineResponse20016;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface MerchantIdRestrictionGroupsApi {

    void deleteMerchantIdRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<InlineResponse20016>> handler);

    void getMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse20016>> handler);

    void getMerchantIdRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<InlineResponse20016>> handler);

    void merchantIdRestrictionGroupsIdDeltaUpdatePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body11 body, Handler<AsyncResult<InlineResponse20016>> handler);

    void postMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body9 body, Handler<AsyncResult<InlineResponse20016>> handler);

    void putMerchantIdRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body10 body, Handler<AsyncResult<InlineResponse20016>> handler);

}
