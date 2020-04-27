# PayinrefundApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePayinrefund**](PayinrefundApi.md#deletePayinrefund) | **DELETE** /payinrefunds/{id} | cancel a pay in refund
[**getPayinrefund**](PayinrefundApi.md#getPayinrefund) | **GET** /payinrefunds/{id} | get a pay in refund
[**getPayinrefunds**](PayinrefundApi.md#getPayinrefunds) | **GET** /payinrefunds | search pay in refunds
[**postPayinrefunds**](PayinrefundApi.md#postPayinrefunds) | **POST** /payinrefunds | create a pay in refund


<a name="deletePayinrefund"></a>
# **deletePayinrefund**
> TreezorInlineResponse20018 deletePayinrefund(id)

cancel a pay in refund

Change payin refund&#39;s status to CANCELED. A validated payin refund can&#39;t be cancelled.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayinrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinrefundApi apiInstance = new PayinrefundApi();
Long id = 789L; // Long | Payinrefund's internal id.
try {
    TreezorInlineResponse20018 result = apiInstance.deletePayinrefund(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinrefundApi#deletePayinrefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Payinrefund&#39;s internal id. |

### Return type

[**TreezorInlineResponse20018**](TreezorInlineResponse20018.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayinrefund"></a>
# **getPayinrefund**
> TreezorInlineResponse20018 getPayinrefund(id)

get a pay in refund

Get a payin refund from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayinrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinrefundApi apiInstance = new PayinrefundApi();
Long id = 789L; // Long | Payinrefund's internal id.
try {
    TreezorInlineResponse20018 result = apiInstance.getPayinrefund(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinrefundApi#getPayinrefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Payinrefund&#39;s internal id. |

### Return type

[**TreezorInlineResponse20018**](TreezorInlineResponse20018.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayinrefunds"></a>
# **getPayinrefunds**
> TreezorInlineResponse20018 getPayinrefunds(accessSignature, accessTag, accessUserId, accessUserIp, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search pay in refunds

Search for payinrefunds in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayinrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinrefundApi apiInstance = new PayinrefundApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer payinId = 56; // Integer | Payin's id.
Integer payinrefundId = 56; // Integer | Payinrefund's id.
String payinrefundTag = "payinrefundTag_example"; // String | Custom data.
String payinrefundStatus = "payinrefundStatus_example"; // String | Payinrefund's status. Possible values: * PENDING * CANCELED * VALIDATED
Integer walletId = 56; // Integer | Wallet's id to refund.
OffsetDateTime payinrefundDate = OffsetDateTime.now(); // OffsetDateTime | payinrefund's date. Format: YYYY-MM-DD
Integer userId = 56; // Integer | User's id who made refunds.
String amount = "amount_example"; // String | Refund's amount.
String currency = "currency_example"; // String | Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    TreezorInlineResponse20018 result = apiInstance.getPayinrefunds(accessSignature, accessTag, accessUserId, accessUserIp, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinrefundApi#getPayinrefunds");
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
 **payinId** | **Integer**| Payin&#39;s id. | [optional]
 **payinrefundId** | **Integer**| Payinrefund&#39;s id. | [optional]
 **payinrefundTag** | **String**| Custom data. | [optional]
 **payinrefundStatus** | **String**| Payinrefund&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED | [optional]
 **walletId** | **Integer**| Wallet&#39;s id to refund. | [optional]
 **payinrefundDate** | **OffsetDateTime**| payinrefund&#39;s date. Format: YYYY-MM-DD | [optional]
 **userId** | **Integer**| User&#39;s id who made refunds. | [optional]
 **amount** | **String**| Refund&#39;s amount. | [optional]
 **currency** | **String**| Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**TreezorInlineResponse20018**](TreezorInlineResponse20018.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPayinrefunds"></a>
# **postPayinrefunds**
> TreezorInlineResponse20018 postPayinrefunds(payinId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinrefundTag, comment)

create a pay in refund

Create a new payinrefund in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayinrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinrefundApi apiInstance = new PayinrefundApi();
Integer payinId = 56; // Integer | payin's id to refund.
Integer amount = 56; // Integer | Refund amount.
String currency = "currency_example"; // String | Refund currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String payinrefundTag = "payinrefundTag_example"; // String | Custom data.
String comment = "comment_example"; // String | End user, client or issuer comment.
try {
    TreezorInlineResponse20018 result = apiInstance.postPayinrefunds(payinId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinrefundTag, comment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinrefundApi#postPayinrefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payinId** | **Integer**| payin&#39;s id to refund. |
 **amount** | **Integer**| Refund amount. |
 **currency** | **String**| Refund currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **payinrefundTag** | **String**| Custom data. | [optional]
 **comment** | **String**| End user, client or issuer comment. | [optional]

### Return type

[**TreezorInlineResponse20018**](TreezorInlineResponse20018.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

