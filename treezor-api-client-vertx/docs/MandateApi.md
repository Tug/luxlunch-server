# MandateApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMandate**](MandateApi.md#deleteMandate) | **DELETE** /mandates/{id} | revoke a mandate
[**getMandate**](MandateApi.md#getMandate) | **GET** /mandates/{id} | get mandate
[**getMandates**](MandateApi.md#getMandates) | **GET** /mandates | search mandates
[**mandatesIdResendOtpPut**](MandateApi.md#mandatesIdResendOtpPut) | **PUT** /mandates/{id}/ResendOtp/ | send an OTP
[**mandatesIdSignPut**](MandateApi.md#mandatesIdSignPut) | **PUT** /mandates/{id}/Sign/ | sign a mandate
[**postMandates**](MandateApi.md#postMandates) | **POST** /mandates | create a mandate


<a name="deleteMandate"></a>
# **deleteMandate**
> TreezorInlineResponse20014 deleteMandate(id, origin)

revoke a mandate

Change mandate&#39;s status to canceled.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MandateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MandateApi apiInstance = new MandateApi();
Integer id = 56; // Integer | Mandate's internal id.
String origin = "origin_example"; // String | The origin of the request for revocation
try {
    TreezorInlineResponse20014 result = apiInstance.deleteMandate(id, origin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MandateApi#deleteMandate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Mandate&#39;s internal id. |
 **origin** | **String**| The origin of the request for revocation | [enum: CREDITOR, DEBITOR]

### Return type

[**TreezorInlineResponse20014**](TreezorInlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMandate"></a>
# **getMandate**
> TreezorInlineResponse20014 getMandate(id)

get mandate

Get a mandate from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MandateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MandateApi apiInstance = new MandateApi();
Long id = 789L; // Long | Mandate's internal id.
try {
    TreezorInlineResponse20014 result = apiInstance.getMandate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MandateApi#getMandate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Mandate&#39;s internal id. |

### Return type

[**TreezorInlineResponse20014**](TreezorInlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMandates"></a>
# **getMandates**
> TreezorInlineResponse20014 getMandates(accessSignature, accessTag, accessUserId, accessUserIp, mandateId, userId, uniqueMandateReference, mandateStatus, filter)

search mandates

Get mandates that match search criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MandateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MandateApi apiInstance = new MandateApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Integer mandateId = 56; // Integer | Mandate's Id
Integer userId = 56; // Integer | User's id who initiates the mandate request.
String uniqueMandateReference = "uniqueMandateReference_example"; // String | Unique Mandate Reference (UMR) of the searched mandate. It is a sequence of characters that ensures the mandate traceability. UMR coupled with SCI allows to uniquely identify a creditor and a contract for any mandate. It is provided at the mandate creation.
String mandateStatus = "mandateStatus_example"; // String | Mandate's status. Possible values: * CANCELED * PENDING * VALIDATED 
String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filters should be separated by a \";\". Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \"fieldName criterion expression\". Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     >    |      greater than      |            alphanumeric string           |         100        |  |    >=    | greater or equal than  |            alphanumeric string           |         100        |  |     <    |        less than       |            alphanumeric string           |         100        |  |    <=    |   less or equal than   |            alphanumeric string           |         100        |  |    !=    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    ==    |         equals         |            alphanumeric string           |         100        | 
try {
    TreezorInlineResponse20014 result = apiInstance.getMandates(accessSignature, accessTag, accessUserId, accessUserIp, mandateId, userId, uniqueMandateReference, mandateStatus, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MandateApi#getMandates");
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
 **mandateId** | **Integer**| Mandate&#39;s Id | [optional]
 **userId** | **Integer**| User&#39;s id who initiates the mandate request. | [optional]
 **uniqueMandateReference** | **String**| Unique Mandate Reference (UMR) of the searched mandate. It is a sequence of characters that ensures the mandate traceability. UMR coupled with SCI allows to uniquely identify a creditor and a contract for any mandate. It is provided at the mandate creation. | [optional]
 **mandateStatus** | **String**| Mandate&#39;s status. Possible values: * CANCELED * PENDING * VALIDATED  | [optional]
 **filter** | **String**| You can filter the API response by using filter(s). Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional]

### Return type

[**TreezorInlineResponse20014**](TreezorInlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mandatesIdResendOtpPut"></a>
# **mandatesIdResendOtpPut**
> TreezorInlineResponse20014 mandatesIdResendOtpPut(id, accessToken, accessSignature, userId, accessTag, accessUserId, accessUserIp, debtorMobile)

send an OTP

Send an OTP to sign a specific mandate. The OTP will be sent to the user&#39;s mobile phone OR to a specific mobile phone number in the request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MandateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MandateApi apiInstance = new MandateApi();
Integer id = 56; // Integer | Mandate's id.
String accessToken = "accessToken_example"; // String | Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
Integer userId = 56; // Integer | User's id who initiates the mandate request.
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String debtorMobile = "debtorMobile_example"; // String | Debtor's mobile phone number. Used to send the OTP for signature
try {
    TreezorInlineResponse20014 result = apiInstance.mandatesIdResendOtpPut(id, accessToken, accessSignature, userId, accessTag, accessUserId, accessUserIp, debtorMobile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MandateApi#mandatesIdResendOtpPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Mandate&#39;s id. |
 **accessToken** | **String**| Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  |
 **userId** | **Integer**| User&#39;s id who initiates the mandate request. |
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **debtorMobile** | **String**| Debtor&#39;s mobile phone number. Used to send the OTP for signature | [optional]

### Return type

[**TreezorInlineResponse20014**](TreezorInlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="mandatesIdSignPut"></a>
# **mandatesIdSignPut**
> TreezorInlineResponse20014 mandatesIdSignPut(id, accessToken, accessSignature, userId, otp, accessTag, accessUserId, accessUserIp, debtorSignatureIp)

sign a mandate

Sign a mandate with the received OTP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MandateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MandateApi apiInstance = new MandateApi();
Integer id = 56; // Integer | Mandate's id.
String accessToken = "accessToken_example"; // String | Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication). 
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
Integer userId = 56; // Integer | User's is who initiates the mandate request.
String otp = "otp_example"; // String | The One-time password that the user got once mandate created.
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String debtorSignatureIp = "debtorSignatureIp_example"; // String | IP address from which the mandate will be signed.
try {
    TreezorInlineResponse20014 result = apiInstance.mandatesIdSignPut(id, accessToken, accessSignature, userId, otp, accessTag, accessUserId, accessUserIp, debtorSignatureIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MandateApi#mandatesIdSignPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Mandate&#39;s id. |
 **accessToken** | **String**| Access token must be defined here or in Authorization HTTP header. More info [here](https://agent.treezor.com/security-authentication).  |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  |
 **userId** | **Integer**| User&#39;s is who initiates the mandate request. |
 **otp** | **String**| The One-time password that the user got once mandate created. |
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **debtorSignatureIp** | **String**| IP address from which the mandate will be signed. | [optional]

### Return type

[**TreezorInlineResponse20014**](TreezorInlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postMandates"></a>
# **postMandates**
> TreezorInlineResponse20014 postMandates(sddType, isPaper, userId, debtorName, debtorAddress, debtorCity, debtorZipCode, debtorCountry, debtorIban, sequenceType, createdIp, accessSignature, accessTag, accessUserId, accessUserIp, debtorBic, signatureDate)

create a mandate

Create a new mandate in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MandateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MandateApi apiInstance = new MandateApi();
String sddType = "sddType_example"; // String | Type of mandate.  | Type | Description | | ---- | ----------- | | core | Sepa Direct Debit Core | | b2b | Sepa Direct Debit Business 2 Business  | 
Boolean isPaper = true; // Boolean | Indicate if it's a paper mandate or not
String userId = "userId_example"; // String | User's id who initiates the mandate request. The creditor.
String debtorName = "debtorName_example"; // String | Debtor's full name
String debtorAddress = "debtorAddress_example"; // String | Debtor's address.
String debtorCity = "debtorCity_example"; // String | Debtor's city.
String debtorZipCode = "debtorZipCode_example"; // String | Debtor's zip code
String debtorCountry = "debtorCountry_example"; // String | Debtor's country
String debtorIban = "debtorIban_example"; // String | Debtor's IBAN
String sequenceType = "sequenceType_example"; // String | Type of mandate.  | Type | Description | | ---- | ----------- | | one-off | One-off payment | | recurrent | Recurrent payment |  Default value: one-off. 
String createdIp = "createdIp_example"; // String | IP address of the system that created mandate.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String debtorBic = "debtorBic_example"; // String | Debtor's BIC (or SWIFT)
String signatureDate = "signatureDate_example"; // String | Signature date of the mandate. Required if is paper.
try {
    TreezorInlineResponse20014 result = apiInstance.postMandates(sddType, isPaper, userId, debtorName, debtorAddress, debtorCity, debtorZipCode, debtorCountry, debtorIban, sequenceType, createdIp, accessSignature, accessTag, accessUserId, accessUserIp, debtorBic, signatureDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MandateApi#postMandates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sddType** | **String**| Type of mandate.  | Type | Description | | ---- | ----------- | | core | Sepa Direct Debit Core | | b2b | Sepa Direct Debit Business 2 Business  |  | [enum: core, b2b]
 **isPaper** | **Boolean**| Indicate if it&#39;s a paper mandate or not |
 **userId** | **String**| User&#39;s id who initiates the mandate request. The creditor. |
 **debtorName** | **String**| Debtor&#39;s full name |
 **debtorAddress** | **String**| Debtor&#39;s address. |
 **debtorCity** | **String**| Debtor&#39;s city. |
 **debtorZipCode** | **String**| Debtor&#39;s zip code |
 **debtorCountry** | **String**| Debtor&#39;s country |
 **debtorIban** | **String**| Debtor&#39;s IBAN |
 **sequenceType** | **String**| Type of mandate.  | Type | Description | | ---- | ----------- | | one-off | One-off payment | | recurrent | Recurrent payment |  Default value: one-off.  |
 **createdIp** | **String**| IP address of the system that created mandate. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **debtorBic** | **String**| Debtor&#39;s BIC (or SWIFT) | [optional]
 **signatureDate** | **String**| Signature date of the mandate. Required if is paper. | [optional]

### Return type

[**TreezorInlineResponse20014**](TreezorInlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

