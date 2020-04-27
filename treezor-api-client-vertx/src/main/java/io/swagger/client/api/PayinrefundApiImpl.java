package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20018;
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


public class PayinrefundApiImpl implements PayinrefundApi {

    private ApiClient apiClient;

    public PayinrefundApiImpl() {
        this(null);
    }

    public PayinrefundApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * cancel a pay in refund
     * Change payin refund&#39;s status to CANCELED. A validated payin refund can&#39;t be cancelled.
     * @param id Payinrefund&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePayinrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deletePayinrefund"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payinrefunds/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20018> localVarReturnType = new TypeReference<TreezorInlineResponse20018>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a pay in refund
     * Get a payin refund from the system.
     * @param id Payinrefund&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayinrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getPayinrefund"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payinrefunds/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20018> localVarReturnType = new TypeReference<TreezorInlineResponse20018>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search pay in refunds
     * Search for payinrefunds in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinId Payin&#39;s id. (optional)
     * @param payinrefundId Payinrefund&#39;s id. (optional)
     * @param payinrefundTag Custom data. (optional)
     * @param payinrefundStatus Payinrefund&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED (optional)
     * @param walletId Wallet&#39;s id to refund. (optional)
     * @param payinrefundDate payinrefund&#39;s date. Format: YYYY-MM-DD (optional)
     * @param userId User&#39;s id who made refunds. (optional)
     * @param amount Refund&#39;s amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayinrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payinId, Integer payinrefundId, String payinrefundTag, String payinrefundStatus, Integer walletId, OffsetDateTime payinrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/payinrefunds";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinId", payinId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinrefundId", payinrefundId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinrefundTag", payinrefundTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinrefundStatus", payinrefundStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinrefundDate", payinrefundDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCount", pageCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateFrom", createdDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTo", createdDateTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedDateFrom", updatedDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedDateTo", updatedDateTo));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20018> localVarReturnType = new TypeReference<TreezorInlineResponse20018>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a pay in refund
     * Create a new payinrefund in the system.
     * @param payinId payin&#39;s id to refund. (required)
     * @param amount Refund amount. (required)
     * @param currency Refund currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinrefundTag Custom data. (optional)
     * @param comment End user, client or issuer comment. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postPayinrefunds(Integer payinId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinrefundTag, String comment, Handler<AsyncResult<TreezorInlineResponse20018>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'payinId' is set
        if (payinId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'payinId' when calling postPayinrefunds"));
            return;
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'amount' when calling postPayinrefunds"));
            return;
        }
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currency' when calling postPayinrefunds"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payinrefunds";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinrefundTag", payinrefundTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinId", payinId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20018> localVarReturnType = new TypeReference<TreezorInlineResponse20018>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
