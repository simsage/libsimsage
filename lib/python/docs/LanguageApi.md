# openapi_client.LanguageApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_default_syn_sets**](LanguageApi.md#add_default_syn_sets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets
[**delete_all_synonyms**](LanguageApi.md#delete_all_synonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms
[**delete_categorization**](LanguageApi.md#delete_categorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization
[**delete_semantic**](LanguageApi.md#delete_semantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic
[**delete_syn_set**](LanguageApi.md#delete_syn_set) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet
[**delete_synonym**](LanguageApi.md#delete_synonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym
[**find_syn_sets**](LanguageApi.md#find_syn_sets) | **PUT** /api/language/find-syn-sets | Find SynSets
[**get_categorization_list**](LanguageApi.md#get_categorization_list) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list
[**get_paginated**](LanguageApi.md#get_paginated) | **PUT** /api/language/synonyms | get Synonyms Paginated
[**get_semantics_paginated**](LanguageApi.md#get_semantics_paginated) | **PUT** /api/language/semantics | Semantics Paginated
[**optimize_indexes**](LanguageApi.md#optimize_indexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes
[**optimize_indexes_abort**](LanguageApi.md#optimize_indexes_abort) | **PUT** /api/language/optimize-indexes-abort | Abort Index Optimization
[**redact_document**](LanguageApi.md#redact_document) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document
[**save_categorization**](LanguageApi.md#save_categorization) | **PUT** /api/language/categorization | save categorization
[**save_semantic**](LanguageApi.md#save_semantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic
[**save_syn_set**](LanguageApi.md#save_syn_set) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet
[**save_synonym**](LanguageApi.md#save_synonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym
[**tune_language_graph**](LanguageApi.md#tune_language_graph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph
[**version2**](LanguageApi.md#version2) | **GET** /api/language/version | Version


# **add_default_syn_sets**
> JsonMessage add_default_syn_sets(organisation_id, kb_id, session_id, api_version=api_version)

Add all default SynSets

Add default syn-sets to the given org/kb

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Add all default SynSets
        api_response = api_instance.add_default_syn_sets(organisation_id, kb_id, session_id, api_version=api_version)
        print("The response of LanguageApi->add_default_syn_sets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->add_default_syn_sets: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
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

# **delete_all_synonyms**
> JsonMessage delete_all_synonyms(organisation_id, kb_id, session_id, api_version=api_version)

Delete All Synonyms

Delete all synonyms for a given org/kb

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base to delete/remove (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete All Synonyms
        api_response = api_instance.delete_all_synonyms(organisation_id, kb_id, session_id, api_version=api_version)
        print("The response of LanguageApi->delete_all_synonyms:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->delete_all_synonyms: %s\n" % e)
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
**200** | OK response |  -  |
**500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_categorization**
> JsonMessage delete_categorization(organisation_id, kb_id, categorization_label, session_id, api_version=api_version)

remove categorization

remove a specific categorization for a given org/kb

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    categorization_label = 'categorization_label_example' # str | the metadata (name) to remove
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # remove categorization
        api_response = api_instance.delete_categorization(organisation_id, kb_id, categorization_label, session_id, api_version=api_version)
        print("The response of LanguageApi->delete_categorization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->delete_categorization: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **categorization_label** | **str**| the metadata (name) to remove | 
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

# **delete_semantic**
> JsonMessage delete_semantic(organisation_id, kb_id, word, semantic, session_id, api_version=api_version)

Delete Semantic

Remove an existing semantic from SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    word = 'John' # str | the word (more specific item) of the semantic to delete (eg. \"John\")
    semantic = 'person' # str | the semantic of the word to delete (eg. \"person\")
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete Semantic
        api_response = api_instance.delete_semantic(organisation_id, kb_id, word, semantic, session_id, api_version=api_version)
        print("The response of LanguageApi->delete_semantic:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->delete_semantic: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **word** | **str**| the word (more specific item) of the semantic to delete (eg. \&quot;John\&quot;) | 
 **semantic** | **str**| the semantic of the word to delete (eg. \&quot;person\&quot;) | 
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

# **delete_syn_set**
> JsonMessage delete_syn_set(organisation_id, kb_id, lemma, session_id, api_version=api_version)

Delete SynSet

Remove a syn-set from SimSage by lemma.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    lemma = 'lemma_example' # str | the lemma (base word) of the syn-set to remove.
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete SynSet
        api_response = api_instance.delete_syn_set(organisation_id, kb_id, lemma, session_id, api_version=api_version)
        print("The response of LanguageApi->delete_syn_set:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->delete_syn_set: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **lemma** | **str**| the lemma (base word) of the syn-set to remove. | 
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

# **delete_synonym**
> JsonMessage delete_synonym(organisation_id, kb_id, id, session_id, api_version=api_version)

Delete Synonym

Delete a synonym using its id.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    id = 56 # int | the id of the synonym to remove.
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete Synonym
        api_response = api_instance.delete_synonym(organisation_id, kb_id, id, session_id, api_version=api_version)
        print("The response of LanguageApi->delete_synonym:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->delete_synonym: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **id** | **int**| the id of the synonym to remove. | 
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

# **find_syn_sets**
> CMSynSetList find_syn_sets(session_id, cm_syn_set_find, api_version=api_version)

Find SynSets

Find syn-sets using filters

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_syn_set_find import CMSynSetFind
from openapi_client.models.cm_syn_set_list import CMSynSetList
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
    api_instance = openapi_client.LanguageApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_syn_set_find = openapi_client.CMSynSetFind() # CMSynSetFind | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Find SynSets
        api_response = api_instance.find_syn_sets(session_id, cm_syn_set_find, api_version=api_version)
        print("The response of LanguageApi->find_syn_sets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->find_syn_sets: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_syn_set_find** | [**CMSynSetFind**](CMSynSetFind.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSynSetList**](CMSynSetList.md)

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

# **get_categorization_list**
> CMCategorizationPaginatedList get_categorization_list(organisation_id, kb_id, prev_categorization_label, page_size, session_id, api_version=api_version)

categorization list

get all categorizations for a given org/kb paginated

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_categorization_paginated_list import CMCategorizationPaginatedList
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    prev_categorization_label = 'prev_categorization_label_example' # str | the previous categorization label for pagination, or null if first page
    page_size = 56 # int | the size of the page returned
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # categorization list
        api_response = api_instance.get_categorization_list(organisation_id, kb_id, prev_categorization_label, page_size, session_id, api_version=api_version)
        print("The response of LanguageApi->get_categorization_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->get_categorization_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **prev_categorization_label** | **str**| the previous categorization label for pagination, or null if first page | 
 **page_size** | **int**| the size of the page returned | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMCategorizationPaginatedList**](CMCategorizationPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_paginated**
> CMSynonymsPaginatedResult get_paginated(session_id, cm_synonyms_paginated, api_version=api_version)

get Synonyms Paginated

return a paginated list of synonyms with optional filtering.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_synonyms_paginated import CMSynonymsPaginated
from openapi_client.models.cm_synonyms_paginated_result import CMSynonymsPaginatedResult
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
    api_instance = openapi_client.LanguageApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_synonyms_paginated = openapi_client.CMSynonymsPaginated() # CMSynonymsPaginated | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # get Synonyms Paginated
        api_response = api_instance.get_paginated(session_id, cm_synonyms_paginated, api_version=api_version)
        print("The response of LanguageApi->get_paginated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->get_paginated: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_synonyms_paginated** | [**CMSynonymsPaginated**](CMSynonymsPaginated.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSynonymsPaginatedResult**](CMSynonymsPaginatedResult.md)

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

# **get_semantics_paginated**
> CMSemanticsPaginatedResult get_semantics_paginated(session_id, cm_semantics_paginated, api_version=api_version)

Semantics Paginated

Return a paginated list of semantics with an optional filter.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_semantics_paginated import CMSemanticsPaginated
from openapi_client.models.cm_semantics_paginated_result import CMSemanticsPaginatedResult
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
    api_instance = openapi_client.LanguageApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_semantics_paginated = openapi_client.CMSemanticsPaginated() # CMSemanticsPaginated | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Semantics Paginated
        api_response = api_instance.get_semantics_paginated(session_id, cm_semantics_paginated, api_version=api_version)
        print("The response of LanguageApi->get_semantics_paginated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->get_semantics_paginated: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_semantics_paginated** | [**CMSemanticsPaginated**](CMSemanticsPaginated.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSemanticsPaginatedResult**](CMSemanticsPaginatedResult.md)

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

# **optimize_indexes**
> JsonMessage optimize_indexes(session_id, cm_optimize_index, api_version=api_version)

Optimize Indexes

Force index optimization for a the given knowledge-base, now.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_optimize_index import CMOptimizeIndex
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_optimize_index = openapi_client.CMOptimizeIndex() # CMOptimizeIndex | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Optimize Indexes
        api_response = api_instance.optimize_indexes(session_id, cm_optimize_index, api_version=api_version)
        print("The response of LanguageApi->optimize_indexes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->optimize_indexes: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_optimize_index** | [**CMOptimizeIndex**](CMOptimizeIndex.md)|  | 
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

# **optimize_indexes_abort**
> JsonMessage optimize_indexes_abort(session_id, cm_optimize_index, api_version=api_version)

Abort Index Optimization

Force index optimizer to abort a job.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_optimize_index import CMOptimizeIndex
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_optimize_index = openapi_client.CMOptimizeIndex() # CMOptimizeIndex | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Abort Index Optimization
        api_response = api_instance.optimize_indexes_abort(session_id, cm_optimize_index, api_version=api_version)
        print("The response of LanguageApi->optimize_indexes_abort:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->optimize_indexes_abort: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_optimize_index** | [**CMOptimizeIndex**](CMOptimizeIndex.md)|  | 
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

# **redact_document**
> bytearray redact_document(organisation_id, kb_id, url, entity_csv, word_csv, allow_words_csv, session_id=session_id)

Redact Document

Create a redacted version of a document as a PDF given its url.

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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    url = 'url_example' # str | the base-64 encoded (no-prefix) url of the document
    entity_csv = 'entity_csv_example' # str | a csv list of entities to redact (e.g. person,location)
    word_csv = 'word_csv_example' # str | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.)
    allow_words_csv = 'allow_words_csv_example' # str | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.)
    session_id = 'session_id_example' # str | an optional SimSage Session id. (optional)

    try:
        # Redact Document
        api_response = api_instance.redact_document(organisation_id, kb_id, url, entity_csv, word_csv, allow_words_csv, session_id=session_id)
        print("The response of LanguageApi->redact_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->redact_document: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **url** | **str**| the base-64 encoded (no-prefix) url of the document | 
 **entity_csv** | **str**| a csv list of entities to redact (e.g. person,location) | 
 **word_csv** | **str**| a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) | 
 **allow_words_csv** | **str**| a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) | 
 **session_id** | **str**| an optional SimSage Session id. | [optional] 

### Return type

**bytearray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | fail response |  -  |
**200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_categorization**
> JsonMessage save_categorization(session_id, cm_categorization, api_version=api_version)

save categorization

create or update a specific categorization for a given org/kb

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_categorization import CMCategorization
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_categorization = openapi_client.CMCategorization() # CMCategorization | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # save categorization
        api_response = api_instance.save_categorization(session_id, cm_categorization, api_version=api_version)
        print("The response of LanguageApi->save_categorization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->save_categorization: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_categorization** | [**CMCategorization**](CMCategorization.md)|  | 
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

# **save_semantic**
> JsonMessage save_semantic(organisation_id, kb_id, session_id, cm_semantic_model_edit, api_version=api_version)

Save Semantic

Create or update (save) a semantic in SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_semantic_model_edit import CMSemanticModelEdit
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_semantic_model_edit = openapi_client.CMSemanticModelEdit() # CMSemanticModelEdit | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Semantic
        api_response = api_instance.save_semantic(organisation_id, kb_id, session_id, cm_semantic_model_edit, api_version=api_version)
        print("The response of LanguageApi->save_semantic:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->save_semantic: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_semantic_model_edit** | [**CMSemanticModelEdit**](CMSemanticModelEdit.md)|  | 
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

# **save_syn_set**
> JsonMessage save_syn_set(organisation_id, kb_id, session_id, cm_syn_set, api_version=api_version)

Save SynSet

Save (update/create) a syn-set in SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_syn_set import CMSynSet
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_syn_set = openapi_client.CMSynSet() # CMSynSet | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save SynSet
        api_response = api_instance.save_syn_set(organisation_id, kb_id, session_id, cm_syn_set, api_version=api_version)
        print("The response of LanguageApi->save_syn_set:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->save_syn_set: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_syn_set** | [**CMSynSet**](CMSynSet.md)|  | 
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

# **save_synonym**
> JsonMessage save_synonym(organisation_id, kb_id, session_id, cm_synonym, api_version=api_version)

Save Synonym

Save (update/create) a synonym.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_synonym import CMSynonym
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_synonym = openapi_client.CMSynonym() # CMSynonym | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Save Synonym
        api_response = api_instance.save_synonym(organisation_id, kb_id, session_id, cm_synonym, api_version=api_version)
        print("The response of LanguageApi->save_synonym:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->save_synonym: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_synonym** | [**CMSynonym**](CMSynonym.md)|  | 
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

# **tune_language_graph**
> JsonMessage tune_language_graph(organisation_id, kb_id, session_id, api_version=api_version)

Tune Graph

Create a tuned language graph for a given organisation/knowledge-base.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
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
    api_instance = openapi_client.LanguageApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Tune Graph
        api_response = api_instance.tune_language_graph(organisation_id, kb_id, session_id, api_version=api_version)
        print("The response of LanguageApi->tune_language_graph:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->tune_language_graph: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
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

# **version2**
> CMVersion version2()

Version

Return the version of the SimSage Language Services.

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
    api_instance = openapi_client.LanguageApi(api_client)

    try:
        # Version
        api_response = api_instance.version2()
        print("The response of LanguageApi->version2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LanguageApi->version2: %s\n" % e)
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

