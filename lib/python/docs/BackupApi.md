# openapi_client.BackupApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup
[**delete_backup**](BackupApi.md#delete_backup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup
[**get_backup**](BackupApi.md#get_backup) | **GET** /api/backup/{organisationId}/{backupId} | get backup
[**get_backup_list**](BackupApi.md#get_backup_list) | **GET** /api/backup/backups/{organisationId} | get backup list
[**restore_from_text**](BackupApi.md#restore_from_text) | **POST** /api/backup/restore | restore backup


# **backup**
> JsonMessage backup(session_id, organisation_id, regime)

create backup

Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

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
    api_instance = openapi_client.BackupApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid) to backup
    regime = 'regime_example' # str | what to backup, one of 'all' (all organisations, requires admin privileges) or 'specific' (only the given organisation)

    try:
        # create backup
        api_response = api_instance.backup(session_id, organisation_id, regime)
        print("The response of BackupApi->backup:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BackupApi->backup: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) to backup | 
 **regime** | **str**| what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation) | 

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
**200** | create backup OK response |  -  |
**500** | could not create backup. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_backup**
> List[Backup] delete_backup(session_id, organisation_id, backup_id)

remove backup

Delete a backup by ID and return list of all Backups present in this SimSage instance

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.backup import Backup
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
    api_instance = openapi_client.BackupApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid) to backup
    backup_id = 56 # int | the backup's id (along)

    try:
        # remove backup
        api_response = api_instance.delete_backup(session_id, organisation_id, backup_id)
        print("The response of BackupApi->delete_backup:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BackupApi->delete_backup: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) to backup | 
 **backup_id** | **int**| the backup&#39;s id (along) | 

### Return type

[**List[Backup]**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not remove backup |  -  |
**200** | remove backup, updated backup-list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_backup**
> Backup get_backup(session_id, organisation_id, backup_id)

get backup

return the backup data for a given backup-id

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.backup import Backup
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
    api_instance = openapi_client.BackupApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid) for access control
    backup_id = 56 # int | the backup's id (along)

    try:
        # get backup
        api_response = api_instance.get_backup(session_id, organisation_id, backup_id)
        print("The response of BackupApi->get_backup:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BackupApi->get_backup: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) for access control | 
 **backup_id** | **int**| the backup&#39;s id (along) | 

### Return type

[**Backup**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get backup. |  -  |
**200** | get backup response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_backup_list**
> List[Backup] get_backup_list(session_id, organisation_id)

get backup list

Get a list of all Backups present in this SimSage instance

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.backup import Backup
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
    api_instance = openapi_client.BackupApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid) to backup

    try:
        # get backup list
        api_response = api_instance.get_backup_list(session_id, organisation_id)
        print("The response of BackupApi->get_backup_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BackupApi->get_backup_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) to backup | 

### Return type

[**List[Backup]**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get backup-list. |  -  |
**200** | get backup-list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **restore_from_text**
> JsonMessage restore_from_text(session_id, cm_restore_from_text)

restore backup

Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_restore_from_text import CMRestoreFromText
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
    api_instance = openapi_client.BackupApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_restore_from_text = openapi_client.CMRestoreFromText() # CMRestoreFromText | 

    try:
        # restore backup
        api_response = api_instance.restore_from_text(session_id, cm_restore_from_text)
        print("The response of BackupApi->restore_from_text:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BackupApi->restore_from_text: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_restore_from_text** | [**CMRestoreFromText**](CMRestoreFromText.md)|  | 

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
**200** | restore backup OK response |  -  |
**500** | could not restore backup. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

