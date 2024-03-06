# \StatsApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_index_optimization_report**](StatsApi.md#get_index_optimization_report) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report
[**get_index_optimization_reports**](StatsApi.md#get_index_optimization_reports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list
[**get_stats**](StatsApi.md#get_stats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics
[**sim_sage_status**](StatsApi.md#sim_sage_status) | **PUT** /api/stats/status/{organisationId} | SimSage status
[**system_logs**](StatsApi.md#system_logs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs
[**version**](StatsApi.md#version) | **GET** /api/stats/version | Version



## get_index_optimization_report

> Vec<crate::models::OptimizeIndexesGetReportCmd> get_index_optimization_report(session_id, organisation_id, kb_id, id)
get an optimization report

return an optimization report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid session-guid id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**id** | **i64** | the id of the report | [required] |

### Return type

[**Vec<crate::models::OptimizeIndexesGetReportCmd>**](OptimizeIndexesGetReportCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_index_optimization_reports

> Vec<crate::models::OptimizeIndexesGetReportsCmd> get_index_optimization_reports(session_id, organisation_id, kb_id)
get optimization report list

return a list of optimization reports

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid session-guid id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |

### Return type

[**Vec<crate::models::OptimizeIndexesGetReportsCmd>**](OptimizeIndexesGetReportsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_stats

> crate::models::CmReturnStatistics get_stats(session_id, organisation_id, kb_id, year, month, top, api_version)
Get usage Statistics

Get all statistics for a given month, including some global ones.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**year** | **i32** | the year to get stats for | [required] |
**month** | **i32** | the month to get stats for | [required] |
**top** | **i32** | how many stats to return | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmReturnStatistics**](CMReturnStatistics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sim_sage_status

> Vec<crate::models::CmCommandQueueItem> sim_sage_status(session_id, organisation_id)
SimSage status

return SimSage indexer and parser status

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid session-guid id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |

### Return type

[**Vec<crate::models::CmCommandQueueItem>**](CMCommandQueueItem.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## system_logs

> Vec<crate::models::CmLoggerEntry> system_logs(organisation_id, service, num_lines, session_id)
System Logs

return SimSage System-logs

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**service** | **String** | the service to get the log for | [required] |
**num_lines** | **i32** | the maximum number of lines to return if > 0 | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**Vec<crate::models::CmLoggerEntry>**](CMLoggerEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version

> crate::models::CmVersion version()
Version

Get the version of SimSage Stats Services.

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::CmVersion**](CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

