# TransactionApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionApi.md#getTransaction) | **GET** /transactions/{id} | get a transaction
[**getTransactions**](TransactionApi.md#getTransactions) | **GET** /transactions | search transactions


<a name="getTransaction"></a>
# **getTransaction**
> InlineResponse20022 getTransaction(id)

get a transaction

Get a transaction from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
Long id = 789L; // Long | Transaction's internal id.
try {
    InlineResponse20022 result = apiInstance.getTransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Transaction&#39;s internal id. |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> InlineResponse20022 getTransactions(accessSignature, accessTag, accessUserId, accessUserIp, transactionId, transactionType, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo)

search transactions

Get transactions that match search criteria.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.TransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TransactionApi apiInstance = new TransactionApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer transactionId = 56; // Integer | Transaction's Id
String transactionType = "transactionType_example"; // String | Transaction types. Possible values: * Payin * Payout * Transfer * Transfer Refund * Payin Refund * Discount * Bill 
Integer walletId = 56; // Integer | Transactions' wallet id.
Integer userId = 56; // Integer | Transactions' user id.
String name = "name_example"; // String | Transactions' name.
String description = "description_example"; // String | transactions' description.
String amount = "amount_example"; // String | Transactions' amount.
String currency = "currency_example"; // String | Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
OffsetDateTime valueDate = OffsetDateTime.now(); // OffsetDateTime | The value date of the transaction (date applied for the payment) Format : YYYY-MM-DD HH:MM:SS
OffsetDateTime executionDate = OffsetDateTime.now(); // OffsetDateTime | Date of the execution of the transaction Format : YYYY-MM-DD HH:MM:SS
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    InlineResponse20022 result = apiInstance.getTransactions(accessSignature, accessTag, accessUserId, accessUserIp, transactionId, transactionType, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#getTransactions");
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
 **transactionId** | **Integer**| Transaction&#39;s Id | [optional]
 **transactionType** | **String**| Transaction types. Possible values: * Payin * Payout * Transfer * Transfer Refund * Payin Refund * Discount * Bill  | [optional]
 **walletId** | **Integer**| Transactions&#39; wallet id. | [optional]
 **userId** | **Integer**| Transactions&#39; user id. | [optional]
 **name** | **String**| Transactions&#39; name. | [optional]
 **description** | **String**| transactions&#39; description. | [optional]
 **amount** | **String**| Transactions&#39; amount. | [optional]
 **currency** | **String**| Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  | [optional]
 **valueDate** | **OffsetDateTime**| The value date of the transaction (date applied for the payment) Format : YYYY-MM-DD HH:MM:SS | [optional]
 **executionDate** | **OffsetDateTime**| Date of the execution of the transaction Format : YYYY-MM-DD HH:MM:SS | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

