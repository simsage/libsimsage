# openapi_client.StatsApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_index_optimization_report**](StatsApi.md#get_index_optimization_report) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report
[**get_index_optimization_reports**](StatsApi.md#get_index_optimization_reports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list
[**get_stats**](StatsApi.md#get_stats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics
[**sim_sage_status**](StatsApi.md#sim_sage_status) | **PUT** /api/stats/status/{organisationId} | SimSage status
[**system_logs**](StatsApi.md#system_logs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs
[**version**](StatsApi.md#version) | **GET** /api/stats/version | Version


# **get_index_optimization_report**
> List[OptimizeIndexesGetReportCmd] get_index_optimization_report(session_id, organisation_id, kb_id, id)

get an optimization report

return an optimization report

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.optimize_indexes_get_report_cmd import OptimizeIndexesGetReportCmd
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
    api_instance = openapi_client.StatsApi(api_client)
    session_id = 'session_id_example' # str | a valid session-guid id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    id = 56 # int | the id of the report

    try:
        # get an optimization report
        api_response = api_instance.get_index_optimization_report(session_id, organisation_id, kb_id, id)
        print("The response of StatsApi->get_index_optimization_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_index_optimization_report: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid session-guid id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **id** | **int**| the id of the report | 

### Return type

[**List[OptimizeIndexesGetReportCmd]**](OptimizeIndexesGetReportCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_index_optimization_reports**
> List[OptimizeIndexesGetReportsCmd] get_index_optimization_reports(session_id, organisation_id, kb_id)

get optimization report list

return a list of optimization reports

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.optimize_indexes_get_reports_cmd import OptimizeIndexesGetReportsCmd
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
    api_instance = openapi_client.StatsApi(api_client)
    session_id = 'session_id_example' # str | a valid session-guid id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)

    try:
        # get optimization report list
        api_response = api_instance.get_index_optimization_reports(session_id, organisation_id, kb_id)
        print("The response of StatsApi->get_index_optimization_reports:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_index_optimization_reports: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid session-guid id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 

### Return type

[**List[OptimizeIndexesGetReportsCmd]**](OptimizeIndexesGetReportsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | failed |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stats**
> CMReturnStatistics get_stats(session_id, organisation_id, kb_id, year, month, top, api_version=api_version)

Get usage Statistics

Get all statistics for a given month, including some global ones.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_return_statistics import CMReturnStatistics
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
    api_instance = openapi_client.StatsApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    kb_id = 'kb_id_example' # str | the knowledge-base (its guid id)
    year = 56 # int | the year to get stats for
    month = 56 # int | the month to get stats for
    top = 56 # int | how many stats to return
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Get usage Statistics
        api_response = api_instance.get_stats(session_id, organisation_id, kb_id, year, month, top, api_version=api_version)
        print("The response of StatsApi->get_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_stats: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 
 **kb_id** | **str**| the knowledge-base (its guid id) | 
 **year** | **int**| the year to get stats for | 
 **month** | **int**| the month to get stats for | 
 **top** | **int**| how many stats to return | 
 **api_version** | **str**|  | [optional] 

### Return type

[**CMReturnStatistics**](CMReturnStatistics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | failed |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sim_sage_status**
> List[CMCommandQueueItem] sim_sage_status(session_id, organisation_id)

SimSage status

return SimSage indexer and parser status

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_command_queue_item import CMCommandQueueItem
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
    api_instance = openapi_client.StatsApi(api_client)
    session_id = 'session_id_example' # str | a valid session-guid id.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)

    try:
        # SimSage status
        api_response = api_instance.sim_sage_status(session_id, organisation_id)
        print("The response of StatsApi->sim_sage_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->sim_sage_status: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid session-guid id. | 
 **organisation_id** | **str**| the organisation (its guid id) | 

### Return type

[**List[CMCommandQueueItem]**](CMCommandQueueItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | failed |  -  |
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_logs**
> List[CMLoggerEntry] system_logs(organisation_id, service, num_lines, session_id)

System Logs

return SimSage System-logs

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_logger_entry import CMLoggerEntry
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
    api_instance = openapi_client.StatsApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    service = 'service_example' # str | the service to get the log for
    num_lines = 56 # int | the maximum number of lines to return if > 0
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # System Logs
        api_response = api_instance.system_logs(organisation_id, service, num_lines, session_id)
        print("The response of StatsApi->system_logs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->system_logs: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **service** | **str**| the service to get the log for | 
 **num_lines** | **int**| the maximum number of lines to return if &gt; 0 | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

[**List[CMLoggerEntry]**](CMLoggerEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version**
> CMVersion version()

Version

Get the version of SimSage Stats Services.

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
    api_instance = openapi_client.StatsApi(api_client)

    try:
        # Version
        api_response = api_instance.version()
        print("The response of StatsApi->version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->version: %s\n" % e)
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

