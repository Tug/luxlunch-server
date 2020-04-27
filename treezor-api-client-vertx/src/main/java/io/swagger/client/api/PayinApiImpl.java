package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20017;
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


public class PayinApiImpl implements PayinApi {

    private ApiClient apiClient;

    public PayinApiImpl() {
        this(null);
    }

    public PayinApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * delete a pay in
     * Deactivate a payin in the system.
     * @param id Payin&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePayin(Long id, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deletePayin"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payins/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20017> localVarReturnType = new TypeReference<TreezorInlineResponse20017>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a pay in
     * Get a payin from the system by its id.
     * @param id Payin&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayin(Long id, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getPayin"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payins/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20017> localVarReturnType = new TypeReference<TreezorInlineResponse20017>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search pay ins
     * Get payins that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinId Payin&#39;s id. (optional)
     * @param walletId Payin&#39;s wallet id. (optional)
     * @param payinTag Client custom data. (optional)
     * @param payinStatus Payins&#39;s status. (optional)
     * @param userId User&#39;s id who performed the operation (debited). (optional)
     * @param userName User&#39;s name who performed the operation (debited). (optional)
     * @param userEmail User&#39;s email who performed the operation (debited). (optional)
     * @param beneficiaryUserId User&#39;s id who received the operation (credited). (optional)
     * @param eventAlias Wallet eventAlias of the payin (credited wallet). (optional)
     * @param walletTypeId Payin&#39;s wallet type id. (optional)
     * @param paymentMethodId Payin&#39;s payment method id. (optional)
     * @param createdDateFrom The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param createdDateTo The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateFrom The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param updatedDateTo The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : createdDate. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPayins(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer payinId, Integer walletId, String payinTag, String payinStatus, Integer userId, String userName, String userEmail, Integer beneficiaryUserId, String eventAlias, Integer walletTypeId, String paymentMethodId, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/payins";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIP", accessUserIP));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinId", payinId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinTag", payinTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinStatus", payinStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userEmail", userEmail));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beneficiaryUserId", beneficiaryUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventAlias", eventAlias));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletTypeId", walletTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentMethodId", paymentMethodId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateFrom", createdDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTo", createdDateTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedDateFrom", updatedDateFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedDateTo", updatedDateTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCount", pageCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20017> localVarReturnType = new TypeReference<TreezorInlineResponse20017>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a pay in
     * Create a new pay in in the system.
     * @param walletId Credited wallet&#39;s ID (required)
     * @param userId User&#39;s id who makes the pay in. NB : this parameter should should not be transmitted in the case of payin of method Sepa Direct Debit Core (21). It will be set automatically by the system.  (required)
     * @param paymentMethodId | Id | Payment by | | ---| --- | | 3 | Check | | 11 | Card | | 14 | Oneclick card (without payment form) | | 21 | Sepa Direct Debit Core | | 23 | Full Hosted HTML Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized | | 24 | IFrame Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized| | 25 | Payment made through an SDK - You cannot directly create a payin directly with this method id. The payin will be automatically created by the system. |  (required)
     * @param amount Pay in amount. (required)
     * @param currency Payin currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). Must be the same as the wallet&#39;s.  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param payinTag Client custom data. (optional)
     * @param oneclickcardId Oneclick card&#39;s id. Mandatory if payment method is 14. Useless otherwise. (optional)
     * @param paymentAcceptedUrl Url where cardholder is redirected if payment is successful. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentWaitingUrl Url where cardholder is redirected to wait payment processing. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentRefusedUrl Url where cardholder is redirected if payment is refused. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentCanceledUrl Url where cardholder is redirected if payment is canceled. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param paymentExceptionUrl Url where cardholder is redirected if the payment process raised an exception. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. (optional)
     * @param distributorFee Distributor fee (optional)
     * @param messageToUser Message to send to wallet&#39;s user. In the case of a Sepa Direct Debit Core payment method this parameter will be the reconciliation information transmitted to the Debtor (ie. Invoice number ...). In this case it cannot be more than 140 characters. (optional)
     * @param language Language for the third party interface. (optional)
     * @param createdIp User&#39;s IP address (optional)
     * @param payinDate The date at which the SDD should be presented. This parameter is mandatory when performing a payin of method SDD Core. Format is YYYY-MM-DD The date should follow some requirements (Traget 2 working day) :    - Be a weekday (Monday to Friday)   - January 1st is excluded   - May 1st is excluded   - December 25 is excluded   - December 26th is excluded   - Easter day is excluded   - Easter Monday is excluded   - Good Friday is excluded  (optional)
     * @param mandateId The id of the mandate. This parameter is mandatory when performing a payin with method SDD Core. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postPayin(Integer walletId, Integer userId, Integer paymentMethodId, Float amount, String currency, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String payinTag, Integer oneclickcardId, String paymentAcceptedUrl, String paymentWaitingUrl, String paymentRefusedUrl, String paymentCanceledUrl, String paymentExceptionUrl, Float distributorFee, String messageToUser, String language, String createdIp, String payinDate, Integer mandateId, Handler<AsyncResult<TreezorInlineResponse20017>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletId' when calling postPayin"));
            return;
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling postPayin"));
            return;
        }
        
        // verify the required parameter 'paymentMethodId' is set
        if (paymentMethodId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'paymentMethodId' when calling postPayin"));
            return;
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'amount' when calling postPayin"));
            return;
        }
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currency' when calling postPayin"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/payins";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinTag", payinTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentMethodId", paymentMethodId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "oneclickcardId", oneclickcardId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentAcceptedUrl", paymentAcceptedUrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentWaitingUrl", paymentWaitingUrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentRefusedUrl", paymentRefusedUrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentCanceledUrl", paymentCanceledUrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentExceptionUrl", paymentExceptionUrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "distributorFee", distributorFee));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageToUser", messageToUser));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdIp", createdIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinDate", payinDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mandateId", mandateId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20017> localVarReturnType = new TypeReference<TreezorInlineResponse20017>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
