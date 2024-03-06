# DataprojectApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addComment**](DataprojectApi.md#addComment) | **POST** /api/dataproject/comment | Create Comment
[**allTasks**](DataprojectApi.md#allTasks) | **POST** /api/dataproject/runningprojects | get Running Projects
[**changeTaskPhase**](DataprojectApi.md#changeTaskPhase) | **POST** /api/dataproject/changetaskphase | Change Task Phase
[**claimDocument**](DataprojectApi.md#claimDocument) | **POST** /api/dataproject/claimdocument | Claim sliced document
[**crawlerStatus**](DataprojectApi.md#crawlerStatus) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status
[**documentsByTokens**](DataprojectApi.md#documentsByTokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens
[**filteredComments**](DataprojectApi.md#filteredComments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments
[**getDocumentRedactionInfo**](DataprojectApi.md#getDocumentRedactionInfo) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info
[**getProjectDefinition**](DataprojectApi.md#getProjectDefinition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition
[**getProjectReview**](DataprojectApi.md#getProjectReview) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition
[**getProjectSlice**](DataprojectApi.md#getProjectSlice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice
[**getSearchResultSummary**](DataprojectApi.md#getSearchResultSummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary
[**getSearchResultSummaryForReview**](DataprojectApi.md#getSearchResultSummaryForReview) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary
[**nextDocument**](DataprojectApi.md#nextDocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters
[**pdfBinary**](DataprojectApi.md#pdfBinary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary
[**projectTypes**](DataprojectApi.md#projectTypes) | **GET** /api/dataproject/projects/{organisationId} | get Project Types
[**reassignSliceDocument**](DataprojectApi.md#reassignSliceDocument) | **POST** /api/dataproject/reassignslicedoc | 
[**redactedDocument**](DataprojectApi.md#redactedDocument) | **POST** /api/dataproject/redacteddocument | Get Redacted Document
[**removeSliceDocument**](DataprojectApi.md#removeSliceDocument) | **POST** /api/dataproject/removeslicedoc | 
[**resetEvolve**](DataprojectApi.md#resetEvolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application
[**saveProjectDefinition**](DataprojectApi.md#saveProjectDefinition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition
[**setSliceConfig**](DataprojectApi.md#setSliceConfig) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration
[**slicedDocuments**](DataprojectApi.md#slicedDocuments) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters
[**startProject**](DataprojectApi.md#startProject) | **POST** /api/dataproject/startproject | 
[**updateDocumentStatus**](DataprojectApi.md#updateDocumentStatus) | **POST** /api/dataproject/updatedocstatus | Update document status
[**updateRedactions**](DataprojectApi.md#updateRedactions) | **POST** /api/dataproject/updateredactions | Update document redactions


<a id="addComment"></a>
# **addComment**
> kotlin.String addComment(sessionId, cmNewComment)

Create Comment

Adds a comment with the given level and ids

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmNewComment : CMNewComment =  // CMNewComment | 
try {
    val result : kotlin.String = apiInstance.addComment(sessionId, cmNewComment)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#addComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#addComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmNewComment** | [**CMNewComment**](CMNewComment.md)|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="allTasks"></a>
# **allTasks**
> CMPagedQueueItems allTasks(sessionId, cmQueueFilter)

get Running Projects

Get the list of running projects

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmQueueFilter : CMQueueFilter =  // CMQueueFilter | 
try {
    val result : CMPagedQueueItems = apiInstance.allTasks(sessionId, cmQueueFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#allTasks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#allTasks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmQueueFilter** | [**CMQueueFilter**](CMQueueFilter.md)|  |

### Return type

[**CMPagedQueueItems**](CMPagedQueueItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="changeTaskPhase"></a>
# **changeTaskPhase**
> kotlin.String changeTaskPhase(sessionId, cmChangeTaskPhase)

Change Task Phase

Notifies Workflow engine that a task changed it&#39;s status and passes results in

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmChangeTaskPhase : CMChangeTaskPhase =  // CMChangeTaskPhase | 
try {
    val result : kotlin.String = apiInstance.changeTaskPhase(sessionId, cmChangeTaskPhase)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#changeTaskPhase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#changeTaskPhase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmChangeTaskPhase** | [**CMChangeTaskPhase**](CMChangeTaskPhase.md)|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="claimDocument"></a>
# **claimDocument**
> ReturnedDocument claimDocument(sessionId, cmClaimDocument)

Claim sliced document

Claim sliced document for signed in user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmClaimDocument : CMClaimDocument =  // CMClaimDocument | 
try {
    val result : ReturnedDocument = apiInstance.claimDocument(sessionId, cmClaimDocument)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#claimDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#claimDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmClaimDocument** | [**CMClaimDocument**](CMClaimDocument.md)|  |

### Return type

[**ReturnedDocument**](ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerStatus"></a>
# **crawlerStatus**
> CMCrawlerStatusTask crawlerStatus(organisationId, taskId, sessionId)

get Crawler Status

Get the crawler status for the given task id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val taskId : kotlin.String = taskId_example // kotlin.String | the id of the task
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMCrawlerStatusTask = apiInstance.crawlerStatus(organisationId, taskId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#crawlerStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#crawlerStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **taskId** | **kotlin.String**| the id of the task |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMCrawlerStatusTask**](CMCrawlerStatusTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documentsByTokens"></a>
# **documentsByTokens**
> CMPagedProjectDocuments documentsByTokens(sessionId, cmDocumentsByToken)

Returns document list for tokens

Returns paged list of documents for the given set of query tokens

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentsByToken : CMDocumentsByToken =  // CMDocumentsByToken | 
try {
    val result : CMPagedProjectDocuments = apiInstance.documentsByTokens(sessionId, cmDocumentsByToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#documentsByTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#documentsByTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentsByToken** | [**CMDocumentsByToken**](CMDocumentsByToken.md)|  |

### Return type

[**CMPagedProjectDocuments**](CMPagedProjectDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="filteredComments"></a>
# **filteredComments**
> kotlin.collections.List&lt;CMRecordedComment&gt; filteredComments(sessionId, cmCommentFilter)

Retrieve Comments

Retrieves the list of comments for the passed in Filter

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmCommentFilter : CMCommentFilter =  // CMCommentFilter | 
try {
    val result : kotlin.collections.List<CMRecordedComment> = apiInstance.filteredComments(sessionId, cmCommentFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#filteredComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#filteredComments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmCommentFilter** | [**CMCommentFilter**](CMCommentFilter.md)|  |

### Return type

[**kotlin.collections.List&lt;CMRecordedComment&gt;**](CMRecordedComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getDocumentRedactionInfo"></a>
# **getDocumentRedactionInfo**
> kotlin.collections.List&lt;LocatedRedaction&gt; getDocumentRedactionInfo(organisationId, sliceId, documentKey, sessionId)

Get Document Redaction info

Get list of all identified potential Redaction locations for the document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val sliceId : kotlin.String = sliceId_example // kotlin.String | the id of the slice
val documentKey : kotlin.String = documentKey_example // kotlin.String | the document key of the document to be redacted
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<LocatedRedaction> = apiInstance.getDocumentRedactionInfo(organisationId, sliceId, documentKey, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#getDocumentRedactionInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#getDocumentRedactionInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **sliceId** | **kotlin.String**| the id of the slice |
 **documentKey** | **kotlin.String**| the document key of the document to be redacted |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.collections.List&lt;LocatedRedaction&gt;**](LocatedRedaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectDefinition"></a>
# **getProjectDefinition**
> CMProjectDefinitionTask getProjectDefinition(organisationId, taskId, sessionId)

get Project Definition

Get the project definition of the project for the given task id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val taskId : kotlin.String = taskId_example // kotlin.String | the id of the task
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMProjectDefinitionTask = apiInstance.getProjectDefinition(organisationId, taskId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#getProjectDefinition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#getProjectDefinition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **taskId** | **kotlin.String**| the id of the task |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMProjectDefinitionTask**](CMProjectDefinitionTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectReview"></a>
# **getProjectReview**
> CMProjectReview getProjectReview(organisationId, projectId, sessionId)

get Project Definition

Get the project review data of the project for the given project id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val projectId : kotlin.String = projectId_example // kotlin.String | the id of the task
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMProjectReview = apiInstance.getProjectReview(organisationId, projectId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#getProjectReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#getProjectReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **projectId** | **kotlin.String**| the id of the task |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMProjectReview**](CMProjectReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectSlice"></a>
# **getProjectSlice**
> kotlin.collections.List&lt;CMProjectSliceTask&gt; getProjectSlice(organisationId, taskId, sessionId)

get project slice

Get the project project slice for the given task id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val taskId : kotlin.String = taskId_example // kotlin.String | the id of the task
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<CMProjectSliceTask> = apiInstance.getProjectSlice(organisationId, taskId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#getProjectSlice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#getProjectSlice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **taskId** | **kotlin.String**| the id of the task |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.collections.List&lt;CMProjectSliceTask&gt;**](CMProjectSliceTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSearchResultSummary"></a>
# **getSearchResultSummary**
> CMSearchResultSummaryTask getSearchResultSummary(organisationId, taskId, sessionId)

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val taskId : kotlin.String = taskId_example // kotlin.String | the id of the task
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMSearchResultSummaryTask = apiInstance.getSearchResultSummary(organisationId, taskId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#getSearchResultSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#getSearchResultSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **taskId** | **kotlin.String**| the id of the task |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMSearchResultSummaryTask**](CMSearchResultSummaryTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSearchResultSummaryForReview"></a>
# **getSearchResultSummaryForReview**
> CMSearchResultSummary getSearchResultSummaryForReview(organisationId, projectId, sessionId)

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val projectId : kotlin.String = projectId_example // kotlin.String | the id of the task
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMSearchResultSummary = apiInstance.getSearchResultSummaryForReview(organisationId, projectId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#getSearchResultSummaryForReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#getSearchResultSummaryForReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **projectId** | **kotlin.String**| the id of the task |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMSearchResultSummary**](CMSearchResultSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="nextDocument"></a>
# **nextDocument**
> CMSlicedDocumentListAndTotals nextDocument(sessionId, cmNextDocument)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmNextDocument : CMNextDocument =  // CMNextDocument | 
try {
    val result : CMSlicedDocumentListAndTotals = apiInstance.nextDocument(sessionId, cmNextDocument)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#nextDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#nextDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmNextDocument** | [**CMNextDocument**](CMNextDocument.md)|  |

### Return type

[**CMSlicedDocumentListAndTotals**](CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pdfBinary"></a>
# **pdfBinary**
> kotlin.Any pdfBinary(organisationId, kbId, url, sessionId)

Binary

Get the original for a document if available by url (latest version)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | a base64 encoded url
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.pdfBinary(organisationId, kbId, url, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#pdfBinary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#pdfBinary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| a base64 encoded url |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="projectTypes"></a>
# **projectTypes**
> kotlin.collections.List&lt;CMProjectInfo&gt; projectTypes(organisationId, sessionId)

get Project Types

Get the list of available project types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<CMProjectInfo> = apiInstance.projectTypes(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#projectTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#projectTypes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.collections.List&lt;CMProjectInfo&gt;**](CMProjectInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reassignSliceDocument"></a>
# **reassignSliceDocument**
> kotlin.Any reassignSliceDocument(sessionId, cmReassignSliceDocument)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmReassignSliceDocument : CMReassignSliceDocument =  // CMReassignSliceDocument | 
try {
    val result : kotlin.Any = apiInstance.reassignSliceDocument(sessionId, cmReassignSliceDocument)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#reassignSliceDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#reassignSliceDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmReassignSliceDocument** | [**CMReassignSliceDocument**](CMReassignSliceDocument.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="redactedDocument"></a>
# **redactedDocument**
> ReturnedDocument redactedDocument(sessionId, cmRedactionDetails)

Get Redacted Document

Retrieves the redacted document binary

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmRedactionDetails : CMRedactionDetails =  // CMRedactionDetails | 
try {
    val result : ReturnedDocument = apiInstance.redactedDocument(sessionId, cmRedactionDetails)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#redactedDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#redactedDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmRedactionDetails** | [**CMRedactionDetails**](CMRedactionDetails.md)|  |

### Return type

[**ReturnedDocument**](ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="removeSliceDocument"></a>
# **removeSliceDocument**
> kotlin.Any removeSliceDocument(sessionId, cmRemoveSliceDocument)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmRemoveSliceDocument : CMRemoveSliceDocument =  // CMRemoveSliceDocument | 
try {
    val result : kotlin.Any = apiInstance.removeSliceDocument(sessionId, cmRemoveSliceDocument)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#removeSliceDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#removeSliceDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmRemoveSliceDocument** | [**CMRemoveSliceDocument**](CMRemoveSliceDocument.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="resetEvolve"></a>
# **resetEvolve**
> kotlin.String resetEvolve(organisationId, sessionId)

Reset Evolve Application

Fully resets Evolve to an empty system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | a valid SimSage Organisation id.
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.String = apiInstance.resetEvolve(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#resetEvolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#resetEvolve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| a valid SimSage Organisation id. |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="saveProjectDefinition"></a>
# **saveProjectDefinition**
> CMCreatedProject saveProjectDefinition(sessionId, cmProjectDefinition)

Inserts/Updates a project definition

Inserts/Updates the details for a project definition

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmProjectDefinition : CMProjectDefinition =  // CMProjectDefinition | 
try {
    val result : CMCreatedProject = apiInstance.saveProjectDefinition(sessionId, cmProjectDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#saveProjectDefinition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#saveProjectDefinition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmProjectDefinition** | [**CMProjectDefinition**](CMProjectDefinition.md)|  |

### Return type

[**CMCreatedProject**](CMCreatedProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="setSliceConfig"></a>
# **setSliceConfig**
> kotlin.String setSliceConfig(sessionId, cmSetSliceDefinitions)

Set Slice configuration

Saves/updates the slices configured for a running project

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSetSliceDefinitions : CMSetSliceDefinitions =  // CMSetSliceDefinitions | 
try {
    val result : kotlin.String = apiInstance.setSliceConfig(sessionId, cmSetSliceDefinitions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#setSliceConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#setSliceConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSetSliceDefinitions** | [**CMSetSliceDefinitions**](CMSetSliceDefinitions.md)|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="slicedDocuments"></a>
# **slicedDocuments**
> CMSlicedDocumentListAndTotals slicedDocuments(sessionId, cmSlicedDocumentRequest)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSlicedDocumentRequest : CMSlicedDocumentRequest =  // CMSlicedDocumentRequest | 
try {
    val result : CMSlicedDocumentListAndTotals = apiInstance.slicedDocuments(sessionId, cmSlicedDocumentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#slicedDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#slicedDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSlicedDocumentRequest** | [**CMSlicedDocumentRequest**](CMSlicedDocumentRequest.md)|  |

### Return type

[**CMSlicedDocumentListAndTotals**](CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="startProject"></a>
# **startProject**
> kotlin.Any startProject(sessionId, cmStartProject)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmStartProject : CMStartProject =  // CMStartProject | 
try {
    val result : kotlin.Any = apiInstance.startProject(sessionId, cmStartProject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#startProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#startProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmStartProject** | [**CMStartProject**](CMStartProject.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="updateDocumentStatus"></a>
# **updateDocumentStatus**
> kotlin.String updateDocumentStatus(sessionId, cmUpdateDocumentStatus)

Update document status

Updates the status applied to a slice document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmUpdateDocumentStatus : CMUpdateDocumentStatus =  // CMUpdateDocumentStatus | 
try {
    val result : kotlin.String = apiInstance.updateDocumentStatus(sessionId, cmUpdateDocumentStatus)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#updateDocumentStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#updateDocumentStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmUpdateDocumentStatus** | [**CMUpdateDocumentStatus**](CMUpdateDocumentStatus.md)|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateRedactions"></a>
# **updateRedactions**
> kotlin.String updateRedactions(sessionId, cmUpdateRedactions)

Update document redactions

Updates the redactions applied to a document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataprojectApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmUpdateRedactions : CMUpdateRedactions =  // CMUpdateRedactions | 
try {
    val result : kotlin.String = apiInstance.updateRedactions(sessionId, cmUpdateRedactions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataprojectApi#updateRedactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataprojectApi#updateRedactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmUpdateRedactions** | [**CMUpdateRedactions**](CMUpdateRedactions.md)|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

