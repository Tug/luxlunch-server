# MccRestrictionGroupsApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMccRestrictionGroups**](MccRestrictionGroupsApi.md#deleteMccRestrictionGroups) | **DELETE** /mccRestrictionGroups/{id} | cancel a mcc group
[**getMccRestrictionGroups**](MccRestrictionGroupsApi.md#getMccRestrictionGroups) | **GET** /mccRestrictionGroups | search mcc restriction groups
[**getMccRestrictionGroupsId**](MccRestrictionGroupsApi.md#getMccRestrictionGroupsId) | **GET** /mccRestrictionGroups/{id} | get a mcc group
[**postMccRestrictionGroup**](MccRestrictionGroupsApi.md#postMccRestrictionGroup) | **POST** /mccRestrictionGroups | create a mccRestrictionGroup
[**putMccRestrictionGroups**](MccRestrictionGroupsApi.md#putMccRestrictionGroups) | **PUT** /mccRestrictionGroups/{id} | edit a mcc restriction group


<a name="deleteMccRestrictionGroups"></a>
# **deleteMccRestrictionGroups**
> InlineResponse20015 deleteMccRestrictionGroups(id, fields)

cancel a mcc group

Cancel a mcc restriction group from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MccRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi();
Long id = 789L; // Long | MCC restriction Group internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    InlineResponse20015 result = apiInstance.deleteMccRestrictionGroups(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccRestrictionGroupsApi#deleteMccRestrictionGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| MCC restriction Group internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMccRestrictionGroups"></a>
# **getMccRestrictionGroups**
> InlineResponse20015 getMccRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

search mcc restriction groups

Get mcc restriction groups that match search criteria.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MccRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi();
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
    InlineResponse20015 result = apiInstance.getMccRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccRestrictionGroupsApi#getMccRestrictionGroups");
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

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMccRestrictionGroupsId"></a>
# **getMccRestrictionGroupsId**
> InlineResponse20015 getMccRestrictionGroupsId(id, fields)

get a mcc group

Get a mcc group from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MccRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi();
Long id = 789L; // Long | MCC restriction Group internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    InlineResponse20015 result = apiInstance.getMccRestrictionGroupsId(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccRestrictionGroupsApi#getMccRestrictionGroupsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| MCC restriction Group internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMccRestrictionGroup"></a>
# **postMccRestrictionGroup**
> InlineResponse20015 postMccRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body)

create a mccRestrictionGroup

Create a new mcc restriction group in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MccRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
Body7 body = new Body7(); // Body7 | 
try {
    InlineResponse20015 result = apiInstance.postMccRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccRestrictionGroupsApi#postMccRestrictionGroup");
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
 **body** | [**Body7**](Body7.md)|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMccRestrictionGroups"></a>
# **putMccRestrictionGroups**
> InlineResponse20015 putMccRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body)

edit a mcc restriction group

Edit a mcc restriction group in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.MccRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MccRestrictionGroupsApi apiInstance = new MccRestrictionGroupsApi();
Integer id = 56; // Integer | MCC group's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Body8 body = new Body8(); // Body8 | 
try {
    InlineResponse20015 result = apiInstance.putMccRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccRestrictionGroupsApi#putMccRestrictionGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| MCC group&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **body** | [**Body8**](Body8.md)|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

