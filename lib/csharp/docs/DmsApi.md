# Org.OpenAPITools.Api.DmsApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AddFolder**](DmsApi.md#addfolder) | **POST** /api/dms/folder | Add a new folder |
| [**AddSourceFolder**](DmsApi.md#addsourcefolder) | **POST** /api/dms/source | Add a new source-folder |
| [**DeleteAllNotes**](DmsApi.md#deleteallnotes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes |
| [**DeleteBookmark**](DmsApi.md#deletebookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark |
| [**DeleteDocumentOrFolder**](DmsApi.md#deletedocumentorfolder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder |
| [**DeleteNote**](DmsApi.md#deletenote) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note |
| [**DeleteSourceFolder**](DmsApi.md#deletesourcefolder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder |
| [**DeleteSubscription**](DmsApi.md#deletesubscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription |
| [**DeleteUserSearch**](DmsApi.md#deleteusersearch) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search |
| [**Document1**](DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document |
| [**DocumentBinary**](DmsApi.md#documentbinary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary |
| [**DocumentVersion**](DmsApi.md#documentversion) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document |
| [**FilterFolders**](DmsApi.md#filterfolders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders |
| [**ForceReleaseLock**](DmsApi.md#forcereleaselock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock |
| [**GetBookmarkList**](DmsApi.md#getbookmarklist) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks |
| [**GetDeletedDocuments**](DmsApi.md#getdeleteddocuments) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter |
| [**GetDocumentAudit**](DmsApi.md#getdocumentaudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month |
| [**GetFolder**](DmsApi.md#getfolder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content |
| [**GetFullAudit**](DmsApi.md#getfullaudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month |
| [**GetLockedList**](DmsApi.md#getlockedlist) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user |
| [**GetNoteList**](DmsApi.md#getnotelist) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes |
| [**GetSavedSearches**](DmsApi.md#getsavedsearches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches |
| [**GetSourceFolder**](DmsApi.md#getsourcefolder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder |
| [**GetSubscriptionList**](DmsApi.md#getsubscriptionlist) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions |
| [**GetUserDashboard**](DmsApi.md#getuserdashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard |
| [**GetUserNotifications**](DmsApi.md#getusernotifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications |
| [**LockDocument**](DmsApi.md#lockdocument) | **POST** /api/dms/lock | Document Lock |
| [**ReleaseLock**](DmsApi.md#releaselock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock |
| [**RestfulDMSClientQuery**](DmsApi.md#restfuldmsclientquery) | **POST** /api/dms/query | DMS Client Query |
| [**SaveBookmark**](DmsApi.md#savebookmark) | **POST** /api/dms/bookmark | Save Bookmark |
| [**SaveHashTags**](DmsApi.md#savehashtags) | **POST** /api/dms/hash-tag | Save HashTag set for a document |
| [**SaveNote**](DmsApi.md#savenote) | **POST** /api/dms/note | Save Note |
| [**SaveSearch**](DmsApi.md#savesearch) | **POST** /api/dms/save-search | Save Search |
| [**SaveSubscription**](DmsApi.md#savesubscription) | **POST** /api/dms/subscription | Save Subscription |
| [**UndeleteDocument**](DmsApi.md#undeletedocument) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record |
| [**UpdateACLs**](DmsApi.md#updateacls) | **POST** /api/dms/acls | Update an item&#39;s ACLs |
| [**UploadDocument**](DmsApi.md#uploaddocument) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document |

<a id="addfolder"></a>
# **AddFolder**
> CMDocumentFolder AddFolder (string sessionId, CMAddFolder cMAddFolder, string? aPIVersion = null)

Add a new folder

Add a new folder to the SimSage DMS.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMAddFolder = new CMAddFolder(); // CMAddFolder | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Add a new folder
                CMDocumentFolder result = apiInstance.AddFolder(sessionId, cMAddFolder, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.AddFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AddFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a new folder
    ApiResponse<CMDocumentFolder> response = apiInstance.AddFolderWithHttpInfo(sessionId, cMAddFolder, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.AddFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMAddFolder** | [**CMAddFolder**](CMAddFolder.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="addsourcefolder"></a>
# **AddSourceFolder**
> CMDocumentFolder AddSourceFolder (string sessionId, CMAddSourceFolder cMAddSourceFolder, string? aPIVersion = null)

Add a new source-folder

Add a new top-level folder (source folder) to the SimSage DMS.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddSourceFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMAddSourceFolder = new CMAddSourceFolder(); // CMAddSourceFolder | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Add a new source-folder
                CMDocumentFolder result = apiInstance.AddSourceFolder(sessionId, cMAddSourceFolder, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.AddSourceFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AddSourceFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a new source-folder
    ApiResponse<CMDocumentFolder> response = apiInstance.AddSourceFolderWithHttpInfo(sessionId, cMAddSourceFolder, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.AddSourceFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMAddSourceFolder** | [**CMAddSourceFolder**](CMAddSourceFolder.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteallnotes"></a>
# **DeleteAllNotes**
> JsonMessage DeleteAllNotes (string sessionId, string organisationId, string kbId, string url, string? aPIVersion = null)

delete all Notes

delete all notes associated with a document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteAllNotesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the base64 encoded url value
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // delete all Notes
                JsonMessage result = apiInstance.DeleteAllNotes(sessionId, organisationId, kbId, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteAllNotes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteAllNotesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // delete all Notes
    ApiResponse<JsonMessage> response = apiInstance.DeleteAllNotesWithHttpInfo(sessionId, organisationId, kbId, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteAllNotesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | the base64 encoded url value |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletebookmark"></a>
# **DeleteBookmark**
> List&lt;CMDocumentBookmark&gt; DeleteBookmark (string sessionId, string organisationId, string kbId, string userId, string url, string? aPIVersion = null)

Delete a Bookmark

Delete a user's bookmark associated with a document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteBookmarkExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var url = "url_example";  // string | the base64 encoded url value
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete a Bookmark
                List<CMDocumentBookmark> result = apiInstance.DeleteBookmark(sessionId, organisationId, kbId, userId, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteBookmark: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteBookmarkWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a Bookmark
    ApiResponse<List<CMDocumentBookmark>> response = apiInstance.DeleteBookmarkWithHttpInfo(sessionId, organisationId, kbId, userId, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteBookmarkWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **url** | **string** | the base64 encoded url value |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentBookmark&gt;**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletedocumentorfolder"></a>
# **DeleteDocumentOrFolder**
> CMDocumentFolder DeleteDocumentOrFolder (string sessionId, string organisationId, string kbId, bool isFolder, int sourceId, string url, string folderId, string? aPIVersion = null)

Delete a document or a folder

Mark a document/folder as deleted in the SimSage DMS.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteDocumentOrFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var isFolder = true;  // bool | is this a folder or a document?
            var sourceId = 56;  // int | the source-id of the item being deleted
            var url = "url_example";  // string | the base64 encoded url value
            var folderId = "folderId_example";  // string | the folder's id
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete a document or a folder
                CMDocumentFolder result = apiInstance.DeleteDocumentOrFolder(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteDocumentOrFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteDocumentOrFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a document or a folder
    ApiResponse<CMDocumentFolder> response = apiInstance.DeleteDocumentOrFolderWithHttpInfo(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteDocumentOrFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **isFolder** | **bool** | is this a folder or a document? |  |
| **sourceId** | **int** | the source-id of the item being deleted |  |
| **url** | **string** | the base64 encoded url value |  |
| **folderId** | **string** | the folder&#39;s id |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletenote"></a>
# **DeleteNote**
> List&lt;CMDocumentNote&gt; DeleteNote (string sessionId, string organisationId, string kbId, string url, int noteId, string? aPIVersion = null)

Delete a Note

Delete a note associated with a document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteNoteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the base64 encoded url value
            var noteId = 56;  // int | the id of the note to delete
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete a Note
                List<CMDocumentNote> result = apiInstance.DeleteNote(sessionId, organisationId, kbId, url, noteId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteNote: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteNoteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a Note
    ApiResponse<List<CMDocumentNote>> response = apiInstance.DeleteNoteWithHttpInfo(sessionId, organisationId, kbId, url, noteId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteNoteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | the base64 encoded url value |  |
| **noteId** | **int** | the id of the note to delete |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentNote&gt;**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletesourcefolder"></a>
# **DeleteSourceFolder**
> CMDocumentFolder DeleteSourceFolder (string sessionId, string organisationId, string kbId, int sourceId, string? aPIVersion = null)

Remove source-folder

Remove an existing top-level folder (source folder) from the SimSage DMS.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteSourceFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sourceId = 56;  // int | the sourceId of the source-folder to remove
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Remove source-folder
                CMDocumentFolder result = apiInstance.DeleteSourceFolder(sessionId, organisationId, kbId, sourceId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteSourceFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteSourceFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove source-folder
    ApiResponse<CMDocumentFolder> response = apiInstance.DeleteSourceFolderWithHttpInfo(sessionId, organisationId, kbId, sourceId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteSourceFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sourceId** | **int** | the sourceId of the source-folder to remove |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletesubscription"></a>
# **DeleteSubscription**
> CMSubscriptions DeleteSubscription (string sessionId, string organisationId, string kbId, string userId, string url, string? aPIVersion = null)

Delete a Subscription

Delete a user's subscription associated with a document, returns an updated subscription set.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteSubscriptionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var url = "url_example";  // string | the base64 encoded url value
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete a Subscription
                CMSubscriptions result = apiInstance.DeleteSubscription(sessionId, organisationId, kbId, userId, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteSubscription: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteSubscriptionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a Subscription
    ApiResponse<CMSubscriptions> response = apiInstance.DeleteSubscriptionWithHttpInfo(sessionId, organisationId, kbId, userId, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteSubscriptionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **url** | **string** | the base64 encoded url value |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteusersearch"></a>
# **DeleteUserSearch**
> List&lt;CMSavedSearch&gt; DeleteUserSearch (string sessionId, string organisationId, string kbId, string userId, string text, int top, string? aPIVersion = null)

Delete a Saved Search

Delete a user's saved search

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteUserSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var text = "text_example";  // string | the base64 encoded search-text value
            var top = 56;  // int | how many records to return
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete a Saved Search
                List<CMSavedSearch> result = apiInstance.DeleteUserSearch(sessionId, organisationId, kbId, userId, text, top, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DeleteUserSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteUserSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a Saved Search
    ApiResponse<List<CMSavedSearch>> response = apiInstance.DeleteUserSearchWithHttpInfo(sessionId, organisationId, kbId, userId, text, top, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DeleteUserSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **text** | **string** | the base64 encoded search-text value |  |
| **top** | **int** | how many records to return |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMSavedSearch&gt;**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="document1"></a>
# **Document1**
> CMDocument Document1 (string sessionId, string organisationId, string kbId, int urlId)

Get Document

Return a document's details by url-id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Document1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var urlId = 56;  // int | the document's url-id, a unique id identifying a document.

            try
            {
                // Get Document
                CMDocument result = apiInstance.Document1(sessionId, organisationId, kbId, urlId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.Document1: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Document1WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Document
    ApiResponse<CMDocument> response = apiInstance.Document1WithHttpInfo(sessionId, organisationId, kbId, urlId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.Document1WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **urlId** | **int** | the document&#39;s url-id, a unique id identifying a document. |  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="documentbinary"></a>
# **DocumentBinary**
> byte[] DocumentBinary (string sessionId, string organisationId, string kbId, string url)

Binary

Get the original for a document if available by url (latest version)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DocumentBinaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | a base64 encoded url

            try
            {
                // Binary
                byte[] result = apiInstance.DocumentBinary(sessionId, organisationId, kbId, url);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DocumentBinary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DocumentBinaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Binary
    ApiResponse<byte[]> response = apiInstance.DocumentBinaryWithHttpInfo(sessionId, organisationId, kbId, url);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DocumentBinaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | a base64 encoded url |  |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | document binary response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="documentversion"></a>
# **DocumentVersion**
> byte[] DocumentVersion (string sessionId, string organisationId, string kbId, string url, int varVersion)

Get Binary Document

Return a document's binary by url and version

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DocumentVersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the document's url, base64 encoded.  A unique id identifying a document.
            var varVersion = 56;  // int | the document's binary version.

            try
            {
                // Get Binary Document
                byte[] result = apiInstance.DocumentVersion(sessionId, organisationId, kbId, url, varVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.DocumentVersion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DocumentVersionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Binary Document
    ApiResponse<byte[]> response = apiInstance.DocumentVersionWithHttpInfo(sessionId, organisationId, kbId, url, varVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.DocumentVersionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | the document&#39;s url, base64 encoded.  A unique id identifying a document. |  |
| **varVersion** | **int** | the document&#39;s binary version. |  |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | document binary response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="filterfolders"></a>
# **FilterFolders**
> CMDocumentFolder FilterFolders (string sessionId, string organisationId, string kbId, string text, string? aPIVersion = null)

Filter Folders

Filter a set of folders using Search

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FilterFoldersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var text = "text_example";  // string | the text to use to filter (base64 encoded)
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Filter Folders
                CMDocumentFolder result = apiInstance.FilterFolders(sessionId, organisationId, kbId, text, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.FilterFolders: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FilterFoldersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Filter Folders
    ApiResponse<CMDocumentFolder> response = apiInstance.FilterFoldersWithHttpInfo(sessionId, organisationId, kbId, text, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.FilterFoldersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **text** | **string** | the text to use to filter (base64 encoded) |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="forcereleaselock"></a>
# **ForceReleaseLock**
> JsonMessage ForceReleaseLock (string sessionId, string organisationId, string kbId, string userId, string url, string? aPIVersion = null)

Force-release a lock

A system administrator or manager can force-unlock a document.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ForceReleaseLockExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var url = "url_example";  // string | the base64 encoded url value
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Force-release a lock
                JsonMessage result = apiInstance.ForceReleaseLock(sessionId, organisationId, kbId, userId, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.ForceReleaseLock: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ForceReleaseLockWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Force-release a lock
    ApiResponse<JsonMessage> response = apiInstance.ForceReleaseLockWithHttpInfo(sessionId, organisationId, kbId, userId, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.ForceReleaseLockWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **url** | **string** | the base64 encoded url value |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getbookmarklist"></a>
# **GetBookmarkList**
> List&lt;CMDocumentBookmark&gt; GetBookmarkList (string organisationId, string kbId, string userId, string sessionId, string? aPIVersion = null)

Get Bookmarks

Return a list of bookmarks for a given user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBookmarkListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get Bookmarks
                List<CMDocumentBookmark> result = apiInstance.GetBookmarkList(organisationId, kbId, userId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetBookmarkList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBookmarkListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Bookmarks
    ApiResponse<List<CMDocumentBookmark>> response = apiInstance.GetBookmarkListWithHttpInfo(organisationId, kbId, userId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetBookmarkListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentBookmark&gt;**](CMDocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getdeleteddocuments"></a>
# **GetDeletedDocuments**
> List&lt;DocumentDeleted&gt; GetDeletedDocuments (string sessionId, string organisationId, string kbId, string filter, string? aPIVersion = null)

Deleted records with optional filter

Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDeletedDocumentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var filter = "filter_example";  // string | an optional text filter for URLs
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Deleted records with optional filter
                List<DocumentDeleted> result = apiInstance.GetDeletedDocuments(sessionId, organisationId, kbId, filter, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetDeletedDocuments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDeletedDocumentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deleted records with optional filter
    ApiResponse<List<DocumentDeleted>> response = apiInstance.GetDeletedDocumentsWithHttpInfo(sessionId, organisationId, kbId, filter, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetDeletedDocumentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **filter** | **string** | an optional text filter for URLs |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;DocumentDeleted&gt;**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getdocumentaudit"></a>
# **GetDocumentAudit**
> List&lt;CMDocumentAudit&gt; GetDocumentAudit (string sessionId, string organisationId, string kbId, int year, int month, string url, string? aPIVersion = null)

Audit records for a document for a month

Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDocumentAuditExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var year = 56;  // int | the year for the notifications
            var month = 56;  // int | the month for the notifications
            var url = "url_example";  // string | the document url (base64 encoded) to get audit records for
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Audit records for a document for a month
                List<CMDocumentAudit> result = apiInstance.GetDocumentAudit(sessionId, organisationId, kbId, year, month, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetDocumentAudit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDocumentAuditWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Audit records for a document for a month
    ApiResponse<List<CMDocumentAudit>> response = apiInstance.GetDocumentAuditWithHttpInfo(sessionId, organisationId, kbId, year, month, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetDocumentAuditWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **year** | **int** | the year for the notifications |  |
| **month** | **int** | the month for the notifications |  |
| **url** | **string** | the document url (base64 encoded) to get audit records for |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getfolder"></a>
# **GetFolder**
> CMDocumentFolder GetFolder (string sessionId, string organisationId, string kbId, int sourceId, string folderId, string prevUrl, int pageSize, string? aPIVersion = null)

Get Folder Content

Return a folder's content

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sourceId = 56;  // int | the owner source's id
            var folderId = "folderId_example";  // string | the folder's id
            var prevUrl = "prevUrl_example";  // string | pagination, the previous last URL for the page-set ('null' is first page)
            var pageSize = 56;  // int | page-size for a paginated set
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get Folder Content
                CMDocumentFolder result = apiInstance.GetFolder(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Folder Content
    ApiResponse<CMDocumentFolder> response = apiInstance.GetFolderWithHttpInfo(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sourceId** | **int** | the owner source&#39;s id |  |
| **folderId** | **string** | the folder&#39;s id |  |
| **prevUrl** | **string** | pagination, the previous last URL for the page-set (&#39;null&#39; is first page) |  |
| **pageSize** | **int** | page-size for a paginated set |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getfullaudit"></a>
# **GetFullAudit**
> List&lt;CMDocumentAudit&gt; GetFullAudit (string sessionId, string organisationId, string kbId, int year, int month, string? aPIVersion = null)

Audit records for a month

Return document audit records for a user (filtered) or administrator (all records) for a given month

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFullAuditExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var year = 56;  // int | the year for the notifications
            var month = 56;  // int | the month for the notifications
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Audit records for a month
                List<CMDocumentAudit> result = apiInstance.GetFullAudit(sessionId, organisationId, kbId, year, month, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetFullAudit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetFullAuditWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Audit records for a month
    ApiResponse<List<CMDocumentAudit>> response = apiInstance.GetFullAuditWithHttpInfo(sessionId, organisationId, kbId, year, month, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetFullAuditWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **year** | **int** | the year for the notifications |  |
| **month** | **int** | the month for the notifications |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getlockedlist"></a>
# **GetLockedList**
> List&lt;CMDocument&gt; GetLockedList (string organisationId, string kbId, string userId, string sessionId, string? aPIVersion = null)

Get locked documents for user

Return a list of locked documents for a given user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetLockedListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get locked documents for user
                List<CMDocument> result = apiInstance.GetLockedList(organisationId, kbId, userId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetLockedList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetLockedListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get locked documents for user
    ApiResponse<List<CMDocument>> response = apiInstance.GetLockedListWithHttpInfo(organisationId, kbId, userId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetLockedListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocument&gt;**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getnotelist"></a>
# **GetNoteList**
> List&lt;CMDocumentNote&gt; GetNoteList (string sessionId, string organisationId, string kbId, string url, string? aPIVersion = null)

Get Notes

Return a list of notes for a given url

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetNoteListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the base64 encoded url value
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get Notes
                List<CMDocumentNote> result = apiInstance.GetNoteList(sessionId, organisationId, kbId, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetNoteList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetNoteListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Notes
    ApiResponse<List<CMDocumentNote>> response = apiInstance.GetNoteListWithHttpInfo(sessionId, organisationId, kbId, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetNoteListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | the base64 encoded url value |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentNote&gt;**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsavedsearches"></a>
# **GetSavedSearches**
> List&lt;CMSavedSearch&gt; GetSavedSearches (string sessionId, string organisationId, string kbId, string userId, int top, string? aPIVersion = null)

User's saved searches

Return a user's saved searches

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSavedSearchesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var top = 56;  // int | how many records to return
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // User's saved searches
                List<CMSavedSearch> result = apiInstance.GetSavedSearches(sessionId, organisationId, kbId, userId, top, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetSavedSearches: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSavedSearchesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // User's saved searches
    ApiResponse<List<CMSavedSearch>> response = apiInstance.GetSavedSearchesWithHttpInfo(sessionId, organisationId, kbId, userId, top, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetSavedSearchesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **top** | **int** | how many records to return |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMSavedSearch&gt;**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsourcefolder"></a>
# **GetSourceFolder**
> CMDocumentFolder GetSourceFolder (string organisationId, string kbId, int sourceId, string sessionId, string? aPIVersion = null)

Get source-folder

Return the content of a top-level folder (source folder).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSourceFolderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sourceId = 56;  // int | the source-id of the item being deleted
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get source-folder
                CMDocumentFolder result = apiInstance.GetSourceFolder(organisationId, kbId, sourceId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetSourceFolder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSourceFolderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get source-folder
    ApiResponse<CMDocumentFolder> response = apiInstance.GetSourceFolderWithHttpInfo(organisationId, kbId, sourceId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetSourceFolderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sourceId** | **int** | the source-id of the item being deleted |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsubscriptionlist"></a>
# **GetSubscriptionList**
> CMSubscriptions GetSubscriptionList (string organisationId, string kbId, string userId, string sessionId, string? aPIVersion = null)

Get Subscriptions

Return a subscriptions object for a given user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSubscriptionListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get Subscriptions
                CMSubscriptions result = apiInstance.GetSubscriptionList(organisationId, kbId, userId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetSubscriptionList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSubscriptionListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Subscriptions
    ApiResponse<CMSubscriptions> response = apiInstance.GetSubscriptionListWithHttpInfo(organisationId, kbId, userId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetSubscriptionListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getuserdashboard"></a>
# **GetUserDashboard**
> CMDUserDashboard GetUserDashboard (string organisationId, string kbId, string sessionId, string? aPIVersion = null)

User Dashboard

Return a the user's DMS dashboard

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetUserDashboardExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // User Dashboard
                CMDUserDashboard result = apiInstance.GetUserDashboard(organisationId, kbId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetUserDashboard: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetUserDashboardWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // User Dashboard
    ApiResponse<CMDUserDashboard> response = apiInstance.GetUserDashboardWithHttpInfo(organisationId, kbId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetUserDashboardWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getusernotifications"></a>
# **GetUserNotifications**
> List&lt;CMUserNotification&gt; GetUserNotifications (string sessionId, string organisationId, string kbId, int year, int month, string? aPIVersion = null)

Get User Notifications

Return all user notifications from the DMS for a given user by id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetUserNotificationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var year = 56;  // int | the year for the notifications
            var month = 56;  // int | the month for the notifications
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get User Notifications
                List<CMUserNotification> result = apiInstance.GetUserNotifications(sessionId, organisationId, kbId, year, month, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.GetUserNotifications: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetUserNotificationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get User Notifications
    ApiResponse<List<CMUserNotification>> response = apiInstance.GetUserNotificationsWithHttpInfo(sessionId, organisationId, kbId, year, month, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.GetUserNotificationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **year** | **int** | the year for the notifications |  |
| **month** | **int** | the month for the notifications |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMUserNotification&gt;**](CMUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="lockdocument"></a>
# **LockDocument**
> List&lt;CMDocument&gt; LockDocument (string sessionId, CMDocumentLock cMDocumentLock, string? aPIVersion = null)

Document Lock

Lock a document for a user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LockDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentLock = new CMDocumentLock(); // CMDocumentLock | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Document Lock
                List<CMDocument> result = apiInstance.LockDocument(sessionId, cMDocumentLock, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.LockDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LockDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Document Lock
    ApiResponse<List<CMDocument>> response = apiInstance.LockDocumentWithHttpInfo(sessionId, cMDocumentLock, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.LockDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentLock** | [**CMDocumentLock**](CMDocumentLock.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocument&gt;**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="releaselock"></a>
# **ReleaseLock**
> List&lt;CMDocument&gt; ReleaseLock (string sessionId, string organisationId, string kbId, string userId, string url, string? aPIVersion = null)

Release a lock

The originator of a lock releases a locked document.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ReleaseLockExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var userId = "userId_example";  // string | the user's id
            var url = "url_example";  // string | the base64 encoded url value
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Release a lock
                List<CMDocument> result = apiInstance.ReleaseLock(sessionId, organisationId, kbId, userId, url, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.ReleaseLock: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReleaseLockWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Release a lock
    ApiResponse<List<CMDocument>> response = apiInstance.ReleaseLockWithHttpInfo(sessionId, organisationId, kbId, userId, url, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.ReleaseLockWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **userId** | **string** | the user&#39;s id |  |
| **url** | **string** | the base64 encoded url value |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocument&gt;**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="restfuldmsclientquery"></a>
# **RestfulDMSClientQuery**
> CMClientQueryResult RestfulDMSClientQuery (string sessionId, CMClientQuery cMClientQuery)

DMS Client Query

a SimSage DMS client asks a question or performs a keyword-search.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RestfulDMSClientQueryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMClientQuery = new CMClientQuery(); // CMClientQuery | 

            try
            {
                // DMS Client Query
                CMClientQueryResult result = apiInstance.RestfulDMSClientQuery(sessionId, cMClientQuery);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.RestfulDMSClientQuery: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RestfulDMSClientQueryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // DMS Client Query
    ApiResponse<CMClientQueryResult> response = apiInstance.RestfulDMSClientQueryWithHttpInfo(sessionId, cMClientQuery);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.RestfulDMSClientQueryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMClientQuery** | [**CMClientQuery**](CMClientQuery.md) |  |  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savebookmark"></a>
# **SaveBookmark**
> List&lt;DocumentBookmark&gt; SaveBookmark (string sessionId, CMDocumentBookmark cMDocumentBookmark, string? aPIVersion = null)

Save Bookmark

Save (create or update) a SimSage Document Bookmark.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveBookmarkExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentBookmark = new CMDocumentBookmark(); // CMDocumentBookmark | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Bookmark
                List<DocumentBookmark> result = apiInstance.SaveBookmark(sessionId, cMDocumentBookmark, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.SaveBookmark: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveBookmarkWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Bookmark
    ApiResponse<List<DocumentBookmark>> response = apiInstance.SaveBookmarkWithHttpInfo(sessionId, cMDocumentBookmark, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.SaveBookmarkWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentBookmark** | [**CMDocumentBookmark**](CMDocumentBookmark.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;DocumentBookmark&gt;**](DocumentBookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savehashtags"></a>
# **SaveHashTags**
> JsonMessage SaveHashTags (string sessionId, CMDocumentHashTag cMDocumentHashTag, string? aPIVersion = null)

Save HashTag set for a document

Save (create / update / delete) a hashTag set for a document.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveHashTagsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentHashTag = new CMDocumentHashTag(); // CMDocumentHashTag | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save HashTag set for a document
                JsonMessage result = apiInstance.SaveHashTags(sessionId, cMDocumentHashTag, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.SaveHashTags: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveHashTagsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save HashTag set for a document
    ApiResponse<JsonMessage> response = apiInstance.SaveHashTagsWithHttpInfo(sessionId, cMDocumentHashTag, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.SaveHashTagsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentHashTag** | [**CMDocumentHashTag**](CMDocumentHashTag.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savenote"></a>
# **SaveNote**
> List&lt;CMDocumentNote&gt; SaveNote (string sessionId, CMDocumentNote cMDocumentNote, string? aPIVersion = null)

Save Note

Save (create or update) a SimSage Document Note.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveNoteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentNote = new CMDocumentNote(); // CMDocumentNote | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Note
                List<CMDocumentNote> result = apiInstance.SaveNote(sessionId, cMDocumentNote, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.SaveNote: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveNoteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Note
    ApiResponse<List<CMDocumentNote>> response = apiInstance.SaveNoteWithHttpInfo(sessionId, cMDocumentNote, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.SaveNoteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentNote** | [**CMDocumentNote**](CMDocumentNote.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMDocumentNote&gt;**](CMDocumentNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savesearch"></a>
# **SaveSearch**
> List&lt;CMSavedSearch&gt; SaveSearch (string sessionId, CMSavedSearch cMSavedSearch, string? aPIVersion = null)

Save Search

Save a user's search query.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSavedSearch = new CMSavedSearch(); // CMSavedSearch | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Search
                List<CMSavedSearch> result = apiInstance.SaveSearch(sessionId, cMSavedSearch, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.SaveSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Search
    ApiResponse<List<CMSavedSearch>> response = apiInstance.SaveSearchWithHttpInfo(sessionId, cMSavedSearch, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.SaveSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSavedSearch** | [**CMSavedSearch**](CMSavedSearch.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;CMSavedSearch&gt;**](CMSavedSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savesubscription"></a>
# **SaveSubscription**
> CMSubscriptions SaveSubscription (string sessionId, CMDocumentSubscription cMDocumentSubscription, string? aPIVersion = null)

Save Subscription

Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveSubscriptionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentSubscription = new CMDocumentSubscription(); // CMDocumentSubscription | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Subscription
                CMSubscriptions result = apiInstance.SaveSubscription(sessionId, cMDocumentSubscription, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.SaveSubscription: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveSubscriptionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Subscription
    ApiResponse<CMSubscriptions> response = apiInstance.SaveSubscriptionWithHttpInfo(sessionId, cMDocumentSubscription, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.SaveSubscriptionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentSubscription** | [**CMDocumentSubscription**](CMDocumentSubscription.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="undeletedocument"></a>
# **UndeleteDocument**
> List&lt;DocumentDeleted&gt; UndeleteDocument (string sessionId, string organisationId, string kbId, int sourceId, string url, string filter, string? aPIVersion = null)

un-delete a record

Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UndeleteDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sourceId = 56;  // int | the item's source id
            var url = "url_example";  // string | the document's url, base64 encoded.  A unique id identifying a document.
            var filter = "filter_example";  // string | an optional text filter for URLs
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // un-delete a record
                List<DocumentDeleted> result = apiInstance.UndeleteDocument(sessionId, organisationId, kbId, sourceId, url, filter, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.UndeleteDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UndeleteDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // un-delete a record
    ApiResponse<List<DocumentDeleted>> response = apiInstance.UndeleteDocumentWithHttpInfo(sessionId, organisationId, kbId, sourceId, url, filter, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.UndeleteDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sourceId** | **int** | the item&#39;s source id |  |
| **url** | **string** | the document&#39;s url, base64 encoded.  A unique id identifying a document. |  |
| **filter** | **string** | an optional text filter for URLs |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;DocumentDeleted&gt;**](DocumentDeleted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateacls"></a>
# **UpdateACLs**
> JsonMessage UpdateACLs (string sessionId, CMUpdateACLs cMUpdateACLs, string? aPIVersion = null)

Update an item's ACLs

Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateACLsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMUpdateACLs = new CMUpdateACLs(); // CMUpdateACLs | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Update an item's ACLs
                JsonMessage result = apiInstance.UpdateACLs(sessionId, cMUpdateACLs, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.UpdateACLs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateACLsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update an item's ACLs
    ApiResponse<JsonMessage> response = apiInstance.UpdateACLsWithHttpInfo(sessionId, cMUpdateACLs, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.UpdateACLsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMUpdateACLs** | [**CMUpdateACLs**](CMUpdateACLs.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="uploaddocument"></a>
# **UploadDocument**
> CMDocumentFolder UploadDocument (string sessionId, string organisationId, string kbId, int sourceId, string folderId, string lastModified, System.IO.Stream file)

Upload a Document

Upload a document into a DMS folder

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UploadDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DmsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sourceId = 56;  // int | the owner source's id
            var folderId = "folderId_example";  // string | the id of the folder we're uploading into
            var lastModified = "lastModified_example";  // string | lastModified unix-date-time
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | the file to upload

            try
            {
                // Upload a Document
                CMDocumentFolder result = apiInstance.UploadDocument(sessionId, organisationId, kbId, sourceId, folderId, lastModified, file);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DmsApi.UploadDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UploadDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Upload a Document
    ApiResponse<CMDocumentFolder> response = apiInstance.UploadDocumentWithHttpInfo(sessionId, organisationId, kbId, sourceId, folderId, lastModified, file);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DmsApi.UploadDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sourceId** | **int** | the owner source&#39;s id |  |
| **folderId** | **string** | the id of the folder we&#39;re uploading into |  |
| **lastModified** | **string** | lastModified unix-date-time |  |
| **file** | **System.IO.Stream****System.IO.Stream** | the file to upload |  |

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
| **500** | fail response |  -  |
| **200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

