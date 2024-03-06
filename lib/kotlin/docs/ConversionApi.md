# ConversionApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**previewVersion**](ConversionApi.md#previewVersion) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version
[**sttVersion**](ConversionApi.md#sttVersion) | **GET** /api/conversion/stt/version | Get speech-to-text Version
[**version7**](ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version


<a id="previewVersion"></a>
# **previewVersion**
> SignInCmd previewVersion()

Get preview-generator Version

Get the version of SimSage preview-generator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionApi()
try {
    val result : SignInCmd = apiInstance.previewVersion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionApi#previewVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionApi#previewVersion")
    e.printStackTrace()
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

<a id="sttVersion"></a>
# **sttVersion**
> SignInCmd sttVersion()

Get speech-to-text Version

Get the version of SimSage speech-to-text system.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionApi()
try {
    val result : SignInCmd = apiInstance.sttVersion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionApi#sttVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionApi#sttVersion")
    e.printStackTrace()
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

<a id="version7"></a>
# **version7**
> SignInCmd version7()

Get Version

Get the version of SimSage Conversion Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionApi()
try {
    val result : SignInCmd = apiInstance.version7()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionApi#version7")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionApi#version7")
    e.printStackTrace()
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

