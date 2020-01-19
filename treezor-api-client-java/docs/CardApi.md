# CardApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardimagesGet**](CardApi.md#cardimagesGet) | **GET** /cardimages | get a card image
[**cardsCreateVirtualPost**](CardApi.md#cardsCreateVirtualPost) | **POST** /cards/CreateVirtual | create a virtual card
[**cardsGet**](CardApi.md#cardsGet) | **GET** /cards | search cards
[**cardsIdActivatePut**](CardApi.md#cardsIdActivatePut) | **PUT** /cards/{id}/Activate/ | activate a card
[**cardsIdChangePINPut**](CardApi.md#cardsIdChangePINPut) | **PUT** /cards/{id}/ChangePIN/ | change card&#39;s PIN
[**cardsIdConvertVirtualPut**](CardApi.md#cardsIdConvertVirtualPut) | **PUT** /cards/{id}/ConvertVirtual/ | convert card to virtual
[**cardsIdGet**](CardApi.md#cardsIdGet) | **GET** /cards/{id} | get a card
[**cardsIdLimitsPut**](CardApi.md#cardsIdLimitsPut) | **PUT** /cards/{id}/Limits/ | update card&#39;s limits
[**cardsIdLockUnlockPut**](CardApi.md#cardsIdLockUnlockPut) | **PUT** /cards/{id}/LockUnlock/ | update card&#39;s blocking status
[**cardsIdOptionsPut**](CardApi.md#cardsIdOptionsPut) | **PUT** /cards/{id}/Options/ | update card&#39;s options
[**cardsIdPut**](CardApi.md#cardsIdPut) | **PUT** /cards/{id} | update card informations
[**cardsIdRegeneratePut**](CardApi.md#cardsIdRegeneratePut) | **PUT** /cards/{id}/Regenerate/ | regenerate card
[**cardsIdSetPINPut**](CardApi.md#cardsIdSetPINPut) | **PUT** /cards/{id}/setPIN/ | set card&#39;s PIN
[**cardsIdUnblockPINPut**](CardApi.md#cardsIdUnblockPINPut) | **PUT** /cards/{id}/UnblockPIN/ | unblock card&#39;s PIN
[**cardsRegister3DSPost**](CardApi.md#cardsRegister3DSPost) | **POST** /cards/Register3DS | Register 3D secure
[**cardsRequestPhysicalPost**](CardApi.md#cardsRequestPhysicalPost) | **POST** /cards/RequestPhysical | create a physical card


<a name="cardimagesGet"></a>
# **cardimagesGet**
> InlineResponse2006 cardimagesGet(cardId, accessSignature, accessTag, accessUserId, accessUserIp)

get a card image

Return virtual card&#39;s image

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer cardId = 56; // Integer | Vitual card's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2006 result = apiInstance.cardimagesGet(cardId, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardimagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **Integer**| Vitual card&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsCreateVirtualPost"></a>
# **cardsCreateVirtualPost**
> InlineResponse2005 cardsCreateVirtualPost(userId, walletId, permsGroup, cardPrint, accessSignature, cardTag, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp)

create a virtual card

Create a new virtual card. To use a card you will need to activate it (/cards/{id}/Activate/).

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer userId = 56; // Integer | User's id of cardholder
Integer walletId = 56; // Integer | Wallet's Id in which to create the card
String permsGroup = "permsGroup_example"; // String | Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK| 
String cardPrint = "cardPrint_example"; // String | Card appareance code, also used to choose the program ID of the card
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String cardTag = "cardTag_example"; // String | Custom field
Integer batchDeliveryId = 56; // Integer | Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL
Integer limitAtmYear = 56; // Integer | ATM operations limit for a sliding year. No default value.
Integer limitAtmMonth = 56; // Integer | ATM operations limit for a sliding month. No default value.
Integer limitAtmWeek = 56; // Integer | ATM operations limit for a sliding week. Default value 2000â‚¬.
Integer limitAtmDay = 56; // Integer | ATM operations limit for a single day. Default value 1000â‚¬.
Integer limitAtmAll = 56; // Integer | ATM operations limit from beginning. No default value.
Integer limitPaymentYear = 56; // Integer | POS operations limit for a sliding year. No default value.
Integer limitPaymentMonth = 56; // Integer | POS operations limit for a sliding month. No default value.
Integer limitPaymentWeek = 56; // Integer | POS operations limit for a sliding week. Default value 3000â‚¬.
Integer limitPaymentDay = 56; // Integer | POS operations limit for a single day. Default value 2000â‚¬.
Integer limitPaymentAll = 56; // Integer | POS operations limit from beginning. No default value.
Float paymentDailyLimit = 3.4F; // Float | POS operations limit for a single day including cents. The decimal delimiter must be \".\". No default value.
String pin = "pin_example"; // String | Card's PIN code value.
Integer anonymous = 56; // Integer | Card is anonymous. If value is 1 there will be no embossed name.
Integer sendToParent = 56; // Integer | If you put the value 1 the delivery address will be the parent user's.
Integer mccRestrictionGroupId = 56; // Integer | mccRestrictionGroupId you want to apply
Integer merchantRestrictionGroupId = 56; // Integer | merchantRestrictionGroupId you want to apply
Integer countryRestrictionGroupId = 56; // Integer | countryRestrictionGroupId you want to apply
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsCreateVirtualPost(userId, walletId, permsGroup, cardPrint, accessSignature, cardTag, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsCreateVirtualPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| User&#39;s id of cardholder |
 **walletId** | **Integer**| Wallet&#39;s Id in which to create the card |
 **permsGroup** | **String**| Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  |
 **cardPrint** | **String**| Card appareance code, also used to choose the program ID of the card |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **cardTag** | **String**| Custom field | [optional]
 **batchDeliveryId** | **Integer**| Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL | [optional]
 **limitAtmYear** | **Integer**| ATM operations limit for a sliding year. No default value. | [optional]
 **limitAtmMonth** | **Integer**| ATM operations limit for a sliding month. No default value. | [optional]
 **limitAtmWeek** | **Integer**| ATM operations limit for a sliding week. Default value 2000â‚¬. | [optional]
 **limitAtmDay** | **Integer**| ATM operations limit for a single day. Default value 1000â‚¬. | [optional]
 **limitAtmAll** | **Integer**| ATM operations limit from beginning. No default value. | [optional]
 **limitPaymentYear** | **Integer**| POS operations limit for a sliding year. No default value. | [optional]
 **limitPaymentMonth** | **Integer**| POS operations limit for a sliding month. No default value. | [optional]
 **limitPaymentWeek** | **Integer**| POS operations limit for a sliding week. Default value 3000â‚¬. | [optional]
 **limitPaymentDay** | **Integer**| POS operations limit for a single day. Default value 2000â‚¬. | [optional]
 **limitPaymentAll** | **Integer**| POS operations limit from beginning. No default value. | [optional]
 **paymentDailyLimit** | **Float**| POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. | [optional]
 **pin** | **String**| Card&#39;s PIN code value. | [optional]
 **anonymous** | **Integer**| Card is anonymous. If value is 1 there will be no embossed name. | [optional]
 **sendToParent** | **Integer**| If you put the value 1 the delivery address will be the parent user&#39;s. | [optional]
 **mccRestrictionGroupId** | **Integer**| mccRestrictionGroupId you want to apply | [optional]
 **merchantRestrictionGroupId** | **Integer**| merchantRestrictionGroupId you want to apply | [optional]
 **countryRestrictionGroupId** | **Integer**| countryRestrictionGroupId you want to apply | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsGet"></a>
# **cardsGet**
> InlineResponse2005 cardsGet(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

search cards

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer cardId = 56; // Integer | Card's id
Integer userId = 56; // Integer | User's id of cardholder
String embossedName = "embossedName_example"; // String | Embossed name of the card
String publicToken = "publicToken_example"; // String | Public token of the card
String permsGroup = "permsGroup_example"; // String | Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK| 
Integer isPhysical = 56; // Integer | | Value | Type | | --- | --- | | 1 | Physical card| | 0 | Virtual card | 
Integer isConverted = 56; // Integer | | Value | Type | | --- | --- | | 1 | Physical card converted in a virtual card| | 0 | Not converted | 
Integer lockStatus = 56; // Integer | | Value | Type | | --- | --- | | 1 | Card blocked | | 0 | Card Unblocked | | 2 | Lost card | | 3 | Stolen card | 
Integer mccRestrictionGroupId = 56; // Integer | mccRestrictionGroupId of the card
Integer merchantRestrictionGroupId = 56; // Integer | merchantRestrictionGroupId of the card
Integer countryRestrictionGroupId = 56; // Integer | countryRestrictionGroupId of the card
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists) 
try {
    InlineResponse2005 result = apiInstance.cardsGet(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsGet");
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
 **cardId** | **Integer**| Card&#39;s id | [optional]
 **userId** | **Integer**| User&#39;s id of cardholder | [optional]
 **embossedName** | **String**| Embossed name of the card | [optional]
 **publicToken** | **String**| Public token of the card | [optional]
 **permsGroup** | **String**| Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  | [optional]
 **isPhysical** | **Integer**| | Value | Type | | --- | --- | | 1 | Physical card| | 0 | Virtual card |  | [optional]
 **isConverted** | **Integer**| | Value | Type | | --- | --- | | 1 | Physical card converted in a virtual card| | 0 | Not converted |  | [optional]
 **lockStatus** | **Integer**| | Value | Type | | --- | --- | | 1 | Card blocked | | 0 | Card Unblocked | | 2 | Lost card | | 3 | Stolen card |  | [optional]
 **mccRestrictionGroupId** | **Integer**| mccRestrictionGroupId of the card | [optional]
 **merchantRestrictionGroupId** | **Integer**| merchantRestrictionGroupId of the card | [optional]
 **countryRestrictionGroupId** | **Integer**| countryRestrictionGroupId of the card | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]
 **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]
 **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS. More info [here](https://agent.treezor.com/lists)  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdActivatePut"></a>
# **cardsIdActivatePut**
> InlineResponse2005 cardsIdActivatePut(id, accessToken, accessSignature, accessTag, accessUserId, accessUserIp)

activate a card

The Activate endpoint change card status to activate. An activated card can be freely used. 

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String accessToken = "accessToken_example"; // String | Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdActivatePut(id, accessToken, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdActivatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **accessToken** | **String**| Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdChangePINPut"></a>
# **cardsIdChangePINPut**
> InlineResponse2005 cardsIdChangePINPut(id, currentPIN, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp)

change card&#39;s PIN

Change card&#39;s PIN code knowing the current one.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String currentPIN = "currentPIN_example"; // String | Card's current PIN
String newPIN = "newPIN_example"; // String | Card's new PIN
String confirmPIN = "confirmPIN_example"; // String | Card's new PIN confirmation value
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdChangePINPut(id, currentPIN, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdChangePINPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **currentPIN** | **String**| Card&#39;s current PIN |
 **newPIN** | **String**| Card&#39;s new PIN |
 **confirmPIN** | **String**| Card&#39;s new PIN confirmation value |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdConvertVirtualPut"></a>
# **cardsIdConvertVirtualPut**
> InlineResponse2005 cardsIdConvertVirtualPut(id, accessSignature, accessTag, accessUserId, accessUserIp)

convert card to virtual

Convert a virtual card into a physical one. The converted card will be both virtual and physical. 

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdConvertVirtualPut(id, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdConvertVirtualPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdGet"></a>
# **cardsIdGet**
> InlineResponse2005 cardsIdGet(id)

get a card

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Long id = 789L; // Long | Card's id.
try {
    InlineResponse2005 result = apiInstance.cardsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Card&#39;s id. |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdLimitsPut"></a>
# **cardsIdLimitsPut**
> InlineResponse2005 cardsIdLimitsPut(id, accessSignature, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, accessTag, accessUserId, accessUserIp)

update card&#39;s limits

Update of the card limits.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
Integer limitAtmYear = 56; // Integer | ATM year limit
Integer limitAtmMonth = 56; // Integer | ATM month limit
Integer limitAtmWeek = 56; // Integer | ATM week limit
Integer limitAtmDay = 56; // Integer | ATM day limit
Integer limitAtmAll = 56; // Integer | ATM from beginning limit
Integer limitPaymentYear = 56; // Integer | Payment year limit
Integer limitPaymentMonth = 56; // Integer | Payment month limit
Integer limitPaymentWeek = 56; // Integer | Payment week limit
Integer limitPaymentDay = 56; // Integer | Payment day limit
Integer limitPaymentAll = 56; // Integer | Payment from beginning limit
Float paymentDailyLimit = 3.4F; // Float | Payment day limit including cents. The decimal delimiter must be \".\"
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdLimitsPut(id, accessSignature, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdLimitsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **limitAtmYear** | **Integer**| ATM year limit | [optional]
 **limitAtmMonth** | **Integer**| ATM month limit | [optional]
 **limitAtmWeek** | **Integer**| ATM week limit | [optional]
 **limitAtmDay** | **Integer**| ATM day limit | [optional]
 **limitAtmAll** | **Integer**| ATM from beginning limit | [optional]
 **limitPaymentYear** | **Integer**| Payment year limit | [optional]
 **limitPaymentMonth** | **Integer**| Payment month limit | [optional]
 **limitPaymentWeek** | **Integer**| Payment week limit | [optional]
 **limitPaymentDay** | **Integer**| Payment day limit | [optional]
 **limitPaymentAll** | **Integer**| Payment from beginning limit | [optional]
 **paymentDailyLimit** | **Float**| Payment day limit including cents. The decimal delimiter must be \&quot;.\&quot; | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdLockUnlockPut"></a>
# **cardsIdLockUnlockPut**
> InlineResponse2005 cardsIdLockUnlockPut(id, lockStatus, accessSignature, accessTag, accessUserId, accessUserIp)

update card&#39;s blocking status

Block or unblock a card.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
Integer lockStatus = 56; // Integer | | Value | Type | | --- | --- | | 1 | Block the card| | 0 | Unblock the card | | 2 | Lost card | | 3 | Stolen card | 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdLockUnlockPut(id, lockStatus, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdLockUnlockPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **lockStatus** | **Integer**| | Value | Type | | --- | --- | | 1 | Block the card| | 0 | Unblock the card | | 2 | Lost card | | 3 | Stolen card |  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdOptionsPut"></a>
# **cardsIdOptionsPut**
> InlineResponse2005 cardsIdOptionsPut(id, foreign, online, atm, nfc, accessSignature, accessTag, accessUserId, accessUserIp)

update card&#39;s options

Allows to update card&#39;s permission group.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
Integer foreign = 56; // Integer | Card usable abroad
Integer online = 56; // Integer | Card usable on-line
Integer atm = 56; // Integer | Card usable on ATM (withdrawals)
Integer nfc = 56; // Integer | Card usable on contactless compatible POS machine machine\"
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdOptionsPut(id, foreign, online, atm, nfc, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdOptionsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **foreign** | **Integer**| Card usable abroad |
 **online** | **Integer**| Card usable on-line |
 **atm** | **Integer**| Card usable on ATM (withdrawals) |
 **nfc** | **Integer**| Card usable on contactless compatible POS machine machine\&quot; |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdPut"></a>
# **cardsIdPut**
> InlineResponse2005 cardsIdPut(id, accessSignature, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp)

update card informations

Actually update mccRestrictionGroupId and merchantRestrictionGroupId of a card

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
Integer mccRestrictionGroupId = 56; // Integer | card's mccRestrictionGroupId
Integer merchantRestrictionGroupId = 56; // Integer | card's merchantRestrictionGroupId
Integer countryRestrictionGroupId = 56; // Integer | card's countryRestrictionGroupId
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdPut(id, accessSignature, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **mccRestrictionGroupId** | **Integer**| card&#39;s mccRestrictionGroupId | [optional]
 **merchantRestrictionGroupId** | **Integer**| card&#39;s merchantRestrictionGroupId | [optional]
 **countryRestrictionGroupId** | **Integer**| card&#39;s countryRestrictionGroupId | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdRegeneratePut"></a>
# **cardsIdRegeneratePut**
> InlineResponse2005 cardsIdRegeneratePut(id, accessSignature, accessTag, accessUserId, accessUserIp)

regenerate card

If card is Lost or Stolen (card&#39;s status), the card itself will get regenerated. Otherwise only the card image gets recreated. 

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdRegeneratePut(id, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdRegeneratePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdSetPINPut"></a>
# **cardsIdSetPINPut**
> InlineResponse2005 cardsIdSetPINPut(id, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp)

set card&#39;s PIN

Overwrite card&#39;s PIN.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String newPIN = "newPIN_example"; // String | Card's new PIN.
String confirmPIN = "confirmPIN_example"; // String | Card's new PIN confirmation value
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdSetPINPut(id, newPIN, confirmPIN, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdSetPINPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **newPIN** | **String**| Card&#39;s new PIN. |
 **confirmPIN** | **String**| Card&#39;s new PIN confirmation value |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsIdUnblockPINPut"></a>
# **cardsIdUnblockPINPut**
> InlineResponse2005 cardsIdUnblockPINPut(id, accessSignature, accessTag, accessUserId, accessUserIp)

unblock card&#39;s PIN

Unblock card&#39;s PIN code.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer id = 56; // Integer | Card's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsIdUnblockPINPut(id, accessSignature, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsIdUnblockPINPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Card&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsRegister3DSPost"></a>
# **cardsRegister3DSPost**
> InlineResponse2005 cardsRegister3DSPost(cardId, accessSignature)

Register 3D secure

Register a card to 3D secure service. The user&#39;s mobile number must begin by \&quot;+\&quot;, or \&quot;00\&quot;, and the country dialing code.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer cardId = 56; // Integer | Card's ID to register
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).
try {
    InlineResponse2005 result = apiInstance.cardsRegister3DSPost(cardId, accessSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsRegister3DSPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **Integer**| Card&#39;s ID to register |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cardsRequestPhysicalPost"></a>
# **cardsRequestPhysicalPost**
> InlineResponse2005 cardsRequestPhysicalPost(userId, walletId, permsGroup, cardTag, cardPrint, accessSignature, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp)

create a physical card

Create a new physical card. To use a card you will need to activate it (/cards/{id}/Activate/).

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Integer userId = 56; // Integer | User's id of cardholder
Integer walletId = 56; // Integer | Wallet's Id in which to create the card
String permsGroup = "permsGroup_example"; // String | Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK| 
String cardTag = "cardTag_example"; // String | Custom field
String cardPrint = "cardPrint_example"; // String | Card appearance code, also used to choose the program ID of the card
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
Integer batchDeliveryId = 56; // Integer | Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL
Integer limitAtmYear = 56; // Integer | ATM operations limit for a sliding year. No default value.
Integer limitAtmMonth = 56; // Integer | ATM operations limit for a sliding month. No default value.
Integer limitAtmWeek = 56; // Integer | ATM operations limit for a sliding week. Default value 2000â‚¬.
Integer limitAtmDay = 56; // Integer | ATM operations limit for a single day. Default value 1000â‚¬.
Integer limitAtmAll = 56; // Integer | ATM operations limit from beginning. No default value.
Integer limitPaymentYear = 56; // Integer | POS operations limit for a sliding year. No default value.
Integer limitPaymentMonth = 56; // Integer | POS operations limit for a sliding month. No default value.
Integer limitPaymentWeek = 56; // Integer | POS operations limit for a sliding week. Default value 3000â‚¬.
Integer limitPaymentDay = 56; // Integer | POS operations limit for a single day. Default value 2000â‚¬.
Integer limitPaymentAll = 56; // Integer | POS operations limit from beginning. No default value.
Float paymentDailyLimit = 3.4F; // Float | POS operations limit for a single day including cents. The decimal delimiter must be \".\". No default value.
String pin = "pin_example"; // String | Card's PIN code value. Default random PIN.
Integer anonymous = 56; // Integer | Card is anonymous. If value is 1 there will be no embossed name.
Integer sendToParent = 56; // Integer | If you put the value 1 the delivery address will be the parent user's.
Integer mccRestrictionGroupId = 56; // Integer | mccRestrictionGroupId you want to apply
Integer merchantRestrictionGroupId = 56; // Integer | merchantRestrictionGroupId you want to apply
Integer countryRestrictionGroupId = 56; // Integer | countryRestrictionGroupId you want to apply
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
try {
    InlineResponse2005 result = apiInstance.cardsRequestPhysicalPost(userId, walletId, permsGroup, cardTag, cardPrint, accessSignature, batchDeliveryId, limitAtmYear, limitAtmMonth, limitAtmWeek, limitAtmDay, limitAtmAll, limitPaymentYear, limitPaymentMonth, limitPaymentWeek, limitPaymentDay, limitPaymentAll, paymentDailyLimit, pin, anonymous, sendToParent, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, accessTag, accessUserId, accessUserIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#cardsRequestPhysicalPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| User&#39;s id of cardholder |
 **walletId** | **Integer**| Wallet&#39;s Id in which to create the card |
 **permsGroup** | **String**| Permissions group of the card. There is 4 usages which create 16 possible groups:  | group | NFC | ATM | On-line | Foreign | |-----|-----|-----|-----|------| |TRZ-CU-001|KO|KO|KO|KO| |TRZ-CU-002|KO|KO|KO|OK| |TRZ-CU-003|KO|KO|OK|KO| |TRZ-CU-004|KO|KO|OK|OK| |TRZ-CU-005|KO|OK|KO|KO| |TRZ-CU-006|KO|OK|KO|OK| |TRZ-CU-007|KO|OK|OK|KO| |TRZ-CU-008|KO|OK|OK|OK| |TRZ-CU-009|OK|KO|KO|KO| |TRZ-CU-010|OK|KO|KO|OK| |TRZ-CU-011|OK|KO|OK|KO| |TRZ-CU-012|OK|KO|OK|OK| |TRZ-CU-013|OK|OK|KO|KO| |TRZ-CU-014|OK|OK|KO|OK| |TRZ-CU-015|OK|OK|OK|KO| |TRZ-CU-016|OK|OK|OK|OK|  |
 **cardTag** | **String**| Custom field |
 **cardPrint** | **String**| Card appearance code, also used to choose the program ID of the card |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **batchDeliveryId** | **Integer**| Batch regroupement identifier (must be between 1 and 238327) NOT YET OPERATIONAL | [optional]
 **limitAtmYear** | **Integer**| ATM operations limit for a sliding year. No default value. | [optional]
 **limitAtmMonth** | **Integer**| ATM operations limit for a sliding month. No default value. | [optional]
 **limitAtmWeek** | **Integer**| ATM operations limit for a sliding week. Default value 2000â‚¬. | [optional]
 **limitAtmDay** | **Integer**| ATM operations limit for a single day. Default value 1000â‚¬. | [optional]
 **limitAtmAll** | **Integer**| ATM operations limit from beginning. No default value. | [optional]
 **limitPaymentYear** | **Integer**| POS operations limit for a sliding year. No default value. | [optional]
 **limitPaymentMonth** | **Integer**| POS operations limit for a sliding month. No default value. | [optional]
 **limitPaymentWeek** | **Integer**| POS operations limit for a sliding week. Default value 3000â‚¬. | [optional]
 **limitPaymentDay** | **Integer**| POS operations limit for a single day. Default value 2000â‚¬. | [optional]
 **limitPaymentAll** | **Integer**| POS operations limit from beginning. No default value. | [optional]
 **paymentDailyLimit** | **Float**| POS operations limit for a single day including cents. The decimal delimiter must be \&quot;.\&quot;. No default value. | [optional]
 **pin** | **String**| Card&#39;s PIN code value. Default random PIN. | [optional]
 **anonymous** | **Integer**| Card is anonymous. If value is 1 there will be no embossed name. | [optional]
 **sendToParent** | **Integer**| If you put the value 1 the delivery address will be the parent user&#39;s. | [optional]
 **mccRestrictionGroupId** | **Integer**| mccRestrictionGroupId you want to apply | [optional]
 **merchantRestrictionGroupId** | **Integer**| merchantRestrictionGroupId you want to apply | [optional]
 **countryRestrictionGroupId** | **Integer**| countryRestrictionGroupId you want to apply | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

