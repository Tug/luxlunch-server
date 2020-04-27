package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.TreezorInlineResponse20012;
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


public class DocumentApiImpl implements DocumentApi {

    private ApiClient apiClient;

    public DocumentApiImpl() {
        this(null);
    }

    public DocumentApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * create a document
     * Search for documents.
     * @param userId Document user&#39;s id. (required)
     * @param documentTypeId Type of document.  | documentTypeId | Description | | --- | --- | | 2 | Police record | | 4 | Company Registration | | 6 | CV | | 7 | Sworn statement | | 8 | Turnover | | 9 | Identity card | | 11 | Bank Identity Statement | | 12 | Proof of address| | 13 | Mobile phone invoice| | 14 | Invoice, other than Mobile phone invoice| | 15 | A residence permit| | 16 | A driving licence| | 17 | A passport| | 18 | A proxy granting an employee| | 19 | A company registration official paper| | 20 | Official tax certificate| | 21 | Employee payment notice| | 22 | User bank statement| | 23 | Business legal status| | 24 | Tax Statement| | 25 | Exemption Statement|  (required)
     * @param name Document&#39;s name. (required)
     * @param fileContentBase64 Document file content. base64 encoded. (required)
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param documentTag Custom data. (optional)
     * @param residenceId Document residence Id. The field is mandatory when the document is of type id 24 or 25. Otherwise it should not be provided. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void createDocuments(String userId, Integer documentTypeId, String name, byte[] fileContentBase64, String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentTag, Long residenceId, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'userId' when calling createDocuments"));
            return;
        }
        
        // verify the required parameter 'documentTypeId' is set
        if (documentTypeId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'documentTypeId' when calling createDocuments"));
            return;
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'name' when calling createDocuments"));
            return;
        }
        
        // verify the required parameter 'fileContentBase64' is set
        if (fileContentBase64 == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'fileContentBase64' when calling createDocuments"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/documents";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentTag", documentTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "residenceId", residenceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentTypeId", documentTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileContentBase64", fileContentBase64));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] { "api_key" };
        TypeReference<TreezorInlineResponse20012> localVarReturnType = new TypeReference<TreezorInlineResponse20012>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * delete document
     * Remove a document from the system.
     * @param id Document&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling deleteDocument"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/documents/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20012> localVarReturnType = new TypeReference<TreezorInlineResponse20012>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * get a document
     * get a document
     * @param id Document&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling getDocument"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/documents/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20012> localVarReturnType = new TypeReference<TreezorInlineResponse20012>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * search documents
     * Search for documents.
     * @param accessSignature Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  (optional)
     * @param accessTag Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserId Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param accessUserIp Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  (optional)
     * @param documentId Document&#39;s unique id. (optional)
     * @param documentTag Custom data. (optional)
     * @param documentStatus The status of the document. Possible values: * PENDING * CANCELED * VALIDATED  (optional)
     * @param documentTypeId Document type id. (optional)
     * @param documentType Document&#39;s type. (optional)
     * @param userId Document user&#39;s id. (optional)
     * @param userName Document user&#39;s name. (optional)
     * @param userEmail Document user&#39;s email. (optional)
     * @param fileName Document&#39;s name. (optional)
     * @param fileSize Document&#39;s size. (optional)
     * @param fileType Document&#39;s type. (optional)
     * @param isAgent is agent field. (optional)
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
    public void getDocuments(String accessSignature, String accessTag, Integer accessUserId, String accessUserIp, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userName, String userEmail, String fileName, Integer fileSize, Integer fileType, String isAgent, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/documents";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessSignature", accessSignature));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessTag", accessTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserId", accessUserId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessUserIp", accessUserIp));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentId", documentId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentTag", documentTag));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentStatus", documentStatus));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentTypeId", documentTypeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentType", documentType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userEmail", userEmail));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileSize", fileSize));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileType", fileType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAgent", isAgent));
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
        TypeReference<TreezorInlineResponse20012> localVarReturnType = new TypeReference<TreezorInlineResponse20012>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * update a document
     * Update a document.
     * @param id Document&#39;s internal id. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void putDocument(Long id, Handler<AsyncResult<TreezorInlineResponse20012>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'id' when calling putDocument"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/documents/{id}".replaceAll("\\{" + "id" + "\\}", id.toString());

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
        TypeReference<TreezorInlineResponse20012> localVarReturnType = new TypeReference<TreezorInlineResponse20012>() {};
        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
