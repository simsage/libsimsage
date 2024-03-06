# OpenAPI\Client\DiscoveryApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**allGdprProjects()**](DiscoveryApi.md#allGdprProjects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
| [**applyRedactions()**](DiscoveryApi.md#applyRedactions) | **POST** /api/discovery/applyredactions |  |
| [**createGdprProject()**](DiscoveryApi.md#createGdprProject) | **POST** /api/discovery/createproject |  |
| [**deleteProject()**](DiscoveryApi.md#deleteProject) | **DELETE** /api/discovery/deleteproject |  |
| [**exportRedactedDoc()**](DiscoveryApi.md#exportRedactedDoc) | **POST** /api/discovery/exportredacteddoc |  |
| [**getGdprDocument()**](DiscoveryApi.md#getGdprDocument) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} |  |
| [**getPagedProjectDocuments()**](DiscoveryApi.md#getPagedProjectDocuments) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
| [**growthPerMonth()**](DiscoveryApi.md#growthPerMonth) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth |
| [**setdocumentredactions()**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument |  |
| [**storageBySource()**](DiscoveryApi.md#storageBySource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage |
| [**summaryByDocumentType()**](DiscoveryApi.md#summaryByDocumentType) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage |
| [**updateDocumentSet()**](DiscoveryApi.md#updateDocumentSet) | **POST** /api/discovery/updatedocumentset |  |
| [**version5()**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version |


## `allGdprProjects()`

```php
allGdprProjects($organisation_id, $kb_id, $page, $page_size, $text_filter, $status_filter, $sort_column, $sort_direction, $session_id): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$page = 56; // int | the page to render
$page_size = 56; // int | the page size to use
$text_filter = 'text_filter_example'; // string | the text filter passed in or blank if empty
$status_filter = 'status_filter_example'; // string | the status filter passed in
$sort_column = 'sort_column_example'; // string | the sort column used for the results
$sort_direction = 56; // int | sort direction to use (0/1)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->allGdprProjects($organisation_id, $kb_id, $page, $page_size, $text_filter, $status_filter, $sort_column, $sort_direction, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->allGdprProjects: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **page** | **int**| the page to render | |
| **page_size** | **int**| the page size to use | |
| **text_filter** | **string**| the text filter passed in or blank if empty | |
| **status_filter** | **string**| the status filter passed in | |
| **sort_column** | **string**| the sort column used for the results | |
| **sort_direction** | **int**| sort direction to use (0/1) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `applyRedactions()`

```php
applyRedactions($session_id, $cm_redaction_data): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_redaction_data = new \OpenAPI\Client\Model\CMRedactionData(); // \OpenAPI\Client\Model\CMRedactionData

try {
    $result = $apiInstance->applyRedactions($session_id, $cm_redaction_data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->applyRedactions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_redaction_data** | [**\OpenAPI\Client\Model\CMRedactionData**](../Model/CMRedactionData.md)|  | |

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

## `createGdprProject()`

```php
createGdprProject($session_id, $cm_create_gdpr_project): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_create_gdpr_project = new \OpenAPI\Client\Model\CMCreateGdprProject(); // \OpenAPI\Client\Model\CMCreateGdprProject

try {
    $result = $apiInstance->createGdprProject($session_id, $cm_create_gdpr_project);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->createGdprProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_create_gdpr_project** | [**\OpenAPI\Client\Model\CMCreateGdprProject**](../Model/CMCreateGdprProject.md)|  | |

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

## `deleteProject()`

```php
deleteProject($session_id, $cm_delete_project_cmd): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_delete_project_cmd = new \OpenAPI\Client\Model\CMDeleteProjectCmd(); // \OpenAPI\Client\Model\CMDeleteProjectCmd

try {
    $result = $apiInstance->deleteProject($session_id, $cm_delete_project_cmd);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->deleteProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_delete_project_cmd** | [**\OpenAPI\Client\Model\CMDeleteProjectCmd**](../Model/CMDeleteProjectCmd.md)|  | |

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

## `exportRedactedDoc()`

```php
exportRedactedDoc($session_id, $cm_export_redacted_document): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_export_redacted_document = new \OpenAPI\Client\Model\CMExportRedactedDocument(); // \OpenAPI\Client\Model\CMExportRedactedDocument

try {
    $result = $apiInstance->exportRedactedDoc($session_id, $cm_export_redacted_document);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->exportRedactedDoc: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_export_redacted_document** | [**\OpenAPI\Client\Model\CMExportRedactedDocument**](../Model/CMExportRedactedDocument.md)|  | |

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

## `getGdprDocument()`

```php
getGdprDocument($organisation_id, $kb_id, $project_id, $url, $session_id): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$project_id = 'project_id_example'; // string | Project Id for the items
$url = 'url_example'; // string | The url of the document to retrieve
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getGdprDocument($organisation_id, $kb_id, $project_id, $url, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->getGdprDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **project_id** | **string**| Project Id for the items | |
| **url** | **string**| The url of the document to retrieve | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `getPagedProjectDocuments()`

```php
getPagedProjectDocuments($organisation_id, $kb_id, $project_id, $page, $page_size, $text_filter, $type_filter, $status_filter, $sort_column, $sort_direction, $session_id): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$project_id = 'project_id_example'; // string | Project Id for the items
$page = 56; // int | the page to render
$page_size = 56; // int | the page size to use
$text_filter = 'text_filter_example'; // string | the text filter passed in or blank if empty
$type_filter = 'type_filter_example'; // string | the type filter passed in
$status_filter = 'status_filter_example'; // string | the status filter passed in
$sort_column = 'sort_column_example'; // string | the sort column used for the results
$sort_direction = 56; // int | sort direction to use (0/1)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getPagedProjectDocuments($organisation_id, $kb_id, $project_id, $page, $page_size, $text_filter, $type_filter, $status_filter, $sort_column, $sort_direction, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->getPagedProjectDocuments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **project_id** | **string**| Project Id for the items | |
| **page** | **int**| the page to render | |
| **page_size** | **int**| the page size to use | |
| **text_filter** | **string**| the text filter passed in or blank if empty | |
| **type_filter** | **string**| the type filter passed in | |
| **status_filter** | **string**| the status filter passed in | |
| **sort_column** | **string**| the sort column used for the results | |
| **sort_direction** | **int**| sort direction to use (0/1) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `growthPerMonth()`

```php
growthPerMonth($organisation_id, $kb_id, $session_id): object
```

growth

Get the storage growth delta per month

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->growthPerMonth($organisation_id, $kb_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->growthPerMonth: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `setdocumentredactions()`

```php
setdocumentredactions($session_id, $cm_redaction_data): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_redaction_data = new \OpenAPI\Client\Model\CMRedactionData(); // \OpenAPI\Client\Model\CMRedactionData

try {
    $result = $apiInstance->setdocumentredactions($session_id, $cm_redaction_data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->setdocumentredactions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_redaction_data** | [**\OpenAPI\Client\Model\CMRedactionData**](../Model/CMRedactionData.md)|  | |

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

## `storageBySource()`

```php
storageBySource($organisation_id, $kb_id, $session_id): object
```

storage

Get the current amount of storage used by source

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->storageBySource($organisation_id, $kb_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->storageBySource: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `summaryByDocumentType()`

```php
summaryByDocumentType($organisation_id, $kb_id, $session_id): object
```

storage

Get the current amount of storage used by source and document type

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->summaryByDocumentType($organisation_id, $kb_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->summaryByDocumentType: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `updateDocumentSet()`

```php
updateDocumentSet($session_id, $cm_update_document_set): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_update_document_set = new \OpenAPI\Client\Model\CMUpdateDocumentSet(); // \OpenAPI\Client\Model\CMUpdateDocumentSet

try {
    $result = $apiInstance->updateDocumentSet($session_id, $cm_update_document_set);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->updateDocumentSet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_update_document_set** | [**\OpenAPI\Client\Model\CMUpdateDocumentSet**](../Model/CMUpdateDocumentSet.md)|  | |

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

## `version5()`

```php
version5(): \OpenAPI\Client\Model\CMVersion
```

Version

Get the version of SimSage Discovery Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DiscoveryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version5();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DiscoveryApi->version5: ', $e->getMessage(), PHP_EOL;
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
