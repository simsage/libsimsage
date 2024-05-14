# OpenAPI\Client\CrawlerApi

All URIs are relative to https://training.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**crawlerDeleteFolder()**](CrawlerApi.md#crawlerDeleteFolder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder |
| [**crawlerDeleteUrl()**](CrawlerApi.md#crawlerDeleteUrl) | **POST** /api/crawler/external/crawler/delete-url | Delete document |
| [**crawlerExternalDocumentDelete()**](CrawlerApi.md#crawlerExternalDocumentDelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
| [**crawlerExternalDocumentFailed()**](CrawlerApi.md#crawlerExternalDocumentFailed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document |
| [**crawlerExternalDocumentUpload()**](CrawlerApi.md#crawlerExternalDocumentUpload) | **POST** /api/crawler/external/document/upload | Upload External Document |
| [**crawlerExternalImageUpload()**](CrawlerApi.md#crawlerExternalImageUpload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
| [**crawlerRenameFolder()**](CrawlerApi.md#crawlerRenameFolder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder |
| [**crawlerUpdateDeltaToken()**](CrawlerApi.md#crawlerUpdateDeltaToken) | **POST** /api/crawler/external/crawler/delta-token | Update delta token |
| [**delete()**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
| [**deleteDocuments()**](CrawlerApi.md#deleteDocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents |
| [**encryptedCommunications()**](CrawlerApi.md#encryptedCommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
| [**externalCrawler()**](CrawlerApi.md#externalCrawler) | **POST** /api/crawler/external/crawler | External Crawler |
| [**externalCrawlerFinished()**](CrawlerApi.md#externalCrawlerFinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
| [**externalCrawlerStart()**](CrawlerApi.md#externalCrawlerStart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
| [**getCrawler()**](CrawlerApi.md#getCrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
| [**getFailedDocuments()**](CrawlerApi.md#getFailedDocuments) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List |
| [**getSourceList()**](CrawlerApi.md#getSourceList) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
| [**markCrawlAsDeltaReset()**](CrawlerApi.md#markCrawlAsDeltaReset) | **POST** /api/crawler/external/crawler/mark-as-reset | Update delta token |
| [**markFileAsSeen()**](CrawlerApi.md#markFileAsSeen) | **POST** /api/crawler/external/crawler/mark-file-as-seen | Mark file as seen |
| [**oidcCode()**](CrawlerApi.md#oidcCode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
| [**processAllFiles()**](CrawlerApi.md#processAllFiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
| [**processorSchema()**](CrawlerApi.md#processorSchema) | **GET** /api/crawler/processor_schema |  |
| [**receiveExternalLogEntry()**](CrawlerApi.md#receiveExternalLogEntry) | **POST** /api/crawler/external/crawler/log | External Crawler log-entry |
| [**resetSourceDelta()**](CrawlerApi.md#resetSourceDelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
| [**sdcSchema()**](CrawlerApi.md#sdcSchema) | **GET** /api/crawler/sdc_schema |  |
| [**startCrawler()**](CrawlerApi.md#startCrawler) | **POST** /api/crawler/start | Start crawler |
| [**sync()**](CrawlerApi.md#sync) | **POST** /api/crawler/syncgdrivegroups |  |
| [**testCrawler()**](CrawlerApi.md#testCrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
| [**updateCrawler()**](CrawlerApi.md#updateCrawler) | **POST** /api/crawler/crawler | Update Source |
| [**version6()**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |


## `crawlerDeleteFolder()`

```php
crawlerDeleteFolder($cm_external_crawler_delete_folder, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete document folder

An external crawler removes a document folder.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_delete_folder = new \OpenAPI\Client\Model\CMExternalCrawlerDeleteFolder(); // \OpenAPI\Client\Model\CMExternalCrawlerDeleteFolder
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerDeleteFolder($cm_external_crawler_delete_folder, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerDeleteFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_delete_folder** | [**\OpenAPI\Client\Model\CMExternalCrawlerDeleteFolder**](../Model/CMExternalCrawlerDeleteFolder.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerDeleteUrl()`

```php
crawlerDeleteUrl($cm_external_crawler_delete_url, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete document

An external crawler removes a document.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_delete_url = new \OpenAPI\Client\Model\CMExternalCrawlerDeleteUrl(); // \OpenAPI\Client\Model\CMExternalCrawlerDeleteUrl
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerDeleteUrl($cm_external_crawler_delete_url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerDeleteUrl: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_delete_url** | [**\OpenAPI\Client\Model\CMExternalCrawlerDeleteUrl**](../Model/CMExternalCrawlerDeleteUrl.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerExternalDocumentDelete()`

```php
crawlerExternalDocumentDelete($cm_delete_document, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Remove an External Document

Remove an external crawler document from SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_delete_document = new \OpenAPI\Client\Model\CMDeleteDocument(); // \OpenAPI\Client\Model\CMDeleteDocument
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerExternalDocumentDelete($cm_delete_document, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerExternalDocumentDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_delete_document** | [**\OpenAPI\Client\Model\CMDeleteDocument**](../Model/CMDeleteDocument.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerExternalDocumentFailed()`

```php
crawlerExternalDocumentFailed($cm_failed_source_document, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_failed_source_document = new \OpenAPI\Client\Model\CMFailedSourceDocument(); // \OpenAPI\Client\Model\CMFailedSourceDocument
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerExternalDocumentFailed($cm_failed_source_document, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerExternalDocumentFailed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_failed_source_document** | [**\OpenAPI\Client\Model\CMFailedSourceDocument**](../Model/CMFailedSourceDocument.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerExternalDocumentUpload()`

```php
crawlerExternalDocumentUpload($cm_upload_document, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_upload_document = new \OpenAPI\Client\Model\CMUploadDocument(); // \OpenAPI\Client\Model\CMUploadDocument
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerExternalDocumentUpload($cm_upload_document, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerExternalDocumentUpload: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_upload_document** | [**\OpenAPI\Client\Model\CMUploadDocument**](../Model/CMUploadDocument.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerExternalImageUpload()`

```php
crawlerExternalImageUpload($cm_upload_image, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Upload External Image

An external crawler uploads an image for a document.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_upload_image = new \OpenAPI\Client\Model\CMUploadImage(); // \OpenAPI\Client\Model\CMUploadImage
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerExternalImageUpload($cm_upload_image, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerExternalImageUpload: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_upload_image** | [**\OpenAPI\Client\Model\CMUploadImage**](../Model/CMUploadImage.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerRenameFolder()`

```php
crawlerRenameFolder($cm_external_crawler_rename_folder, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Rename document folder

An external crawler renames a document folder.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_rename_folder = new \OpenAPI\Client\Model\CMExternalCrawlerRenameFolder(); // \OpenAPI\Client\Model\CMExternalCrawlerRenameFolder
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerRenameFolder($cm_external_crawler_rename_folder, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerRenameFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_rename_folder** | [**\OpenAPI\Client\Model\CMExternalCrawlerRenameFolder**](../Model/CMExternalCrawlerRenameFolder.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerUpdateDeltaToken()`

```php
crawlerUpdateDeltaToken($cm_external_crawler_set_delta_token, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Update delta token

An external crawler updates a delta-token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_set_delta_token = new \OpenAPI\Client\Model\CMExternalCrawlerSetDeltaToken(); // \OpenAPI\Client\Model\CMExternalCrawlerSetDeltaToken
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerUpdateDeltaToken($cm_external_crawler_set_delta_token, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerUpdateDeltaToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_set_delta_token** | [**\OpenAPI\Client\Model\CMExternalCrawlerSetDeltaToken**](../Model/CMExternalCrawlerSetDeltaToken.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `delete()`

```php
delete($organisation_id, $kb_id, $session_id, $source_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete source

Remove a source and all its content by its source-id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$source_id = 56; // int | the crawler's id
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->delete($organisation_id, $kb_id, $session_id, $source_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->delete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **source_id** | **int**| the crawler&#39;s id | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteDocuments()`

```php
deleteDocuments($organisation_id, $kb_id, $session_id, $source_id, $api_version): \OpenAPI\Client\Model\CMSource
```

Delete source's documents

Remove a source's documents and stop the crawler if it's running.  Return an updated sources.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$source_id = 56; // int | the crawler's id
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteDocuments($organisation_id, $kb_id, $session_id, $source_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->deleteDocuments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **source_id** | **int**| the crawler&#39;s id | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `encryptedCommunications()`

```php
encryptedCommunications($seed, $body, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Secure Communication

Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$seed = 56; // int | a random integer used for the communications
$body = 'body_example'; // string
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->encryptedCommunications($seed, $body, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->encryptedCommunications: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **seed** | **int**| a random integer used for the communications | |
| **body** | **string**|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `externalCrawler()`

```php
externalCrawler($cm_external_crawler, $api_version): \OpenAPI\Client\Model\CMSource
```

External Crawler

Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler = new \OpenAPI\Client\Model\CMExternalCrawler(); // \OpenAPI\Client\Model\CMExternalCrawler
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->externalCrawler($cm_external_crawler, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->externalCrawler: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler** | [**\OpenAPI\Client\Model\CMExternalCrawler**](../Model/CMExternalCrawler.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `externalCrawlerFinished()`

```php
externalCrawlerFinished($cm_external_crawler_stop, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Stop External Crawler

An external crawler notifies SimSage it has finished its job, its run through the data once.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_stop = new \OpenAPI\Client\Model\CMExternalCrawlerStop(); // \OpenAPI\Client\Model\CMExternalCrawlerStop
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->externalCrawlerFinished($cm_external_crawler_stop, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->externalCrawlerFinished: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_stop** | [**\OpenAPI\Client\Model\CMExternalCrawlerStop**](../Model/CMExternalCrawlerStop.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `externalCrawlerStart()`

```php
externalCrawlerStart($cm_external_crawler_start, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Start External Crawler

An external crawler notifies SimSage is it starting a new run.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_start = new \OpenAPI\Client\Model\CMExternalCrawlerStart(); // \OpenAPI\Client\Model\CMExternalCrawlerStart
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->externalCrawlerStart($cm_external_crawler_start, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->externalCrawlerStart: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_start** | [**\OpenAPI\Client\Model\CMExternalCrawlerStart**](../Model/CMExternalCrawlerStart.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getCrawler()`

```php
getCrawler($organisation_id, $kb_id, $source_id, $session_id, $api_version): \OpenAPI\Client\Model\CMSource
```

Get source

Return the data-structure for a source by id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$source_id = 56; // int | the crawler's id
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getCrawler($organisation_id, $kb_id, $source_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->getCrawler: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **source_id** | **int**| the crawler&#39;s id | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getFailedDocuments()`

```php
getFailedDocuments($session_id, $organisation_id, $kb_id, $source_id, $page, $page_size, $api_version): \OpenAPI\Client\Model\CMSource[]
```

Get source List

Get a list of failed documents for a source.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$source_id = 'source_id_example'; // string | the source  id (a number)
$page = 56; // int | the page number for the list
$page_size = 56; // int | the page size for the list
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getFailedDocuments($session_id, $organisation_id, $kb_id, $source_id, $page, $page_size, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->getFailedDocuments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **source_id** | **string**| the source  id (a number) | |
| **page** | **int**| the page number for the list | |
| **page_size** | **int**| the page size for the list | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource[]**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSourceList()`

```php
getSourceList($session_id, $organisation_id, $kb_id, $api_version): \OpenAPI\Client\Model\CMSource[]
```

Get source List

Get a list of sources for a given organisation / knowledge base.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSourceList($session_id, $organisation_id, $kb_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->getSourceList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource[]**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `markCrawlAsDeltaReset()`

```php
markCrawlAsDeltaReset($cm_external_mark_reset_crawl, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Update delta token

An external crawler marks a source as delta reset required.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_mark_reset_crawl = new \OpenAPI\Client\Model\CMExternalMarkResetCrawl(); // \OpenAPI\Client\Model\CMExternalMarkResetCrawl
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->markCrawlAsDeltaReset($cm_external_mark_reset_crawl, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->markCrawlAsDeltaReset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_mark_reset_crawl** | [**\OpenAPI\Client\Model\CMExternalMarkResetCrawl**](../Model/CMExternalMarkResetCrawl.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `markFileAsSeen()`

```php
markFileAsSeen($cm_external_crawler_mark_file_as_seen, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Mark file as seen

An external crawler marks a file as seen.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_crawler_mark_file_as_seen = new \OpenAPI\Client\Model\CMExternalCrawlerMarkFileAsSeen(); // \OpenAPI\Client\Model\CMExternalCrawlerMarkFileAsSeen
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->markFileAsSeen($cm_external_crawler_mark_file_as_seen, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->markFileAsSeen: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_crawler_mark_file_as_seen** | [**\OpenAPI\Client\Model\CMExternalCrawlerMarkFileAsSeen**](../Model/CMExternalCrawlerMarkFileAsSeen.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `oidcCode()`

```php
oidcCode($oidc_key, $all_request_params)
```

OIDC code receiver

used for OIDC systems to receive codes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$oidc_key = 'oidc_key_example'; // string | the Dropbox OIDC key
$all_request_params = array('key' => 'all_request_params_example'); // array<string,string>

try {
    $apiInstance->oidcCode($oidc_key, $all_request_params);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->oidcCode: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **oidc_key** | **string**| the Dropbox OIDC key | |
| **all_request_params** | [**array<string,string>**](../Model/string.md)|  | |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `processAllFiles()`

```php
processAllFiles($session_id, $cm_start_crawler, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Process all files of crawler/source

Start and force processing all files for a crawler/source

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_start_crawler = new \OpenAPI\Client\Model\CMStartCrawler(); // \OpenAPI\Client\Model\CMStartCrawler
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->processAllFiles($session_id, $cm_start_crawler, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->processAllFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_start_crawler** | [**\OpenAPI\Client\Model\CMStartCrawler**](../Model/CMStartCrawler.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `processorSchema()`

```php
processorSchema(): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->processorSchema();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->processorSchema: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json;charset=UTF-8`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `receiveExternalLogEntry()`

```php
receiveExternalLogEntry($cm_external_log_entry, $api_version): \OpenAPI\Client\Model\CMSource
```

External Crawler log-entry

An external crawler sends a log entry to SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_external_log_entry = new \OpenAPI\Client\Model\CMExternalLogEntry(); // \OpenAPI\Client\Model\CMExternalLogEntry
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->receiveExternalLogEntry($cm_external_log_entry, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->receiveExternalLogEntry: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_external_log_entry** | [**\OpenAPI\Client\Model\CMExternalLogEntry**](../Model/CMExternalLogEntry.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `resetSourceDelta()`

```php
resetSourceDelta($session_id, $organisation_id, $kb_id, $source_id, $api_version): \OpenAPI\Client\Model\CMSource
```

Reset Source delta-token

reset a SimSage source's delta token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$source_id = 56; // int | the crawler's id
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->resetSourceDelta($session_id, $organisation_id, $kb_id, $source_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->resetSourceDelta: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **source_id** | **int**| the crawler&#39;s id | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `sdcSchema()`

```php
sdcSchema(): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->sdcSchema();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->sdcSchema: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json;charset=UTF-8`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `startCrawler()`

```php
startCrawler($session_id, $cm_start_crawler, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Start crawler

Start a crawler by source-id if after it has stopped.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_start_crawler = new \OpenAPI\Client\Model\CMStartCrawler(); // \OpenAPI\Client\Model\CMStartCrawler
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->startCrawler($session_id, $cm_start_crawler, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->startCrawler: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_start_crawler** | [**\OpenAPI\Client\Model\CMStartCrawler**](../Model/CMStartCrawler.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `sync()`

```php
sync($session_id, $cm_sync_g_drive): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_sync_g_drive = new \OpenAPI\Client\Model\CMSyncGDrive(); // \OpenAPI\Client\Model\CMSyncGDrive

try {
    $result = $apiInstance->sync($session_id, $cm_sync_g_drive);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->sync: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_sync_g_drive** | [**\OpenAPI\Client\Model\CMSyncGDrive**](../Model/CMSyncGDrive.md)|  | |

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json;charset=UTF-8`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testCrawler()`

```php
testCrawler($session_id, $organisation_id, $kb_id, $source_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Test Crawler

Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-base's id (a guid)
$source_id = 56; // int | the crawler's id
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->testCrawler($session_id, $organisation_id, $kb_id, $source_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->testCrawler: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-base&#39;s id (a guid) | |
| **source_id** | **int**| the crawler&#39;s id | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateCrawler()`

```php
updateCrawler($session_id, $cm_source, $api_version): \OpenAPI\Client\Model\CMSource
```

Update Source

Save (create or update) a SimSage source.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_source = new \OpenAPI\Client\Model\CMSource(); // \OpenAPI\Client\Model\CMSource
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->updateCrawler($session_id, $cm_source, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->updateCrawler: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_source** | [**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSource**](../Model/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version6()`

```php
version6(): \OpenAPI\Client\Model\CMVersion
```

Version

Get the version of SimSage crawler-services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version6();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->version6: ', $e->getMessage(), PHP_EOL;
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
