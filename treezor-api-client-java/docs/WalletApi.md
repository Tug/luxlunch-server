# WalletApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWallet**](WalletApi.md#deleteWallet) | **DELETE** /wallets/{id} | delete a wallet
[**getWallet**](WalletApi.md#getWallet) | **GET** /wallets/{id} | get a wallet
[**getWallets**](WalletApi.md#getWallets) | **GET** /wallets | search wallets
[**postWallets**](WalletApi.md#postWallets) | **POST** /wallets | create a wallet
[**putWallet**](WalletApi.md#putWallet) | **PUT** /wallets/{id} | update a wallet


<a name="deleteWallet"></a>
# **deleteWallet**
> InlineResponse20028 deleteWallet(id, origin, accessSignature, accessTag, accessUserId, accessUserIp)

delete a wallet

Change wallet&#39;s status to **CANCELED**.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WalletApi apiInstance = new WalletApi();
Integer id = 56; // Integer | Wallet's id
String origin = "origin_example"; // String | Request's origin. Possible values are: * OPERATOR * USER 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse20028 result = apiInstance.deleteWallet(id, origin, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#deleteWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Wallet&#39;s id |
 **origin** | **String**| Request&#39;s origin. Possible values are: * OPERATOR * USER  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallet"></a>
# **getWallet**
> InlineResponse20028 getWallet(id, accessSignature, accessTag, accessUserId, accessUserIp)

get a wallet



### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WalletApi apiInstance = new WalletApi();
Long id = 789L; // Long | Object internal id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse20028 result = apiInstance.getWallet(id, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Object internal id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallets"></a>
# **getWallets**
> InlineResponse20028 getWallets(accessSignature, accessTag, accessUserId, accessUserIP, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, eventAlias, eventPayinStartDate, eventPayinEndDate, tariffId, payinCount, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search wallets

Get wallets from the system that match the search criteria. The request must contains at least one of those inputs :walletId eventAlias, userId, walletTypeId, walletTag

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WalletApi apiInstance = new WalletApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer accessUserIP = 56; // Integer | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer walletId = 56; // Integer | Wallet's unique id.
String walletStatus = "walletStatus_example"; // String | Wallet's status:  * **validated**: Wallet is active. It is possible to deposit to or retrieve money from the wallet.  * **cancelled**: Wallet is closed. No action possible, there is no money in the wallet, it was closed by an operator or by the user.  * **pending**: Wallet being validated (e.g. suspected fraud, late submission of documents' validation ... KYC ). In this case, it is not possible to use the wallet for transactions.
Integer userId = 56; // Integer | Wallet owner's id.
Integer parentUserId = 56; // Integer | Parent user id of the wallet owner
String walletTag = "walletTag_example"; // String | Custom data.
Integer walletTypeId = 56; // Integer | Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) | 
String eventAlias = "eventAlias_example"; // String | Short url wallet name. It's automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet=mywedding 
OffsetDateTime eventPayinStartDate = OffsetDateTime.now(); // OffsetDateTime |  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD HH:MM:SS
OffsetDateTime eventPayinEndDate = OffsetDateTime.now(); // OffsetDateTime | Deadline to money deposit on the wallet. Format : YYYY-MM-DD HH:MM:SS 
Integer tariffId = 56; // Integer | Wallet pricing id.
Integer payinCount = 56; // Integer | Number of payin done on the wallet.
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    InlineResponse20028 result = apiInstance.getWallets(accessSignature, accessTag, accessUserId, accessUserIP, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, eventAlias, eventPayinStartDate, eventPayinEndDate, tariffId, payinCount, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIP** | **Integer**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **walletId** | **Integer**| Wallet&#39;s unique id. | [optional]
 **walletStatus** | **String**| Wallet&#39;s status:  * **validated**: Wallet is active. It is possible to deposit to or retrieve money from the wallet.  * **cancelled**: Wallet is closed. No action possible, there is no money in the wallet, it was closed by an operator or by the user.  * **pending**: Wallet being validated (e.g. suspected fraud, late submission of documents&#39; validation ... KYC ). In this case, it is not possible to use the wallet for transactions. | [optional]
 **userId** | **Integer**| Wallet owner&#39;s id. | [optional]
 **parentUserId** | **Integer**| Parent user id of the wallet owner | [optional]
 **walletTag** | **String**| Custom data. | [optional]
 **walletTypeId** | **Integer**| Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  | [optional]
 **eventAlias** | **String**| Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding  | [optional]
 **eventPayinStartDate** | **OffsetDateTime**|  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD HH:MM:SS | [optional]
 **eventPayinEndDate** | **OffsetDateTime**| Deadline to money deposit on the wallet. Format : YYYY-MM-DD HH:MM:SS  | [optional]
 **tariffId** | **Integer**| Wallet pricing id. | [optional]
 **payinCount** | **Integer**| Number of payin done on the wallet. | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWallets"></a>
# **postWallets**
> InlineResponse20028 postWallets(walletTypeId, tariffId, userId, currency, eventName, accessSignature, accessTag, accessUserId, accessUserIP, jointUserId, walletTag, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate)

create a wallet

Create a new wallet in the system..

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WalletApi apiInstance = new WalletApi();
Integer walletTypeId = 56; // Integer | Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) | 
Integer tariffId = 56; // Integer | Wallet pricing id.
Integer userId = 56; // Integer | Wallet owner's id.
String currency = "currency_example"; // String | The currency that will be used for all wallet money transactions format : ISO 4217 3-letter code for each currency : Euro = EUR ; US Dollar = USD Ã¢â‚¬Â¦ Default currency will be same as the wallet 
String eventName = "eventName_example"; // String | Event name that will be used as wallet name. For example, in a wedding list: Wedding of X and Y 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer accessUserIP = 56; // Integer | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer jointUserId = 56; // Integer | Wallet co-owner's id. This user will not be allowed to collect the money from the wallet. 
String walletTag = "walletTag_example"; // String | Custom data
String eventAlias = "eventAlias_example"; // String | Short url wallet name. It's automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet=mywedding. Please note that the eventAlias must be unique. 
LocalDate eventDate = LocalDate.now(); // LocalDate | Wallet event date. Format : YYYY-MM-DD. Default: Created date + 7 days. 
String eventMessage = "eventMessage_example"; // String | It can be a description of the wallet.
LocalDate eventPayinStartDate = LocalDate.now(); // LocalDate |  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD. If null, the default date will be the created date of the wallet.
LocalDate eventPayinEndDate = LocalDate.now(); // LocalDate | Deadline to money deposit on the wallet. Format : YYYY-MM-DD. If null, the money can be deposited indefinitely on the wallet 
try {
    InlineResponse20028 result = apiInstance.postWallets(walletTypeId, tariffId, userId, currency, eventName, accessSignature, accessTag, accessUserId, accessUserIP, jointUserId, walletTag, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#postWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletTypeId** | **Integer**| Wallet type id. The following values are defined:  | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  |
 **tariffId** | **Integer**| Wallet pricing id. |
 **userId** | **Integer**| Wallet owner&#39;s id. |
 **currency** | **String**| The currency that will be used for all wallet money transactions format : ISO 4217 3-letter code for each currency : Euro &#x3D; EUR ; US Dollar &#x3D; USD Ã¢â‚¬Â¦ Default currency will be same as the wallet  |
 **eventName** | **String**| Event name that will be used as wallet name. For example, in a wedding list: Wedding of X and Y  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIP** | **Integer**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **jointUserId** | **Integer**| Wallet co-owner&#39;s id. This user will not be allowed to collect the money from the wallet.  | [optional]
 **walletTag** | **String**| Custom data | [optional]
 **eventAlias** | **String**| Short url wallet name. It&#39;s automatically generated by the system, but it could be modified and customised by the user. For example: www.domain.com/wallet&#x3D;mywedding. Please note that the eventAlias must be unique.  | [optional]
 **eventDate** | **LocalDate**| Wallet event date. Format : YYYY-MM-DD. Default: Created date + 7 days.  | [optional]
 **eventMessage** | **String**| It can be a description of the wallet. | [optional]
 **eventPayinStartDate** | **LocalDate**|  Wallet activation date. The date from which you can deposit money on the wallet. Format : YYYY-MM-DD. If null, the default date will be the created date of the wallet. | [optional]
 **eventPayinEndDate** | **LocalDate**| Deadline to money deposit on the wallet. Format : YYYY-MM-DD. If null, the money can be deposited indefinitely on the wallet  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWallet"></a>
# **putWallet**
> InlineResponse20028 putWallet(id, accessSignature, accessTag, accessUserId, accessUserIp, walletTypeId, eventName, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, urlImage, imageName, tariffId)

update a wallet

Modifiy wallet information

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WalletApi apiInstance = new WalletApi();
Long id = 789L; // Long | Object internal id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String walletTypeId = "walletTypeId_example"; // String | Change wallet type id
String eventName = "eventName_example"; // String | Change event name
String eventAlias = "eventAlias_example"; // String | Change event alias. Please note that the eventAlias must be unique.
String eventDate = "eventDate_example"; // String | Change event date
String eventMessage = "eventMessage_example"; // String | Change event message
String eventPayinStartDate = "eventPayinStartDate_example"; // String | Change event payin starting date
String eventPayinEndDate = "eventPayinEndDate_example"; // String | Change event payin end date
String urlImage = "urlImage_example"; // String | Change URL image
String imageName = "imageName_example"; // String | Change image name
String tariffId = "tariffId_example"; // String | Change tariff id
try {
    InlineResponse20028 result = apiInstance.putWallet(id, accessSignature, accessTag, accessUserId, accessUserIp, walletTypeId, eventName, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, urlImage, imageName, tariffId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#putWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Object internal id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **walletTypeId** | **String**| Change wallet type id | [optional]
 **eventName** | **String**| Change event name | [optional]
 **eventAlias** | **String**| Change event alias. Please note that the eventAlias must be unique. | [optional]
 **eventDate** | **String**| Change event date | [optional]
 **eventMessage** | **String**| Change event message | [optional]
 **eventPayinStartDate** | **String**| Change event payin starting date | [optional]
 **eventPayinEndDate** | **String**| Change event payin end date | [optional]
 **urlImage** | **String**| Change URL image | [optional]
 **imageName** | **String**| Change image name | [optional]
 **tariffId** | **String**| Change tariff id | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

