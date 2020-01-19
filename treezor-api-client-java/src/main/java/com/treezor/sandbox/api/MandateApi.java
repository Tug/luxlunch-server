package com.treezor.sandbox.api;

import com.treezor.sandbox.model.InlineResponse20014;
import com.treezor.sandbox.model.InlineResponseDefault;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface MandateApi {

    void deleteMandate(Integer id, String origin, Handler<AsyncResult<InlineResponse20014>> handler);

    void getMandate(Long id, Handler<AsyncResult<InlineResponse20014>> handler);

    void getMandates(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter, Handler<AsyncResult<InlineResponse20014>> handler);

    void mandatesIdResendOtpPut(Integer id, String accessToken, String accessSignature, Integer userId, String accessTag, Integer accessUserId, String accessUserIp, String debtorMobile, Handler<AsyncResult<InlineResponse20014>> handler);

    void mandatesIdSignPut(Integer id, String accessToken, String accessSignature, Integer userId, String otp, String accessTag, Integer accessUserId, String accessUserIp, String debtorSignatureIp, Handler<AsyncResult<InlineResponse20014>> handler);

    void postMandates(String sddType, Boolean isPaper, String userId, String debtorName, String debtorAddress, String debtorCity, String debtorZipCode, String debtorCountry, String debtorIban, String sequenceType, String createdIp, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String debtorBic, String signatureDate, Handler<AsyncResult<InlineResponse20014>> handler);

}
