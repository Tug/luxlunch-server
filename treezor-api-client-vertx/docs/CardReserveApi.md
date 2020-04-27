# CardReserveApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardReserveAddTo**](CardReserveApi.md#cardReserveAddTo) | **POST** /cardReserves/AddTo | add an amount to the reserved amount of a card
[**cardReserveCheck**](CardReserveApi.md#cardReserveCheck) | **POST** /cardReserves/Check | check reserved amount
[**cardReserveGet**](CardReserveApi.md#cardReserveGet) | **GET** /cardReserves/{id} | get the reserved amount of a card


<a name="cardReserveAddTo"></a>
# **cardReserveAddTo**
> Float cardReserveAddTo(accessSignature, accessTag, accessUserId, accessUserIp, body)

add an amount to the reserved amount of a card

add an amount to the reserved amount of a card

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardReserveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardReserveApi apiInstance = new CardReserveApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://www.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://www.treezor.com/basics). 
TreezorBody2 body = new TreezorBody2(); // TreezorBody2 | 
try {
    Float result = apiInstance.cardReserveAddTo(accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReserveApi#cardReserveAddTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  | [optional]
 **body** | [**TreezorBody2**](TreezorBody2.md)|  | [optional]

### Return type

**Float**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cardReserveCheck"></a>
# **cardReserveCheck**
> Boolean cardReserveCheck(accessSignature, accessTag, accessUserId, accessUserIp, body)

check reserved amount

Check if an amount can be substract to the reserved amount

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardReserveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardReserveApi apiInstance = new CardReserveApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://www.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://www.treezor.com/basics). 
TreezorBody3 body = new TreezorBody3(); // TreezorBody3 | 
try {
    Boolean result = apiInstance.cardReserveCheck(accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReserveApi#cardReserveCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  | [optional]
 **body** | [**TreezorBody3**](TreezorBody3.md)|  | [optional]

### Return type

**Boolean**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cardReserveGet"></a>
# **cardReserveGet**
> TreezorInlineResponse2008 cardReserveGet(id, accessSignature, accessTag, accessUserId, accessUserIp)

get the reserved amount of a card

get the reserved amount of a card

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardReserveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardReserveApi apiInstance = new CardReserveApi();
Long id = 789L; // Long | the cardId of the reserved amount you want to pick up
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://www.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://www.treezor.com/basics). 
try {
    TreezorInlineResponse2008 result = apiInstance.cardReserveGet(id, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReserveApi#cardReserveGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| the cardId of the reserved amount you want to pick up |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://www.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://www.treezor.com/basics).  | [optional]

### Return type

[**TreezorInlineResponse2008**](TreezorInlineResponse2008.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

