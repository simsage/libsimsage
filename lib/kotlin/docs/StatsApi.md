# StatsApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndexOptimizationReport**](StatsApi.md#getIndexOptimizationReport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report
[**getIndexOptimizationReports**](StatsApi.md#getIndexOptimizationReports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list
[**getStats**](StatsApi.md#getStats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics
[**simSageStatus**](StatsApi.md#simSageStatus) | **PUT** /api/stats/status/{organisationId} | SimSage status
[**systemLogs**](StatsApi.md#systemLogs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs
[**version**](StatsApi.md#version) | **GET** /api/stats/version | Version


<a id="getIndexOptimizationReport"></a>
# **getIndexOptimizationReport**
> kotlin.collections.List&lt;OptimizeIndexesGetReportCmd&gt; getIndexOptimizationReport(sessionId, organisationId, kbId, id)

get an optimization report

return an optimization report

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid session-guid id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val id : kotlin.Long = 789 // kotlin.Long | the id of the report
try {
    val result : kotlin.collections.List<OptimizeIndexesGetReportCmd> = apiInstance.getIndexOptimizationReport(sessionId, organisationId, kbId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#getIndexOptimizationReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#getIndexOptimizationReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid session-guid id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **id** | **kotlin.Long**| the id of the report |

### Return type

[**kotlin.collections.List&lt;OptimizeIndexesGetReportCmd&gt;**](OptimizeIndexesGetReportCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndexOptimizationReports"></a>
# **getIndexOptimizationReports**
> kotlin.collections.List&lt;OptimizeIndexesGetReportsCmd&gt; getIndexOptimizationReports(sessionId, organisationId, kbId)

get optimization report list

return a list of optimization reports

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid session-guid id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
try {
    val result : kotlin.collections.List<OptimizeIndexesGetReportsCmd> = apiInstance.getIndexOptimizationReports(sessionId, organisationId, kbId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#getIndexOptimizationReports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#getIndexOptimizationReports")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid session-guid id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |

### Return type

[**kotlin.collections.List&lt;OptimizeIndexesGetReportsCmd&gt;**](OptimizeIndexesGetReportsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStats"></a>
# **getStats**
> CMReturnStatistics getStats(sessionId, organisationId, kbId, year, month, top, apIVersion)

Get usage Statistics

Get all statistics for a given month, including some global ones.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val year : kotlin.Int = 56 // kotlin.Int | the year to get stats for
val month : kotlin.Int = 56 // kotlin.Int | the month to get stats for
val top : kotlin.Int = 56 // kotlin.Int | how many stats to return
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMReturnStatistics = apiInstance.getStats(sessionId, organisationId, kbId, year, month, top, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#getStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#getStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **year** | **kotlin.Int**| the year to get stats for |
 **month** | **kotlin.Int**| the month to get stats for |
 **top** | **kotlin.Int**| how many stats to return |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMReturnStatistics**](CMReturnStatistics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="simSageStatus"></a>
# **simSageStatus**
> kotlin.collections.List&lt;CMCommandQueueItem&gt; simSageStatus(sessionId, organisationId)

SimSage status

return SimSage indexer and parser status

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid session-guid id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
try {
    val result : kotlin.collections.List<CMCommandQueueItem> = apiInstance.simSageStatus(sessionId, organisationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#simSageStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#simSageStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid session-guid id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |

### Return type

[**kotlin.collections.List&lt;CMCommandQueueItem&gt;**](CMCommandQueueItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="systemLogs"></a>
# **systemLogs**
> kotlin.collections.List&lt;CMLoggerEntry&gt; systemLogs(organisationId, service, numLines, sessionId)

System Logs

return SimSage System-logs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val service : kotlin.String = service_example // kotlin.String | the service to get the log for
val numLines : kotlin.Int = 56 // kotlin.Int | the maximum number of lines to return if > 0
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<CMLoggerEntry> = apiInstance.systemLogs(organisationId, service, numLines, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#systemLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#systemLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **service** | **kotlin.String**| the service to get the log for |
 **numLines** | **kotlin.Int**| the maximum number of lines to return if &gt; 0 |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.collections.List&lt;CMLoggerEntry&gt;**](CMLoggerEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="version"></a>
# **version**
> CMVersion version()

Version

Get the version of SimSage Stats Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
try {
    val result : CMVersion = apiInstance.version()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#version")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#version")
    e.printStackTrace()
}
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

