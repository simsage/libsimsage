# DocumentApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**document**](DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document
[**getParquetFile**](DocumentApi.md#getParquetFile) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File
[**getParquetList**](DocumentApi.md#getParquetList) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list
[**getSpreadsheet**](DocumentApi.md#getSpreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet
[**getStats1**](DocumentApi.md#getStats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics
[**inventorizeDocuments**](DocumentApi.md#inventorizeDocuments) | **POST** /api/document/inventorize | Document Inventory
[**inventorizeIndexes**](DocumentApi.md#inventorizeIndexes) | **POST** /api/document/inventorize-indexes | Index Inventory
[**preview**](DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview
[**previewHtml**](DocumentApi.md#previewHtml) | **POST** /api/document/preview/html | Preview HTML
[**queryFocussedSummarization**](DocumentApi.md#queryFocussedSummarization) | **POST** /api/document/qfs | Summarize Documents for Query
[**removeDocument**](DocumentApi.md#removeDocument) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document
[**removeParquetFile**](DocumentApi.md#removeParquetFile) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File
[**summarizeDocument**](DocumentApi.md#summarizeDocument) | **POST** /api/document/summarize/document | Summarize a document
[**version4**](DocumentApi.md#version4) | **GET** /api/document/version | Version


<a id="document"></a>
# **document**
> CMDocument document(sessionId, organisationId, kbId, url)

get Document

return a document&#39;s details given a base64 encoded url

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the document's url, base64 encoded, a unique id identifying a document.
try {
    val result : CMDocument = apiInstance.document(sessionId, organisationId, kbId, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#document")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#document")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the document&#39;s url, base64 encoded, a unique id identifying a document. |

### Return type

[**CMDocument**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getParquetFile"></a>
# **getParquetFile**
> kotlin.ByteArray getParquetFile(organisationId, kbId, dateTime, ott)

Download Parquet File

Download an inventory parquet file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val dateTime : kotlin.Long = 789 // kotlin.Long | a unix date-time specifying the exact snapshot to download
val ott : kotlin.String = ott_example // kotlin.String | a one-time token for downloading data.
try {
    val result : kotlin.ByteArray = apiInstance.getParquetFile(organisationId, kbId, dateTime, ott)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#getParquetFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#getParquetFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **dateTime** | **kotlin.Long**| a unix date-time specifying the exact snapshot to download |
 **ott** | **kotlin.String**| a one-time token for downloading data. |

### Return type

**kotlin.ByteArray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="getParquetList"></a>
# **getParquetList**
> CMParquetTimeList getParquetList(organisationId, kbId, page, pageSize, sessionId, apIVersion)

Parquet available time list

Return a list of inventory times available for download.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val page : kotlin.Int = 0 // kotlin.Int | pagination control, the page index
val pageSize : kotlin.Int = 10 // kotlin.Int | pagination control, the size of a page
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMParquetTimeList = apiInstance.getParquetList(organisationId, kbId, page, pageSize, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#getParquetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#getParquetList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **page** | **kotlin.Int**| pagination control, the page index |
 **pageSize** | **kotlin.Int**| pagination control, the size of a page |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMParquetTimeList**](CMParquetTimeList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSpreadsheet"></a>
# **getSpreadsheet**
> kotlin.ByteArray getSpreadsheet(organisationId, kbId, dateTime, ott)

Inventory breakdown Spreadsheet

Download an inventory breakdown spreadsheet for a given date-time.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val dateTime : kotlin.Long = 789 // kotlin.Long | a unix date-time specifying the exact snapshot to download
val ott : kotlin.String = ott_example // kotlin.String | a one-time token for downloading data.
try {
    val result : kotlin.ByteArray = apiInstance.getSpreadsheet(organisationId, kbId, dateTime, ott)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#getSpreadsheet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#getSpreadsheet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **dateTime** | **kotlin.Long**| a unix date-time specifying the exact snapshot to download |
 **ott** | **kotlin.String**| a one-time token for downloading data. |

### Return type

**kotlin.ByteArray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStats1"></a>
# **getStats1**
> kotlin.collections.List&lt;CMDocumentTypeFrequency&gt; getStats1(organisationId, kbId, dateTime, ott)

Document Frequency Statistics

Return a document frequency statistics report - frequencies of different document types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val dateTime : kotlin.Long = 789 // kotlin.Long | a unix date-time specifying the exact snapshot to download
val ott : kotlin.String = ott_example // kotlin.String | a one-time token for downloading data.
try {
    val result : kotlin.collections.List<CMDocumentTypeFrequency> = apiInstance.getStats1(organisationId, kbId, dateTime, ott)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#getStats1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#getStats1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **dateTime** | **kotlin.Long**| a unix date-time specifying the exact snapshot to download |
 **ott** | **kotlin.String**| a one-time token for downloading data. |

### Return type

[**kotlin.collections.List&lt;CMDocumentTypeFrequency&gt;**](CMDocumentTypeFrequency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inventorizeDocuments"></a>
# **inventorizeDocuments**
> JsonMessage inventorizeDocuments(sessionId, cmInventorizeParameters, apIVersion)

Document Inventory

Start the async inventorize process for documents of a given organisation/kb.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmInventorizeParameters : CMInventorizeParameters =  // CMInventorizeParameters | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.inventorizeDocuments(sessionId, cmInventorizeParameters, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#inventorizeDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#inventorizeDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmInventorizeParameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="inventorizeIndexes"></a>
# **inventorizeIndexes**
> JsonMessage inventorizeIndexes(sessionId, cmInventorizeParameters, apIVersion)

Index Inventory

Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmInventorizeParameters : CMInventorizeParameters =  // CMInventorizeParameters | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.inventorizeIndexes(sessionId, cmInventorizeParameters, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#inventorizeIndexes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#inventorizeIndexes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmInventorizeParameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="preview"></a>
# **preview**
> kotlin.ByteArray preview(organisationId, kbId, clientId, sessionId, urlId, page)

get Preview

get a preview for a document if available by url

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val clientId : kotlin.String = clientId_example // kotlin.String | the client-id, a persistent id identifying the remote client making this request.
val sessionId : kotlin.String = sessionId_example // kotlin.String | the session-id, the security required for making this request.
val urlId : kotlin.Int = 56 // kotlin.Int | the SimSage id for this url
val page : kotlin.Int = must be one of -1: the thumbnail image, 0: the first page view // kotlin.Int | what page to render
try {
    val result : kotlin.ByteArray = apiInstance.preview(organisationId, kbId, clientId, sessionId, urlId, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#preview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#preview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **clientId** | **kotlin.String**| the client-id, a persistent id identifying the remote client making this request. |
 **sessionId** | **kotlin.String**| the session-id, the security required for making this request. |
 **urlId** | **kotlin.Int**| the SimSage id for this url |
 **page** | **kotlin.Int**| what page to render |

### Return type

**kotlin.ByteArray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="previewHtml"></a>
# **previewHtml**
> CMGetHtml previewHtml(sessionId, cmGetHtml)

Preview HTML

get a preview HTML page for a document if available by url

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid session-guid id or a anonymous user-id.
val cmGetHtml : CMGetHtml =  // CMGetHtml | 
try {
    val result : CMGetHtml = apiInstance.previewHtml(sessionId, cmGetHtml)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#previewHtml")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#previewHtml")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid session-guid id or a anonymous user-id. |
 **cmGetHtml** | [**CMGetHtml**](CMGetHtml.md)|  |

### Return type

[**CMGetHtml**](CMGetHtml.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="queryFocussedSummarization"></a>
# **queryFocussedSummarization**
> CMQueryFocussedSummarization queryFocussedSummarization(sessionId, cmQueryFocussedSummarizationRequest, apIVersion)

Summarize Documents for Query

Summarize a set of documents given a list of urls and a query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmQueryFocussedSummarizationRequest : CMQueryFocussedSummarizationRequest =  // CMQueryFocussedSummarizationRequest | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMQueryFocussedSummarization = apiInstance.queryFocussedSummarization(sessionId, cmQueryFocussedSummarizationRequest, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#queryFocussedSummarization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#queryFocussedSummarization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmQueryFocussedSummarizationRequest** | [**CMQueryFocussedSummarizationRequest**](CMQueryFocussedSummarizationRequest.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMQueryFocussedSummarization**](CMQueryFocussedSummarization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="removeDocument"></a>
# **removeDocument**
> JsonMessage removeDocument(organisationId, kbId, url, sourceId, sessionId, apIVersion)

Remove Document

Remove/delete a document by its url.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the base-64 encoded (no-prefix) url of the document
val sourceId : kotlin.Int = 56 // kotlin.Int | the source-id of the crawler this document belongs to
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.removeDocument(organisationId, kbId, url, sourceId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#removeDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#removeDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the base-64 encoded (no-prefix) url of the document |
 **sourceId** | **kotlin.Int**| the source-id of the crawler this document belongs to |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeParquetFile"></a>
# **removeParquetFile**
> kotlin.collections.List&lt;JsonMessage&gt; removeParquetFile(organisationId, kbId, dateTime, sessionId, apIVersion)

Delete Parquet File

Remove an inventory breakdown spreadsheet/parquet file from the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val dateTime : kotlin.Long = 789 // kotlin.Long | a unix date-time specifying the exact snapshot to remove
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<JsonMessage> = apiInstance.removeParquetFile(organisationId, kbId, dateTime, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#removeParquetFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#removeParquetFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **dateTime** | **kotlin.Long**| a unix date-time specifying the exact snapshot to remove |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;JsonMessage&gt;**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="summarizeDocument"></a>
# **summarizeDocument**
> CMSingleDocumentSummary summarizeDocument(sessionId, cmSingleDocumentSummaryRequest, apIVersion)

Summarize a document

Summarize a single document using an extractive summarization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSingleDocumentSummaryRequest : CMSingleDocumentSummaryRequest =  // CMSingleDocumentSummaryRequest | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSingleDocumentSummary = apiInstance.summarizeDocument(sessionId, cmSingleDocumentSummaryRequest, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#summarizeDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#summarizeDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSingleDocumentSummaryRequest** | [**CMSingleDocumentSummaryRequest**](CMSingleDocumentSummaryRequest.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSingleDocumentSummary**](CMSingleDocumentSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="version4"></a>
# **version4**
> CMVersion version4()

Version

Get the version of SimSage Document Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentApi()
try {
    val result : CMVersion = apiInstance.version4()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentApi#version4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentApi#version4")
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

