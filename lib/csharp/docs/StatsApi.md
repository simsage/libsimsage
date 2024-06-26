# Org.OpenAPITools.Api.StatsApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetIndexOptimizationReport**](StatsApi.md#getindexoptimizationreport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report |
| [**GetIndexOptimizationReports**](StatsApi.md#getindexoptimizationreports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list |
| [**GetStats**](StatsApi.md#getstats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics |
| [**SimSageStatus**](StatsApi.md#simsagestatus) | **PUT** /api/stats/status/{organisationId} | SimSage status |
| [**SystemLogs**](StatsApi.md#systemlogs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs |
| [**Version**](StatsApi.md#version) | **GET** /api/stats/version | Version |

<a id="getindexoptimizationreport"></a>
# **GetIndexOptimizationReport**
> List&lt;OptimizeIndexesGetReportCmd&gt; GetIndexOptimizationReport (string sessionId, string organisationId, string kbId, long id)

get an optimization report

return an optimization report

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetIndexOptimizationReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new StatsApi(config);
            var sessionId = "sessionId_example";  // string | a valid session-guid id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var id = 789L;  // long | the id of the report

            try
            {
                // get an optimization report
                List<OptimizeIndexesGetReportCmd> result = apiInstance.GetIndexOptimizationReport(sessionId, organisationId, kbId, id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.GetIndexOptimizationReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIndexOptimizationReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get an optimization report
    ApiResponse<List<OptimizeIndexesGetReportCmd>> response = apiInstance.GetIndexOptimizationReportWithHttpInfo(sessionId, organisationId, kbId, id);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.GetIndexOptimizationReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid session-guid id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **id** | **long** | the id of the report |  |

### Return type

[**List&lt;OptimizeIndexesGetReportCmd&gt;**](OptimizeIndexesGetReportCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getindexoptimizationreports"></a>
# **GetIndexOptimizationReports**
> List&lt;OptimizeIndexesGetReportsCmd&gt; GetIndexOptimizationReports (string sessionId, string organisationId, string kbId)

get optimization report list

return a list of optimization reports

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetIndexOptimizationReportsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new StatsApi(config);
            var sessionId = "sessionId_example";  // string | a valid session-guid id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)

            try
            {
                // get optimization report list
                List<OptimizeIndexesGetReportsCmd> result = apiInstance.GetIndexOptimizationReports(sessionId, organisationId, kbId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.GetIndexOptimizationReports: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIndexOptimizationReportsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get optimization report list
    ApiResponse<List<OptimizeIndexesGetReportsCmd>> response = apiInstance.GetIndexOptimizationReportsWithHttpInfo(sessionId, organisationId, kbId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.GetIndexOptimizationReportsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid session-guid id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |

### Return type

[**List&lt;OptimizeIndexesGetReportsCmd&gt;**](OptimizeIndexesGetReportsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getstats"></a>
# **GetStats**
> CMReturnStatistics GetStats (string sessionId, string organisationId, string kbId, int year, int month, int top, string? aPIVersion = null)

Get usage Statistics

Get all statistics for a given month, including some global ones.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetStatsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new StatsApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var year = 56;  // int | the year to get stats for
            var month = 56;  // int | the month to get stats for
            var top = 56;  // int | how many stats to return
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get usage Statistics
                CMReturnStatistics result = apiInstance.GetStats(sessionId, organisationId, kbId, year, month, top, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.GetStats: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetStatsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get usage Statistics
    ApiResponse<CMReturnStatistics> response = apiInstance.GetStatsWithHttpInfo(sessionId, organisationId, kbId, year, month, top, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.GetStatsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **year** | **int** | the year to get stats for |  |
| **month** | **int** | the month to get stats for |  |
| **top** | **int** | how many stats to return |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="simsagestatus"></a>
# **SimSageStatus**
> List&lt;CMCommandQueueItem&gt; SimSageStatus (string sessionId, string organisationId)

SimSage status

return SimSage indexer and parser status

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SimSageStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new StatsApi(config);
            var sessionId = "sessionId_example";  // string | a valid session-guid id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)

            try
            {
                // SimSage status
                List<CMCommandQueueItem> result = apiInstance.SimSageStatus(sessionId, organisationId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.SimSageStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SimSageStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // SimSage status
    ApiResponse<List<CMCommandQueueItem>> response = apiInstance.SimSageStatusWithHttpInfo(sessionId, organisationId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.SimSageStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid session-guid id. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |

### Return type

[**List&lt;CMCommandQueueItem&gt;**](CMCommandQueueItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="systemlogs"></a>
# **SystemLogs**
> List&lt;CMLoggerEntry&gt; SystemLogs (string organisationId, string service, int numLines, string sessionId)

System Logs

return SimSage System-logs

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SystemLogsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new StatsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var service = "service_example";  // string | the service to get the log for
            var numLines = 56;  // int | the maximum number of lines to return if > 0
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // System Logs
                List<CMLoggerEntry> result = apiInstance.SystemLogs(organisationId, service, numLines, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.SystemLogs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SystemLogsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // System Logs
    ApiResponse<List<CMLoggerEntry>> response = apiInstance.SystemLogsWithHttpInfo(organisationId, service, numLines, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.SystemLogsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **service** | **string** | the service to get the log for |  |
| **numLines** | **int** | the maximum number of lines to return if &gt; 0 |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

### Return type

[**List&lt;CMLoggerEntry&gt;**](CMLoggerEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version"></a>
# **Version**
> CMVersion Version ()

Version

Get the version of SimSage Stats Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class VersionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new StatsApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.Version: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the VersionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.VersionWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.VersionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get version. |  -  |
| **200** | get the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

