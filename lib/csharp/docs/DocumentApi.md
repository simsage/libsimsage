# Org.OpenAPITools.Api.DocumentApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**Document**](DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document |
| [**GetParquetFile**](DocumentApi.md#getparquetfile) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File |
| [**GetParquetList**](DocumentApi.md#getparquetlist) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list |
| [**GetSpreadsheet**](DocumentApi.md#getspreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet |
| [**GetStats1**](DocumentApi.md#getstats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics |
| [**InventorizeDocuments**](DocumentApi.md#inventorizedocuments) | **POST** /api/document/inventorize | Document Inventory |
| [**InventorizeIndexes**](DocumentApi.md#inventorizeindexes) | **POST** /api/document/inventorize-indexes | Index Inventory |
| [**Preview**](DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview |
| [**PreviewHtml**](DocumentApi.md#previewhtml) | **POST** /api/document/preview/html | Preview HTML |
| [**QueryFocussedSummarization**](DocumentApi.md#queryfocussedsummarization) | **POST** /api/document/qfs | Summarize Documents for Query |
| [**RemoveDocument**](DocumentApi.md#removedocument) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document |
| [**RemoveParquetFile**](DocumentApi.md#removeparquetfile) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File |
| [**SummarizeDocument**](DocumentApi.md#summarizedocument) | **POST** /api/document/summarize/document | Summarize a document |
| [**Version4**](DocumentApi.md#version4) | **GET** /api/document/version | Version |
| [**ZipSource**](DocumentApi.md#zipsource) | **POST** /api/document/zip/source | Zip source documents |

<a id="document"></a>
# **Document**
> CMDocument Document (string sessionId, string organisationId, string kbId, string url)

get Document

return a document's details given a base64 encoded url

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the document's url, base64 encoded, a unique id identifying a document.

            try
            {
                // get Document
                CMDocument result = apiInstance.Document(sessionId, organisationId, kbId, url);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.Document: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Document
    ApiResponse<CMDocument> response = apiInstance.DocumentWithHttpInfo(sessionId, organisationId, kbId, url);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.DocumentWithHttpInfo: " + e.Message);
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
| **url** | **string** | the document&#39;s url, base64 encoded, a unique id identifying a document. |  |

### Return type

[**CMDocument**](CMDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | document object response |  -  |
| **500** | could not get document. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getparquetfile"></a>
# **GetParquetFile**
> byte[] GetParquetFile (string ott, string organisationId, string kbId, long dateTime)

Download Parquet File

Download an inventory parquet file.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetParquetFileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var ott = "ott_example";  // string | a one-time token for downloading data.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var dateTime = 789L;  // long | a unix date-time specifying the exact snapshot to download

            try
            {
                // Download Parquet File
                byte[] result = apiInstance.GetParquetFile(ott, organisationId, kbId, dateTime);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.GetParquetFile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetParquetFileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Download Parquet File
    ApiResponse<byte[]> response = apiInstance.GetParquetFileWithHttpInfo(ott, organisationId, kbId, dateTime);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.GetParquetFileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ott** | **string** | a one-time token for downloading data. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **dateTime** | **long** | a unix date-time specifying the exact snapshot to download |  |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | parquet download response |  -  |
| **500** | could not get parquet download. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getparquetlist"></a>
# **GetParquetList**
> CMParquetTimeList GetParquetList (string organisationId, string kbId, int page, int pageSize, string sessionId, string? aPIVersion = null)

Parquet available time list

Return a list of inventory times available for download.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetParquetListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var page = 0;  // int | pagination control, the page index
            var pageSize = 10;  // int | pagination control, the size of a page
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Parquet available time list
                CMParquetTimeList result = apiInstance.GetParquetList(organisationId, kbId, page, pageSize, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.GetParquetList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetParquetListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Parquet available time list
    ApiResponse<CMParquetTimeList> response = apiInstance.GetParquetListWithHttpInfo(organisationId, kbId, page, pageSize, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.GetParquetListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **page** | **int** | pagination control, the page index |  |
| **pageSize** | **int** | pagination control, the size of a page |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**CMParquetTimeList**](CMParquetTimeList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get parquet list. |  -  |
| **200** | parquet list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getspreadsheet"></a>
# **GetSpreadsheet**
> byte[] GetSpreadsheet (string ott, string organisationId, string kbId, long dateTime)

Inventory breakdown Spreadsheet

Download an inventory breakdown spreadsheet for a given date-time.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSpreadsheetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var ott = "ott_example";  // string | a one-time token for downloading data.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var dateTime = 789L;  // long | a unix date-time specifying the exact snapshot to download

            try
            {
                // Inventory breakdown Spreadsheet
                byte[] result = apiInstance.GetSpreadsheet(ott, organisationId, kbId, dateTime);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.GetSpreadsheet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSpreadsheetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Inventory breakdown Spreadsheet
    ApiResponse<byte[]> response = apiInstance.GetSpreadsheetWithHttpInfo(ott, organisationId, kbId, dateTime);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.GetSpreadsheetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ott** | **string** | a one-time token for downloading data. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **dateTime** | **long** | a unix date-time specifying the exact snapshot to download |  |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get inventory spreadsheet. |  -  |
| **200** | inventory spreadsheet response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getstats1"></a>
# **GetStats1**
> List&lt;CMDocumentTypeFrequency&gt; GetStats1 (string ott, string organisationId, string kbId, long dateTime)

Document Frequency Statistics

Return a document frequency statistics report - frequencies of different document types

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetStats1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var ott = "ott_example";  // string | a one-time token for downloading data.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var dateTime = 789L;  // long | a unix date-time specifying the exact snapshot to download

            try
            {
                // Document Frequency Statistics
                List<CMDocumentTypeFrequency> result = apiInstance.GetStats1(ott, organisationId, kbId, dateTime);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.GetStats1: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetStats1WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Document Frequency Statistics
    ApiResponse<List<CMDocumentTypeFrequency>> response = apiInstance.GetStats1WithHttpInfo(ott, organisationId, kbId, dateTime);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.GetStats1WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ott** | **string** | a one-time token for downloading data. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **dateTime** | **long** | a unix date-time specifying the exact snapshot to download |  |

### Return type

[**List&lt;CMDocumentTypeFrequency&gt;**](CMDocumentTypeFrequency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | document statistic response |  -  |
| **500** | could not get document statistics. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="inventorizedocuments"></a>
# **InventorizeDocuments**
> JsonMessage InventorizeDocuments (string sessionId, CMInventorizeParameters cMInventorizeParameters, string? aPIVersion = null)

Document Inventory

Start the async inventorize process for documents of a given organisation/kb.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class InventorizeDocumentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMInventorizeParameters = new CMInventorizeParameters(); // CMInventorizeParameters | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Document Inventory
                JsonMessage result = apiInstance.InventorizeDocuments(sessionId, cMInventorizeParameters, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.InventorizeDocuments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the InventorizeDocumentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Document Inventory
    ApiResponse<JsonMessage> response = apiInstance.InventorizeDocumentsWithHttpInfo(sessionId, cMInventorizeParameters, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.InventorizeDocumentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMInventorizeParameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not start inventory process. |  -  |
| **200** | document inventory process OK result |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="inventorizeindexes"></a>
# **InventorizeIndexes**
> JsonMessage InventorizeIndexes (string sessionId, CMInventorizeParameters cMInventorizeParameters, string? aPIVersion = null)

Index Inventory

Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class InventorizeIndexesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMInventorizeParameters = new CMInventorizeParameters(); // CMInventorizeParameters | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Index Inventory
                JsonMessage result = apiInstance.InventorizeIndexes(sessionId, cMInventorizeParameters, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.InventorizeIndexes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the InventorizeIndexesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Index Inventory
    ApiResponse<JsonMessage> response = apiInstance.InventorizeIndexesWithHttpInfo(sessionId, cMInventorizeParameters, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.InventorizeIndexesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMInventorizeParameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | start inventorize indexes OK response |  -  |
| **500** | could not start inventorize. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="preview"></a>
# **Preview**
> byte[] Preview (string organisationId, string kbId, string clientId, string sessionId, int urlId, int page)

get Preview

get a preview for a document if available by url

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PreviewExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var clientId = "clientId_example";  // string | the client-id, a persistent id identifying the remote client making this request.
            var sessionId = "sessionId_example";  // string | the session-id, the security required for making this request.
            var urlId = 56;  // int | the SimSage id for this url
            var page = must be one of -1: the thumbnail image, 0: the first page view;  // int | what page to render

            try
            {
                // get Preview
                byte[] result = apiInstance.Preview(organisationId, kbId, clientId, sessionId, urlId, page);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.Preview: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PreviewWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Preview
    ApiResponse<byte[]> response = apiInstance.PreviewWithHttpInfo(organisationId, kbId, clientId, sessionId, urlId, page);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.PreviewWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **clientId** | **string** | the client-id, a persistent id identifying the remote client making this request. |  |
| **sessionId** | **string** | the session-id, the security required for making this request. |  |
| **urlId** | **int** | the SimSage id for this url |  |
| **page** | **int** | what page to render |  |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpeg, image/svg+xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | image response |  -  |
| **500** | could not get image. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="previewhtml"></a>
# **PreviewHtml**
> CMGetHtml PreviewHtml (string sessionId, CMGetHtml cMGetHtml)

Preview HTML

get a preview HTML page for a document if available by url

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PreviewHtmlExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid session-guid id or a anonymous user-id.
            var cMGetHtml = new CMGetHtml(); // CMGetHtml | 

            try
            {
                // Preview HTML
                CMGetHtml result = apiInstance.PreviewHtml(sessionId, cMGetHtml);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.PreviewHtml: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PreviewHtmlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Preview HTML
    ApiResponse<CMGetHtml> response = apiInstance.PreviewHtmlWithHttpInfo(sessionId, cMGetHtml);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.PreviewHtmlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid session-guid id or a anonymous user-id. |  |
| **cMGetHtml** | [**CMGetHtml**](CMGetHtml.md) |  |  |

### Return type

[**CMGetHtml**](CMGetHtml.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get preview HTML. |  -  |
| **200** | get preview HTML response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="queryfocussedsummarization"></a>
# **QueryFocussedSummarization**
> CMQueryFocussedSummarization QueryFocussedSummarization (string sessionId, CMQueryFocussedSummarizationRequest cMQueryFocussedSummarizationRequest, string? aPIVersion = null)

Summarize Documents for Query

Summarize a set of documents given a list of urls and a query.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class QueryFocussedSummarizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMQueryFocussedSummarizationRequest = new CMQueryFocussedSummarizationRequest(); // CMQueryFocussedSummarizationRequest | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Summarize Documents for Query
                CMQueryFocussedSummarization result = apiInstance.QueryFocussedSummarization(sessionId, cMQueryFocussedSummarizationRequest, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.QueryFocussedSummarization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QueryFocussedSummarizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Summarize Documents for Query
    ApiResponse<CMQueryFocussedSummarization> response = apiInstance.QueryFocussedSummarizationWithHttpInfo(sessionId, cMQueryFocussedSummarizationRequest, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.QueryFocussedSummarizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMQueryFocussedSummarizationRequest** | [**CMQueryFocussedSummarizationRequest**](CMQueryFocussedSummarizationRequest.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**CMQueryFocussedSummarization**](CMQueryFocussedSummarization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get focussed summarization. |  -  |
| **200** | query focussed summarization response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="removedocument"></a>
# **RemoveDocument**
> JsonMessage RemoveDocument (string organisationId, string kbId, string url, int sourceId, string sessionId, string? aPIVersion = null)

Remove Document

Remove/delete a document by its url.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RemoveDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the base-64 encoded (no-prefix) url of the document
            var sourceId = 56;  // int | the source-id of the crawler this document belongs to
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Remove Document
                JsonMessage result = apiInstance.RemoveDocument(organisationId, kbId, url, sourceId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.RemoveDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RemoveDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove Document
    ApiResponse<JsonMessage> response = apiInstance.RemoveDocumentWithHttpInfo(organisationId, kbId, url, sourceId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.RemoveDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **url** | **string** | the base-64 encoded (no-prefix) url of the document |  |
| **sourceId** | **int** | the source-id of the crawler this document belongs to |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | remove document OK response |  -  |
| **500** | could not remove document. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="removeparquetfile"></a>
# **RemoveParquetFile**
> List&lt;JsonMessage&gt; RemoveParquetFile (string organisationId, string kbId, long dateTime, string sessionId, string? aPIVersion = null)

Delete Parquet File

Remove an inventory breakdown spreadsheet/parquet file from the system

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RemoveParquetFileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var dateTime = 789L;  // long | a unix date-time specifying the exact snapshot to remove
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete Parquet File
                List<JsonMessage> result = apiInstance.RemoveParquetFile(organisationId, kbId, dateTime, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.RemoveParquetFile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RemoveParquetFileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Parquet File
    ApiResponse<List<JsonMessage>> response = apiInstance.RemoveParquetFileWithHttpInfo(organisationId, kbId, dateTime, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.RemoveParquetFileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **dateTime** | **long** | a unix date-time specifying the exact snapshot to remove |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**List&lt;JsonMessage&gt;**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | delete parquet OK response |  -  |
| **500** | could not get delete parquet. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="summarizedocument"></a>
# **SummarizeDocument**
> CMSingleDocumentSummary SummarizeDocument (string sessionId, CMSingleDocumentSummaryRequest cMSingleDocumentSummaryRequest, string? aPIVersion = null)

Summarize a document

Summarize a single document using an extractive summarization.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SummarizeDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSingleDocumentSummaryRequest = new CMSingleDocumentSummaryRequest(); // CMSingleDocumentSummaryRequest | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Summarize a document
                CMSingleDocumentSummary result = apiInstance.SummarizeDocument(sessionId, cMSingleDocumentSummaryRequest, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.SummarizeDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SummarizeDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Summarize a document
    ApiResponse<CMSingleDocumentSummary> response = apiInstance.SummarizeDocumentWithHttpInfo(sessionId, cMSingleDocumentSummaryRequest, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.SummarizeDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSingleDocumentSummaryRequest** | [**CMSingleDocumentSummaryRequest**](CMSingleDocumentSummaryRequest.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**CMSingleDocumentSummary**](CMSingleDocumentSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | summarization response |  -  |
| **500** | could not get summarization. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version4"></a>
# **Version4**
> CMVersion Version4 ()

Version

Get the version of SimSage Document Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version4Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version4();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.Version4: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version4WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.Version4WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.Version4WithHttpInfo: " + e.Message);
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

<a id="zipsource"></a>
# **ZipSource**
> JsonMessage ZipSource (string sessionId, CMZipSource cMZipSource, string? aPIVersion = null)

Zip source documents

Zip all documents in a source on the local server.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ZipSourceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DocumentApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMZipSource = new CMZipSource(); // CMZipSource | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Zip source documents
                JsonMessage result = apiInstance.ZipSource(sessionId, cMZipSource, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DocumentApi.ZipSource: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ZipSourceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Zip source documents
    ApiResponse<JsonMessage> response = apiInstance.ZipSourceWithHttpInfo(sessionId, cMZipSource, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentApi.ZipSourceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMZipSource** | [**CMZipSource**](CMZipSource.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | zip source documents OK response |  -  |
| **500** | could not create source document zip. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

