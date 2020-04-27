# PayoutRefundsApi

All URIs are relative to *https://sandbox.treezor.com/v1/index.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayoutRefunds**](PayoutRefundsApi.md#getPayoutRefunds) | **GET** /payoutRefunds | search pay outs refund


<a name="getPayoutRefunds"></a>
# **getPayoutRefunds**
> TreezorInlineResponse20020 getPayoutRefunds(accessSignature, accessTag, accessUserId, accessUserIp, id, tag, codeStatus, informationStatus, payoutId, pageNumber)

search pay outs refund

Get pay out refund that match search criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayoutRefundsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PayoutRefundsApi apiInstance = new PayoutRefundsApi();
String accessSignature = "accessSignature_example"; // String | Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication).
String accessTag = "accessTag_example"; // String | Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics).
Integer accessUserId = 56; // Integer | Access user's id is used for user's action restriction. More info [here](https://agent.treezor.com/basics).
String accessUserIp = "accessUserIp_example"; // String | Access user's ip is used for user's action restriction. More info [here](https://agent.treezor.com/basics).
Integer id = 56; // Integer | PayoutRefund id
String tag = "tag_example"; // String | PayoutRefund tag
String codeStatus = "codeStatus_example"; // String | PayoutRefund Code Status
String informationStatus = "informationStatus_example"; // String | PayoutRefund Information Status
Integer payoutId = 56; // Integer | Payout Id
Integer pageNumber = 56; // Integer | The page number
try {
    TreezorInlineResponse20020 result = apiInstance.getPayoutRefunds(accessSignature, accessTag, accessUserId, accessUserIp, id, tag, codeStatus, informationStatus, payoutId, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutRefundsApi#getPayoutRefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessSignature** | **String**| Access signature can be mandatory for specific context. Treezor will contact you if so. More info [here](https://agent.treezor.com/security-authentication). | [optional]
 **accessTag** | **String**| Access tag is used for idem potency query. More info [here](https://agent.treezor.com/basics). | [optional]
 **accessUserId** | **Integer**| Access user&#39;s id is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). | [optional]
 **accessUserIp** | **String**| Access user&#39;s ip is used for user&#39;s action restriction. More info [here](https://agent.treezor.com/basics). | [optional]
 **id** | **Integer**| PayoutRefund id | [optional]
 **tag** | **String**| PayoutRefund tag | [optional]
 **codeStatus** | **String**| PayoutRefund Code Status | [optional]
 **informationStatus** | **String**| PayoutRefund Information Status | [optional]
 **payoutId** | **Integer**| Payout Id | [optional]
 **pageNumber** | **Integer**| The page number | [optional]

### Return type

[**TreezorInlineResponse20020**](TreezorInlineResponse20020.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

