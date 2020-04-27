package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse2001;
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


public class BankaccountApiImpl implements BankaccountApi {

    private ApiClient apiClient;

    public BankaccountApiImpl() {
        this(null);
    }

    public BankaccountApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * deactivate a bank account
     * Change bank account&#39;s status to CANCELED. If a payout is being validated on this bank account, it can not be canceled.
     * @param id Bank Accounts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteBankaccount(Long id, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteBankaccount"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bankaccounts/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse2001> localVarReturnType = new TypeReference<TreezorInlineResponse2001>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a bank account
     * Get a bank account from the system.
     * @param id Bank Accounts internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getBankaccount(Long id, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getBankaccount"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bankaccounts/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse2001> localVarReturnType = new TypeReference<TreezorInlineResponse2001>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search bank accounts
     * Get bank accounts that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param bankaccountId bank account id. (optional)
     * @param bankaccountStatus bank account status. Possible values: * CANCELED * PENDING * VALIDATED  (optional)
     * @param userId Bank account owner user&#39;s id (optional)
     * @param bankaccountIBAN Bank account IBAN (optional)
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
    public void getBankaccounts(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer bankaccountId, String bankaccountStatus, Integer userId, String bankaccountIBAN, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/bankaccounts";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountId", bankaccountId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountStatus", bankaccountStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountIBAN", bankaccountIBAN));
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
        TypeReference<TreezorInlineResponse2001> localVarReturnType = new TypeReference<TreezorInlineResponse2001>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a bank account
     * Create a new benefeciary bank account in the system.
     * @param userId Owner user&#39;s id. (required)
     * @param bankaccountOwnerName Bank account owner&#39;s name. (required)
     * @param bankaccountOwnerAddress Bank account owner&#39;s address. (required)
     * @param bankaccountIBAN Beneficiary bank account&#39;s IBAN. (required)
     * @param bankaccountBIC Beneficiary bank account&#39;s BIC (or SWIFT). (required)
     * @param bankaccountType Beneficiary bank account&#39;s type. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param bankaccountTag Custom data. (optional)
     * @param name Bank account&#39;s name. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postBankaccount(Integer userId, String bankaccountOwnerName, String bankaccountOwnerAddress, String bankaccountIBAN, String bankaccountBIC, String bankaccountType, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String bankaccountTag, String name, Handler<AsyncResult<TreezorInlineResponse2001>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling postBankaccount"));
            return;
        }
        
        // verify the required parameter 'bankaccountOwnerName' is set
        if (bankaccountOwnerName == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'bankaccountOwnerName' when calling postBankaccount"));
            return;
        }
        
        // verify the required parameter 'bankaccountOwnerAddress' is set
        if (bankaccountOwnerAddress == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'bankaccountOwnerAddress' when calling postBankaccount"));
            return;
        }
        
        // verify the required parameter 'bankaccountIBAN' is set
        if (bankaccountIBAN == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'bankaccountIBAN' when calling postBankaccount"));
            return;
        }
        
        // verify the required parameter 'bankaccountBIC' is set
        if (bankaccountBIC == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'bankaccountBIC' when calling postBankaccount"));
            return;
        }
        
        // verify the required parameter 'bankaccountType' is set
        if (bankaccountType == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'bankaccountType' when calling postBankaccount"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/bankaccounts";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountTag", bankaccountTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountOwnerName", bankaccountOwnerName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountOwnerAddress", bankaccountOwnerAddress));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountIBAN", bankaccountIBAN));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountBIC", bankaccountBIC));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bankaccountType", bankaccountType));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2001> localVarReturnType = new TypeReference<TreezorInlineResponse2001>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
