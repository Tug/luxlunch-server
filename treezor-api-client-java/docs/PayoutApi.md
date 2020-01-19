# PayoutApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePayout**](PayoutApi.md#deletePayout) | **DELETE** /payouts/{id} | cancel a payout
[**getPayout**](PayoutApi.md#getPayout) | **GET** /payouts/{id} | get a payout
[**getPayouts**](PayoutApi.md#getPayouts) | **GET** /payouts | search payout(s)
[**postPayout**](PayoutApi.md#postPayout) | **POST** /payouts | create a pay out


<a name="deletePayout"></a>
# **deletePayout**
> InlineResponse20019 deletePayout(id)

cancel a payout

Change pay out status to CANCELED. A VALIDATED pay out can&#39;t be canceled.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayoutApi apiInstance = new PayoutApi();
Long id = 789L; // Long | Payouts internal id.
try {
    InlineResponse20019 result = apiInstance.deletePayout(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutApi#deletePayout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Payouts internal id. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayout"></a>
# **getPayout**
> InlineResponse20019 getPayout(id)

get a payout

Get a pay out from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayoutApi apiInstance = new PayoutApi();
Long id = 789L; // Long | Payouts internal id.
try {
    InlineResponse20019 result = apiInstance.getPayout(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutApi#getPayout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Payouts internal id. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayouts"></a>
# **getPayouts**
> InlineResponse20019 getPayouts(accessSignature, accessTag, accessUserId, accessUserIp, payoutId, payoutTag, payoutStatus, payoutTypeId, walletId, userId, payoutDate, bankaccountId, beneficiaryId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search payout(s)

Get payout(s) that match search criteria. The request must contains at least one of those inputs  payoutId, bankaccountId, beneficiaryId, payoutTypeId, payoutTag

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayoutApi apiInstance = new PayoutApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer payoutId = 56; // Integer | Payout's Id
String payoutTag = "payoutTag_example"; // String | Custom data.
String payoutStatus = "payoutStatus_example"; // String | pay out status; Possible values: * CANCELED * PENDING * VALIDATED 
Integer payoutTypeId = 56; // Integer | Pay out type's id :  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit | 
Integer walletId = 56; // Integer | Pay out wallet's id.
Integer userId = 56; // Integer | Pay out user's id.
OffsetDateTime payoutDate = OffsetDateTime.now(); // OffsetDateTime | pay out execution date. Format: YYYY-MM-DD HH:MM:SS' 
Integer bankaccountId = 56; // Integer | Pay out bank account id.
Integer beneficiaryId = 56; // Integer | Pay out beneficiary id.
String amount = "amount_example"; // String | Pay out amount.
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
    InlineResponse20019 result = apiInstance.getPayouts(accessSignature, accessTag, accessUserId, accessUserIp, payoutId, payoutTag, payoutStatus, payoutTypeId, walletId, userId, payoutDate, bankaccountId, beneficiaryId, amount, currency, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutApi#getPayouts");
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
 **payoutId** | **Integer**| Payout&#39;s Id | [optional]
 **payoutTag** | **String**| Custom data. | [optional]
 **payoutStatus** | **String**| pay out status; Possible values: * CANCELED * PENDING * VALIDATED  | [optional]
 **payoutTypeId** | **Integer**| Pay out type&#39;s id :  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit |  | [optional]
 **walletId** | **Integer**| Pay out wallet&#39;s id. | [optional]
 **userId** | **Integer**| Pay out user&#39;s id. | [optional]
 **payoutDate** | **OffsetDateTime**| pay out execution date. Format: YYYY-MM-DD HH:MM:SS&#39;  | [optional]
 **bankaccountId** | **Integer**| Pay out bank account id. | [optional]
 **beneficiaryId** | **Integer**| Pay out beneficiary id. | [optional]
 **amount** | **String**| Pay out amount. | [optional]
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

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPayout"></a>
# **postPayout**
> InlineResponse20019 postPayout(walletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payoutTag, bankaccountId, beneficiaryId, label, supportingFileLink)

create a pay out

Create a new pay out in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayoutApi apiInstance = new PayoutApi();
Integer walletId = 56; // Integer | Pay out wallet id.
Integer amount = 56; // Integer | Pay out amount.
String currency = "currency_example"; // String | Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String payoutTag = "payoutTag_example"; // String | Custom data.
Integer bankaccountId = 56; // Integer | Pay out bank account's id. Mandatory id beneficiaryId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used.
Integer beneficiaryId = 56; // Integer | Pay out beneficiary's id. Mandatory id bankaccountId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used.
String label = "label_example"; // String | Pay out label that will be displayed in the receiver's account (140 chars max).
String supportingFileLink = "supportingFileLink_example"; // String | Support file link
try {
    InlineResponse20019 result = apiInstance.postPayout(walletId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payoutTag, bankaccountId, beneficiaryId, label, supportingFileLink);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutApi#postPayout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **Integer**| Pay out wallet id. |
 **amount** | **Integer**| Pay out amount. |
 **currency** | **String**| Transfert amount currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **payoutTag** | **String**| Custom data. | [optional]
 **bankaccountId** | **Integer**| Pay out bank account&#39;s id. Mandatory id beneficiaryId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. | [optional]
 **beneficiaryId** | **Integer**| Pay out beneficiary&#39;s id. Mandatory id bankaccountId is not provided. If bankaccountId and beneficiaryId are both provided, the beneficiaryId will be used. | [optional]
 **label** | **String**| Pay out label that will be displayed in the receiver&#39;s account (140 chars max). | [optional]
 **supportingFileLink** | **String**| Support file link | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

