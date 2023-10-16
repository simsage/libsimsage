# DiscoveryApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allGdprProjects**](DiscoveryApi.md#allGdprProjects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
| [**applyRedactions**](DiscoveryApi.md#applyRedactions) | **POST** /api/discovery/applyredactions |  |
| [**createGdprProject**](DiscoveryApi.md#createGdprProject) | **POST** /api/discovery/createproject |  |
| [**deleteProject**](DiscoveryApi.md#deleteProject) | **DELETE** /api/discovery/deleteproject |  |
| [**exportRedactedDoc**](DiscoveryApi.md#exportRedactedDoc) | **POST** /api/discovery/exportredacteddoc |  |
| [**getGdprDocument**](DiscoveryApi.md#getGdprDocument) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} |  |
| [**getPagedProjectDocuments**](DiscoveryApi.md#getPagedProjectDocuments) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
| [**growthPerMonth**](DiscoveryApi.md#growthPerMonth) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth |
| [**pdfBinary**](DiscoveryApi.md#pdfBinary) | **GET** /api/discovery/pdf/latest/{organisationId}/{kbId}/{url} | Binary |
| [**setdocumentredactions**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument |  |
| [**storageBySource**](DiscoveryApi.md#storageBySource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage |
| [**summaryByDocumentType**](DiscoveryApi.md#summaryByDocumentType) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage |
| [**updateDocumentSet**](DiscoveryApi.md#updateDocumentSet) | **POST** /api/discovery/updatedocumentset |  |
| [**version5**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version |


<a id="allGdprProjects"></a>
# **allGdprProjects**
> Object allGdprProjects(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, sessionId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer page = 56; // Integer | the page to render
    Integer pageSize = 56; // Integer | the page size to use
    String textFilter = "textFilter_example"; // String | the text filter passed in or blank if empty
    String statusFilter = "statusFilter_example"; // String | the status filter passed in
    String sortColumn = "sortColumn_example"; // String | the sort column used for the results
    Integer sortDirection = 56; // Integer | sort direction to use (0/1)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.allGdprProjects(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#allGdprProjects");
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
| **page** | **Integer**| the page to render | |
| **pageSize** | **Integer**| the page size to use | |
| **textFilter** | **String**| the text filter passed in or blank if empty | |
| **statusFilter** | **String**| the status filter passed in | |
| **sortColumn** | **String**| the sort column used for the results | |
| **sortDirection** | **Integer**| sort direction to use (0/1) | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="applyRedactions"></a>
# **applyRedactions**
> Object applyRedactions(sessionId, cmRedactionData)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMRedactionData cmRedactionData = new CMRedactionData(); // CMRedactionData | 
    try {
      Object result = apiInstance.applyRedactions(sessionId, cmRedactionData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#applyRedactions");
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
| **cmRedactionData** | [**CMRedactionData**](CMRedactionData.md)|  | |

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

<a id="createGdprProject"></a>
# **createGdprProject**
> Object createGdprProject(sessionId, cmCreateGdprProject)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMCreateGdprProject cmCreateGdprProject = new CMCreateGdprProject(); // CMCreateGdprProject | 
    try {
      Object result = apiInstance.createGdprProject(sessionId, cmCreateGdprProject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#createGdprProject");
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
| **cmCreateGdprProject** | [**CMCreateGdprProject**](CMCreateGdprProject.md)|  | |

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

<a id="deleteProject"></a>
# **deleteProject**
> Object deleteProject(sessionId, cmDeleteProjectCmd)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDeleteProjectCmd cmDeleteProjectCmd = new CMDeleteProjectCmd(); // CMDeleteProjectCmd | 
    try {
      Object result = apiInstance.deleteProject(sessionId, cmDeleteProjectCmd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#deleteProject");
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
| **cmDeleteProjectCmd** | [**CMDeleteProjectCmd**](CMDeleteProjectCmd.md)|  | |

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

<a id="exportRedactedDoc"></a>
# **exportRedactedDoc**
> Object exportRedactedDoc(sessionId, cmExportRedactedDocument)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMExportRedactedDocument cmExportRedactedDocument = new CMExportRedactedDocument(); // CMExportRedactedDocument | 
    try {
      Object result = apiInstance.exportRedactedDoc(sessionId, cmExportRedactedDocument);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#exportRedactedDoc");
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
| **cmExportRedactedDocument** | [**CMExportRedactedDocument**](CMExportRedactedDocument.md)|  | |

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

<a id="getGdprDocument"></a>
# **getGdprDocument**
> Object getGdprDocument(organisationId, kbId, projectId, url, sessionId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String projectId = "projectId_example"; // String | Project Id for the items
    String url = "url_example"; // String | The url of the document to retrieve
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.getGdprDocument(organisationId, kbId, projectId, url, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#getGdprDocument");
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
| **projectId** | **String**| Project Id for the items | |
| **url** | **String**| The url of the document to retrieve | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="getPagedProjectDocuments"></a>
# **getPagedProjectDocuments**
> Object getPagedProjectDocuments(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, sessionId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String projectId = "projectId_example"; // String | Project Id for the items
    Integer page = 56; // Integer | the page to render
    Integer pageSize = 56; // Integer | the page size to use
    String textFilter = "textFilter_example"; // String | the text filter passed in or blank if empty
    String typeFilter = "typeFilter_example"; // String | the type filter passed in
    String statusFilter = "statusFilter_example"; // String | the status filter passed in
    String sortColumn = "sortColumn_example"; // String | the sort column used for the results
    Integer sortDirection = 56; // Integer | sort direction to use (0/1)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.getPagedProjectDocuments(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#getPagedProjectDocuments");
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
| **projectId** | **String**| Project Id for the items | |
| **page** | **Integer**| the page to render | |
| **pageSize** | **Integer**| the page size to use | |
| **textFilter** | **String**| the text filter passed in or blank if empty | |
| **typeFilter** | **String**| the type filter passed in | |
| **statusFilter** | **String**| the status filter passed in | |
| **sortColumn** | **String**| the sort column used for the results | |
| **sortDirection** | **Integer**| sort direction to use (0/1) | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="growthPerMonth"></a>
# **growthPerMonth**
> Object growthPerMonth(organisationId, kbId, sessionId)

growth

Get the storage growth delta per month

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.growthPerMonth(organisationId, kbId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#growthPerMonth");
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
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="pdfBinary"></a>
# **pdfBinary**
> Object pdfBinary(organisationId, kbId, url, sessionId)

Binary

Get the original for a document if available by url (latest version)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | a base64 encoded url
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.pdfBinary(organisationId, kbId, url, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#pdfBinary");
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
| **url** | **String**| a base64 encoded url | |
| **sessionId** | **String**| a valid SimSage Session id. | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setdocumentredactions"></a>
# **setdocumentredactions**
> Object setdocumentredactions(sessionId, cmRedactionData)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMRedactionData cmRedactionData = new CMRedactionData(); // CMRedactionData | 
    try {
      Object result = apiInstance.setdocumentredactions(sessionId, cmRedactionData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#setdocumentredactions");
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
| **cmRedactionData** | [**CMRedactionData**](CMRedactionData.md)|  | |

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

<a id="storageBySource"></a>
# **storageBySource**
> Object storageBySource(organisationId, kbId, sessionId)

storage

Get the current amount of storage used by source

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.storageBySource(organisationId, kbId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#storageBySource");
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
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="summaryByDocumentType"></a>
# **summaryByDocumentType**
> Object summaryByDocumentType(organisationId, kbId, sessionId)

storage

Get the current amount of storage used by source and document type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      Object result = apiInstance.summaryByDocumentType(organisationId, kbId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#summaryByDocumentType");
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
| **sessionId** | **String**| a valid SimSage Session id. | |

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

<a id="updateDocumentSet"></a>
# **updateDocumentSet**
> Object updateDocumentSet(sessionId, cmUpdateDocumentSet)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMUpdateDocumentSet cmUpdateDocumentSet = new CMUpdateDocumentSet(); // CMUpdateDocumentSet | 
    try {
      Object result = apiInstance.updateDocumentSet(sessionId, cmUpdateDocumentSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#updateDocumentSet");
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
| **cmUpdateDocumentSet** | [**CMUpdateDocumentSet**](CMUpdateDocumentSet.md)|  | |

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

<a id="version5"></a>
# **version5**
> CMVersion version5()

Version

Get the version of SimSage Discovery Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    try {
      CMVersion result = apiInstance.version5();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#version5");
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

