# BeneficiariesApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBeneficiaries**](BeneficiariesApi.md#getBeneficiaries) | **GET** /beneficiaries | search beneficiary bank accounts
[**getBeneficiary**](BeneficiariesApi.md#getBeneficiary) | **GET** /beneficiaries/{id} | get a beneficiary bank account
[**postBeneficiary**](BeneficiariesApi.md#postBeneficiary) | **POST** /beneficiaries | create a beneficiary
[**putBeneficiary**](BeneficiariesApi.md#putBeneficiary) | **PUT** /beneficiaries/{id} | edit a beneficiary


<a name="getBeneficiaries"></a>
# **getBeneficiaries**
> InlineResponse2002 getBeneficiaries(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, id, userId, iban, bic, nickName, name, pageNumber, pageCount, sortBy, sortOrder)

search beneficiary bank accounts

Get beneficiary bank accounts that match search criteria.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BeneficiariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeneficiariesApi apiInstance = new BeneficiariesApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filterable fields are :  - id  - tag  - userId  - isActive  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  Filters should be separated by a \";\". Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \"fieldName criterion expression\". Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     >    |      greater than      |            alphanumeric string           |         100        |  |    >=    | greater or equal than  |            alphanumeric string           |         100        |  |     <    |        less than       |            alphanumeric string           |         100        |  |    <=    |   less or equal than   |            alphanumeric string           |         100        |  |    !=    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    ==    |         equals         |            alphanumeric string           |         100        | 
Integer id = 56; // Integer | Beneficiary bank account id.
Integer userId = 56; // Integer | Owner user's id. (deprecated, you must use the parameter filter)
String iban = "iban_example"; // String | Beneficiary bank account IBAN. (deprecated, you must use the parameter filter)
String bic = "bic_example"; // String | Beneficiary bank account BIC. (deprecated, you must use the parameter filter)
String nickName = "nickName_example"; // String | Beneficiary bank account's nick name. (deprecated, you must use the parameter filter)
String name = "name_example"; // String | Beneficiary bank account owner's name. (deprecated, you must use the parameter filter)
Integer pageNumber = 56; // Integer | Pagination page number. More info [here](https://agent.treezor.com/lists). 
Integer pageCount = 56; // Integer | The number of items per page. More info [here](https://agent.treezor.com/lists). 
String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists). 
String sortOrder = "sortOrder_example"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists). 
try {
    InlineResponse2002 result = apiInstance.getBeneficiaries(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, id, userId, iban, bic, nickName, name, pageNumber, pageCount, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeneficiariesApi#getBeneficiaries");
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
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]
 **filter** | **String**| You can filter the API response by using filter(s). Filterable fields are :  - id  - tag  - userId  - isActive  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters : FILTER1;FILTER2;FILTER3. A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;. Where :  - fieldName : the name of a filterable field of this object.   - expression : the values to be included or excluded (see the table below for more information)   - criterion : a filter criterion.  Here are the possible values for criterion :   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional]
 **id** | **Integer**| Beneficiary bank account id. | [optional]
 **userId** | **Integer**| Owner user&#39;s id. (deprecated, you must use the parameter filter) | [optional]
 **iban** | **String**| Beneficiary bank account IBAN. (deprecated, you must use the parameter filter) | [optional]
 **bic** | **String**| Beneficiary bank account BIC. (deprecated, you must use the parameter filter) | [optional]
 **nickName** | **String**| Beneficiary bank account&#39;s nick name. (deprecated, you must use the parameter filter) | [optional]
 **name** | **String**| Beneficiary bank account owner&#39;s name. (deprecated, you must use the parameter filter) | [optional]
 **pageNumber** | **Integer**| Pagination page number. More info [here](https://agent.treezor.com/lists).  | [optional]
 **pageCount** | **Integer**| The number of items per page. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_. More info [here](https://agent.treezor.com/lists).  | [optional]
 **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  Default value : DESC. More info [here](https://agent.treezor.com/lists).  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBeneficiary"></a>
# **getBeneficiary**
> InlineResponse2002 getBeneficiary(id, fields)

get a beneficiary bank account

Get a beneficiary bank account from the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BeneficiariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeneficiariesApi apiInstance = new BeneficiariesApi();
Long id = 789L; // Long | Beneficiary Bank Accounts internal id.
List<String> fields = Arrays.asList("fields_example"); // List<String> | List of the object's properties you want to pick up.
try {
    InlineResponse2002 result = apiInstance.getBeneficiary(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeneficiariesApi#getBeneficiary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Beneficiary Bank Accounts internal id. |
 **fields** | [**List&lt;String&gt;**](String.md)| List of the object&#39;s properties you want to pick up. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBeneficiary"></a>
# **postBeneficiary**
> InlineResponse2002 postBeneficiary(accessSignature, accessTag, accessUserId, accessUserIp, body)

create a beneficiary

Create a new benefeciary bank account in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BeneficiariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeneficiariesApi apiInstance = new BeneficiariesApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Body body = new Body(); // Body | 
try {
    InlineResponse2002 result = apiInstance.postBeneficiary(accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeneficiariesApi#postBeneficiary");
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
 **body** | [**Body**](Body.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putBeneficiary"></a>
# **putBeneficiary**
> InlineResponse2002 putBeneficiary(id, accessSignature, accessTag, accessUserId, accessUserIp, body)

edit a beneficiary

Edit a benefeciary bank account in the system.

### Example
```java
// Import classes:
//import com.treezor.sandbox.ApiClient;
//import com.treezor.sandbox.ApiException;
//import com.treezor.sandbox.Configuration;
//import com.treezor.sandbox.auth.*;
//import com.treezor.sandbox.api.BeneficiariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeneficiariesApi apiInstance = new BeneficiariesApi();
Integer id = 56; // Integer | Beneficiary's id.
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). 
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). 
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics). 
Body1 body = new Body1(); // Body1 | 
try {
    InlineResponse2002 result = apiInstance.putBeneficiary(id, accessSignature, accessTag, accessUserId, accessUserIp, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeneficiariesApi#putBeneficiary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Beneficiary&#39;s id. |
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).  | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics).  | [optional]
 **body** | [**Body1**](Body1.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

