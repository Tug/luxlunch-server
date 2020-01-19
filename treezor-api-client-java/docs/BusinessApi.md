# BusinessApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessinformationsGet**](BusinessApi.md#businessinformationsGet) | **GET** /businessinformations | get business information
[**businesssearchsGet**](BusinessApi.md#businesssearchsGet) | **GET** /businesssearchs | search businesses


<a name="businessinformationsGet"></a>
# **businessinformationsGet**
> InlineResponse2004 businessinformationsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, externalId, registrationNumber, vatNumber)

get business information

The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
String country = "country_example"; // String | In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String externalId = "externalId_example"; // String | External unique business id. As given in businesssearch reponse.
String registrationNumber = "registrationNumber_example"; // String | Unique business registration number.
String vatNumber = "vatNumber_example"; // String | Unique business VAT number.
try {
    InlineResponse2004 result = apiInstance.businessinformationsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, externalId, registrationNumber, vatNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#businessinformationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **externalId** | **String**| External unique business id. As given in businesssearch reponse. | [optional]
 **registrationNumber** | **String**| Unique business registration number. | [optional]
 **vatNumber** | **String**| Unique business VAT number. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="businesssearchsGet"></a>
# **businesssearchsGet**
> List&lt;InlineResponse2003&gt; businesssearchsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode)

search businesses

The search endpoint returns some business information. 

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
String country = "country_example"; // String | In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String nameExact = "nameExact_example"; // String | Business exact name. Exclusive with nameMatchBeginning and nameClosestKeywords. 
String nameMatchBeginning = "nameMatchBeginning_example"; // String | Business names begin with. Exclusive with nameExact and nameClosestKeywords. 
String nameClosestKeywords = "nameClosestKeywords_example"; // String | Business names closed to keywords. Exclusive with nameExact and nameMatchBeginning. 
String registrationNumber = "registrationNumber_example"; // String | Business registration number.
String vatNumber = "vatNumber_example"; // String | Business VAT number.
String phoneNumber = "phoneNumber_example"; // String | Business phone number.
String addressStreet = "addressStreet_example"; // String | Business' street address.
String addressCity = "addressCity_example"; // String | Business' city address.
String addressPostalCode = "addressPostalCode_example"; // String | Business' postal code address.
try {
    List<InlineResponse2003> result = apiInstance.businesssearchsGet(country, accessSignature, accessTag, accessUserId, accessUserIp, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#businesssearchsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| In which country to search. Format [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **nameExact** | **String**| Business exact name. Exclusive with nameMatchBeginning and nameClosestKeywords.  | [optional]
 **nameMatchBeginning** | **String**| Business names begin with. Exclusive with nameExact and nameClosestKeywords.  | [optional]
 **nameClosestKeywords** | **String**| Business names closed to keywords. Exclusive with nameExact and nameMatchBeginning.  | [optional]
 **registrationNumber** | **String**| Business registration number. | [optional]
 **vatNumber** | **String**| Business VAT number. | [optional]
 **phoneNumber** | **String**| Business phone number. | [optional]
 **addressStreet** | **String**| Business&#39; street address. | [optional]
 **addressCity** | **String**| Business&#39; city address. | [optional]
 **addressPostalCode** | **String**| Business&#39; postal code address. | [optional]

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

