# OpenAPI\Client\LanguageApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addDefaultSynSets()**](LanguageApi.md#addDefaultSynSets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets |
| [**deleteAllSynonyms()**](LanguageApi.md#deleteAllSynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms |
| [**deleteCategorization()**](LanguageApi.md#deleteCategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization |
| [**deleteSemantic()**](LanguageApi.md#deleteSemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic |
| [**deleteSynSet()**](LanguageApi.md#deleteSynSet) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet |
| [**deleteSynonym()**](LanguageApi.md#deleteSynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym |
| [**findSynSets()**](LanguageApi.md#findSynSets) | **PUT** /api/language/find-syn-sets | Find SynSets |
| [**getCategorizationList()**](LanguageApi.md#getCategorizationList) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list |
| [**getPaginated()**](LanguageApi.md#getPaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated |
| [**getSemanticsPaginated()**](LanguageApi.md#getSemanticsPaginated) | **PUT** /api/language/semantics | Semantics Paginated |
| [**optimizeIndexes()**](LanguageApi.md#optimizeIndexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes |
| [**redactDocument()**](LanguageApi.md#redactDocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document |
| [**saveCategorization()**](LanguageApi.md#saveCategorization) | **PUT** /api/language/categorization | save categorization |
| [**saveSemantic()**](LanguageApi.md#saveSemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic |
| [**saveSynSet()**](LanguageApi.md#saveSynSet) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet |
| [**saveSynonym()**](LanguageApi.md#saveSynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym |
| [**truncateSlowIndexes()**](LanguageApi.md#truncateSlowIndexes) | **GET** /api/language/truncate-slow-indexes/{organisationId}/{kbId} | Truncate slow Indexes |
| [**tuneLanguageGraph()**](LanguageApi.md#tuneLanguageGraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph |
| [**version2()**](LanguageApi.md#version2) | **GET** /api/language/version | Version |


## `addDefaultSynSets()`

```php
addDefaultSynSets($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Add all default SynSets

Add default syn-sets to the given org/kb

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->addDefaultSynSets($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->addDefaultSynSets: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
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

## `deleteAllSynonyms()`

```php
deleteAllSynonyms($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete All Synonyms

Delete all synonyms for a given org/kb

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base to delete/remove (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteAllSynonyms($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->deleteAllSynonyms: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base to delete/remove (its guid id) | |
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

## `deleteCategorization()`

```php
deleteCategorization($organisation_id, $kb_id, $categorization_label, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

remove categorization

remove a specific categorization for a given org/kb

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$categorization_label = 'categorization_label_example'; // string | the metadata (name) to remove
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteCategorization($organisation_id, $kb_id, $categorization_label, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->deleteCategorization: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **categorization_label** | **string**| the metadata (name) to remove | |
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

## `deleteSemantic()`

```php
deleteSemantic($organisation_id, $kb_id, $word, $semantic, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete Semantic

Remove an existing semantic from SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$word = John; // string | the word (more specific item) of the semantic to delete (eg. \"John\")
$semantic = person; // string | the semantic of the word to delete (eg. \"person\")
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteSemantic($organisation_id, $kb_id, $word, $semantic, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->deleteSemantic: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **word** | **string**| the word (more specific item) of the semantic to delete (eg. \&quot;John\&quot;) | |
| **semantic** | **string**| the semantic of the word to delete (eg. \&quot;person\&quot;) | |
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

## `deleteSynSet()`

```php
deleteSynSet($organisation_id, $kb_id, $lemma, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete SynSet

Remove a syn-set from SimSage by lemma.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$lemma = 'lemma_example'; // string | the lemma (base word) of the syn-set to remove.
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteSynSet($organisation_id, $kb_id, $lemma, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->deleteSynSet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **lemma** | **string**| the lemma (base word) of the syn-set to remove. | |
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

## `deleteSynonym()`

```php
deleteSynonym($organisation_id, $kb_id, $id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete Synonym

Delete a synonym using its id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$id = 56; // int | the id of the synonym to remove.
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteSynonym($organisation_id, $kb_id, $id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->deleteSynonym: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **id** | **int**| the id of the synonym to remove. | |
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

## `findSynSets()`

```php
findSynSets($session_id, $cm_syn_set_find, $api_version): \OpenAPI\Client\Model\CMSynSetList
```

Find SynSets

Find syn-sets using filters

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_syn_set_find = new \OpenAPI\Client\Model\CMSynSetFind(); // \OpenAPI\Client\Model\CMSynSetFind
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->findSynSets($session_id, $cm_syn_set_find, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->findSynSets: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_syn_set_find** | [**\OpenAPI\Client\Model\CMSynSetFind**](../Model/CMSynSetFind.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSynSetList**](../Model/CMSynSetList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getCategorizationList()`

```php
getCategorizationList($organisation_id, $kb_id, $prev_categorization_label, $page_size, $session_id, $api_version): \OpenAPI\Client\Model\CMCategorizationPaginatedList
```

categorization list

get all categorizations for a given org/kb paginated

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$prev_categorization_label = 'prev_categorization_label_example'; // string | the previous categorization label for pagination, or null if first page
$page_size = 56; // int | the size of the page returned
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getCategorizationList($organisation_id, $kb_id, $prev_categorization_label, $page_size, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->getCategorizationList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **prev_categorization_label** | **string**| the previous categorization label for pagination, or null if first page | |
| **page_size** | **int**| the size of the page returned | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMCategorizationPaginatedList**](../Model/CMCategorizationPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getPaginated()`

```php
getPaginated($session_id, $cm_synonyms_paginated, $api_version): \OpenAPI\Client\Model\CMSynonymsPaginatedResult
```

get Synonyms Paginated

return a paginated list of synonyms with optional filtering.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_synonyms_paginated = new \OpenAPI\Client\Model\CMSynonymsPaginated(); // \OpenAPI\Client\Model\CMSynonymsPaginated
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getPaginated($session_id, $cm_synonyms_paginated, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->getPaginated: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_synonyms_paginated** | [**\OpenAPI\Client\Model\CMSynonymsPaginated**](../Model/CMSynonymsPaginated.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSynonymsPaginatedResult**](../Model/CMSynonymsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSemanticsPaginated()`

```php
getSemanticsPaginated($session_id, $cm_semantics_paginated, $api_version): \OpenAPI\Client\Model\CMSemanticsPaginatedResult
```

Semantics Paginated

Return a paginated list of semantics with an optional filter.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_semantics_paginated = new \OpenAPI\Client\Model\CMSemanticsPaginated(); // \OpenAPI\Client\Model\CMSemanticsPaginated
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSemanticsPaginated($session_id, $cm_semantics_paginated, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->getSemanticsPaginated: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_semantics_paginated** | [**\OpenAPI\Client\Model\CMSemanticsPaginated**](../Model/CMSemanticsPaginated.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSemanticsPaginatedResult**](../Model/CMSemanticsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `optimizeIndexes()`

```php
optimizeIndexes($session_id, $cm_optimize_index, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Optimize Indexes

Force index optimization for a the given knowledge-base, now.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_optimize_index = new \OpenAPI\Client\Model\CMOptimizeIndex(); // \OpenAPI\Client\Model\CMOptimizeIndex
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->optimizeIndexes($session_id, $cm_optimize_index, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->optimizeIndexes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_optimize_index** | [**\OpenAPI\Client\Model\CMOptimizeIndex**](../Model/CMOptimizeIndex.md)|  | |
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

## `redactDocument()`

```php
redactDocument($organisation_id, $kb_id, $url, $entity_csv, $word_csv, $allow_words_csv, $session_id): string
```

Redact Document

Create a redacted version of a document as a PDF given its url.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the base-64 encoded (no-prefix) url of the document
$entity_csv = 'entity_csv_example'; // string | a csv list of entities to redact (e.g. person,location)
$word_csv = 'word_csv_example'; // string | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.)
$allow_words_csv = 'allow_words_csv_example'; // string | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.)
$session_id = 'session_id_example'; // string | an optional SimSage Session id.

try {
    $result = $apiInstance->redactDocument($organisation_id, $kb_id, $url, $entity_csv, $word_csv, $allow_words_csv, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->redactDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the base-64 encoded (no-prefix) url of the document | |
| **entity_csv** | **string**| a csv list of entities to redact (e.g. person,location) | |
| **word_csv** | **string**| a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) | |
| **allow_words_csv** | **string**| a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) | |
| **session_id** | **string**| an optional SimSage Session id. | [optional] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/pdf`, `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `saveCategorization()`

```php
saveCategorization($session_id, $cm_categorization, $api_version): \OpenAPI\Client\Model\JsonMessage
```

save categorization

create or update a specific categorization for a given org/kb

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_categorization = new \OpenAPI\Client\Model\CMCategorization(); // \OpenAPI\Client\Model\CMCategorization
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveCategorization($session_id, $cm_categorization, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->saveCategorization: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_categorization** | [**\OpenAPI\Client\Model\CMCategorization**](../Model/CMCategorization.md)|  | |
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

## `saveSemantic()`

```php
saveSemantic($organisation_id, $kb_id, $session_id, $cm_semantic_model_edit, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Save Semantic

Create or update (save) a semantic in SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_semantic_model_edit = new \OpenAPI\Client\Model\CMSemanticModelEdit(); // \OpenAPI\Client\Model\CMSemanticModelEdit
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveSemantic($organisation_id, $kb_id, $session_id, $cm_semantic_model_edit, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->saveSemantic: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_semantic_model_edit** | [**\OpenAPI\Client\Model\CMSemanticModelEdit**](../Model/CMSemanticModelEdit.md)|  | |
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

## `saveSynSet()`

```php
saveSynSet($organisation_id, $kb_id, $session_id, $cm_syn_set, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Save SynSet

Save (update/create) a syn-set in SimSage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_syn_set = new \OpenAPI\Client\Model\CMSynSet(); // \OpenAPI\Client\Model\CMSynSet
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveSynSet($organisation_id, $kb_id, $session_id, $cm_syn_set, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->saveSynSet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_syn_set** | [**\OpenAPI\Client\Model\CMSynSet**](../Model/CMSynSet.md)|  | |
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

## `saveSynonym()`

```php
saveSynonym($organisation_id, $kb_id, $session_id, $cm_synonym, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Save Synonym

Save (update/create) a synonym.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_synonym = new \OpenAPI\Client\Model\CMSynonym(); // \OpenAPI\Client\Model\CMSynonym
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveSynonym($organisation_id, $kb_id, $session_id, $cm_synonym, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->saveSynonym: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_synonym** | [**\OpenAPI\Client\Model\CMSynonym**](../Model/CMSynonym.md)|  | |
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

## `truncateSlowIndexes()`

```php
truncateSlowIndexes($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Truncate slow Indexes

Force slow-index truncation for a the given knowledge-base, now.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$kb_id = 'kb_id_example'; // string | the knowledge-bases' id (a guid)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->truncateSlowIndexes($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->truncateSlowIndexes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **kb_id** | **string**| the knowledge-bases&#39; id (a guid) | |
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

## `tuneLanguageGraph()`

```php
tuneLanguageGraph($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Tune Graph

Create a tuned language graph for a given organisation/knowledge-base.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->tuneLanguageGraph($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->tuneLanguageGraph: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
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

## `version2()`

```php
version2(): \OpenAPI\Client\Model\CMVersion
```

Version

Return the version of the SimSage Language Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\LanguageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version2();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LanguageApi->version2: ', $e->getMessage(), PHP_EOL;
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
