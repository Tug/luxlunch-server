package io.swagger.client.api;

import io.swagger.client.model.TreezorBody7;
import io.swagger.client.model.TreezorBody8;
import io.swagger.client.model.TreezorInlineResponse20015;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface MccRestrictionGroupsApi {

    void deleteMccRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20015>> handler);

    void getMccRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20015>> handler);

    void getMccRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20015>> handler);

    void postMccRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, TreezorBody7 body, Handler<AsyncResult<TreezorInlineResponse20015>> handler);

    void putMccRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody8 body, Handler<AsyncResult<TreezorInlineResponse20015>> handler);

}
