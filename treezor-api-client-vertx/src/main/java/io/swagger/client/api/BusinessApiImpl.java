package io.swagger.client.api;

import io.swagger.client.model.TreezorError;
import io.swagger.client.model.TreezorInlineResponse2003;
import io.swagger.client.model.TreezorInlineResponse2004;

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


public class BusinessApiImpl implements BusinessApi {

    private ApiClient apiClient;

    public BusinessApiImpl() {
        this(null);
    }

    public BusinessApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get business information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param externalId External unique business id. As given in businesssearch reponse. (optional)
     * @param registrationNumber Unique business registration number. (optional)
     * @param vatNumber Unique business VAT number. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void businessinformationsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String externalId, String registrationNumber, String vatNumber, Handler<AsyncResult<TreezorInlineResponse2004>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'country' is set
        if (country == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'country' when calling businessinformationsGet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/businessinformations";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalId", externalId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "registrationNumber", registrationNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vatNumber", vatNumber));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2004> localVarReturnType = new TypeReference<TreezorInlineResponse2004>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search businesses
     * The search endpoint returns some business information. 
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param nameExact Business exact name. Exclusive with nameMatchBeginning and nameClosestKeywords.  (optional)
     * @param nameMatchBeginning Business names begin with. Exclusive with nameExact and nameClosestKeywords.  (optional)
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with nameExact and nameMatchBeginning.  (optional)
     * @param registrationNumber Business registration number. (optional)
     * @param vatNumber Business VAT number. (optional)
     * @param phoneNumber Business phone number. (optional)
     * @param addressStreet Business&#39; street address. (optional)
     * @param addressCity Business&#39; city address. (optional)
     * @param addressPostalCode Business&#39; postal code address. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void businesssearchsGet(String country, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode, Handler<AsyncResult<List<TreezorInlineResponse2003>>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'country' is set
        if (country == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'country' when calling businesssearchsGet"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/businesssearchs";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nameExact", nameExact));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nameMatchBeginning", nameMatchBeginning));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nameClosestKeywords", nameClosestKeywords));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "registrationNumber", registrationNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vatNumber", vatNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phoneNumber", phoneNumber));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "addressStreet", addressStreet));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "addressCity", addressCity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "addressPostalCode", addressPostalCode));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<List<TreezorInlineResponse2003>> localVarReturnType = new TypeReference<List<TreezorInlineResponse2003>>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
