# EnergyPerformanceApi

All URIs are relative to *https://se-exchange-uat-sandbox.apigee.net/openesx/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCertificationScores**](EnergyPerformanceApi.md#createCertificationScores) | **POST** /sites/{site-id}/certification-scores | Creates Certification Score resources
[**createEnergyCertification**](EnergyPerformanceApi.md#createEnergyCertification) | **POST** /sites/{site-id}/certification-providers | Creates an Certification Provider resource
[**listMetrics**](EnergyPerformanceApi.md#listMetrics) | **GET** /sites/{site-id}/timeseries | List all Metrics

<a name="createCertificationScores"></a>
# **createCertificationScores**
> List&lt;CertificationScore&gt; createCertificationScores(siteId, body)

Creates Certification Score resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnergyPerformanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Oauth2AuthCode
OAuth Oauth2AuthCode = (OAuth) defaultClient.getAuthentication("Oauth2AuthCode");
Oauth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

EnergyPerformanceApi apiInstance = new EnergyPerformanceApi();
String siteId = "siteId_example"; // String | 
List<CertificationScore> body = Arrays.asList(new CertificationScore()); // List<CertificationScore> | Energy Score resource to be created
try {
    List<CertificationScore> result = apiInstance.createCertificationScores(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnergyPerformanceApi#createCertificationScores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
 **body** | [**List&lt;CertificationScore&gt;**](CertificationScore.md)| Energy Score resource to be created | [optional]

### Return type

[**List&lt;CertificationScore&gt;**](CertificationScore.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEnergyCertification"></a>
# **createEnergyCertification**
> CertificationProvider createEnergyCertification(siteId, body)

Creates an Certification Provider resource

Creates an Certification resource, to associate a site to an Certification Scoring Provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnergyPerformanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Oauth2AuthCode
OAuth Oauth2AuthCode = (OAuth) defaultClient.getAuthentication("Oauth2AuthCode");
Oauth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

EnergyPerformanceApi apiInstance = new EnergyPerformanceApi();
String siteId = "siteId_example"; // String | 
CertificationProvider body = new CertificationProvider(); // CertificationProvider | Certification Provider resource to be created
try {
    CertificationProvider result = apiInstance.createEnergyCertification(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnergyPerformanceApi#createEnergyCertification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
 **body** | [**CertificationProvider**](CertificationProvider.md)| Certification Provider resource to be created | [optional]

### Return type

[**CertificationProvider**](CertificationProvider.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetrics"></a>
# **listMetrics**
> List&lt;Timeserie&gt; listMetrics(siteId, updatedAtGte, updatedAtLt)

List all Metrics

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnergyPerformanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Oauth2AuthCode
OAuth Oauth2AuthCode = (OAuth) defaultClient.getAuthentication("Oauth2AuthCode");
Oauth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

EnergyPerformanceApi apiInstance = new EnergyPerformanceApi();
String siteId = "siteId_example"; // String | 
OffsetDateTime updatedAtGte = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime updatedAtLt = new OffsetDateTime(); // OffsetDateTime | 
try {
    List<Timeserie> result = apiInstance.listMetrics(siteId, updatedAtGte, updatedAtLt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnergyPerformanceApi#listMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
 **updatedAtGte** | **OffsetDateTime**|  | [optional]
 **updatedAtLt** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;Timeserie&gt;**](Timeserie.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

