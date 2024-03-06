# KnowledgebaseApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportKnowledgeBase**](KnowledgebaseApi.md#exportKnowledgeBase) | **POST** /api/knowledgebase/export | export Knowledge-base |
| [**getKnowledgeBase**](KnowledgebaseApi.md#getKnowledgeBase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base |
| [**getKnowledgeBases**](KnowledgebaseApi.md#getKnowledgeBases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases |
| [**getSearchInfo**](KnowledgebaseApi.md#getSearchInfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info |
| [**getSearchInfo2**](KnowledgebaseApi.md#getSearchInfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated] |
| [**removeKnowledgeBase**](KnowledgebaseApi.md#removeKnowledgeBase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base |
| [**updateKnowledgeBase**](KnowledgebaseApi.md#updateKnowledgeBase) | **PUT** /api/knowledgebase/save | Save Knowledge-base |
| [**version3**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version |


<a id="exportKnowledgeBase"></a>
# **exportKnowledgeBase**
> JsonMessage exportKnowledgeBase(sessionId, cmKnowledgeBaseExport, apIVersion)

export Knowledge-base

starts the export of a knowledge-base using the passed in exporter config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMKnowledgeBaseExport cmKnowledgeBaseExport = new CMKnowledgeBaseExport(); // CMKnowledgeBaseExport | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.exportKnowledgeBase(sessionId, cmKnowledgeBaseExport, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#exportKnowledgeBase");
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
| **cmKnowledgeBaseExport** | [**CMKnowledgeBaseExport**](CMKnowledgeBaseExport.md)|  | |
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
| **500** | could not get search info. |  -  |
| **200** | export knowledge-base OK response |  -  |

<a id="getKnowledgeBase"></a>
# **getKnowledgeBase**
> CMKnowledgeBase getKnowledgeBase(organisationId, kbId, sessionId, apIVersion)

Get Knowledge-base

Return a knowledge base by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base to get (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMKnowledgeBase result = apiInstance.getKnowledgeBase(organisationId, kbId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#getKnowledgeBase");
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
| **kbId** | **String**| the knowledge-base to get (its guid id) | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMKnowledgeBase**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get knowledge-base. |  -  |
| **200** | get knowledge-base response |  -  |

<a id="getKnowledgeBases"></a>
# **getKnowledgeBases**
> List&lt;CMKnowledgeBase&gt; getKnowledgeBases(organisationId, sessionId)

Get Knowledge-bases

Return a list of knowledge bases for a given organisation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<CMKnowledgeBase> result = apiInstance.getKnowledgeBases(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#getKnowledgeBases");
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
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**List&lt;CMKnowledgeBase&gt;**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get knowledge-base list. |  -  |
| **200** | get knowledge-base list response |  -  |

<a id="getSearchInfo"></a>
# **getSearchInfo**
> CMInfo getSearchInfo(organisationId, clientId, apIVersion)

Search Info

return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String clientId = "clientId_example"; // String | the client's id (its guid id), pre-register this client as a known client.
    String apIVersion = "1"; // String | 
    try {
      CMInfo result = apiInstance.getSearchInfo(organisationId, clientId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#getSearchInfo");
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
| **clientId** | **String**| the client&#39;s id (its guid id), pre-register this client as a known client. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get search info. |  -  |
| **200** | get search info response |  -  |

<a id="getSearchInfo2"></a>
# **getSearchInfo2**
> CMInfo getSearchInfo2(organisationId, apIVersion)

Search Info [deprecated]

Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String apIVersion = "1"; // String | 
    try {
      CMInfo result = apiInstance.getSearchInfo2(organisationId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#getSearchInfo2");
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
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get search info. |  -  |
| **200** | get search info response |  -  |

<a id="removeKnowledgeBase"></a>
# **removeKnowledgeBase**
> JsonMessage removeKnowledgeBase(organisationId, kbId, sessionId, apIVersion)

Delete Knowledge-base

Delete a knowledge-base by Id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base to delete/remove (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.removeKnowledgeBase(organisationId, kbId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#removeKnowledgeBase");
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
| **kbId** | **String**| the knowledge-base to delete/remove (its guid id) | |
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
| **200** | delete knowledge-base OK response |  -  |
| **500** | could not delete knowledge-base. |  -  |

<a id="updateKnowledgeBase"></a>
# **updateKnowledgeBase**
> KnowledgeBase updateKnowledgeBase(sessionId, cmKnowledgeBase, apIVersion)

Save Knowledge-base

Save (Create or Update) a SimSage knowledge base item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMKnowledgeBase cmKnowledgeBase = new CMKnowledgeBase(); // CMKnowledgeBase | 
    String apIVersion = "1"; // String | 
    try {
      KnowledgeBase result = apiInstance.updateKnowledgeBase(sessionId, cmKnowledgeBase, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#updateKnowledgeBase");
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
| **cmKnowledgeBase** | [**CMKnowledgeBase**](CMKnowledgeBase.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**KnowledgeBase**](KnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not save knowledge-base. |  -  |
| **200** | save knowledge-base response |  -  |

<a id="version3"></a>
# **version3**
> CMVersion version3()

Version

Return the version of SimSage knowledge-base Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KnowledgebaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    KnowledgebaseApi apiInstance = new KnowledgebaseApi(defaultClient);
    try {
      CMVersion result = apiInstance.version3();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgebaseApi#version3");
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

