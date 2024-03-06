# DocumentApi

All URIs are relative to *https://test.simsage.ai*

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


<a id="document"></a>
# **document**
> CMDocument document(sessionId, organisationId, kbId, url)

get Document

return a document&#39;s details given a base64 encoded url

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the document's url, base64 encoded, a unique id identifying a document.
    try {
      CMDocument result = apiInstance.document(sessionId, organisationId, kbId, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#document");
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
| **url** | **String**| the document&#39;s url, base64 encoded, a unique id identifying a document. | |

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

<a id="getParquetFile"></a>
# **getParquetFile**
> byte[] getParquetFile(ott, organisationId, kbId, dateTime)

Download Parquet File

Download an inventory parquet file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String ott = "ott_example"; // String | a one-time token for downloading data.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Long dateTime = 56L; // Long | a unix date-time specifying the exact snapshot to download
    try {
      byte[] result = apiInstance.getParquetFile(ott, organisationId, kbId, dateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getParquetFile");
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
| **ott** | **String**| a one-time token for downloading data. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to download | |

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

<a id="getParquetList"></a>
# **getParquetList**
> CMParquetTimeList getParquetList(organisationId, kbId, page, pageSize, sessionId, apIVersion)

Parquet available time list

Return a list of inventory times available for download.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer page = 0; // Integer | pagination control, the page index
    Integer pageSize = 10; // Integer | pagination control, the size of a page
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMParquetTimeList result = apiInstance.getParquetList(organisationId, kbId, page, pageSize, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getParquetList");
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
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **page** | **Integer**| pagination control, the page index | |
| **pageSize** | **Integer**| pagination control, the size of a page | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="getSpreadsheet"></a>
# **getSpreadsheet**
> byte[] getSpreadsheet(ott, organisationId, kbId, dateTime)

Inventory breakdown Spreadsheet

Download an inventory breakdown spreadsheet for a given date-time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String ott = "ott_example"; // String | a one-time token for downloading data.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Long dateTime = 56L; // Long | a unix date-time specifying the exact snapshot to download
    try {
      byte[] result = apiInstance.getSpreadsheet(ott, organisationId, kbId, dateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getSpreadsheet");
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
| **ott** | **String**| a one-time token for downloading data. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to download | |

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

<a id="getStats1"></a>
# **getStats1**
> List&lt;CMDocumentTypeFrequency&gt; getStats1(ott, organisationId, kbId, dateTime)

Document Frequency Statistics

Return a document frequency statistics report - frequencies of different document types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String ott = "ott_example"; // String | a one-time token for downloading data.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Long dateTime = 56L; // Long | a unix date-time specifying the exact snapshot to download
    try {
      List<CMDocumentTypeFrequency> result = apiInstance.getStats1(ott, organisationId, kbId, dateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getStats1");
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
| **ott** | **String**| a one-time token for downloading data. | |
| **organisationId** | **String**| the organisation (its guid id) | |
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to download | |

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

<a id="inventorizeDocuments"></a>
# **inventorizeDocuments**
> JsonMessage inventorizeDocuments(sessionId, cmInventorizeParameters, apIVersion)

Document Inventory

Start the async inventorize process for documents of a given organisation/kb.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMInventorizeParameters cmInventorizeParameters = new CMInventorizeParameters(); // CMInventorizeParameters | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.inventorizeDocuments(sessionId, cmInventorizeParameters, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#inventorizeDocuments");
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
| **cmInventorizeParameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="inventorizeIndexes"></a>
# **inventorizeIndexes**
> JsonMessage inventorizeIndexes(sessionId, cmInventorizeParameters, apIVersion)

Index Inventory

Start the async inventorize process for the optimized-indexes of a given organisation/kb.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMInventorizeParameters cmInventorizeParameters = new CMInventorizeParameters(); // CMInventorizeParameters | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.inventorizeIndexes(sessionId, cmInventorizeParameters, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#inventorizeIndexes");
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
| **cmInventorizeParameters** | [**CMInventorizeParameters**](CMInventorizeParameters.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="preview"></a>
# **preview**
> byte[] preview(organisationId, kbId, clientId, sessionId, urlId, page)

get Preview

get a preview for a document if available by url

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String clientId = "clientId_example"; // String | the client-id, a persistent id identifying the remote client making this request.
    String sessionId = "sessionId_example"; // String | the session-id, the security required for making this request.
    Integer urlId = 56; // Integer | the SimSage id for this url
    Integer page = must be one of -1: the thumbnail image, 0: the first page view; // Integer | what page to render
    try {
      byte[] result = apiInstance.preview(organisationId, kbId, clientId, sessionId, urlId, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#preview");
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
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **clientId** | **String**| the client-id, a persistent id identifying the remote client making this request. | |
| **sessionId** | **String**| the session-id, the security required for making this request. | |
| **urlId** | **Integer**| the SimSage id for this url | |
| **page** | **Integer**| what page to render | |

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

<a id="previewHtml"></a>
# **previewHtml**
> CMGetHtml previewHtml(sessionId, cmGetHtml)

Preview HTML

get a preview HTML page for a document if available by url

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid session-guid id or a anonymous user-id.
    CMGetHtml cmGetHtml = new CMGetHtml(); // CMGetHtml | 
    try {
      CMGetHtml result = apiInstance.previewHtml(sessionId, cmGetHtml);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#previewHtml");
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
| **sessionId** | **String**| a valid session-guid id or a anonymous user-id. | |
| **cmGetHtml** | [**CMGetHtml**](CMGetHtml.md)|  | |

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

<a id="queryFocussedSummarization"></a>
# **queryFocussedSummarization**
> CMQueryFocussedSummarization queryFocussedSummarization(sessionId, cmQueryFocussedSummarizationRequest, apIVersion)

Summarize Documents for Query

Summarize a set of documents given a list of urls and a query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMQueryFocussedSummarizationRequest cmQueryFocussedSummarizationRequest = new CMQueryFocussedSummarizationRequest(); // CMQueryFocussedSummarizationRequest | 
    String apIVersion = "1"; // String | 
    try {
      CMQueryFocussedSummarization result = apiInstance.queryFocussedSummarization(sessionId, cmQueryFocussedSummarizationRequest, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#queryFocussedSummarization");
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
| **cmQueryFocussedSummarizationRequest** | [**CMQueryFocussedSummarizationRequest**](CMQueryFocussedSummarizationRequest.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="removeDocument"></a>
# **removeDocument**
> JsonMessage removeDocument(organisationId, kbId, url, sourceId, sessionId, apIVersion)

Remove Document

Remove/delete a document by its url.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the base-64 encoded (no-prefix) url of the document
    Integer sourceId = 56; // Integer | the source-id of the crawler this document belongs to
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.removeDocument(organisationId, kbId, url, sourceId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#removeDocument");
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
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **url** | **String**| the base-64 encoded (no-prefix) url of the document | |
| **sourceId** | **Integer**| the source-id of the crawler this document belongs to | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="removeParquetFile"></a>
# **removeParquetFile**
> List&lt;JsonMessage&gt; removeParquetFile(organisationId, kbId, dateTime, sessionId, apIVersion)

Delete Parquet File

Remove an inventory breakdown spreadsheet/parquet file from the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Long dateTime = 56L; // Long | a unix date-time specifying the exact snapshot to remove
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      List<JsonMessage> result = apiInstance.removeParquetFile(organisationId, kbId, dateTime, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#removeParquetFile");
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
| **kbId** | **String**| the knowledge-base (its guid id) | |
| **dateTime** | **Long**| a unix date-time specifying the exact snapshot to remove | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="summarizeDocument"></a>
# **summarizeDocument**
> CMSingleDocumentSummary summarizeDocument(sessionId, cmSingleDocumentSummaryRequest, apIVersion)

Summarize a document

Summarize a single document using an extractive summarization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSingleDocumentSummaryRequest cmSingleDocumentSummaryRequest = new CMSingleDocumentSummaryRequest(); // CMSingleDocumentSummaryRequest | 
    String apIVersion = "1"; // String | 
    try {
      CMSingleDocumentSummary result = apiInstance.summarizeDocument(sessionId, cmSingleDocumentSummaryRequest, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#summarizeDocument");
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
| **cmSingleDocumentSummaryRequest** | [**CMSingleDocumentSummaryRequest**](CMSingleDocumentSummaryRequest.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

<a id="version4"></a>
# **version4**
> CMVersion version4()

Version

Get the version of SimSage Document Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    try {
      CMVersion result = apiInstance.version4();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#version4");
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
| **200** | get the version response |  -  |
| **500** | could not get version. |  -  |

<a id="zipSource"></a>
# **zipSource**
> JsonMessage zipSource(sessionId, cmZipSource, apIVersion)

Zip source documents

Zip all documents in a source on the local server.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMZipSource cmZipSource = new CMZipSource(); // CMZipSource | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.zipSource(sessionId, cmZipSource, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#zipSource");
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
| **cmZipSource** | [**CMZipSource**](CMZipSource.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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

