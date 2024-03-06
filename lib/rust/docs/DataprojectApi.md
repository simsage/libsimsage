# \DataprojectApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_comment**](DataprojectApi.md#add_comment) | **POST** /api/dataproject/comment | Create Comment
[**all_tasks**](DataprojectApi.md#all_tasks) | **POST** /api/dataproject/runningprojects | get Running Projects
[**change_task_phase**](DataprojectApi.md#change_task_phase) | **POST** /api/dataproject/changetaskphase | Change Task Phase
[**claim_document**](DataprojectApi.md#claim_document) | **POST** /api/dataproject/claimdocument | Claim sliced document
[**crawler_status**](DataprojectApi.md#crawler_status) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status
[**documents_by_tokens**](DataprojectApi.md#documents_by_tokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens
[**filtered_comments**](DataprojectApi.md#filtered_comments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments
[**get_document_redaction_info**](DataprojectApi.md#get_document_redaction_info) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info
[**get_project_definition**](DataprojectApi.md#get_project_definition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition
[**get_project_review**](DataprojectApi.md#get_project_review) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition
[**get_project_slice**](DataprojectApi.md#get_project_slice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice
[**get_search_result_summary**](DataprojectApi.md#get_search_result_summary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary
[**get_search_result_summary_for_review**](DataprojectApi.md#get_search_result_summary_for_review) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary
[**next_document**](DataprojectApi.md#next_document) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters
[**pdf_binary**](DataprojectApi.md#pdf_binary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary
[**project_types**](DataprojectApi.md#project_types) | **GET** /api/dataproject/projects/{organisationId} | get Project Types
[**reassign_slice_document**](DataprojectApi.md#reassign_slice_document) | **POST** /api/dataproject/reassignslicedoc | 
[**redacted_document**](DataprojectApi.md#redacted_document) | **POST** /api/dataproject/redacteddocument | Get Redacted Document
[**remove_slice_document**](DataprojectApi.md#remove_slice_document) | **POST** /api/dataproject/removeslicedoc | 
[**reset_evolve**](DataprojectApi.md#reset_evolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application
[**save_project_definition**](DataprojectApi.md#save_project_definition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition
[**set_slice_config**](DataprojectApi.md#set_slice_config) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration
[**sliced_documents**](DataprojectApi.md#sliced_documents) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters
[**start_project**](DataprojectApi.md#start_project) | **POST** /api/dataproject/startproject | 
[**update_document_status**](DataprojectApi.md#update_document_status) | **POST** /api/dataproject/updatedocstatus | Update document status
[**update_redactions**](DataprojectApi.md#update_redactions) | **POST** /api/dataproject/updateredactions | Update document redactions



## add_comment

> String add_comment(session_id, cm_new_comment)
Create Comment

Adds a comment with the given level and ids

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_new_comment** | [**CmNewComment**](CmNewComment.md) |  | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## all_tasks

> crate::models::CmPagedQueueItems all_tasks(session_id, cm_queue_filter)
get Running Projects

Get the list of running projects

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_queue_filter** | [**CmQueueFilter**](CmQueueFilter.md) |  | [required] |

### Return type

[**crate::models::CmPagedQueueItems**](CMPagedQueueItems.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## change_task_phase

> String change_task_phase(session_id, cm_change_task_phase)
Change Task Phase

Notifies Workflow engine that a task changed it's status and passes results in

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_change_task_phase** | [**CmChangeTaskPhase**](CmChangeTaskPhase.md) |  | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## claim_document

> crate::models::ReturnedDocument claim_document(session_id, cm_claim_document)
Claim sliced document

Claim sliced document for signed in user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_claim_document** | [**CmClaimDocument**](CmClaimDocument.md) |  | [required] |

### Return type

[**crate::models::ReturnedDocument**](ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_status

> crate::models::CmCrawlerStatusTask crawler_status(organisation_id, task_id, session_id)
get Crawler Status

Get the crawler status for the given task id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**task_id** | **String** | the id of the task | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmCrawlerStatusTask**](CMCrawlerStatusTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## documents_by_tokens

> crate::models::CmPagedProjectDocuments documents_by_tokens(session_id, cm_documents_by_token)
Returns document list for tokens

Returns paged list of documents for the given set of query tokens

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_documents_by_token** | [**CmDocumentsByToken**](CmDocumentsByToken.md) |  | [required] |

### Return type

[**crate::models::CmPagedProjectDocuments**](CMPagedProjectDocuments.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## filtered_comments

> Vec<crate::models::CmRecordedComment> filtered_comments(session_id, cm_comment_filter)
Retrieve Comments

Retrieves the list of comments for the passed in Filter

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_comment_filter** | [**CmCommentFilter**](CmCommentFilter.md) |  | [required] |

### Return type

[**Vec<crate::models::CmRecordedComment>**](CMRecordedComment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_document_redaction_info

> Vec<crate::models::LocatedRedaction> get_document_redaction_info(organisation_id, slice_id, document_key, session_id)
Get Document Redaction info

Get list of all identified potential Redaction locations for the document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**slice_id** | **String** | the id of the slice | [required] |
**document_key** | **String** | the document key of the document to be redacted | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**Vec<crate::models::LocatedRedaction>**](LocatedRedaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_project_definition

> crate::models::CmProjectDefinitionTask get_project_definition(organisation_id, task_id, session_id)
get Project Definition

Get the project definition of the project for the given task id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**task_id** | **String** | the id of the task | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmProjectDefinitionTask**](CMProjectDefinitionTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_project_review

> crate::models::CmProjectReview get_project_review(organisation_id, project_id, session_id)
get Project Definition

Get the project review data of the project for the given project id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**project_id** | **String** | the id of the task | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmProjectReview**](CMProjectReview.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_project_slice

> Vec<crate::models::CmProjectSliceTask> get_project_slice(organisation_id, task_id, session_id)
get project slice

Get the project project slice for the given task id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**task_id** | **String** | the id of the task | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**Vec<crate::models::CmProjectSliceTask>**](CMProjectSliceTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_search_result_summary

> crate::models::CmSearchResultSummaryTask get_search_result_summary(organisation_id, task_id, session_id)
get Search Result Summary

Get the summary information for the search results of a given project by task id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**task_id** | **String** | the id of the task | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmSearchResultSummaryTask**](CMSearchResultSummaryTask.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_search_result_summary_for_review

> crate::models::CmSearchResultSummary get_search_result_summary_for_review(organisation_id, project_id, session_id)
get Search Result Summary

Get the summary information for the search results of a given project by task id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**project_id** | **String** | the id of the task | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmSearchResultSummary**](CMSearchResultSummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## next_document

> crate::models::CmSlicedDocumentListAndTotals next_document(session_id, cm_next_document)
Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_next_document** | [**CmNextDocument**](CmNextDocument.md) |  | [required] |

### Return type

[**crate::models::CmSlicedDocumentListAndTotals**](CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pdf_binary

> serde_json::Value pdf_binary(organisation_id, kb_id, url, session_id)
Binary

Get the original for a document if available by url (latest version)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | a base64 encoded url | [required] |
**session_id** | Option<**String**> | a valid SimSage Session id. |  |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## project_types

> Vec<crate::models::CmProjectInfo> project_types(organisation_id, session_id)
get Project Types

Get the list of available project types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**Vec<crate::models::CmProjectInfo>**](CMProjectInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reassign_slice_document

> serde_json::Value reassign_slice_document(session_id, cm_reassign_slice_document)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_reassign_slice_document** | [**CmReassignSliceDocument**](CmReassignSliceDocument.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## redacted_document

> crate::models::ReturnedDocument redacted_document(session_id, cm_redaction_details)
Get Redacted Document

Retrieves the redacted document binary

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_redaction_details** | [**CmRedactionDetails**](CmRedactionDetails.md) |  | [required] |

### Return type

[**crate::models::ReturnedDocument**](ReturnedDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_slice_document

> serde_json::Value remove_slice_document(session_id, cm_remove_slice_document)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_remove_slice_document** | [**CmRemoveSliceDocument**](CmRemoveSliceDocument.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reset_evolve

> String reset_evolve(organisation_id, session_id)
Reset Evolve Application

Fully resets Evolve to an empty system

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | a valid SimSage Organisation id. | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_project_definition

> crate::models::CmCreatedProject save_project_definition(session_id, cm_project_definition)
Inserts/Updates a project definition

Inserts/Updates the details for a project definition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_project_definition** | [**CmProjectDefinition**](CmProjectDefinition.md) |  | [required] |

### Return type

[**crate::models::CmCreatedProject**](CMCreatedProject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## set_slice_config

> String set_slice_config(session_id, cm_set_slice_definitions)
Set Slice configuration

Saves/updates the slices configured for a running project

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_set_slice_definitions** | [**CmSetSliceDefinitions**](CmSetSliceDefinitions.md) |  | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sliced_documents

> crate::models::CmSlicedDocumentListAndTotals sliced_documents(session_id, cm_sliced_document_request)
Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_sliced_document_request** | [**CmSlicedDocumentRequest**](CmSlicedDocumentRequest.md) |  | [required] |

### Return type

[**crate::models::CmSlicedDocumentListAndTotals**](CMSlicedDocumentListAndTotals.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## start_project

> serde_json::Value start_project(session_id, cm_start_project)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_start_project** | [**CmStartProject**](CmStartProject.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_document_status

> String update_document_status(session_id, cm_update_document_status)
Update document status

Updates the status applied to a slice document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_update_document_status** | [**CmUpdateDocumentStatus**](CmUpdateDocumentStatus.md) |  | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_redactions

> String update_redactions(session_id, cm_update_redactions)
Update document redactions

Updates the redactions applied to a document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_update_redactions** | [**CmUpdateRedactions**](CmUpdateRedactions.md) |  | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

