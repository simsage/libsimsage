# OpenAPI\Client\SemanticApi

All URIs are relative to https://training.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteTextToSearch()**](SemanticApi.md#deleteTextToSearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search |
| [**documentQuestionAndAnswer()**](SemanticApi.md#documentQuestionAndAnswer) | **POST** /api/semantic/document-qa | Document Q&amp;A |
| [**getTextToSearchPaginated()**](SemanticApi.md#getTextToSearchPaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings |
| [**restfulClientQuery()**](SemanticApi.md#restfulClientQuery) | **POST** /api/semantic/query | Client Query |
| [**saveTextToSearch()**](SemanticApi.md#saveTextToSearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item |
| [**shortSummary()**](SemanticApi.md#shortSummary) | **POST** /api/semantic/short-summary | Short summary |
| [**tryTextToSearchConversion()**](SemanticApi.md#tryTextToSearchConversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search |
| [**version1()**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version |


## `deleteTextToSearch()`

```php
deleteTextToSearch($organisation_id, $kb_id, $word, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete text-to-search

Remove an existing text-to-search item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$word = sort(); // string | the word of the text-to-search word
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteTextToSearch($organisation_id, $kb_id, $word, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->deleteTextToSearch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **word** | **string**| the word of the text-to-search word | |
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

## `documentQuestionAndAnswer()`

```php
documentQuestionAndAnswer($session_id, $cm_document_question_and_answer): \OpenAPI\Client\Model\CMDocumentQuestionAndAnswer
```

Document Q&A

Answer a question about a given document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_document_question_and_answer = new \OpenAPI\Client\Model\CMDocumentQuestionAndAnswer(); // \OpenAPI\Client\Model\CMDocumentQuestionAndAnswer

try {
    $result = $apiInstance->documentQuestionAndAnswer($session_id, $cm_document_question_and_answer);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->documentQuestionAndAnswer: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_document_question_and_answer** | [**\OpenAPI\Client\Model\CMDocumentQuestionAndAnswer**](../Model/CMDocumentQuestionAndAnswer.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMDocumentQuestionAndAnswer**](../Model/CMDocumentQuestionAndAnswer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getTextToSearchPaginated()`

```php
getTextToSearchPaginated($session_id, $cm_text_to_search_paginated, $api_version): \OpenAPI\Client\Model\CMTextToSearchPaginatedReturn
```

Text to Search mappings

Return a paginated list of text-to-search mappings with an optional filter.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_text_to_search_paginated = new \OpenAPI\Client\Model\CMTextToSearchPaginated(); // \OpenAPI\Client\Model\CMTextToSearchPaginated
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getTextToSearchPaginated($session_id, $cm_text_to_search_paginated, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->getTextToSearchPaginated: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_text_to_search_paginated** | [**\OpenAPI\Client\Model\CMTextToSearchPaginated**](../Model/CMTextToSearchPaginated.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMTextToSearchPaginatedReturn**](../Model/CMTextToSearchPaginatedReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `restfulClientQuery()`

```php
restfulClientQuery($cm_client_query): \OpenAPI\Client\Model\CMClientQueryResult
```

Client Query

a SimSage client asks a question or performs a keyword-search.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_client_query = new \OpenAPI\Client\Model\CMClientQuery(); // \OpenAPI\Client\Model\CMClientQuery

try {
    $result = $apiInstance->restfulClientQuery($cm_client_query);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->restfulClientQuery: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_client_query** | [**\OpenAPI\Client\Model\CMClientQuery**](../Model/CMClientQuery.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMClientQueryResult**](../Model/CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `saveTextToSearch()`

```php
saveTextToSearch($organisation_id, $kb_id, $session_id, $cm_text_to_search_edit, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Save a text-to-search item

Create or update (save) a text-to-search item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_text_to_search_edit = new \OpenAPI\Client\Model\CMTextToSearchEdit(); // \OpenAPI\Client\Model\CMTextToSearchEdit
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveTextToSearch($organisation_id, $kb_id, $session_id, $cm_text_to_search_edit, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->saveTextToSearch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_text_to_search_edit** | [**\OpenAPI\Client\Model\CMTextToSearchEdit**](../Model/CMTextToSearchEdit.md)|  | |
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

## `shortSummary()`

```php
shortSummary($cm_short_summary): \OpenAPI\Client\Model\CMShortSummaryResult
```

Short summary

Create a short summary for a given url / sentence

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_short_summary = new \OpenAPI\Client\Model\CMShortSummary(); // \OpenAPI\Client\Model\CMShortSummary

try {
    $result = $apiInstance->shortSummary($cm_short_summary);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->shortSummary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_short_summary** | [**\OpenAPI\Client\Model\CMShortSummary**](../Model/CMShortSummary.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMShortSummaryResult**](../Model/CMShortSummaryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `tryTextToSearchConversion()`

```php
tryTextToSearchConversion($session_id, $cm_text_to_search_conversion, $api_version): \OpenAPI\Client\Model\CMTextToSearchConversionReturn
```

try converting text-to-search

See the results of a text-to-search conversion

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_text_to_search_conversion = new \OpenAPI\Client\Model\CMTextToSearchConversion(); // \OpenAPI\Client\Model\CMTextToSearchConversion
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->tryTextToSearchConversion($session_id, $cm_text_to_search_conversion, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->tryTextToSearchConversion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_text_to_search_conversion** | [**\OpenAPI\Client\Model\CMTextToSearchConversion**](../Model/CMTextToSearchConversion.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMTextToSearchConversionReturn**](../Model/CMTextToSearchConversionReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version1()`

```php
version1(): \OpenAPI\Client\Model\CMVersion
```

Version

Get the version of SimSage Search Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\SemanticApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version1();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SemanticApi->version1: ', $e->getMessage(), PHP_EOL;
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
