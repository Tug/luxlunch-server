package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20022;
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


public class TransactionApiImpl implements TransactionApi {

    private ApiClient apiClient;

    public TransactionApiImpl() {
        this(null);
    }

    public TransactionApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get a transaction
     * Get a transaction from the system.
     * @param id Transaction&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransaction(Long id, Handler<AsyncResult<TreezorInlineResponse20022>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getTransaction"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/transactions/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20022> localVarReturnType = new TypeReference<TreezorInlineResponse20022>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search transactions
     * Get transactions that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param transactionId Transaction&#39;s Id (optional)
     * @param transactionType Transaction types. Possible values: * Payin * Payout * Transfer * Transfer Refund * Payin Refund * Discount * Bill  (optional)
     * @param walletId Transactions&#39; wallet id. (optional)
     * @param userId Transactions&#39; user id. (optional)
     * @param name Transactions&#39; name. (optional)
     * @param description transactions&#39; description. (optional)
     * @param amount Transactions&#39; amount. (optional)
     * @param currency Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  (optional)
     * @param valueDate The value date of the transaction (date applied for the payment) Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param executionDate Date of the execution of the transaction Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getTransactions(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer transactionId, String transactionType, Integer walletId, Integer userId, String name, String description, String amount, String currency, OffsetDateTime valueDate, OffsetDateTime executionDate, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, Handler<AsyncResult<TreezorInlineResponse20022>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/transactions";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionId", transactionId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionType", transactionType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "valueDate", valueDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "executionDate", executionDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCount", pageCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateFrom", createdDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTo", createdDateTo));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20022> localVarReturnType = new TypeReference<TreezorInlineResponse20022>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
