# DmsApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFolder**](DmsApi.md#addFolder) | **POST** /api/dms/folder | Add a new folder |
| [**addSourceFolder**](DmsApi.md#addSourceFolder) | **POST** /api/dms/source | Add a new source-folder |
| [**deleteAllNotes**](DmsApi.md#deleteAllNotes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes |
| [**deleteBookmark**](DmsApi.md#deleteBookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark |
| [**deleteDocumentOrFolder**](DmsApi.md#deleteDocumentOrFolder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder |
| [**deleteNote**](DmsApi.md#deleteNote) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note |
| [**deleteSourceFolder**](DmsApi.md#deleteSourceFolder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder |
| [**deleteSubscription**](DmsApi.md#deleteSubscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription |
| [**deleteUserSearch**](DmsApi.md#deleteUserSearch) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search |
| [**document1**](DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document |
| [**documentBinary**](DmsApi.md#documentBinary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary |
| [**documentVersion**](DmsApi.md#documentVersion) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document |
| [**filterFolders**](DmsApi.md#filterFolders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders |
| [**forceReleaseLock**](DmsApi.md#forceReleaseLock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock |
| [**getBookmarkList**](DmsApi.md#getBookmarkList) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks |
| [**getDeletedDocuments**](DmsApi.md#getDeletedDocuments) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter |
| [**getDocumentAudit**](DmsApi.md#getDocumentAudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month |
| [**getFolder**](DmsApi.md#getFolder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content |
| [**getFullAudit**](DmsApi.md#getFullAudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month |
| [**getLockedList**](DmsApi.md#getLockedList) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user |
| [**getNoteList**](DmsApi.md#getNoteList) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes |
| [**getSavedSearches**](DmsApi.md#getSavedSearches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches |
| [**getSourceFolder**](DmsApi.md#getSourceFolder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder |
| [**getSubscriptionList**](DmsApi.md#getSubscriptionList) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions |
| [**getUserDashboard**](DmsApi.md#getUserDashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard |
| [**getUserNotifications**](DmsApi.md#getUserNotifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications |
| [**lockDocument**](DmsApi.md#lockDocument) | **POST** /api/dms/lock | Document Lock |
| [**releaseLock**](DmsApi.md#releaseLock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock |
| [**restfulDMSClientQuery**](DmsApi.md#restfulDMSClientQuery) | **POST** /api/dms/query | DMS Client Query |
| [**saveBookmark**](DmsApi.md#saveBookmark) | **POST** /api/dms/bookmark | Save Bookmark |
| [**saveHashTags**](DmsApi.md#saveHashTags) | **POST** /api/dms/hash-tag | Save HashTag set for a document |
| [**saveNote**](DmsApi.md#saveNote) | **POST** /api/dms/note | Save Note |
| [**saveSearch**](DmsApi.md#saveSearch) | **POST** /api/dms/save-search | Save Search |
| [**saveSubscription**](DmsApi.md#saveSubscription) | **POST** /api/dms/subscription | Save Subscription |
| [**undeleteDocument**](DmsApi.md#undeleteDocument) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record |
| [**updateACLs**](DmsApi.md#updateACLs) | **POST** /api/dms/acls | Update an item&#39;s ACLs |
| [**uploadDocument**](DmsApi.md#uploadDocument) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document |


<a name="addFolder"></a>
# **addFolder**
> CMDocumentFolder addFolder(session-id, CMAddFolder, API-Version)

Add a new folder

    Add a new folder to the SimSage DMS.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMAddFolder** | [**CMAddFolder**](../Models/CMAddFolder.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="addSourceFolder"></a>
# **addSourceFolder**
> CMDocumentFolder addSourceFolder(session-id, CMAddSourceFolder, API-Version)

Add a new source-folder

    Add a new top-level folder (source folder) to the SimSage DMS.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMAddSourceFolder** | [**CMAddSourceFolder**](../Models/CMAddSourceFolder.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteAllNotes"></a>
# **deleteAllNotes**
> JsonMessage deleteAllNotes(session-id, organisationId, kbId, url, API-Version)

delete all Notes

    delete all notes associated with a document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteBookmark"></a>
# **deleteBookmark**
> List deleteBookmark(session-id, organisationId, kbId, userId, url, API-Version)

Delete a Bookmark

    Delete a user&#39;s bookmark associated with a document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteDocumentOrFolder"></a>
# **deleteDocumentOrFolder**
> CMDocumentFolder deleteDocumentOrFolder(session-id, organisationId, kbId, isFolder, sourceId, url, folderId, API-Version)

Delete a document or a folder

    Mark a document/folder as deleted in the SimSage DMS.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **isFolder** | **Boolean**| is this a folder or a document? | [default to null] |
| **sourceId** | **Integer**| the source-id of the item being deleted | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **folderId** | **String**| the folder&#39;s id | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteNote"></a>
# **deleteNote**
> List deleteNote(session-id, organisationId, kbId, url, noteId, API-Version)

Delete a Note

    Delete a note associated with a document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **noteId** | **Integer**| the id of the note to delete | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteSourceFolder"></a>
# **deleteSourceFolder**
> CMDocumentFolder deleteSourceFolder(session-id, organisationId, kbId, sourceId, API-Version)

Remove source-folder

    Remove an existing top-level folder (source folder) from the SimSage DMS.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **sourceId** | **Integer**| the sourceId of the source-folder to remove | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteSubscription"></a>
# **deleteSubscription**
> CMSubscriptions deleteSubscription(session-id, organisationId, kbId, userId, url, API-Version)

Delete a Subscription

    Delete a user&#39;s subscription associated with a document, returns an updated subscription set.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSubscriptions**](../Models/CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteUserSearch"></a>
# **deleteUserSearch**
> List deleteUserSearch(session-id, organisationId, kbId, userId, text, top, API-Version)

Delete a Saved Search

    Delete a user&#39;s saved search

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **text** | **String**| the base64 encoded search-text value | [default to null] |
| **top** | **Integer**| how many records to return | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="document1"></a>
# **document1**
> CMDocument document1(session-id, organisationId, kbId, urlId)

Get Document

    Return a document&#39;s details by url-id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **urlId** | **Integer**| the document&#39;s url-id, a unique id identifying a document. | [default to null] |

### Return type

[**CMDocument**](../Models/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="documentBinary"></a>
# **documentBinary**
> byte[] documentBinary(session-id, organisationId, kbId, url)

Binary

    Get the original for a document if available by url (latest version)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| a base64 encoded url | [default to null] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

<a name="documentVersion"></a>
# **documentVersion**
> byte[] documentVersion(session-id, organisationId, kbId, url, version)

Get Binary Document

    Return a document&#39;s binary by url and version

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | [default to null] |
| **version** | **Integer**| the document&#39;s binary version. | [default to null] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

<a name="filterFolders"></a>
# **filterFolders**
> CMDocumentFolder filterFolders(session-id, organisationId, kbId, text, API-Version)

Filter Folders

    Filter a set of folders using Search

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **text** | **String**| the text to use to filter (base64 encoded) | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="forceReleaseLock"></a>
# **forceReleaseLock**
> JsonMessage forceReleaseLock(session-id, organisationId, kbId, userId, url, API-Version)

Force-release a lock

    A system administrator or manager can force-unlock a document.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getBookmarkList"></a>
# **getBookmarkList**
> List getBookmarkList(organisationId, kbId, userId, session-id, API-Version)

Get Bookmarks

    Return a list of bookmarks for a given user

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDeletedDocuments"></a>
# **getDeletedDocuments**
> List getDeletedDocuments(session-id, organisationId, kbId, filter, API-Version)

Deleted records with optional filter

    Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **filter** | **String**| an optional text filter for URLs | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDocumentAudit"></a>
# **getDocumentAudit**
> List getDocumentAudit(session-id, organisationId, kbId, year, month, url, API-Version)

Audit records for a document for a month

    Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **year** | **Integer**| the year for the notifications | [default to null] |
| **month** | **Integer**| the month for the notifications | [default to null] |
| **url** | **String**| the document url (base64 encoded) to get audit records for | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getFolder"></a>
# **getFolder**
> CMDocumentFolder getFolder(session-id, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, API-Version)

Get Folder Content

    Return a folder&#39;s content

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **sourceId** | **Integer**| the owner source&#39;s id | [default to null] |
| **folderId** | **String**| the folder&#39;s id | [default to null] |
| **prevUrl** | **String**| pagination, the previous last URL for the page-set (&#39;null&#39; is first page) | [default to null] |
| **pageSize** | **Integer**| page-size for a paginated set | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getFullAudit"></a>
# **getFullAudit**
> List getFullAudit(session-id, organisationId, kbId, year, month, API-Version)

Audit records for a month

    Return document audit records for a user (filtered) or administrator (all records) for a given month

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **year** | **Integer**| the year for the notifications | [default to null] |
| **month** | **Integer**| the month for the notifications | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getLockedList"></a>
# **getLockedList**
> List getLockedList(organisationId, kbId, userId, session-id, API-Version)

Get locked documents for user

    Return a list of locked documents for a given user

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getNoteList"></a>
# **getNoteList**
> List getNoteList(session-id, organisationId, kbId, url, API-Version)

Get Notes

    Return a list of notes for a given url

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSavedSearches"></a>
# **getSavedSearches**
> List getSavedSearches(session-id, organisationId, kbId, userId, top, API-Version)

User&#39;s saved searches

    Return a user&#39;s saved searches

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **top** | **Integer**| how many records to return | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSourceFolder"></a>
# **getSourceFolder**
> CMDocumentFolder getSourceFolder(organisationId, kbId, sourceId, session-id, API-Version)

Get source-folder

    Return the content of a top-level folder (source folder).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **sourceId** | **Integer**| the source-id of the item being deleted | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSubscriptionList"></a>
# **getSubscriptionList**
> CMSubscriptions getSubscriptionList(organisationId, kbId, userId, session-id, API-Version)

Get Subscriptions

    Return a subscriptions object for a given user

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSubscriptions**](../Models/CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUserDashboard"></a>
# **getUserDashboard**
> CMDUserDashboard getUserDashboard(organisationId, kbId, session-id, API-Version)

User Dashboard

    Return a the user&#39;s DMS dashboard

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMDUserDashboard**](../Models/CMDUserDashboard.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUserNotifications"></a>
# **getUserNotifications**
> List getUserNotifications(session-id, organisationId, kbId, year, month, API-Version)

Get User Notifications

    Return all user notifications from the DMS for a given user by id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **year** | **Integer**| the year for the notifications | [default to null] |
| **month** | **Integer**| the month for the notifications | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="lockDocument"></a>
# **lockDocument**
> List lockDocument(session-id, CMDocumentLock, API-Version)

Document Lock

    Lock a document for a user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentLock** | [**CMDocumentLock**](../Models/CMDocumentLock.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="releaseLock"></a>
# **releaseLock**
> List releaseLock(session-id, organisationId, kbId, userId, url, API-Version)

Release a lock

    The originator of a lock releases a locked document.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **userId** | **String**| the user&#39;s id | [default to null] |
| **url** | **String**| the base64 encoded url value | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="restfulDMSClientQuery"></a>
# **restfulDMSClientQuery**
> CMClientQueryResult restfulDMSClientQuery(session-id, CMClientQuery)

DMS Client Query

    a SimSage DMS client asks a question or performs a keyword-search.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMClientQuery** | [**CMClientQuery**](../Models/CMClientQuery.md)|  | |

### Return type

[**CMClientQueryResult**](../Models/CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveBookmark"></a>
# **saveBookmark**
> List saveBookmark(session-id, CMDocumentBookmark, API-Version)

Save Bookmark

    Save (create or update) a SimSage Document Bookmark.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentBookmark** | [**CMDocumentBookmark**](../Models/CMDocumentBookmark.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/DocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveHashTags"></a>
# **saveHashTags**
> JsonMessage saveHashTags(session-id, CMDocumentHashTag, API-Version)

Save HashTag set for a document

    Save (create / update / delete) a hashTag set for a document.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentHashTag** | [**CMDocumentHashTag**](../Models/CMDocumentHashTag.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveNote"></a>
# **saveNote**
> List saveNote(session-id, CMDocumentNote, API-Version)

Save Note

    Save (create or update) a SimSage Document Note.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentNote** | [**CMDocumentNote**](../Models/CMDocumentNote.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveSearch"></a>
# **saveSearch**
> List saveSearch(session-id, CMSavedSearch, API-Version)

Save Search

    Save a user&#39;s search query.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSavedSearch** | [**CMSavedSearch**](../Models/CMSavedSearch.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveSubscription"></a>
# **saveSubscription**
> CMSubscriptions saveSubscription(session-id, CMDocumentSubscription, API-Version)

Save Subscription

    Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentSubscription** | [**CMDocumentSubscription**](../Models/CMDocumentSubscription.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSubscriptions**](../Models/CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="undeleteDocument"></a>
# **undeleteDocument**
> List undeleteDocument(session-id, organisationId, kbId, sourceId, url, filter, API-Version)

un-delete a record

    Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **sourceId** | **Integer**| the item&#39;s source id | [default to null] |
| **url** | **String**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | [default to null] |
| **filter** | **String**| an optional text filter for URLs | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateACLs"></a>
# **updateACLs**
> JsonMessage updateACLs(session-id, CMUpdateACLs, API-Version)

Update an item&#39;s ACLs

    Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMUpdateACLs** | [**CMUpdateACLs**](../Models/CMUpdateACLs.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="uploadDocument"></a>
# **uploadDocument**
> CMDocumentFolder uploadDocument(session-id, organisationId, kbId, sourceId, folderId, lastModified, file)

Upload a Document

    Upload a document into a DMS folder

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **sourceId** | **Integer**| the owner source&#39;s id | [default to null] |
| **folderId** | **String**| the id of the folder we&#39;re uploading into | [default to null] |
| **lastModified** | **String**| lastModified unix-date-time | [default to null] |
| **file** | **File**| the file to upload | [default to null] |

### Return type

[**CMDocumentFolder**](../Models/CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

