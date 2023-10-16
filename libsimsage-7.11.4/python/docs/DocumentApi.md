# openapi_client.DocumentApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**document**](DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document
[**get_parquet_file**](DocumentApi.md#get_parquet_file) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File
[**get_parquet_list**](DocumentApi.md#get_parquet_list) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list
[**get_spreadsheet**](DocumentApi.md#get_spreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet
[**get_stats1**](DocumentApi.md#get_stats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics
[**inventorize_documents**](DocumentApi.md#inventorize_documents) | **POST** /api/document/inventorize | Document Inventory
[**inventorize_indexes**](DocumentApi.md#inventorize_indexes) | **POST** /api/document/inventorize-indexes | Index Inventory
[**preview**](DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview
[**preview_html**](DocumentApi.md#preview_html) | **POST** /api/document/preview/html | Preview HTML
[**query_focussed_summarization**](DocumentApi.md#query_focussed_summarization) | **POST** /api/document/qfs | Summarize Documents for Query
[**remove_document**](DocumentApi.md#remove_document) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document
[**remove_parquet_file**](DocumentApi.md#remove_parquet_file) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File
[**summarize_document**](DocumentApi.md#summarize_document) | **POST** /api/document/summarize/document | Summarize a document
[**version4**](DocumentApi.md#version4) | **GET** /api/document/version | Version
[**zip_source**](DocumentApi.md#zip_source) | **POST** /api/document/zip/source | Zip source documents


# **document**
> CMDocument document(session_id, organisation_id, kb_id, url)

get Document

return a document's details given a base64 encoded url

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document import CMDocument
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the document's url, base64 encoded, a unique id identifying a document.

    try:
        # get Document
        api_response = api_instance.document(session_id, organisation_id, kb_id, url)
        print("The response of DocumentApi->document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the document&#39;s url, base64 encoded, a unique id identifying a document. | 

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
**500** | could not get document. |  -  |
**200** | document object response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parquet_file**
> bytearray get_parquet_file(ott, organisation_id, kb_id, date_time)

Download Parquet File

Download an inventory parquet file.

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
    api_instance = openapi_client.DocumentApi(api_client)
    ott = 'ott_example' # str | a one-time token for downloading data.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    date_time = 56 # int | a unix date-time specifying the exact snapshot to download

    try:
        # Download Parquet File
        api_response = api_instance.get_parquet_file(ott, organisation_id, kb_id, date_time)
        print("The response of DocumentApi->get_parquet_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_parquet_file: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ott** | **str**| a one-time token for downloading data. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **date_time** | **int**| a unix date-time specifying the exact snapshot to download | 

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
**500** | could not get parquet download. |  -  |
**200** | parquet download response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parquet_list**
> CMParquetTimeList get_parquet_list(organisation_id, kb_id, page, page_size, session_id, api_version=api_version)

Parquet available time list

Return a list of inventory times available for download.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_parquet_time_list import CMParquetTimeList
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
    api_instance = openapi_client.DocumentApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    page = 0 # int | pagination control, the page index
    page_size = 10 # int | pagination control, the size of a page
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Parquet available time list
        api_response = api_instance.get_parquet_list(organisation_id, kb_id, page, page_size, session_id, api_version=api_version)
        print("The response of DocumentApi->get_parquet_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_parquet_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **page** | **int**| pagination control, the page index | 
 **page_size** | **int**| pagination control, the size of a page | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMParquetTimeList**](CMParquetTimeList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get parquet list. |  -  |
**200** | parquet list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spreadsheet**
> bytearray get_spreadsheet(ott, organisation_id, kb_id, date_time)

Inventory breakdown Spreadsheet

Download an inventory breakdown spreadsheet for a given date-time.

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
    api_instance = openapi_client.DocumentApi(api_client)
    ott = 'ott_example' # str | a one-time token for downloading data.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    date_time = 56 # int | a unix date-time specifying the exact snapshot to download

    try:
        # Inventory breakdown Spreadsheet
        api_response = api_instance.get_spreadsheet(ott, organisation_id, kb_id, date_time)
        print("The response of DocumentApi->get_spreadsheet:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_spreadsheet: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ott** | **str**| a one-time token for downloading data. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **date_time** | **int**| a unix date-time specifying the exact snapshot to download | 

### Return type

**bytearray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get inventory spreadsheet. |  -  |
**200** | inventory spreadsheet response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stats1**
> List[CMDocumentTypeFrequency] get_stats1(ott, organisation_id, kb_id, date_time)

Document Frequency Statistics

Return a document frequency statistics report - frequencies of different document types

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_type_frequency import CMDocumentTypeFrequency
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
    api_instance = openapi_client.DocumentApi(api_client)
    ott = 'ott_example' # str | a one-time token for downloading data.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    date_time = 56 # int | a unix date-time specifying the exact snapshot to download

    try:
        # Document Frequency Statistics
        api_response = api_instance.get_stats1(ott, organisation_id, kb_id, date_time)
        print("The response of DocumentApi->get_stats1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_stats1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ott** | **str**| a one-time token for downloading data. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **date_time** | **int**| a unix date-time specifying the exact snapshot to download | 

### Return type

[**List[CMDocumentTypeFrequency]**](CMDocumentTypeFrequency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get document statistics. |  -  |
**200** | document statistic response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **inventorize_documents**
> JsonMessage inventorize_documents(session_id, cm_inventorize_parameters, api_version=api_version)

Document Inventory

Start the async inventorize process for documents of a given organisation/kb.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_inventorize_parameters import CMInventorizeParameters
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_inventorize_parameters = openapi_client.CMInventorizeParameters() # CMInventorizeParameters | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Document Inventory
        api_response = api_instance.inventorize_documents(session_id, cm_inventorize_parameters, api_version=api_version)
        print("The response of DocumentApi->inventorize_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->inventorize_documents: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_inventorize_parameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md)|  | 
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
**200** | document inventory process OK result |  -  |
**500** | could not start inventory process. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **inventorize_indexes**
> JsonMessage inventorize_indexes(session_id, cm_inventorize_parameters, api_version=api_version)

Index Inventory

Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_inventorize_parameters import CMInventorizeParameters
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_inventorize_parameters = openapi_client.CMInventorizeParameters() # CMInventorizeParameters | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Index Inventory
        api_response = api_instance.inventorize_indexes(session_id, cm_inventorize_parameters, api_version=api_version)
        print("The response of DocumentApi->inventorize_indexes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->inventorize_indexes: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_inventorize_parameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md)|  | 
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
**500** | could not start inventorize. |  -  |
**200** | start inventorize indexes OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preview**
> bytearray preview(organisation_id, kb_id, client_id, session_id, url_id, page)

get Preview

get a preview for a document if available by url

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
    api_instance = openapi_client.DocumentApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    client_id = 'client_id_example' # str | the client-id, a persistent id identifying the remote client making this request.
    session_id = 'session_id_example' # str | the session-id, the security required for making this request.
    url_id = 56 # int | the SimSage id for this url
    page = must be one of -1: the thumbnail image, 0: the first page view # int | what page to render

    try:
        # get Preview
        api_response = api_instance.preview(organisation_id, kb_id, client_id, session_id, url_id, page)
        print("The response of DocumentApi->preview:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->preview: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **client_id** | **str**| the client-id, a persistent id identifying the remote client making this request. | 
 **session_id** | **str**| the session-id, the security required for making this request. | 
 **url_id** | **int**| the SimSage id for this url | 
 **page** | **int**| what page to render | 

### Return type

**bytearray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpeg, image/svg+xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | image response |  -  |
**500** | could not get image. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preview_html**
> CMGetHtml preview_html(session_id, cm_get_html)

Preview HTML

get a preview HTML page for a document if available by url

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_get_html import CMGetHtml
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid session-guid id or a anonymous user-id.
    cm_get_html = openapi_client.CMGetHtml() # CMGetHtml | 

    try:
        # Preview HTML
        api_response = api_instance.preview_html(session_id, cm_get_html)
        print("The response of DocumentApi->preview_html:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->preview_html: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid session-guid id or a anonymous user-id. | 
 **cm_get_html** | [**CMGetHtml**](CMGetHtml.md)|  | 

### Return type

[**CMGetHtml**](CMGetHtml.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get preview HTML. |  -  |
**200** | get preview HTML response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_focussed_summarization**
> CMQueryFocussedSummarization query_focussed_summarization(session_id, cm_query_focussed_summarization_request, api_version=api_version)

Summarize Documents for Query

Summarize a set of documents given a list of urls and a query.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_query_focussed_summarization import CMQueryFocussedSummarization
from openapi_client.models.cm_query_focussed_summarization_request import CMQueryFocussedSummarizationRequest
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_query_focussed_summarization_request = openapi_client.CMQueryFocussedSummarizationRequest() # CMQueryFocussedSummarizationRequest | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Summarize Documents for Query
        api_response = api_instance.query_focussed_summarization(session_id, cm_query_focussed_summarization_request, api_version=api_version)
        print("The response of DocumentApi->query_focussed_summarization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->query_focussed_summarization: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_query_focussed_summarization_request** | [**CMQueryFocussedSummarizationRequest**](CMQueryFocussedSummarizationRequest.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMQueryFocussedSummarization**](CMQueryFocussedSummarization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get focussed summarization. |  -  |
**200** | query focussed summarization response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_document**
> JsonMessage remove_document(organisation_id, kb_id, url, source_id, session_id, api_version=api_version)

Remove Document

Remove/delete a document by its url.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.DocumentApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the base-64 encoded (no-prefix) url of the document
    source_id = 56 # int | the source-id of the crawler this document belongs to
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Remove Document
        api_response = api_instance.remove_document(organisation_id, kb_id, url, source_id, session_id, api_version=api_version)
        print("The response of DocumentApi->remove_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->remove_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the base-64 encoded (no-prefix) url of the document | 
 **source_id** | **int**| the source-id of the crawler this document belongs to | 
 **session_id** | **str**| a valid SimSage Session id. | 
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
**500** | could not remove document. |  -  |
**200** | remove document OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_parquet_file**
> List[JsonMessage] remove_parquet_file(organisation_id, kb_id, date_time, session_id, api_version=api_version)

Delete Parquet File

Remove an inventory breakdown spreadsheet/parquet file from the system

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.DocumentApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    date_time = 56 # int | a unix date-time specifying the exact snapshot to remove
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete Parquet File
        api_response = api_instance.remove_parquet_file(organisation_id, kb_id, date_time, session_id, api_version=api_version)
        print("The response of DocumentApi->remove_parquet_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->remove_parquet_file: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **date_time** | **int**| a unix date-time specifying the exact snapshot to remove | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[JsonMessage]**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | delete parquet OK response |  -  |
**500** | could not get delete parquet. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **summarize_document**
> CMSingleDocumentSummary summarize_document(session_id, cm_single_document_summary_request, api_version=api_version)

Summarize a document

Summarize a single document using an extractive summarization.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_single_document_summary import CMSingleDocumentSummary
from openapi_client.models.cm_single_document_summary_request import CMSingleDocumentSummaryRequest
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_single_document_summary_request = openapi_client.CMSingleDocumentSummaryRequest() # CMSingleDocumentSummaryRequest | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Summarize a document
        api_response = api_instance.summarize_document(session_id, cm_single_document_summary_request, api_version=api_version)
        print("The response of DocumentApi->summarize_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->summarize_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_single_document_summary_request** | [**CMSingleDocumentSummaryRequest**](CMSingleDocumentSummaryRequest.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSingleDocumentSummary**](CMSingleDocumentSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | summarization response |  -  |
**500** | could not get summarization. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version4**
> CMVersion version4()

Version

Get the version of SimSage Document Services.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_version import CMVersion
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
    api_instance = openapi_client.DocumentApi(api_client)

    try:
        # Version
        api_response = api_instance.version4()
        print("The response of DocumentApi->version4:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->version4: %s\n" % e)
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
**200** | get the version response |  -  |
**500** | could not get version. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **zip_source**
> JsonMessage zip_source(session_id, cm_zip_source, api_version=api_version)

Zip source documents

Zip all documents in a source on the local server.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_zip_source import CMZipSource
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.DocumentApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_zip_source = openapi_client.CMZipSource() # CMZipSource | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Zip source documents
        api_response = api_instance.zip_source(session_id, cm_zip_source, api_version=api_version)
        print("The response of DocumentApi->zip_source:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->zip_source: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_zip_source** | [**CMZipSource**](CMZipSource.md)|  | 
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
**200** | zip source documents OK response |  -  |
**500** | could not create source document zip. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

