package io.swagger.client.api;

import io.swagger.client.model.TreezorBody4;
import io.swagger.client.model.TreezorBody5;
import io.swagger.client.model.TreezorInlineResponse20011;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CountryRestrictionGroupsApi {

    void deleteCountryRestrictionGroups(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20011>> handler);

    void getCountryRestrictionGroups(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20011>> handler);

    void getCountryRestrictionGroupsId(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse20011>> handler);

    void postCountryRestrictionGroup(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, TreezorBody4 body, Handler<AsyncResult<TreezorInlineResponse20011>> handler);

    void putCountryRestrictionGroups(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody5 body, Handler<AsyncResult<TreezorInlineResponse20011>> handler);

}
