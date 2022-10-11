# AssetApi

All URIs are relative to *https://se-exchange-uat-sandbox.apigee.net/openesx/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMeters**](AssetApi.md#listMeters) | **GET** /sites/{site-id}/meters | List all Meters

<a name="listMeters"></a>
# **listMeters**
> List&lt;Meter&gt; listMeters(siteId)

List all Meters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AssetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Oauth2AuthCode
OAuth Oauth2AuthCode = (OAuth) defaultClient.getAuthentication("Oauth2AuthCode");
Oauth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

AssetApi apiInstance = new AssetApi();
String siteId = "siteId_example"; // String | 
try {
    List<Meter> result = apiInstance.listMeters(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#listMeters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |

### Return type

[**List&lt;Meter&gt;**](Meter.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

