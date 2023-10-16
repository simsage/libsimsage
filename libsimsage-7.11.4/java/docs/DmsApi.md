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


<a id="addFolder"></a>
# **addFolder**
> CMDocumentFolder addFolder(sessionId, cmAddFolder, apIVersion)

Add a new folder

Add a new folder to the SimSage DMS.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMAddFolder cmAddFolder = new CMAddFolder(); // CMAddFolder | 
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.addFolder(sessionId, cmAddFolder, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#addFolder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmAddFolder** | [**CMAddFolder**](CMAddFolder.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="addSourceFolder"></a>
# **addSourceFolder**
> CMDocumentFolder addSourceFolder(sessionId, cmAddSourceFolder, apIVersion)

Add a new source-folder

Add a new top-level folder (source folder) to the SimSage DMS.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMAddSourceFolder cmAddSourceFolder = new CMAddSourceFolder(); // CMAddSourceFolder | 
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.addSourceFolder(sessionId, cmAddSourceFolder, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#addSourceFolder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmAddSourceFolder** | [**CMAddSourceFolder**](CMAddSourceFolder.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteAllNotes"></a>
# **deleteAllNotes**
> JsonMessage deleteAllNotes(sessionId, organisationId, kbId, url, apIVersion)

delete all Notes

delete all notes associated with a document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the base64 encoded url value
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteAllNotes(sessionId, organisationId, kbId, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteAllNotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **url** | **String**| the base64 encoded url value | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteBookmark"></a>
# **deleteBookmark**
> List&lt;CMDocumentBookmark&gt; deleteBookmark(sessionId, organisationId, kbId, userId, url, apIVersion)

Delete a Bookmark

Delete a user&#39;s bookmark associated with a document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String url = "url_example"; // String | the base64 encoded url value
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentBookmark> result = apiInstance.deleteBookmark(sessionId, organisationId, kbId, userId, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteBookmark");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **url** | **String**| the base64 encoded url value | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteDocumentOrFolder"></a>
# **deleteDocumentOrFolder**
> CMDocumentFolder deleteDocumentOrFolder(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, apIVersion)

Delete a document or a folder

Mark a document/folder as deleted in the SimSage DMS.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Boolean isFolder = true; // Boolean | is this a folder or a document?
    Integer sourceId = 56; // Integer | the source-id of the item being deleted
    String url = "url_example"; // String | the base64 encoded url value
    String folderId = "folderId_example"; // String | the folder's id
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.deleteDocumentOrFolder(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteDocumentOrFolder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **isFolder** | **Boolean**| is this a folder or a document? | |
| **sourceId** | **Integer**| the source-id of the item being deleted | |
| **url** | **String**| the base64 encoded url value | |
| **folderId** | **String**| the folder&#39;s id | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteNote"></a>
# **deleteNote**
> List&lt;CMDocumentNote&gt; deleteNote(sessionId, organisationId, kbId, url, noteId, apIVersion)

Delete a Note

Delete a note associated with a document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the base64 encoded url value
    Integer noteId = 56; // Integer | the id of the note to delete
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentNote> result = apiInstance.deleteNote(sessionId, organisationId, kbId, url, noteId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **url** | **String**| the base64 encoded url value | |
| **noteId** | **Integer**| the id of the note to delete | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteSourceFolder"></a>
# **deleteSourceFolder**
> CMDocumentFolder deleteSourceFolder(sessionId, organisationId, kbId, sourceId, apIVersion)

Remove source-folder

Remove an existing top-level folder (source folder) from the SimSage DMS.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer sourceId = 56; // Integer | the sourceId of the source-folder to remove
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.deleteSourceFolder(sessionId, organisationId, kbId, sourceId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteSourceFolder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **sourceId** | **Integer**| the sourceId of the source-folder to remove | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteSubscription"></a>
# **deleteSubscription**
> CMSubscriptions deleteSubscription(sessionId, organisationId, kbId, userId, url, apIVersion)

Delete a Subscription

Delete a user&#39;s subscription associated with a document, returns an updated subscription set.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String url = "url_example"; // String | the base64 encoded url value
    String apIVersion = "1"; // String | 
    try {
      CMSubscriptions result = apiInstance.deleteSubscription(sessionId, organisationId, kbId, userId, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **url** | **String**| the base64 encoded url value | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="deleteUserSearch"></a>
# **deleteUserSearch**
> List&lt;CMSavedSearch&gt; deleteUserSearch(sessionId, organisationId, kbId, userId, text, top, apIVersion)

Delete a Saved Search

Delete a user&#39;s saved search

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String text = "text_example"; // String | the base64 encoded search-text value
    Integer top = 56; // Integer | how many records to return
    String apIVersion = "1"; // String | 
    try {
      List<CMSavedSearch> result = apiInstance.deleteUserSearch(sessionId, organisationId, kbId, userId, text, top, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#deleteUserSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **text** | **String**| the base64 encoded search-text value | |
| **top** | **Integer**| how many records to return | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="document1"></a>
# **document1**
> CMDocument document1(sessionId, organisationId, kbId, urlId)

Get Document

Return a document&#39;s details by url-id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer urlId = 56; // Integer | the document's url-id, a unique id identifying a document.
    try {
      CMDocument result = apiInstance.document1(sessionId, organisationId, kbId, urlId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#document1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **urlId** | **Integer**| the document&#39;s url-id, a unique id identifying a document. | |

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

<a id="documentBinary"></a>
# **documentBinary**
> byte[] documentBinary(sessionId, organisationId, kbId, url)

Binary

Get the original for a document if available by url (latest version)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | a base64 encoded url
    try {
      byte[] result = apiInstance.documentBinary(sessionId, organisationId, kbId, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#documentBinary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **url** | **String**| a base64 encoded url | |

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

<a id="documentVersion"></a>
# **documentVersion**
> byte[] documentVersion(sessionId, organisationId, kbId, url, version)

Get Binary Document

Return a document&#39;s binary by url and version

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the document's url, base64 encoded.  A unique id identifying a document.
    Integer version = 56; // Integer | the document's binary version.
    try {
      byte[] result = apiInstance.documentVersion(sessionId, organisationId, kbId, url, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#documentVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **url** | **String**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | |
| **version** | **Integer**| the document&#39;s binary version. | |

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

<a id="filterFolders"></a>
# **filterFolders**
> CMDocumentFolder filterFolders(sessionId, organisationId, kbId, text, apIVersion)

Filter Folders

Filter a set of folders using Search

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String text = "text_example"; // String | the text to use to filter (base64 encoded)
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.filterFolders(sessionId, organisationId, kbId, text, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#filterFolders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **text** | **String**| the text to use to filter (base64 encoded) | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="forceReleaseLock"></a>
# **forceReleaseLock**
> JsonMessage forceReleaseLock(sessionId, organisationId, kbId, userId, url, apIVersion)

Force-release a lock

A system administrator or manager can force-unlock a document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String url = "url_example"; // String | the base64 encoded url value
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.forceReleaseLock(sessionId, organisationId, kbId, userId, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#forceReleaseLock");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **url** | **String**| the base64 encoded url value | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getBookmarkList"></a>
# **getBookmarkList**
> List&lt;CMDocumentBookmark&gt; getBookmarkList(organisationId, kbId, userId, sessionId, apIVersion)

Get Bookmarks

Return a list of bookmarks for a given user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentBookmark> result = apiInstance.getBookmarkList(organisationId, kbId, userId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getBookmarkList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getDeletedDocuments"></a>
# **getDeletedDocuments**
> List&lt;DocumentDeleted&gt; getDeletedDocuments(sessionId, organisationId, kbId, filter, apIVersion)

Deleted records with optional filter

Return a list of deleted document records for an administrator (all records) with an optional filter set.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String filter = "filter_example"; // String | an optional text filter for URLs
    String apIVersion = "1"; // String | 
    try {
      List<DocumentDeleted> result = apiInstance.getDeletedDocuments(sessionId, organisationId, kbId, filter, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getDeletedDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **filter** | **String**| an optional text filter for URLs | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getDocumentAudit"></a>
# **getDocumentAudit**
> List&lt;CMDocumentAudit&gt; getDocumentAudit(sessionId, organisationId, kbId, year, month, url, apIVersion)

Audit records for a document for a month

Return document audit records for a user (filtered) or administrator (all records) for a given document / month

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer year = 56; // Integer | the year for the notifications
    Integer month = 56; // Integer | the month for the notifications
    String url = "url_example"; // String | the document url (base64 encoded) to get audit records for
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentAudit> result = apiInstance.getDocumentAudit(sessionId, organisationId, kbId, year, month, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getDocumentAudit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **year** | **Integer**| the year for the notifications | |
| **month** | **Integer**| the month for the notifications | |
| **url** | **String**| the document url (base64 encoded) to get audit records for | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getFolder"></a>
# **getFolder**
> CMDocumentFolder getFolder(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, apIVersion)

Get Folder Content

Return a folder&#39;s content

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer sourceId = 56; // Integer | the owner source's id
    String folderId = "folderId_example"; // String | the folder's id
    String prevUrl = "prevUrl_example"; // String | pagination, the previous last URL for the page-set ('null' is first page)
    Integer pageSize = 56; // Integer | page-size for a paginated set
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.getFolder(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getFolder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **sourceId** | **Integer**| the owner source&#39;s id | |
| **folderId** | **String**| the folder&#39;s id | |
| **prevUrl** | **String**| pagination, the previous last URL for the page-set (&#39;null&#39; is first page) | |
| **pageSize** | **Integer**| page-size for a paginated set | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getFullAudit"></a>
# **getFullAudit**
> List&lt;CMDocumentAudit&gt; getFullAudit(sessionId, organisationId, kbId, year, month, apIVersion)

Audit records for a month

Return document audit records for a user (filtered) or administrator (all records) for a given month

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer year = 56; // Integer | the year for the notifications
    Integer month = 56; // Integer | the month for the notifications
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentAudit> result = apiInstance.getFullAudit(sessionId, organisationId, kbId, year, month, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getFullAudit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **year** | **Integer**| the year for the notifications | |
| **month** | **Integer**| the month for the notifications | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getLockedList"></a>
# **getLockedList**
> List&lt;CMDocument&gt; getLockedList(organisationId, kbId, userId, sessionId, apIVersion)

Get locked documents for user

Return a list of locked documents for a given user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      List<CMDocument> result = apiInstance.getLockedList(organisationId, kbId, userId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getLockedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getNoteList"></a>
# **getNoteList**
> List&lt;CMDocumentNote&gt; getNoteList(sessionId, organisationId, kbId, url, apIVersion)

Get Notes

Return a list of notes for a given url

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the base64 encoded url value
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentNote> result = apiInstance.getNoteList(sessionId, organisationId, kbId, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getNoteList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **url** | **String**| the base64 encoded url value | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getSavedSearches"></a>
# **getSavedSearches**
> List&lt;CMSavedSearch&gt; getSavedSearches(sessionId, organisationId, kbId, userId, top, apIVersion)

User&#39;s saved searches

Return a user&#39;s saved searches

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    Integer top = 56; // Integer | how many records to return
    String apIVersion = "1"; // String | 
    try {
      List<CMSavedSearch> result = apiInstance.getSavedSearches(sessionId, organisationId, kbId, userId, top, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getSavedSearches");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **top** | **Integer**| how many records to return | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getSourceFolder"></a>
# **getSourceFolder**
> CMDocumentFolder getSourceFolder(organisationId, kbId, sourceId, sessionId, apIVersion)

Get source-folder

Return the content of a top-level folder (source folder).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer sourceId = 56; // Integer | the source-id of the item being deleted
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMDocumentFolder result = apiInstance.getSourceFolder(organisationId, kbId, sourceId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getSourceFolder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **sourceId** | **Integer**| the source-id of the item being deleted | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getSubscriptionList"></a>
# **getSubscriptionList**
> CMSubscriptions getSubscriptionList(organisationId, kbId, userId, sessionId, apIVersion)

Get Subscriptions

Return a subscriptions object for a given user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMSubscriptions result = apiInstance.getSubscriptionList(organisationId, kbId, userId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getSubscriptionList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getUserDashboard"></a>
# **getUserDashboard**
> CMDUserDashboard getUserDashboard(organisationId, kbId, sessionId, apIVersion)

User Dashboard

Return a the user&#39;s DMS dashboard

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMDUserDashboard result = apiInstance.getUserDashboard(organisationId, kbId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getUserDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getUserNotifications"></a>
# **getUserNotifications**
> List&lt;CMUserNotification&gt; getUserNotifications(sessionId, organisationId, kbId, year, month, apIVersion)

Get User Notifications

Return all user notifications from the DMS for a given user by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer year = 56; // Integer | the year for the notifications
    Integer month = 56; // Integer | the month for the notifications
    String apIVersion = "1"; // String | 
    try {
      List<CMUserNotification> result = apiInstance.getUserNotifications(sessionId, organisationId, kbId, year, month, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#getUserNotifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **year** | **Integer**| the year for the notifications | |
| **month** | **Integer**| the month for the notifications | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="lockDocument"></a>
# **lockDocument**
> List&lt;CMDocument&gt; lockDocument(sessionId, cmDocumentLock, apIVersion)

Document Lock

Lock a document for a user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentLock cmDocumentLock = new CMDocumentLock(); // CMDocumentLock | 
    String apIVersion = "1"; // String | 
    try {
      List<CMDocument> result = apiInstance.lockDocument(sessionId, cmDocumentLock, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#lockDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmDocumentLock** | [**CMDocumentLock**](CMDocumentLock.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="releaseLock"></a>
# **releaseLock**
> List&lt;CMDocument&gt; releaseLock(sessionId, organisationId, kbId, userId, url, apIVersion)

Release a lock

The originator of a lock releases a locked document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String userId = "userId_example"; // String | the user's id
    String url = "url_example"; // String | the base64 encoded url value
    String apIVersion = "1"; // String | 
    try {
      List<CMDocument> result = apiInstance.releaseLock(sessionId, organisationId, kbId, userId, url, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#releaseLock");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **userId** | **String**| the user&#39;s id | |
| **url** | **String**| the base64 encoded url value | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="restfulDMSClientQuery"></a>
# **restfulDMSClientQuery**
> CMClientQueryResult restfulDMSClientQuery(sessionId, cmClientQuery)

DMS Client Query

a SimSage DMS client asks a question or performs a keyword-search.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMClientQuery cmClientQuery = new CMClientQuery(); // CMClientQuery | 
    try {
      CMClientQueryResult result = apiInstance.restfulDMSClientQuery(sessionId, cmClientQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#restfulDMSClientQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmClientQuery** | [**CMClientQuery**](CMClientQuery.md)|  | |

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

<a id="saveBookmark"></a>
# **saveBookmark**
> List&lt;DocumentBookmark&gt; saveBookmark(sessionId, cmDocumentBookmark, apIVersion)

Save Bookmark

Save (create or update) a SimSage Document Bookmark.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentBookmark cmDocumentBookmark = new CMDocumentBookmark(); // CMDocumentBookmark | 
    String apIVersion = "1"; // String | 
    try {
      List<DocumentBookmark> result = apiInstance.saveBookmark(sessionId, cmDocumentBookmark, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#saveBookmark");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmDocumentBookmark** | [**CMDocumentBookmark**](CMDocumentBookmark.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="saveHashTags"></a>
# **saveHashTags**
> JsonMessage saveHashTags(sessionId, cmDocumentHashTag, apIVersion)

Save HashTag set for a document

Save (create / update / delete) a hashTag set for a document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentHashTag cmDocumentHashTag = new CMDocumentHashTag(); // CMDocumentHashTag | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.saveHashTags(sessionId, cmDocumentHashTag, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#saveHashTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmDocumentHashTag** | [**CMDocumentHashTag**](CMDocumentHashTag.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="saveNote"></a>
# **saveNote**
> List&lt;CMDocumentNote&gt; saveNote(sessionId, cmDocumentNote, apIVersion)

Save Note

Save (create or update) a SimSage Document Note.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentNote cmDocumentNote = new CMDocumentNote(); // CMDocumentNote | 
    String apIVersion = "1"; // String | 
    try {
      List<CMDocumentNote> result = apiInstance.saveNote(sessionId, cmDocumentNote, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#saveNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmDocumentNote** | [**CMDocumentNote**](CMDocumentNote.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="saveSearch"></a>
# **saveSearch**
> List&lt;CMSavedSearch&gt; saveSearch(sessionId, cmSavedSearch, apIVersion)

Save Search

Save a user&#39;s search query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSavedSearch cmSavedSearch = new CMSavedSearch(); // CMSavedSearch | 
    String apIVersion = "1"; // String | 
    try {
      List<CMSavedSearch> result = apiInstance.saveSearch(sessionId, cmSavedSearch, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#saveSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmSavedSearch** | [**CMSavedSearch**](CMSavedSearch.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="saveSubscription"></a>
# **saveSubscription**
> CMSubscriptions saveSubscription(sessionId, cmDocumentSubscription, apIVersion)

Save Subscription

Save (create or update) a SimSage Document subscription.  Returns a subscription object for this user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentSubscription cmDocumentSubscription = new CMDocumentSubscription(); // CMDocumentSubscription | 
    String apIVersion = "1"; // String | 
    try {
      CMSubscriptions result = apiInstance.saveSubscription(sessionId, cmDocumentSubscription, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#saveSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmDocumentSubscription** | [**CMDocumentSubscription**](CMDocumentSubscription.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="undeleteDocument"></a>
# **undeleteDocument**
> List&lt;DocumentDeleted&gt; undeleteDocument(sessionId, organisationId, kbId, sourceId, url, filter, apIVersion)

un-delete a record

Un-delete a previously deleted document and return a list of deleted document records for an administrator (all records).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer sourceId = 56; // Integer | the item's source id
    String url = "url_example"; // String | the document's url, base64 encoded.  A unique id identifying a document.
    String filter = "filter_example"; // String | an optional text filter for URLs
    String apIVersion = "1"; // String | 
    try {
      List<DocumentDeleted> result = apiInstance.undeleteDocument(sessionId, organisationId, kbId, sourceId, url, filter, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#undeleteDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **sourceId** | **Integer**| the item&#39;s source id | |
| **url** | **String**| the document&#39;s url, base64 encoded.  A unique id identifying a document. | |
| **filter** | **String**| an optional text filter for URLs | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="updateACLs"></a>
# **updateACLs**
> JsonMessage updateACLs(sessionId, cmUpdateACLs, apIVersion)

Update an item&#39;s ACLs

Update the Access Control List of a SimSage DMS item (source, file, or folder).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMUpdateACLs cmUpdateACLs = new CMUpdateACLs(); // CMUpdateACLs | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.updateACLs(sessionId, cmUpdateACLs, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#updateACLs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmUpdateACLs** | [**CMUpdateACLs**](CMUpdateACLs.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="uploadDocument"></a>
# **uploadDocument**
> CMDocumentFolder uploadDocument(sessionId, organisationId, kbId, sourceId, folderId, lastModified, _file)

Upload a Document

Upload a document into a DMS folder

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DmsApi apiInstance = new DmsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer sourceId = 56; // Integer | the owner source's id
    String folderId = "folderId_example"; // String | the id of the folder we're uploading into
    String lastModified = "lastModified_example"; // String | lastModified unix-date-time
    File _file = new File("/path/to/file"); // File | the file to upload
    try {
      CMDocumentFolder result = apiInstance.uploadDocument(sessionId, organisationId, kbId, sourceId, folderId, lastModified, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DmsApi#uploadDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **sourceId** | **Integer**| the owner source&#39;s id | |
| **folderId** | **String**| the id of the folder we&#39;re uploading into | |
| **lastModified** | **String**| lastModified unix-date-time | |
| **_file** | **File**| the file to upload | |

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

