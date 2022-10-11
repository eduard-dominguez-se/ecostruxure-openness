# swagger_client.EnergyPerformanceApi

All URIs are relative to *https://se-exchange-uat-sandbox.apigee.net/openesx/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_certification_scores**](EnergyPerformanceApi.md#create_certification_scores) | **POST** /sites/{site-id}/certification-scores | Creates Certification Score resources
[**create_energy_certification**](EnergyPerformanceApi.md#create_energy_certification) | **POST** /sites/{site-id}/certification-providers | Creates an Certification Provider resource
[**list_metrics**](EnergyPerformanceApi.md#list_metrics) | **GET** /sites/{site-id}/timeseries | List all Metrics

# **create_certification_scores**
> list[CertificationScore] create_certification_scores(site_id, body=body)

Creates Certification Score resources

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: Oauth2AuthCode
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.EnergyPerformanceApi(swagger_client.ApiClient(configuration))
site_id = 'site_id_example' # str | 
body = [swagger_client.CertificationScore()] # list[CertificationScore] | Energy Score resource to be created (optional)

try:
    # Creates Certification Score resources
    api_response = api_instance.create_certification_scores(site_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EnergyPerformanceApi->create_certification_scores: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **site_id** | **str**|  | 
 **body** | [**list[CertificationScore]**](CertificationScore.md)| Energy Score resource to be created | [optional] 

### Return type

[**list[CertificationScore]**](CertificationScore.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_energy_certification**
> CertificationProvider create_energy_certification(site_id, body=body)

Creates an Certification Provider resource

Creates an Certification resource, to associate a site to an Certification Scoring Provider

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: Oauth2AuthCode
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.EnergyPerformanceApi(swagger_client.ApiClient(configuration))
site_id = 'site_id_example' # str | 
body = swagger_client.CertificationProvider() # CertificationProvider | Certification Provider resource to be created (optional)

try:
    # Creates an Certification Provider resource
    api_response = api_instance.create_energy_certification(site_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EnergyPerformanceApi->create_energy_certification: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **site_id** | **str**|  | 
 **body** | [**CertificationProvider**](CertificationProvider.md)| Certification Provider resource to be created | [optional] 

### Return type

[**CertificationProvider**](CertificationProvider.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_metrics**
> list[Timeserie] list_metrics(site_id, updated_at_gte=updated_at_gte, updated_at_lt=updated_at_lt)

List all Metrics

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: Oauth2AuthCode
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.EnergyPerformanceApi(swagger_client.ApiClient(configuration))
site_id = 'site_id_example' # str | 
updated_at_gte = '2013-10-20T19:20:30+01:00' # datetime |  (optional)
updated_at_lt = '2013-10-20T19:20:30+01:00' # datetime |  (optional)

try:
    # List all Metrics
    api_response = api_instance.list_metrics(site_id, updated_at_gte=updated_at_gte, updated_at_lt=updated_at_lt)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EnergyPerformanceApi->list_metrics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **site_id** | **str**|  | 
 **updated_at_gte** | **datetime**|  | [optional] 
 **updated_at_lt** | **datetime**|  | [optional] 

### Return type

[**list[Timeserie]**](Timeserie.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

