# OpenAPI\Client\CrawlerApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**crawlerExternalDocumentDelete()**](CrawlerApi.md#crawlerExternalDocumentDelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
| [**crawlerExternalDocumentUnChanged()**](CrawlerApi.md#crawlerExternalDocumentUnChanged) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged |
| [**crawlerExternalDocumentUpload()**](CrawlerApi.md#crawlerExternalDocumentUpload) | **POST** /api/crawler/external/document/upload | Upload External Document |
| [**crawlerExternalImageUpload()**](CrawlerApi.md#crawlerExternalImageUpload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
| [**delete()**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
| [**deleteDocuments()**](CrawlerApi.md#deleteDocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents |
| [**encryptedCommunications()**](CrawlerApi.md#encryptedCommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
| [**externalCrawler()**](CrawlerApi.md#externalCrawler) | **POST** /api/crawler/external/crawler | External Crawler |
| [**externalCrawlerFinished()**](CrawlerApi.md#externalCrawlerFinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
| [**externalCrawlerStart()**](CrawlerApi.md#externalCrawlerStart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
| [**getCrawler()**](CrawlerApi.md#getCrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
| [**getSourceList()**](CrawlerApi.md#getSourceList) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
| [**oidcCode()**](CrawlerApi.md#oidcCode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
| [**processAllFiles()**](CrawlerApi.md#processAllFiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
| [**resetSourceDelta()**](CrawlerApi.md#resetSourceDelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
| [**startCrawler()**](CrawlerApi.md#startCrawler) | **POST** /api/crawler/start | Start crawler |
| [**testCrawler()**](CrawlerApi.md#testCrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
| [**updateCrawler()**](CrawlerApi.md#updateCrawler) | **POST** /api/crawler/crawler | Update Source |
| [**version6()**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |


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

## `crawlerExternalDocumentUnChanged()`

```php
crawlerExternalDocumentUnChanged($cm_document_un_changed, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Mark External Document Unchanged

An external crawler document marks a document as not having changed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\CrawlerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_document_un_changed = new \OpenAPI\Client\Model\CMDocumentUnChanged(); // \OpenAPI\Client\Model\CMDocumentUnChanged
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->crawlerExternalDocumentUnChanged($cm_document_un_changed, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CrawlerApi->crawlerExternalDocumentUnChanged: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_document_un_changed** | [**\OpenAPI\Client\Model\CMDocumentUnChanged**](../Model/CMDocumentUnChanged.md)|  | |
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
