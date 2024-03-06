# Org.OpenAPITools.Api.DataprojectApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AddComment**](DataprojectApi.md#addcomment) | **POST** /api/dataproject/comment | Create Comment |
| [**AllTasks**](DataprojectApi.md#alltasks) | **POST** /api/dataproject/runningprojects | get Running Projects |
| [**ChangeTaskPhase**](DataprojectApi.md#changetaskphase) | **POST** /api/dataproject/changetaskphase | Change Task Phase |
| [**ClaimDocument**](DataprojectApi.md#claimdocument) | **POST** /api/dataproject/claimdocument | Claim sliced document |
| [**CrawlerStatus**](DataprojectApi.md#crawlerstatus) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status |
| [**DocumentsByTokens**](DataprojectApi.md#documentsbytokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens |
| [**FilteredComments**](DataprojectApi.md#filteredcomments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments |
| [**GetDocumentRedactionInfo**](DataprojectApi.md#getdocumentredactioninfo) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info |
| [**GetProjectDefinition**](DataprojectApi.md#getprojectdefinition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition |
| [**GetProjectReview**](DataprojectApi.md#getprojectreview) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition |
| [**GetProjectSlice**](DataprojectApi.md#getprojectslice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice |
| [**GetSearchResultSummary**](DataprojectApi.md#getsearchresultsummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary |
| [**GetSearchResultSummaryForReview**](DataprojectApi.md#getsearchresultsummaryforreview) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary |
| [**NextDocument**](DataprojectApi.md#nextdocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters |
| [**PdfBinary**](DataprojectApi.md#pdfbinary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary |
| [**ProjectTypes**](DataprojectApi.md#projecttypes) | **GET** /api/dataproject/projects/{organisationId} | get Project Types |
| [**ReassignSliceDocument**](DataprojectApi.md#reassignslicedocument) | **POST** /api/dataproject/reassignslicedoc |  |
| [**RedactedDocument**](DataprojectApi.md#redacteddocument) | **POST** /api/dataproject/redacteddocument | Get Redacted Document |
| [**RemoveSliceDocument**](DataprojectApi.md#removeslicedocument) | **POST** /api/dataproject/removeslicedoc |  |
| [**ResetEvolve**](DataprojectApi.md#resetevolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application |
| [**SaveProjectDefinition**](DataprojectApi.md#saveprojectdefinition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition |
| [**SetSliceConfig**](DataprojectApi.md#setsliceconfig) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration |
| [**SlicedDocuments**](DataprojectApi.md#sliceddocuments) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters |
| [**StartProject**](DataprojectApi.md#startproject) | **POST** /api/dataproject/startproject |  |
| [**UpdateDocumentStatus**](DataprojectApi.md#updatedocumentstatus) | **POST** /api/dataproject/updatedocstatus | Update document status |
| [**UpdateRedactions**](DataprojectApi.md#updateredactions) | **POST** /api/dataproject/updateredactions | Update document redactions |

<a id="addcomment"></a>
# **AddComment**
> string AddComment (string sessionId, CMNewComment cMNewComment)

Create Comment

Adds a comment with the given level and ids

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddCommentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMNewComment = new CMNewComment(); // CMNewComment | 

            try
            {
                // Create Comment
                string result = apiInstance.AddComment(sessionId, cMNewComment);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.AddComment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AddCommentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create Comment
    ApiResponse<string> response = apiInstance.AddCommentWithHttpInfo(sessionId, cMNewComment);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.AddCommentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMNewComment** | [**CMNewComment**](CMNewComment.md) |  |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Could not add comment. |  -  |
| **200** | Create Comment Status OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="alltasks"></a>
# **AllTasks**
> CMPagedQueueItems AllTasks (string sessionId, CMQueueFilter cMQueueFilter)

get Running Projects

Get the list of running projects

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AllTasksExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMQueueFilter = new CMQueueFilter(); // CMQueueFilter | 

            try
            {
                // get Running Projects
                CMPagedQueueItems result = apiInstance.AllTasks(sessionId, cMQueueFilter);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.AllTasks: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AllTasksWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Running Projects
    ApiResponse<CMPagedQueueItems> response = apiInstance.AllTasksWithHttpInfo(sessionId, cMQueueFilter);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.AllTasksWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMQueueFilter** | [**CMQueueFilter**](CMQueueFilter.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="changetaskphase"></a>
# **ChangeTaskPhase**
> string ChangeTaskPhase (string sessionId, CMChangeTaskPhase cMChangeTaskPhase)

Change Task Phase

Notifies Workflow engine that a task changed it's status and passes results in

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ChangeTaskPhaseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMChangeTaskPhase = new CMChangeTaskPhase(); // CMChangeTaskPhase | 

            try
            {
                // Change Task Phase
                string result = apiInstance.ChangeTaskPhase(sessionId, cMChangeTaskPhase);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.ChangeTaskPhase: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ChangeTaskPhaseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Change Task Phase
    ApiResponse<string> response = apiInstance.ChangeTaskPhaseWithHttpInfo(sessionId, cMChangeTaskPhase);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.ChangeTaskPhaseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMChangeTaskPhase** | [**CMChangeTaskPhase**](CMChangeTaskPhase.md) |  |  |

### Return type

**string**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="claimdocument"></a>
# **ClaimDocument**
> ReturnedDocument ClaimDocument (string sessionId, CMClaimDocument cMClaimDocument)

Claim sliced document

Claim sliced document for signed in user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ClaimDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMClaimDocument = new CMClaimDocument(); // CMClaimDocument | 

            try
            {
                // Claim sliced document
                ReturnedDocument result = apiInstance.ClaimDocument(sessionId, cMClaimDocument);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.ClaimDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ClaimDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Claim sliced document
    ApiResponse<ReturnedDocument> response = apiInstance.ClaimDocumentWithHttpInfo(sessionId, cMClaimDocument);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.ClaimDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMClaimDocument** | [**CMClaimDocument**](CMClaimDocument.md) |  |  |

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
| **500** | could not retrieve redacted document. |  -  |
| **200** | Wrapper containing the document binary |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="crawlerstatus"></a>
# **CrawlerStatus**
> CMCrawlerStatusTask CrawlerStatus (string organisationId, string taskId, string sessionId)

get Crawler Status

Get the crawler status for the given task id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CrawlerStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var taskId = "taskId_example";  // string | the id of the task
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get Crawler Status
                CMCrawlerStatusTask result = apiInstance.CrawlerStatus(organisationId, taskId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.CrawlerStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CrawlerStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Crawler Status
    ApiResponse<CMCrawlerStatusTask> response = apiInstance.CrawlerStatusWithHttpInfo(organisationId, taskId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.CrawlerStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **taskId** | **string** | the id of the task |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="documentsbytokens"></a>
# **DocumentsByTokens**
> CMPagedProjectDocuments DocumentsByTokens (string sessionId, CMDocumentsByToken cMDocumentsByToken)

Returns document list for tokens

Returns paged list of documents for the given set of query tokens

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DocumentsByTokensExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentsByToken = new CMDocumentsByToken(); // CMDocumentsByToken | 

            try
            {
                // Returns document list for tokens
                CMPagedProjectDocuments result = apiInstance.DocumentsByTokens(sessionId, cMDocumentsByToken);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.DocumentsByTokens: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DocumentsByTokensWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns document list for tokens
    ApiResponse<CMPagedProjectDocuments> response = apiInstance.DocumentsByTokensWithHttpInfo(sessionId, cMDocumentsByToken);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.DocumentsByTokensWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentsByToken** | [**CMDocumentsByToken**](CMDocumentsByToken.md) |  |  |

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
| **500** | could not retrieve document list. |  -  |
| **200** | returns paged list of documents for the given set of query tokens |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="filteredcomments"></a>
# **FilteredComments**
> List&lt;CMRecordedComment&gt; FilteredComments (string sessionId, CMCommentFilter cMCommentFilter)

Retrieve Comments

Retrieves the list of comments for the passed in Filter

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FilteredCommentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMCommentFilter = new CMCommentFilter(); // CMCommentFilter | 

            try
            {
                // Retrieve Comments
                List<CMRecordedComment> result = apiInstance.FilteredComments(sessionId, cMCommentFilter);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.FilteredComments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FilteredCommentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve Comments
    ApiResponse<List<CMRecordedComment>> response = apiInstance.FilteredCommentsWithHttpInfo(sessionId, cMCommentFilter);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.FilteredCommentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMCommentFilter** | [**CMCommentFilter**](CMCommentFilter.md) |  |  |

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
| **500** | Could not get comments. |  -  |
| **200** | Create Comment Status OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getdocumentredactioninfo"></a>
# **GetDocumentRedactionInfo**
> List&lt;LocatedRedaction&gt; GetDocumentRedactionInfo (string organisationId, string sliceId, string documentKey, string sessionId)

Get Document Redaction info

Get list of all identified potential Redaction locations for the document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDocumentRedactionInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var sliceId = "sliceId_example";  // string | the id of the slice
            var documentKey = "documentKey_example";  // string | the document key of the document to be redacted
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get Document Redaction info
                List<LocatedRedaction> result = apiInstance.GetDocumentRedactionInfo(organisationId, sliceId, documentKey, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.GetDocumentRedactionInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDocumentRedactionInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Document Redaction info
    ApiResponse<List<LocatedRedaction>> response = apiInstance.GetDocumentRedactionInfoWithHttpInfo(organisationId, sliceId, documentKey, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.GetDocumentRedactionInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **sliceId** | **string** | the id of the slice |  |
| **documentKey** | **string** | the document key of the document to be redacted |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getprojectdefinition"></a>
# **GetProjectDefinition**
> CMProjectDefinitionTask GetProjectDefinition (string organisationId, string taskId, string sessionId)

get Project Definition

Get the project definition of the project for the given task id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetProjectDefinitionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var taskId = "taskId_example";  // string | the id of the task
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get Project Definition
                CMProjectDefinitionTask result = apiInstance.GetProjectDefinition(organisationId, taskId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.GetProjectDefinition: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetProjectDefinitionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Project Definition
    ApiResponse<CMProjectDefinitionTask> response = apiInstance.GetProjectDefinitionWithHttpInfo(organisationId, taskId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.GetProjectDefinitionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **taskId** | **string** | the id of the task |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **500** | could not get project definition. |  -  |
| **200** | project definition response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getprojectreview"></a>
# **GetProjectReview**
> CMProjectReview GetProjectReview (string organisationId, string projectId, string sessionId)

get Project Definition

Get the project review data of the project for the given project id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetProjectReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var projectId = "projectId_example";  // string | the id of the task
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get Project Definition
                CMProjectReview result = apiInstance.GetProjectReview(organisationId, projectId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.GetProjectReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetProjectReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Project Definition
    ApiResponse<CMProjectReview> response = apiInstance.GetProjectReviewWithHttpInfo(organisationId, projectId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.GetProjectReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **projectId** | **string** | the id of the task |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

### Return type

[**CMProjectReview**](CMProjectReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | project review response |  -  |
| **500** | could not get project review. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getprojectslice"></a>
# **GetProjectSlice**
> List&lt;CMProjectSliceTask&gt; GetProjectSlice (string organisationId, string taskId, string sessionId)

get project slice

Get the project project slice for the given task id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetProjectSliceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var taskId = "taskId_example";  // string | the id of the task
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get project slice
                List<CMProjectSliceTask> result = apiInstance.GetProjectSlice(organisationId, taskId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.GetProjectSlice: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetProjectSliceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get project slice
    ApiResponse<List<CMProjectSliceTask>> response = apiInstance.GetProjectSliceWithHttpInfo(organisationId, taskId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.GetProjectSliceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **taskId** | **string** | the id of the task |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **500** | could not retrieve project slice. |  -  |
| **200** | Project slice data |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsearchresultsummary"></a>
# **GetSearchResultSummary**
> CMSearchResultSummaryTask GetSearchResultSummary (string organisationId, string taskId, string sessionId)

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSearchResultSummaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var taskId = "taskId_example";  // string | the id of the task
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get Search Result Summary
                CMSearchResultSummaryTask result = apiInstance.GetSearchResultSummary(organisationId, taskId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.GetSearchResultSummary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSearchResultSummaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Search Result Summary
    ApiResponse<CMSearchResultSummaryTask> response = apiInstance.GetSearchResultSummaryWithHttpInfo(organisationId, taskId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.GetSearchResultSummaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **taskId** | **string** | the id of the task |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsearchresultsummaryforreview"></a>
# **GetSearchResultSummaryForReview**
> CMSearchResultSummary GetSearchResultSummaryForReview (string organisationId, string projectId, string sessionId)

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSearchResultSummaryForReviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var projectId = "projectId_example";  // string | the id of the task
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get Search Result Summary
                CMSearchResultSummary result = apiInstance.GetSearchResultSummaryForReview(organisationId, projectId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.GetSearchResultSummaryForReview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSearchResultSummaryForReviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Search Result Summary
    ApiResponse<CMSearchResultSummary> response = apiInstance.GetSearchResultSummaryForReviewWithHttpInfo(organisationId, projectId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.GetSearchResultSummaryForReviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **projectId** | **string** | the id of the task |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

### Return type

[**CMSearchResultSummary**](CMSearchResultSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | search result summary response |  -  |
| **500** | could not get search result summary. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="nextdocument"></a>
# **NextDocument**
> CMSlicedDocumentListAndTotals NextDocument (string sessionId, CMNextDocument cMNextDocument)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class NextDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMNextDocument = new CMNextDocument(); // CMNextDocument | 

            try
            {
                // Document list for given slice and filters
                CMSlicedDocumentListAndTotals result = apiInstance.NextDocument(sessionId, cMNextDocument);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.NextDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the NextDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Document list for given slice and filters
    ApiResponse<CMSlicedDocumentListAndTotals> response = apiInstance.NextDocumentWithHttpInfo(sessionId, cMNextDocument);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.NextDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMNextDocument** | [**CMNextDocument**](CMNextDocument.md) |  |  |

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
| **200** | Paged list of documents for the passed in slice and filters as well as totals |  -  |
| **500** | could not retrieve document list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pdfbinary"></a>
# **PdfBinary**
> Object PdfBinary (string organisationId, string kbId, string url, string? sessionId = null)

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
    public class PdfBinaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | a base64 encoded url
            var sessionId = "sessionId_example";  // string? | a valid SimSage Session id. (optional) 

            try
            {
                // Binary
                Object result = apiInstance.PdfBinary(organisationId, kbId, url, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.PdfBinary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PdfBinaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Binary
    ApiResponse<Object> response = apiInstance.PdfBinaryWithHttpInfo(organisationId, kbId, url, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.PdfBinaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | a base64 encoded url |  |
| **sessionId** | **string?** | a valid SimSage Session id. | [optional]  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="projecttypes"></a>
# **ProjectTypes**
> List&lt;CMProjectInfo&gt; ProjectTypes (string organisationId, string sessionId)

get Project Types

Get the list of available project types

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ProjectTypesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // get Project Types
                List<CMProjectInfo> result = apiInstance.ProjectTypes(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.ProjectTypes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ProjectTypesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Project Types
    ApiResponse<List<CMProjectInfo>> response = apiInstance.ProjectTypesWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.ProjectTypesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="reassignslicedocument"></a>
# **ReassignSliceDocument**
> Object ReassignSliceDocument (string sessionId, CMReassignSliceDocument cMReassignSliceDocument)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ReassignSliceDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMReassignSliceDocument = new CMReassignSliceDocument(); // CMReassignSliceDocument | 

            try
            {
                Object result = apiInstance.ReassignSliceDocument(sessionId, cMReassignSliceDocument);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.ReassignSliceDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReassignSliceDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.ReassignSliceDocumentWithHttpInfo(sessionId, cMReassignSliceDocument);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.ReassignSliceDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMReassignSliceDocument** | [**CMReassignSliceDocument**](CMReassignSliceDocument.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="redacteddocument"></a>
# **RedactedDocument**
> ReturnedDocument RedactedDocument (string sessionId, CMRedactionDetails cMRedactionDetails)

Get Redacted Document

Retrieves the redacted document binary

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RedactedDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMRedactionDetails = new CMRedactionDetails(); // CMRedactionDetails | 

            try
            {
                // Get Redacted Document
                ReturnedDocument result = apiInstance.RedactedDocument(sessionId, cMRedactionDetails);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.RedactedDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RedactedDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Redacted Document
    ApiResponse<ReturnedDocument> response = apiInstance.RedactedDocumentWithHttpInfo(sessionId, cMRedactionDetails);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.RedactedDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMRedactionDetails** | [**CMRedactionDetails**](CMRedactionDetails.md) |  |  |

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
| **500** | could not retrieve redacted document. |  -  |
| **200** | Wrapper containing the document binary |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="removeslicedocument"></a>
# **RemoveSliceDocument**
> Object RemoveSliceDocument (string sessionId, CMRemoveSliceDocument cMRemoveSliceDocument)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RemoveSliceDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMRemoveSliceDocument = new CMRemoveSliceDocument(); // CMRemoveSliceDocument | 

            try
            {
                Object result = apiInstance.RemoveSliceDocument(sessionId, cMRemoveSliceDocument);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.RemoveSliceDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RemoveSliceDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.RemoveSliceDocumentWithHttpInfo(sessionId, cMRemoveSliceDocument);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.RemoveSliceDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMRemoveSliceDocument** | [**CMRemoveSliceDocument**](CMRemoveSliceDocument.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="resetevolve"></a>
# **ResetEvolve**
> string ResetEvolve (string organisationId, string sessionId)

Reset Evolve Application

Fully resets Evolve to an empty system

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ResetEvolveExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var organisationId = "organisationId_example";  // string | a valid SimSage Organisation id.
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Reset Evolve Application
                string result = apiInstance.ResetEvolve(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.ResetEvolve: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ResetEvolveWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Reset Evolve Application
    ApiResponse<string> response = apiInstance.ResetEvolveWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.ResetEvolveWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | a valid SimSage Organisation id. |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

### Return type

**string**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="saveprojectdefinition"></a>
# **SaveProjectDefinition**
> CMCreatedProject SaveProjectDefinition (string sessionId, CMProjectDefinition cMProjectDefinition)

Inserts/Updates a project definition

Inserts/Updates the details for a project definition

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveProjectDefinitionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMProjectDefinition = new CMProjectDefinition(); // CMProjectDefinition | 

            try
            {
                // Inserts/Updates a project definition
                CMCreatedProject result = apiInstance.SaveProjectDefinition(sessionId, cMProjectDefinition);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.SaveProjectDefinition: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveProjectDefinitionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Inserts/Updates a project definition
    ApiResponse<CMCreatedProject> response = apiInstance.SaveProjectDefinitionWithHttpInfo(sessionId, cMProjectDefinition);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.SaveProjectDefinitionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMProjectDefinition** | [**CMProjectDefinition**](CMProjectDefinition.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="setsliceconfig"></a>
# **SetSliceConfig**
> string SetSliceConfig (string sessionId, CMSetSliceDefinitions cMSetSliceDefinitions)

Set Slice configuration

Saves/updates the slices configured for a running project

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SetSliceConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSetSliceDefinitions = new CMSetSliceDefinitions(); // CMSetSliceDefinitions | 

            try
            {
                // Set Slice configuration
                string result = apiInstance.SetSliceConfig(sessionId, cMSetSliceDefinitions);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.SetSliceConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SetSliceConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Set Slice configuration
    ApiResponse<string> response = apiInstance.SetSliceConfigWithHttpInfo(sessionId, cMSetSliceDefinitions);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.SetSliceConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSetSliceDefinitions** | [**CMSetSliceDefinitions**](CMSetSliceDefinitions.md) |  |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Slice config OK response |  -  |
| **500** | Could not set Slice configuration. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sliceddocuments"></a>
# **SlicedDocuments**
> CMSlicedDocumentListAndTotals SlicedDocuments (string sessionId, CMSlicedDocumentRequest cMSlicedDocumentRequest)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SlicedDocumentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSlicedDocumentRequest = new CMSlicedDocumentRequest(); // CMSlicedDocumentRequest | 

            try
            {
                // Document list for given slice and filters
                CMSlicedDocumentListAndTotals result = apiInstance.SlicedDocuments(sessionId, cMSlicedDocumentRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.SlicedDocuments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SlicedDocumentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Document list for given slice and filters
    ApiResponse<CMSlicedDocumentListAndTotals> response = apiInstance.SlicedDocumentsWithHttpInfo(sessionId, cMSlicedDocumentRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.SlicedDocumentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSlicedDocumentRequest** | [**CMSlicedDocumentRequest**](CMSlicedDocumentRequest.md) |  |  |

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
| **200** | Paged list of documents for the passed in slice and filters as well as totals |  -  |
| **500** | could not retrieve document list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="startproject"></a>
# **StartProject**
> Object StartProject (string sessionId, CMStartProject cMStartProject)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class StartProjectExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMStartProject = new CMStartProject(); // CMStartProject | 

            try
            {
                Object result = apiInstance.StartProject(sessionId, cMStartProject);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.StartProject: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StartProjectWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.StartProjectWithHttpInfo(sessionId, cMStartProject);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.StartProjectWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMStartProject** | [**CMStartProject**](CMStartProject.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatedocumentstatus"></a>
# **UpdateDocumentStatus**
> string UpdateDocumentStatus (string sessionId, CMUpdateDocumentStatus cMUpdateDocumentStatus)

Update document status

Updates the status applied to a slice document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateDocumentStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMUpdateDocumentStatus = new CMUpdateDocumentStatus(); // CMUpdateDocumentStatus | 

            try
            {
                // Update document status
                string result = apiInstance.UpdateDocumentStatus(sessionId, cMUpdateDocumentStatus);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.UpdateDocumentStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateDocumentStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update document status
    ApiResponse<string> response = apiInstance.UpdateDocumentStatusWithHttpInfo(sessionId, cMUpdateDocumentStatus);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.UpdateDocumentStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMUpdateDocumentStatus** | [**CMUpdateDocumentStatus**](CMUpdateDocumentStatus.md) |  |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Could not update document status. |  -  |
| **200** | Update Document Status OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateredactions"></a>
# **UpdateRedactions**
> string UpdateRedactions (string sessionId, CMUpdateRedactions cMUpdateRedactions)

Update document redactions

Updates the redactions applied to a document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateRedactionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DataprojectApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMUpdateRedactions = new CMUpdateRedactions(); // CMUpdateRedactions | 

            try
            {
                // Update document redactions
                string result = apiInstance.UpdateRedactions(sessionId, cMUpdateRedactions);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DataprojectApi.UpdateRedactions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateRedactionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update document redactions
    ApiResponse<string> response = apiInstance.UpdateRedactionsWithHttpInfo(sessionId, cMUpdateRedactions);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DataprojectApi.UpdateRedactionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMUpdateRedactions** | [**CMUpdateRedactions**](CMUpdateRedactions.md) |  |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not update redactionst. |  -  |
| **200** | Update Redactions OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

