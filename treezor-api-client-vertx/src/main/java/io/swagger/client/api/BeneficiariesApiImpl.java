package io.swagger.client.api;

import io.swagger.client.model.TreezorBody;
import io.swagger.client.model.TreezorBody1;
import io.swagger.client.model.TreezorInlineResponse2002;
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


public class BeneficiariesApiImpl implements BeneficiariesApi {

    private ApiClient apiClient;

    public BeneficiariesApiImpl() {
        this(null);
    }

    public BeneficiariesApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * search beneficiary bank accounts
     * Get beneficiary bank accounts that match search criteria.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param filter You can filter the API response by using filter(s). Filterable fields are :  - id  - tag  - userId  - isActive  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  (optional)
     * @param id Beneficiary bank account id. (optional)
     * @param userId Owner user&#39;s id. (deprecated, you must use the parameter filter) (optional)
     * @param iban Beneficiary bank account IBAN. (deprecated, you must use the parameter filter) (optional)
     * @param bic Beneficiary bank account BIC. (deprecated, you must use the parameter filter) (optional)
     * @param nickName Beneficiary bank account&#39;s nick name. (deprecated, you must use the parameter filter) (optional)
     * @param name Beneficiary bank account owner&#39;s name. (deprecated, you must use the parameter filter) (optional)
     * @param pageNumber Pagination page number. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param pageCount The number of items per page. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortBy The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param sortOrder The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getBeneficiaries(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, List<String> fields, String filter, Integer id, Integer userId, String iban, String bic, String nickName, String name, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/beneficiaries";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "iban", iban));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bic", bic));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickName", nickName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
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
        TypeReference<TreezorInlineResponse2002> localVarReturnType = new TypeReference<TreezorInlineResponse2002>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a beneficiary bank account
     * Get a beneficiary bank account from the system.
     * @param id Beneficiary Bank Accounts internal id. (required)
     * @param fields List of the object&#39;s properties you want to pick up. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getBeneficiary(Long id, List<String> fields, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getBeneficiary"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/beneficiaries/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse2002> localVarReturnType = new TypeReference<TreezorInlineResponse2002>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * create a beneficiary
     * Create a new benefeciary bank account in the system.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void postBeneficiary(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody body, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        Object localVarBody = body;
        
        // create path and map variables
        String localVarPath = "/beneficiaries";

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
        TypeReference<TreezorInlineResponse2002> localVarReturnType = new TypeReference<TreezorInlineResponse2002>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * edit a beneficiary
     * Edit a benefeciary bank account in the system.
     * @param id Beneficiary&#39;s id. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param body  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void putBeneficiary(Integer id, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, TreezorBody1 body, Handler<AsyncResult<TreezorInlineResponse2002>> resultHandler) {
        Object localVarBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling putBeneficiary"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/beneficiaries/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse2002> localVarReturnType = new TypeReference<TreezorInlineResponse2002>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
