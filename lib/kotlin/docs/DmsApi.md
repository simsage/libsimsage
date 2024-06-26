# DmsApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFolder**](DmsApi.md#addFolder) | **POST** /api/dms/folder | Add a new folder
[**addSourceFolder**](DmsApi.md#addSourceFolder) | **POST** /api/dms/source | Add a new source-folder
[**deleteAllNotes**](DmsApi.md#deleteAllNotes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes
[**deleteBookmark**](DmsApi.md#deleteBookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark
[**deleteDocumentOrFolder**](DmsApi.md#deleteDocumentOrFolder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder
[**deleteNote**](DmsApi.md#deleteNote) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note
[**deleteSourceFolder**](DmsApi.md#deleteSourceFolder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder
[**deleteSubscription**](DmsApi.md#deleteSubscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription
[**deleteUserSearch**](DmsApi.md#deleteUserSearch) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search
[**document1**](DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document
[**documentBinary**](DmsApi.md#documentBinary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary
[**documentVersion**](DmsApi.md#documentVersion) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document
[**filterFolders**](DmsApi.md#filterFolders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders
[**forceReleaseLock**](DmsApi.md#forceReleaseLock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock
[**getBookmarkList**](DmsApi.md#getBookmarkList) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks
[**getDeletedDocuments**](DmsApi.md#getDeletedDocuments) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter
[**getDocumentAudit**](DmsApi.md#getDocumentAudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month
[**getFolder**](DmsApi.md#getFolder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content
[**getFullAudit**](DmsApi.md#getFullAudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month
[**getLockedList**](DmsApi.md#getLockedList) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user
[**getNoteList**](DmsApi.md#getNoteList) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes
[**getSavedSearches**](DmsApi.md#getSavedSearches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches
[**getSourceFolder**](DmsApi.md#getSourceFolder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder
[**getSubscriptionList**](DmsApi.md#getSubscriptionList) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions
[**getUserDashboard**](DmsApi.md#getUserDashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard
[**getUserNotifications**](DmsApi.md#getUserNotifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications
[**lockDocument**](DmsApi.md#lockDocument) | **POST** /api/dms/lock | Document Lock
[**releaseLock**](DmsApi.md#releaseLock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock
[**restfulDMSClientQuery**](DmsApi.md#restfulDMSClientQuery) | **POST** /api/dms/query | DMS Client Query
[**saveBookmark**](DmsApi.md#saveBookmark) | **POST** /api/dms/bookmark | Save Bookmark
[**saveHashTags**](DmsApi.md#saveHashTags) | **POST** /api/dms/hash-tag | Save HashTag set for a document
[**saveNote**](DmsApi.md#saveNote) | **POST** /api/dms/note | Save Note
[**saveSearch**](DmsApi.md#saveSearch) | **POST** /api/dms/save-search | Save Search
[**saveSubscription**](DmsApi.md#saveSubscription) | **POST** /api/dms/subscription | Save Subscription
[**undeleteDocument**](DmsApi.md#undeleteDocument) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record
[**updateACLs**](DmsApi.md#updateACLs) | **POST** /api/dms/acls | Update an item&#39;s ACLs
[**uploadDocument**](DmsApi.md#uploadDocument) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document


<a id="addFolder"></a>
# **addFolder**
> CMDocumentFolder addFolder(sessionId, cmAddFolder, apIVersion)

Add a new folder

Add a new folder to the SimSage DMS.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmAddFolder : CMAddFolder =  // CMAddFolder | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.addFolder(sessionId, cmAddFolder, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#addFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#addFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmAddFolder** | [**CMAddFolder**](CMAddFolder.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="addSourceFolder"></a>
# **addSourceFolder**
> CMDocumentFolder addSourceFolder(sessionId, cmAddSourceFolder, apIVersion)

Add a new source-folder

Add a new top-level folder (source folder) to the SimSage DMS.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmAddSourceFolder : CMAddSourceFolder =  // CMAddSourceFolder | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.addSourceFolder(sessionId, cmAddSourceFolder, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#addSourceFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#addSourceFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmAddSourceFolder** | [**CMAddSourceFolder**](CMAddSourceFolder.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAllNotes"></a>
# **deleteAllNotes**
> JsonMessage deleteAllNotes(sessionId, organisationId, kbId, url, apIVersion)

delete all Notes

delete all notes associated with a document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteAllNotes(sessionId, organisationId, kbId, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteAllNotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteAllNotes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the base64 encoded url value |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteBookmark"></a>
# **deleteBookmark**
> kotlin.collections.List&lt;CMDocumentBookmark&gt; deleteBookmark(sessionId, organisationId, kbId, userId, url, apIVersion)

Delete a Bookmark

Delete a user&#39;s bookmark associated with a document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentBookmark> = apiInstance.deleteBookmark(sessionId, organisationId, kbId, userId, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteBookmark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteBookmark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **url** | **kotlin.String**| the base64 encoded url value |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentBookmark&gt;**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteDocumentOrFolder"></a>
# **deleteDocumentOrFolder**
> CMDocumentFolder deleteDocumentOrFolder(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, apIVersion)

Delete a document or a folder

Mark a document/folder as deleted in the SimSage DMS.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val isFolder : kotlin.Boolean = true // kotlin.Boolean | is this a folder or a document?
val sourceId : kotlin.Int = 56 // kotlin.Int | the source-id of the item being deleted
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val folderId : kotlin.String = folderId_example // kotlin.String | the folder's id
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.deleteDocumentOrFolder(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteDocumentOrFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteDocumentOrFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **isFolder** | **kotlin.Boolean**| is this a folder or a document? |
 **sourceId** | **kotlin.Int**| the source-id of the item being deleted |
 **url** | **kotlin.String**| the base64 encoded url value |
 **folderId** | **kotlin.String**| the folder&#39;s id |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteNote"></a>
# **deleteNote**
> kotlin.collections.List&lt;CMDocumentNote&gt; deleteNote(sessionId, organisationId, kbId, url, noteId, apIVersion)

Delete a Note

Delete a note associated with a document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val noteId : kotlin.Int = 56 // kotlin.Int | the id of the note to delete
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentNote> = apiInstance.deleteNote(sessionId, organisationId, kbId, url, noteId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the base64 encoded url value |
 **noteId** | **kotlin.Int**| the id of the note to delete |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentNote&gt;**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteSourceFolder"></a>
# **deleteSourceFolder**
> CMDocumentFolder deleteSourceFolder(sessionId, organisationId, kbId, sourceId, apIVersion)

Remove source-folder

Remove an existing top-level folder (source folder) from the SimSage DMS.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sourceId : kotlin.Int = 56 // kotlin.Int | the sourceId of the source-folder to remove
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.deleteSourceFolder(sessionId, organisationId, kbId, sourceId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteSourceFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteSourceFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sourceId** | **kotlin.Int**| the sourceId of the source-folder to remove |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteSubscription"></a>
# **deleteSubscription**
> CMSubscriptions deleteSubscription(sessionId, organisationId, kbId, userId, url, apIVersion)

Delete a Subscription

Delete a user&#39;s subscription associated with a document, returns an updated subscription set.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSubscriptions = apiInstance.deleteSubscription(sessionId, organisationId, kbId, userId, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **url** | **kotlin.String**| the base64 encoded url value |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteUserSearch"></a>
# **deleteUserSearch**
> kotlin.collections.List&lt;CMSavedSearch&gt; deleteUserSearch(sessionId, organisationId, kbId, userId, text, top, apIVersion)

Delete a Saved Search

Delete a user&#39;s saved search

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val text : kotlin.String = text_example // kotlin.String | the base64 encoded search-text value
val top : kotlin.Int = 56 // kotlin.Int | how many records to return
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMSavedSearch> = apiInstance.deleteUserSearch(sessionId, organisationId, kbId, userId, text, top, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#deleteUserSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#deleteUserSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **text** | **kotlin.String**| the base64 encoded search-text value |
 **top** | **kotlin.Int**| how many records to return |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMSavedSearch&gt;**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="document1"></a>
# **document1**
> CMDocument document1(sessionId, organisationId, kbId, urlId)

Get Document

Return a document&#39;s details by url-id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val urlId : kotlin.Int = 56 // kotlin.Int | the document's url-id, a unique id identifying a document.
try {
    val result : CMDocument = apiInstance.document1(sessionId, organisationId, kbId, urlId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#document1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#document1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **urlId** | **kotlin.Int**| the document&#39;s url-id, a unique id identifying a document. |

### Return type

[**CMDocument**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documentBinary"></a>
# **documentBinary**
> kotlin.ByteArray documentBinary(sessionId, organisationId, kbId, url)

Binary

Get the original for a document if available by url (latest version)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | a base64 encoded url
try {
    val result : kotlin.ByteArray = apiInstance.documentBinary(sessionId, organisationId, kbId, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#documentBinary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#documentBinary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| a base64 encoded url |

### Return type

**kotlin.ByteArray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="documentVersion"></a>
# **documentVersion**
> kotlin.ByteArray documentVersion(sessionId, organisationId, kbId, url, version)

Get Binary Document

Return a document&#39;s binary by url and version

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the document's url, base64 encoded.  A unique id identifying a document.
val version : kotlin.Int = 56 // kotlin.Int | the document's binary version.
try {
    val result : kotlin.ByteArray = apiInstance.documentVersion(sessionId, organisationId, kbId, url, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#documentVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#documentVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the document&#39;s url, base64 encoded.  A unique id identifying a document. |
 **version** | **kotlin.Int**| the document&#39;s binary version. |

### Return type

**kotlin.ByteArray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="filterFolders"></a>
# **filterFolders**
> CMDocumentFolder filterFolders(sessionId, organisationId, kbId, text, apIVersion)

Filter Folders

Filter a set of folders using Search

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val text : kotlin.String = text_example // kotlin.String | the text to use to filter (base64 encoded)
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.filterFolders(sessionId, organisationId, kbId, text, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#filterFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#filterFolders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **text** | **kotlin.String**| the text to use to filter (base64 encoded) |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="forceReleaseLock"></a>
# **forceReleaseLock**
> JsonMessage forceReleaseLock(sessionId, organisationId, kbId, userId, url, apIVersion)

Force-release a lock

A system administrator or manager can force-unlock a document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.forceReleaseLock(sessionId, organisationId, kbId, userId, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#forceReleaseLock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#forceReleaseLock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **url** | **kotlin.String**| the base64 encoded url value |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBookmarkList"></a>
# **getBookmarkList**
> kotlin.collections.List&lt;CMDocumentBookmark&gt; getBookmarkList(organisationId, kbId, userId, sessionId, apIVersion)

Get Bookmarks

Return a list of bookmarks for a given user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentBookmark> = apiInstance.getBookmarkList(organisationId, kbId, userId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getBookmarkList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getBookmarkList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentBookmark&gt;**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeletedDocuments"></a>
# **getDeletedDocuments**
> kotlin.collections.List&lt;DocumentDeleted&gt; getDeletedDocuments(sessionId, organisationId, kbId, filter, apIVersion)

Deleted records with optional filter

Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val filter : kotlin.String = filter_example // kotlin.String | an optional text filter for URLs
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<DocumentDeleted> = apiInstance.getDeletedDocuments(sessionId, organisationId, kbId, filter, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getDeletedDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getDeletedDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **filter** | **kotlin.String**| an optional text filter for URLs |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;DocumentDeleted&gt;**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDocumentAudit"></a>
# **getDocumentAudit**
> kotlin.collections.List&lt;CMDocumentAudit&gt; getDocumentAudit(sessionId, organisationId, kbId, year, month, url, apIVersion)

Audit records for a document for a month

Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val year : kotlin.Int = 56 // kotlin.Int | the year for the notifications
val month : kotlin.Int = 56 // kotlin.Int | the month for the notifications
val url : kotlin.String = url_example // kotlin.String | the document url (base64 encoded) to get audit records for
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentAudit> = apiInstance.getDocumentAudit(sessionId, organisationId, kbId, year, month, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getDocumentAudit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getDocumentAudit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **year** | **kotlin.Int**| the year for the notifications |
 **month** | **kotlin.Int**| the month for the notifications |
 **url** | **kotlin.String**| the document url (base64 encoded) to get audit records for |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFolder"></a>
# **getFolder**
> CMDocumentFolder getFolder(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, apIVersion)

Get Folder Content

Return a folder&#39;s content

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sourceId : kotlin.Int = 56 // kotlin.Int | the owner source's id
val folderId : kotlin.String = folderId_example // kotlin.String | the folder's id
val prevUrl : kotlin.String = prevUrl_example // kotlin.String | pagination, the previous last URL for the page-set ('null' is first page)
val pageSize : kotlin.Int = 56 // kotlin.Int | page-size for a paginated set
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.getFolder(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sourceId** | **kotlin.Int**| the owner source&#39;s id |
 **folderId** | **kotlin.String**| the folder&#39;s id |
 **prevUrl** | **kotlin.String**| pagination, the previous last URL for the page-set (&#39;null&#39; is first page) |
 **pageSize** | **kotlin.Int**| page-size for a paginated set |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFullAudit"></a>
# **getFullAudit**
> kotlin.collections.List&lt;CMDocumentAudit&gt; getFullAudit(sessionId, organisationId, kbId, year, month, apIVersion)

Audit records for a month

Return document audit records for a user (filtered) or administrator (all records) for a given month

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val year : kotlin.Int = 56 // kotlin.Int | the year for the notifications
val month : kotlin.Int = 56 // kotlin.Int | the month for the notifications
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentAudit> = apiInstance.getFullAudit(sessionId, organisationId, kbId, year, month, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getFullAudit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getFullAudit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **year** | **kotlin.Int**| the year for the notifications |
 **month** | **kotlin.Int**| the month for the notifications |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLockedList"></a>
# **getLockedList**
> kotlin.collections.List&lt;CMDocument&gt; getLockedList(organisationId, kbId, userId, sessionId, apIVersion)

Get locked documents for user

Return a list of locked documents for a given user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocument> = apiInstance.getLockedList(organisationId, kbId, userId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getLockedList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getLockedList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocument&gt;**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNoteList"></a>
# **getNoteList**
> kotlin.collections.List&lt;CMDocumentNote&gt; getNoteList(sessionId, organisationId, kbId, url, apIVersion)

Get Notes

Return a list of notes for a given url

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentNote> = apiInstance.getNoteList(sessionId, organisationId, kbId, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getNoteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getNoteList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the base64 encoded url value |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentNote&gt;**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSavedSearches"></a>
# **getSavedSearches**
> kotlin.collections.List&lt;CMSavedSearch&gt; getSavedSearches(sessionId, organisationId, kbId, userId, top, apIVersion)

User&#39;s saved searches

Return a user&#39;s saved searches

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val top : kotlin.Int = 56 // kotlin.Int | how many records to return
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMSavedSearch> = apiInstance.getSavedSearches(sessionId, organisationId, kbId, userId, top, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getSavedSearches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getSavedSearches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **top** | **kotlin.Int**| how many records to return |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMSavedSearch&gt;**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSourceFolder"></a>
# **getSourceFolder**
> CMDocumentFolder getSourceFolder(organisationId, kbId, sourceId, sessionId, apIVersion)

Get source-folder

Return the content of a top-level folder (source folder).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sourceId : kotlin.Int = 56 // kotlin.Int | the source-id of the item being deleted
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDocumentFolder = apiInstance.getSourceFolder(organisationId, kbId, sourceId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getSourceFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getSourceFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sourceId** | **kotlin.Int**| the source-id of the item being deleted |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubscriptionList"></a>
# **getSubscriptionList**
> CMSubscriptions getSubscriptionList(organisationId, kbId, userId, sessionId, apIVersion)

Get Subscriptions

Return a subscriptions object for a given user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSubscriptions = apiInstance.getSubscriptionList(organisationId, kbId, userId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getSubscriptionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getSubscriptionList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUserDashboard"></a>
# **getUserDashboard**
> CMDUserDashboard getUserDashboard(organisationId, kbId, sessionId, apIVersion)

User Dashboard

Return a the user&#39;s DMS dashboard

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMDUserDashboard = apiInstance.getUserDashboard(organisationId, kbId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getUserDashboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getUserDashboard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMDUserDashboard**](CMDUserDashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUserNotifications"></a>
# **getUserNotifications**
> kotlin.collections.List&lt;CMUserNotification&gt; getUserNotifications(sessionId, organisationId, kbId, year, month, apIVersion)

Get User Notifications

Return all user notifications from the DMS for a given user by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val year : kotlin.Int = 56 // kotlin.Int | the year for the notifications
val month : kotlin.Int = 56 // kotlin.Int | the month for the notifications
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMUserNotification> = apiInstance.getUserNotifications(sessionId, organisationId, kbId, year, month, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#getUserNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#getUserNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **year** | **kotlin.Int**| the year for the notifications |
 **month** | **kotlin.Int**| the month for the notifications |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMUserNotification&gt;**](CMUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="lockDocument"></a>
# **lockDocument**
> kotlin.collections.List&lt;CMDocument&gt; lockDocument(sessionId, cmDocumentLock, apIVersion)

Document Lock

Lock a document for a user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentLock : CMDocumentLock =  // CMDocumentLock | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocument> = apiInstance.lockDocument(sessionId, cmDocumentLock, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#lockDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#lockDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentLock** | [**CMDocumentLock**](CMDocumentLock.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocument&gt;**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="releaseLock"></a>
# **releaseLock**
> kotlin.collections.List&lt;CMDocument&gt; releaseLock(sessionId, organisationId, kbId, userId, url, apIVersion)

Release a lock

The originator of a lock releases a locked document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val userId : kotlin.String = userId_example // kotlin.String | the user's id
val url : kotlin.String = url_example // kotlin.String | the base64 encoded url value
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocument> = apiInstance.releaseLock(sessionId, organisationId, kbId, userId, url, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#releaseLock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#releaseLock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **userId** | **kotlin.String**| the user&#39;s id |
 **url** | **kotlin.String**| the base64 encoded url value |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocument&gt;**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="restfulDMSClientQuery"></a>
# **restfulDMSClientQuery**
> CMClientQueryResult restfulDMSClientQuery(sessionId, cmClientQuery)

DMS Client Query

a SimSage DMS client asks a question or performs a keyword-search.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmClientQuery : CMClientQuery =  // CMClientQuery | 
try {
    val result : CMClientQueryResult = apiInstance.restfulDMSClientQuery(sessionId, cmClientQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#restfulDMSClientQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#restfulDMSClientQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmClientQuery** | [**CMClientQuery**](CMClientQuery.md)|  |

### Return type

[**CMClientQueryResult**](CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveBookmark"></a>
# **saveBookmark**
> kotlin.collections.List&lt;DocumentBookmark&gt; saveBookmark(sessionId, cmDocumentBookmark, apIVersion)

Save Bookmark

Save (create or update) a SimSage Document Bookmark.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentBookmark : CMDocumentBookmark =  // CMDocumentBookmark | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<DocumentBookmark> = apiInstance.saveBookmark(sessionId, cmDocumentBookmark, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#saveBookmark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#saveBookmark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentBookmark** | [**CMDocumentBookmark**](CMDocumentBookmark.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;DocumentBookmark&gt;**](DocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveHashTags"></a>
# **saveHashTags**
> JsonMessage saveHashTags(sessionId, cmDocumentHashTag, apIVersion)

Save HashTag set for a document

Save (create / update / delete) a hashTag set for a document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentHashTag : CMDocumentHashTag =  // CMDocumentHashTag | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.saveHashTags(sessionId, cmDocumentHashTag, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#saveHashTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#saveHashTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentHashTag** | [**CMDocumentHashTag**](CMDocumentHashTag.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveNote"></a>
# **saveNote**
> kotlin.collections.List&lt;CMDocumentNote&gt; saveNote(sessionId, cmDocumentNote, apIVersion)

Save Note

Save (create or update) a SimSage Document Note.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentNote : CMDocumentNote =  // CMDocumentNote | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMDocumentNote> = apiInstance.saveNote(sessionId, cmDocumentNote, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#saveNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#saveNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentNote** | [**CMDocumentNote**](CMDocumentNote.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMDocumentNote&gt;**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveSearch"></a>
# **saveSearch**
> kotlin.collections.List&lt;CMSavedSearch&gt; saveSearch(sessionId, cmSavedSearch, apIVersion)

Save Search

Save a user&#39;s search query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSavedSearch : CMSavedSearch =  // CMSavedSearch | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMSavedSearch> = apiInstance.saveSearch(sessionId, cmSavedSearch, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#saveSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#saveSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSavedSearch** | [**CMSavedSearch**](CMSavedSearch.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMSavedSearch&gt;**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveSubscription"></a>
# **saveSubscription**
> CMSubscriptions saveSubscription(sessionId, cmDocumentSubscription, apIVersion)

Save Subscription

Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentSubscription : CMDocumentSubscription =  // CMDocumentSubscription | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSubscriptions = apiInstance.saveSubscription(sessionId, cmDocumentSubscription, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#saveSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#saveSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentSubscription** | [**CMDocumentSubscription**](CMDocumentSubscription.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="undeleteDocument"></a>
# **undeleteDocument**
> kotlin.collections.List&lt;DocumentDeleted&gt; undeleteDocument(sessionId, organisationId, kbId, sourceId, url, filter, apIVersion)

un-delete a record

Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sourceId : kotlin.Int = 56 // kotlin.Int | the item's source id
val url : kotlin.String = url_example // kotlin.String | the document's url, base64 encoded.  A unique id identifying a document.
val filter : kotlin.String = filter_example // kotlin.String | an optional text filter for URLs
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<DocumentDeleted> = apiInstance.undeleteDocument(sessionId, organisationId, kbId, sourceId, url, filter, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#undeleteDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#undeleteDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sourceId** | **kotlin.Int**| the item&#39;s source id |
 **url** | **kotlin.String**| the document&#39;s url, base64 encoded.  A unique id identifying a document. |
 **filter** | **kotlin.String**| an optional text filter for URLs |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;DocumentDeleted&gt;**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateACLs"></a>
# **updateACLs**
> JsonMessage updateACLs(sessionId, cmUpdateACLs, apIVersion)

Update an item&#39;s ACLs

Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmUpdateACLs : CMUpdateACLs =  // CMUpdateACLs | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.updateACLs(sessionId, cmUpdateACLs, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#updateACLs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#updateACLs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmUpdateACLs** | [**CMUpdateACLs**](CMUpdateACLs.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="uploadDocument"></a>
# **uploadDocument**
> CMDocumentFolder uploadDocument(sessionId, organisationId, kbId, sourceId, folderId, lastModified, file)

Upload a Document

Upload a document into a DMS folder

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DmsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sourceId : kotlin.Int = 56 // kotlin.Int | the owner source's id
val folderId : kotlin.String = folderId_example // kotlin.String | the id of the folder we're uploading into
val lastModified : kotlin.String = lastModified_example // kotlin.String | lastModified unix-date-time
val file : java.io.File = BINARY_DATA_HERE // java.io.File | the file to upload
try {
    val result : CMDocumentFolder = apiInstance.uploadDocument(sessionId, organisationId, kbId, sourceId, folderId, lastModified, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DmsApi#uploadDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DmsApi#uploadDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sourceId** | **kotlin.Int**| the owner source&#39;s id |
 **folderId** | **kotlin.String**| the id of the folder we&#39;re uploading into |
 **lastModified** | **kotlin.String**| lastModified unix-date-time |
 **file** | **java.io.File**| the file to upload |

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

