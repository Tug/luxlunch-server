package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20010;
import io.swagger.client.model.TreezorInlineResponse2009;
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


public class CardtransactionApiImpl implements CardtransactionApi {

    private ApiClient apiClient;

    public CardtransactionApiImpl() {
        this(null);
    }

    public CardtransactionApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get a card transaction
     * get a card transaction
     * @param id Card transactions&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getCardtransaction(Long id, Handler<AsyncResult<TreezorInlineResponse20010>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getCardtransaction"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cardtransactions/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20010> localVarReturnType = new TypeReference<TreezorInlineResponse20010>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search for card transactions
     * Search for documents. The request must contain at least one of those inputs - cardId, paymentId, publicToken, walletId
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param cardtransactionId Card transaction&#39;s Id (optional)
     * @param cardId Card&#39;s Id (optional)
     * @param walletId Card&#39;s wallet Id (optional)
     * @param merchantId Merchant&#39;s Id (optional)
     * @param publicToken Card&#39;s public token (optional)
     * @param paymentId Payment&#39;s Id (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). required: false (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void readCardTransaction(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardtransactionId, Integer cardId, Integer walletId, Integer merchantId, String publicToken, Integer paymentId, Integer pageNumber, Integer pageCount, String sortBy, Handler<AsyncResult<TreezorInlineResponse2009>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/cardtransactions";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardtransactionId", cardtransactionId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardId", cardId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchantId", merchantId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "publicToken", publicToken));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentId", paymentId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCount", pageCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2009> localVarReturnType = new TypeReference<TreezorInlineResponse2009>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
