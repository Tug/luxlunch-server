package io.swagger.client.api;

import io.swagger.client.model.TreezorBody10;
import io.swagger.client.model.TreezorBody11;
import io.swagger.client.model.TreezorBody9;
import io.swagger.client.model.TreezorInlineResponse20016;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface MerchantIdRestrictionGroupsApi {

    void deleteMerchantIdRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20016>> handler);

    void getMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20016>> handler);

    void getMerchantIdRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20016>> handler);

    void merchantIdRestrictionGroupsIdDeltaUpdatePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody11 body, Handler<AsyncResult<TreezorInlineResponse20016>> handler);

    void postMerchantIdRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody9 body, Handler<AsyncResult<TreezorInlineResponse20016>> handler);

    void putMerchantIdRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody10 body, Handler<AsyncResult<TreezorInlineResponse20016>> handler);

}
