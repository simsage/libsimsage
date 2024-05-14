# DataprojectApi

All URIs are relative to *https://training.simsage.ai*

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
| [**getProjectReview**](DataprojectApi.md#getProjectReview) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition |
| [**getProjectSlice**](DataprojectApi.md#getProjectSlice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice |
| [**getSearchResultSummary**](DataprojectApi.md#getSearchResultSummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary |
| [**getSearchResultSummaryForReview**](DataprojectApi.md#getSearchResultSummaryForReview) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary |
| [**nextDocument**](DataprojectApi.md#nextDocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters |
| [**pdfBinary**](DataprojectApi.md#pdfBinary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary |
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


<a name="addComment"></a>
# **addComment**
> String addComment(session-id, CMNewComment)

Create Comment

    Adds a comment with the given level and ids

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMNewComment** | [**CMNewComment**](../Models/CMNewComment.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="allTasks"></a>
# **allTasks**
> CMPagedQueueItems allTasks(session-id, CMQueueFilter)

get Running Projects

    Get the list of running projects

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMQueueFilter** | [**CMQueueFilter**](../Models/CMQueueFilter.md)|  | |

### Return type

[**CMPagedQueueItems**](../Models/CMPagedQueueItems.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="changeTaskPhase"></a>
# **changeTaskPhase**
> String changeTaskPhase(session-id, CMChangeTaskPhase)

Change Task Phase

    Notifies Workflow engine that a task changed it&#39;s status and passes results in

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMChangeTaskPhase** | [**CMChangeTaskPhase**](../Models/CMChangeTaskPhase.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="claimDocument"></a>
# **claimDocument**
> ReturnedDocument claimDocument(session-id, CMClaimDocument)

Claim sliced document

    Claim sliced document for signed in user

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMClaimDocument** | [**CMClaimDocument**](../Models/CMClaimDocument.md)|  | |

### Return type

[**ReturnedDocument**](../Models/ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerStatus"></a>
# **crawlerStatus**
> CMCrawlerStatusTask crawlerStatus(organisationId, taskId, session-id)

get Crawler Status

    Get the crawler status for the given task id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **taskId** | **String**| the id of the task | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMCrawlerStatusTask**](../Models/CMCrawlerStatusTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="documentsByTokens"></a>
# **documentsByTokens**
> CMPagedProjectDocuments documentsByTokens(session-id, CMDocumentsByToken)

Returns document list for tokens

    Returns paged list of documents for the given set of query tokens

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentsByToken** | [**CMDocumentsByToken**](../Models/CMDocumentsByToken.md)|  | |

### Return type

[**CMPagedProjectDocuments**](../Models/CMPagedProjectDocuments.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="filteredComments"></a>
# **filteredComments**
> List filteredComments(session-id, CMCommentFilter)

Retrieve Comments

    Retrieves the list of comments for the passed in Filter

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMCommentFilter** | [**CMCommentFilter**](../Models/CMCommentFilter.md)|  | |

### Return type

[**List**](../Models/CMRecordedComment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getDocumentRedactionInfo"></a>
# **getDocumentRedactionInfo**
> List getDocumentRedactionInfo(organisationId, sliceId, documentKey, session-id)

Get Document Redaction info

    Get list of all identified potential Redaction locations for the document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **sliceId** | **String**| the id of the slice | [default to null] |
| **documentKey** | **String**| the document key of the document to be redacted | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**List**](../Models/LocatedRedaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getProjectDefinition"></a>
# **getProjectDefinition**
> CMProjectDefinitionTask getProjectDefinition(organisationId, taskId, session-id)

get Project Definition

    Get the project definition of the project for the given task id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **taskId** | **String**| the id of the task | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMProjectDefinitionTask**](../Models/CMProjectDefinitionTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getProjectReview"></a>
# **getProjectReview**
> CMProjectReview getProjectReview(organisationId, projectId, session-id)

get Project Definition

    Get the project review data of the project for the given project id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **projectId** | **String**| the id of the task | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMProjectReview**](../Models/CMProjectReview.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getProjectSlice"></a>
# **getProjectSlice**
> List getProjectSlice(organisationId, taskId, session-id)

get project slice

    Get the project project slice for the given task id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **taskId** | **String**| the id of the task | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**List**](../Models/CMProjectSliceTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSearchResultSummary"></a>
# **getSearchResultSummary**
> CMSearchResultSummaryTask getSearchResultSummary(organisationId, taskId, session-id)

get Search Result Summary

    Get the summary information for the search results of a given project by task id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **taskId** | **String**| the id of the task | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMSearchResultSummaryTask**](../Models/CMSearchResultSummaryTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSearchResultSummaryForReview"></a>
# **getSearchResultSummaryForReview**
> CMSearchResultSummary getSearchResultSummaryForReview(organisationId, projectId, session-id)

get Search Result Summary

    Get the summary information for the search results of a given project by task id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **projectId** | **String**| the id of the task | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMSearchResultSummary**](../Models/CMSearchResultSummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="nextDocument"></a>
# **nextDocument**
> CMSlicedDocumentListAndTotals nextDocument(session-id, CMNextDocument)

Document list for given slice and filters

    Returns paged list of documents for the passed in slice and filters as well as totals

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMNextDocument** | [**CMNextDocument**](../Models/CMNextDocument.md)|  | |

### Return type

[**CMSlicedDocumentListAndTotals**](../Models/CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="pdfBinary"></a>
# **pdfBinary**
> Object pdfBinary(organisationId, kbId, url, session-id)

Binary

    Get the original for a document if available by url (latest version)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| a base64 encoded url | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [optional] [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

<a name="projectTypes"></a>
# **projectTypes**
> List projectTypes(organisationId, session-id)

get Project Types

    Get the list of available project types

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**List**](../Models/CMProjectInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="reassignSliceDocument"></a>
# **reassignSliceDocument**
> Object reassignSliceDocument(session-id, CMReassignSliceDocument)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMReassignSliceDocument** | [**CMReassignSliceDocument**](../Models/CMReassignSliceDocument.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="redactedDocument"></a>
# **redactedDocument**
> ReturnedDocument redactedDocument(session-id, CMRedactionDetails)

Get Redacted Document

    Retrieves the redacted document binary

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMRedactionDetails** | [**CMRedactionDetails**](../Models/CMRedactionDetails.md)|  | |

### Return type

[**ReturnedDocument**](../Models/ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="removeSliceDocument"></a>
# **removeSliceDocument**
> Object removeSliceDocument(session-id, CMRemoveSliceDocument)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMRemoveSliceDocument** | [**CMRemoveSliceDocument**](../Models/CMRemoveSliceDocument.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="resetEvolve"></a>
# **resetEvolve**
> String resetEvolve(organisation-id, session-id)

Reset Evolve Application

    Fully resets Evolve to an empty system

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisation-id** | **String**| a valid SimSage Organisation id. | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="saveProjectDefinition"></a>
# **saveProjectDefinition**
> CMCreatedProject saveProjectDefinition(session-id, CMProjectDefinition)

Inserts/Updates a project definition

    Inserts/Updates the details for a project definition

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMProjectDefinition** | [**CMProjectDefinition**](../Models/CMProjectDefinition.md)|  | |

### Return type

[**CMCreatedProject**](../Models/CMCreatedProject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="setSliceConfig"></a>
# **setSliceConfig**
> String setSliceConfig(session-id, CMSetSliceDefinitions)

Set Slice configuration

    Saves/updates the slices configured for a running project

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSetSliceDefinitions** | [**CMSetSliceDefinitions**](../Models/CMSetSliceDefinitions.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="slicedDocuments"></a>
# **slicedDocuments**
> CMSlicedDocumentListAndTotals slicedDocuments(session-id, CMSlicedDocumentRequest)

Document list for given slice and filters

    Returns paged list of documents for the passed in slice and filters as well as totals

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSlicedDocumentRequest** | [**CMSlicedDocumentRequest**](../Models/CMSlicedDocumentRequest.md)|  | |

### Return type

[**CMSlicedDocumentListAndTotals**](../Models/CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="startProject"></a>
# **startProject**
> Object startProject(session-id, CMStartProject)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMStartProject** | [**CMStartProject**](../Models/CMStartProject.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="updateDocumentStatus"></a>
# **updateDocumentStatus**
> String updateDocumentStatus(session-id, CMUpdateDocumentStatus)

Update document status

    Updates the status applied to a slice document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMUpdateDocumentStatus** | [**CMUpdateDocumentStatus**](../Models/CMUpdateDocumentStatus.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateRedactions"></a>
# **updateRedactions**
> String updateRedactions(session-id, CMUpdateRedactions)

Update document redactions

    Updates the redactions applied to a document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMUpdateRedactions** | [**CMUpdateRedactions**](../Models/CMUpdateRedactions.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

