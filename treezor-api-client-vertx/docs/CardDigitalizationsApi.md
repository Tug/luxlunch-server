# CardDigitalizationsApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardDigitalizationsId**](CardDigitalizationsApi.md#cardDigitalizationsId) | **GET** /cardDigitalizations/{id} | Get a card digitalizations based on its internal id
[**deletecardDigitalizationsId**](CardDigitalizationsApi.md#deletecardDigitalizationsId) | **DELETE** /cardDigitalizations/{id} | Deletes a payment Token
[**putcardDigitalizationsId**](CardDigitalizationsApi.md#putcardDigitalizationsId) | **PUT** /cardDigitalizations/{id} | Update the status of a payment Token
[**readcardDigitalizations**](CardDigitalizationsApi.md#readcardDigitalizations) | **GET** /cardDigitalizations | search for card digitalizations


<a name="cardDigitalizationsId"></a>
# **cardDigitalizationsId**
> TreezorInlineResponse2007 cardDigitalizationsId(id, fields)

Get a card digitalizations based on its internal id

Get a card digitalizations based on its internal id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardDigitalizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardDigitalizationsApi apiInstance = new CardDigitalizationsApi();
Long id = 789L; // Long | Card digitalization internal id.
String fields = "fields_example"; // String | fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate
try {
    TreezorInlineResponse2007 result = apiInstance.cardDigitalizationsId(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardDigitalizationsApi#cardDigitalizationsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Card digitalization internal id. |
 **fields** | **String**| fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate | [optional]

### Return type

[**TreezorInlineResponse2007**](TreezorInlineResponse2007.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletecardDigitalizationsId"></a>
# **deletecardDigitalizationsId**
> TreezorInlineResponse2007 deletecardDigitalizationsId(id, reasonCode)

Deletes a payment Token

Deletes a payment Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardDigitalizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardDigitalizationsApi apiInstance = new CardDigitalizationsApi();
Long id = 789L; // Long | Card digitalization internal id.
String reasonCode = "reasonCode_example"; // String | The reason code for the action. Possible values are :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other | 
try {
    TreezorInlineResponse2007 result = apiInstance.deletecardDigitalizationsId(id, reasonCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardDigitalizationsApi#deletecardDigitalizationsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Card digitalization internal id. |
 **reasonCode** | **String**| The reason code for the action. Possible values are :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other |  |

### Return type

[**TreezorInlineResponse2007**](TreezorInlineResponse2007.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putcardDigitalizationsId"></a>
# **putcardDigitalizationsId**
> TreezorInlineResponse2007 putcardDigitalizationsId(id, status, reasonCode)

Update the status of a payment Token

Update the status of a payment Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardDigitalizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardDigitalizationsApi apiInstance = new CardDigitalizationsApi();
Long id = 789L; // Long | Card digitalization internal id.
String status = "status_example"; // String | The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
String reasonCode = "reasonCode_example"; // String | The reason code for the action. Possible values are : - For a suspension :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  - For an unsuspension :  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
try {
    TreezorInlineResponse2007 result = apiInstance.putcardDigitalizationsId(id, status, reasonCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardDigitalizationsApi#putcardDigitalizationsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Card digitalization internal id. |
 **status** | **String**| The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend |  |
 **reasonCode** | **String**| The reason code for the action. Possible values are : - For a suspension :  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  - For an unsuspension :  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other |  |

### Return type

[**TreezorInlineResponse2007**](TreezorInlineResponse2007.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readcardDigitalizations"></a>
# **readcardDigitalizations**
> TreezorInlineResponse2007 readcardDigitalizations(accessSignature, accessTag, accessUserId, accessUserIp, filter, fields)

search for card digitalizations

Search for card digitalizations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardDigitalizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardDigitalizationsApi apiInstance = new CardDigitalizationsApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String filter = "filter_example"; // String | Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate  More info [here](https://agent.treezor.com/filterv2). 
String fields = "fields_example"; // String | fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate
try {
    TreezorInlineResponse2007 result = apiInstance.readcardDigitalizations(accessSignature, accessTag, accessUserId, accessUserIp, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardDigitalizationsApi#readcardDigitalizations");
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
 **filter** | **String**| Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate  More info [here](https://agent.treezor.com/filterv2).  | [optional]
 **fields** | **String**| fields to output separated by commas. Possible fields are id, externalId, cardId, detailsFromGPS, status, createdDate, modifiedDate | [optional]

### Return type

[**TreezorInlineResponse2007**](TreezorInlineResponse2007.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

