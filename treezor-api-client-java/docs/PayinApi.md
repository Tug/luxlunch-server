# PayinApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePayin**](PayinApi.md#deletePayin) | **DELETE** /payins/{id} | delete a pay in
[**getPayin**](PayinApi.md#getPayin) | **GET** /payins/{id} | get a pay in
[**getPayins**](PayinApi.md#getPayins) | **GET** /payins | search pay ins
[**postPayin**](PayinApi.md#postPayin) | **POST** /payins | create a pay in


<a name="deletePayin"></a>
# **deletePayin**
> InlineResponse20017 deletePayin(id)

delete a pay in

Deactivate a payin in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayinApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinApi apiInstance = new PayinApi();
Long id = 789L; // Long | Payin's id.
try {
    InlineResponse20017 result = apiInstance.deletePayin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinApi#deletePayin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Payin&#39;s id. |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayin"></a>
# **getPayin**
> InlineResponse20017 getPayin(id)

get a pay in

Get a payin from the system by its id.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayinApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinApi apiInstance = new PayinApi();
Long id = 789L; // Long | Payin's id.
try {
    InlineResponse20017 result = apiInstance.getPayin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinApi#getPayin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Payin&#39;s id. |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayins"></a>
# **getPayins**
> InlineResponse20017 getPayins(accessSignature, accessTag, accessUserId, accessUserIP, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder)

search pay ins

Get payins that match search criteria.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayinApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinApi apiInstance = new PayinApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer accessUserIP = 56; // Integer | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer payinId = 56; // Integer | Payin's id.
Integer walletId = 56; // Integer | Payin's wallet id.
String payinTag = "payinTag_example"; // String | Client custom data.
String payinStatus = "payinStatus_example"; // String | Payins's status.
Integer userId = 56; // Integer | User's id who performed the operation (debited).
String userName = "userName_example"; // String | User's name who performed the operation (debited).
String userEmail = "userEmail_example"; // String | User's email who performed the operation (debited).
Integer beneficiaryUserId = 56; // Integer | User's id who received the operation (credited).
String eventAlias = "eventAlias_example"; // String | Wallet eventAlias of the payin (credited wallet).
Integer walletTypeId = 56; // Integer | Payin's wallet type id.
String paymentMethodId = "paymentMethodId_example"; // String | Payin's payment method id.
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : createdDate. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
try {
    InlineResponse20017 result = apiInstance.getPayins(accessSignature, accessTag, accessUserId, accessUserIP, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinApi#getPayins");
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
 **payinId** | **Integer**| Payin&#39;s id. | [optional]
 **walletId** | **Integer**| Payin&#39;s wallet id. | [optional]
 **payinTag** | **String**| Client custom data. | [optional]
 **payinStatus** | **String**| Payins&#39;s status. | [optional]
 **userId** | **Integer**| User&#39;s id who performed the operation (debited). | [optional]
 **userName** | **String**| User&#39;s name who performed the operation (debited). | [optional]
 **userEmail** | **String**| User&#39;s email who performed the operation (debited). | [optional]
 **beneficiaryUserId** | **Integer**| User&#39;s id who received the operation (credited). | [optional]
 **eventAlias** | **String**| Wallet eventAlias of the payin (credited wallet). | [optional]
 **walletTypeId** | **Integer**| Payin&#39;s wallet type id. | [optional]
 **paymentMethodId** | **String**| Payin&#39;s payment method id. | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : createdDate. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPayin"></a>
# **postPayin**
> InlineResponse20017 postPayin(walletId, userId, paymentMethodId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinTag, oneclickcardId, paymentAcceptedUrl, paymentWaitingUrl, paymentRefusedUrl, paymentCanceledUrl, paymentExceptionUrl, distributorFee, messageToUser, language, createdIp, payinDate, mandateId)

create a pay in

Create a new pay in in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.PayinApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayinApi apiInstance = new PayinApi();
Integer walletId = 56; // Integer | Credited wallet's ID
Integer userId = 56; // Integer | User's id who makes the pay in. NB : this parameter should should not be transmitted in the case of payin of method Sepa Direct Debit Core (21). It will be set automatically by the system. 
Integer paymentMethodId = 56; // Integer | | Id | Payment by | | ---| --- | | 3 | Check | | 11 | Card | | 14 | Oneclick card (without payment form) | | 21 | Sepa Direct Debit Core | | 23 | Full Hosted HTML Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized | | 24 | IFrame Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized| | 25 | Payment made through an SDK - You cannot directly create a payin directly with this method id. The payin will be automatically created by the system. | 
Float amount = 3.4F; // Float | Pay in amount.
String currency = "currency_example"; // String | Payin currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). Must be the same as the wallet's. 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String payinTag = "payinTag_example"; // String | Client custom data.
Integer oneclickcardId = 56; // Integer | Oneclick card's id. Mandatory if payment method is 14. Useless otherwise.
String paymentAcceptedUrl = "paymentAcceptedUrl_example"; // String | Url where cardholder is redirected if payment is successful. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory.
String paymentWaitingUrl = "paymentWaitingUrl_example"; // String | Url where cardholder is redirected to wait payment processing. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory.
String paymentRefusedUrl = "paymentRefusedUrl_example"; // String | Url where cardholder is redirected if payment is refused. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory.
String paymentCanceledUrl = "paymentCanceledUrl_example"; // String | Url where cardholder is redirected if payment is canceled. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory.
String paymentExceptionUrl = "paymentExceptionUrl_example"; // String | Url where cardholder is redirected if the payment process raised an exception. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory.
Float distributorFee = 3.4F; // Float | Distributor fee
String messageToUser = "messageToUser_example"; // String | Message to send to wallet's user. In the case of a Sepa Direct Debit Core payment method this parameter will be the reconciliation information transmitted to the Debtor (ie. Invoice number ...). In this case it cannot be more than 140 characters.
String language = "language_example"; // String | Language for the third party interface.
String createdIp = "createdIp_example"; // String | User's IP address
String payinDate = "payinDate_example"; // String | The date at which the SDD should be presented. This parameter is mandatory when performing a payin of method SDD Core. Format is YYYY-MM-DD The date should follow some requirements (Traget 2 working day) :    - Be a weekday (Monday to Friday)   - January 1st is excluded   - May 1st is excluded   - December 25 is excluded   - December 26th is excluded   - Easter day is excluded   - Easter Monday is excluded   - Good Friday is excluded 
Integer mandateId = 56; // Integer | The id of the mandate. This parameter is mandatory when performing a payin with method SDD Core.
try {
    InlineResponse20017 result = apiInstance.postPayin(walletId, userId, paymentMethodId, amount, currency, accessSignature, accessTag, accessUserId, accessUserIp, payinTag, oneclickcardId, paymentAcceptedUrl, paymentWaitingUrl, paymentRefusedUrl, paymentCanceledUrl, paymentExceptionUrl, distributorFee, messageToUser, language, createdIp, payinDate, mandateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayinApi#postPayin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **Integer**| Credited wallet&#39;s ID |
 **userId** | **Integer**| User&#39;s id who makes the pay in. NB : this parameter should should not be transmitted in the case of payin of method Sepa Direct Debit Core (21). It will be set automatically by the system.  |
 **paymentMethodId** | **Integer**| | Id | Payment by | | ---| --- | | 3 | Check | | 11 | Card | | 14 | Oneclick card (without payment form) | | 21 | Sepa Direct Debit Core | | 23 | Full Hosted HTML Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized | | 24 | IFrame Payment Form. Please note that if you use this paymentMethodId the flieds paymentAcceptedUrl, paymentRefusedUrl, paymentWaitingUrl, paymentCanceledUrl and paymentExceptionUrl are mandatory. CSS of the payment page can be customized| | 25 | Payment made through an SDK - You cannot directly create a payin directly with this method id. The payin will be automatically created by the system. |  |
 **amount** | **Float**| Pay in amount. |
 **currency** | **String**| Payin currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217). Must be the same as the wallet&#39;s.  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **payinTag** | **String**| Client custom data. | [optional]
 **oneclickcardId** | **Integer**| Oneclick card&#39;s id. Mandatory if payment method is 14. Useless otherwise. | [optional]
 **paymentAcceptedUrl** | **String**| Url where cardholder is redirected if payment is successful. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. | [optional]
 **paymentWaitingUrl** | **String**| Url where cardholder is redirected to wait payment processing. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. | [optional]
 **paymentRefusedUrl** | **String**| Url where cardholder is redirected if payment is refused. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. | [optional]
 **paymentCanceledUrl** | **String**| Url where cardholder is redirected if payment is canceled. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. | [optional]
 **paymentExceptionUrl** | **String**| Url where cardholder is redirected if the payment process raised an exception. When using paymentMethodId 23 and 24 an HTTPS URL is mandatory. | [optional]
 **distributorFee** | **Float**| Distributor fee | [optional]
 **messageToUser** | **String**| Message to send to wallet&#39;s user. In the case of a Sepa Direct Debit Core payment method this parameter will be the reconciliation information transmitted to the Debtor (ie. Invoice number ...). In this case it cannot be more than 140 characters. | [optional]
 **language** | **String**| Language for the third party interface. | [optional] [enum: FRA, GBR, ESP, ITA, PRT]
 **createdIp** | **String**| User&#39;s IP address | [optional]
 **payinDate** | **String**| The date at which the SDD should be presented. This parameter is mandatory when performing a payin of method SDD Core. Format is YYYY-MM-DD The date should follow some requirements (Traget 2 working day) :    - Be a weekday (Monday to Friday)   - January 1st is excluded   - May 1st is excluded   - December 25 is excluded   - December 26th is excluded   - Easter day is excluded   - Easter Monday is excluded   - Good Friday is excluded  | [optional]
 **mandateId** | **Integer**| The id of the mandate. This parameter is mandatory when performing a payin with method SDD Core. | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

