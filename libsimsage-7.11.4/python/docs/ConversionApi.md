# openapi_client.ConversionApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preview_version**](ConversionApi.md#preview_version) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version
[**stt_version**](ConversionApi.md#stt_version) | **GET** /api/conversion/stt/version | Get speech-to-text Version
[**version7**](ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version


# **preview_version**
> SignInCmd preview_version()

Get preview-generator Version

Get the version of SimSage preview-generator.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_cmd import SignInCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionApi(api_client)

    try:
        # Get preview-generator Version
        api_response = api_instance.preview_version()
        print("The response of ConversionApi->preview_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionApi->preview_version: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get version |  -  |
**200** | the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stt_version**
> SignInCmd stt_version()

Get speech-to-text Version

Get the version of SimSage speech-to-text system.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_cmd import SignInCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionApi(api_client)

    try:
        # Get speech-to-text Version
        api_response = api_instance.stt_version()
        print("The response of ConversionApi->stt_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionApi->stt_version: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get version |  -  |
**200** | the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version7**
> SignInCmd version7()

Get Version

Get the version of SimSage Conversion Services.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_cmd import SignInCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionApi(api_client)

    try:
        # Get Version
        api_response = api_instance.version7()
        print("The response of ConversionApi->version7:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionApi->version7: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get version |  -  |
**200** | the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

