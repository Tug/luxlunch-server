# TransferrefundApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTransferrefund**](TransferrefundApi.md#deleteTransferrefund) | **DELETE** /transferrefunds/{id} | cancel a transfer refund
[**getTransferrefund**](TransferrefundApi.md#getTransferrefund) | **GET** /transferrefunds/{id} | get a transfer refund
[**getTransferrefunds**](TransferrefundApi.md#getTransferrefunds) | **GET** /transferrefunds | search transfer refunds
[**postTransferrefunds**](TransferrefundApi.md#postTransferrefunds) | **POST** /transferrefunds | create a transfer refund


<a name="deleteTransferrefund"></a>
# **deleteTransferrefund**
> TreezorInlineResponse20024 deleteTransferrefund(id)

cancel a transfer refund

Change transfer refund&#39;s status to CANCELED. A validated transfer refund can&#39;t be cancelled.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferrefundApi apiInstance = new TransferrefundApi();
Long id = 789L; // Long | Transferrefunds internal id.
try {
    TreezorInlineResponse20024 result = apiInstance.deleteTransferrefund(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferrefundApi#deleteTransferrefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Transferrefunds internal id. |

### Return type

[**TreezorInlineResponse20024**](TreezorInlineResponse20024.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferrefund"></a>
# **getTransferrefund**
> TreezorInlineResponse20024 getTransferrefund(id)

get a transfer refund

Get a transfer refund from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferrefundApi apiInstance = new TransferrefundApi();
Long id = 789L; // Long | Trasnfert refund internal id.
try {
    TreezorInlineResponse20024 result = apiInstance.getTransferrefund(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferrefundApi#getTransferrefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Trasnfert refund internal id. |

### Return type

[**TreezorInlineResponse20024**](TreezorInlineResponse20024.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferrefunds"></a>
# **getTransferrefunds**
> TreezorInlineResponse20024 getTransferrefunds(accessSignature, accessTag, accessUserId, accessUserIp, transferrefundId, transferrefundTag, transferrefundStatus, walletId, transferId, transferrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search transfer refunds

Get transfer refunds that match search criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferrefundApi apiInstance = new TransferrefundApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer transferrefundId = 56; // Integer | Transfer refund id.
String transferrefundTag = "transferrefundTag_example"; // String | Custom data.
String transferrefundStatus = "transferrefundStatus_example"; // String | Transfer refund status. Possible values: * PENDING * CANCELED * VALIDATED 
Integer walletId = 56; // Integer | Refunded wallet's id.
Integer transferId = 56; // Integer | Initial transfer's id.
Integer transferrefundDate = 56; // Integer | transfert refund's date. Format: YYYY-MM-DD HH:MM:SS 
Integer userId = 56; // Integer | User's id of who has made the transfer refund.
String amount = "amount_example"; // String | Refund amount.
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
    TreezorInlineResponse20024 result = apiInstance.getTransferrefunds(accessSignature, accessTag, accessUserId, accessUserIp, transferrefundId, transferrefundTag, transferrefundStatus, walletId, transferId, transferrefundDate, userId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferrefundApi#getTransferrefunds");
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
 **transferrefundId** | **Integer**| Transfer refund id. | [optional]
 **transferrefundTag** | **String**| Custom data. | [optional]
 **transferrefundStatus** | **String**| Transfer refund status. Possible values: * PENDING * CANCELED * VALIDATED  | [optional]
 **walletId** | **Integer**| Refunded wallet&#39;s id. | [optional]
 **transferId** | **Integer**| Initial transfer&#39;s id. | [optional]
 **transferrefundDate** | **Integer**| transfert refund&#39;s date. Format: YYYY-MM-DD HH:MM:SS  | [optional]
 **userId** | **Integer**| User&#39;s id of who has made the transfer refund. | [optional]
 **amount** | **String**| Refund amount. | [optional]
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

[**TreezorInlineResponse20024**](TreezorInlineResponse20024.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTransferrefunds"></a>
# **postTransferrefunds**
> TreezorInlineResponse20025 postTransferrefunds(transferId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferrefundTag, comment)

create a transfer refund

Create a new transfer refund in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferrefundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferrefundApi apiInstance = new TransferrefundApi();
Integer transferId = 56; // Integer | transfer's id to refund.
Integer amount = 56; // Integer | Refund amount
String currency = "currency_example"; // String | Transfert's currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String transferrefundTag = "transferrefundTag_example"; // String | Custom data.
String comment = "comment_example"; // String | End user, client or issuer comment.
try {
    TreezorInlineResponse20025 result = apiInstance.postTransferrefunds(transferId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferrefundTag, comment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferrefundApi#postTransferrefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | **Integer**| transfer&#39;s id to refund. |
 **amount** | **Integer**| Refund amount |
 **currency** | **String**| Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **transferrefundTag** | **String**| Custom data. | [optional]
 **comment** | **String**| End user, client or issuer comment. | [optional]

### Return type

[**TreezorInlineResponse20025**](TreezorInlineResponse20025.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

