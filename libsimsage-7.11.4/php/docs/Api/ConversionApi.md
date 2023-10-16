# OpenAPI\Client\ConversionApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**previewVersion()**](ConversionApi.md#previewVersion) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version |
| [**sttVersion()**](ConversionApi.md#sttVersion) | **GET** /api/conversion/stt/version | Get speech-to-text Version |
| [**version7()**](ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version |


## `previewVersion()`

```php
previewVersion(): \OpenAPI\Client\Model\SignInCmd
```

Get preview-generator Version

Get the version of SimSage preview-generator.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ConversionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->previewVersion();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionApi->previewVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\SignInCmd**](../Model/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `sttVersion()`

```php
sttVersion(): \OpenAPI\Client\Model\SignInCmd
```

Get speech-to-text Version

Get the version of SimSage speech-to-text system.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ConversionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->sttVersion();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionApi->sttVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\SignInCmd**](../Model/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version7()`

```php
version7(): \OpenAPI\Client\Model\SignInCmd
```

Get Version

Get the version of SimSage Conversion Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ConversionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version7();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionApi->version7: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\SignInCmd**](../Model/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
