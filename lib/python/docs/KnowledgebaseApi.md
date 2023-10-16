# openapi_client.KnowledgebaseApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**export_knowledge_base**](KnowledgebaseApi.md#export_knowledge_base) | **POST** /api/knowledgebase/export | export Knowledge-base
[**get_knowledge_base**](KnowledgebaseApi.md#get_knowledge_base) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base
[**get_knowledge_bases**](KnowledgebaseApi.md#get_knowledge_bases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases
[**get_search_info**](KnowledgebaseApi.md#get_search_info) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info
[**get_search_info2**](KnowledgebaseApi.md#get_search_info2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated]
[**remove_knowledge_base**](KnowledgebaseApi.md#remove_knowledge_base) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base
[**update_knowledge_base**](KnowledgebaseApi.md#update_knowledge_base) | **PUT** /api/knowledgebase/save | Save Knowledge-base
[**version3**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version


# **export_knowledge_base**
> JsonMessage export_knowledge_base(session_id, cm_knowledge_base_export, api_version=api_version)

export Knowledge-base

starts the export of a knowledge-base using the passed in exporter config

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_knowledge_base_export import CMKnowledgeBaseExport
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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_knowledge_base_export = openapi_client.CMKnowledgeBaseExport() # CMKnowledgeBaseExport | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # export Knowledge-base
        api_response = api_instance.export_knowledge_base(session_id, cm_knowledge_base_export, api_version=api_version)
        print("The response of KnowledgebaseApi->export_knowledge_base:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->export_knowledge_base: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_knowledge_base_export** | [**CMKnowledgeBaseExport**](CMKnowledgeBaseExport.md)|  | 
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
**200** | export knowledge-base OK response |  -  |
**500** | could not get search info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_knowledge_base**
> CMKnowledgeBase get_knowledge_base(organisation_id, kb_id, session_id, api_version=api_version)

Get Knowledge-base

Return a knowledge base by id.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_knowledge_base import CMKnowledgeBase
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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base to get (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get Knowledge-base
        api_response = api_instance.get_knowledge_base(organisation_id, kb_id, session_id, api_version=api_version)
        print("The response of KnowledgebaseApi->get_knowledge_base:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->get_knowledge_base: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base to get (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMKnowledgeBase**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get knowledge-base response |  -  |
**500** | could not get knowledge-base. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_knowledge_bases**
> List[CMKnowledgeBase] get_knowledge_bases(organisation_id, session_id)

Get Knowledge-bases

Return a list of knowledge bases for a given organisation.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_knowledge_base import CMKnowledgeBase
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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get Knowledge-bases
        api_response = api_instance.get_knowledge_bases(organisation_id, session_id)
        print("The response of KnowledgebaseApi->get_knowledge_bases:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->get_knowledge_bases: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

[**List[CMKnowledgeBase]**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get knowledge-base list. |  -  |
**200** | get knowledge-base list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_search_info**
> CMInfo get_search_info(organisation_id, client_id, api_version=api_version)

Search Info

return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_info import CMInfo
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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    client_id = 'client_id_example' # str | the client's id (its guid id), pre-register this client as a known client.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Search Info
        api_response = api_instance.get_search_info(organisation_id, client_id, api_version=api_version)
        print("The response of KnowledgebaseApi->get_search_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->get_search_info: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **client_id** | **str**| the client&#39;s id (its guid id), pre-register this client as a known client. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get search info response |  -  |
**500** | could not get search info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_search_info2**
> CMInfo get_search_info2(organisation_id, api_version=api_version)

Search Info [deprecated]

Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_info import CMInfo
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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Search Info [deprecated]
        api_response = api_instance.get_search_info2(organisation_id, api_version=api_version)
        print("The response of KnowledgebaseApi->get_search_info2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->get_search_info2: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get search info response |  -  |
**500** | could not get search info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_knowledge_base**
> JsonMessage remove_knowledge_base(organisation_id, kb_id, session_id, api_version=api_version)

Delete Knowledge-base

Delete a knowledge-base by Id.

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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base to delete/remove (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete Knowledge-base
        api_response = api_instance.remove_knowledge_base(organisation_id, kb_id, session_id, api_version=api_version)
        print("The response of KnowledgebaseApi->remove_knowledge_base:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->remove_knowledge_base: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base to delete/remove (its guid id) | 
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
**200** | delete knowledge-base OK response |  -  |
**500** | could not delete knowledge-base. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_knowledge_base**
> KnowledgeBase update_knowledge_base(session_id, cm_knowledge_base, api_version=api_version)

Save Knowledge-base

Save (Create or Update) a SimSage knowledge base item.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_knowledge_base import CMKnowledgeBase
from openapi_client.models.knowledge_base import KnowledgeBase
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
    api_instance = openapi_client.KnowledgebaseApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_knowledge_base = openapi_client.CMKnowledgeBase() # CMKnowledgeBase | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Knowledge-base
        api_response = api_instance.update_knowledge_base(session_id, cm_knowledge_base, api_version=api_version)
        print("The response of KnowledgebaseApi->update_knowledge_base:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->update_knowledge_base: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_knowledge_base** | [**CMKnowledgeBase**](CMKnowledgeBase.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**KnowledgeBase**](KnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not save knowledge-base. |  -  |
**200** | save knowledge-base response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version3**
> CMVersion version3()

Version

Return the version of SimSage knowledge-base Services.

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
    api_instance = openapi_client.KnowledgebaseApi(api_client)

    try:
        # Version
        api_response = api_instance.version3()
        print("The response of KnowledgebaseApi->version3:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KnowledgebaseApi->version3: %s\n" % e)
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

