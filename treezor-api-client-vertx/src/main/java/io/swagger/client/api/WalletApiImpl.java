package io.swagger.client.api;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20028;
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


public class WalletApiImpl implements WalletApi {

    private ApiClient apiClient;

    public WalletApiImpl() {
        this(null);
    }

    public WalletApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * delete a wallet
     * Change wallet&#39;s status to **CANCELED**.
     * @param id Wallet&#39;s id (required)
     * @param origin Request&#39;s origin. Possible values are: * OPERATOR * USER  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteWallet(Integer id, String origin, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteWallet"));
            return;
        }
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'origin' when calling deleteWallet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/wallets/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "origin", origin));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20028> localVarReturnType = new TypeReference<TreezorInlineResponse20028>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a wallet
     * 
     * @param id Object internal id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getWallet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/wallets/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20028> localVarReturnType = new TypeReference<TreezorInlineResponse20028>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search wallets
     * Get wallets from the system that match the search criteria. The request must contains at least one of those inputs :walletId eventAlias, userId, walletTypeId, walletTag
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletId Wallet&#39;s unique id. (optional)
     * @param walletStatus Wallet&#39;s status:  * **validated**: Wallet is active. It is possible to deposit to or retrieve money from the wallet.  * **cancelled**: Wallet is closed. No action possible, there is no money in the wallet, it was closed by an operator or by the user.  * **pending**: Wallet being validated (e.g. suspected fraud, late submission of documents&#39; validation ... KYC ). In this case, it is not possible to use the wallet for transactions. (optional)
     * @param userId Wallet owner&#39;s id. (optional)
     * @param parentUserId Parent user id of the wallet owner (optional)
     * @param walletTag Custom data. (optional)
     * @param walletTypeId Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  (optional)
     * @param eventAlias Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding  (optional)
     * @param eventPayinStartDate  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD HH:MM:SS (optional)
     * @param eventPayinEndDate Deadline to money deposit on the wallet. Format : YYYY-MM-DD HH:MM:SS  (optional)
     * @param tariffId Wallet pricing id. (optional)
     * @param payinCount Number of payin done on the wallet. (optional)
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
    public void getWallets(String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, String eventAlias, OffsetDateTime eventPayinStartDate, OffsetDateTime eventPayinEndDate, Integer tariffId, Integer payinCount, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/wallets";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIP", accessUserIP));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletStatus", walletStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentUserId", parentUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletTag", walletTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletTypeId", walletTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventAlias", eventAlias));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventPayinStartDate", eventPayinStartDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventPayinEndDate", eventPayinEndDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tariffId", tariffId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "payinCount", payinCount));
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
        TypeReference<TreezorInlineResponse20028> localVarReturnType = new TypeReference<TreezorInlineResponse20028>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a wallet
     * Create a new wallet in the system..
     * @param walletTypeId Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  (required)
     * @param tariffId Wallet pricing id. (required)
     * @param userId Wallet owner&#39;s id. (required)
     * @param currency The currency that will be used for all wallet money transactions format : ISO 4217 3-letter code for each currency : Euro &#x3D; EUR ; US Dollar &#x3D; USD Ã¢â‚¬Â¦ Default currency will be same as the wallet  (required)
     * @param eventName Event name that will be used as wallet name. For example, in a wedding list: Wedding of X and Y  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param jointUserId Wallet co-owner&#39;s id. This user will not be allowed to collect the money from the wallet.  (optional)
     * @param walletTag Custom data (optional)
     * @param eventAlias Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding. Please note that the eventAlias must be unique.  (optional)
     * @param eventDate Wallet event date. Format : YYYY-MM-DD. Default: Created date + 7 days.  (optional)
     * @param eventMessage It can be a description of the wallet. (optional)
     * @param eventPayinStartDate  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD. If null, the default date will be the created date of the wallet. (optional)
     * @param eventPayinEndDate Deadline to money deposit on the wallet. Format : YYYY-MM-DD. If null, the money can be deposited indefinitely on the wallet  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postWallets(Integer walletTypeId, Integer tariffId, Integer userId, String currency, String eventName, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer jointUserId, String walletTag, String eventAlias, LocalDate eventDate, String eventMessage, LocalDate eventPayinStartDate, LocalDate eventPayinEndDate, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'walletTypeId' is set
        if (walletTypeId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletTypeId' when calling postWallets"));
            return;
        }
        
        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'tariffId' when calling postWallets"));
            return;
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling postWallets"));
            return;
        }
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currency' when calling postWallets"));
            return;
        }
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'eventName' when calling postWallets"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/wallets";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIP", accessUserIP));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletTypeId", walletTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tariffId", tariffId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "jointUserId", jointUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletTag", walletTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventName", eventName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventAlias", eventAlias));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventDate", eventDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventMessage", eventMessage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventPayinStartDate", eventPayinStartDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventPayinEndDate", eventPayinEndDate));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20028> localVarReturnType = new TypeReference<TreezorInlineResponse20028>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update a wallet
     * Modifiy wallet information
     * @param id Object internal id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param walletTypeId Change wallet type id (optional)
     * @param eventName Change event name (optional)
     * @param eventAlias Change event alias. Please note that the eventAlias must be unique. (optional)
     * @param eventDate Change event date (optional)
     * @param eventMessage Change event message (optional)
     * @param eventPayinStartDate Change event payin starting date (optional)
     * @param eventPayinEndDate Change event payin end date (optional)
     * @param urlImage Change URL image (optional)
     * @param imageName Change image name (optional)
     * @param tariffId Change tariff id (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putWallet(Long id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String walletTypeId, String eventName, String eventAlias, String eventDate, String eventMessage, String eventPayinStartDate, String eventPayinEndDate, String urlImage, String imageName, String tariffId, Handler<AsyncResult<TreezorInlineResponse20028>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling putWallet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/wallets/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletTypeId", walletTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventName", eventName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventAlias", eventAlias));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventDate", eventDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventMessage", eventMessage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventPayinStartDate", eventPayinStartDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventPayinEndDate", eventPayinEndDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "urlImage", urlImage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "imageName", imageName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tariffId", tariffId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20028> localVarReturnType = new TypeReference<TreezorInlineResponse20028>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
