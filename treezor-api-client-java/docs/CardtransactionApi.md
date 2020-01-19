# CardtransactionApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardtransaction**](CardtransactionApi.md#getCardtransaction) | **GET** /cardtransactions/{id} | get a card transaction
[**readCardTransaction**](CardtransactionApi.md#readCardTransaction) | **GET** /cardtransactions | search for card transactions


<a name="getCardtransaction"></a>
# **getCardtransaction**
> InlineResponse20010 getCardtransaction(id)

get a card transaction

get a card transaction

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardtransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardtransactionApi apiInstance = new CardtransactionApi();
Long id = 789L; // Long | Card transactions's internal id.
try {
    InlineResponse20010 result = apiInstance.getCardtransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardtransactionApi#getCardtransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Card transactions&#39;s internal id. |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readCardTransaction"></a>
# **readCardTransaction**
> InlineResponse2009 readCardTransaction(accessSignature, accessTag, accessUserId, accessUserIp, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy)

search for card transactions

Search for documents. The request must contain at least one of those inputs - cardId, paymentId, publicToken, walletId

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardtransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardtransactionApi apiInstance = new CardtransactionApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer cardtransactionId = 56; // Integer | Card transaction's Id
Integer cardId = 56; // Integer | Card's Id
Integer walletId = 56; // Integer | Card's wallet Id
Integer merchantId = 56; // Integer | Merchant's Id
String publicToken = "publicToken_example"; // String | Card's public token
Integer paymentId = 56; // Integer | Payment's Id
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). required: false
try {
    InlineResponse2009 result = apiInstance.readCardTransaction(accessSignature, accessTag, accessUserId, accessUserIp, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardtransactionApi#readCardTransaction");
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
 **cardtransactionId** | **Integer**| Card transaction&#39;s Id | [optional]
 **cardId** | **Integer**| Card&#39;s Id | [optional]
 **walletId** | **Integer**| Card&#39;s wallet Id | [optional]
 **merchantId** | **Integer**| Merchant&#39;s Id | [optional]
 **publicToken** | **String**| Card&#39;s public token | [optional]
 **paymentId** | **Integer**| Payment&#39;s Id | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). required: false | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

