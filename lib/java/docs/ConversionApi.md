# ConversionApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**previewVersion**](ConversionApi.md#previewVersion) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version |
| [**sttVersion**](ConversionApi.md#sttVersion) | **GET** /api/conversion/stt/version | Get speech-to-text Version |
| [**version7**](ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version |


<a id="previewVersion"></a>
# **previewVersion**
> SignInCmd previewVersion()

Get preview-generator Version

Get the version of SimSage preview-generator.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConversionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    ConversionApi apiInstance = new ConversionApi(defaultClient);
    try {
      SignInCmd result = apiInstance.previewVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionApi#previewVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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
| **500** | could not get version |  -  |
| **200** | the version response |  -  |

<a id="sttVersion"></a>
# **sttVersion**
> SignInCmd sttVersion()

Get speech-to-text Version

Get the version of SimSage speech-to-text system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConversionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    ConversionApi apiInstance = new ConversionApi(defaultClient);
    try {
      SignInCmd result = apiInstance.sttVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionApi#sttVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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
| **500** | could not get version |  -  |
| **200** | the version response |  -  |

<a id="version7"></a>
# **version7**
> SignInCmd version7()

Get Version

Get the version of SimSage Conversion Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConversionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    ConversionApi apiInstance = new ConversionApi(defaultClient);
    try {
      SignInCmd result = apiInstance.version7();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionApi#version7");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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
| **500** | could not get version |  -  |
| **200** | the version response |  -  |

