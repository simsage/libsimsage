# openapi_client.CrawlerApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crawler_delete_folder**](CrawlerApi.md#crawler_delete_folder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder
[**crawler_delete_url**](CrawlerApi.md#crawler_delete_url) | **POST** /api/crawler/external/crawler/delete-url | Delete document
[**crawler_external_document_delete**](CrawlerApi.md#crawler_external_document_delete) | **PUT** /api/crawler/external/document/delete | Remove an External Document
[**crawler_external_document_failed**](CrawlerApi.md#crawler_external_document_failed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document
[**crawler_external_document_upload**](CrawlerApi.md#crawler_external_document_upload) | **POST** /api/crawler/external/document/upload | Upload External Document
[**crawler_external_image_upload**](CrawlerApi.md#crawler_external_image_upload) | **POST** /api/crawler/external/document/upload/image | Upload External Image
[**crawler_rename_folder**](CrawlerApi.md#crawler_rename_folder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder
[**crawler_update_delta_token**](CrawlerApi.md#crawler_update_delta_token) | **POST** /api/crawler/external/crawler/delta-token | Update delta token
[**delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source
[**delete_documents**](CrawlerApi.md#delete_documents) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents
[**encrypted_communications**](CrawlerApi.md#encrypted_communications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication
[**external_crawler**](CrawlerApi.md#external_crawler) | **POST** /api/crawler/external/crawler | External Crawler
[**external_crawler_finished**](CrawlerApi.md#external_crawler_finished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler
[**external_crawler_start**](CrawlerApi.md#external_crawler_start) | **POST** /api/crawler/external/crawler/start | Start External Crawler
[**get_crawler**](CrawlerApi.md#get_crawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source
[**get_failed_documents**](CrawlerApi.md#get_failed_documents) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List
[**get_source_list**](CrawlerApi.md#get_source_list) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List
[**mark_crawl_as_delta_reset**](CrawlerApi.md#mark_crawl_as_delta_reset) | **POST** /api/crawler/external/crawler/mark-as-reset | Update delta token
[**mark_file_as_seen**](CrawlerApi.md#mark_file_as_seen) | **POST** /api/crawler/external/crawler/mark-file-as-seen | Mark file as seen
[**oidc_code**](CrawlerApi.md#oidc_code) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver
[**process_all_files**](CrawlerApi.md#process_all_files) | **POST** /api/crawler/process-all-files | Process all files of crawler/source
[**processor_schema**](CrawlerApi.md#processor_schema) | **GET** /api/crawler/processor_schema | 
[**receive_external_log_entry**](CrawlerApi.md#receive_external_log_entry) | **POST** /api/crawler/external/crawler/log | External Crawler log-entry
[**reset_source_delta**](CrawlerApi.md#reset_source_delta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token
[**sdc_schema**](CrawlerApi.md#sdc_schema) | **GET** /api/crawler/sdc_schema | 
[**start_crawler**](CrawlerApi.md#start_crawler) | **POST** /api/crawler/start | Start crawler
[**sync**](CrawlerApi.md#sync) | **POST** /api/crawler/syncgdrivegroups | 
[**test_crawler**](CrawlerApi.md#test_crawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler
[**update_crawler**](CrawlerApi.md#update_crawler) | **POST** /api/crawler/crawler | Update Source
[**version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version


# **crawler_delete_folder**
> JsonMessage crawler_delete_folder(cm_external_crawler_delete_folder, api_version=api_version)

Delete document folder

An external crawler removes a document folder.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_delete_folder import CMExternalCrawlerDeleteFolder
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_delete_folder = openapi_client.CMExternalCrawlerDeleteFolder() # CMExternalCrawlerDeleteFolder | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete document folder
        api_response = api_instance.crawler_delete_folder(cm_external_crawler_delete_folder, api_version=api_version)
        print("The response of CrawlerApi->crawler_delete_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_delete_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_delete_folder** | [**CMExternalCrawlerDeleteFolder**](CMExternalCrawlerDeleteFolder.md)|  | 
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
**200** | delete document folder update OK response |  -  |
**500** | could not delete document folder. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_delete_url**
> JsonMessage crawler_delete_url(cm_external_crawler_delete_url, api_version=api_version)

Delete document

An external crawler removes a document.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_delete_url import CMExternalCrawlerDeleteUrl
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_delete_url = openapi_client.CMExternalCrawlerDeleteUrl() # CMExternalCrawlerDeleteUrl | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete document
        api_response = api_instance.crawler_delete_url(cm_external_crawler_delete_url, api_version=api_version)
        print("The response of CrawlerApi->crawler_delete_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_delete_url: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_delete_url** | [**CMExternalCrawlerDeleteUrl**](CMExternalCrawlerDeleteUrl.md)|  | 
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
**500** | could not delete document. |  -  |
**200** | delete document update OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_external_document_delete**
> JsonMessage crawler_external_document_delete(cm_delete_document, api_version=api_version)

Remove an External Document

Remove an external crawler document from SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_delete_document import CMDeleteDocument
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_delete_document = openapi_client.CMDeleteDocument() # CMDeleteDocument | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Remove an External Document
        api_response = api_instance.crawler_external_document_delete(cm_delete_document, api_version=api_version)
        print("The response of CrawlerApi->crawler_external_document_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_external_document_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_delete_document** | [**CMDeleteDocument**](CMDeleteDocument.md)|  | 
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
**500** | could not remove external-crawler document. |  -  |
**200** | remove external-crawler document OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_external_document_failed**
> JsonMessage crawler_external_document_failed(cm_failed_source_document, api_version=api_version)

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_failed_source_document import CMFailedSourceDocument
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_failed_source_document = openapi_client.CMFailedSourceDocument() # CMFailedSourceDocument | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Upload External Document
        api_response = api_instance.crawler_external_document_failed(cm_failed_source_document, api_version=api_version)
        print("The response of CrawlerApi->crawler_external_document_failed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_external_document_failed: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_failed_source_document** | [**CMFailedSourceDocument**](CMFailedSourceDocument.md)|  | 
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
**200** | upload external-crawler document OK response |  -  |
**500** | could not start external crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_external_document_upload**
> JsonMessage crawler_external_document_upload(cm_upload_document, api_version=api_version)

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_upload_document import CMUploadDocument
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_upload_document = openapi_client.CMUploadDocument() # CMUploadDocument | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Upload External Document
        api_response = api_instance.crawler_external_document_upload(cm_upload_document, api_version=api_version)
        print("The response of CrawlerApi->crawler_external_document_upload:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_external_document_upload: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_upload_document** | [**CMUploadDocument**](CMUploadDocument.md)|  | 
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
**200** | upload external-crawler document OK response |  -  |
**500** | could not start external crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_external_image_upload**
> JsonMessage crawler_external_image_upload(cm_upload_image, api_version=api_version)

Upload External Image

An external crawler uploads an image for a document.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_upload_image import CMUploadImage
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_upload_image = openapi_client.CMUploadImage() # CMUploadImage | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Upload External Image
        api_response = api_instance.crawler_external_image_upload(cm_upload_image, api_version=api_version)
        print("The response of CrawlerApi->crawler_external_image_upload:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_external_image_upload: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_upload_image** | [**CMUploadImage**](CMUploadImage.md)|  | 
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
**500** | could not upload external-crawler document image. |  -  |
**200** | upload external-crawler document-image OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_rename_folder**
> JsonMessage crawler_rename_folder(cm_external_crawler_rename_folder, api_version=api_version)

Rename document folder

An external crawler renames a document folder.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_rename_folder import CMExternalCrawlerRenameFolder
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_rename_folder = openapi_client.CMExternalCrawlerRenameFolder() # CMExternalCrawlerRenameFolder | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Rename document folder
        api_response = api_instance.crawler_rename_folder(cm_external_crawler_rename_folder, api_version=api_version)
        print("The response of CrawlerApi->crawler_rename_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_rename_folder: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_rename_folder** | [**CMExternalCrawlerRenameFolder**](CMExternalCrawlerRenameFolder.md)|  | 
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
**500** | could not rename document folder. |  -  |
**200** | rename document folder update OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **crawler_update_delta_token**
> JsonMessage crawler_update_delta_token(cm_external_crawler_set_delta_token, api_version=api_version)

Update delta token

An external crawler updates a delta-token.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_set_delta_token import CMExternalCrawlerSetDeltaToken
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_set_delta_token = openapi_client.CMExternalCrawlerSetDeltaToken() # CMExternalCrawlerSetDeltaToken | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Update delta token
        api_response = api_instance.crawler_update_delta_token(cm_external_crawler_set_delta_token, api_version=api_version)
        print("The response of CrawlerApi->crawler_update_delta_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->crawler_update_delta_token: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_set_delta_token** | [**CMExternalCrawlerSetDeltaToken**](CMExternalCrawlerSetDeltaToken.md)|  | 
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
**500** | could not update source delta-token. |  -  |
**200** | source delta-token update OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> JsonMessage delete(organisation_id, kb_id, session_id, source_id, api_version=api_version)

Delete source

Remove a source and all its content by its source-id.

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
    api_instance = openapi_client.CrawlerApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    source_id = 56 # int | the crawler's id
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete source
        api_response = api_instance.delete(organisation_id, kb_id, session_id, source_id, api_version=api_version)
        print("The response of CrawlerApi->delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **source_id** | **int**| the crawler&#39;s id | 
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
**200** | remove a source OK response |  -  |
**500** | could not remove source. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_documents**
> CMSource delete_documents(organisation_id, kb_id, session_id, source_id, api_version=api_version)

Delete source's documents

Remove a source's documents and stop the crawler if it's running.  Return an updated sources.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    source_id = 56 # int | the crawler's id
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Delete source's documents
        api_response = api_instance.delete_documents(organisation_id, kb_id, session_id, source_id, api_version=api_version)
        print("The response of CrawlerApi->delete_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->delete_documents: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **source_id** | **int**| the crawler&#39;s id | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not remove a source&#39;s documents. |  -  |
**200** | updated source response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encrypted_communications**
> JsonMessage encrypted_communications(seed, body, api_version=api_version)

Secure Communication

Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

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
    api_instance = openapi_client.CrawlerApi(api_client)
    seed = 56 # int | a random integer used for the communications
    body = 'body_example' # str | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Secure Communication
        api_response = api_instance.encrypted_communications(seed, body, api_version=api_version)
        print("The response of CrawlerApi->encrypted_communications:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->encrypted_communications: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seed** | **int**| a random integer used for the communications | 
 **body** | **str**|  | 
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
**200** | secure communication result (various) |  -  |
**500** | could not execute command. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **external_crawler**
> CMSource external_crawler(cm_external_crawler, api_version=api_version)

External Crawler

Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler import CMExternalCrawler
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler = openapi_client.CMExternalCrawler() # CMExternalCrawler | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # External Crawler
        api_response = api_instance.external_crawler(cm_external_crawler, api_version=api_version)
        print("The response of CrawlerApi->external_crawler:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->external_crawler: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler** | [**CMExternalCrawler**](CMExternalCrawler.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | external-crawler source response |  -  |
**500** | could not get external crawler source. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **external_crawler_finished**
> JsonMessage external_crawler_finished(cm_external_crawler_stop, api_version=api_version)

Stop External Crawler

An external crawler notifies SimSage it has finished its job, its run through the data once.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_stop import CMExternalCrawlerStop
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_stop = openapi_client.CMExternalCrawlerStop() # CMExternalCrawlerStop | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Stop External Crawler
        api_response = api_instance.external_crawler_finished(cm_external_crawler_stop, api_version=api_version)
        print("The response of CrawlerApi->external_crawler_finished:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->external_crawler_finished: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_stop** | [**CMExternalCrawlerStop**](CMExternalCrawlerStop.md)|  | 
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
**200** | external-crawler stop OK response |  -  |
**500** | could not stop external crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **external_crawler_start**
> JsonMessage external_crawler_start(cm_external_crawler_start, api_version=api_version)

Start External Crawler

An external crawler notifies SimSage is it starting a new run.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_start import CMExternalCrawlerStart
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_start = openapi_client.CMExternalCrawlerStart() # CMExternalCrawlerStart | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Start External Crawler
        api_response = api_instance.external_crawler_start(cm_external_crawler_start, api_version=api_version)
        print("The response of CrawlerApi->external_crawler_start:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->external_crawler_start: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_start** | [**CMExternalCrawlerStart**](CMExternalCrawlerStart.md)|  | 
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
**200** | external-crawler start OK response |  -  |
**500** | could not start external crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_crawler**
> CMSource get_crawler(organisation_id, kb_id, source_id, session_id, api_version=api_version)

Get source

Return the data-structure for a source by id.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    source_id = 56 # int | the crawler's id
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get source
        api_response = api_instance.get_crawler(organisation_id, kb_id, source_id, session_id, api_version=api_version)
        print("The response of CrawlerApi->get_crawler:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->get_crawler: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **source_id** | **int**| the crawler&#39;s id | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the source |  -  |
**500** | could not get source. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_failed_documents**
> List[CMSource] get_failed_documents(session_id, organisation_id, kb_id, source_id, page, page_size, api_version=api_version)

Get source List

Get a list of failed documents for a source.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    source_id = 'source_id_example' # str | the source  id (a number)
    page = 56 # int | the page number for the list
    page_size = 56 # int | the page size for the list
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get source List
        api_response = api_instance.get_failed_documents(session_id, organisation_id, kb_id, source_id, page, page_size, api_version=api_version)
        print("The response of CrawlerApi->get_failed_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->get_failed_documents: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **source_id** | **str**| the source  id (a number) | 
 **page** | **int**| the page number for the list | 
 **page_size** | **int**| the page size for the list | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMSource]**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | source list response |  -  |
**500** | could not get source list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_source_list**
> List[CMSource] get_source_list(session_id, organisation_id, kb_id, api_version=api_version)

Get source List

Get a list of sources for a given organisation / knowledge base.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get source List
        api_response = api_instance.get_source_list(session_id, organisation_id, kb_id, api_version=api_version)
        print("The response of CrawlerApi->get_source_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->get_source_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **api_version** | **str**|  | [optional] 

### Return type

[**List[CMSource]**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | source list response |  -  |
**500** | could not get source list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mark_crawl_as_delta_reset**
> JsonMessage mark_crawl_as_delta_reset(cm_external_mark_reset_crawl, api_version=api_version)

Update delta token

An external crawler marks a source as delta reset required.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_mark_reset_crawl import CMExternalMarkResetCrawl
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_mark_reset_crawl = openapi_client.CMExternalMarkResetCrawl() # CMExternalMarkResetCrawl | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Update delta token
        api_response = api_instance.mark_crawl_as_delta_reset(cm_external_mark_reset_crawl, api_version=api_version)
        print("The response of CrawlerApi->mark_crawl_as_delta_reset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->mark_crawl_as_delta_reset: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_mark_reset_crawl** | [**CMExternalMarkResetCrawl**](CMExternalMarkResetCrawl.md)|  | 
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
**500** | could not mark source as reset requested. |  -  |
**200** | source delta-token reset OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mark_file_as_seen**
> JsonMessage mark_file_as_seen(cm_external_crawler_mark_file_as_seen, api_version=api_version)

Mark file as seen

An external crawler marks a file as seen.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_crawler_mark_file_as_seen import CMExternalCrawlerMarkFileAsSeen
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_crawler_mark_file_as_seen = openapi_client.CMExternalCrawlerMarkFileAsSeen() # CMExternalCrawlerMarkFileAsSeen | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Mark file as seen
        api_response = api_instance.mark_file_as_seen(cm_external_crawler_mark_file_as_seen, api_version=api_version)
        print("The response of CrawlerApi->mark_file_as_seen:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->mark_file_as_seen: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_crawler_mark_file_as_seen** | [**CMExternalCrawlerMarkFileAsSeen**](CMExternalCrawlerMarkFileAsSeen.md)|  | 
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
**500** | could not mark file as seen. |  -  |
**200** | mark file as seen OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oidc_code**
> oidc_code(oidc_key, all_request_params)

OIDC code receiver

used for OIDC systems to receive codes

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
    api_instance = openapi_client.CrawlerApi(api_client)
    oidc_key = 'oidc_key_example' # str | the Dropbox OIDC key
    all_request_params = {'key': 'all_request_params_example'} # Dict[str, str] | 

    try:
        # OIDC code receiver
        api_instance.oidc_code(oidc_key, all_request_params)
    except Exception as e:
        print("Exception when calling CrawlerApi->oidc_code: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oidc_key** | **str**| the Dropbox OIDC key | 
 **all_request_params** | [**Dict[str, str]**](str.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response |  -  |
**401** | something went wrong with the OIDC request set-up. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **process_all_files**
> JsonMessage process_all_files(session_id, cm_start_crawler, api_version=api_version)

Process all files of crawler/source

Start and force processing all files for a crawler/source

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_start_crawler import CMStartCrawler
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_start_crawler = openapi_client.CMStartCrawler() # CMStartCrawler | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Process all files of crawler/source
        api_response = api_instance.process_all_files(session_id, cm_start_crawler, api_version=api_version)
        print("The response of CrawlerApi->process_all_files:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->process_all_files: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_start_crawler** | [**CMStartCrawler**](CMStartCrawler.md)|  | 
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
**200** | start processing all OK response |  -  |
**500** | could not start processing files. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **processor_schema**
> object processor_schema()



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
    api_instance = openapi_client.CrawlerApi(api_client)

    try:
        api_response = api_instance.processor_schema()
        print("The response of CrawlerApi->processor_schema:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->processor_schema: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

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

# **receive_external_log_entry**
> CMSource receive_external_log_entry(cm_external_log_entry, api_version=api_version)

External Crawler log-entry

An external crawler sends a log entry to SimSage.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_external_log_entry import CMExternalLogEntry
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    cm_external_log_entry = openapi_client.CMExternalLogEntry() # CMExternalLogEntry | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # External Crawler log-entry
        api_response = api_instance.receive_external_log_entry(cm_external_log_entry, api_version=api_version)
        print("The response of CrawlerApi->receive_external_log_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->receive_external_log_entry: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_external_log_entry** | [**CMExternalLogEntry**](CMExternalLogEntry.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**500** | could not get write log-entry / log-entry invalid. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_source_delta**
> CMSource reset_source_delta(session_id, organisation_id, kb_id, source_id, api_version=api_version)

Reset Source delta-token

reset a SimSage source's delta token.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    source_id = 56 # int | the crawler's id
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Reset Source delta-token
        api_response = api_instance.reset_source_delta(session_id, organisation_id, kb_id, source_id, api_version=api_version)
        print("The response of CrawlerApi->reset_source_delta:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->reset_source_delta: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **source_id** | **int**| the crawler&#39;s id | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not reset source delta-token. |  -  |
**200** | reset delta response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sdc_schema**
> object sdc_schema()



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
    api_instance = openapi_client.CrawlerApi(api_client)

    try:
        api_response = api_instance.sdc_schema()
        print("The response of CrawlerApi->sdc_schema:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->sdc_schema: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

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

# **start_crawler**
> JsonMessage start_crawler(session_id, cm_start_crawler, api_version=api_version)

Start crawler

Start a crawler by source-id if after it has stopped.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_start_crawler import CMStartCrawler
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_start_crawler = openapi_client.CMStartCrawler() # CMStartCrawler | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Start crawler
        api_response = api_instance.start_crawler(session_id, cm_start_crawler, api_version=api_version)
        print("The response of CrawlerApi->start_crawler:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->start_crawler: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_start_crawler** | [**CMStartCrawler**](CMStartCrawler.md)|  | 
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
**200** | start crawler OK response |  -  |
**500** | could not start crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sync**
> object sync(session_id, cm_sync_g_drive)



### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_sync_g_drive import CMSyncGDrive
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_sync_g_drive = openapi_client.CMSyncGDrive() # CMSyncGDrive | 

    try:
        api_response = api_instance.sync(session_id, cm_sync_g_drive)
        print("The response of CrawlerApi->sync:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->sync: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_sync_g_drive** | [**CMSyncGDrive**](CMSyncGDrive.md)|  | 

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

# **test_crawler**
> JsonMessage test_crawler(session_id, organisation_id, kb_id, source_id, api_version=api_version)

Test Crawler

Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    kb_id = 'kb_id_example' # str | the knowledge-base's id (a guid)
    source_id = 56 # int | the crawler's id
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Test Crawler
        api_response = api_instance.test_crawler(session_id, organisation_id, kb_id, source_id, api_version=api_version)
        print("The response of CrawlerApi->test_crawler:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->test_crawler: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **kb_id** | **str**| the knowledge-base&#39;s id (a guid) | 
 **source_id** | **int**| the crawler&#39;s id | 
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
**500** | could not test crawler. |  -  |
**200** | test crawler connection OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_crawler**
> CMSource update_crawler(session_id, cm_source, api_version=api_version)

Update Source

Save (create or update) a SimSage source.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_source import CMSource
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
    api_instance = openapi_client.CrawlerApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_source = openapi_client.CMSource() # CMSource | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Update Source
        api_response = api_instance.update_crawler(session_id, cm_source, api_version=api_version)
        print("The response of CrawlerApi->update_crawler:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->update_crawler: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_source** | [**CMSource**](CMSource.md)|  | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | save source response |  -  |
**500** | could not save source. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version6**
> CMVersion version6()

Version

Get the version of SimSage crawler-services.

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
    api_instance = openapi_client.CrawlerApi(api_client)

    try:
        # Version
        api_response = api_instance.version6()
        print("The response of CrawlerApi->version6:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CrawlerApi->version6: %s\n" % e)
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

