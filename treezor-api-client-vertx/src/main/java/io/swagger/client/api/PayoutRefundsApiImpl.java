package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20020;
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


public class PayoutRefundsApiImpl implements PayoutRefundsApi {

    private ApiClient apiClient;

    public PayoutRefundsApiImpl() {
        this(null);
    }

    public PayoutRefundsApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * search pay outs refund
     * Get pay out refund that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). (optional)
     * @param id PayoutRefund id (optional)
     * @param tag PayoutRefund tag (optional)
     * @param codeStatus PayoutRefund Code Status (optional)
     * @param informationStatus PayoutRefund Information Status (optional)
     * @param payoutId Payout Id (optional)
     * @param pageNumber The page number (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayoutRefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer id, String tag, String codeStatus, String informationStatus, Integer payoutId, Integer pageNumber, Handler<AsyncResult<TreezorInlineResponse20020>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/payoutRefunds";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "codeStatus", codeStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "informationStatus", informationStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutId", payoutId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20020> localVarReturnType = new TypeReference<TreezorInlineResponse20020>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
