# DataprojectApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addComment**](DataprojectApi.md#addComment) | **POST** /api/dataproject/comment | Create Comment |
| [**allTasks**](DataprojectApi.md#allTasks) | **POST** /api/dataproject/runningprojects | get Running Projects |
| [**changeTaskPhase**](DataprojectApi.md#changeTaskPhase) | **POST** /api/dataproject/changetaskphase | Change Task Phase |
| [**claimDocument**](DataprojectApi.md#claimDocument) | **POST** /api/dataproject/claimdocument | Claim sliced document |
| [**crawlerStatus**](DataprojectApi.md#crawlerStatus) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status |
| [**documentsByTokens**](DataprojectApi.md#documentsByTokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens |
| [**filteredComments**](DataprojectApi.md#filteredComments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments |
| [**getDocumentRedactionInfo**](DataprojectApi.md#getDocumentRedactionInfo) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info |
| [**getProjectDefinition**](DataprojectApi.md#getProjectDefinition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition |
| [**getProjectSlice**](DataprojectApi.md#getProjectSlice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice |
| [**getSearchResultSummary**](DataprojectApi.md#getSearchResultSummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary |
| [**nextDocument**](DataprojectApi.md#nextDocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters |
| [**projectTypes**](DataprojectApi.md#projectTypes) | **GET** /api/dataproject/projects/{organisationId} | get Project Types |
| [**reassignSliceDocument**](DataprojectApi.md#reassignSliceDocument) | **POST** /api/dataproject/reassignslicedoc |  |
| [**redactedDocument**](DataprojectApi.md#redactedDocument) | **POST** /api/dataproject/redacteddocument | Get Redacted Document |
| [**removeSliceDocument**](DataprojectApi.md#removeSliceDocument) | **POST** /api/dataproject/removeslicedoc |  |
| [**resetEvolve**](DataprojectApi.md#resetEvolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application |
| [**saveProjectDefinition**](DataprojectApi.md#saveProjectDefinition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition |
| [**setSliceConfig**](DataprojectApi.md#setSliceConfig) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration |
| [**slicedDocuments**](DataprojectApi.md#slicedDocuments) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters |
| [**startProject**](DataprojectApi.md#startProject) | **POST** /api/dataproject/startproject |  |
| [**updateDocumentStatus**](DataprojectApi.md#updateDocumentStatus) | **POST** /api/dataproject/updatedocstatus | Update document status |
| [**updateRedactions**](DataprojectApi.md#updateRedactions) | **POST** /api/dataproject/updateredactions | Update document redactions |


<a id="addComment"></a>
# **addComment**
> String addComment(sessionId, cmNewComment)

Create Comment

Adds a comment with the given level and ids

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMNewComment cmNewComment = new CMNewComment(); // CMNewComment | 
    try {
      String result = apiInstance.addComment(sessionId, cmNewComment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#addComment");
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
| **cmNewComment** | [**CMNewComment**](CMNewComment.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Comment Status OK response |  -  |
| **500** | Could not add comment. |  -  |

<a id="allTasks"></a>
# **allTasks**
> CMPagedQueueItems allTasks(sessionId, cmQueueFilter)

get Running Projects

Get the list of running projects

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMQueueFilter cmQueueFilter = new CMQueueFilter(); // CMQueueFilter | 
    try {
      CMPagedQueueItems result = apiInstance.allTasks(sessionId, cmQueueFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#allTasks");
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
| **cmQueueFilter** | [**CMQueueFilter**](CMQueueFilter.md)|  | |

### Return type

[**CMPagedQueueItems**](CMPagedQueueItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get running projects list. |  -  |
| **200** | running project list response |  -  |

<a id="changeTaskPhase"></a>
# **changeTaskPhase**
> String changeTaskPhase(sessionId, cmChangeTaskPhase)

Change Task Phase

Notifies Workflow engine that a task changed it&#39;s status and passes results in

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMChangeTaskPhase cmChangeTaskPhase = new CMChangeTaskPhase(); // CMChangeTaskPhase | 
    try {
      String result = apiInstance.changeTaskPhase(sessionId, cmChangeTaskPhase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#changeTaskPhase");
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
| **cmChangeTaskPhase** | [**CMChangeTaskPhase**](CMChangeTaskPhase.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | change task-phase OK response |  -  |
| **500** | could not change task-phase. |  -  |

<a id="claimDocument"></a>
# **claimDocument**
> ReturnedDocument claimDocument(sessionId, cmClaimDocument)

Claim sliced document

Claim sliced document for signed in user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMClaimDocument cmClaimDocument = new CMClaimDocument(); // CMClaimDocument | 
    try {
      ReturnedDocument result = apiInstance.claimDocument(sessionId, cmClaimDocument);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#claimDocument");
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
| **cmClaimDocument** | [**CMClaimDocument**](CMClaimDocument.md)|  | |

### Return type

[**ReturnedDocument**](ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Wrapper containing the document binary |  -  |
| **500** | could not retrieve redacted document. |  -  |

<a id="crawlerStatus"></a>
# **crawlerStatus**
> CMCrawlerStatusTask crawlerStatus(organisationId, taskId, sessionId)

get Crawler Status

Get the crawler status for the given task id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String taskId = "taskId_example"; // String | the id of the task
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      CMCrawlerStatusTask result = apiInstance.crawlerStatus(organisationId, taskId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#crawlerStatus");
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
| **taskId** | **String**| the id of the task | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**CMCrawlerStatusTask**](CMCrawlerStatusTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get crawler-status. |  -  |
| **200** | crawler-status response |  -  |

<a id="documentsByTokens"></a>
# **documentsByTokens**
> CMPagedProjectDocuments documentsByTokens(sessionId, cmDocumentsByToken)

Returns document list for tokens

Returns paged list of documents for the given set of query tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentsByToken cmDocumentsByToken = new CMDocumentsByToken(); // CMDocumentsByToken | 
    try {
      CMPagedProjectDocuments result = apiInstance.documentsByTokens(sessionId, cmDocumentsByToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#documentsByTokens");
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
| **cmDocumentsByToken** | [**CMDocumentsByToken**](CMDocumentsByToken.md)|  | |

### Return type

[**CMPagedProjectDocuments**](CMPagedProjectDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returns paged list of documents for the given set of query tokens |  -  |
| **500** | could not retrieve document list. |  -  |

<a id="filteredComments"></a>
# **filteredComments**
> List&lt;CMRecordedComment&gt; filteredComments(sessionId, cmCommentFilter)

Retrieve Comments

Retrieves the list of comments for the passed in Filter

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMCommentFilter cmCommentFilter = new CMCommentFilter(); // CMCommentFilter | 
    try {
      List<CMRecordedComment> result = apiInstance.filteredComments(sessionId, cmCommentFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#filteredComments");
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
| **cmCommentFilter** | [**CMCommentFilter**](CMCommentFilter.md)|  | |

### Return type

[**List&lt;CMRecordedComment&gt;**](CMRecordedComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Comment Status OK response |  -  |
| **500** | Could not get comments. |  -  |

<a id="getDocumentRedactionInfo"></a>
# **getDocumentRedactionInfo**
> List&lt;LocatedRedaction&gt; getDocumentRedactionInfo(organisationId, sliceId, documentKey, sessionId)

Get Document Redaction info

Get list of all identified potential Redaction locations for the document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String sliceId = "sliceId_example"; // String | the id of the slice
    String documentKey = "documentKey_example"; // String | the document key of the document to be redacted
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<LocatedRedaction> result = apiInstance.getDocumentRedactionInfo(organisationId, sliceId, documentKey, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#getDocumentRedactionInfo");
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
| **sliceId** | **String**| the id of the slice | |
| **documentKey** | **String**| the document key of the document to be redacted | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**List&lt;LocatedRedaction&gt;**](LocatedRedaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not retrieve redaction info. |  -  |
| **200** | List of all identified potential Redaction locations for the document |  -  |

<a id="getProjectDefinition"></a>
# **getProjectDefinition**
> CMProjectDefinitionTask getProjectDefinition(organisationId, taskId, sessionId)

get Project Definition

Get the project definition of the project for the given task id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String taskId = "taskId_example"; // String | the id of the task
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      CMProjectDefinitionTask result = apiInstance.getProjectDefinition(organisationId, taskId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#getProjectDefinition");
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
| **taskId** | **String**| the id of the task | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**CMProjectDefinitionTask**](CMProjectDefinitionTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | project definition response |  -  |
| **500** | could not get project definition. |  -  |

<a id="getProjectSlice"></a>
# **getProjectSlice**
> List&lt;CMProjectSliceTask&gt; getProjectSlice(organisationId, taskId, sessionId)

get project slice

Get the project project slice for the given task id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String taskId = "taskId_example"; // String | the id of the task
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<CMProjectSliceTask> result = apiInstance.getProjectSlice(organisationId, taskId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#getProjectSlice");
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
| **taskId** | **String**| the id of the task | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**List&lt;CMProjectSliceTask&gt;**](CMProjectSliceTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project slice data |  -  |
| **500** | could not retrieve project slice. |  -  |

<a id="getSearchResultSummary"></a>
# **getSearchResultSummary**
> CMSearchResultSummaryTask getSearchResultSummary(organisationId, taskId, sessionId)

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String taskId = "taskId_example"; // String | the id of the task
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      CMSearchResultSummaryTask result = apiInstance.getSearchResultSummary(organisationId, taskId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#getSearchResultSummary");
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
| **taskId** | **String**| the id of the task | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**CMSearchResultSummaryTask**](CMSearchResultSummaryTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get search result summary. |  -  |
| **200** | search result summary response |  -  |

<a id="nextDocument"></a>
# **nextDocument**
> CMSlicedDocumentListAndTotals nextDocument(sessionId, cmNextDocument)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMNextDocument cmNextDocument = new CMNextDocument(); // CMNextDocument | 
    try {
      CMSlicedDocumentListAndTotals result = apiInstance.nextDocument(sessionId, cmNextDocument);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#nextDocument");
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
| **cmNextDocument** | [**CMNextDocument**](CMNextDocument.md)|  | |

### Return type

[**CMSlicedDocumentListAndTotals**](CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not retrieve document list. |  -  |
| **200** | Paged list of documents for the passed in slice and filters as well as totals |  -  |

<a id="projectTypes"></a>
# **projectTypes**
> List&lt;CMProjectInfo&gt; projectTypes(organisationId, sessionId)

get Project Types

Get the list of available project types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<CMProjectInfo> result = apiInstance.projectTypes(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#projectTypes");
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
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**List&lt;CMProjectInfo&gt;**](CMProjectInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | project-type list response |  -  |
| **500** | could not get project-type list. |  -  |

<a id="reassignSliceDocument"></a>
# **reassignSliceDocument**
> Object reassignSliceDocument(sessionId, cmReassignSliceDocument)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMReassignSliceDocument cmReassignSliceDocument = new CMReassignSliceDocument(); // CMReassignSliceDocument | 
    try {
      Object result = apiInstance.reassignSliceDocument(sessionId, cmReassignSliceDocument);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#reassignSliceDocument");
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
| **cmReassignSliceDocument** | [**CMReassignSliceDocument**](CMReassignSliceDocument.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="redactedDocument"></a>
# **redactedDocument**
> ReturnedDocument redactedDocument(sessionId, cmRedactionDetails)

Get Redacted Document

Retrieves the redacted document binary

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMRedactionDetails cmRedactionDetails = new CMRedactionDetails(); // CMRedactionDetails | 
    try {
      ReturnedDocument result = apiInstance.redactedDocument(sessionId, cmRedactionDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#redactedDocument");
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
| **cmRedactionDetails** | [**CMRedactionDetails**](CMRedactionDetails.md)|  | |

### Return type

[**ReturnedDocument**](ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Wrapper containing the document binary |  -  |
| **500** | could not retrieve redacted document. |  -  |

<a id="removeSliceDocument"></a>
# **removeSliceDocument**
> Object removeSliceDocument(sessionId, cmRemoveSliceDocument)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMRemoveSliceDocument cmRemoveSliceDocument = new CMRemoveSliceDocument(); // CMRemoveSliceDocument | 
    try {
      Object result = apiInstance.removeSliceDocument(sessionId, cmRemoveSliceDocument);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#removeSliceDocument");
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
| **cmRemoveSliceDocument** | [**CMRemoveSliceDocument**](CMRemoveSliceDocument.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="resetEvolve"></a>
# **resetEvolve**
> String resetEvolve(organisationId, sessionId)

Reset Evolve Application

Fully resets Evolve to an empty system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String organisationId = "organisationId_example"; // String | a valid SimSage Organisation id.
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      String result = apiInstance.resetEvolve(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#resetEvolve");
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
| **organisationId** | **String**| a valid SimSage Organisation id. | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Exception during reset. |  -  |
| **200** | Evolve successfully reset |  -  |

<a id="saveProjectDefinition"></a>
# **saveProjectDefinition**
> CMCreatedProject saveProjectDefinition(sessionId, cmProjectDefinition)

Inserts/Updates a project definition

Inserts/Updates the details for a project definition

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMProjectDefinition cmProjectDefinition = new CMProjectDefinition(); // CMProjectDefinition | 
    try {
      CMCreatedProject result = apiInstance.saveProjectDefinition(sessionId, cmProjectDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#saveProjectDefinition");
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
| **cmProjectDefinition** | [**CMProjectDefinition**](CMProjectDefinition.md)|  | |

### Return type

[**CMCreatedProject**](CMCreatedProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object containing the task and project ids to use to further refine the project details |  -  |
| **500** | could not save project-definition. |  -  |

<a id="setSliceConfig"></a>
# **setSliceConfig**
> String setSliceConfig(sessionId, cmSetSliceDefinitions)

Set Slice configuration

Saves/updates the slices configured for a running project

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSetSliceDefinitions cmSetSliceDefinitions = new CMSetSliceDefinitions(); // CMSetSliceDefinitions | 
    try {
      String result = apiInstance.setSliceConfig(sessionId, cmSetSliceDefinitions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#setSliceConfig");
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
| **cmSetSliceDefinitions** | [**CMSetSliceDefinitions**](CMSetSliceDefinitions.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Could not set Slice configuration. |  -  |
| **200** | Set Slice config OK response |  -  |

<a id="slicedDocuments"></a>
# **slicedDocuments**
> CMSlicedDocumentListAndTotals slicedDocuments(sessionId, cmSlicedDocumentRequest)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSlicedDocumentRequest cmSlicedDocumentRequest = new CMSlicedDocumentRequest(); // CMSlicedDocumentRequest | 
    try {
      CMSlicedDocumentListAndTotals result = apiInstance.slicedDocuments(sessionId, cmSlicedDocumentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#slicedDocuments");
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
| **cmSlicedDocumentRequest** | [**CMSlicedDocumentRequest**](CMSlicedDocumentRequest.md)|  | |

### Return type

[**CMSlicedDocumentListAndTotals**](CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not retrieve document list. |  -  |
| **200** | Paged list of documents for the passed in slice and filters as well as totals |  -  |

<a id="startProject"></a>
# **startProject**
> Object startProject(sessionId, cmStartProject)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMStartProject cmStartProject = new CMStartProject(); // CMStartProject | 
    try {
      Object result = apiInstance.startProject(sessionId, cmStartProject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#startProject");
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
| **cmStartProject** | [**CMStartProject**](CMStartProject.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDocumentStatus"></a>
# **updateDocumentStatus**
> String updateDocumentStatus(sessionId, cmUpdateDocumentStatus)

Update document status

Updates the status applied to a slice document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMUpdateDocumentStatus cmUpdateDocumentStatus = new CMUpdateDocumentStatus(); // CMUpdateDocumentStatus | 
    try {
      String result = apiInstance.updateDocumentStatus(sessionId, cmUpdateDocumentStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#updateDocumentStatus");
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
| **cmUpdateDocumentStatus** | [**CMUpdateDocumentStatus**](CMUpdateDocumentStatus.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Document Status OK response |  -  |
| **500** | Could not update document status. |  -  |

<a id="updateRedactions"></a>
# **updateRedactions**
> String updateRedactions(sessionId, cmUpdateRedactions)

Update document redactions

Updates the redactions applied to a document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataprojectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DataprojectApi apiInstance = new DataprojectApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMUpdateRedactions cmUpdateRedactions = new CMUpdateRedactions(); // CMUpdateRedactions | 
    try {
      String result = apiInstance.updateRedactions(sessionId, cmUpdateRedactions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataprojectApi#updateRedactions");
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
| **cmUpdateRedactions** | [**CMUpdateRedactions**](CMUpdateRedactions.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Redactions OK response |  -  |
| **500** | could not update redactionst. |  -  |

