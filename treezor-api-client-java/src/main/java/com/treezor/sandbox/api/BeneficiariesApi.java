package com.treezor.sandbox.api;

import com.treezor.sandbox.model.Body;
import com.treezor.sandbox.model.Body1;
import com.treezor.sandbox.model.InlineResponse2002;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BeneficiariesApi {

    void getBeneficiaries(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer id, Integer userId, String iban, String bic, String nickName, String name, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<InlineResponse2002>> handler);

    void getBeneficiary(Long id, List<String> fields, Handler<AsyncResult<InlineResponse2002>> handler);

    void postBeneficiary(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body body, Handler<AsyncResult<InlineResponse2002>> handler);

    void putBeneficiary(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Body1 body, Handler<AsyncResult<InlineResponse2002>> handler);

}
