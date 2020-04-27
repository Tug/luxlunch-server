package io.swagger.client.api;

import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20027;
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


public class VirtualibansApiImpl implements VirtualibansApi {

    private ApiClient apiClient;

    public VirtualibansApiImpl() {
        this(null);
    }

    public VirtualibansApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get a virtualiban by Id
     * Get a virtualiban from the system by its id.
     * @param id VirtualIban&#39;s id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getvirtualiban(Long id, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getvirtualiban"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/virtualibans/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20027> localVarReturnType = new TypeReference<TreezorInlineResponse20027>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search virtualibans
     * Get virtualiban that match search criteria.
     * @param validFrom The beginning date of validity. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIP Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param virtualIbanId VirtualIban&#39;s id. (optional)
     * @param walletId VirtualIban&#39;s wallet id. (optional)
     * @param typeId VirtualIban&#39;s type id. (optional)
     * @param tag A tag generated by the client (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. (optional)
     * @param validTo The limit date of validity. (optional)
     * @param maxUsage The maximum number of usage authorized. (optional)
     * @param maxAmount The maximum amount authorized. (optional)
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
    public void getvirtualibans(LocalDate validFrom, String accessSignature, String accessTag, Integer accessUserId, Integer accessUserIP, Integer virtualIbanId, Integer walletId, Integer typeId, Integer tag, String reference, LocalDate validTo, String maxUsage, Float maxAmount, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'validFrom' is set
        if (validFrom == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'validFrom' when calling getvirtualibans"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/virtualibans";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIP", accessUserIP));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "virtualIbanId", virtualIbanId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeId", typeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reference", reference));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "validFrom", validFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "validTo", validTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxUsage", maxUsage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxAmount", maxAmount));
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
        TypeReference<TreezorInlineResponse20027> localVarReturnType = new TypeReference<TreezorInlineResponse20027>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a virtual IBAN
     * Create a new virtual IBAN in in the system.
     * @param walletId The Id Of the Wallet. The Wallet must be in validated status. The wallet must be of type \&quot;payment\&quot; or \&quot;electronic money\&quot; (required)
     * @param typeId | Type Id | Virtual IBAN Type| | ---| --- | | 1 | DEBIT | | 2 | CREDIT |  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param tag A tag generated by the client (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. Less than 255 characters. (optional)
     * @param validFrom The beginning date of validity. The beginning date must not be less than today&#39;s date. (optional)
     * @param validTo The limit date of validity. Cannot be less or equal to the validFrom date. (optional)
     * @param maxUsage The maximum number of usage authorized. If you want to set no maximum usage limitation you can omit the parameter or set it to null. If you want to limit usage please send an integer in that field. This integer cannot be less than 1. (optional)
     * @param maxAmount The maximum amount authorized.If you want to set no maximum usage amount limitation you can omit the parameter or set it to null. If you want to limit the amount please send a DECIMAL (with a point as separator) in that field. This decimal cannot be less than 0.00. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postVirtualIban(Integer walletId, Integer typeId, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer tag, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'walletId' when calling postVirtualIban"));
            return;
        }
        
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'typeId' when calling postVirtualIban"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/virtualibans";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletId", walletId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeId", typeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reference", reference));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "validFrom", validFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "validTo", validTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxUsage", maxUsage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxAmount", maxAmount));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20027> localVarReturnType = new TypeReference<TreezorInlineResponse20027>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update a Virtual IBAN
     * Update Virtual IBAN&#39;s information.
     * @param id VirtualIban&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param reference The client&#39;s internal reference of the vitual IBAN. (optional)
     * @param validFrom The beginning date of validity. Date of validity can be changed. It must follow the rules explained in the POST endpoint. (optional)
     * @param validTo The limit date of validity. It must follow the rules of creation. It must follow the rules explained in the POST endpoint. (optional)
     * @param maxUsage The maximum number of usage authorized. It must follow the rules explained in the POST endpoint AND the maximum usage cannot be strictly less than the transaction counter of the Virtual Iban. (optional)
     * @param maxAmount The maximum amount authorized. It must follow the rules explained in the POST endpoint AND the maximum amount cannot be strictly less than the cumulated amount of this Virtual Iban. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putVirtualIban(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String reference, LocalDate validFrom, LocalDate validTo, Integer maxUsage, Float maxAmount, Handler<AsyncResult<TreezorInlineResponse20027>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling putVirtualIban"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/virtualibans/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reference", reference));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "validFrom", validFrom));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "validTo", validTo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxUsage", maxUsage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxAmount", maxAmount));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20027> localVarReturnType = new TypeReference<TreezorInlineResponse20027>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}