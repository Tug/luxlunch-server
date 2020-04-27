package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse2005;
import io.swagger.client.model.TreezorInlineResponse2006;
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


public class CardApiImpl implements CardApi {

    private ApiClient apiClient;

    public CardApiImpl() {
        this(null);
    }

    public CardApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get a card image
     * Return virtual card&#39;s image
     * @param cardId Vitual card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardimagesGet(Integer cardId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2006>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cardId' when calling cardimagesGet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cardimages";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardId", cardId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2006> localVarReturnType = new TypeReference<TreezorInlineResponse2006>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a virtual card
     * Create a new virtual card. To use a card you will need to activate it (/cards/{id}/Activate/).
     * @param userId User&#39;s id of cardholder (required)
     * @param walletId Wallet&#39;s Id in which to create the card (required)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (required)
     * @param cardPrint Card appareance code, also used to choose the program ID of the card (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param cardTag Custom field (optional)
     * @param batchDeliveryId Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL (optional)
     * @param limitAtmYear ATM operations limit for a sliding year. No default value. (optional)
     * @param limitAtmMonth ATM operations limit for a sliding month. No default value. (optional)
     * @param limitAtmWeek ATM operations limit for a sliding week. Default value 2000â‚¬. (optional)
     * @param limitAtmDay ATM operations limit for a single day. Default value 1000â‚¬. (optional)
     * @param limitAtmAll ATM operations limit from beginning. No default value. (optional)
     * @param limitPaymentYear POS operations limit for a sliding year. No default value. (optional)
     * @param limitPaymentMonth POS operations limit for a sliding month. No default value. (optional)
     * @param limitPaymentWeek POS operations limit for a sliding week. Default value 3000â‚¬. (optional)
     * @param limitPaymentDay POS operations limit for a single day. Default value 2000â‚¬. (optional)
     * @param limitPaymentAll POS operations limit from beginning. No default value. (optional)
     * @param paymentDailyLimit POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. (optional)
     * @param pin Card&#39;s PIN code value. (optional)
     * @param anonymous Card is anonymous. If value is 1 there will be no embossed name. (optional)
     * @param sendToParent If you put the value 1 the delivery address will be the parent user&#39;s. (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId you want to apply (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId you want to apply (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId you want to apply (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsCreateVirtualPost(Integer userId, Integer walletId, String permsGroup, String cardPrint, String accessSignature, String cardTag, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling cardsCreateVirtualPost"));
            return;
        }
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletId' when calling cardsCreateVirtualPost"));
            return;
        }
        
        // verify the required parameter 'permsGroup' is set
        if (permsGroup == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'permsGroup' when calling cardsCreateVirtualPost"));
            return;
        }
        
        // verify the required parameter 'cardPrint' is set
        if (cardPrint == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cardPrint' when calling cardsCreateVirtualPost"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/CreateVirtual";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "permsGroup", permsGroup));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardTag", cardTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "batchDeliveryId", batchDeliveryId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmYear", limitAtmYear));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmMonth", limitAtmMonth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmWeek", limitAtmWeek));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmDay", limitAtmDay));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmAll", limitAtmAll));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentYear", limitPaymentYear));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentMonth", limitPaymentMonth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentWeek", limitPaymentWeek));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentDay", limitPaymentDay));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentAll", limitPaymentAll));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentDailyLimit", paymentDailyLimit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pin", pin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardPrint", cardPrint));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "anonymous", anonymous));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sendToParent", sendToParent));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mccRestrictionGroupId", mccRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchantRestrictionGroupId", merchantRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryRestrictionGroupId", countryRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search cards
     * 
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param cardId Card&#39;s id (optional)
     * @param userId User&#39;s id of cardholder (optional)
     * @param embossedName Embossed name of the card (optional)
     * @param publicToken Public token of the card (optional)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (optional)
     * @param isPhysical | Value | Type | | --- | --- | | 1 | Physical card| | 0 | Virtual card |  (optional)
     * @param isConverted | Value | Type | | --- | --- | | 1 | Physical card converted in a virtual card| | 0 | Not converted |  (optional)
     * @param lockStatus | Value | Type | | --- | --- | | 1 | Card blocked | | 0 | Card Unblocked | | 2 | Lost card | | 3 | Stolen card |  (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId of the card (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId of the card (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId of the card (optional)
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
    public void cardsGet(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer cardId, Integer userId, String embossedName, String publicToken, String permsGroup, Integer isPhysical, Integer isConverted, Integer lockStatus, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/cards";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardId", cardId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "embossedName", embossedName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "publicToken", publicToken));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "permsGroup", permsGroup));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isPhysical", isPhysical));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isConverted", isConverted));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lockStatus", lockStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mccRestrictionGroupId", mccRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchantRestrictionGroupId", merchantRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryRestrictionGroupId", countryRestrictionGroupId));
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
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * activate a card
     * The Activate endpoint change card status to activate. An activated card can be freely used. 
     * @param id Card&#39;s id. (required)
     * @param accessToken Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdActivatePut(Integer id, String accessToken, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdActivatePut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/Activate/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessToken", accessToken));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * change card&#39;s PIN
     * Change card&#39;s PIN code knowing the current one.
     * @param id Card&#39;s id. (required)
     * @param currentPIN Card&#39;s current PIN (required)
     * @param newPIN Card&#39;s new PIN (required)
     * @param confirmPIN Card&#39;s new PIN confirmation value (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdChangePINPut(Integer id, String currentPIN, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdChangePINPut"));
            return;
        }
        
        // verify the required parameter 'currentPIN' is set
        if (currentPIN == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'currentPIN' when calling cardsIdChangePINPut"));
            return;
        }
        
        // verify the required parameter 'newPIN' is set
        if (newPIN == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'newPIN' when calling cardsIdChangePINPut"));
            return;
        }
        
        // verify the required parameter 'confirmPIN' is set
        if (confirmPIN == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'confirmPIN' when calling cardsIdChangePINPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/ChangePIN/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentPIN", currentPIN));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "newPIN", newPIN));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confirmPIN", confirmPIN));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * convert card to virtual
     * Convert a virtual card into a physical one. The converted card will be both virtual and physical. 
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdConvertVirtualPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdConvertVirtualPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/ConvertVirtual/".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a card
     * 
     * @param id Card&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdGet(Long id, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdGet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update card&#39;s limits
     * Update of the card limits.
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param limitAtmYear ATM year limit (optional)
     * @param limitAtmMonth ATM month limit (optional)
     * @param limitAtmWeek ATM week limit (optional)
     * @param limitAtmDay ATM day limit (optional)
     * @param limitAtmAll ATM from beginning limit (optional)
     * @param limitPaymentYear Payment year limit (optional)
     * @param limitPaymentMonth Payment month limit (optional)
     * @param limitPaymentWeek Payment week limit (optional)
     * @param limitPaymentDay Payment day limit (optional)
     * @param limitPaymentAll Payment from beginning limit (optional)
     * @param paymentDailyLimit Payment day limit including cents. The decimal delimiter must be \&quot;.\&quot; (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdLimitsPut(Integer id, String accessSignature, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdLimitsPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/Limits/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmYear", limitAtmYear));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmMonth", limitAtmMonth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmWeek", limitAtmWeek));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmDay", limitAtmDay));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmAll", limitAtmAll));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentYear", limitPaymentYear));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentMonth", limitPaymentMonth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentWeek", limitPaymentWeek));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentDay", limitPaymentDay));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentAll", limitPaymentAll));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentDailyLimit", paymentDailyLimit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update card&#39;s blocking status
     * Block or unblock a card.
     * @param id Card&#39;s id. (required)
     * @param lockStatus | Value | Type | | --- | --- | | 1 | Block the card| | 0 | Unblock the card | | 2 | Lost card | | 3 | Stolen card |  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdLockUnlockPut(Integer id, Integer lockStatus, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdLockUnlockPut"));
            return;
        }
        
        // verify the required parameter 'lockStatus' is set
        if (lockStatus == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'lockStatus' when calling cardsIdLockUnlockPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/LockUnlock/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lockStatus", lockStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update card&#39;s options
     * Allows to update card&#39;s permission group.
     * @param id Card&#39;s id. (required)
     * @param foreign Card usable abroad (required)
     * @param online Card usable on-line (required)
     * @param atm Card usable on ATM (withdrawals) (required)
     * @param nfc Card usable on contactless compatible POS machine machine\&quot; (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdOptionsPut(Integer id, Integer foreign, Integer online, Integer atm, Integer nfc, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdOptionsPut"));
            return;
        }
        
        // verify the required parameter 'foreign' is set
        if (foreign == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'foreign' when calling cardsIdOptionsPut"));
            return;
        }
        
        // verify the required parameter 'online' is set
        if (online == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'online' when calling cardsIdOptionsPut"));
            return;
        }
        
        // verify the required parameter 'atm' is set
        if (atm == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'atm' when calling cardsIdOptionsPut"));
            return;
        }
        
        // verify the required parameter 'nfc' is set
        if (nfc == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'nfc' when calling cardsIdOptionsPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/Options/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "foreign", foreign));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "online", online));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "atm", atm));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nfc", nfc));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update card informations
     * Actually update mccRestrictionGroupId and merchantRestrictionGroupId of a card
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param mccRestrictionGroupId card&#39;s mccRestrictionGroupId (optional)
     * @param merchantRestrictionGroupId card&#39;s merchantRestrictionGroupId (optional)
     * @param countryRestrictionGroupId card&#39;s countryRestrictionGroupId (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdPut(Integer id, String accessSignature, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mccRestrictionGroupId", mccRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchantRestrictionGroupId", merchantRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryRestrictionGroupId", countryRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * regenerate card
     * If card is Lost or Stolen (card&#39;s status), the card itself will get regenerated. Otherwise only the card image gets recreated. 
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdRegeneratePut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdRegeneratePut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/Regenerate/".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * set card&#39;s PIN
     * Overwrite card&#39;s PIN.
     * @param id Card&#39;s id. (required)
     * @param newPIN Card&#39;s new PIN. (required)
     * @param confirmPIN Card&#39;s new PIN confirmation value (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdSetPINPut(Integer id, String newPIN, String confirmPIN, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdSetPINPut"));
            return;
        }
        
        // verify the required parameter 'newPIN' is set
        if (newPIN == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'newPIN' when calling cardsIdSetPINPut"));
            return;
        }
        
        // verify the required parameter 'confirmPIN' is set
        if (confirmPIN == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'confirmPIN' when calling cardsIdSetPINPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/setPIN/".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "newPIN", newPIN));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confirmPIN", confirmPIN));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * unblock card&#39;s PIN
     * Unblock card&#39;s PIN code.
     * @param id Card&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsIdUnblockPINPut(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling cardsIdUnblockPINPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/{id}/UnblockPIN/".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Register 3D secure
     * Register a card to 3D secure service. The user&#39;s mobile number must begin by \&quot;+\&quot;, or \&quot;00\&quot;, and the country dialing code.
     * @param cardId Card&#39;s ID to register (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsRegister3DSPost(Integer cardId, String accessSignature, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cardId' when calling cardsRegister3DSPost"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/Register3DS";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardId", cardId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a physical card
     * Create a new physical card. To use a card you will need to activate it (/cards/{id}/Activate/).
     * @param userId User&#39;s id of cardholder (required)
     * @param walletId Wallet&#39;s Id in which to create the card (required)
     * @param permsGroup Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  (required)
     * @param cardTag Custom field (required)
     * @param cardPrint Card appearance code, also used to choose the program ID of the card (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param batchDeliveryId Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL (optional)
     * @param limitAtmYear ATM operations limit for a sliding year. No default value. (optional)
     * @param limitAtmMonth ATM operations limit for a sliding month. No default value. (optional)
     * @param limitAtmWeek ATM operations limit for a sliding week. Default value 2000â‚¬. (optional)
     * @param limitAtmDay ATM operations limit for a single day. Default value 1000â‚¬. (optional)
     * @param limitAtmAll ATM operations limit from beginning. No default value. (optional)
     * @param limitPaymentYear POS operations limit for a sliding year. No default value. (optional)
     * @param limitPaymentMonth POS operations limit for a sliding month. No default value. (optional)
     * @param limitPaymentWeek POS operations limit for a sliding week. Default value 3000â‚¬. (optional)
     * @param limitPaymentDay POS operations limit for a single day. Default value 2000â‚¬. (optional)
     * @param limitPaymentAll POS operations limit from beginning. No default value. (optional)
     * @param paymentDailyLimit POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. (optional)
     * @param pin Card&#39;s PIN code value. Default random PIN. (optional)
     * @param anonymous Card is anonymous. If value is 1 there will be no embossed name. (optional)
     * @param sendToParent If you put the value 1 the delivery address will be the parent user&#39;s. (optional)
     * @param mccRestrictionGroupId mccRestrictionGroupId you want to apply (optional)
     * @param merchantRestrictionGroupId merchantRestrictionGroupId you want to apply (optional)
     * @param countryRestrictionGroupId countryRestrictionGroupId you want to apply (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void cardsRequestPhysicalPost(Integer userId, Integer walletId, String permsGroup, String cardTag, String cardPrint, String accessSignature, Integer batchDeliveryId, Integer limitAtmYear, Integer limitAtmMonth, Integer limitAtmWeek, Integer limitAtmDay, Integer limitAtmAll, Integer limitPaymentYear, Integer limitPaymentMonth, Integer limitPaymentWeek, Integer limitPaymentDay, Integer limitPaymentAll, Float paymentDailyLimit, String pin, Integer anonymous, Integer sendToParent, Integer mccRestrictionGroupId, Integer merchantRestrictionGroupId, Integer countryRestrictionGroupId, String accessTag, Integer accessUserId, String accessUserIp, Handler<AsyncResult<TreezorInlineResponse2005>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling cardsRequestPhysicalPost"));
            return;
        }
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletId' when calling cardsRequestPhysicalPost"));
            return;
        }
        
        // verify the required parameter 'permsGroup' is set
        if (permsGroup == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'permsGroup' when calling cardsRequestPhysicalPost"));
            return;
        }
        
        // verify the required parameter 'cardTag' is set
        if (cardTag == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cardTag' when calling cardsRequestPhysicalPost"));
            return;
        }
        
        // verify the required parameter 'cardPrint' is set
        if (cardPrint == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'cardPrint' when calling cardsRequestPhysicalPost"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/cards/RequestPhysical";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "permsGroup", permsGroup));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardTag", cardTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "batchDeliveryId", batchDeliveryId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmYear", limitAtmYear));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmMonth", limitAtmMonth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmWeek", limitAtmWeek));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmDay", limitAtmDay));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAtmAll", limitAtmAll));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentYear", limitPaymentYear));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentMonth", limitPaymentMonth));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentWeek", limitPaymentWeek));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentDay", limitPaymentDay));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPaymentAll", limitPaymentAll));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentDailyLimit", paymentDailyLimit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pin", pin));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cardPrint", cardPrint));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "anonymous", anonymous));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sendToParent", sendToParent));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mccRestrictionGroupId", mccRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchantRestrictionGroupId", merchantRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryRestrictionGroupId", countryRestrictionGroupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2005> localVarReturnType = new TypeReference<TreezorInlineResponse2005>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
