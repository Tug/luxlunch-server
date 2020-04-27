package io.swagger.client.api;

import io.swagger.client.model.TreezorInlineResponse20021;
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


public class TaxResidenceApiImpl implements TaxResidenceApi {

    private ApiClient apiClient;

    public TaxResidenceApiImpl() {
        this(null);
    }

    public TaxResidenceApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * search a residence
     * Search a residence that match search criteria
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param id id of the residence (optional)
     * @param userId User&#39;s id residence (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesGet(String accessSignature, Integer id, Integer userId, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/taxResidences";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20021> localVarReturnType = new TypeReference<TreezorInlineResponse20021>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * delete a residence
     * Delete a residence that match id
     * @param id id of the residence (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesIdDelete(Integer id, String accessSignature, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling taxResidencesIdDelete"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/taxResidences/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20021> localVarReturnType = new TypeReference<TreezorInlineResponse20021>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * read the informations of a residence
     * Read the informations of a residence that match with id
     * @param id id of the residence (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesIdGet(Integer id, String accessSignature, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling taxResidencesIdGet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/taxResidences/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20021> localVarReturnType = new TypeReference<TreezorInlineResponse20021>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update the residence
     * Update a residence already created.
     * @param id residence id (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param userId User&#39;s id residence (optional)
     * @param country country of the resident (optional)
     * @param taxPayerId Tax payer&#39;s id (optional)
     * @param liabilityWaiver Tax declaration (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesIdPut(Integer id, String accessSignature, Integer userId, String country, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling taxResidencesIdPut"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/taxResidences/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxPayerId", taxPayerId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "liabilityWaiver", liabilityWaiver));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20021> localVarReturnType = new TypeReference<TreezorInlineResponse20021>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a residence
     * Create a new tax residence.
     * @param userId User&#39;s id residence (required)
     * @param country country of the resident (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). (optional)
     * @param taxPayerId Tax payer&#39;s id (optional)
     * @param liabilityWaiver When there is no taxPayerId for a residence, this field shall be set to true. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void taxResidencesPost(Integer userId, String country, String accessSignature, String taxPayerId, Boolean liabilityWaiver, Handler<AsyncResult<TreezorInlineResponse20021>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling taxResidencesPost"));
            return;
        }
        
        // verify the required parameter 'country' is set
        if (country == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'country' when calling taxResidencesPost"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/taxResidences";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxPayerId", taxPayerId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "liabilityWaiver", liabilityWaiver));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20021> localVarReturnType = new TypeReference<TreezorInlineResponse20021>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
