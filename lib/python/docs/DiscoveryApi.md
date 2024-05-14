# openapi_client.DiscoveryApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all_gdpr_projects**](DiscoveryApi.md#all_gdpr_projects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
[**apply_redactions**](DiscoveryApi.md#apply_redactions) | **POST** /api/discovery/applyredactions | 
[**create_gdpr_project**](DiscoveryApi.md#create_gdpr_project) | **POST** /api/discovery/createproject | 
[**delete_project**](DiscoveryApi.md#delete_project) | **DELETE** /api/discovery/deleteproject | 
[**export_redacted_doc**](DiscoveryApi.md#export_redacted_doc) | **POST** /api/discovery/exportredacteddoc | 
[**get_gdpr_document**](DiscoveryApi.md#get_gdpr_document) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} | 
[**get_paged_project_documents**](DiscoveryApi.md#get_paged_project_documents) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
[**growth_per_month**](DiscoveryApi.md#growth_per_month) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth
[**setdocumentredactions**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument | 
[**storage_by_source**](DiscoveryApi.md#storage_by_source) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage
[**summary_by_document_type**](DiscoveryApi.md#summary_by_document_type) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage
[**update_document_set**](DiscoveryApi.md#update_document_set) | **POST** /api/discovery/updatedocumentset | 
[**version5**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version


# **all_gdpr_projects**
> object all_gdpr_projects(organisation_id, kb_id, page, page_size, text_filter, status_filter, sort_column, sort_direction, session_id)



### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    page = 56 # int | the page to render
    page_size = 56 # int | the page size to use
    text_filter = 'text_filter_example' # str | the text filter passed in or blank if empty
    status_filter = 'status_filter_example' # str | the status filter passed in
    sort_column = 'sort_column_example' # str | the sort column used for the results
    sort_direction = 56 # int | sort direction to use (0/1)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        api_response = api_instance.all_gdpr_projects(organisation_id, kb_id, page, page_size, text_filter, status_filter, sort_column, sort_direction, session_id)
        print("The response of DiscoveryApi->all_gdpr_projects:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->all_gdpr_projects: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **page** | **int**| the page to render | 
 **page_size** | **int**| the page size to use | 
 **text_filter** | **str**| the text filter passed in or blank if empty | 
 **status_filter** | **str**| the status filter passed in | 
 **sort_column** | **str**| the sort column used for the results | 
 **sort_direction** | **int**| sort direction to use (0/1) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apply_redactions**
> object apply_redactions(session_id, cm_redaction_data)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_redaction_data import CMRedactionData
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_redaction_data = openapi_client.CMRedactionData() # CMRedactionData | 

    try:
        api_response = api_instance.apply_redactions(session_id, cm_redaction_data)
        print("The response of DiscoveryApi->apply_redactions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->apply_redactions: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_redaction_data** | [**CMRedactionData**](CMRedactionData.md)|  | 

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

# **create_gdpr_project**
> object create_gdpr_project(session_id, cm_create_gdpr_project)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_create_gdpr_project import CMCreateGdprProject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_create_gdpr_project = openapi_client.CMCreateGdprProject() # CMCreateGdprProject | 

    try:
        api_response = api_instance.create_gdpr_project(session_id, cm_create_gdpr_project)
        print("The response of DiscoveryApi->create_gdpr_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->create_gdpr_project: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_create_gdpr_project** | [**CMCreateGdprProject**](CMCreateGdprProject.md)|  | 

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

# **delete_project**
> object delete_project(session_id, cm_delete_project_cmd)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_delete_project_cmd import CMDeleteProjectCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_delete_project_cmd = openapi_client.CMDeleteProjectCmd() # CMDeleteProjectCmd | 

    try:
        api_response = api_instance.delete_project(session_id, cm_delete_project_cmd)
        print("The response of DiscoveryApi->delete_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->delete_project: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_delete_project_cmd** | [**CMDeleteProjectCmd**](CMDeleteProjectCmd.md)|  | 

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

# **export_redacted_doc**
> object export_redacted_doc(session_id, cm_export_redacted_document)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_export_redacted_document import CMExportRedactedDocument
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_export_redacted_document = openapi_client.CMExportRedactedDocument() # CMExportRedactedDocument | 

    try:
        api_response = api_instance.export_redacted_doc(session_id, cm_export_redacted_document)
        print("The response of DiscoveryApi->export_redacted_doc:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->export_redacted_doc: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_export_redacted_document** | [**CMExportRedactedDocument**](CMExportRedactedDocument.md)|  | 

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

# **get_gdpr_document**
> object get_gdpr_document(organisation_id, kb_id, project_id, url, session_id)



### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    project_id = 'project_id_example' # str | Project Id for the items
    url = 'url_example' # str | The url of the document to retrieve
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        api_response = api_instance.get_gdpr_document(organisation_id, kb_id, project_id, url, session_id)
        print("The response of DiscoveryApi->get_gdpr_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->get_gdpr_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **project_id** | **str**| Project Id for the items | 
 **url** | **str**| The url of the document to retrieve | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_paged_project_documents**
> object get_paged_project_documents(organisation_id, kb_id, project_id, page, page_size, text_filter, type_filter, status_filter, sort_column, sort_direction, session_id)



### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    project_id = 'project_id_example' # str | Project Id for the items
    page = 56 # int | the page to render
    page_size = 56 # int | the page size to use
    text_filter = 'text_filter_example' # str | the text filter passed in or blank if empty
    type_filter = 'type_filter_example' # str | the type filter passed in
    status_filter = 'status_filter_example' # str | the status filter passed in
    sort_column = 'sort_column_example' # str | the sort column used for the results
    sort_direction = 56 # int | sort direction to use (0/1)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        api_response = api_instance.get_paged_project_documents(organisation_id, kb_id, project_id, page, page_size, text_filter, type_filter, status_filter, sort_column, sort_direction, session_id)
        print("The response of DiscoveryApi->get_paged_project_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->get_paged_project_documents: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **project_id** | **str**| Project Id for the items | 
 **page** | **int**| the page to render | 
 **page_size** | **int**| the page size to use | 
 **text_filter** | **str**| the text filter passed in or blank if empty | 
 **type_filter** | **str**| the type filter passed in | 
 **status_filter** | **str**| the status filter passed in | 
 **sort_column** | **str**| the sort column used for the results | 
 **sort_direction** | **int**| sort direction to use (0/1) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **growth_per_month**
> object growth_per_month(organisation_id, kb_id, session_id)

growth

Get the storage growth delta per month

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # growth
        api_response = api_instance.growth_per_month(organisation_id, kb_id, session_id)
        print("The response of DiscoveryApi->growth_per_month:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->growth_per_month: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **setdocumentredactions**
> object setdocumentredactions(session_id, cm_redaction_data)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_redaction_data import CMRedactionData
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_redaction_data = openapi_client.CMRedactionData() # CMRedactionData | 

    try:
        api_response = api_instance.setdocumentredactions(session_id, cm_redaction_data)
        print("The response of DiscoveryApi->setdocumentredactions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->setdocumentredactions: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_redaction_data** | [**CMRedactionData**](CMRedactionData.md)|  | 

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

# **storage_by_source**
> object storage_by_source(organisation_id, kb_id, session_id)

storage

Get the current amount of storage used by source

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # storage
        api_response = api_instance.storage_by_source(organisation_id, kb_id, session_id)
        print("The response of DiscoveryApi->storage_by_source:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->storage_by_source: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **summary_by_document_type**
> object summary_by_document_type(organisation_id, kb_id, session_id)

storage

Get the current amount of storage used by source and document type

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # storage
        api_response = api_instance.summary_by_document_type(organisation_id, kb_id, session_id)
        print("The response of DiscoveryApi->summary_by_document_type:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->summary_by_document_type: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_document_set**
> object update_document_set(session_id, cm_update_document_set)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_update_document_set import CMUpdateDocumentSet
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_update_document_set = openapi_client.CMUpdateDocumentSet() # CMUpdateDocumentSet | 

    try:
        api_response = api_instance.update_document_set(session_id, cm_update_document_set)
        print("The response of DiscoveryApi->update_document_set:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->update_document_set: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_update_document_set** | [**CMUpdateDocumentSet**](CMUpdateDocumentSet.md)|  | 

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

# **version5**
> CMVersion version5()

Version

Get the version of SimSage Discovery Services.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_version import CMVersion
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DiscoveryApi(api_client)

    try:
        # Version
        api_response = api_instance.version5()
        print("The response of DiscoveryApi->version5:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DiscoveryApi->version5: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get version. |  -  |
**200** | get the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

