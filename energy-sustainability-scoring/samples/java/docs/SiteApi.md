# SiteApi

All URIs are relative to *https://se-exchange-uat-sandbox.apigee.net/openesx/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSites**](SiteApi.md#listSites) | **GET** /sites | List all Sites

<a name="listSites"></a>
# **listSites**
> List&lt;Site&gt; listSites()

List all Sites

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Oauth2AuthCode
OAuth Oauth2AuthCode = (OAuth) defaultClient.getAuthentication("Oauth2AuthCode");
Oauth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

SiteApi apiInstance = new SiteApi();
try {
    List<Site> result = apiInstance.listSites();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteApi#listSites");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Site&gt;**](Site.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

