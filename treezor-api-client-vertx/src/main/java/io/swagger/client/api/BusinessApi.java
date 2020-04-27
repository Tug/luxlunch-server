package io.swagger.client.api;

import io.swagger.client.model.TreezorError;
import io.swagger.client.model.TreezorInlineResponse2003;
import io.swagger.client.model.TreezorInlineResponse2004;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BusinessApi {

    void businessinformationsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String externalId, String registrationNumber, String vatNumber, Handler<AsyncResult<TreezorInlineResponse2004>> handler);

    void businesssearchsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode, Handler<AsyncResult<List<TreezorInlineResponse2003>>> handler);

}
