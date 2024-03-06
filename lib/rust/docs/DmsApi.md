# \DmsApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_folder**](DmsApi.md#add_folder) | **POST** /api/dms/folder | Add a new folder
[**add_source_folder**](DmsApi.md#add_source_folder) | **POST** /api/dms/source | Add a new source-folder
[**delete_all_notes**](DmsApi.md#delete_all_notes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes
[**delete_bookmark**](DmsApi.md#delete_bookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark
[**delete_document_or_folder**](DmsApi.md#delete_document_or_folder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder
[**delete_note**](DmsApi.md#delete_note) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note
[**delete_source_folder**](DmsApi.md#delete_source_folder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder
[**delete_subscription**](DmsApi.md#delete_subscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription
[**delete_user_search**](DmsApi.md#delete_user_search) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search
[**document1**](DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document
[**document_binary**](DmsApi.md#document_binary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary
[**document_version**](DmsApi.md#document_version) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document
[**filter_folders**](DmsApi.md#filter_folders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders
[**force_release_lock**](DmsApi.md#force_release_lock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock
[**get_bookmark_list**](DmsApi.md#get_bookmark_list) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks
[**get_deleted_documents**](DmsApi.md#get_deleted_documents) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter
[**get_document_audit**](DmsApi.md#get_document_audit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month
[**get_folder**](DmsApi.md#get_folder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content
[**get_full_audit**](DmsApi.md#get_full_audit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month
[**get_locked_list**](DmsApi.md#get_locked_list) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user
[**get_note_list**](DmsApi.md#get_note_list) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes
[**get_saved_searches**](DmsApi.md#get_saved_searches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User's saved searches
[**get_source_folder**](DmsApi.md#get_source_folder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder
[**get_subscription_list**](DmsApi.md#get_subscription_list) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions
[**get_user_dashboard**](DmsApi.md#get_user_dashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard
[**get_user_notifications**](DmsApi.md#get_user_notifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications
[**lock_document**](DmsApi.md#lock_document) | **POST** /api/dms/lock | Document Lock
[**release_lock**](DmsApi.md#release_lock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock
[**restful_dms_client_query**](DmsApi.md#restful_dms_client_query) | **POST** /api/dms/query | DMS Client Query
[**save_bookmark**](DmsApi.md#save_bookmark) | **POST** /api/dms/bookmark | Save Bookmark
[**save_hash_tags**](DmsApi.md#save_hash_tags) | **POST** /api/dms/hash-tag | Save HashTag set for a document
[**save_note**](DmsApi.md#save_note) | **POST** /api/dms/note | Save Note
[**save_search**](DmsApi.md#save_search) | **POST** /api/dms/save-search | Save Search
[**save_subscription**](DmsApi.md#save_subscription) | **POST** /api/dms/subscription | Save Subscription
[**undelete_document**](DmsApi.md#undelete_document) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record
[**update_acls**](DmsApi.md#update_acls) | **POST** /api/dms/acls | Update an item's ACLs
[**upload_document**](DmsApi.md#upload_document) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document



## add_folder

> crate::models::CmDocumentFolder add_folder(session_id, cm_add_folder, api_version)
Add a new folder

Add a new folder to the SimSage DMS.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_add_folder** | [**CmAddFolder**](CmAddFolder.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## add_source_folder

> crate::models::CmDocumentFolder add_source_folder(session_id, cm_add_source_folder, api_version)
Add a new source-folder

Add a new top-level folder (source folder) to the SimSage DMS.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_add_source_folder** | [**CmAddSourceFolder**](CmAddSourceFolder.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_all_notes

> crate::models::JsonMessage delete_all_notes(session_id, organisation_id, kb_id, url, api_version)
delete all Notes

delete all notes associated with a document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_bookmark

> Vec<crate::models::CmDocumentBookmark> delete_bookmark(session_id, organisation_id, kb_id, user_id, url, api_version)
Delete a Bookmark

Delete a user's bookmark associated with a document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentBookmark>**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_document_or_folder

> crate::models::CmDocumentFolder delete_document_or_folder(session_id, organisation_id, kb_id, is_folder, source_id, url, folder_id, api_version)
Delete a document or a folder

Mark a document/folder as deleted in the SimSage DMS.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**is_folder** | **bool** | is this a folder or a document? | [required] |
**source_id** | **i32** | the source-id of the item being deleted | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**folder_id** | **String** | the folder's id | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_note

> Vec<crate::models::CmDocumentNote> delete_note(session_id, organisation_id, kb_id, url, note_id, api_version)
Delete a Note

Delete a note associated with a document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**note_id** | **i32** | the id of the note to delete | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentNote>**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_source_folder

> crate::models::CmDocumentFolder delete_source_folder(session_id, organisation_id, kb_id, source_id, api_version)
Remove source-folder

Remove an existing top-level folder (source folder) from the SimSage DMS.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**source_id** | **i32** | the sourceId of the source-folder to remove | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_subscription

> crate::models::CmSubscriptions delete_subscription(session_id, organisation_id, kb_id, user_id, url, api_version)
Delete a Subscription

Delete a user's subscription associated with a document, returns an updated subscription set.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_user_search

> Vec<crate::models::CmSavedSearch> delete_user_search(session_id, organisation_id, kb_id, user_id, text, top, api_version)
Delete a Saved Search

Delete a user's saved search

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**text** | **String** | the base64 encoded search-text value | [required] |
**top** | **i32** | how many records to return | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmSavedSearch>**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## document1

> crate::models::CmDocument document1(session_id, organisation_id, kb_id, url_id)
Get Document

Return a document's details by url-id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url_id** | **i32** | the document's url-id, a unique id identifying a document. | [required] |

### Return type

[**crate::models::CmDocument**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## document_binary

> String document_binary(session_id, organisation_id, kb_id, url)
Binary

Get the original for a document if available by url (latest version)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | a base64 encoded url | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## document_version

> String document_version(session_id, organisation_id, kb_id, url, version)
Get Binary Document

Return a document's binary by url and version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the document's url, base64 encoded.  A unique id identifying a document. | [required] |
**version** | **i32** | the document's binary version. | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## filter_folders

> crate::models::CmDocumentFolder filter_folders(session_id, organisation_id, kb_id, text, api_version)
Filter Folders

Filter a set of folders using Search

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**text** | **String** | the text to use to filter (base64 encoded) | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## force_release_lock

> crate::models::JsonMessage force_release_lock(session_id, organisation_id, kb_id, user_id, url, api_version)
Force-release a lock

A system administrator or manager can force-unlock a document.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_bookmark_list

> Vec<crate::models::CmDocumentBookmark> get_bookmark_list(organisation_id, kb_id, user_id, session_id, api_version)
Get Bookmarks

Return a list of bookmarks for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentBookmark>**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_deleted_documents

> Vec<crate::models::DocumentDeleted> get_deleted_documents(session_id, organisation_id, kb_id, filter, api_version)
Deleted records with optional filter

Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**filter** | **String** | an optional text filter for URLs | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::DocumentDeleted>**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_document_audit

> Vec<crate::models::CmDocumentAudit> get_document_audit(session_id, organisation_id, kb_id, year, month, url, api_version)
Audit records for a document for a month

Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**year** | **i32** | the year for the notifications | [required] |
**month** | **i32** | the month for the notifications | [required] |
**url** | **String** | the document url (base64 encoded) to get audit records for | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentAudit>**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_folder

> crate::models::CmDocumentFolder get_folder(session_id, organisation_id, kb_id, source_id, folder_id, prev_url, page_size, api_version)
Get Folder Content

Return a folder's content

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**source_id** | **i32** | the owner source's id | [required] |
**folder_id** | **String** | the folder's id | [required] |
**prev_url** | **String** | pagination, the previous last URL for the page-set ('null' is first page) | [required] |
**page_size** | **i32** | page-size for a paginated set | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_full_audit

> Vec<crate::models::CmDocumentAudit> get_full_audit(session_id, organisation_id, kb_id, year, month, api_version)
Audit records for a month

Return document audit records for a user (filtered) or administrator (all records) for a given month

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**year** | **i32** | the year for the notifications | [required] |
**month** | **i32** | the month for the notifications | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentAudit>**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_locked_list

> Vec<crate::models::CmDocument> get_locked_list(organisation_id, kb_id, user_id, session_id, api_version)
Get locked documents for user

Return a list of locked documents for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocument>**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_note_list

> Vec<crate::models::CmDocumentNote> get_note_list(session_id, organisation_id, kb_id, url, api_version)
Get Notes

Return a list of notes for a given url

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentNote>**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_saved_searches

> Vec<crate::models::CmSavedSearch> get_saved_searches(session_id, organisation_id, kb_id, user_id, top, api_version)
User's saved searches

Return a user's saved searches

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**top** | **i32** | how many records to return | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmSavedSearch>**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_source_folder

> crate::models::CmDocumentFolder get_source_folder(organisation_id, kb_id, source_id, session_id, api_version)
Get source-folder

Return the content of a top-level folder (source folder).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**source_id** | **i32** | the source-id of the item being deleted | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_subscription_list

> crate::models::CmSubscriptions get_subscription_list(organisation_id, kb_id, user_id, session_id, api_version)
Get Subscriptions

Return a subscriptions object for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_user_dashboard

> crate::models::CmdUserDashboard get_user_dashboard(organisation_id, kb_id, session_id, api_version)
User Dashboard

Return a the user's DMS dashboard

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmdUserDashboard**](CMDUserDashboard.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_user_notifications

> Vec<crate::models::CmUserNotification> get_user_notifications(session_id, organisation_id, kb_id, year, month, api_version)
Get User Notifications

Return all user notifications from the DMS for a given user by id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**year** | **i32** | the year for the notifications | [required] |
**month** | **i32** | the month for the notifications | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmUserNotification>**](CMUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## lock_document

> Vec<crate::models::CmDocument> lock_document(session_id, cm_document_lock, api_version)
Document Lock

Lock a document for a user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_document_lock** | [**CmDocumentLock**](CmDocumentLock.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocument>**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## release_lock

> Vec<crate::models::CmDocument> release_lock(session_id, organisation_id, kb_id, user_id, url, api_version)
Release a lock

The originator of a lock releases a locked document.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**user_id** | **String** | the user's id | [required] |
**url** | **String** | the base64 encoded url value | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocument>**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## restful_dms_client_query

> crate::models::CmClientQueryResult restful_dms_client_query(session_id, cm_client_query)
DMS Client Query

a SimSage DMS client asks a question or performs a keyword-search.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_client_query** | [**CmClientQuery**](CmClientQuery.md) |  | [required] |

### Return type

[**crate::models::CmClientQueryResult**](CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_bookmark

> Vec<crate::models::DocumentBookmark> save_bookmark(session_id, cm_document_bookmark, api_version)
Save Bookmark

Save (create or update) a SimSage Document Bookmark.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_document_bookmark** | [**CmDocumentBookmark**](CmDocumentBookmark.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::DocumentBookmark>**](DocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_hash_tags

> crate::models::JsonMessage save_hash_tags(session_id, cm_document_hash_tag, api_version)
Save HashTag set for a document

Save (create / update / delete) a hashTag set for a document.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_document_hash_tag** | [**CmDocumentHashTag**](CmDocumentHashTag.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_note

> Vec<crate::models::CmDocumentNote> save_note(session_id, cm_document_note, api_version)
Save Note

Save (create or update) a SimSage Document Note.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_document_note** | [**CmDocumentNote**](CmDocumentNote.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmDocumentNote>**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_search

> Vec<crate::models::CmSavedSearch> save_search(session_id, cm_saved_search, api_version)
Save Search

Save a user's search query.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_saved_search** | [**CmSavedSearch**](CmSavedSearch.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmSavedSearch>**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_subscription

> crate::models::CmSubscriptions save_subscription(session_id, cm_document_subscription, api_version)
Save Subscription

Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_document_subscription** | [**CmDocumentSubscription**](CmDocumentSubscription.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## undelete_document

> Vec<crate::models::DocumentDeleted> undelete_document(session_id, organisation_id, kb_id, source_id, url, filter, api_version)
un-delete a record

Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**source_id** | **i32** | the item's source id | [required] |
**url** | **String** | the document's url, base64 encoded.  A unique id identifying a document. | [required] |
**filter** | **String** | an optional text filter for URLs | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::DocumentDeleted>**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_acls

> crate::models::JsonMessage update_acls(session_id, cm_update_acls, api_version)
Update an item's ACLs

Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_update_acls** | [**CmUpdateAcls**](CmUpdateAcls.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## upload_document

> crate::models::CmDocumentFolder upload_document(session_id, organisation_id, kb_id, source_id, folder_id, last_modified, file)
Upload a Document

Upload a document into a DMS folder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**source_id** | **i32** | the owner source's id | [required] |
**folder_id** | **String** | the id of the folder we're uploading into | [required] |
**last_modified** | **String** | lastModified unix-date-time | [required] |
**file** | **std::path::PathBuf** | the file to upload | [required] |

### Return type

[**crate::models::CmDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

