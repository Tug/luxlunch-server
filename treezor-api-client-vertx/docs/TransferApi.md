# TransferApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTransfer**](TransferApi.md#deleteTransfer) | **DELETE** /transfers/{id} | cancel a transfer
[**getTransfer**](TransferApi.md#getTransfer) | **GET** /transfers/{id} | get a transfer
[**getTransfers**](TransferApi.md#getTransfers) | **GET** /transfers | search transfers
[**postTransfers**](TransferApi.md#postTransfers) | **POST** /transfers | create a transfer


<a name="deleteTransfer"></a>
# **deleteTransfer**
> TreezorInlineResponse20023 deleteTransfer(id)

cancel a transfer

Change transfer&#39;s status to CANCELED. A validated transfer can&#39;t be cancelled.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
Long id = 789L; // Long | Transfert internal id.
try {
    TreezorInlineResponse20023 result = apiInstance.deleteTransfer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#deleteTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Transfert internal id. |

### Return type

[**TreezorInlineResponse20023**](TreezorInlineResponse20023.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransfer"></a>
# **getTransfer**
> TreezorInlineResponse20023 getTransfer(id)

get a transfer

Get a transfert from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
Long id = 789L; // Long | Transfers internal id.
try {
    TreezorInlineResponse20023 result = apiInstance.getTransfer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#getTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Transfers internal id. |

### Return type

[**TreezorInlineResponse20023**](TreezorInlineResponse20023.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransfers"></a>
# **getTransfers**
> TreezorInlineResponse20023 getTransfers(accessSignature, accessTag, accessUserId, accessUserIp, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferDate, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search transfers

Search for transfers in the system. The request must contains at least one of those inputs  walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferId, transferTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer transferId = 56; // Integer | Transfer's id.
String transferTag = "transferTag_example"; // String | Custom data.
String transferStatus = "transferStatus_example"; // String | Transfer's status. Possible values: * PENDING * CANCELED * VALIDATED 
Integer walletId = 56; // Integer | Debited wallet's id.
Integer beneficiaryWalletId = 56; // Integer | Credited wallet's id.
Integer userId = 56; // Integer | Debited wallet user's id.
Integer beneficiaryUserId = 56; // Integer | Credited wallet user's id.
OffsetDateTime transferDate = OffsetDateTime.now(); // OffsetDateTime | Transfert's date. Format : YYYY-MM-DD HH:MM:SS 
String amount = "amount_example"; // String | Transfert's amount.
String currency = "currency_example"; // String | Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
Integer transferTypeId = 56; // Integer | The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet | | 2 | Card transaction | | 3 | Client fees | | 4 | Credit note | 
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    TreezorInlineResponse20023 result = apiInstance.getTransfers(accessSignature, accessTag, accessUserId, accessUserIp, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferDate, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#getTransfers");
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
 **transferId** | **Integer**| Transfer&#39;s id. | [optional]
 **transferTag** | **String**| Custom data. | [optional]
 **transferStatus** | **String**| Transfer&#39;s status. Possible values: * PENDING * CANCELED * VALIDATED  | [optional]
 **walletId** | **Integer**| Debited wallet&#39;s id. | [optional]
 **beneficiaryWalletId** | **Integer**| Credited wallet&#39;s id. | [optional]
 **userId** | **Integer**| Debited wallet user&#39;s id. | [optional]
 **beneficiaryUserId** | **Integer**| Credited wallet user&#39;s id. | [optional]
 **transferDate** | **OffsetDateTime**| Transfert&#39;s date. Format : YYYY-MM-DD HH:MM:SS  | [optional]
 **amount** | **String**| Transfert&#39;s amount. | [optional]
 **currency** | **String**| Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  | [optional]
 **transferTypeId** | **Integer**| The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet | | 2 | Card transaction | | 3 | Client fees | | 4 | Credit note |  | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**TreezorInlineResponse20023**](TreezorInlineResponse20023.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTransfers"></a>
# **postTransfers**
> TreezorInlineResponse20023 postTransfers(walletId, beneficiaryWalletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferTag, label, transferTypeId)

create a transfer

Create a new transfer in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
Integer walletId = 56; // Integer | Debited wallet's ID
Integer beneficiaryWalletId = 56; // Integer | Credited wallet's ID
Integer amount = 56; // Integer | Transfer's amount
String currency = "currency_example"; // String | Transfert's currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String transferTag = "transferTag_example"; // String | Custom data.
String label = "label_example"; // String | Custom data.
Integer transferTypeId = 56; // Integer | The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet (default value) | | 3 | Client fees | | 4 | Credit note | 
try {
    TreezorInlineResponse20023 result = apiInstance.postTransfers(walletId, beneficiaryWalletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, transferTag, label, transferTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#postTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **Integer**| Debited wallet&#39;s ID |
 **beneficiaryWalletId** | **Integer**| Credited wallet&#39;s ID |
 **amount** | **Integer**| Transfer&#39;s amount |
 **currency** | **String**| Transfert&#39;s currency. Debited wallet and credited wallet must share same currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **transferTag** | **String**| Custom data. | [optional]
 **label** | **String**| Custom data. | [optional]
 **transferTypeId** | **Integer**| The Type Id of the Transfer:  | ID | Description | |-----|-----| | 1 | Wallet to wallet (default value) | | 3 | Client fees | | 4 | Credit note |  | [optional]

### Return type

[**TreezorInlineResponse20023**](TreezorInlineResponse20023.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

