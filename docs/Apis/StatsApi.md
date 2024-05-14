# StatsApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIndexOptimizationReport**](StatsApi.md#getIndexOptimizationReport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report |
| [**getIndexOptimizationReports**](StatsApi.md#getIndexOptimizationReports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list |
| [**getStats**](StatsApi.md#getStats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics |
| [**simSageStatus**](StatsApi.md#simSageStatus) | **PUT** /api/stats/status/{organisationId} | SimSage status |
| [**systemLogs**](StatsApi.md#systemLogs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs |
| [**version**](StatsApi.md#version) | **GET** /api/stats/version | Version |


<a name="getIndexOptimizationReport"></a>
# **getIndexOptimizationReport**
> List getIndexOptimizationReport(session-id, organisationId, kbId, id)

get an optimization report

    return an optimization report

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid session-guid id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **id** | **Long**| the id of the report | [default to null] |

### Return type

[**List**](../Models/OptimizeIndexesGetReportCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getIndexOptimizationReports"></a>
# **getIndexOptimizationReports**
> List getIndexOptimizationReports(session-id, organisationId, kbId)

get optimization report list

    return a list of optimization reports

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid session-guid id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |

### Return type

[**List**](../Models/OptimizeIndexesGetReportsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getStats"></a>
# **getStats**
> CMReturnStatistics getStats(session-id, organisationId, kbId, year, month, top, API-Version)

Get usage Statistics

    Get all statistics for a given month, including some global ones.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **year** | **Integer**| the year to get stats for | [default to null] |
| **month** | **Integer**| the month to get stats for | [default to null] |
| **top** | **Integer**| how many stats to return | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMReturnStatistics**](../Models/CMReturnStatistics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="simSageStatus"></a>
# **simSageStatus**
> List simSageStatus(session-id, organisationId)

SimSage status

    return SimSage indexer and parser status

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid session-guid id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |

### Return type

[**List**](../Models/CMCommandQueueItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="systemLogs"></a>
# **systemLogs**
> List systemLogs(organisationId, service, numLines, session-id)

System Logs

    return SimSage System-logs

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **service** | **String**| the service to get the log for | [default to null] |
| **numLines** | **Integer**| the maximum number of lines to return if &gt; 0 | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**List**](../Models/CMLoggerEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="version"></a>
# **version**
> CMVersion version()

Version

    Get the version of SimSage Stats Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

