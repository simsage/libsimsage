# openapi_client.DmsApi

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
[**get_saved_searches**](DmsApi.md#get_saved_searches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches
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
[**update_acls**](DmsApi.md#update_acls) | **POST** /api/dms/acls | Update an item&#39;s ACLs
[**upload_document**](DmsApi.md#upload_document) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document


# **add_folder**
> CMDocumentFolder add_folder(session_id, cm_add_folder, api_version=api_version)

Add a new folder

Add a new folder to the SimSage DMS.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_add_folder import CMAddFolder
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_add_folder = openapi_client.CMAddFolder() # CMAddFolder | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Add a new folder
        api_response = api_instance.add_folder(session_id, cm_add_folder, api_version=api_version)
        print("The response of DmsApi->add_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->add_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_add_folder** | [**CMAddFolder**](CMAddFolder.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_source_folder**
> CMDocumentFolder add_source_folder(session_id, cm_add_source_folder, api_version=api_version)

Add a new source-folder

Add a new top-level folder (source folder) to the SimSage DMS.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_add_source_folder import CMAddSourceFolder
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_add_source_folder = openapi_client.CMAddSourceFolder() # CMAddSourceFolder | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Add a new source-folder
        api_response = api_instance.add_source_folder(session_id, cm_add_source_folder, api_version=api_version)
        print("The response of DmsApi->add_source_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->add_source_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_add_source_folder** | [**CMAddSourceFolder**](CMAddSourceFolder.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_all_notes**
> JsonMessage delete_all_notes(session_id, organisation_id, kb_id, url, api_version=api_version)

delete all Notes

delete all notes associated with a document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the base64 encoded url value
    api_version = 'api_version_example' # str |  (optional)

    try:
        # delete all Notes
        api_response = api_instance.delete_all_notes(session_id, organisation_id, kb_id, url, api_version=api_version)
        print("The response of DmsApi->delete_all_notes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_all_notes: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the base64 encoded url value | 
 **api_version** | **str**|  | [optional] 

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bookmark**
> List[CMDocumentBookmark] delete_bookmark(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)

Delete a Bookmark

Delete a user's bookmark associated with a document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_bookmark import CMDocumentBookmark
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    url = 'url_example' # str | the base64 encoded url value
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete a Bookmark
        api_response = api_instance.delete_bookmark(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)
        print("The response of DmsApi->delete_bookmark:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_bookmark: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **url** | **str**| the base64 encoded url value | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentBookmark]**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_document_or_folder**
> CMDocumentFolder delete_document_or_folder(session_id, organisation_id, kb_id, is_folder, source_id, url, folder_id, api_version=api_version)

Delete a document or a folder

Mark a document/folder as deleted in the SimSage DMS.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    is_folder = True # bool | is this a folder or a document?
    source_id = 56 # int | the source-id of the item being deleted
    url = 'url_example' # str | the base64 encoded url value
    folder_id = 'folder_id_example' # str | the folder's id
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete a document or a folder
        api_response = api_instance.delete_document_or_folder(session_id, organisation_id, kb_id, is_folder, source_id, url, folder_id, api_version=api_version)
        print("The response of DmsApi->delete_document_or_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_document_or_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **is_folder** | **bool**| is this a folder or a document? | 
 **source_id** | **int**| the source-id of the item being deleted | 
 **url** | **str**| the base64 encoded url value | 
 **folder_id** | **str**| the folder&#39;s id | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_note**
> List[CMDocumentNote] delete_note(session_id, organisation_id, kb_id, url, note_id, api_version=api_version)

Delete a Note

Delete a note associated with a document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_note import CMDocumentNote
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the base64 encoded url value
    note_id = 56 # int | the id of the note to delete
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete a Note
        api_response = api_instance.delete_note(session_id, organisation_id, kb_id, url, note_id, api_version=api_version)
        print("The response of DmsApi->delete_note:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_note: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the base64 encoded url value | 
 **note_id** | **int**| the id of the note to delete | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentNote]**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_source_folder**
> CMDocumentFolder delete_source_folder(session_id, organisation_id, kb_id, source_id, api_version=api_version)

Remove source-folder

Remove an existing top-level folder (source folder) from the SimSage DMS.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    source_id = 56 # int | the sourceId of the source-folder to remove
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Remove source-folder
        api_response = api_instance.delete_source_folder(session_id, organisation_id, kb_id, source_id, api_version=api_version)
        print("The response of DmsApi->delete_source_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_source_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **source_id** | **int**| the sourceId of the source-folder to remove | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_subscription**
> CMSubscriptions delete_subscription(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)

Delete a Subscription

Delete a user's subscription associated with a document, returns an updated subscription set.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_subscriptions import CMSubscriptions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    url = 'url_example' # str | the base64 encoded url value
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete a Subscription
        api_response = api_instance.delete_subscription(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)
        print("The response of DmsApi->delete_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_subscription: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **url** | **str**| the base64 encoded url value | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_user_search**
> List[CMSavedSearch] delete_user_search(session_id, organisation_id, kb_id, user_id, text, top, api_version=api_version)

Delete a Saved Search

Delete a user's saved search

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_saved_search import CMSavedSearch
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    text = 'text_example' # str | the base64 encoded search-text value
    top = 56 # int | how many records to return
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete a Saved Search
        api_response = api_instance.delete_user_search(session_id, organisation_id, kb_id, user_id, text, top, api_version=api_version)
        print("The response of DmsApi->delete_user_search:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->delete_user_search: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **text** | **str**| the base64 encoded search-text value | 
 **top** | **int**| how many records to return | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMSavedSearch]**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **document1**
> CMDocument document1(session_id, organisation_id, kb_id, url_id)

Get Document

Return a document's details by url-id

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document import CMDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url_id = 56 # int | the document's url-id, a unique id identifying a document.

    try:
        # Get Document
        api_response = api_instance.document1(session_id, organisation_id, kb_id, url_id)
        print("The response of DmsApi->document1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->document1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url_id** | **int**| the document&#39;s url-id, a unique id identifying a document. | 

### Return type

[**CMDocument**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **document_binary**
> bytearray document_binary(session_id, organisation_id, kb_id, url)

Binary

Get the original for a document if available by url (latest version)

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | a base64 encoded url

    try:
        # Binary
        api_response = api_instance.document_binary(session_id, organisation_id, kb_id, url)
        print("The response of DmsApi->document_binary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->document_binary: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| a base64 encoded url | 

### Return type

**bytearray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | document binary response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **document_version**
> bytearray document_version(session_id, organisation_id, kb_id, url, version)

Get Binary Document

Return a document's binary by url and version

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the document's url, base64 encoded.  A unique id identifying a document.
    version = 56 # int | the document's binary version.

    try:
        # Get Binary Document
        api_response = api_instance.document_version(session_id, organisation_id, kb_id, url, version)
        print("The response of DmsApi->document_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->document_version: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | 
 **version** | **int**| the document&#39;s binary version. | 

### Return type

**bytearray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | document binary response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **filter_folders**
> CMDocumentFolder filter_folders(session_id, organisation_id, kb_id, text, api_version=api_version)

Filter Folders

Filter a set of folders using Search

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    text = 'text_example' # str | the text to use to filter (base64 encoded)
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Filter Folders
        api_response = api_instance.filter_folders(session_id, organisation_id, kb_id, text, api_version=api_version)
        print("The response of DmsApi->filter_folders:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->filter_folders: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **text** | **str**| the text to use to filter (base64 encoded) | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **force_release_lock**
> JsonMessage force_release_lock(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)

Force-release a lock

A system administrator or manager can force-unlock a document.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    url = 'url_example' # str | the base64 encoded url value
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Force-release a lock
        api_response = api_instance.force_release_lock(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)
        print("The response of DmsApi->force_release_lock:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->force_release_lock: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **url** | **str**| the base64 encoded url value | 
 **api_version** | **str**|  | [optional] 

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bookmark_list**
> List[CMDocumentBookmark] get_bookmark_list(organisation_id, kb_id, user_id, session_id, api_version=api_version)

Get Bookmarks

Return a list of bookmarks for a given user

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_bookmark import CMDocumentBookmark
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get Bookmarks
        api_response = api_instance.get_bookmark_list(organisation_id, kb_id, user_id, session_id, api_version=api_version)
        print("The response of DmsApi->get_bookmark_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_bookmark_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentBookmark]**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_deleted_documents**
> List[DocumentDeleted] get_deleted_documents(session_id, organisation_id, kb_id, filter, api_version=api_version)

Deleted records with optional filter

Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.document_deleted import DocumentDeleted
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    filter = 'filter_example' # str | an optional text filter for URLs
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Deleted records with optional filter
        api_response = api_instance.get_deleted_documents(session_id, organisation_id, kb_id, filter, api_version=api_version)
        print("The response of DmsApi->get_deleted_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_deleted_documents: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **filter** | **str**| an optional text filter for URLs | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[DocumentDeleted]**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_audit**
> List[CMDocumentAudit] get_document_audit(session_id, organisation_id, kb_id, year, month, url, api_version=api_version)

Audit records for a document for a month

Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_audit import CMDocumentAudit
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    year = 56 # int | the year for the notifications
    month = 56 # int | the month for the notifications
    url = 'url_example' # str | the document url (base64 encoded) to get audit records for
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Audit records for a document for a month
        api_response = api_instance.get_document_audit(session_id, organisation_id, kb_id, year, month, url, api_version=api_version)
        print("The response of DmsApi->get_document_audit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_document_audit: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **year** | **int**| the year for the notifications | 
 **month** | **int**| the month for the notifications | 
 **url** | **str**| the document url (base64 encoded) to get audit records for | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentAudit]**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_folder**
> CMDocumentFolder get_folder(session_id, organisation_id, kb_id, source_id, folder_id, prev_url, page_size, api_version=api_version)

Get Folder Content

Return a folder's content

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    source_id = 56 # int | the owner source's id
    folder_id = 'folder_id_example' # str | the folder's id
    prev_url = 'prev_url_example' # str | pagination, the previous last URL for the page-set ('null' is first page)
    page_size = 56 # int | page-size for a paginated set
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get Folder Content
        api_response = api_instance.get_folder(session_id, organisation_id, kb_id, source_id, folder_id, prev_url, page_size, api_version=api_version)
        print("The response of DmsApi->get_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **source_id** | **int**| the owner source&#39;s id | 
 **folder_id** | **str**| the folder&#39;s id | 
 **prev_url** | **str**| pagination, the previous last URL for the page-set (&#39;null&#39; is first page) | 
 **page_size** | **int**| page-size for a paginated set | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_full_audit**
> List[CMDocumentAudit] get_full_audit(session_id, organisation_id, kb_id, year, month, api_version=api_version)

Audit records for a month

Return document audit records for a user (filtered) or administrator (all records) for a given month

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_audit import CMDocumentAudit
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    year = 56 # int | the year for the notifications
    month = 56 # int | the month for the notifications
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Audit records for a month
        api_response = api_instance.get_full_audit(session_id, organisation_id, kb_id, year, month, api_version=api_version)
        print("The response of DmsApi->get_full_audit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_full_audit: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **year** | **int**| the year for the notifications | 
 **month** | **int**| the month for the notifications | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentAudit]**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_locked_list**
> List[CMDocument] get_locked_list(organisation_id, kb_id, user_id, session_id, api_version=api_version)

Get locked documents for user

Return a list of locked documents for a given user

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document import CMDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get locked documents for user
        api_response = api_instance.get_locked_list(organisation_id, kb_id, user_id, session_id, api_version=api_version)
        print("The response of DmsApi->get_locked_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_locked_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocument]**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_note_list**
> List[CMDocumentNote] get_note_list(session_id, organisation_id, kb_id, url, api_version=api_version)

Get Notes

Return a list of notes for a given url

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_note import CMDocumentNote
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the base64 encoded url value
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get Notes
        api_response = api_instance.get_note_list(session_id, organisation_id, kb_id, url, api_version=api_version)
        print("The response of DmsApi->get_note_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_note_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the base64 encoded url value | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentNote]**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_saved_searches**
> List[CMSavedSearch] get_saved_searches(session_id, organisation_id, kb_id, user_id, top, api_version=api_version)

User's saved searches

Return a user's saved searches

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_saved_search import CMSavedSearch
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    top = 56 # int | how many records to return
    api_version = 'api_version_example' # str |  (optional)

    try:
        # User's saved searches
        api_response = api_instance.get_saved_searches(session_id, organisation_id, kb_id, user_id, top, api_version=api_version)
        print("The response of DmsApi->get_saved_searches:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_saved_searches: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **top** | **int**| how many records to return | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMSavedSearch]**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_source_folder**
> CMDocumentFolder get_source_folder(organisation_id, kb_id, source_id, session_id, api_version=api_version)

Get source-folder

Return the content of a top-level folder (source folder).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    source_id = 56 # int | the source-id of the item being deleted
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get source-folder
        api_response = api_instance.get_source_folder(organisation_id, kb_id, source_id, session_id, api_version=api_version)
        print("The response of DmsApi->get_source_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_source_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **source_id** | **int**| the source-id of the item being deleted | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subscription_list**
> CMSubscriptions get_subscription_list(organisation_id, kb_id, user_id, session_id, api_version=api_version)

Get Subscriptions

Return a subscriptions object for a given user

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_subscriptions import CMSubscriptions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get Subscriptions
        api_response = api_instance.get_subscription_list(organisation_id, kb_id, user_id, session_id, api_version=api_version)
        print("The response of DmsApi->get_subscription_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_subscription_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_dashboard**
> CMDUserDashboard get_user_dashboard(organisation_id, kb_id, session_id, api_version=api_version)

User Dashboard

Return a the user's DMS dashboard

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cmd_user_dashboard import CMDUserDashboard
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # User Dashboard
        api_response = api_instance.get_user_dashboard(organisation_id, kb_id, session_id, api_version=api_version)
        print("The response of DmsApi->get_user_dashboard:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_user_dashboard: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMDUserDashboard**](CMDUserDashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_notifications**
> List[CMUserNotification] get_user_notifications(session_id, organisation_id, kb_id, year, month, api_version=api_version)

Get User Notifications

Return all user notifications from the DMS for a given user by id.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_user_notification import CMUserNotification
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    year = 56 # int | the year for the notifications
    month = 56 # int | the month for the notifications
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get User Notifications
        api_response = api_instance.get_user_notifications(session_id, organisation_id, kb_id, year, month, api_version=api_version)
        print("The response of DmsApi->get_user_notifications:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->get_user_notifications: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **year** | **int**| the year for the notifications | 
 **month** | **int**| the month for the notifications | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMUserNotification]**](CMUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lock_document**
> List[CMDocument] lock_document(session_id, cm_document_lock, api_version=api_version)

Document Lock

Lock a document for a user.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document import CMDocument
from openapi_client.models.cm_document_lock import CMDocumentLock
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_document_lock = openapi_client.CMDocumentLock() # CMDocumentLock | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Document Lock
        api_response = api_instance.lock_document(session_id, cm_document_lock, api_version=api_version)
        print("The response of DmsApi->lock_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->lock_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_document_lock** | [**CMDocumentLock**](CMDocumentLock.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocument]**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **release_lock**
> List[CMDocument] release_lock(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)

Release a lock

The originator of a lock releases a locked document.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document import CMDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    user_id = 'user_id_example' # str | the user's id
    url = 'url_example' # str | the base64 encoded url value
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Release a lock
        api_response = api_instance.release_lock(session_id, organisation_id, kb_id, user_id, url, api_version=api_version)
        print("The response of DmsApi->release_lock:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->release_lock: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **user_id** | **str**| the user&#39;s id | 
 **url** | **str**| the base64 encoded url value | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocument]**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **restful_dms_client_query**
> CMClientQueryResult restful_dms_client_query(session_id, cm_client_query)

DMS Client Query

a SimSage DMS client asks a question or performs a keyword-search.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_client_query import CMClientQuery
from openapi_client.models.cm_client_query_result import CMClientQueryResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_client_query = openapi_client.CMClientQuery() # CMClientQuery | 

    try:
        # DMS Client Query
        api_response = api_instance.restful_dms_client_query(session_id, cm_client_query)
        print("The response of DmsApi->restful_dms_client_query:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->restful_dms_client_query: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_client_query** | [**CMClientQuery**](CMClientQuery.md)|  | 

### Return type

[**CMClientQueryResult**](CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_bookmark**
> List[DocumentBookmark] save_bookmark(session_id, cm_document_bookmark, api_version=api_version)

Save Bookmark

Save (create or update) a SimSage Document Bookmark.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_bookmark import CMDocumentBookmark
from openapi_client.models.document_bookmark import DocumentBookmark
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_document_bookmark = openapi_client.CMDocumentBookmark() # CMDocumentBookmark | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Bookmark
        api_response = api_instance.save_bookmark(session_id, cm_document_bookmark, api_version=api_version)
        print("The response of DmsApi->save_bookmark:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->save_bookmark: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_document_bookmark** | [**CMDocumentBookmark**](CMDocumentBookmark.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[DocumentBookmark]**](DocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_hash_tags**
> JsonMessage save_hash_tags(session_id, cm_document_hash_tag, api_version=api_version)

Save HashTag set for a document

Save (create / update / delete) a hashTag set for a document.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_hash_tag import CMDocumentHashTag
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_document_hash_tag = openapi_client.CMDocumentHashTag() # CMDocumentHashTag | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save HashTag set for a document
        api_response = api_instance.save_hash_tags(session_id, cm_document_hash_tag, api_version=api_version)
        print("The response of DmsApi->save_hash_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->save_hash_tags: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_document_hash_tag** | [**CMDocumentHashTag**](CMDocumentHashTag.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_note**
> List[CMDocumentNote] save_note(session_id, cm_document_note, api_version=api_version)

Save Note

Save (create or update) a SimSage Document Note.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_note import CMDocumentNote
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_document_note = openapi_client.CMDocumentNote() # CMDocumentNote | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Note
        api_response = api_instance.save_note(session_id, cm_document_note, api_version=api_version)
        print("The response of DmsApi->save_note:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->save_note: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_document_note** | [**CMDocumentNote**](CMDocumentNote.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMDocumentNote]**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_search**
> List[CMSavedSearch] save_search(session_id, cm_saved_search, api_version=api_version)

Save Search

Save a user's search query.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_saved_search import CMSavedSearch
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_saved_search = openapi_client.CMSavedSearch() # CMSavedSearch | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Search
        api_response = api_instance.save_search(session_id, cm_saved_search, api_version=api_version)
        print("The response of DmsApi->save_search:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->save_search: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_saved_search** | [**CMSavedSearch**](CMSavedSearch.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMSavedSearch]**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_subscription**
> CMSubscriptions save_subscription(session_id, cm_document_subscription, api_version=api_version)

Save Subscription

Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_subscription import CMDocumentSubscription
from openapi_client.models.cm_subscriptions import CMSubscriptions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_document_subscription = openapi_client.CMDocumentSubscription() # CMDocumentSubscription | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Subscription
        api_response = api_instance.save_subscription(session_id, cm_document_subscription, api_version=api_version)
        print("The response of DmsApi->save_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->save_subscription: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_document_subscription** | [**CMDocumentSubscription**](CMDocumentSubscription.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSubscriptions**](CMSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **undelete_document**
> List[DocumentDeleted] undelete_document(session_id, organisation_id, kb_id, source_id, url, filter, api_version=api_version)

un-delete a record

Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.document_deleted import DocumentDeleted
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    source_id = 56 # int | the item's source id
    url = 'url_example' # str | the document's url, base64 encoded.  A unique id identifying a document.
    filter = 'filter_example' # str | an optional text filter for URLs
    api_version = 'api_version_example' # str |  (optional)

    try:
        # un-delete a record
        api_response = api_instance.undelete_document(session_id, organisation_id, kb_id, source_id, url, filter, api_version=api_version)
        print("The response of DmsApi->undelete_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->undelete_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **source_id** | **int**| the item&#39;s source id | 
 **url** | **str**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | 
 **filter** | **str**| an optional text filter for URLs | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[DocumentDeleted]**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_acls**
> JsonMessage update_acls(session_id, cm_update_acls, api_version=api_version)

Update an item's ACLs

Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_update_acls import CMUpdateACLs
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_update_acls = openapi_client.CMUpdateACLs() # CMUpdateACLs | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Update an item's ACLs
        api_response = api_instance.update_acls(session_id, cm_update_acls, api_version=api_version)
        print("The response of DmsApi->update_acls:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->update_acls: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_update_acls** | [**CMUpdateACLs**](CMUpdateACLs.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_document**
> CMDocumentFolder upload_document(session_id, organisation_id, kb_id, source_id, folder_id, last_modified, file)

Upload a Document

Upload a document into a DMS folder

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://demo.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://demo.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DmsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    source_id = 56 # int | the owner source's id
    folder_id = 'folder_id_example' # str | the id of the folder we're uploading into
    last_modified = 'last_modified_example' # str | lastModified unix-date-time
    file = None # bytearray | the file to upload

    try:
        # Upload a Document
        api_response = api_instance.upload_document(session_id, organisation_id, kb_id, source_id, folder_id, last_modified, file)
        print("The response of DmsApi->upload_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DmsApi->upload_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **source_id** | **int**| the owner source&#39;s id | 
 **folder_id** | **str**| the id of the folder we&#39;re uploading into | 
 **last_modified** | **str**| lastModified unix-date-time | 
 **file** | **bytearray**| the file to upload | 

### Return type

[**CMDocumentFolder**](CMDocumentFolder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

