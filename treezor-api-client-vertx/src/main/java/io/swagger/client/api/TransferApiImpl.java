package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20023;
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


public class TransferApiImpl implements TransferApi {

    private ApiClient apiClient;

    public TransferApiImpl() {
        this(null);
    }

    public TransferApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * cancel a transfer
     * Change transfer&#39;s status to CANCELED. A validated transfer can&#39;t be cancelled.
     * @param id Transfert internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteTransfer(Long id, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteTransfer"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transfers/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20023> localVarReturnType = new TypeReference<TreezorInlineResponse20023>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a transfer
     * Get a transfert from the system.
     * @param id Transfers internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransfer(Long id, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getTransfer"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transfers/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20023> localVarReturnType = new TypeReference<TreezorInlineResponse20023>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search transfers
     * Search for transfers in the system. The request must contains at least one of those inputs  walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferId, transferTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferId Transfer&#39;s id. (optional)
     * @param transferTag Custom data. (optional)
     * @param transferStatus Transfer&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param walletId Debited wallet&#39;s id. (optional)
     * @param beneficiaryWalletId Credited wallet&#39;s id. (optional)
     * @param userId Debited wallet user&#39;s id. (optional)
     * @param beneficiaryUserId Credited wallet user&#39;s id. (optional)
     * @param transferDate Transfert&#39;s date. Format : YYYY-MM-DD HH:MM:SS  (optional)
     * @param amount Transfert&#39;s amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param transferTypeId The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet | | 2 | Card transaction | | 3 | Client fees | | 4 | Credit note |  (optional)
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
    public void getTransfers(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferId, String transferTag, String transferStatus, Integer walletId, Integer beneficiaryWalletId, Integer userId, Integer beneficiaryUserId, OffsetDateTime transferDate, String amount, String currency, Integer transferTypeId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/transfers";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferId", transferId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferTag", transferTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferStatus", transferStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beneficiaryWalletId", beneficiaryWalletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beneficiaryUserId", beneficiaryUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferDate", transferDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferTypeId", transferTypeId));
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
        TypeReference<TreezorInlineResponse20023> localVarReturnType = new TypeReference<TreezorInlineResponse20023>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a transfer
     * Create a new transfer in the system.
     * @param walletId Debited wallet&#39;s ID (required)
     * @param beneficiaryWalletId Credited wallet&#39;s ID (required)
     * @param amount Transfer&#39;s amount (required)
     * @param currency Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferTag Custom data. (optional)
     * @param label Custom data. (optional)
     * @param transferTypeId The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet (default value) | | 3 | Client fees | | 4 | Credit note |  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postTransfers(Integer walletId, Integer beneficiaryWalletId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferTag, String label, Integer transferTypeId, Handler<AsyncResult<TreezorInlineResponse20023>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletId' when calling postTransfers"));
            return;
        }
        
        // verify the required parameter 'beneficiaryWalletId' is set
        if (beneficiaryWalletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'beneficiaryWalletId' when calling postTransfers"));
            return;
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'amount' when calling postTransfers"));
            return;
        }
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currency' when calling postTransfers"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transfers";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferTag", transferTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beneficiaryWalletId", beneficiaryWalletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferTypeId", transferTypeId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20023> localVarReturnType = new TypeReference<TreezorInlineResponse20023>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
