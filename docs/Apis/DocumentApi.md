# DocumentApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**document**](DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document |
| [**getParquetFile**](DocumentApi.md#getParquetFile) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File |
| [**getParquetList**](DocumentApi.md#getParquetList) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list |
| [**getSpreadsheet**](DocumentApi.md#getSpreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet |
| [**getStats1**](DocumentApi.md#getStats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics |
| [**inventorizeDocuments**](DocumentApi.md#inventorizeDocuments) | **POST** /api/document/inventorize | Document Inventory |
| [**inventorizeIndexes**](DocumentApi.md#inventorizeIndexes) | **POST** /api/document/inventorize-indexes | Index Inventory |
| [**preview**](DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview |
| [**previewHtml**](DocumentApi.md#previewHtml) | **POST** /api/document/preview/html | Preview HTML |
| [**queryFocussedSummarization**](DocumentApi.md#queryFocussedSummarization) | **POST** /api/document/qfs | Summarize Documents for Query |
| [**removeDocument**](DocumentApi.md#removeDocument) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document |
| [**removeParquetFile**](DocumentApi.md#removeParquetFile) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File |
| [**summarizeDocument**](DocumentApi.md#summarizeDocument) | **POST** /api/document/summarize/document | Summarize a document |
| [**version4**](DocumentApi.md#version4) | **GET** /api/document/version | Version |
| [**zipSource**](DocumentApi.md#zipSource) | **POST** /api/document/zip/source | Zip source documents |


<a name="document"></a>
# **document**
> CMDocument document(session-id, organisationId, kbId, url)

get Document

    return a document&#39;s details given a base64 encoded url

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the document&#39;s url, base64 encoded, a unique id identifying a document. | [default to null] |

### Return type

[**CMDocument**](../Models/CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getParquetFile"></a>
# **getParquetFile**
> byte[] getParquetFile(ott, organisationId, kbId, dateTime)

Download Parquet File

    Download an inventory parquet file.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ott** | **String**| a one-time token for downloading data. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to download | [default to null] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

<a name="getParquetList"></a>
# **getParquetList**
> CMParquetTimeList getParquetList(organisationId, kbId, page, pageSize, session-id, API-Version)

Parquet available time list

    Return a list of inventory times available for download.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **page** | **Integer**| pagination control, the page index | [default to null] |
| **pageSize** | **Integer**| pagination control, the size of a page | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMParquetTimeList**](../Models/CMParquetTimeList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSpreadsheet"></a>
# **getSpreadsheet**
> byte[] getSpreadsheet(ott, organisationId, kbId, dateTime)

Inventory breakdown Spreadsheet

    Download an inventory breakdown spreadsheet for a given date-time.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ott** | **String**| a one-time token for downloading data. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to download | [default to null] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json

<a name="getStats1"></a>
# **getStats1**
> List getStats1(ott, organisationId, kbId, dateTime)

Document Frequency Statistics

    Return a document frequency statistics report - frequencies of different document types

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ott** | **String**| a one-time token for downloading data. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to download | [default to null] |

### Return type

[**List**](../Models/CMDocumentTypeFrequency.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="inventorizeDocuments"></a>
# **inventorizeDocuments**
> JsonMessage inventorizeDocuments(session-id, CMInventorizeParameters, API-Version)

Document Inventory

    Start the async inventorize process for documents of a given organisation/kb.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMInventorizeParameters** | [**CMInventorizeParameters**](../Models/CMInventorizeParameters.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="inventorizeIndexes"></a>
# **inventorizeIndexes**
> JsonMessage inventorizeIndexes(session-id, CMInventorizeParameters, API-Version)

Index Inventory

    Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMInventorizeParameters** | [**CMInventorizeParameters**](../Models/CMInventorizeParameters.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="preview"></a>
# **preview**
> byte[] preview(organisationId, kbId, clientId, sessionId, urlId, page)

get Preview

    get a preview for a document if available by url

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **clientId** | **String**| the client-id, a persistent id identifying the remote client making this request. | [default to null] |
| **sessionId** | **String**| the session-id, the security required for making this request. | [default to null] |
| **urlId** | **Integer**| the SimSage id for this url | [default to null] |
| **page** | **Integer**| what page to render | [default to null] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/jpeg, image/svg+xml, application/json

<a name="previewHtml"></a>
# **previewHtml**
> CMGetHtml previewHtml(session-id, CMGetHtml)

Preview HTML

    get a preview HTML page for a document if available by url

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid session-guid id or a anonymous user-id. | [default to null] |
| **CMGetHtml** | [**CMGetHtml**](../Models/CMGetHtml.md)|  | |

### Return type

[**CMGetHtml**](../Models/CMGetHtml.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="queryFocussedSummarization"></a>
# **queryFocussedSummarization**
> CMQueryFocussedSummarization queryFocussedSummarization(session-id, CMQueryFocussedSummarizationRequest, API-Version)

Summarize Documents for Query

    Summarize a set of documents given a list of urls and a query.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMQueryFocussedSummarizationRequest** | [**CMQueryFocussedSummarizationRequest**](../Models/CMQueryFocussedSummarizationRequest.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMQueryFocussedSummarization**](../Models/CMQueryFocussedSummarization.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="removeDocument"></a>
# **removeDocument**
> JsonMessage removeDocument(organisationId, kbId, url, sourceId, session-id, API-Version)

Remove Document

    Remove/delete a document by its url.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the base-64 encoded (no-prefix) url of the document | [default to null] |
| **sourceId** | **Integer**| the source-id of the crawler this document belongs to | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeParquetFile"></a>
# **removeParquetFile**
> List removeParquetFile(organisationId, kbId, dateTime, session-id, API-Version)

Delete Parquet File

    Remove an inventory breakdown spreadsheet/parquet file from the system

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to remove | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="summarizeDocument"></a>
# **summarizeDocument**
> CMSingleDocumentSummary summarizeDocument(session-id, CMSingleDocumentSummaryRequest, API-Version)

Summarize a document

    Summarize a single document using an extractive summarization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSingleDocumentSummaryRequest** | [**CMSingleDocumentSummaryRequest**](../Models/CMSingleDocumentSummaryRequest.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSingleDocumentSummary**](../Models/CMSingleDocumentSummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="version4"></a>
# **version4**
> CMVersion version4()

Version

    Get the version of SimSage Document Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="zipSource"></a>
# **zipSource**
> JsonMessage zipSource(session-id, CMZipSource, API-Version)

Zip source documents

    Zip all documents in a source on the local server.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMZipSource** | [**CMZipSource**](../Models/CMZipSource.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

