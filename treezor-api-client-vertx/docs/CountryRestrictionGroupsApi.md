# CountryRestrictionGroupsApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCountryRestrictionGroups**](CountryRestrictionGroupsApi.md#deleteCountryRestrictionGroups) | **DELETE** /countryRestrictionGroups/{id} | cancel a country group
[**getCountryRestrictionGroups**](CountryRestrictionGroupsApi.md#getCountryRestrictionGroups) | **GET** /countryRestrictionGroups | search country restriction groups
[**getCountryRestrictionGroupsId**](CountryRestrictionGroupsApi.md#getCountryRestrictionGroupsId) | **GET** /countryRestrictionGroups/{id} | get a country group
[**postCountryRestrictionGroup**](CountryRestrictionGroupsApi.md#postCountryRestrictionGroup) | **POST** /countryRestrictionGroups | create a countryRestrictionGroup
[**putCountryRestrictionGroups**](CountryRestrictionGroupsApi.md#putCountryRestrictionGroups) | **PUT** /countryRestrictionGroups/{id} | edit a country restriction group


<a name="deleteCountryRestrictionGroups"></a>
# **deleteCountryRestrictionGroups**
> TreezorInlineResponse20011 deleteCountryRestrictionGroups(id, fields)

cancel a country group

Cancel a country restriction group from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountryRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi();
Long id = 789L; // Long | country restriction Group internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    TreezorInlineResponse20011 result = apiInstance.deleteCountryRestrictionGroups(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryRestrictionGroupsApi#deleteCountryRestrictionGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| country restriction Group internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**TreezorInlineResponse20011**](TreezorInlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountryRestrictionGroups"></a>
# **getCountryRestrictionGroups**
> TreezorInlineResponse20011 getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

search country restriction groups

Get country restriction groups that match search criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountryRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi();
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
    TreezorInlineResponse20011 result = apiInstance.getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryRestrictionGroupsApi#getCountryRestrictionGroups");
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

[**TreezorInlineResponse20011**](TreezorInlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountryRestrictionGroupsId"></a>
# **getCountryRestrictionGroupsId**
> TreezorInlineResponse20011 getCountryRestrictionGroupsId(id, fields)

get a country group

Get a country group from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountryRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi();
Long id = 789L; // Long | country restriction Group internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    TreezorInlineResponse20011 result = apiInstance.getCountryRestrictionGroupsId(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryRestrictionGroupsApi#getCountryRestrictionGroupsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| country restriction Group internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**TreezorInlineResponse20011**](TreezorInlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCountryRestrictionGroup"></a>
# **postCountryRestrictionGroup**
> TreezorInlineResponse20011 postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body)

create a countryRestrictionGroup

Create a new country restriction group in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountryRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
TreezorBody4 body = new TreezorBody4(); // TreezorBody4 | 
try {
    TreezorInlineResponse20011 result = apiInstance.postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryRestrictionGroupsApi#postCountryRestrictionGroup");
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
 **body** | [**TreezorBody4**](TreezorBody4.md)|  | [optional]

### Return type

[**TreezorInlineResponse20011**](TreezorInlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCountryRestrictionGroups"></a>
# **putCountryRestrictionGroups**
> TreezorInlineResponse20011 putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body)

edit a country restriction group

Edit a country restriction group in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountryRestrictionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi();
Integer id = 56; // Integer | country group's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
TreezorBody5 body = new TreezorBody5(); // TreezorBody5 | 
try {
    TreezorInlineResponse20011 result = apiInstance.putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryRestrictionGroupsApi#putCountryRestrictionGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| country group&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **body** | [**TreezorBody5**](TreezorBody5.md)|  | [optional]

### Return type

[**TreezorInlineResponse20011**](TreezorInlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

