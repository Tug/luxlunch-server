# TaxResidenceApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxResidencesGet**](TaxResidenceApi.md#taxResidencesGet) | **GET** /taxResidences | search a residence
[**taxResidencesIdDelete**](TaxResidenceApi.md#taxResidencesIdDelete) | **DELETE** /taxResidences/{id} | delete a residence
[**taxResidencesIdGet**](TaxResidenceApi.md#taxResidencesIdGet) | **GET** /taxResidences/{id} | read the informations of a residence
[**taxResidencesIdPut**](TaxResidenceApi.md#taxResidencesIdPut) | **PUT** /taxResidences/{id} | update the residence
[**taxResidencesPost**](TaxResidenceApi.md#taxResidencesPost) | **POST** /taxResidences | create a residence


<a name="taxResidencesGet"></a>
# **taxResidencesGet**
> TreezorInlineResponse20021 taxResidencesGet(accessSignature, id, userId)

search a residence

Search a residence that match search criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaxResidenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxResidenceApi apiInstance = new TaxResidenceApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication).
Integer id = 56; // Integer | id of the residence
Integer userId = 56; // Integer | User's id residence
try {
    TreezorInlineResponse20021 result = apiInstance.taxResidencesGet(accessSignature, id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxResidenceApi#taxResidencesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). | [optional]
 **id** | **Integer**| id of the residence | [optional]
 **userId** | **Integer**| User&#39;s id residence | [optional]

### Return type

[**TreezorInlineResponse20021**](TreezorInlineResponse20021.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="taxResidencesIdDelete"></a>
# **taxResidencesIdDelete**
> TreezorInlineResponse20021 taxResidencesIdDelete(id, accessSignature)

delete a residence

Delete a residence that match id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaxResidenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxResidenceApi apiInstance = new TaxResidenceApi();
Integer id = 56; // Integer | id of the residence
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication).
try {
    TreezorInlineResponse20021 result = apiInstance.taxResidencesIdDelete(id, accessSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxResidenceApi#taxResidencesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the residence |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). | [optional]

### Return type

[**TreezorInlineResponse20021**](TreezorInlineResponse20021.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="taxResidencesIdGet"></a>
# **taxResidencesIdGet**
> TreezorInlineResponse20021 taxResidencesIdGet(id, accessSignature)

read the informations of a residence

Read the informations of a residence that match with id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaxResidenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxResidenceApi apiInstance = new TaxResidenceApi();
Integer id = 56; // Integer | id of the residence
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication).
try {
    TreezorInlineResponse20021 result = apiInstance.taxResidencesIdGet(id, accessSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxResidenceApi#taxResidencesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the residence |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). | [optional]

### Return type

[**TreezorInlineResponse20021**](TreezorInlineResponse20021.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="taxResidencesIdPut"></a>
# **taxResidencesIdPut**
> TreezorInlineResponse20021 taxResidencesIdPut(id, accessSignature, userId, country, taxPayerId, liabilityWaiver)

update the residence

Update a residence already created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaxResidenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxResidenceApi apiInstance = new TaxResidenceApi();
Integer id = 56; // Integer | residence id
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication).
Integer userId = 56; // Integer | User's id residence
String country = "country_example"; // String | country of the resident
String taxPayerId = "taxPayerId_example"; // String | Tax payer's id
Boolean liabilityWaiver = true; // Boolean | Tax declaration
try {
    TreezorInlineResponse20021 result = apiInstance.taxResidencesIdPut(id, accessSignature, userId, country, taxPayerId, liabilityWaiver);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxResidenceApi#taxResidencesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| residence id |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). | [optional]
 **userId** | **Integer**| User&#39;s id residence | [optional]
 **country** | **String**| country of the resident | [optional]
 **taxPayerId** | **String**| Tax payer&#39;s id | [optional]
 **liabilityWaiver** | **Boolean**| Tax declaration | [optional]

### Return type

[**TreezorInlineResponse20021**](TreezorInlineResponse20021.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="taxResidencesPost"></a>
# **taxResidencesPost**
> TreezorInlineResponse20021 taxResidencesPost(userId, country, accessSignature, taxPayerId, liabilityWaiver)

create a residence

Create a new tax residence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TaxResidenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TaxResidenceApi apiInstance = new TaxResidenceApi();
Integer userId = 56; // Integer | User's id residence
String country = "country_example"; // String | country of the resident
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication).
String taxPayerId = "taxPayerId_example"; // String | Tax payer's id
Boolean liabilityWaiver = true; // Boolean | When there is no taxPayerId for a residence, this field shall be set to true.
try {
    TreezorInlineResponse20021 result = apiInstance.taxResidencesPost(userId, country, accessSignature, taxPayerId, liabilityWaiver);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxResidenceApi#taxResidencesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| User&#39;s id residence |
 **country** | **String**| country of the resident |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will  contact you if so. More info  [here](https://agent.treezor.com/security-authentication). | [optional]
 **taxPayerId** | **String**| Tax payer&#39;s id | [optional]
 **liabilityWaiver** | **Boolean**| When there is no taxPayerId for a residence, this field shall be set to true. | [optional]

### Return type

[**TreezorInlineResponse20021**](TreezorInlineResponse20021.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

