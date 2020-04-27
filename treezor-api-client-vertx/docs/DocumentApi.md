# DocumentApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocuments**](DocumentApi.md#createDocuments) | **POST** /documents | create a document
[**deleteDocument**](DocumentApi.md#deleteDocument) | **DELETE** /documents/{id} | delete document
[**getDocument**](DocumentApi.md#getDocument) | **GET** /documents/{id} | get a document
[**getDocuments**](DocumentApi.md#getDocuments) | **GET** /documents | search documents
[**putDocument**](DocumentApi.md#putDocument) | **PUT** /documents/{id} | update a document


<a name="createDocuments"></a>
# **createDocuments**
> TreezorInlineResponse20012 createDocuments(userId, documentTypeId, name, fileContentBase64, accessSignature, accessTag, accessUserId, accessUserIp, documentTag, residenceId)

create a document

Search for documents.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
String userId = "userId_example"; // String | Document user's id.
Integer documentTypeId = 56; // Integer | Type of document.  | documentTypeId | Description | | --- | --- | | 2 | Police record | | 4 | Company Registration | | 6 | CV | | 7 | Sworn statement | | 8 | Turnover | | 9 | Identity card | | 11 | Bank Identity Statement | | 12 | Proof of address| | 13 | Mobile phone invoice| | 14 | Invoice, other than Mobile phone invoice| | 15 | A residence permit| | 16 | A driving licence| | 17 | A passport| | 18 | A proxy granting an employee| | 19 | A company registration official paper| | 20 | Official tax certificate| | 21 | Employee payment notice| | 22 | User bank statement| | 23 | Business legal status| | 24 | Tax Statement| | 25 | Exemption Statement| 
String name = "name_example"; // String | Document's name.
byte[] fileContentBase64 = B; // byte[] | Document file content. base64 encoded.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer documentTag = 56; // Integer | Custom data.
Long residenceId = 789L; // Long | Document residence Id. The field is mandatory when the document is of type id 24 or 25. Otherwise it should not be provided.
try {
    TreezorInlineResponse20012 result = apiInstance.createDocuments(userId, documentTypeId, name, fileContentBase64, accessSignature, accessTag, accessUserId, accessUserIp, documentTag, residenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#createDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Document user&#39;s id. |
 **documentTypeId** | **Integer**| Type of document.  | documentTypeId | Description | | --- | --- | | 2 | Police record | | 4 | Company Registration | | 6 | CV | | 7 | Sworn statement | | 8 | Turnover | | 9 | Identity card | | 11 | Bank Identity Statement | | 12 | Proof of address| | 13 | Mobile phone invoice| | 14 | Invoice, other than Mobile phone invoice| | 15 | A residence permit| | 16 | A driving licence| | 17 | A passport| | 18 | A proxy granting an employee| | 19 | A company registration official paper| | 20 | Official tax certificate| | 21 | Employee payment notice| | 22 | User bank statement| | 23 | Business legal status| | 24 | Tax Statement| | 25 | Exemption Statement|  |
 **name** | **String**| Document&#39;s name. |
 **fileContentBase64** | **byte[]**| Document file content. base64 encoded. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **documentTag** | **Integer**| Custom data. | [optional]
 **residenceId** | **Long**| Document residence Id. The field is mandatory when the document is of type id 24 or 25. Otherwise it should not be provided. | [optional]

### Return type

[**TreezorInlineResponse20012**](TreezorInlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> TreezorInlineResponse20012 deleteDocument(id)

delete document

Remove a document from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Long id = 789L; // Long | Document's internal id.
try {
    TreezorInlineResponse20012 result = apiInstance.deleteDocument(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Document&#39;s internal id. |

### Return type

[**TreezorInlineResponse20012**](TreezorInlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> TreezorInlineResponse20012 getDocument(id)

get a document

get a document

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Long id = 789L; // Long | Document's internal id.
try {
    TreezorInlineResponse20012 result = apiInstance.getDocument(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Document&#39;s internal id. |

### Return type

[**TreezorInlineResponse20012**](TreezorInlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> TreezorInlineResponse20012 getDocuments(accessSignature, accessTag, accessUserId, accessUserIp, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userName, userEmail, fileName, fileSize, fileType, isAgent, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search documents

Search for documents.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer documentId = 56; // Integer | Document's unique id.
String documentTag = "documentTag_example"; // String | Custom data.
String documentStatus = "documentStatus_example"; // String | The status of the document. Possible values: * PENDING * CANCELED * VALIDATED 
Integer documentTypeId = 56; // Integer | Document type id.
String documentType = "documentType_example"; // String | Document's type.
Integer userId = 56; // Integer | Document user's id.
String userName = "userName_example"; // String | Document user's name.
String userEmail = "userEmail_example"; // String | Document user's email.
String fileName = "fileName_example"; // String | Document's name.
Integer fileSize = 56; // Integer | Document's size.
Integer fileType = 56; // Integer | Document's type.
String isAgent = "isAgent_example"; // String | is agent field.
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    TreezorInlineResponse20012 result = apiInstance.getDocuments(accessSignature, accessTag, accessUserId, accessUserIp, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userName, userEmail, fileName, fileSize, fileType, isAgent, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **documentId** | **Integer**| Document&#39;s unique id. | [optional]
 **documentTag** | **String**| Custom data. | [optional]
 **documentStatus** | **String**| The status of the document. Possible values: * PENDING * CANCELED * VALIDATED  | [optional] [enum: PENDING, CANCELED, VALIDATED]
 **documentTypeId** | **Integer**| Document type id. | [optional]
 **documentType** | **String**| Document&#39;s type. | [optional]
 **userId** | **Integer**| Document user&#39;s id. | [optional]
 **userName** | **String**| Document user&#39;s name. | [optional]
 **userEmail** | **String**| Document user&#39;s email. | [optional]
 **fileName** | **String**| Document&#39;s name. | [optional]
 **fileSize** | **Integer**| Document&#39;s size. | [optional]
 **fileType** | **Integer**| Document&#39;s type. | [optional]
 **isAgent** | **String**| is agent field. | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**TreezorInlineResponse20012**](TreezorInlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDocument"></a>
# **putDocument**
> TreezorInlineResponse20012 putDocument(id)

update a document

Update a document.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DocumentApi apiInstance = new DocumentApi();
Long id = 789L; // Long | Document's internal id.
try {
    TreezorInlineResponse20012 result = apiInstance.putDocument(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentApi#putDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Document&#39;s internal id. |

### Return type

[**TreezorInlineResponse20012**](TreezorInlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

