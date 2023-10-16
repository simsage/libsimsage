# SemanticApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTextToSearch**](SemanticApi.md#deleteTextToSearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search |
| [**documentQuestionAndAnswer**](SemanticApi.md#documentQuestionAndAnswer) | **POST** /api/semantic/document-qa | Document Q&amp;A |
| [**getTextToSearchPaginated**](SemanticApi.md#getTextToSearchPaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings |
| [**restfulClientQuery**](SemanticApi.md#restfulClientQuery) | **POST** /api/semantic/query | Client Query |
| [**saveTextToSearch**](SemanticApi.md#saveTextToSearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item |
| [**shortSummary**](SemanticApi.md#shortSummary) | **POST** /api/semantic/short-summary | Short summary |
| [**tryTextToSearchConversion**](SemanticApi.md#tryTextToSearchConversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search |
| [**version1**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version |


<a id="deleteTextToSearch"></a>
# **deleteTextToSearch**
> JsonMessage deleteTextToSearch(organisationId, kbId, word, sessionId, apIVersion)

Delete text-to-search

Remove an existing text-to-search item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String word = "sort()"; // String | the word of the text-to-search word
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteTextToSearch(organisationId, kbId, word, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#deleteTextToSearch");
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
| **word** | **String**| the word of the text-to-search word | |
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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

<a id="documentQuestionAndAnswer"></a>
# **documentQuestionAndAnswer**
> CMDocumentQuestionAndAnswer documentQuestionAndAnswer(sessionId, cmDocumentQuestionAndAnswer)

Document Q&amp;A

Answer a question about a given document

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMDocumentQuestionAndAnswer cmDocumentQuestionAndAnswer = new CMDocumentQuestionAndAnswer(); // CMDocumentQuestionAndAnswer | 
    try {
      CMDocumentQuestionAndAnswer result = apiInstance.documentQuestionAndAnswer(sessionId, cmDocumentQuestionAndAnswer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#documentQuestionAndAnswer");
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
| **cmDocumentQuestionAndAnswer** | [**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)|  | |

### Return type

[**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

<a id="getTextToSearchPaginated"></a>
# **getTextToSearchPaginated**
> CMTextToSearchPaginatedReturn getTextToSearchPaginated(sessionId, cmTextToSearchPaginated, apIVersion)

Text to Search mappings

Return a paginated list of text-to-search mappings with an optional filter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMTextToSearchPaginated cmTextToSearchPaginated = new CMTextToSearchPaginated(); // CMTextToSearchPaginated | 
    String apIVersion = "1"; // String | 
    try {
      CMTextToSearchPaginatedReturn result = apiInstance.getTextToSearchPaginated(sessionId, cmTextToSearchPaginated, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#getTextToSearchPaginated");
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
| **cmTextToSearchPaginated** | [**CMTextToSearchPaginated**](CMTextToSearchPaginated.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMTextToSearchPaginatedReturn**](CMTextToSearchPaginatedReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

<a id="restfulClientQuery"></a>
# **restfulClientQuery**
> CMClientQueryResult restfulClientQuery(cmClientQuery)

Client Query

a SimSage client asks a question or performs a keyword-search.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    CMClientQuery cmClientQuery = new CMClientQuery(); // CMClientQuery | 
    try {
      CMClientQueryResult result = apiInstance.restfulClientQuery(cmClientQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#restfulClientQuery");
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
| **cmClientQuery** | [**CMClientQuery**](CMClientQuery.md)|  | |

### Return type

[**CMClientQueryResult**](CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

<a id="saveTextToSearch"></a>
# **saveTextToSearch**
> JsonMessage saveTextToSearch(organisationId, kbId, sessionId, cmTextToSearchEdit, apIVersion)

Save a text-to-search item

Create or update (save) a text-to-search item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMTextToSearchEdit cmTextToSearchEdit = new CMTextToSearchEdit(); // CMTextToSearchEdit | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.saveTextToSearch(organisationId, kbId, sessionId, cmTextToSearchEdit, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#saveTextToSearch");
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
| **cmTextToSearchEdit** | [**CMTextToSearchEdit**](CMTextToSearchEdit.md)|  | |
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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

<a id="shortSummary"></a>
# **shortSummary**
> CMShortSummaryResult shortSummary(cmShortSummary)

Short summary

Create a short summary for a given url / sentence

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    CMShortSummary cmShortSummary = new CMShortSummary(); // CMShortSummary | 
    try {
      CMShortSummaryResult result = apiInstance.shortSummary(cmShortSummary);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#shortSummary");
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
| **cmShortSummary** | [**CMShortSummary**](CMShortSummary.md)|  | |

### Return type

[**CMShortSummaryResult**](CMShortSummaryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **500** | fail response |  -  |

<a id="tryTextToSearchConversion"></a>
# **tryTextToSearchConversion**
> CMTextToSearchConversionReturn tryTextToSearchConversion(sessionId, cmTextToSearchConversion, apIVersion)

try converting text-to-search

See the results of a text-to-search conversion

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMTextToSearchConversion cmTextToSearchConversion = new CMTextToSearchConversion(); // CMTextToSearchConversion | 
    String apIVersion = "1"; // String | 
    try {
      CMTextToSearchConversionReturn result = apiInstance.tryTextToSearchConversion(sessionId, cmTextToSearchConversion, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#tryTextToSearchConversion");
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
| **cmTextToSearchConversion** | [**CMTextToSearchConversion**](CMTextToSearchConversion.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMTextToSearchConversionReturn**](CMTextToSearchConversionReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

<a id="version1"></a>
# **version1**
> CMVersion version1()

Version

Get the version of SimSage Search Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SemanticApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://test.simsage.ai");

    SemanticApi apiInstance = new SemanticApi(defaultClient);
    try {
      CMVersion result = apiInstance.version1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SemanticApi#version1");
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

