# CrawlerApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crawlerDeleteFolder**](CrawlerApi.md#crawlerDeleteFolder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder |
| [**crawlerDeleteUrl**](CrawlerApi.md#crawlerDeleteUrl) | **POST** /api/crawler/external/crawler/delete-url | Delete document |
| [**crawlerExternalDocumentDelete**](CrawlerApi.md#crawlerExternalDocumentDelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
| [**crawlerExternalDocumentFailed**](CrawlerApi.md#crawlerExternalDocumentFailed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document |
| [**crawlerExternalDocumentUpload**](CrawlerApi.md#crawlerExternalDocumentUpload) | **POST** /api/crawler/external/document/upload | Upload External Document |
| [**crawlerExternalImageUpload**](CrawlerApi.md#crawlerExternalImageUpload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
| [**crawlerRenameFolder**](CrawlerApi.md#crawlerRenameFolder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder |
| [**crawlerUpdateDeltaToken**](CrawlerApi.md#crawlerUpdateDeltaToken) | **POST** /api/crawler/external/crawler/delta-token | Update delta token |
| [**delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
| [**deleteDocuments**](CrawlerApi.md#deleteDocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents |
| [**encryptedCommunications**](CrawlerApi.md#encryptedCommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
| [**externalCrawler**](CrawlerApi.md#externalCrawler) | **POST** /api/crawler/external/crawler | External Crawler |
| [**externalCrawlerFinished**](CrawlerApi.md#externalCrawlerFinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
| [**externalCrawlerStart**](CrawlerApi.md#externalCrawlerStart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
| [**getCrawler**](CrawlerApi.md#getCrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
| [**getFailedDocuments**](CrawlerApi.md#getFailedDocuments) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List |
| [**getSourceList**](CrawlerApi.md#getSourceList) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
| [**markCrawlAsDeltaReset**](CrawlerApi.md#markCrawlAsDeltaReset) | **POST** /api/crawler/external/crawler/mark-as-reset | Update delta token |
| [**markFileAsSeen**](CrawlerApi.md#markFileAsSeen) | **POST** /api/crawler/external/crawler/mark-file-as-seen | Mark file as seen |
| [**oidcCode**](CrawlerApi.md#oidcCode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
| [**processAllFiles**](CrawlerApi.md#processAllFiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
| [**processorSchema**](CrawlerApi.md#processorSchema) | **GET** /api/crawler/processor_schema |  |
| [**receiveExternalLogEntry**](CrawlerApi.md#receiveExternalLogEntry) | **POST** /api/crawler/external/crawler/log | External Crawler log-entry |
| [**resetSourceDelta**](CrawlerApi.md#resetSourceDelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
| [**sdcSchema**](CrawlerApi.md#sdcSchema) | **GET** /api/crawler/sdc_schema |  |
| [**startCrawler**](CrawlerApi.md#startCrawler) | **POST** /api/crawler/start | Start crawler |
| [**sync**](CrawlerApi.md#sync) | **POST** /api/crawler/syncgdrivegroups |  |
| [**testCrawler**](CrawlerApi.md#testCrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
| [**updateCrawler**](CrawlerApi.md#updateCrawler) | **POST** /api/crawler/crawler | Update Source |
| [**version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |


<a id="crawlerDeleteFolder"></a>
# **crawlerDeleteFolder**
> JsonMessage crawlerDeleteFolder(cmExternalCrawlerDeleteFolder, apIVersion)

Delete document folder

An external crawler removes a document folder.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerDeleteFolder cmExternalCrawlerDeleteFolder = new CMExternalCrawlerDeleteFolder(); // CMExternalCrawlerDeleteFolder | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerDeleteFolder(cmExternalCrawlerDeleteFolder, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerDeleteFolder");
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
| **cmExternalCrawlerDeleteFolder** | [**CMExternalCrawlerDeleteFolder**](CMExternalCrawlerDeleteFolder.md)|  | |
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
| **200** | delete document folder update OK response |  -  |
| **500** | could not delete document folder. |  -  |

<a id="crawlerDeleteUrl"></a>
# **crawlerDeleteUrl**
> JsonMessage crawlerDeleteUrl(cmExternalCrawlerDeleteUrl, apIVersion)

Delete document

An external crawler removes a document.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerDeleteUrl cmExternalCrawlerDeleteUrl = new CMExternalCrawlerDeleteUrl(); // CMExternalCrawlerDeleteUrl | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerDeleteUrl(cmExternalCrawlerDeleteUrl, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerDeleteUrl");
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
| **cmExternalCrawlerDeleteUrl** | [**CMExternalCrawlerDeleteUrl**](CMExternalCrawlerDeleteUrl.md)|  | |
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
| **500** | could not delete document. |  -  |
| **200** | delete document update OK response |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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

<a id="crawlerExternalDocumentFailed"></a>
# **crawlerExternalDocumentFailed**
> JsonMessage crawlerExternalDocumentFailed(cmFailedSourceDocument, apIVersion)

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMFailedSourceDocument cmFailedSourceDocument = new CMFailedSourceDocument(); // CMFailedSourceDocument | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerExternalDocumentFailed(cmFailedSourceDocument, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerExternalDocumentFailed");
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
| **cmFailedSourceDocument** | [**CMFailedSourceDocument**](CMFailedSourceDocument.md)|  | |
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
    defaultClient.setBasePath("https://training.simsage.ai");

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **500** | could not upload external-crawler document image. |  -  |
| **200** | upload external-crawler document-image OK response |  -  |

<a id="crawlerRenameFolder"></a>
# **crawlerRenameFolder**
> JsonMessage crawlerRenameFolder(cmExternalCrawlerRenameFolder, apIVersion)

Rename document folder

An external crawler renames a document folder.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerRenameFolder cmExternalCrawlerRenameFolder = new CMExternalCrawlerRenameFolder(); // CMExternalCrawlerRenameFolder | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerRenameFolder(cmExternalCrawlerRenameFolder, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerRenameFolder");
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
| **cmExternalCrawlerRenameFolder** | [**CMExternalCrawlerRenameFolder**](CMExternalCrawlerRenameFolder.md)|  | |
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
| **500** | could not rename document folder. |  -  |
| **200** | rename document folder update OK response |  -  |

<a id="crawlerUpdateDeltaToken"></a>
# **crawlerUpdateDeltaToken**
> JsonMessage crawlerUpdateDeltaToken(cmExternalCrawlerSetDeltaToken, apIVersion)

Update delta token

An external crawler updates a delta-token.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerSetDeltaToken cmExternalCrawlerSetDeltaToken = new CMExternalCrawlerSetDeltaToken(); // CMExternalCrawlerSetDeltaToken | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.crawlerUpdateDeltaToken(cmExternalCrawlerSetDeltaToken, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#crawlerUpdateDeltaToken");
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
| **cmExternalCrawlerSetDeltaToken** | [**CMExternalCrawlerSetDeltaToken**](CMExternalCrawlerSetDeltaToken.md)|  | |
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
| **500** | could not update source delta-token. |  -  |
| **200** | source delta-token update OK response |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **500** | could not remove a source&#39;s documents. |  -  |
| **200** | updated source response |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **200** | secure communication result (various) |  -  |
| **500** | could not execute command. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **200** | external-crawler source response |  -  |
| **500** | could not get external crawler source. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **200** | external-crawler stop OK response |  -  |
| **500** | could not stop external crawler. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
    defaultClient.setBasePath("https://training.simsage.ai");

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

<a id="getFailedDocuments"></a>
# **getFailedDocuments**
> List&lt;CMSource&gt; getFailedDocuments(sessionId, organisationId, kbId, sourceId, page, pageSize, apIVersion)

Get source List

Get a list of failed documents for a source.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String kbId = "kbId_example"; // String | the knowledge-base's id (a guid)
    String sourceId = "sourceId_example"; // String | the source  id (a number)
    Integer page = 56; // Integer | the page number for the list
    Integer pageSize = 56; // Integer | the page size for the list
    String apIVersion = "1"; // String | 
    try {
      List<CMSource> result = apiInstance.getFailedDocuments(sessionId, organisationId, kbId, sourceId, page, pageSize, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#getFailedDocuments");
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
| **sourceId** | **String**| the source  id (a number) | |
| **page** | **Integer**| the page number for the list | |
| **pageSize** | **Integer**| the page size for the list | |
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
| **200** | source list response |  -  |
| **500** | could not get source list. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **200** | source list response |  -  |
| **500** | could not get source list. |  -  |

<a id="markCrawlAsDeltaReset"></a>
# **markCrawlAsDeltaReset**
> JsonMessage markCrawlAsDeltaReset(cmExternalMarkResetCrawl, apIVersion)

Update delta token

An external crawler marks a source as delta reset required.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalMarkResetCrawl cmExternalMarkResetCrawl = new CMExternalMarkResetCrawl(); // CMExternalMarkResetCrawl | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.markCrawlAsDeltaReset(cmExternalMarkResetCrawl, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#markCrawlAsDeltaReset");
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
| **cmExternalMarkResetCrawl** | [**CMExternalMarkResetCrawl**](CMExternalMarkResetCrawl.md)|  | |
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
| **500** | could not mark source as reset requested. |  -  |
| **200** | source delta-token reset OK response |  -  |

<a id="markFileAsSeen"></a>
# **markFileAsSeen**
> JsonMessage markFileAsSeen(cmExternalCrawlerMarkFileAsSeen, apIVersion)

Mark file as seen

An external crawler marks a file as seen.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalCrawlerMarkFileAsSeen cmExternalCrawlerMarkFileAsSeen = new CMExternalCrawlerMarkFileAsSeen(); // CMExternalCrawlerMarkFileAsSeen | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.markFileAsSeen(cmExternalCrawlerMarkFileAsSeen, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#markFileAsSeen");
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
| **cmExternalCrawlerMarkFileAsSeen** | [**CMExternalCrawlerMarkFileAsSeen**](CMExternalCrawlerMarkFileAsSeen.md)|  | |
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
| **500** | could not mark file as seen. |  -  |
| **200** | mark file as seen OK response |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **200** | OK response |  -  |
| **401** | something went wrong with the OIDC request set-up. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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

<a id="processorSchema"></a>
# **processorSchema**
> Object processorSchema()



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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    try {
      Object result = apiInstance.processorSchema();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#processorSchema");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="receiveExternalLogEntry"></a>
# **receiveExternalLogEntry**
> CMSource receiveExternalLogEntry(cmExternalLogEntry, apIVersion)

External Crawler log-entry

An external crawler sends a log entry to SimSage.

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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    CMExternalLogEntry cmExternalLogEntry = new CMExternalLogEntry(); // CMExternalLogEntry | 
    String apIVersion = "1"; // String | 
    try {
      CMSource result = apiInstance.receiveExternalLogEntry(cmExternalLogEntry, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#receiveExternalLogEntry");
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
| **cmExternalLogEntry** | [**CMExternalLogEntry**](CMExternalLogEntry.md)|  | |
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
| **200** | OK |  -  |
| **500** | could not get write log-entry / log-entry invalid. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **500** | could not reset source delta-token. |  -  |
| **200** | reset delta response |  -  |

<a id="sdcSchema"></a>
# **sdcSchema**
> Object sdcSchema()



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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    try {
      Object result = apiInstance.sdcSchema();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#sdcSchema");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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

<a id="sync"></a>
# **sync**
> Object sync(sessionId, cmSyncGDrive)



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
    defaultClient.setBasePath("https://training.simsage.ai");

    CrawlerApi apiInstance = new CrawlerApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSyncGDrive cmSyncGDrive = new CMSyncGDrive(); // CMSyncGDrive | 
    try {
      Object result = apiInstance.sync(sessionId, cmSyncGDrive);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlerApi#sync");
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
| **cmSyncGDrive** | [**CMSyncGDrive**](CMSyncGDrive.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **500** | could not test crawler. |  -  |
| **200** | test crawler connection OK response |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **200** | save source response |  -  |
| **500** | could not save source. |  -  |

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
    defaultClient.setBasePath("https://training.simsage.ai");

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
| **500** | could not get version. |  -  |
| **200** | get the version response |  -  |

