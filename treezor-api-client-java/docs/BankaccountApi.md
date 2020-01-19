# BankaccountApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBankaccount**](BankaccountApi.md#deleteBankaccount) | **DELETE** /bankaccounts/{id} | deactivate a bank account
[**getBankaccount**](BankaccountApi.md#getBankaccount) | **GET** /bankaccounts/{id} | get a bank account
[**getBankaccounts**](BankaccountApi.md#getBankaccounts) | **GET** /bankaccounts | search bank accounts
[**postBankaccount**](BankaccountApi.md#postBankaccount) | **POST** /bankaccounts | create a bank account


<a name="deleteBankaccount"></a>
# **deleteBankaccount**
> InlineResponse2001 deleteBankaccount(id)

deactivate a bank account

Change bank account&#39;s status to CANCELED. If a payout is being validated on this bank account, it can not be canceled.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BankaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankaccountApi apiInstance = new BankaccountApi();
Long id = 789L; // Long | Bank Accounts internal id.
try {
    InlineResponse2001 result = apiInstance.deleteBankaccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankaccountApi#deleteBankaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Bank Accounts internal id. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBankaccount"></a>
# **getBankaccount**
> InlineResponse2001 getBankaccount(id)

get a bank account

Get a bank account from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BankaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankaccountApi apiInstance = new BankaccountApi();
Long id = 789L; // Long | Bank Accounts internal id.
try {
    InlineResponse2001 result = apiInstance.getBankaccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankaccountApi#getBankaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Bank Accounts internal id. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBankaccounts"></a>
# **getBankaccounts**
> InlineResponse2001 getBankaccounts(accessSignature, accessTag, accessUserId, accessUserIp, bankaccountId, bankaccountStatus, userId, bankaccountIBAN, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search bank accounts

Get bank accounts that match search criteria.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BankaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankaccountApi apiInstance = new BankaccountApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer bankaccountId = 56; // Integer | bank account id.
String bankaccountStatus = "bankaccountStatus_example"; // String | bank account status. Possible values: * CANCELED * PENDING * VALIDATED 
Integer userId = 56; // Integer | Bank account owner user's id
String bankaccountIBAN = "bankaccountIBAN_example"; // String | Bank account IBAN
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    InlineResponse2001 result = apiInstance.getBankaccounts(accessSignature, accessTag, accessUserId, accessUserIp, bankaccountId, bankaccountStatus, userId, bankaccountIBAN, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankaccountApi#getBankaccounts");
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
 **bankaccountId** | **Integer**| bank account id. | [optional]
 **bankaccountStatus** | **String**| bank account status. Possible values: * CANCELED * PENDING * VALIDATED  | [optional]
 **userId** | **Integer**| Bank account owner user&#39;s id | [optional]
 **bankaccountIBAN** | **String**| Bank account IBAN | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBankaccount"></a>
# **postBankaccount**
> InlineResponse2001 postBankaccount(userId, bankaccountOwnerName, bankaccountOwnerAddress, bankaccountIBAN, bankaccountBIC, bankaccountType, accessSignature, accessTag, accessUserId, accessUserIp, bankaccountTag, name)

create a bank account

Create a new benefeciary bank account in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BankaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BankaccountApi apiInstance = new BankaccountApi();
Integer userId = 56; // Integer | Owner user's id.
String bankaccountOwnerName = "bankaccountOwnerName_example"; // String | Bank account owner's name.
String bankaccountOwnerAddress = "bankaccountOwnerAddress_example"; // String | Bank account owner's address.
String bankaccountIBAN = "bankaccountIBAN_example"; // String | Beneficiary bank account's IBAN.
String bankaccountBIC = "bankaccountBIC_example"; // String | Beneficiary bank account's BIC (or SWIFT).
String bankaccountType = "bankaccountType_example"; // String | Beneficiary bank account's type.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String bankaccountTag = "bankaccountTag_example"; // String | Custom data.
String name = "name_example"; // String | Bank account's name.
try {
    InlineResponse2001 result = apiInstance.postBankaccount(userId, bankaccountOwnerName, bankaccountOwnerAddress, bankaccountIBAN, bankaccountBIC, bankaccountType, accessSignature, accessTag, accessUserId, accessUserIp, bankaccountTag, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankaccountApi#postBankaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| Owner user&#39;s id. |
 **bankaccountOwnerName** | **String**| Bank account owner&#39;s name. |
 **bankaccountOwnerAddress** | **String**| Bank account owner&#39;s address. |
 **bankaccountIBAN** | **String**| Beneficiary bank account&#39;s IBAN. |
 **bankaccountBIC** | **String**| Beneficiary bank account&#39;s BIC (or SWIFT). |
 **bankaccountType** | **String**| Beneficiary bank account&#39;s type. | [enum: sct, sdd_core, sdd_b2b]
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **bankaccountTag** | **String**| Custom data. | [optional]
 **name** | **String**| Bank account&#39;s name. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

