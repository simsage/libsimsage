# \DocumentApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**document**](DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document
[**get_parquet_file**](DocumentApi.md#get_parquet_file) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File
[**get_parquet_list**](DocumentApi.md#get_parquet_list) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list
[**get_spreadsheet**](DocumentApi.md#get_spreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet
[**get_stats1**](DocumentApi.md#get_stats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics
[**inventorize_documents**](DocumentApi.md#inventorize_documents) | **POST** /api/document/inventorize | Document Inventory
[**inventorize_indexes**](DocumentApi.md#inventorize_indexes) | **POST** /api/document/inventorize-indexes | Index Inventory
[**preview**](DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview
[**preview_html**](DocumentApi.md#preview_html) | **POST** /api/document/preview/html | Preview HTML
[**query_focussed_summarization**](DocumentApi.md#query_focussed_summarization) | **POST** /api/document/qfs | Summarize Documents for Query
[**remove_document**](DocumentApi.md#remove_document) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document
[**remove_parquet_file**](DocumentApi.md#remove_parquet_file) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File
[**summarize_document**](DocumentApi.md#summarize_document) | **POST** /api/document/summarize/document | Summarize a document
[**version4**](DocumentApi.md#version4) | **GET** /api/document/version | Version
[**zip_source**](DocumentApi.md#zip_source) | **POST** /api/document/zip/source | Zip source documents



## document

> crate::models::CmDocument document(session_id, organisation_id, kb_id, url)
get Document

return a document's details given a base64 encoded url

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the document's url, base64 encoded, a unique id identifying a document. | [required] |

### Return type

[**crate::models::CmDocument**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_parquet_file

> String get_parquet_file(ott, organisation_id, kb_id, date_time)
Download Parquet File

Download an inventory parquet file.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ott** | **String** | a one-time token for downloading data. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**date_time** | **i64** | a unix date-time specifying the exact snapshot to download | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_parquet_list

> crate::models::CmParquetTimeList get_parquet_list(organisation_id, kb_id, page, page_size, session_id, api_version)
Parquet available time list

Return a list of inventory times available for download.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**page** | **i32** | pagination control, the page index | [required] |
**page_size** | **i32** | pagination control, the size of a page | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmParquetTimeList**](CMParquetTimeList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_spreadsheet

> String get_spreadsheet(ott, organisation_id, kb_id, date_time)
Inventory breakdown Spreadsheet

Download an inventory breakdown spreadsheet for a given date-time.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ott** | **String** | a one-time token for downloading data. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**date_time** | **i64** | a unix date-time specifying the exact snapshot to download | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_stats1

> Vec<crate::models::CmDocumentTypeFrequency> get_stats1(ott, organisation_id, kb_id, date_time)
Document Frequency Statistics

Return a document frequency statistics report - frequencies of different document types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ott** | **String** | a one-time token for downloading data. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**date_time** | **i64** | a unix date-time specifying the exact snapshot to download | [required] |

### Return type

[**Vec<crate::models::CmDocumentTypeFrequency>**](CMDocumentTypeFrequency.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## inventorize_documents

> crate::models::JsonMessage inventorize_documents(session_id, cm_inventorize_parameters, api_version)
Document Inventory

Start the async inventorize process for documents of a given organisation/kb.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_inventorize_parameters** | [**CmInventorizeParameters**](CmInventorizeParameters.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## inventorize_indexes

> crate::models::JsonMessage inventorize_indexes(session_id, cm_inventorize_parameters, api_version)
Index Inventory

Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_inventorize_parameters** | [**CmInventorizeParameters**](CmInventorizeParameters.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## preview

> String preview(organisation_id, kb_id, client_id, session_id, url_id, page)
get Preview

get a preview for a document if available by url

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**client_id** | **String** | the client-id, a persistent id identifying the remote client making this request. | [required] |
**session_id** | **String** | the session-id, the security required for making this request. | [required] |
**url_id** | **i32** | the SimSage id for this url | [required] |
**page** | **i32** | what page to render | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/jpeg, image/svg+xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## preview_html

> crate::models::CmGetHtml preview_html(session_id, cm_get_html)
Preview HTML

get a preview HTML page for a document if available by url

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid session-guid id or a anonymous user-id. | [required] |
**cm_get_html** | [**CmGetHtml**](CmGetHtml.md) |  | [required] |

### Return type

[**crate::models::CmGetHtml**](CMGetHtml.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## query_focussed_summarization

> crate::models::CmQueryFocussedSummarization query_focussed_summarization(session_id, cm_query_focussed_summarization_request, api_version)
Summarize Documents for Query

Summarize a set of documents given a list of urls and a query.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_query_focussed_summarization_request** | [**CmQueryFocussedSummarizationRequest**](CmQueryFocussedSummarizationRequest.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmQueryFocussedSummarization**](CMQueryFocussedSummarization.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_document

> crate::models::JsonMessage remove_document(organisation_id, kb_id, url, source_id, session_id, api_version)
Remove Document

Remove/delete a document by its url.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the base-64 encoded (no-prefix) url of the document | [required] |
**source_id** | **i32** | the source-id of the crawler this document belongs to | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_parquet_file

> Vec<crate::models::JsonMessage> remove_parquet_file(organisation_id, kb_id, date_time, session_id, api_version)
Delete Parquet File

Remove an inventory breakdown spreadsheet/parquet file from the system

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**date_time** | **i64** | a unix date-time specifying the exact snapshot to remove | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::JsonMessage>**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## summarize_document

> crate::models::CmSingleDocumentSummary summarize_document(session_id, cm_single_document_summary_request, api_version)
Summarize a document

Summarize a single document using an extractive summarization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_single_document_summary_request** | [**CmSingleDocumentSummaryRequest**](CmSingleDocumentSummaryRequest.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSingleDocumentSummary**](CMSingleDocumentSummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version4

> crate::models::CmVersion version4()
Version

Get the version of SimSage Document Services.

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


## zip_source

> crate::models::JsonMessage zip_source(session_id, cm_zip_source, api_version)
Zip source documents

Zip all documents in a source on the local server.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_zip_source** | [**CmZipSource**](CmZipSource.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

