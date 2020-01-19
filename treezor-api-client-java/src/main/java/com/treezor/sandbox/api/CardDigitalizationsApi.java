package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse2007;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface CardDigitalizationsApi {

    void cardDigitalizationsId(Long id, String fields, Handler<AsyncResult<InlineResponse2007>> handler);

    void deletecardDigitalizationsId(Long id, String reasonCode, Handler<AsyncResult<InlineResponse2007>> handler);

    void putcardDigitalizationsId(Long id, String status, String reasonCode, Handler<AsyncResult<InlineResponse2007>> handler);

    void readcardDigitalizations(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String filter, String fields, Handler<AsyncResult<InlineResponse2007>> handler);

}
