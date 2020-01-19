# MerchantIdRestrictionGroupsApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMerchantIdRestrictionGroups**](MerchantIdRestrictionGroupsApi.md#deleteMerchantIdRestrictionGroups) | **DELETE** /merchantIdRestrictionGroups/{id} | cancel a merchant id restriction group
[**getMerchantIdRestrictionGroup**](MerchantIdRestrictionGroupsApi.md#getMerchantIdRestrictionGroup) | **GET** /merchantIdRestrictionGroups | search merchant id restriction  groups
[**getMerchantIdRestrictionGroupsId**](MerchantIdRestrictionGroupsApi.md#getMerchantIdRestrictionGroupsId) | **GET** /merchantIdRestrictionGroups/{id} | get a merchant ID restriction group
[**merchantIdRestrictionGroupsIdDeltaUpdatePut**](MerchantIdRestrictionGroupsApi.md#merchantIdRestrictionGroupsIdDeltaUpdatePut) | **PUT** /merchantIdRestrictionGroups/{id}/DeltaUpdate/ | edit the merchant ID list for a restriction group
[**postMerchantIdRestrictionGroup**](MerchantIdRestrictionGroupsApi.md#postMerchantIdRestrictionGroup) | **POST** /merchantIdRestrictionGroups | create a merchantIdRestrictionGroup
[**putMerchantIdRestrictionGroups**](MerchantIdRestrictionGroupsApi.md#putMerchantIdRestrictionGroups) | **PUT** /merchantIdRestrictionGroups/{id} | edit a merchant id restriction group (Deprecated)


<a name="deleteMerchantIdRestrictionGroups"></a>
# **deleteMerchantIdRestrictionGroups**
> InlineResponse20016 deleteMerchantIdRestrictionGroups(id, fields)

cancel a merchant id restriction group

Cancel a merchant id restriction group from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MerchantIdRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi();
Long id = 789L; // Long | Merchant ID restriction Group internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    InlineResponse20016 result = apiInstance.deleteMerchantIdRestrictionGroups(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#deleteMerchantIdRestrictionGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Merchant ID restriction Group internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMerchantIdRestrictionGroup"></a>
# **getMerchantIdRestrictionGroup**
> InlineResponse20016 getMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

search merchant id restriction  groups

Get merchant ID restriction groups that match search criteria.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MerchantIdRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filterable fields are :   - id   - name   - isWhitelist   - status   - startDate   - createdDate    Filters should be separated by a \";\". Example for 3 filters : FILTER1;FILTER2;FILTER3.    A single filter has the following syntax : \"fieldName criterion expression\".    Where :     - fieldName : the name of a filterable field of this object.      - expression : the values to be included or excluded (see the table below for more information)      - criterion : a filter criterion.    Here are the possible values for criterion :    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     >    |      greater than      |            alphanumeric string           |         100        |   |    >=    | greater or equal than  |            alphanumeric string           |         100        |   |     <    |        less than       |            alphanumeric string           |         100        |   |    <=    |   less or equal than   |            alphanumeric string           |         100        |   |    !=    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    ==    |         equals         |            alphanumeric string           |         100        | 
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
try {
    InlineResponse20016 result = apiInstance.getMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#getMerchantIdRestrictionGroup");
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
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]
 **filter** | **String**| You can filter the API response by using filter(s). Filterable fields are :   - id   - name   - isWhitelist   - status   - startDate   - createdDate    Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3.    A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.    Where :     - fieldName : the name of a filterable field of this object.      - expression : the values to be included or excluded (see the table below for more information)      - criterion : a filter criterion.    Here are the possible values for criterion :    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMerchantIdRestrictionGroupsId"></a>
# **getMerchantIdRestrictionGroupsId**
> InlineResponse20016 getMerchantIdRestrictionGroupsId(id, fields)

get a merchant ID restriction group

Get a merchant ID restriction group from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MerchantIdRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi();
Long id = 789L; // Long | Merchant ID restriction Group internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    InlineResponse20016 result = apiInstance.getMerchantIdRestrictionGroupsId(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#getMerchantIdRestrictionGroupsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Merchant ID restriction Group internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantIdRestrictionGroupsIdDeltaUpdatePut"></a>
# **merchantIdRestrictionGroupsIdDeltaUpdatePut**
> InlineResponse20016 merchantIdRestrictionGroupsIdDeltaUpdatePut(id, accessSignature, accessTag, accessUserId, accessUserIp, body)

edit the merchant ID list for a restriction group

Edit the merchant ID list for a restriction group in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MerchantIdRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi();
Integer id = 56; // Integer | Merchant ID restriction group's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Body11 body = new Body11(); // Body11 | 
try {
    InlineResponse20016 result = apiInstance.merchantIdRestrictionGroupsIdDeltaUpdatePut(id, accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#merchantIdRestrictionGroupsIdDeltaUpdatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Merchant ID restriction group&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **body** | [**Body11**](Body11.md)|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMerchantIdRestrictionGroup"></a>
# **postMerchantIdRestrictionGroup**
> InlineResponse20016 postMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, body)

create a merchantIdRestrictionGroup

Create a new merchant ID restriction group in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MerchantIdRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Body9 body = new Body9(); // Body9 | 
try {
    InlineResponse20016 result = apiInstance.postMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#postMerchantIdRestrictionGroup");
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
 **body** | [**Body9**](Body9.md)|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMerchantIdRestrictionGroups"></a>
# **putMerchantIdRestrictionGroups**
> InlineResponse20016 putMerchantIdRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body)

edit a merchant id restriction group (Deprecated)

Edit a merchant id restriction group in the system. (Deprecated. Use PUT /merchantIdRestrictionGroups/{id}/DeltaUpdate/)

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MerchantIdRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi();
Integer id = 56; // Integer | Merchant ID restriction group's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Body10 body = new Body10(); // Body10 | 
try {
    InlineResponse20016 result = apiInstance.putMerchantIdRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMerchantIdRestrictionGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Merchant ID restriction group&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **body** | [**Body10**](Body10.md)|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

