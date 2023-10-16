# OpenAPI\Client\DocumentApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**document()**](DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document |
| [**getParquetFile()**](DocumentApi.md#getParquetFile) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File |
| [**getParquetList()**](DocumentApi.md#getParquetList) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list |
| [**getSpreadsheet()**](DocumentApi.md#getSpreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet |
| [**getStats1()**](DocumentApi.md#getStats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics |
| [**inventorizeDocuments()**](DocumentApi.md#inventorizeDocuments) | **POST** /api/document/inventorize | Document Inventory |
| [**inventorizeIndexes()**](DocumentApi.md#inventorizeIndexes) | **POST** /api/document/inventorize-indexes | Index Inventory |
| [**preview()**](DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview |
| [**previewHtml()**](DocumentApi.md#previewHtml) | **POST** /api/document/preview/html | Preview HTML |
| [**queryFocussedSummarization()**](DocumentApi.md#queryFocussedSummarization) | **POST** /api/document/qfs | Summarize Documents for Query |
| [**removeDocument()**](DocumentApi.md#removeDocument) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document |
| [**removeParquetFile()**](DocumentApi.md#removeParquetFile) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File |
| [**summarizeDocument()**](DocumentApi.md#summarizeDocument) | **POST** /api/document/summarize/document | Summarize a document |
| [**version4()**](DocumentApi.md#version4) | **GET** /api/document/version | Version |
| [**zipSource()**](DocumentApi.md#zipSource) | **POST** /api/document/zip/source | Zip source documents |


## `document()`

```php
document($session_id, $organisation_id, $kb_id, $url): \OpenAPI\Client\Model\CMDocument
```

get Document

return a document's details given a base64 encoded url

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the document's url, base64 encoded, a unique id identifying a document.

try {
    $result = $apiInstance->document($session_id, $organisation_id, $kb_id, $url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->document: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the document&#39;s url, base64 encoded, a unique id identifying a document. | |

### Return type

[**\OpenAPI\Client\Model\CMDocument**](../Model/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getParquetFile()`

```php
getParquetFile($ott, $organisation_id, $kb_id, $date_time): string
```

Download Parquet File

Download an inventory parquet file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ott = 'ott_example'; // string | a one-time token for downloading data.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$date_time = 56; // int | a unix date-time specifying the exact snapshot to download

try {
    $result = $apiInstance->getParquetFile($ott, $organisation_id, $kb_id, $date_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->getParquetFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ott** | **string**| a one-time token for downloading data. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **date_time** | **int**| a unix date-time specifying the exact snapshot to download | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/octet-stream`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getParquetList()`

```php
getParquetList($organisation_id, $kb_id, $page, $page_size, $session_id, $api_version): \OpenAPI\Client\Model\CMParquetTimeList
```

Parquet available time list

Return a list of inventory times available for download.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$page = 0; // int | pagination control, the page index
$page_size = 10; // int | pagination control, the size of a page
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getParquetList($organisation_id, $kb_id, $page, $page_size, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->getParquetList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **page** | **int**| pagination control, the page index | |
| **page_size** | **int**| pagination control, the size of a page | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMParquetTimeList**](../Model/CMParquetTimeList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSpreadsheet()`

```php
getSpreadsheet($ott, $organisation_id, $kb_id, $date_time): string
```

Inventory breakdown Spreadsheet

Download an inventory breakdown spreadsheet for a given date-time.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ott = 'ott_example'; // string | a one-time token for downloading data.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$date_time = 56; // int | a unix date-time specifying the exact snapshot to download

try {
    $result = $apiInstance->getSpreadsheet($ott, $organisation_id, $kb_id, $date_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->getSpreadsheet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ott** | **string**| a one-time token for downloading data. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **date_time** | **int**| a unix date-time specifying the exact snapshot to download | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getStats1()`

```php
getStats1($ott, $organisation_id, $kb_id, $date_time): \OpenAPI\Client\Model\CMDocumentTypeFrequency[]
```

Document Frequency Statistics

Return a document frequency statistics report - frequencies of different document types

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ott = 'ott_example'; // string | a one-time token for downloading data.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$date_time = 56; // int | a unix date-time specifying the exact snapshot to download

try {
    $result = $apiInstance->getStats1($ott, $organisation_id, $kb_id, $date_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->getStats1: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ott** | **string**| a one-time token for downloading data. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **date_time** | **int**| a unix date-time specifying the exact snapshot to download | |

### Return type

[**\OpenAPI\Client\Model\CMDocumentTypeFrequency[]**](../Model/CMDocumentTypeFrequency.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `inventorizeDocuments()`

```php
inventorizeDocuments($session_id, $cm_inventorize_parameters, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Document Inventory

Start the async inventorize process for documents of a given organisation/kb.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_inventorize_parameters = new \OpenAPI\Client\Model\CMInventorizeParameters(); // \OpenAPI\Client\Model\CMInventorizeParameters
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->inventorizeDocuments($session_id, $cm_inventorize_parameters, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->inventorizeDocuments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_inventorize_parameters** | [**\OpenAPI\Client\Model\CMInventorizeParameters**](../Model/CMInventorizeParameters.md)|  | |
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

## `inventorizeIndexes()`

```php
inventorizeIndexes($session_id, $cm_inventorize_parameters, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Index Inventory

Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_inventorize_parameters = new \OpenAPI\Client\Model\CMInventorizeParameters(); // \OpenAPI\Client\Model\CMInventorizeParameters
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->inventorizeIndexes($session_id, $cm_inventorize_parameters, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->inventorizeIndexes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_inventorize_parameters** | [**\OpenAPI\Client\Model\CMInventorizeParameters**](../Model/CMInventorizeParameters.md)|  | |
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

## `preview()`

```php
preview($organisation_id, $kb_id, $client_id, $session_id, $url_id, $page): string
```

get Preview

get a preview for a document if available by url

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$client_id = 'client_id_example'; // string | the client-id, a persistent id identifying the remote client making this request.
$session_id = 'session_id_example'; // string | the session-id, the security required for making this request.
$url_id = 56; // int | the SimSage id for this url
$page = must be one of -1: the thumbnail image, 0: the first page view; // int | what page to render

try {
    $result = $apiInstance->preview($organisation_id, $kb_id, $client_id, $session_id, $url_id, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->preview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **client_id** | **string**| the client-id, a persistent id identifying the remote client making this request. | |
| **session_id** | **string**| the session-id, the security required for making this request. | |
| **url_id** | **int**| the SimSage id for this url | |
| **page** | **int**| what page to render | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `image/jpeg`, `image/svg+xml`, `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `previewHtml()`

```php
previewHtml($session_id, $cm_get_html): \OpenAPI\Client\Model\CMGetHtml
```

Preview HTML

get a preview HTML page for a document if available by url

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid session-guid id or a anonymous user-id.
$cm_get_html = new \OpenAPI\Client\Model\CMGetHtml(); // \OpenAPI\Client\Model\CMGetHtml

try {
    $result = $apiInstance->previewHtml($session_id, $cm_get_html);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->previewHtml: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid session-guid id or a anonymous user-id. | |
| **cm_get_html** | [**\OpenAPI\Client\Model\CMGetHtml**](../Model/CMGetHtml.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMGetHtml**](../Model/CMGetHtml.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `queryFocussedSummarization()`

```php
queryFocussedSummarization($session_id, $cm_query_focussed_summarization_request, $api_version): \OpenAPI\Client\Model\CMQueryFocussedSummarization
```

Summarize Documents for Query

Summarize a set of documents given a list of urls and a query.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_query_focussed_summarization_request = new \OpenAPI\Client\Model\CMQueryFocussedSummarizationRequest(); // \OpenAPI\Client\Model\CMQueryFocussedSummarizationRequest
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->queryFocussedSummarization($session_id, $cm_query_focussed_summarization_request, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->queryFocussedSummarization: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_query_focussed_summarization_request** | [**\OpenAPI\Client\Model\CMQueryFocussedSummarizationRequest**](../Model/CMQueryFocussedSummarizationRequest.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMQueryFocussedSummarization**](../Model/CMQueryFocussedSummarization.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeDocument()`

```php
removeDocument($organisation_id, $kb_id, $url, $source_id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Remove Document

Remove/delete a document by its url.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the base-64 encoded (no-prefix) url of the document
$source_id = 56; // int | the source-id of the crawler this document belongs to
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->removeDocument($organisation_id, $kb_id, $url, $source_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->removeDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the base-64 encoded (no-prefix) url of the document | |
| **source_id** | **int**| the source-id of the crawler this document belongs to | |
| **session_id** | **string**| a valid SimSage Session id. | |
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

## `removeParquetFile()`

```php
removeParquetFile($organisation_id, $kb_id, $date_time, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage[]
```

Delete Parquet File

Remove an inventory breakdown spreadsheet/parquet file from the system

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$date_time = 56; // int | a unix date-time specifying the exact snapshot to remove
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->removeParquetFile($organisation_id, $kb_id, $date_time, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->removeParquetFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **date_time** | **int**| a unix date-time specifying the exact snapshot to remove | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\JsonMessage[]**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `summarizeDocument()`

```php
summarizeDocument($session_id, $cm_single_document_summary_request, $api_version): \OpenAPI\Client\Model\CMSingleDocumentSummary
```

Summarize a document

Summarize a single document using an extractive summarization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_single_document_summary_request = new \OpenAPI\Client\Model\CMSingleDocumentSummaryRequest(); // \OpenAPI\Client\Model\CMSingleDocumentSummaryRequest
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->summarizeDocument($session_id, $cm_single_document_summary_request, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->summarizeDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_single_document_summary_request** | [**\OpenAPI\Client\Model\CMSingleDocumentSummaryRequest**](../Model/CMSingleDocumentSummaryRequest.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSingleDocumentSummary**](../Model/CMSingleDocumentSummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version4()`

```php
version4(): \OpenAPI\Client\Model\CMVersion
```

Version

Get the version of SimSage Document Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version4();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->version4: ', $e->getMessage(), PHP_EOL;
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

## `zipSource()`

```php
zipSource($session_id, $cm_zip_source, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Zip source documents

Zip all documents in a source on the local server.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DocumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_zip_source = new \OpenAPI\Client\Model\CMZipSource(); // \OpenAPI\Client\Model\CMZipSource
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->zipSource($session_id, $cm_zip_source, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DocumentApi->zipSource: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_zip_source** | [**\OpenAPI\Client\Model\CMZipSource**](../Model/CMZipSource.md)|  | |
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
