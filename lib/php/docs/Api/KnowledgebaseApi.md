# OpenAPI\Client\KnowledgebaseApi

All URIs are relative to https://test.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**exportKnowledgeBase()**](KnowledgebaseApi.md#exportKnowledgeBase) | **POST** /api/knowledgebase/export | export Knowledge-base |
| [**getKnowledgeBase()**](KnowledgebaseApi.md#getKnowledgeBase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base |
| [**getKnowledgeBases()**](KnowledgebaseApi.md#getKnowledgeBases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases |
| [**getSearchInfo()**](KnowledgebaseApi.md#getSearchInfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info |
| [**getSearchInfo2()**](KnowledgebaseApi.md#getSearchInfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated] |
| [**removeKnowledgeBase()**](KnowledgebaseApi.md#removeKnowledgeBase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base |
| [**updateKnowledgeBase()**](KnowledgebaseApi.md#updateKnowledgeBase) | **PUT** /api/knowledgebase/save | Save Knowledge-base |
| [**version3()**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version |


## `exportKnowledgeBase()`

```php
exportKnowledgeBase($session_id, $cm_knowledge_base_export, $api_version): \OpenAPI\Client\Model\JsonMessage
```

export Knowledge-base

starts the export of a knowledge-base using the passed in exporter config

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_knowledge_base_export = new \OpenAPI\Client\Model\CMKnowledgeBaseExport(); // \OpenAPI\Client\Model\CMKnowledgeBaseExport
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->exportKnowledgeBase($session_id, $cm_knowledge_base_export, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->exportKnowledgeBase: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_knowledge_base_export** | [**\OpenAPI\Client\Model\CMKnowledgeBaseExport**](../Model/CMKnowledgeBaseExport.md)|  | |
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

## `getKnowledgeBase()`

```php
getKnowledgeBase($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\CMKnowledgeBase
```

Get Knowledge-base

Return a knowledge base by id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base to get (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getKnowledgeBase($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->getKnowledgeBase: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base to get (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMKnowledgeBase**](../Model/CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getKnowledgeBases()`

```php
getKnowledgeBases($organisation_id, $session_id): \OpenAPI\Client\Model\CMKnowledgeBase[]
```

Get Knowledge-bases

Return a list of knowledge bases for a given organisation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getKnowledgeBases($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->getKnowledgeBases: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMKnowledgeBase[]**](../Model/CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSearchInfo()`

```php
getSearchInfo($organisation_id, $client_id, $api_version): \OpenAPI\Client\Model\CMInfo
```

Search Info

return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$client_id = 'client_id_example'; // string | the client's id (its guid id), pre-register this client as a known client.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSearchInfo($organisation_id, $client_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->getSearchInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **client_id** | **string**| the client&#39;s id (its guid id), pre-register this client as a known client. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMInfo**](../Model/CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSearchInfo2()`

```php
getSearchInfo2($organisation_id, $api_version): \OpenAPI\Client\Model\CMInfo
```

Search Info [deprecated]

Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSearchInfo2($organisation_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->getSearchInfo2: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMInfo**](../Model/CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeKnowledgeBase()`

```php
removeKnowledgeBase($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Delete Knowledge-base

Delete a knowledge-base by Id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base to delete/remove (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->removeKnowledgeBase($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->removeKnowledgeBase: ', $e->getMessage(), PHP_EOL;
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

## `updateKnowledgeBase()`

```php
updateKnowledgeBase($session_id, $cm_knowledge_base, $api_version): \OpenAPI\Client\Model\KnowledgeBase
```

Save Knowledge-base

Save (Create or Update) a SimSage knowledge base item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_knowledge_base = new \OpenAPI\Client\Model\CMKnowledgeBase(); // \OpenAPI\Client\Model\CMKnowledgeBase
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->updateKnowledgeBase($session_id, $cm_knowledge_base, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->updateKnowledgeBase: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_knowledge_base** | [**\OpenAPI\Client\Model\CMKnowledgeBase**](../Model/CMKnowledgeBase.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\KnowledgeBase**](../Model/KnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version3()`

```php
version3(): \OpenAPI\Client\Model\CMVersion
```

Version

Return the version of SimSage knowledge-base Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\KnowledgebaseApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version3();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KnowledgebaseApi->version3: ', $e->getMessage(), PHP_EOL;
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
