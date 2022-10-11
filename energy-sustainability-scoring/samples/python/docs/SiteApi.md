# swagger_client.SiteApi

All URIs are relative to *https://se-exchange-uat-sandbox.apigee.net/openesx/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_sites**](SiteApi.md#list_sites) | **GET** /sites | List all Sites

# **list_sites**
> list[Site] list_sites()

List all Sites

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
api_instance = swagger_client.SiteApi(swagger_client.ApiClient(configuration))

try:
    # List all Sites
    api_response = api_instance.list_sites()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SiteApi->list_sites: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Site]**](Site.md)

### Authorization

[Oauth2AuthCode](../README.md#Oauth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

