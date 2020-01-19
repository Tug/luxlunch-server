package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Body4;
import com.treezor.sandbox.model.Body5;
import com.treezor.sandbox.model.InlineResponse20011;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CountryRestrictionGroupsApi {

    void deleteCountryRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<InlineResponse20011>> handler);

    void getCountryRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse20011>> handler);

    void getCountryRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<InlineResponse20011>> handler);

    void postCountryRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, Body4 body, Handler<AsyncResult<InlineResponse20011>> handler);

    void putCountryRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body5 body, Handler<AsyncResult<InlineResponse20011>> handler);

}
