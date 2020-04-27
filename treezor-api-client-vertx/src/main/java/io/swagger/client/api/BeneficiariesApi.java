package io.swagger.client.api;

import io.swagger.client.model.TreezorBody;
import io.swagger.client.model.TreezorBody1;
import io.swagger.client.model.TreezorInlineResponse2002;
import io.swagger.client.model.TreezorInlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface BeneficiariesApi {

    void getBeneficiaries(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer id, Integer userId, String iban, String bic, String nickName, String name, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse2002>> handler);

    void getBeneficiary(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse2002>> handler);

    void postBeneficiary(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody body, Handler<AsyncResult<TreezorInlineResponse2002>> handler);

    void putBeneficiary(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody1 body, Handler<AsyncResult<TreezorInlineResponse2002>> handler);

}
