# openapi_client.DataprojectApi

All URIs are relative to *https://test.simsage.ai*

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
[**get_project_slice**](DataprojectApi.md#get_project_slice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice
[**get_search_result_summary**](DataprojectApi.md#get_search_result_summary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary
[**next_document**](DataprojectApi.md#next_document) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters
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


# **add_comment**
> str add_comment(session_id, cm_new_comment)

Create Comment

Adds a comment with the given level and ids

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_new_comment import CMNewComment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_new_comment = openapi_client.CMNewComment() # CMNewComment | 

    try:
        # Create Comment
        api_response = api_instance.add_comment(session_id, cm_new_comment)
        print("The response of DataprojectApi->add_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->add_comment: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_new_comment** | [**CMNewComment**](CMNewComment.md)|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Create Comment Status OK response |  -  |
**500** | Could not add comment. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **all_tasks**
> CMPagedQueueItems all_tasks(session_id, cm_queue_filter)

get Running Projects

Get the list of running projects

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_paged_queue_items import CMPagedQueueItems
from openapi_client.models.cm_queue_filter import CMQueueFilter
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_queue_filter = openapi_client.CMQueueFilter() # CMQueueFilter | 

    try:
        # get Running Projects
        api_response = api_instance.all_tasks(session_id, cm_queue_filter)
        print("The response of DataprojectApi->all_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->all_tasks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_queue_filter** | [**CMQueueFilter**](CMQueueFilter.md)|  | 

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
**500** | could not get running projects list. |  -  |
**200** | running project list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **change_task_phase**
> str change_task_phase(session_id, cm_change_task_phase)

Change Task Phase

Notifies Workflow engine that a task changed it's status and passes results in

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_change_task_phase import CMChangeTaskPhase
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_change_task_phase = openapi_client.CMChangeTaskPhase() # CMChangeTaskPhase | 

    try:
        # Change Task Phase
        api_response = api_instance.change_task_phase(session_id, cm_change_task_phase)
        print("The response of DataprojectApi->change_task_phase:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->change_task_phase: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_change_task_phase** | [**CMChangeTaskPhase**](CMChangeTaskPhase.md)|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | change task-phase OK response |  -  |
**500** | could not change task-phase. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **claim_document**
> ReturnedDocument claim_document(session_id, cm_claim_document)

Claim sliced document

Claim sliced document for signed in user

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_claim_document import CMClaimDocument
from openapi_client.models.returned_document import ReturnedDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_claim_document = openapi_client.CMClaimDocument() # CMClaimDocument | 

    try:
        # Claim sliced document
        api_response = api_instance.claim_document(session_id, cm_claim_document)
        print("The response of DataprojectApi->claim_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->claim_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_claim_document** | [**CMClaimDocument**](CMClaimDocument.md)|  | 

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
**200** | Wrapper containing the document binary |  -  |
**500** | could not retrieve redacted document. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_status**
> CMCrawlerStatusTask crawler_status(organisation_id, task_id, session_id)

get Crawler Status

Get the crawler status for the given task id

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_crawler_status_task import CMCrawlerStatusTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    task_id = 'task_id_example' # str | the id of the task
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # get Crawler Status
        api_response = api_instance.crawler_status(organisation_id, task_id, session_id)
        print("The response of DataprojectApi->crawler_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->crawler_status: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **task_id** | **str**| the id of the task | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**500** | could not get crawler-status. |  -  |
**200** | crawler-status response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **documents_by_tokens**
> CMPagedProjectDocuments documents_by_tokens(session_id, cm_documents_by_token)

Returns document list for tokens

Returns paged list of documents for the given set of query tokens

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_documents_by_token import CMDocumentsByToken
from openapi_client.models.cm_paged_project_documents import CMPagedProjectDocuments
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_documents_by_token = openapi_client.CMDocumentsByToken() # CMDocumentsByToken | 

    try:
        # Returns document list for tokens
        api_response = api_instance.documents_by_tokens(session_id, cm_documents_by_token)
        print("The response of DataprojectApi->documents_by_tokens:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->documents_by_tokens: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_documents_by_token** | [**CMDocumentsByToken**](CMDocumentsByToken.md)|  | 

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
**200** | returns paged list of documents for the given set of query tokens |  -  |
**500** | could not retrieve document list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **filtered_comments**
> List[CMRecordedComment] filtered_comments(session_id, cm_comment_filter)

Retrieve Comments

Retrieves the list of comments for the passed in Filter

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_comment_filter import CMCommentFilter
from openapi_client.models.cm_recorded_comment import CMRecordedComment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_comment_filter = openapi_client.CMCommentFilter() # CMCommentFilter | 

    try:
        # Retrieve Comments
        api_response = api_instance.filtered_comments(session_id, cm_comment_filter)
        print("The response of DataprojectApi->filtered_comments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->filtered_comments: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_comment_filter** | [**CMCommentFilter**](CMCommentFilter.md)|  | 

### Return type

[**List[CMRecordedComment]**](CMRecordedComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Create Comment Status OK response |  -  |
**500** | Could not get comments. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_redaction_info**
> List[LocatedRedaction] get_document_redaction_info(organisation_id, slice_id, document_key, session_id)

Get Document Redaction info

Get list of all identified potential Redaction locations for the document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.located_redaction import LocatedRedaction
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    slice_id = 'slice_id_example' # str | the id of the slice
    document_key = 'document_key_example' # str | the document key of the document to be redacted
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get Document Redaction info
        api_response = api_instance.get_document_redaction_info(organisation_id, slice_id, document_key, session_id)
        print("The response of DataprojectApi->get_document_redaction_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->get_document_redaction_info: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **slice_id** | **str**| the id of the slice | 
 **document_key** | **str**| the document key of the document to be redacted | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

[**List[LocatedRedaction]**](LocatedRedaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not retrieve redaction info. |  -  |
**200** | List of all identified potential Redaction locations for the document |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_definition**
> CMProjectDefinitionTask get_project_definition(organisation_id, task_id, session_id)

get Project Definition

Get the project definition of the project for the given task id

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_project_definition_task import CMProjectDefinitionTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    task_id = 'task_id_example' # str | the id of the task
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # get Project Definition
        api_response = api_instance.get_project_definition(organisation_id, task_id, session_id)
        print("The response of DataprojectApi->get_project_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->get_project_definition: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **task_id** | **str**| the id of the task | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**200** | project definition response |  -  |
**500** | could not get project definition. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_slice**
> List[CMProjectSliceTask] get_project_slice(organisation_id, task_id, session_id)

get project slice

Get the project project slice for the given task id

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_project_slice_task import CMProjectSliceTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    task_id = 'task_id_example' # str | the id of the task
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # get project slice
        api_response = api_instance.get_project_slice(organisation_id, task_id, session_id)
        print("The response of DataprojectApi->get_project_slice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->get_project_slice: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **task_id** | **str**| the id of the task | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

[**List[CMProjectSliceTask]**](CMProjectSliceTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project slice data |  -  |
**500** | could not retrieve project slice. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_search_result_summary**
> CMSearchResultSummaryTask get_search_result_summary(organisation_id, task_id, session_id)

get Search Result Summary

Get the summary information for the search results of a given project by task id

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_search_result_summary_task import CMSearchResultSummaryTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    task_id = 'task_id_example' # str | the id of the task
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # get Search Result Summary
        api_response = api_instance.get_search_result_summary(organisation_id, task_id, session_id)
        print("The response of DataprojectApi->get_search_result_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->get_search_result_summary: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **task_id** | **str**| the id of the task | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**500** | could not get search result summary. |  -  |
**200** | search result summary response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **next_document**
> CMSlicedDocumentListAndTotals next_document(session_id, cm_next_document)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_next_document import CMNextDocument
from openapi_client.models.cm_sliced_document_list_and_totals import CMSlicedDocumentListAndTotals
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_next_document = openapi_client.CMNextDocument() # CMNextDocument | 

    try:
        # Document list for given slice and filters
        api_response = api_instance.next_document(session_id, cm_next_document)
        print("The response of DataprojectApi->next_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->next_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_next_document** | [**CMNextDocument**](CMNextDocument.md)|  | 

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
**500** | could not retrieve document list. |  -  |
**200** | Paged list of documents for the passed in slice and filters as well as totals |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **project_types**
> List[CMProjectInfo] project_types(organisation_id, session_id)

get Project Types

Get the list of available project types

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_project_info import CMProjectInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # get Project Types
        api_response = api_instance.project_types(organisation_id, session_id)
        print("The response of DataprojectApi->project_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->project_types: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

[**List[CMProjectInfo]**](CMProjectInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | project-type list response |  -  |
**500** | could not get project-type list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reassign_slice_document**
> object reassign_slice_document(session_id, cm_reassign_slice_document)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_reassign_slice_document import CMReassignSliceDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_reassign_slice_document = openapi_client.CMReassignSliceDocument() # CMReassignSliceDocument | 

    try:
        api_response = api_instance.reassign_slice_document(session_id, cm_reassign_slice_document)
        print("The response of DataprojectApi->reassign_slice_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->reassign_slice_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_reassign_slice_document** | [**CMReassignSliceDocument**](CMReassignSliceDocument.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **redacted_document**
> ReturnedDocument redacted_document(session_id, cm_redaction_details)

Get Redacted Document

Retrieves the redacted document binary

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_redaction_details import CMRedactionDetails
from openapi_client.models.returned_document import ReturnedDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_redaction_details = openapi_client.CMRedactionDetails() # CMRedactionDetails | 

    try:
        # Get Redacted Document
        api_response = api_instance.redacted_document(session_id, cm_redaction_details)
        print("The response of DataprojectApi->redacted_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->redacted_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_redaction_details** | [**CMRedactionDetails**](CMRedactionDetails.md)|  | 

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
**200** | Wrapper containing the document binary |  -  |
**500** | could not retrieve redacted document. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_slice_document**
> object remove_slice_document(session_id, cm_remove_slice_document)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_remove_slice_document import CMRemoveSliceDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_remove_slice_document = openapi_client.CMRemoveSliceDocument() # CMRemoveSliceDocument | 

    try:
        api_response = api_instance.remove_slice_document(session_id, cm_remove_slice_document)
        print("The response of DataprojectApi->remove_slice_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->remove_slice_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_remove_slice_document** | [**CMRemoveSliceDocument**](CMRemoveSliceDocument.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_evolve**
> str reset_evolve(organisation_id, session_id)

Reset Evolve Application

Fully resets Evolve to an empty system

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    organisation_id = 'organisation_id_example' # str | a valid SimSage Organisation id.
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Reset Evolve Application
        api_response = api_instance.reset_evolve(organisation_id, session_id)
        print("The response of DataprojectApi->reset_evolve:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->reset_evolve: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| a valid SimSage Organisation id. | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Exception during reset. |  -  |
**200** | Evolve successfully reset |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_project_definition**
> CMCreatedProject save_project_definition(session_id, cm_project_definition)

Inserts/Updates a project definition

Inserts/Updates the details for a project definition

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_created_project import CMCreatedProject
from openapi_client.models.cm_project_definition import CMProjectDefinition
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_project_definition = openapi_client.CMProjectDefinition() # CMProjectDefinition | 

    try:
        # Inserts/Updates a project definition
        api_response = api_instance.save_project_definition(session_id, cm_project_definition)
        print("The response of DataprojectApi->save_project_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->save_project_definition: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_project_definition** | [**CMProjectDefinition**](CMProjectDefinition.md)|  | 

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
**200** | Object containing the task and project ids to use to further refine the project details |  -  |
**500** | could not save project-definition. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_slice_config**
> str set_slice_config(session_id, cm_set_slice_definitions)

Set Slice configuration

Saves/updates the slices configured for a running project

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_set_slice_definitions import CMSetSliceDefinitions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_set_slice_definitions = openapi_client.CMSetSliceDefinitions() # CMSetSliceDefinitions | 

    try:
        # Set Slice configuration
        api_response = api_instance.set_slice_config(session_id, cm_set_slice_definitions)
        print("The response of DataprojectApi->set_slice_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->set_slice_config: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_set_slice_definitions** | [**CMSetSliceDefinitions**](CMSetSliceDefinitions.md)|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Could not set Slice configuration. |  -  |
**200** | Set Slice config OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sliced_documents**
> CMSlicedDocumentListAndTotals sliced_documents(session_id, cm_sliced_document_request)

Document list for given slice and filters

Returns paged list of documents for the passed in slice and filters as well as totals

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_sliced_document_list_and_totals import CMSlicedDocumentListAndTotals
from openapi_client.models.cm_sliced_document_request import CMSlicedDocumentRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_sliced_document_request = openapi_client.CMSlicedDocumentRequest() # CMSlicedDocumentRequest | 

    try:
        # Document list for given slice and filters
        api_response = api_instance.sliced_documents(session_id, cm_sliced_document_request)
        print("The response of DataprojectApi->sliced_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->sliced_documents: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_sliced_document_request** | [**CMSlicedDocumentRequest**](CMSlicedDocumentRequest.md)|  | 

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
**500** | could not retrieve document list. |  -  |
**200** | Paged list of documents for the passed in slice and filters as well as totals |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_project**
> object start_project(session_id, cm_start_project)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_start_project import CMStartProject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_start_project = openapi_client.CMStartProject() # CMStartProject | 

    try:
        api_response = api_instance.start_project(session_id, cm_start_project)
        print("The response of DataprojectApi->start_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->start_project: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_start_project** | [**CMStartProject**](CMStartProject.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_document_status**
> str update_document_status(session_id, cm_update_document_status)

Update document status

Updates the status applied to a slice document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_update_document_status import CMUpdateDocumentStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_update_document_status = openapi_client.CMUpdateDocumentStatus() # CMUpdateDocumentStatus | 

    try:
        # Update document status
        api_response = api_instance.update_document_status(session_id, cm_update_document_status)
        print("The response of DataprojectApi->update_document_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->update_document_status: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_update_document_status** | [**CMUpdateDocumentStatus**](CMUpdateDocumentStatus.md)|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update Document Status OK response |  -  |
**500** | Could not update document status. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_redactions**
> str update_redactions(session_id, cm_update_redactions)

Update document redactions

Updates the redactions applied to a document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_update_redactions import CMUpdateRedactions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DataprojectApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_update_redactions = openapi_client.CMUpdateRedactions() # CMUpdateRedactions | 

    try:
        # Update document redactions
        api_response = api_instance.update_redactions(session_id, cm_update_redactions)
        print("The response of DataprojectApi->update_redactions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataprojectApi->update_redactions: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_update_redactions** | [**CMUpdateRedactions**](CMUpdateRedactions.md)|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update Redactions OK response |  -  |
**500** | could not update redactionst. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

