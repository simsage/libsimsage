# OpenAPI\Client\StatsApi

All URIs are relative to https://training.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getIndexOptimizationReport()**](StatsApi.md#getIndexOptimizationReport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report |
| [**getIndexOptimizationReports()**](StatsApi.md#getIndexOptimizationReports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list |
| [**getStats()**](StatsApi.md#getStats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics |
| [**simSageStatus()**](StatsApi.md#simSageStatus) | **PUT** /api/stats/status/{organisationId} | SimSage status |
| [**systemLogs()**](StatsApi.md#systemLogs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs |
| [**version()**](StatsApi.md#version) | **GET** /api/stats/version | Version |


## `getIndexOptimizationReport()`

```php
getIndexOptimizationReport($session_id, $organisation_id, $kb_id, $id): \OpenAPI\Client\Model\OptimizeIndexesGetReportCmd[]
```

get an optimization report

return an optimization report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StatsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid session-guid id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$id = 56; // int | the id of the report

try {
    $result = $apiInstance->getIndexOptimizationReport($session_id, $organisation_id, $kb_id, $id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->getIndexOptimizationReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid session-guid id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **id** | **int**| the id of the report | |

### Return type

[**\OpenAPI\Client\Model\OptimizeIndexesGetReportCmd[]**](../Model/OptimizeIndexesGetReportCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getIndexOptimizationReports()`

```php
getIndexOptimizationReports($session_id, $organisation_id, $kb_id): \OpenAPI\Client\Model\OptimizeIndexesGetReportsCmd[]
```

get optimization report list

return a list of optimization reports

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StatsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid session-guid id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)

try {
    $result = $apiInstance->getIndexOptimizationReports($session_id, $organisation_id, $kb_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->getIndexOptimizationReports: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid session-guid id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |

### Return type

[**\OpenAPI\Client\Model\OptimizeIndexesGetReportsCmd[]**](../Model/OptimizeIndexesGetReportsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getStats()`

```php
getStats($session_id, $organisation_id, $kb_id, $year, $month, $top, $api_version): \OpenAPI\Client\Model\CMReturnStatistics
```

Get usage Statistics

Get all statistics for a given month, including some global ones.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StatsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$year = 56; // int | the year to get stats for
$month = 56; // int | the month to get stats for
$top = 56; // int | how many stats to return
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getStats($session_id, $organisation_id, $kb_id, $year, $month, $top, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->getStats: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **year** | **int**| the year to get stats for | |
| **month** | **int**| the month to get stats for | |
| **top** | **int**| how many stats to return | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMReturnStatistics**](../Model/CMReturnStatistics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `simSageStatus()`

```php
simSageStatus($session_id, $organisation_id): \OpenAPI\Client\Model\CMCommandQueueItem[]
```

SimSage status

return SimSage indexer and parser status

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StatsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid session-guid id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)

try {
    $result = $apiInstance->simSageStatus($session_id, $organisation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->simSageStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid session-guid id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |

### Return type

[**\OpenAPI\Client\Model\CMCommandQueueItem[]**](../Model/CMCommandQueueItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `systemLogs()`

```php
systemLogs($organisation_id, $service, $num_lines, $session_id): \OpenAPI\Client\Model\CMLoggerEntry[]
```

System Logs

return SimSage System-logs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StatsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$service = 'service_example'; // string | the service to get the log for
$num_lines = 56; // int | the maximum number of lines to return if > 0
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->systemLogs($organisation_id, $service, $num_lines, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->systemLogs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **service** | **string**| the service to get the log for | |
| **num_lines** | **int**| the maximum number of lines to return if &gt; 0 | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMLoggerEntry[]**](../Model/CMLoggerEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version()`

```php
version(): \OpenAPI\Client\Model\CMVersion
```

Version

Get the version of SimSage Stats Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StatsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->version: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CMVersion**](../Model/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
