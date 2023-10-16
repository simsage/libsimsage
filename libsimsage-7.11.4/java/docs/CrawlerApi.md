# CrawlerApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crawlerExternalDocumentDelete**](CrawlerApi.md#crawlerExternalDocumentDelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
| [**crawlerExternalDocumentUnChanged**](CrawlerApi.md#crawlerExternalDocumentUnChanged) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged |
| [**crawlerExternalDocumentUpload**](CrawlerApi.md#crawlerExternalDocumentUpload) | **POST** /api/crawler/external/document/upload | Upload External Document |
| [**crawlerExternalImageUpload**](CrawlerApi.md#crawlerExternalImageUpload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
| [**delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
| [**deleteDocuments**](CrawlerApi.md#deleteDocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents |
| [**encryptedCommunications**](CrawlerApi.md#encryptedCommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
| [**externalCrawler**](CrawlerApi.md#externalCrawler) | **POST** /api/crawler/external/crawler | External Crawler |
| [**externalCrawlerFinished**](CrawlerApi.md#externalCrawlerFinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
| [**externalCrawlerStart**](CrawlerApi.md#externalCrawlerStart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
| [**getCrawler**](CrawlerApi.md#getCrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
| [**getSourceList**](CrawlerApi.md#getSourceList) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
| [**oidcCode**](CrawlerApi.md#oidcCode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
| [**processAllFiles**](CrawlerApi.md#processAllFiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
| [**resetSourceDelta**](CrawlerApi.md#resetSourceDelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
| [**startCrawler**](CrawlerApi.md#startCrawler) | **POST** /api/crawler/start | Start crawler |
| [**testCrawler**](CrawlerApi.md#testCrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
| [**updateCrawler**](CrawlerApi.md#updateCrawler) | **POST** /api/crawler/crawler | Update Source |
| [**version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |


<a id="crawlerExternalDocumentDelete"></a>
# **crawlerExternalDocumentDelete**
> JsonMessage crawlerExternalDocumentDelete(cmDeleteDocument, apIVersion)

Remove an External Document

Remove an external crawler document from SimSage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMDeleteDocument cmDeleteDocument = new CMDeleteDocument(); // CMDeleteDocument | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerExternalDocumentDelete(cmDeleteDocument, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerExternalDocumentDelete");
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
| **cmDeleteDocument** | [**CMDeleteDocument**](CMDeleteDocument.md)|  | |
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
| **500** | could not remove external-crawler document. |  -  |
| **200** | remove external-crawler document OK response |  -  |

<a id="crawlerExternalDocumentUnChanged"></a>
# **crawlerExternalDocumentUnChanged**
> JsonMessage crawlerExternalDocumentUnChanged(cmDocumentUnChanged, apIVersion)

Mark External Document Unchanged

An external crawler document marks a document as not having changed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMDocumentUnChanged cmDocumentUnChanged = new CMDocumentUnChanged(); // CMDocumentUnChanged | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerExternalDocumentUnChanged(cmDocumentUnChanged, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerExternalDocumentUnChanged");
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
| **cmDocumentUnChanged** | [**CMDocumentUnChanged**](CMDocumentUnChanged.md)|  | |
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
| **200** | mark external-crawler document unchanged OK response |  -  |
| **500** | could not mark external-document as unchanged. |  -  |

<a id="crawlerExternalDocumentUpload"></a>
# **crawlerExternalDocumentUpload**
> JsonMessage crawlerExternalDocumentUpload(cmUploadDocument, apIVersion)

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMUploadDocument cmUploadDocument = new CMUploadDocument(); // CMUploadDocument | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerExternalDocumentUpload(cmUploadDocument, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerExternalDocumentUpload");
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
| **cmUploadDocument** | [**CMUploadDocument**](CMUploadDocument.md)|  | |
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
| **200** | upload external-crawler document OK response |  -  |
| **500** | could not start external crawler. |  -  |

<a id="crawlerExternalImageUpload"></a>
# **crawlerExternalImageUpload**
> JsonMessage crawlerExternalImageUpload(cmUploadImage, apIVersion)

Upload External Image

An external crawler uploads an image for a document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMUploadImage cmUploadImage = new CMUploadImage(); // CMUploadImage | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerExternalImageUpload(cmUploadImage, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerExternalImageUpload");
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
| **cmUploadImage** | [**CMUploadImage**](CMUploadImage.md)|  | |
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
| **200** | upload external-crawler document-image OK response |  -  |
| **500** | could not upload external-crawler document image. |  -  |

<a id="delete"></a>
# **delete**
> JsonMessage delete(organisationId, kbId, sessionId, sourceId, apIVersion)

Delete source

Remove a source and all its content by its source-id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    Integer sourceId = 56; // Integer | the crawler's id
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.delete(organisationId, kbId, sessionId, sourceId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#delete");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **sourceId** | **Integer**| the crawler&#39;s id | |
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
| **200** | remove a source OK response |  -  |
| **500** | could not remove source. |  -  |

<a id="deleteDocuments"></a>
# **deleteDocuments**
> CMSource deleteDocuments(organisationId, kbId, sessionId, sourceId, apIVersion)

Delete source&#39;s documents

Remove a source&#39;s documents and stop the crawler if it&#39;s running.  Return an updated sources.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    Integer sourceId = 56; // Integer | the crawler's id
    String apIVersion = "1"; // String | 
    try {
      CMSource result = apiInstance.deleteDocuments(organisationId, kbId, sessionId, sourceId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#deleteDocuments");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **sourceId** | **Integer**| the crawler&#39;s id | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updated source response |  -  |
| **500** | could not remove a source&#39;s documents. |  -  |

<a id="encryptedCommunications"></a>
# **encryptedCommunications**
> JsonMessage encryptedCommunications(seed, body, apIVersion)

Secure Communication

Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    Integer seed = 56; // Integer | a random integer used for the communications
    String body = "body_example"; // String | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.encryptedCommunications(seed, body, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#encryptedCommunications");
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
| **seed** | **Integer**| a random integer used for the communications | |
| **body** | **String**|  | |
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
| **500** | could not execute command. |  -  |
| **200** | secure communication result (various) |  -  |

<a id="externalCrawler"></a>
# **externalCrawler**
> CMSource externalCrawler(cmExternalCrawler, apIVersion)

External Crawler

Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawler cmExternalCrawler = new CMExternalCrawler(); // CMExternalCrawler | 
    String apIVersion = "1"; // String | 
    try {
      CMSource result = apiInstance.externalCrawler(cmExternalCrawler, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#externalCrawler");
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
| **cmExternalCrawler** | [**CMExternalCrawler**](CMExternalCrawler.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get external crawler source. |  -  |
| **200** | external-crawler source response |  -  |

<a id="externalCrawlerFinished"></a>
# **externalCrawlerFinished**
> JsonMessage externalCrawlerFinished(cmExternalCrawlerStop, apIVersion)

Stop External Crawler

An external crawler notifies SimSage it has finished its job, its run through the data once.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerStop cmExternalCrawlerStop = new CMExternalCrawlerStop(); // CMExternalCrawlerStop | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.externalCrawlerFinished(cmExternalCrawlerStop, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#externalCrawlerFinished");
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
| **cmExternalCrawlerStop** | [**CMExternalCrawlerStop**](CMExternalCrawlerStop.md)|  | |
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
| **500** | could not stop external crawler. |  -  |
| **200** | external-crawler stop OK response |  -  |

<a id="externalCrawlerStart"></a>
# **externalCrawlerStart**
> JsonMessage externalCrawlerStart(cmExternalCrawlerStart, apIVersion)

Start External Crawler

An external crawler notifies SimSage is it starting a new run.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerStart cmExternalCrawlerStart = new CMExternalCrawlerStart(); // CMExternalCrawlerStart | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.externalCrawlerStart(cmExternalCrawlerStart, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#externalCrawlerStart");
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
| **cmExternalCrawlerStart** | [**CMExternalCrawlerStart**](CMExternalCrawlerStart.md)|  | |
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
| **200** | external-crawler start OK response |  -  |
| **500** | could not start external crawler. |  -  |

<a id="getCrawler"></a>
# **getCrawler**
> CMSource getCrawler(organisationId, kbId, sourceId, sessionId, apIVersion)

Get source

Return the data-structure for a source by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    Integer sourceId = 56; // Integer | the crawler's id
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMSource result = apiInstance.getCrawler(organisationId, kbId, sourceId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#getCrawler");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | |
| **sourceId** | **Integer**| the crawler&#39;s id | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the source |  -  |
| **500** | could not get source. |  -  |

<a id="getSourceList"></a>
# **getSourceList**
> List&lt;CMSource&gt; getSourceList(sessionId, organisationId, kbId, apIVersion)

Get source List

Get a list of sources for a given organisation / knowledge base.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    String apIVersion = "1"; // String | 
    try {
      List<CMSource> result = apiInstance.getSourceList(sessionId, organisationId, kbId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#getSourceList");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**List&lt;CMSource&gt;**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get source list. |  -  |
| **200** | source list response |  -  |

<a id="oidcCode"></a>
# **oidcCode**
> oidcCode(oidcKey, allRequestParams)

OIDC code receiver

used for OIDC systems to receive codes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String oidcKey = "oidcKey_example"; // String | the Dropbox OIDC key
    Map<String, String> allRequestParams = new HashMap(); // Map<String, String> | 
    try {
      apiInstance.oidcCode(oidcKey, allRequestParams);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#oidcCode");
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
| **oidcKey** | **String**| the Dropbox OIDC key | |
| **allRequestParams** | [**Map&lt;String, String&gt;**](String.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | something went wrong with the OIDC request set-up. |  -  |
| **200** | OK response |  -  |

<a id="processAllFiles"></a>
# **processAllFiles**
> JsonMessage processAllFiles(sessionId, cmStartCrawler, apIVersion)

Process all files of crawler/source

Start and force processing all files for a crawler/source

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMStartCrawler cmStartCrawler = new CMStartCrawler(); // CMStartCrawler | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.processAllFiles(sessionId, cmStartCrawler, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#processAllFiles");
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
| **cmStartCrawler** | [**CMStartCrawler**](CMStartCrawler.md)|  | |
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
| **200** | start processing all OK response |  -  |
| **500** | could not start processing files. |  -  |

<a id="resetSourceDelta"></a>
# **resetSourceDelta**
> CMSource resetSourceDelta(sessionId, organisationId, kbId, sourceId, apIVersion)

Reset Source delta-token

reset a SimSage source&#39;s delta token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    Integer sourceId = 56; // Integer | the crawler's id
    String apIVersion = "1"; // String | 
    try {
      CMSource result = apiInstance.resetSourceDelta(sessionId, organisationId, kbId, sourceId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#resetSourceDelta");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | |
| **sourceId** | **Integer**| the crawler&#39;s id | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | reset delta response |  -  |
| **500** | could not reset source delta-token. |  -  |

<a id="startCrawler"></a>
# **startCrawler**
> JsonMessage startCrawler(sessionId, cmStartCrawler, apIVersion)

Start crawler

Start a crawler by source-id if after it has stopped.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMStartCrawler cmStartCrawler = new CMStartCrawler(); // CMStartCrawler | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.startCrawler(sessionId, cmStartCrawler, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#startCrawler");
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
| **cmStartCrawler** | [**CMStartCrawler**](CMStartCrawler.md)|  | |
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
| **200** | start crawler OK response |  -  |
| **500** | could not start crawler. |  -  |

<a id="testCrawler"></a>
# **testCrawler**
> JsonMessage testCrawler(sessionId, organisationId, kbId, sourceId, apIVersion)

Test Crawler

Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    Integer sourceId = 56; // Integer | the crawler's id
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.testCrawler(sessionId, organisationId, kbId, sourceId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#testCrawler");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | |
| **sourceId** | **Integer**| the crawler&#39;s id | |
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
| **200** | test crawler connection OK response |  -  |
| **500** | could not test crawler. |  -  |

<a id="updateCrawler"></a>
# **updateCrawler**
> CMSource updateCrawler(sessionId, cmSource, apIVersion)

Update Source

Save (create or update) a SimSage source.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSource cmSource = new CMSource(); // CMSource | 
    String apIVersion = "1"; // String | 
    try {
      CMSource result = apiInstance.updateCrawler(sessionId, cmSource, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#updateCrawler");
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
| **cmSource** | [**CMSource**](CMSource.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not save source. |  -  |
| **200** | save source response |  -  |

<a id="version6"></a>
# **version6**
> CMVersion version6()

Version

Get the version of SimSage crawler-services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrawlerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    try {
      CMVersion result = apiInstance.version6();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#version6");
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

