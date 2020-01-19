package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Error;
import com.treezor.sandbox.model.InlineResponse2003;
import com.treezor.sandbox.model.InlineResponse2004;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BusinessApi {

    void businessinformationsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String externalId, String registrationNumber, String vatNumber, Handler<AsyncResult<InlineResponse2004>> handler);

    void businesssearchsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode, Handler<AsyncResult<List<InlineResponse2003>>> handler);

}
