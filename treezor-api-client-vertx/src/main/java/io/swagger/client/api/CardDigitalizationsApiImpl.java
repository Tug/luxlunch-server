package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse2007;
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


public class CardDigitalizationsApiImpl implements CardDigitalizationsApi {

    private ApiClient apiClient;

    public CardDigitalizationsApiImpl() {
        this(null);
    }

    public CardDigitalizationsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a card digitalizations based on its internal id
     * Get a card digitalizations based on its internal id
     * @param id Card digitalization internal id. (required)
     * @param fields fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardDigitalizationsId(Long id, String fields, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardDigitalizationsId"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cardDigitalizations/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2007> localVarReturnType = new TypeReference<TreezorInlineResponse2007>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Deletes a payment Token
     * Deletes a payment Token
     * @param id Card digitalization internal id. (required)
     * @param reasonCode The reason code for the action. Possible values are :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other |  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletecardDigitalizationsId(Long id, String reasonCode, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deletecardDigitalizationsId"));
            return;
        }
        
        // verify the required parameter 'reasonCode' is set
        if (reasonCode == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'reasonCode' when calling deletecardDigitalizationsId"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cardDigitalizations/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reasonCode", reasonCode));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2007> localVarReturnType = new TypeReference<TreezorInlineResponse2007>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update the status of a payment Token
     * Update the status of a payment Token
     * @param id Card digitalization internal id. (required)
     * @param status The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend |  (required)
     * @param reasonCode The reason code for the action. Possible values are : - For a suspension :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  - For an unsuspension :  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other |  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void putcardDigitalizationsId(Long id, String status, String reasonCode, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling putcardDigitalizationsId"));
            return;
        }
        
        // verify the required parameter 'status' is set
        if (status == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'status' when calling putcardDigitalizationsId"));
            return;
        }
        
        // verify the required parameter 'reasonCode' is set
        if (reasonCode == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'reasonCode' when calling putcardDigitalizationsId"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cardDigitalizations/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reasonCode", reasonCode));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2007> localVarReturnType = new TypeReference<TreezorInlineResponse2007>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search for card digitalizations
     * Search for card digitalizations.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param filter Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate  More info [here](https://agent.treezor.com/filterv2).  (optional)
     * @param fields fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void readcardDigitalizations(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String filter, String fields, Handler<AsyncResult<TreezorInlineResponse2007>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/cardDigitalizations";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2007> localVarReturnType = new TypeReference<TreezorInlineResponse2007>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
