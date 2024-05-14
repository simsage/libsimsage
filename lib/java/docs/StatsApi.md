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


<a id="getIndexOptimizationReport"></a>
# **getIndexOptimizationReport**
> List&lt;OptimizeIndexesGetReportCmd&gt; getIndexOptimizationReport(sessionId, organisationId, kbId, id)

get an optimization report

return an optimization report

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid session-guid id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Long id = 56L; // Long | the id of the report
    try {
      List<OptimizeIndexesGetReportCmd> result = apiInstance.getIndexOptimizationReport(sessionId, organisationId, kbId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getIndexOptimizationReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid session-guid id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **id** | **Long**| the id of the report | |

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

<a id="getIndexOptimizationReports"></a>
# **getIndexOptimizationReports**
> List&lt;OptimizeIndexesGetReportsCmd&gt; getIndexOptimizationReports(sessionId, organisationId, kbId)

get optimization report list

return a list of optimization reports

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid session-guid id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    try {
      List<OptimizeIndexesGetReportsCmd> result = apiInstance.getIndexOptimizationReports(sessionId, organisationId, kbId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getIndexOptimizationReports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid session-guid id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |

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

<a id="getStats"></a>
# **getStats**
> CMReturnStatistics getStats(sessionId, organisationId, kbId, year, month, top, apIVersion)

Get usage Statistics

Get all statistics for a given month, including some global ones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer year = 56; // Integer | the year to get stats for
    Integer month = 56; // Integer | the month to get stats for
    Integer top = 56; // Integer | how many stats to return
    String apIVersion = "1"; // String | 
    try {
      CMReturnStatistics result = apiInstance.getStats(sessionId, organisationId, kbId, year, month, top, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **year** | **Integer**| the year to get stats for | |
| **month** | **Integer**| the month to get stats for | |
| **top** | **Integer**| how many stats to return | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="simSageStatus"></a>
# **simSageStatus**
> List&lt;CMCommandQueueItem&gt; simSageStatus(sessionId, organisationId)

SimSage status

return SimSage indexer and parser status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid session-guid id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    try {
      List<CMCommandQueueItem> result = apiInstance.simSageStatus(sessionId, organisationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#simSageStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid session-guid id. | |
| **organisationId** | **String**| the organisation (its guid id) | |

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

<a id="systemLogs"></a>
# **systemLogs**
> List&lt;CMLoggerEntry&gt; systemLogs(organisationId, service, numLines, sessionId)

System Logs

return SimSage System-logs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String service = "service_example"; // String | the service to get the log for
    Integer numLines = 56; // Integer | the maximum number of lines to return if > 0
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<CMLoggerEntry> result = apiInstance.systemLogs(organisationId, service, numLines, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#systemLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | |
| **service** | **String**| the service to get the log for | |
| **numLines** | **Integer**| the maximum number of lines to return if &gt; 0 | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="version"></a>
# **version**
> CMVersion version()

Version

Get the version of SimSage Stats Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    StatsApi apiInstance = new StatsApi(defaultClient);
    try {
      CMVersion result = apiInstance.version();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#version");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

