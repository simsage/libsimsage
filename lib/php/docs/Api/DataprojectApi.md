# OpenAPI\Client\DataprojectApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addComment()**](DataprojectApi.md#addComment) | **POST** /api/dataproject/comment | Create Comment |
| [**allTasks()**](DataprojectApi.md#allTasks) | **POST** /api/dataproject/runningprojects | get Running Projects |
| [**changeTaskPhase()**](DataprojectApi.md#changeTaskPhase) | **POST** /api/dataproject/changetaskphase | Change Task Phase |
| [**claimDocument()**](DataprojectApi.md#claimDocument) | **POST** /api/dataproject/claimdocument | Claim sliced document |
| [**crawlerStatus()**](DataprojectApi.md#crawlerStatus) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status |
| [**documentsByTokens()**](DataprojectApi.md#documentsByTokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens |
| [**filteredComments()**](DataprojectApi.md#filteredComments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments |
| [**getDocumentRedactionInfo()**](DataprojectApi.md#getDocumentRedactionInfo) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info |
| [**getProjectDefinition()**](DataprojectApi.md#getProjectDefinition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition |
| [**getProjectReview()**](DataprojectApi.md#getProjectReview) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition |
| [**getProjectSlice()**](DataprojectApi.md#getProjectSlice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice |
| [**getSearchResultSummary()**](DataprojectApi.md#getSearchResultSummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary |
| [**getSearchResultSummaryForReview()**](DataprojectApi.md#getSearchResultSummaryForReview) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary |
| [**nextDocument()**](DataprojectApi.md#nextDocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters |
| [**pdfBinary()**](DataprojectApi.md#pdfBinary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary |
| [**projectTypes()**](DataprojectApi.md#projectTypes) | **GET** /api/dataproject/projects/{organisationId} | get Project Types |
| [**reassignSliceDocument()**](DataprojectApi.md#reassignSliceDocument) | **POST** /api/dataproject/reassignslicedoc |  |
| [**redactedDocument()**](DataprojectApi.md#redactedDocument) | **POST** /api/dataproject/redacteddocument | Get Redacted Document |
| [**removeSliceDocument()**](DataprojectApi.md#removeSliceDocument) | **POST** /api/dataproject/removeslicedoc |  |
| [**resetEvolve()**](DataprojectApi.md#resetEvolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application |
| [**saveProjectDefinition()**](DataprojectApi.md#saveProjectDefinition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition |
| [**setSliceConfig()**](DataprojectApi.md#setSliceConfig) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration |
| [**slicedDocuments()**](DataprojectApi.md#slicedDocuments) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters |
| [**startProject()**](DataprojectApi.md#startProject) | **POST** /api/dataproject/startproject |  |
| [**updateDocumentStatus()**](DataprojectApi.md#updateDocumentStatus) | **POST** /api/dataproject/updatedocstatus | Update document status |
| [**updateRedactions()**](DataprojectApi.md#updateRedactions) | **POST** /api/dataproject/updateredactions | Update document redactions |


## `addComment()`

```php
addComment($session_id, $cm_new_comment): string
```

Create Comment

Adds a comment with the given level and ids

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_new_comment = new \OpenAPI\Client\Model\CMNewComment(); // \OpenAPI\Client\Model\CMNewComment

try {
    $result = $apiInstance->addComment($session_id, $cm_new_comment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->addComment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_new_comment** | [**\OpenAPI\Client\Model\CMNewComment**](../Model/CMNewComment.md)|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `allTasks()`

```php
allTasks($session_id, $cm_queue_filter): \OpenAPI\Client\Model\CMPagedQueueItems
```

get Running Projects

Get the list of running projects

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_queue_filter = new \OpenAPI\Client\Model\CMQueueFilter(); // \OpenAPI\Client\Model\CMQueueFilter

try {
    $result = $apiInstance->allTasks($session_id, $cm_queue_filter);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->allTasks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_queue_filter** | [**\OpenAPI\Client\Model\CMQueueFilter**](../Model/CMQueueFilter.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMPagedQueueItems**](../Model/CMPagedQueueItems.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `changeTaskPhase()`

```php
changeTaskPhase($session_id, $cm_change_task_phase): string
```

Change Task Phase

Notifies Workflow engine that a task changed it's status and passes results in

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_change_task_phase = new \OpenAPI\Client\Model\CMChangeTaskPhase(); // \OpenAPI\Client\Model\CMChangeTaskPhase

try {
    $result = $apiInstance->changeTaskPhase($session_id, $cm_change_task_phase);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->changeTaskPhase: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_change_task_phase** | [**\OpenAPI\Client\Model\CMChangeTaskPhase**](../Model/CMChangeTaskPhase.md)|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `claimDocument()`

```php
claimDocument($session_id, $cm_claim_document): \OpenAPI\Client\Model\ReturnedDocument
```

Claim sliced document

Claim sliced document for signed in user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_claim_document = new \OpenAPI\Client\Model\CMClaimDocument(); // \OpenAPI\Client\Model\CMClaimDocument

try {
    $result = $apiInstance->claimDocument($session_id, $cm_claim_document);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->claimDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_claim_document** | [**\OpenAPI\Client\Model\CMClaimDocument**](../Model/CMClaimDocument.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ReturnedDocument**](../Model/ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `crawlerStatus()`

```php
crawlerStatus($organisation_id, $task_id, $session_id): \OpenAPI\Client\Model\CMCrawlerStatusTask
```

get Crawler Status

Get the crawler status for the given task id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$task_id = 'task_id_example'; // string | the id of the task
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->crawlerStatus($organisation_id, $task_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->crawlerStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **task_id** | **string**| the id of the task | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMCrawlerStatusTask**](../Model/CMCrawlerStatusTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `documentsByTokens()`

```php
documentsByTokens($session_id, $cm_documents_by_token): \OpenAPI\Client\Model\CMPagedProjectDocuments
```

Returns document list for tokens

Returns paged list of documents for the given set of query tokens

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_documents_by_token = new \OpenAPI\Client\Model\CMDocumentsByToken(); // \OpenAPI\Client\Model\CMDocumentsByToken

try {
    $result = $apiInstance->documentsByTokens($session_id, $cm_documents_by_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->documentsByTokens: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_documents_by_token** | [**\OpenAPI\Client\Model\CMDocumentsByToken**](../Model/CMDocumentsByToken.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMPagedProjectDocuments**](../Model/CMPagedProjectDocuments.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `filteredComments()`

```php
filteredComments($session_id, $cm_comment_filter): \OpenAPI\Client\Model\CMRecordedComment[]
```

Retrieve Comments

Retrieves the list of comments for the passed in Filter

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_comment_filter = new \OpenAPI\Client\Model\CMCommentFilter(); // \OpenAPI\Client\Model\CMCommentFilter

try {
    $result = $apiInstance->filteredComments($session_id, $cm_comment_filter);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->filteredComments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_comment_filter** | [**\OpenAPI\Client\Model\CMCommentFilter**](../Model/CMCommentFilter.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMRecordedComment[]**](../Model/CMRecordedComment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getDocumentRedactionInfo()`

```php
getDocumentRedactionInfo($organisation_id, $slice_id, $document_key, $session_id): \OpenAPI\Client\Model\LocatedRedaction[]
```

Get Document Redaction info

Get list of all identified potential Redaction locations for the document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$slice_id = 'slice_id_example'; // string | the id of the slice
$document_key = 'document_key_example'; // string | the document key of the document to be redacted
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getDocumentRedactionInfo($organisation_id, $slice_id, $document_key, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->getDocumentRedactionInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **slice_id** | **string**| the id of the slice | |
| **document_key** | **string**| the document key of the document to be redacted | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\LocatedRedaction[]**](../Model/LocatedRedaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getProjectDefinition()`

```php
getProjectDefinition($organisation_id, $task_id, $session_id): \OpenAPI\Client\Model\CMProjectDefinitionTask
```

get Project Definition

Get the project definition of the project for the given task id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$task_id = 'task_id_example'; // string | the id of the task
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getProjectDefinition($organisation_id, $task_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->getProjectDefinition: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **task_id** | **string**| the id of the task | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMProjectDefinitionTask**](../Model/CMProjectDefinitionTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getProjectReview()`

```php
getProjectReview($organisation_id, $project_id, $session_id): \OpenAPI\Client\Model\CMProjectReview
```

get Project Definition

Get the project review data of the project for the given project id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$project_id = 'project_id_example'; // string | the id of the task
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getProjectReview($organisation_id, $project_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->getProjectReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **project_id** | **string**| the id of the task | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMProjectReview**](../Model/CMProjectReview.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getProjectSlice()`

```php
getProjectSlice($organisation_id, $task_id, $session_id): \OpenAPI\Client\Model\CMProjectSliceTask[]
```

get project slice

Get the project project slice for the given task id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$task_id = 'task_id_example'; // string | the id of the task
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getProjectSlice($organisation_id, $task_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->getProjectSlice: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **task_id** | **string**| the id of the task | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMProjectSliceTask[]**](../Model/CMProjectSliceTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSearchResultSummary()`

```php
getSearchResultSummary($organisation_id, $task_id, $session_id): \OpenAPI\Client\Model\CMSearchResultSummaryTask
```

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$task_id = 'task_id_example'; // string | the id of the task
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getSearchResultSummary($organisation_id, $task_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->getSearchResultSummary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **task_id** | **string**| the id of the task | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMSearchResultSummaryTask**](../Model/CMSearchResultSummaryTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSearchResultSummaryForReview()`

```php
getSearchResultSummaryForReview($organisation_id, $project_id, $session_id): \OpenAPI\Client\Model\CMSearchResultSummary
```

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$project_id = 'project_id_example'; // string | the id of the task
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getSearchResultSummaryForReview($organisation_id, $project_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->getSearchResultSummaryForReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **project_id** | **string**| the id of the task | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMSearchResultSummary**](../Model/CMSearchResultSummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `nextDocument()`

```php
nextDocument($session_id, $cm_next_document): \OpenAPI\Client\Model\CMSlicedDocumentListAndTotals
```

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_next_document = new \OpenAPI\Client\Model\CMNextDocument(); // \OpenAPI\Client\Model\CMNextDocument

try {
    $result = $apiInstance->nextDocument($session_id, $cm_next_document);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->nextDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_next_document** | [**\OpenAPI\Client\Model\CMNextDocument**](../Model/CMNextDocument.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMSlicedDocumentListAndTotals**](../Model/CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pdfBinary()`

```php
pdfBinary($organisation_id, $kb_id, $url, $session_id): object
```

Binary

Get the original for a document if available by url (latest version)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | a base64 encoded url
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->pdfBinary($organisation_id, $kb_id, $url, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->pdfBinary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| a base64 encoded url | |
| **session_id** | **string**| a valid SimSage Session id. | [optional] |

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `projectTypes()`

```php
projectTypes($organisation_id, $session_id): \OpenAPI\Client\Model\CMProjectInfo[]
```

get Project Types

Get the list of available project types

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->projectTypes($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->projectTypes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMProjectInfo[]**](../Model/CMProjectInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reassignSliceDocument()`

```php
reassignSliceDocument($session_id, $cm_reassign_slice_document): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_reassign_slice_document = new \OpenAPI\Client\Model\CMReassignSliceDocument(); // \OpenAPI\Client\Model\CMReassignSliceDocument

try {
    $result = $apiInstance->reassignSliceDocument($session_id, $cm_reassign_slice_document);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->reassignSliceDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_reassign_slice_document** | [**\OpenAPI\Client\Model\CMReassignSliceDocument**](../Model/CMReassignSliceDocument.md)|  | |

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

## `redactedDocument()`

```php
redactedDocument($session_id, $cm_redaction_details): \OpenAPI\Client\Model\ReturnedDocument
```

Get Redacted Document

Retrieves the redacted document binary

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_redaction_details = new \OpenAPI\Client\Model\CMRedactionDetails(); // \OpenAPI\Client\Model\CMRedactionDetails

try {
    $result = $apiInstance->redactedDocument($session_id, $cm_redaction_details);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->redactedDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_redaction_details** | [**\OpenAPI\Client\Model\CMRedactionDetails**](../Model/CMRedactionDetails.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ReturnedDocument**](../Model/ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeSliceDocument()`

```php
removeSliceDocument($session_id, $cm_remove_slice_document): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_remove_slice_document = new \OpenAPI\Client\Model\CMRemoveSliceDocument(); // \OpenAPI\Client\Model\CMRemoveSliceDocument

try {
    $result = $apiInstance->removeSliceDocument($session_id, $cm_remove_slice_document);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->removeSliceDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_remove_slice_document** | [**\OpenAPI\Client\Model\CMRemoveSliceDocument**](../Model/CMRemoveSliceDocument.md)|  | |

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

## `resetEvolve()`

```php
resetEvolve($organisation_id, $session_id): string
```

Reset Evolve Application

Fully resets Evolve to an empty system

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | a valid SimSage Organisation id.
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->resetEvolve($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->resetEvolve: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| a valid SimSage Organisation id. | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `saveProjectDefinition()`

```php
saveProjectDefinition($session_id, $cm_project_definition): \OpenAPI\Client\Model\CMCreatedProject
```

Inserts/Updates a project definition

Inserts/Updates the details for a project definition

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_project_definition = new \OpenAPI\Client\Model\CMProjectDefinition(); // \OpenAPI\Client\Model\CMProjectDefinition

try {
    $result = $apiInstance->saveProjectDefinition($session_id, $cm_project_definition);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->saveProjectDefinition: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_project_definition** | [**\OpenAPI\Client\Model\CMProjectDefinition**](../Model/CMProjectDefinition.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMCreatedProject**](../Model/CMCreatedProject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `setSliceConfig()`

```php
setSliceConfig($session_id, $cm_set_slice_definitions): string
```

Set Slice configuration

Saves/updates the slices configured for a running project

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_set_slice_definitions = new \OpenAPI\Client\Model\CMSetSliceDefinitions(); // \OpenAPI\Client\Model\CMSetSliceDefinitions

try {
    $result = $apiInstance->setSliceConfig($session_id, $cm_set_slice_definitions);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->setSliceConfig: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_set_slice_definitions** | [**\OpenAPI\Client\Model\CMSetSliceDefinitions**](../Model/CMSetSliceDefinitions.md)|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `slicedDocuments()`

```php
slicedDocuments($session_id, $cm_sliced_document_request): \OpenAPI\Client\Model\CMSlicedDocumentListAndTotals
```

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_sliced_document_request = new \OpenAPI\Client\Model\CMSlicedDocumentRequest(); // \OpenAPI\Client\Model\CMSlicedDocumentRequest

try {
    $result = $apiInstance->slicedDocuments($session_id, $cm_sliced_document_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->slicedDocuments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_sliced_document_request** | [**\OpenAPI\Client\Model\CMSlicedDocumentRequest**](../Model/CMSlicedDocumentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMSlicedDocumentListAndTotals**](../Model/CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `startProject()`

```php
startProject($session_id, $cm_start_project): object
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_start_project = new \OpenAPI\Client\Model\CMStartProject(); // \OpenAPI\Client\Model\CMStartProject

try {
    $result = $apiInstance->startProject($session_id, $cm_start_project);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->startProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_start_project** | [**\OpenAPI\Client\Model\CMStartProject**](../Model/CMStartProject.md)|  | |

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

## `updateDocumentStatus()`

```php
updateDocumentStatus($session_id, $cm_update_document_status): string
```

Update document status

Updates the status applied to a slice document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_update_document_status = new \OpenAPI\Client\Model\CMUpdateDocumentStatus(); // \OpenAPI\Client\Model\CMUpdateDocumentStatus

try {
    $result = $apiInstance->updateDocumentStatus($session_id, $cm_update_document_status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->updateDocumentStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_update_document_status** | [**\OpenAPI\Client\Model\CMUpdateDocumentStatus**](../Model/CMUpdateDocumentStatus.md)|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateRedactions()`

```php
updateRedactions($session_id, $cm_update_redactions): string
```

Update document redactions

Updates the redactions applied to a document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DataprojectApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_update_redactions = new \OpenAPI\Client\Model\CMUpdateRedactions(); // \OpenAPI\Client\Model\CMUpdateRedactions

try {
    $result = $apiInstance->updateRedactions($session_id, $cm_update_redactions);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataprojectApi->updateRedactions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_update_redactions** | [**\OpenAPI\Client\Model\CMUpdateRedactions**](../Model/CMUpdateRedactions.md)|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
