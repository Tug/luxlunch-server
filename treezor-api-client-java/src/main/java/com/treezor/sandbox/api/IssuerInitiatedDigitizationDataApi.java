package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Body6;
import com.treezor.sandbox.model.InlineResponse20013;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface IssuerInitiatedDigitizationDataApi {

    void tavRequestPOST(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body6 body, Handler<AsyncResult<InlineResponse20013>> handler);

    void tavrequestget(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse20013>> handler);

}
