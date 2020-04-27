package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20014;
import io.swagger.client.model.TreezorInlineResponseDefault;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;


public class MandateApiImpl implements MandateApi {

    private ApiClient apiClient;

    public MandateApiImpl() {
        this(null);
    }

    public MandateApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * revoke a mandate
     * Change mandate&#39;s status to canceled.
     * @param id Mandate&#39;s internal id. (required)
     * @param origin The origin of the request for revocation (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteMandate(Integer id, String origin, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteMandate"));
            return;
        }
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'origin' when calling deleteMandate"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mandates/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "origin", origin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20014> localVarReturnType = new TypeReference<TreezorInlineResponse20014>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get mandate
     * Get a mandate from the system.
     * @param id Mandate&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getMandate(Long id, Handler<AsyncResult<TreezorInlineResponse20014>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getMandate"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mandates/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20014> localVarReturnType = new TypeReference<TreezorInlineResponse20014>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
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
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/mandates";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mandateId", mandateId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uniqueMandateReference", uniqueMandateReference));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mandateStatus", mandateStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20014> localVarReturnType = new TypeReference<TreezorInlineResponse20014>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
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
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling mandatesIdResendOtpPut"));
            return;
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'accessToken' when calling mandatesIdResendOtpPut"));
            return;
        }
        
        // verify the required parameter 'accessSignature' is set
        if (accessSignature == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'accessSignature' when calling mandatesIdResendOtpPut"));
            return;
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling mandatesIdResendOtpPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mandates/{id}/ResendOtp/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessToken", accessToken));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorMobile", debtorMobile));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20014> localVarReturnType = new TypeReference<TreezorInlineResponse20014>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
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
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling mandatesIdSignPut"));
            return;
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'accessToken' when calling mandatesIdSignPut"));
            return;
        }
        
        // verify the required parameter 'accessSignature' is set
        if (accessSignature == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'accessSignature' when calling mandatesIdSignPut"));
            return;
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling mandatesIdSignPut"));
            return;
        }
        
        // verify the required parameter 'otp' is set
        if (otp == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'otp' when calling mandatesIdSignPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mandates/{id}/Sign/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessToken", accessToken));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "otp", otp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorSignatureIp", debtorSignatureIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20014> localVarReturnType = new TypeReference<TreezorInlineResponse20014>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
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
        Object localVarBody = null;
        
        // verify the required parameter 'sddType' is set
        if (sddType == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'sddType' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'isPaper' is set
        if (isPaper == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'isPaper' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'debtorName' is set
        if (debtorName == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'debtorName' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'debtorAddress' is set
        if (debtorAddress == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'debtorAddress' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'debtorCity' is set
        if (debtorCity == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'debtorCity' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'debtorZipCode' is set
        if (debtorZipCode == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'debtorZipCode' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'debtorCountry' is set
        if (debtorCountry == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'debtorCountry' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'debtorIban' is set
        if (debtorIban == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'debtorIban' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'sequenceType' is set
        if (sequenceType == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'sequenceType' when calling postMandates"));
            return;
        }
        
        // verify the required parameter 'createdIp' is set
        if (createdIp == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'createdIp' when calling postMandates"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/mandates";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sddType", sddType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isPaper", isPaper));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorName", debtorName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorAddress", debtorAddress));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorCity", debtorCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorZipCode", debtorZipCode));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorCountry", debtorCountry));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorIban", debtorIban));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "debtorBic", debtorBic));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sequenceType", sequenceType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdIp", createdIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "signatureDate", signatureDate));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20014> localVarReturnType = new TypeReference<TreezorInlineResponse20014>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
