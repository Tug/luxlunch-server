package io.swagger.client.api.rxjava;

import io.swagger.client.model.TreezorInlineResponse20014;
import io.swagger.client.model.TreezorInlineResponseDefault;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


public class MandateApi {

	private final io.swagger.client.api.MandateApi delegate;

	public MandateApi(io.swagger.client.api.MandateApi delegate) {
	    this.delegate = delegate;
    }

	public io.swagger.client.api.MandateApi getDelegate() {
	    return delegate;
	}

    /**
     * revoke a mandate
     * Change mandate&#39;s status to canceled.
     * @param id Mandate&#39;s internal id. (required)
     * @param origin The origin of the request for revocation (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteMandate(Integer id, String origin, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        delegate.deleteMandate(id, origin, resultHandler);
    }

    /**
     * revoke a mandate
     * Change mandate&#39;s status to canceled.
     * @param id Mandate&#39;s internal id. (required)
     * @param origin The origin of the request for revocation (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20014> rxDeleteMandate(Integer id, String origin) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteMandate(id, origin, fut);
        }));
    }
    /**
     * get mandate
     * Get a mandate from the system.
     * @param id Mandate&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getMandate(Long id, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        delegate.getMandate(id, resultHandler);
    }

    /**
     * get mandate
     * Get a mandate from the system.
     * @param id Mandate&#39;s internal id. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20014> rxGetMandate(Long id) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getMandate(id, fut);
        }));
    }
    /**
     * search mandates
     * Get mandates that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param mandateId Mandate&#39;s Id (optional)
     * @param userId User&#39;s id who initiates the mandate request. (optional)
     * @param uniqueMandateReference Unique Mandate Reference (UMR) of the searched mandate. It is a sequence of characters that ensures the mandate traceability. UMR coupled with SCI allows to uniquely identify a creditor and a contract for any mandate. It is provided at the mandate creation. (optional)
     * @param mandateStatus Mandate&#39;s status. Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param filter You can filter the API response by using filter(s). Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getMandates(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        delegate.getMandates(accessSignature, accessTag, accessUserId, accessUserIp, mandateId, userId, uniqueMandateReference, mandateStatus, filter, resultHandler);
    }

    /**
     * search mandates
     * Get mandates that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param mandateId Mandate&#39;s Id (optional)
     * @param userId User&#39;s id who initiates the mandate request. (optional)
     * @param uniqueMandateReference Unique Mandate Reference (UMR) of the searched mandate. It is a sequence of characters that ensures the mandate traceability. UMR coupled with SCI allows to uniquely identify a creditor and a contract for any mandate. It is provided at the mandate creation. (optional)
     * @param mandateStatus Mandate&#39;s status. Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param filter You can filter the API response by using filter(s). Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20014> rxGetMandates(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getMandates(accessSignature, accessTag, accessUserId, accessUserIp, mandateId, userId, uniqueMandateReference, mandateStatus, filter, fut);
        }));
    }
    /**
     * send an OTP
     * Send an OTP to sign a specific mandate. The OTP will be sent to the user&#39;s mobile phone OR to a specific mobile phone number in the request. 
     * @param id Mandate&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param userId User&#39;s id who initiates the mandate request. (required)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param debtorMobile Debtor&#39;s mobile phone number. Used to send the OTP for signature (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void mandatesIdResendOtpPut(Integer id, String accessToken, String accessSignature, Integer userId, String accessTag, Integer accessUserId, String accessUserIp, String debtorMobile, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        delegate.mandatesIdResendOtpPut(id, accessToken, accessSignature, userId, accessTag, accessUserId, accessUserIp, debtorMobile, resultHandler);
    }

    /**
     * send an OTP
     * Send an OTP to sign a specific mandate. The OTP will be sent to the user&#39;s mobile phone OR to a specific mobile phone number in the request. 
     * @param id Mandate&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param userId User&#39;s id who initiates the mandate request. (required)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param debtorMobile Debtor&#39;s mobile phone number. Used to send the OTP for signature (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20014> rxMandatesIdResendOtpPut(Integer id, String accessToken, String accessSignature, Integer userId, String accessTag, Integer accessUserId, String accessUserIp, String debtorMobile) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.mandatesIdResendOtpPut(id, accessToken, accessSignature, userId, accessTag, accessUserId, accessUserIp, debtorMobile, fut);
        }));
    }
    /**
     * sign a mandate
     * Sign a mandate with the received OTP.
     * @param id Mandate&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param userId User&#39;s is who initiates the mandate request. (required)
     * @param otp The One-time password that the user got once mandate created. (required)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param debtorSignatureIp IP address from which the mandate will be signed. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void mandatesIdSignPut(Integer id, String accessToken, String accessSignature, Integer userId, String otp, String accessTag, Integer accessUserId, String accessUserIp, String debtorSignatureIp, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        delegate.mandatesIdSignPut(id, accessToken, accessSignature, userId, otp, accessTag, accessUserId, accessUserIp, debtorSignatureIp, resultHandler);
    }

    /**
     * sign a mandate
     * Sign a mandate with the received OTP.
     * @param id Mandate&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (required)
     * @param userId User&#39;s is who initiates the mandate request. (required)
     * @param otp The One-time password that the user got once mandate created. (required)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param debtorSignatureIp IP address from which the mandate will be signed. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20014> rxMandatesIdSignPut(Integer id, String accessToken, String accessSignature, Integer userId, String otp, String accessTag, Integer accessUserId, String accessUserIp, String debtorSignatureIp) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.mandatesIdSignPut(id, accessToken, accessSignature, userId, otp, accessTag, accessUserId, accessUserIp, debtorSignatureIp, fut);
        }));
    }
    /**
     * create a mandate
     * Create a new mandate in the system. 
     * @param sddType Type of mandate.  | Type | Description | | ---- | ----------- | | core | Sepa Direct Debit Core | | b2b | Sepa Direct Debit Business 2 Business  |  (required)
     * @param isPaper Indicate if it&#39;s a paper mandate or not (required)
     * @param userId User&#39;s id who initiates the mandate request. The creditor. (required)
     * @param debtorName Debtor&#39;s full name (required)
     * @param debtorAddress Debtor&#39;s address. (required)
     * @param debtorCity Debtor&#39;s city. (required)
     * @param debtorZipCode Debtor&#39;s zip code (required)
     * @param debtorCountry Debtor&#39;s country (required)
     * @param debtorIban Debtor&#39;s IBAN (required)
     * @param sequenceType Type of mandate.  | Type | Description | | ---- | ----------- | | one-off | One-off payment | | recurrent | Recurrent payment |  Default value: one-off.  (required)
     * @param createdIp IP address of the system that created mandate. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param debtorBic Debtor&#39;s BIC (or SWIFT) (optional)
     * @param signatureDate Signature date of the mandate. Required if is paper. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postMandates(String sddType, Boolean isPaper, String userId, String debtorName, String debtorAddress, String debtorCity, String debtorZipCode, String debtorCountry, String debtorIban, String sequenceType, String createdIp, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String debtorBic, String signatureDate, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        delegate.postMandates(sddType, isPaper, userId, debtorName, debtorAddress, debtorCity, debtorZipCode, debtorCountry, debtorIban, sequenceType, createdIp, accessSignature, accessTag, accessUserId, accessUserIp, debtorBic, signatureDate, resultHandler);
    }

    /**
     * create a mandate
     * Create a new mandate in the system. 
     * @param sddType Type of mandate.  | Type | Description | | ---- | ----------- | | core | Sepa Direct Debit Core | | b2b | Sepa Direct Debit Business 2 Business  |  (required)
     * @param isPaper Indicate if it&#39;s a paper mandate or not (required)
     * @param userId User&#39;s id who initiates the mandate request. The creditor. (required)
     * @param debtorName Debtor&#39;s full name (required)
     * @param debtorAddress Debtor&#39;s address. (required)
     * @param debtorCity Debtor&#39;s city. (required)
     * @param debtorZipCode Debtor&#39;s zip code (required)
     * @param debtorCountry Debtor&#39;s country (required)
     * @param debtorIban Debtor&#39;s IBAN (required)
     * @param sequenceType Type of mandate.  | Type | Description | | ---- | ----------- | | one-off | One-off payment | | recurrent | Recurrent payment |  Default value: one-off.  (required)
     * @param createdIp IP address of the system that created mandate. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param debtorBic Debtor&#39;s BIC (or SWIFT) (optional)
     * @param signatureDate Signature date of the mandate. Required if is paper. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TreezorInlineResponse20014> rxPostMandates(String sddType, Boolean isPaper, String userId, String debtorName, String debtorAddress, String debtorCity, String debtorZipCode, String debtorCountry, String debtorIban, String sequenceType, String createdIp, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String debtorBic, String signatureDate) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.postMandates(sddType, isPaper, userId, debtorName, debtorAddress, debtorCity, debtorZipCode, debtorCountry, debtorIban, sequenceType, createdIp, accessSignature, accessTag, accessUserId, accessUserIp, debtorBic, signatureDate, fut);
        }));
    }

    public static MandateApi newInstance(io.swagger.client.api.MandateApi arg) {
        return arg != null ? new MandateApi(arg) : null;
    }
}
