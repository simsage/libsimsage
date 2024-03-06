# OpenAPI\Client\DmsApi

All URIs are relative to https://demo.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addFolder()**](DmsApi.md#addFolder) | **POST** /api/dms/folder | Add a new folder |
| [**addSourceFolder()**](DmsApi.md#addSourceFolder) | **POST** /api/dms/source | Add a new source-folder |
| [**deleteAllNotes()**](DmsApi.md#deleteAllNotes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes |
| [**deleteBookmark()**](DmsApi.md#deleteBookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark |
| [**deleteDocumentOrFolder()**](DmsApi.md#deleteDocumentOrFolder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder |
| [**deleteNote()**](DmsApi.md#deleteNote) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note |
| [**deleteSourceFolder()**](DmsApi.md#deleteSourceFolder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder |
| [**deleteSubscription()**](DmsApi.md#deleteSubscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription |
| [**deleteUserSearch()**](DmsApi.md#deleteUserSearch) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search |
| [**document1()**](DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document |
| [**documentBinary()**](DmsApi.md#documentBinary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary |
| [**documentVersion()**](DmsApi.md#documentVersion) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document |
| [**filterFolders()**](DmsApi.md#filterFolders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders |
| [**forceReleaseLock()**](DmsApi.md#forceReleaseLock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock |
| [**getBookmarkList()**](DmsApi.md#getBookmarkList) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks |
| [**getDeletedDocuments()**](DmsApi.md#getDeletedDocuments) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter |
| [**getDocumentAudit()**](DmsApi.md#getDocumentAudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month |
| [**getFolder()**](DmsApi.md#getFolder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content |
| [**getFullAudit()**](DmsApi.md#getFullAudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month |
| [**getLockedList()**](DmsApi.md#getLockedList) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user |
| [**getNoteList()**](DmsApi.md#getNoteList) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes |
| [**getSavedSearches()**](DmsApi.md#getSavedSearches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches |
| [**getSourceFolder()**](DmsApi.md#getSourceFolder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder |
| [**getSubscriptionList()**](DmsApi.md#getSubscriptionList) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions |
| [**getUserDashboard()**](DmsApi.md#getUserDashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard |
| [**getUserNotifications()**](DmsApi.md#getUserNotifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications |
| [**lockDocument()**](DmsApi.md#lockDocument) | **POST** /api/dms/lock | Document Lock |
| [**releaseLock()**](DmsApi.md#releaseLock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock |
| [**restfulDMSClientQuery()**](DmsApi.md#restfulDMSClientQuery) | **POST** /api/dms/query | DMS Client Query |
| [**saveBookmark()**](DmsApi.md#saveBookmark) | **POST** /api/dms/bookmark | Save Bookmark |
| [**saveHashTags()**](DmsApi.md#saveHashTags) | **POST** /api/dms/hash-tag | Save HashTag set for a document |
| [**saveNote()**](DmsApi.md#saveNote) | **POST** /api/dms/note | Save Note |
| [**saveSearch()**](DmsApi.md#saveSearch) | **POST** /api/dms/save-search | Save Search |
| [**saveSubscription()**](DmsApi.md#saveSubscription) | **POST** /api/dms/subscription | Save Subscription |
| [**undeleteDocument()**](DmsApi.md#undeleteDocument) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record |
| [**updateACLs()**](DmsApi.md#updateACLs) | **POST** /api/dms/acls | Update an item&#39;s ACLs |
| [**uploadDocument()**](DmsApi.md#uploadDocument) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document |


## `addFolder()`

```php
addFolder($session_id, $cm_add_folder, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Add a new folder

Add a new folder to the SimSage DMS.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_add_folder = new \OpenAPI\Client\Model\CMAddFolder(); // \OpenAPI\Client\Model\CMAddFolder
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->addFolder($session_id, $cm_add_folder, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->addFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_add_folder** | [**\OpenAPI\Client\Model\CMAddFolder**](../Model/CMAddFolder.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `addSourceFolder()`

```php
addSourceFolder($session_id, $cm_add_source_folder, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Add a new source-folder

Add a new top-level folder (source folder) to the SimSage DMS.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_add_source_folder = new \OpenAPI\Client\Model\CMAddSourceFolder(); // \OpenAPI\Client\Model\CMAddSourceFolder
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->addSourceFolder($session_id, $cm_add_source_folder, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->addSourceFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_add_source_folder** | [**\OpenAPI\Client\Model\CMAddSourceFolder**](../Model/CMAddSourceFolder.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteAllNotes()`

```php
deleteAllNotes($session_id, $organisation_id, $kb_id, $url, $api_version): \OpenAPI\Client\Model\JsonMessage
```

delete all Notes

delete all notes associated with a document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the base64 encoded url value
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteAllNotes($session_id, $organisation_id, $kb_id, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteAllNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the base64 encoded url value | |
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

## `deleteBookmark()`

```php
deleteBookmark($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version): \OpenAPI\Client\Model\CMDocumentBookmark[]
```

Delete a Bookmark

Delete a user's bookmark associated with a document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$url = 'url_example'; // string | the base64 encoded url value
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteBookmark($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteBookmark: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **url** | **string**| the base64 encoded url value | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentBookmark[]**](../Model/CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteDocumentOrFolder()`

```php
deleteDocumentOrFolder($session_id, $organisation_id, $kb_id, $is_folder, $source_id, $url, $folder_id, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Delete a document or a folder

Mark a document/folder as deleted in the SimSage DMS.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$is_folder = True; // bool | is this a folder or a document?
$source_id = 56; // int | the source-id of the item being deleted
$url = 'url_example'; // string | the base64 encoded url value
$folder_id = 'folder_id_example'; // string | the folder's id
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteDocumentOrFolder($session_id, $organisation_id, $kb_id, $is_folder, $source_id, $url, $folder_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteDocumentOrFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **is_folder** | **bool**| is this a folder or a document? | |
| **source_id** | **int**| the source-id of the item being deleted | |
| **url** | **string**| the base64 encoded url value | |
| **folder_id** | **string**| the folder&#39;s id | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteNote()`

```php
deleteNote($session_id, $organisation_id, $kb_id, $url, $note_id, $api_version): \OpenAPI\Client\Model\CMDocumentNote[]
```

Delete a Note

Delete a note associated with a document

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the base64 encoded url value
$note_id = 56; // int | the id of the note to delete
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteNote($session_id, $organisation_id, $kb_id, $url, $note_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteNote: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the base64 encoded url value | |
| **note_id** | **int**| the id of the note to delete | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentNote[]**](../Model/CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteSourceFolder()`

```php
deleteSourceFolder($session_id, $organisation_id, $kb_id, $source_id, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Remove source-folder

Remove an existing top-level folder (source folder) from the SimSage DMS.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$source_id = 56; // int | the sourceId of the source-folder to remove
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteSourceFolder($session_id, $organisation_id, $kb_id, $source_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteSourceFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **source_id** | **int**| the sourceId of the source-folder to remove | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteSubscription()`

```php
deleteSubscription($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version): \OpenAPI\Client\Model\CMSubscriptions
```

Delete a Subscription

Delete a user's subscription associated with a document, returns an updated subscription set.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$url = 'url_example'; // string | the base64 encoded url value
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteSubscription($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteSubscription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **url** | **string**| the base64 encoded url value | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSubscriptions**](../Model/CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteUserSearch()`

```php
deleteUserSearch($session_id, $organisation_id, $kb_id, $user_id, $text, $top, $api_version): \OpenAPI\Client\Model\CMSavedSearch[]
```

Delete a Saved Search

Delete a user's saved search

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$text = 'text_example'; // string | the base64 encoded search-text value
$top = 56; // int | how many records to return
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->deleteUserSearch($session_id, $organisation_id, $kb_id, $user_id, $text, $top, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->deleteUserSearch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **text** | **string**| the base64 encoded search-text value | |
| **top** | **int**| how many records to return | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSavedSearch[]**](../Model/CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `document1()`

```php
document1($session_id, $organisation_id, $kb_id, $url_id): \OpenAPI\Client\Model\CMDocument
```

Get Document

Return a document's details by url-id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url_id = 56; // int | the document's url-id, a unique id identifying a document.

try {
    $result = $apiInstance->document1($session_id, $organisation_id, $kb_id, $url_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->document1: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url_id** | **int**| the document&#39;s url-id, a unique id identifying a document. | |

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

## `documentBinary()`

```php
documentBinary($session_id, $organisation_id, $kb_id, $url): string
```

Binary

Get the original for a document if available by url (latest version)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | a base64 encoded url

try {
    $result = $apiInstance->documentBinary($session_id, $organisation_id, $kb_id, $url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->documentBinary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| a base64 encoded url | |

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

## `documentVersion()`

```php
documentVersion($session_id, $organisation_id, $kb_id, $url, $version): string
```

Get Binary Document

Return a document's binary by url and version

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the document's url, base64 encoded.  A unique id identifying a document.
$version = 56; // int | the document's binary version.

try {
    $result = $apiInstance->documentVersion($session_id, $organisation_id, $kb_id, $url, $version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->documentVersion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | |
| **version** | **int**| the document&#39;s binary version. | |

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

## `filterFolders()`

```php
filterFolders($session_id, $organisation_id, $kb_id, $text, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Filter Folders

Filter a set of folders using Search

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$text = 'text_example'; // string | the text to use to filter (base64 encoded)
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->filterFolders($session_id, $organisation_id, $kb_id, $text, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->filterFolders: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **text** | **string**| the text to use to filter (base64 encoded) | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `forceReleaseLock()`

```php
forceReleaseLock($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Force-release a lock

A system administrator or manager can force-unlock a document.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$url = 'url_example'; // string | the base64 encoded url value
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->forceReleaseLock($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->forceReleaseLock: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **url** | **string**| the base64 encoded url value | |
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

## `getBookmarkList()`

```php
getBookmarkList($organisation_id, $kb_id, $user_id, $session_id, $api_version): \OpenAPI\Client\Model\CMDocumentBookmark[]
```

Get Bookmarks

Return a list of bookmarks for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getBookmarkList($organisation_id, $kb_id, $user_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getBookmarkList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentBookmark[]**](../Model/CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getDeletedDocuments()`

```php
getDeletedDocuments($session_id, $organisation_id, $kb_id, $filter, $api_version): \OpenAPI\Client\Model\DocumentDeleted[]
```

Deleted records with optional filter

Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$filter = 'filter_example'; // string | an optional text filter for URLs
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getDeletedDocuments($session_id, $organisation_id, $kb_id, $filter, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getDeletedDocuments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **filter** | **string**| an optional text filter for URLs | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\DocumentDeleted[]**](../Model/DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getDocumentAudit()`

```php
getDocumentAudit($session_id, $organisation_id, $kb_id, $year, $month, $url, $api_version): \OpenAPI\Client\Model\CMDocumentAudit[]
```

Audit records for a document for a month

Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$year = 56; // int | the year for the notifications
$month = 56; // int | the month for the notifications
$url = 'url_example'; // string | the document url (base64 encoded) to get audit records for
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getDocumentAudit($session_id, $organisation_id, $kb_id, $year, $month, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getDocumentAudit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **year** | **int**| the year for the notifications | |
| **month** | **int**| the month for the notifications | |
| **url** | **string**| the document url (base64 encoded) to get audit records for | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentAudit[]**](../Model/CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getFolder()`

```php
getFolder($session_id, $organisation_id, $kb_id, $source_id, $folder_id, $prev_url, $page_size, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Get Folder Content

Return a folder's content

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$source_id = 56; // int | the owner source's id
$folder_id = 'folder_id_example'; // string | the folder's id
$prev_url = 'prev_url_example'; // string | pagination, the previous last URL for the page-set ('null' is first page)
$page_size = 56; // int | page-size for a paginated set
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getFolder($session_id, $organisation_id, $kb_id, $source_id, $folder_id, $prev_url, $page_size, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **source_id** | **int**| the owner source&#39;s id | |
| **folder_id** | **string**| the folder&#39;s id | |
| **prev_url** | **string**| pagination, the previous last URL for the page-set (&#39;null&#39; is first page) | |
| **page_size** | **int**| page-size for a paginated set | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getFullAudit()`

```php
getFullAudit($session_id, $organisation_id, $kb_id, $year, $month, $api_version): \OpenAPI\Client\Model\CMDocumentAudit[]
```

Audit records for a month

Return document audit records for a user (filtered) or administrator (all records) for a given month

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$year = 56; // int | the year for the notifications
$month = 56; // int | the month for the notifications
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getFullAudit($session_id, $organisation_id, $kb_id, $year, $month, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getFullAudit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **year** | **int**| the year for the notifications | |
| **month** | **int**| the month for the notifications | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentAudit[]**](../Model/CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getLockedList()`

```php
getLockedList($organisation_id, $kb_id, $user_id, $session_id, $api_version): \OpenAPI\Client\Model\CMDocument[]
```

Get locked documents for user

Return a list of locked documents for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getLockedList($organisation_id, $kb_id, $user_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getLockedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocument[]**](../Model/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getNoteList()`

```php
getNoteList($session_id, $organisation_id, $kb_id, $url, $api_version): \OpenAPI\Client\Model\CMDocumentNote[]
```

Get Notes

Return a list of notes for a given url

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$url = 'url_example'; // string | the base64 encoded url value
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getNoteList($session_id, $organisation_id, $kb_id, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getNoteList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **url** | **string**| the base64 encoded url value | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentNote[]**](../Model/CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSavedSearches()`

```php
getSavedSearches($session_id, $organisation_id, $kb_id, $user_id, $top, $api_version): \OpenAPI\Client\Model\CMSavedSearch[]
```

User's saved searches

Return a user's saved searches

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$top = 56; // int | how many records to return
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSavedSearches($session_id, $organisation_id, $kb_id, $user_id, $top, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getSavedSearches: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **top** | **int**| how many records to return | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSavedSearch[]**](../Model/CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSourceFolder()`

```php
getSourceFolder($organisation_id, $kb_id, $source_id, $session_id, $api_version): \OpenAPI\Client\Model\CMDocumentFolder
```

Get source-folder

Return the content of a top-level folder (source folder).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$source_id = 56; // int | the source-id of the item being deleted
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSourceFolder($organisation_id, $kb_id, $source_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getSourceFolder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **source_id** | **int**| the source-id of the item being deleted | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSubscriptionList()`

```php
getSubscriptionList($organisation_id, $kb_id, $user_id, $session_id, $api_version): \OpenAPI\Client\Model\CMSubscriptions
```

Get Subscriptions

Return a subscriptions object for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getSubscriptionList($organisation_id, $kb_id, $user_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getSubscriptionList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSubscriptions**](../Model/CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUserDashboard()`

```php
getUserDashboard($organisation_id, $kb_id, $session_id, $api_version): \OpenAPI\Client\Model\CMDUserDashboard
```

User Dashboard

Return a the user's DMS dashboard

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getUserDashboard($organisation_id, $kb_id, $session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getUserDashboard: ', $e->getMessage(), PHP_EOL;
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

[**\OpenAPI\Client\Model\CMDUserDashboard**](../Model/CMDUserDashboard.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUserNotifications()`

```php
getUserNotifications($session_id, $organisation_id, $kb_id, $year, $month, $api_version): \OpenAPI\Client\Model\CMUserNotification[]
```

Get User Notifications

Return all user notifications from the DMS for a given user by id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$year = 56; // int | the year for the notifications
$month = 56; // int | the month for the notifications
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->getUserNotifications($session_id, $organisation_id, $kb_id, $year, $month, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->getUserNotifications: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **year** | **int**| the year for the notifications | |
| **month** | **int**| the month for the notifications | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMUserNotification[]**](../Model/CMUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `lockDocument()`

```php
lockDocument($session_id, $cm_document_lock, $api_version): \OpenAPI\Client\Model\CMDocument[]
```

Document Lock

Lock a document for a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_document_lock = new \OpenAPI\Client\Model\CMDocumentLock(); // \OpenAPI\Client\Model\CMDocumentLock
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->lockDocument($session_id, $cm_document_lock, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->lockDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_document_lock** | [**\OpenAPI\Client\Model\CMDocumentLock**](../Model/CMDocumentLock.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocument[]**](../Model/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `releaseLock()`

```php
releaseLock($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version): \OpenAPI\Client\Model\CMDocument[]
```

Release a lock

The originator of a lock releases a locked document.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$user_id = 'user_id_example'; // string | the user's id
$url = 'url_example'; // string | the base64 encoded url value
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->releaseLock($session_id, $organisation_id, $kb_id, $user_id, $url, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->releaseLock: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **user_id** | **string**| the user&#39;s id | |
| **url** | **string**| the base64 encoded url value | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocument[]**](../Model/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `restfulDMSClientQuery()`

```php
restfulDMSClientQuery($session_id, $cm_client_query): \OpenAPI\Client\Model\CMClientQueryResult
```

DMS Client Query

a SimSage DMS client asks a question or performs a keyword-search.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_client_query = new \OpenAPI\Client\Model\CMClientQuery(); // \OpenAPI\Client\Model\CMClientQuery

try {
    $result = $apiInstance->restfulDMSClientQuery($session_id, $cm_client_query);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->restfulDMSClientQuery: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
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

## `saveBookmark()`

```php
saveBookmark($session_id, $cm_document_bookmark, $api_version): \OpenAPI\Client\Model\DocumentBookmark[]
```

Save Bookmark

Save (create or update) a SimSage Document Bookmark.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_document_bookmark = new \OpenAPI\Client\Model\CMDocumentBookmark(); // \OpenAPI\Client\Model\CMDocumentBookmark
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveBookmark($session_id, $cm_document_bookmark, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->saveBookmark: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_document_bookmark** | [**\OpenAPI\Client\Model\CMDocumentBookmark**](../Model/CMDocumentBookmark.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\DocumentBookmark[]**](../Model/DocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `saveHashTags()`

```php
saveHashTags($session_id, $cm_document_hash_tag, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Save HashTag set for a document

Save (create / update / delete) a hashTag set for a document.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_document_hash_tag = new \OpenAPI\Client\Model\CMDocumentHashTag(); // \OpenAPI\Client\Model\CMDocumentHashTag
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveHashTags($session_id, $cm_document_hash_tag, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->saveHashTags: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_document_hash_tag** | [**\OpenAPI\Client\Model\CMDocumentHashTag**](../Model/CMDocumentHashTag.md)|  | |
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

## `saveNote()`

```php
saveNote($session_id, $cm_document_note, $api_version): \OpenAPI\Client\Model\CMDocumentNote[]
```

Save Note

Save (create or update) a SimSage Document Note.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_document_note = new \OpenAPI\Client\Model\CMDocumentNote(); // \OpenAPI\Client\Model\CMDocumentNote
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveNote($session_id, $cm_document_note, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->saveNote: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_document_note** | [**\OpenAPI\Client\Model\CMDocumentNote**](../Model/CMDocumentNote.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMDocumentNote[]**](../Model/CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `saveSearch()`

```php
saveSearch($session_id, $cm_saved_search, $api_version): \OpenAPI\Client\Model\CMSavedSearch[]
```

Save Search

Save a user's search query.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_saved_search = new \OpenAPI\Client\Model\CMSavedSearch(); // \OpenAPI\Client\Model\CMSavedSearch
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveSearch($session_id, $cm_saved_search, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->saveSearch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_saved_search** | [**\OpenAPI\Client\Model\CMSavedSearch**](../Model/CMSavedSearch.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSavedSearch[]**](../Model/CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `saveSubscription()`

```php
saveSubscription($session_id, $cm_document_subscription, $api_version): \OpenAPI\Client\Model\CMSubscriptions
```

Save Subscription

Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_document_subscription = new \OpenAPI\Client\Model\CMDocumentSubscription(); // \OpenAPI\Client\Model\CMDocumentSubscription
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->saveSubscription($session_id, $cm_document_subscription, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->saveSubscription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_document_subscription** | [**\OpenAPI\Client\Model\CMDocumentSubscription**](../Model/CMDocumentSubscription.md)|  | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\CMSubscriptions**](../Model/CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `undeleteDocument()`

```php
undeleteDocument($session_id, $organisation_id, $kb_id, $source_id, $url, $filter, $api_version): \OpenAPI\Client\Model\DocumentDeleted[]
```

un-delete a record

Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$source_id = 56; // int | the item's source id
$url = 'url_example'; // string | the document's url, base64 encoded.  A unique id identifying a document.
$filter = 'filter_example'; // string | an optional text filter for URLs
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->undeleteDocument($session_id, $organisation_id, $kb_id, $source_id, $url, $filter, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->undeleteDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **source_id** | **int**| the item&#39;s source id | |
| **url** | **string**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | |
| **filter** | **string**| an optional text filter for URLs | |
| **api_version** | **string**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\DocumentDeleted[]**](../Model/DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateACLs()`

```php
updateACLs($session_id, $cm_update_acls, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Update an item's ACLs

Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_update_acls = new \OpenAPI\Client\Model\CMUpdateACLs(); // \OpenAPI\Client\Model\CMUpdateACLs
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->updateACLs($session_id, $cm_update_acls, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->updateACLs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_update_acls** | [**\OpenAPI\Client\Model\CMUpdateACLs**](../Model/CMUpdateACLs.md)|  | |
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

## `uploadDocument()`

```php
uploadDocument($session_id, $organisation_id, $kb_id, $source_id, $folder_id, $last_modified, $file): \OpenAPI\Client\Model\CMDocumentFolder
```

Upload a Document

Upload a document into a DMS folder

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DmsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$kb_id = 'kb_id_example'; // string | the knowledge-base (its guid id)
$source_id = 56; // int | the owner source's id
$folder_id = 'folder_id_example'; // string | the id of the folder we're uploading into
$last_modified = 'last_modified_example'; // string | lastModified unix-date-time
$file = "/path/to/file.txt"; // \SplFileObject | the file to upload

try {
    $result = $apiInstance->uploadDocument($session_id, $organisation_id, $kb_id, $source_id, $folder_id, $last_modified, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DmsApi->uploadDocument: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **kb_id** | **string**| the knowledge-base (its guid id) | |
| **source_id** | **int**| the owner source&#39;s id | |
| **folder_id** | **string**| the id of the folder we&#39;re uploading into | |
| **last_modified** | **string**| lastModified unix-date-time | |
| **file** | **\SplFileObject****\SplFileObject**| the file to upload | |

### Return type

[**\OpenAPI\Client\Model\CMDocumentFolder**](../Model/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
