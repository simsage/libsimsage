# openapi_client.SemanticApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_text_to_search**](SemanticApi.md#delete_text_to_search) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search
[**document_question_and_answer**](SemanticApi.md#document_question_and_answer) | **POST** /api/semantic/document-qa | Document Q&amp;A
[**get_text_to_search_paginated**](SemanticApi.md#get_text_to_search_paginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings
[**restful_client_query**](SemanticApi.md#restful_client_query) | **POST** /api/semantic/query | Client Query
[**save_text_to_search**](SemanticApi.md#save_text_to_search) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item
[**short_summary**](SemanticApi.md#short_summary) | **POST** /api/semantic/short-summary | Short summary
[**try_text_to_search_conversion**](SemanticApi.md#try_text_to_search_conversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search
[**version1**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version


# **delete_text_to_search**
> JsonMessage delete_text_to_search(organisation_id, kb_id, word, session_id, api_version=api_version)

Delete text-to-search

Remove an existing text-to-search item.

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
    api_instance = openapi_client.SemanticApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    word = 'sort()' # str | the word of the text-to-search word
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete text-to-search
        api_response = api_instance.delete_text_to_search(organisation_id, kb_id, word, session_id, api_version=api_version)
        print("The response of SemanticApi->delete_text_to_search:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->delete_text_to_search: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **word** | **str**| the word of the text-to-search word | 
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
**200** | OK response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **document_question_and_answer**
> CMDocumentQuestionAndAnswer document_question_and_answer(session_id, cm_document_question_and_answer)

Document Q&A

Answer a question about a given document

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_document_question_and_answer import CMDocumentQuestionAndAnswer
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
    api_instance = openapi_client.SemanticApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_document_question_and_answer = openapi_client.CMDocumentQuestionAndAnswer() # CMDocumentQuestionAndAnswer | 

    try:
        # Document Q&A
        api_response = api_instance.document_question_and_answer(session_id, cm_document_question_and_answer)
        print("The response of SemanticApi->document_question_and_answer:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->document_question_and_answer: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_document_question_and_answer** | [**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)|  | 

### Return type

[**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_text_to_search_paginated**
> CMTextToSearchPaginatedReturn get_text_to_search_paginated(session_id, cm_text_to_search_paginated, api_version=api_version)

Text to Search mappings

Return a paginated list of text-to-search mappings with an optional filter.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_text_to_search_paginated import CMTextToSearchPaginated
from openapi_client.models.cm_text_to_search_paginated_return import CMTextToSearchPaginatedReturn
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
    api_instance = openapi_client.SemanticApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_text_to_search_paginated = openapi_client.CMTextToSearchPaginated() # CMTextToSearchPaginated | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Text to Search mappings
        api_response = api_instance.get_text_to_search_paginated(session_id, cm_text_to_search_paginated, api_version=api_version)
        print("The response of SemanticApi->get_text_to_search_paginated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->get_text_to_search_paginated: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_text_to_search_paginated** | [**CMTextToSearchPaginated**](CMTextToSearchPaginated.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMTextToSearchPaginatedReturn**](CMTextToSearchPaginatedReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **restful_client_query**
> CMClientQueryResult restful_client_query(cm_client_query)

Client Query

a SimSage client asks a question or performs a keyword-search.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_client_query import CMClientQuery
from openapi_client.models.cm_client_query_result import CMClientQueryResult
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
    api_instance = openapi_client.SemanticApi(api_client)
    cm_client_query = openapi_client.CMClientQuery() # CMClientQuery | 

    try:
        # Client Query
        api_response = api_instance.restful_client_query(cm_client_query)
        print("The response of SemanticApi->restful_client_query:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->restful_client_query: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_client_query** | [**CMClientQuery**](CMClientQuery.md)|  | 

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
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_text_to_search**
> JsonMessage save_text_to_search(organisation_id, kb_id, session_id, cm_text_to_search_edit, api_version=api_version)

Save a text-to-search item

Create or update (save) a text-to-search item.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_text_to_search_edit import CMTextToSearchEdit
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
    api_instance = openapi_client.SemanticApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_text_to_search_edit = openapi_client.CMTextToSearchEdit() # CMTextToSearchEdit | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save a text-to-search item
        api_response = api_instance.save_text_to_search(organisation_id, kb_id, session_id, cm_text_to_search_edit, api_version=api_version)
        print("The response of SemanticApi->save_text_to_search:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->save_text_to_search: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_text_to_search_edit** | [**CMTextToSearchEdit**](CMTextToSearchEdit.md)|  | 
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
**200** | OK response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **short_summary**
> CMShortSummaryResult short_summary(cm_short_summary)

Short summary

Create a short summary for a given url / sentence

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_short_summary import CMShortSummary
from openapi_client.models.cm_short_summary_result import CMShortSummaryResult
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
    api_instance = openapi_client.SemanticApi(api_client)
    cm_short_summary = openapi_client.CMShortSummary() # CMShortSummary | 

    try:
        # Short summary
        api_response = api_instance.short_summary(cm_short_summary)
        print("The response of SemanticApi->short_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->short_summary: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_short_summary** | [**CMShortSummary**](CMShortSummary.md)|  | 

### Return type

[**CMShortSummaryResult**](CMShortSummaryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **try_text_to_search_conversion**
> CMTextToSearchConversionReturn try_text_to_search_conversion(session_id, cm_text_to_search_conversion, api_version=api_version)

try converting text-to-search

See the results of a text-to-search conversion

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_text_to_search_conversion import CMTextToSearchConversion
from openapi_client.models.cm_text_to_search_conversion_return import CMTextToSearchConversionReturn
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
    api_instance = openapi_client.SemanticApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_text_to_search_conversion = openapi_client.CMTextToSearchConversion() # CMTextToSearchConversion | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # try converting text-to-search
        api_response = api_instance.try_text_to_search_conversion(session_id, cm_text_to_search_conversion, api_version=api_version)
        print("The response of SemanticApi->try_text_to_search_conversion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->try_text_to_search_conversion: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_text_to_search_conversion** | [**CMTextToSearchConversion**](CMTextToSearchConversion.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMTextToSearchConversionReturn**](CMTextToSearchConversionReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version1**
> CMVersion version1()

Version

Get the version of SimSage Search Services.

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
    api_instance = openapi_client.SemanticApi(api_client)

    try:
        # Version
        api_response = api_instance.version1()
        print("The response of SemanticApi->version1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SemanticApi->version1: %s\n" % e)
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

