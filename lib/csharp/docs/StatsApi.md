# Org.OpenAPITools.Api.StatsApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetIndexOptimzationReport**](StatsApi.md#getindexoptimzationreport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report |
| [**GetIndexOptimzationReports**](StatsApi.md#getindexoptimzationreports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list |
| [**GetStats**](StatsApi.md#getstats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics |
| [**SimSageStatus**](StatsApi.md#simsagestatus) | **PUT** /api/stats/status/{organisationId} | SimSage status |
| [**SystemLogs**](StatsApi.md#systemlogs) | **GET** /api/stats/system-logs/{organisationId}/{year}/{month}/{day}/{hour}/{hours} | System Logs |
| [**Version**](StatsApi.md#version) | **GET** /api/stats/version | Version |

<a id="getindexoptimzationreport"></a>
# **GetIndexOptimzationReport**
> List&lt;OptimizeIndexesGetReportCmd&gt; GetIndexOptimzationReport (string sessionId, string organisationId, string kbId, long id)

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
    public class GetIndexOptimzationReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new StatsApi(config);
            var sessionId = "sessionId_example";  // string | a valid session-guid id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var id = 789L;  // long | the id of the report

            try
            {
                // get an optimization report
                List<OptimizeIndexesGetReportCmd> result = apiInstance.GetIndexOptimzationReport(sessionId, organisationId, kbId, id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.GetIndexOptimzationReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIndexOptimzationReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get an optimization report
    ApiResponse<List<OptimizeIndexesGetReportCmd>> response = apiInstance.GetIndexOptimzationReportWithHttpInfo(sessionId, organisationId, kbId, id);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.GetIndexOptimzationReportWithHttpInfo: " + e.Message);
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

<a id="getindexoptimzationreports"></a>
# **GetIndexOptimzationReports**
> List&lt;OptimizeIndexesGetReportsCmd&gt; GetIndexOptimzationReports (string sessionId, string organisationId, string kbId)

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
    public class GetIndexOptimzationReportsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new StatsApi(config);
            var sessionId = "sessionId_example";  // string | a valid session-guid id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)

            try
            {
                // get optimization report list
                List<OptimizeIndexesGetReportsCmd> result = apiInstance.GetIndexOptimzationReports(sessionId, organisationId, kbId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StatsApi.GetIndexOptimzationReports: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIndexOptimzationReportsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get optimization report list
    ApiResponse<List<OptimizeIndexesGetReportsCmd>> response = apiInstance.GetIndexOptimzationReportsWithHttpInfo(sessionId, organisationId, kbId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StatsApi.GetIndexOptimzationReportsWithHttpInfo: " + e.Message);
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
            config.BasePath = "https://test.simsage.ai";
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
            config.BasePath = "https://test.simsage.ai";
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
> List&lt;CMLoggerEntry&gt; SystemLogs (string organisationId, int year, int month, int day, int hour, int hours, string sessionId)

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
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new StatsApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var year = 56;  // int | the year to get the log for
            var month = 56;  // int | the month to get the log for
            var day = 56;  // int | the day to get the log for
            var hour = 56;  // int | the hour to get the log for
            var hours = 56;  // int | the number of hours to get the logs for starting at hour
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // System Logs
                List<CMLoggerEntry> result = apiInstance.SystemLogs(organisationId, year, month, day, hour, hours, sessionId);
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
    ApiResponse<List<CMLoggerEntry>> response = apiInstance.SystemLogsWithHttpInfo(organisationId, year, month, day, hour, hours, sessionId);
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
| **year** | **int** | the year to get the log for |  |
| **month** | **int** | the month to get the log for |  |
| **day** | **int** | the day to get the log for |  |
| **hour** | **int** | the hour to get the log for |  |
| **hours** | **int** | the number of hours to get the logs for starting at hour |  |
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
            config.BasePath = "https://test.simsage.ai";
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
| **200** | get the version response |  -  |
| **500** | could not get version. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

