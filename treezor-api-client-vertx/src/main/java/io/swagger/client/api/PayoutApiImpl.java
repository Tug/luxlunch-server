package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20019;
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


public class PayoutApiImpl implements PayoutApi {

    private ApiClient apiClient;

    public PayoutApiImpl() {
        this(null);
    }

    public PayoutApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * cancel a payout
     * Change pay out status to CANCELED. A VALIDATED pay out can&#39;t be canceled.
     * @param id Payouts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePayout(Long id, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deletePayout"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payouts/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20019> localVarReturnType = new TypeReference<TreezorInlineResponse20019>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a payout
     * Get a pay out from the system.
     * @param id Payouts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayout(Long id, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getPayout"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payouts/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20019> localVarReturnType = new TypeReference<TreezorInlineResponse20019>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search payout(s)
     * Get payout(s) that match search criteria. The request must contains at least one of those inputs  payoutId, bankaccountId, beneficiaryId, payoutTypeId, payoutTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payoutId Payout&#39;s Id (optional)
     * @param payoutTag Custom data. (optional)
     * @param payoutStatus pay out status; Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param payoutTypeId Pay out type&#39;s id :  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit |  (optional)
     * @param walletId Pay out wallet&#39;s id. (optional)
     * @param userId Pay out user&#39;s id. (optional)
     * @param payoutDate pay out execution date. Format: YYYY-MM-DD HH:MM:SS&#39;  (optional)
     * @param bankaccountId Pay out bank account id. (optional)
     * @param beneficiaryId Pay out beneficiary id. (optional)
     * @param amount Pay out amount. (optional)
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
    public void getPayouts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer payoutId, String payoutTag, String payoutStatus, Integer payoutTypeId, Integer walletId, Integer userId, OffsetDateTime payoutDate, Integer bankaccountId, Integer beneficiaryId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/payouts";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutId", payoutId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutTag", payoutTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutStatus", payoutStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutTypeId", payoutTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutDate", payoutDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountId", bankaccountId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beneficiaryId", beneficiaryId));
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
        TypeReference<TreezorInlineResponse20019> localVarReturnType = new TypeReference<TreezorInlineResponse20019>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a pay out
     * Create a new pay out in the system.
     * @param walletId Pay out wallet id. (required)
     * @param amount Pay out amount. (required)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payoutTag Custom data. (optional)
     * @param bankaccountId Pay out bank account&#39;s id. Mandatory id beneficiaryId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. (optional)
     * @param beneficiaryId Pay out beneficiary&#39;s id. Mandatory id bankaccountId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. (optional)
     * @param label Pay out label that will be displayed in the receiver&#39;s account (140 chars max). (optional)
     * @param supportingFileLink Support file link (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postPayout(Integer walletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payoutTag, Integer bankaccountId, Integer beneficiaryId, String label, String supportingFileLink, Handler<AsyncResult<TreezorInlineResponse20019>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletId' when calling postPayout"));
            return;
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'amount' when calling postPayout"));
            return;
        }
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currency' when calling postPayout"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payouts";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payoutTag", payoutTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountId", bankaccountId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beneficiaryId", beneficiaryId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "supportingFileLink", supportingFileLink));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20019> localVarReturnType = new TypeReference<TreezorInlineResponse20019>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
