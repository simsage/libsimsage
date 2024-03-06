# ConversionApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**previewVersion**](ConversionApi.md#previewVersion) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version |
| [**sttVersion**](ConversionApi.md#sttVersion) | **GET** /api/conversion/stt/version | Get speech-to-text Version |
| [**version7**](ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version |


<a name="previewVersion"></a>
# **previewVersion**
> SignInCmd previewVersion()

Get preview-generator Version

    Get the version of SimSage preview-generator.

### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](../Models/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="sttVersion"></a>
# **sttVersion**
> SignInCmd sttVersion()

Get speech-to-text Version

    Get the version of SimSage speech-to-text system.

### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](../Models/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="version7"></a>
# **version7**
> SignInCmd version7()

Get Version

    Get the version of SimSage Conversion Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](../Models/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

