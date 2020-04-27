package io.swagger.client.api;

import io.swagger.client.model.TreezorBody6;
import io.swagger.client.model.TreezorInlineResponse20013;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface IssuerInitiatedDigitizationDataApi {

    void tavRequestPOST(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody6 body, Handler<AsyncResult<TreezorInlineResponse20013>> handler);

    void tavrequestget(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20013>> handler);

}
