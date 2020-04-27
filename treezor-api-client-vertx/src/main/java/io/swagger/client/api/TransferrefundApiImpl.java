package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20024;
import io.swagger.client.model.TreezorInlineResponse20025;
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


public class TransferrefundApiImpl implements TransferrefundApi {

    private ApiClient apiClient;

    public TransferrefundApiImpl() {
        this(null);
    }

    public TransferrefundApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * cancel a transfer refund
     * Change transfer refund&#39;s status to CANCELED. A validated transfer refund can&#39;t be cancelled.
     * @param id Transferrefunds internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteTransferrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20024>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteTransferrefund"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transferrefunds/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20024> localVarReturnType = new TypeReference<TreezorInlineResponse20024>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a transfer refund
     * Get a transfer refund from the system.
     * @param id Trasnfert refund internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransferrefund(Long id, Handler<AsyncResult<TreezorInlineResponse20024>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getTransferrefund"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transferrefunds/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20024> localVarReturnType = new TypeReference<TreezorInlineResponse20024>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search transfer refunds
     * Get transfer refunds that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferrefundId Transfer refund id. (optional)
     * @param transferrefundTag Custom data. (optional)
     * @param transferrefundStatus Transfer refund status. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param walletId Refunded wallet&#39;s id. (optional)
     * @param transferId Initial transfer&#39;s id. (optional)
     * @param transferrefundDate transfert refund&#39;s date. Format: YYYY-MM-DD HH:MM:SS  (optional)
     * @param userId User&#39;s id of who has made the transfer refund. (optional)
     * @param amount Refund amount. (optional)
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
    public void getTransferrefunds(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transferrefundId, String transferrefundTag, String transferrefundStatus, Integer walletId, Integer transferId, Integer transferrefundDate, Integer userId, String amount, String currency, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20024>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/transferrefunds";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferrefundId", transferrefundId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferrefundTag", transferrefundTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferrefundStatus", transferrefundStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferId", transferId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferrefundDate", transferrefundDate));
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
        TypeReference<TreezorInlineResponse20024> localVarReturnType = new TypeReference<TreezorInlineResponse20024>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a transfer refund
     * Create a new transfer refund in the system.
     * @param transferId transfer&#39;s id to refund. (required)
     * @param amount Refund amount (required)
     * @param currency Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transferrefundTag Custom data. (optional)
     * @param comment End user, client or issuer comment. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postTransferrefunds(Integer transferId, Integer amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String transferrefundTag, String comment, Handler<AsyncResult<TreezorInlineResponse20025>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'transferId' is set
        if (transferId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'transferId' when calling postTransferrefunds"));
            return;
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'amount' when calling postTransferrefunds"));
            return;
        }
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currency' when calling postTransferrefunds"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transferrefunds";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferrefundTag", transferrefundTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferId", transferId));
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
        TypeReference<TreezorInlineResponse20025> localVarReturnType = new TypeReference<TreezorInlineResponse20025>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
