package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Body7;
import com.treezor.sandbox.model.Body8;
import com.treezor.sandbox.model.InlineResponse20015;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface MccRestrictionGroupsApi {

    void deleteMccRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<InlineResponse20015>> handler);

    void getMccRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse20015>> handler);

    void getMccRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<InlineResponse20015>> handler);

    void postMccRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, Body7 body, Handler<AsyncResult<InlineResponse20015>> handler);

    void putMccRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body8 body, Handler<AsyncResult<InlineResponse20015>> handler);

}
