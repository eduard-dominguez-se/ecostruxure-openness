# swagger_client.AssetApi

All URIs are relative to *https://se-exchange-uat-sandbox.apigee.net/openesx/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_meters**](AssetApi.md#list_meters) | **GET** /sites/{site-id}/meters | List all Meters

# **list_meters**
> list[Meter] list_meters(site_id)

List all Meters

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
api_instance = swagger_client.AssetApi(swagger_client.ApiClient(configuration))
site_id = 'site_id_example' # str | 

try:
    # List all Meters
    api_response = api_instance.list_meters(site_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AssetApi->list_meters: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **site_id** | **str**|  | 

### Return type

[**list[Meter]**](Meter.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

