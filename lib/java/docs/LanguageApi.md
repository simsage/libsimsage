# LanguageApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDefaultSynSets**](LanguageApi.md#addDefaultSynSets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets |
| [**deleteAllSynonyms**](LanguageApi.md#deleteAllSynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms |
| [**deleteCategorization**](LanguageApi.md#deleteCategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization |
| [**deleteSemantic**](LanguageApi.md#deleteSemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic |
| [**deleteSynSet**](LanguageApi.md#deleteSynSet) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet |
| [**deleteSynonym**](LanguageApi.md#deleteSynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym |
| [**findSynSets**](LanguageApi.md#findSynSets) | **PUT** /api/language/find-syn-sets | Find SynSets |
| [**getCategorizationList**](LanguageApi.md#getCategorizationList) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list |
| [**getPaginated**](LanguageApi.md#getPaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated |
| [**getSemanticsPaginated**](LanguageApi.md#getSemanticsPaginated) | **PUT** /api/language/semantics | Semantics Paginated |
| [**optimizeIndexes**](LanguageApi.md#optimizeIndexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes |
| [**optimizeIndexesAbort**](LanguageApi.md#optimizeIndexesAbort) | **PUT** /api/language/optimize-indexes-abort | Abort Index Optimization |
| [**redactDocument**](LanguageApi.md#redactDocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document |
| [**saveCategorization**](LanguageApi.md#saveCategorization) | **PUT** /api/language/categorization | save categorization |
| [**saveSemantic**](LanguageApi.md#saveSemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic |
| [**saveSynSet**](LanguageApi.md#saveSynSet) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet |
| [**saveSynonym**](LanguageApi.md#saveSynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym |
| [**tuneLanguageGraph**](LanguageApi.md#tuneLanguageGraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph |
| [**version2**](LanguageApi.md#version2) | **GET** /api/language/version | Version |


<a id="addDefaultSynSets"></a>
# **addDefaultSynSets**
> JsonMessage addDefaultSynSets(organisationId, kbId, sessionId, apIVersion)

Add all default SynSets

Add default syn-sets to the given org/kb

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.addDefaultSynSets(organisationId, kbId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#addDefaultSynSets");
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

<a id="deleteAllSynonyms"></a>
# **deleteAllSynonyms**
> JsonMessage deleteAllSynonyms(organisationId, kbId, sessionId, apIVersion)

Delete All Synonyms

Delete all synonyms for a given org/kb

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base to delete/remove (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteAllSynonyms(organisationId, kbId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#deleteAllSynonyms");
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
| **200** | OK response |  -  |
| **500** | fail response |  -  |

<a id="deleteCategorization"></a>
# **deleteCategorization**
> JsonMessage deleteCategorization(organisationId, kbId, categorizationLabel, sessionId, apIVersion)

remove categorization

remove a specific categorization for a given org/kb

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String categorizationLabel = "categorizationLabel_example"; // String | the metadata (name) to remove
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteCategorization(organisationId, kbId, categorizationLabel, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#deleteCategorization");
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
| **categorizationLabel** | **String**| the metadata (name) to remove | |
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

<a id="deleteSemantic"></a>
# **deleteSemantic**
> JsonMessage deleteSemantic(organisationId, kbId, word, semantic, sessionId, apIVersion)

Delete Semantic

Remove an existing semantic from SimSage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String word = "John"; // String | the word (more specific item) of the semantic to delete (eg. \"John\")
    String semantic = "person"; // String | the semantic of the word to delete (eg. \"person\")
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteSemantic(organisationId, kbId, word, semantic, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#deleteSemantic");
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
| **word** | **String**| the word (more specific item) of the semantic to delete (eg. \&quot;John\&quot;) | |
| **semantic** | **String**| the semantic of the word to delete (eg. \&quot;person\&quot;) | |
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

<a id="deleteSynSet"></a>
# **deleteSynSet**
> JsonMessage deleteSynSet(organisationId, kbId, lemma, sessionId, apIVersion)

Delete SynSet

Remove a syn-set from SimSage by lemma.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String lemma = "lemma_example"; // String | the lemma (base word) of the syn-set to remove.
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteSynSet(organisationId, kbId, lemma, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#deleteSynSet");
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
| **lemma** | **String**| the lemma (base word) of the syn-set to remove. | |
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

<a id="deleteSynonym"></a>
# **deleteSynonym**
> JsonMessage deleteSynonym(organisationId, kbId, id, sessionId, apIVersion)

Delete Synonym

Delete a synonym using its id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    Integer id = 56; // Integer | the id of the synonym to remove.
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.deleteSynonym(organisationId, kbId, id, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#deleteSynonym");
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
| **id** | **Integer**| the id of the synonym to remove. | |
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

<a id="findSynSets"></a>
# **findSynSets**
> CMSynSetList findSynSets(sessionId, cmSynSetFind, apIVersion)

Find SynSets

Find syn-sets using filters

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSynSetFind cmSynSetFind = new CMSynSetFind(); // CMSynSetFind | 
    String apIVersion = "1"; // String | 
    try {
      CMSynSetList result = apiInstance.findSynSets(sessionId, cmSynSetFind, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#findSynSets");
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
| **cmSynSetFind** | [**CMSynSetFind**](CMSynSetFind.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSynSetList**](CMSynSetList.md)

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

<a id="getCategorizationList"></a>
# **getCategorizationList**
> CMCategorizationPaginatedList getCategorizationList(organisationId, kbId, prevCategorizationLabel, pageSize, sessionId, apIVersion)

categorization list

get all categorizations for a given org/kb paginated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String prevCategorizationLabel = "prevCategorizationLabel_example"; // String | the previous categorization label for pagination, or null if first page
    Integer pageSize = 56; // Integer | the size of the page returned
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      CMCategorizationPaginatedList result = apiInstance.getCategorizationList(organisationId, kbId, prevCategorizationLabel, pageSize, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#getCategorizationList");
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
| **prevCategorizationLabel** | **String**| the previous categorization label for pagination, or null if first page | |
| **pageSize** | **Integer**| the size of the page returned | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMCategorizationPaginatedList**](CMCategorizationPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | response |  -  |

<a id="getPaginated"></a>
# **getPaginated**
> CMSynonymsPaginatedResult getPaginated(sessionId, cmSynonymsPaginated, apIVersion)

get Synonyms Paginated

return a paginated list of synonyms with optional filtering.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSynonymsPaginated cmSynonymsPaginated = new CMSynonymsPaginated(); // CMSynonymsPaginated | 
    String apIVersion = "1"; // String | 
    try {
      CMSynonymsPaginatedResult result = apiInstance.getPaginated(sessionId, cmSynonymsPaginated, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#getPaginated");
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
| **cmSynonymsPaginated** | [**CMSynonymsPaginated**](CMSynonymsPaginated.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSynonymsPaginatedResult**](CMSynonymsPaginatedResult.md)

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

<a id="getSemanticsPaginated"></a>
# **getSemanticsPaginated**
> CMSemanticsPaginatedResult getSemanticsPaginated(sessionId, cmSemanticsPaginated, apIVersion)

Semantics Paginated

Return a paginated list of semantics with an optional filter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSemanticsPaginated cmSemanticsPaginated = new CMSemanticsPaginated(); // CMSemanticsPaginated | 
    String apIVersion = "1"; // String | 
    try {
      CMSemanticsPaginatedResult result = apiInstance.getSemanticsPaginated(sessionId, cmSemanticsPaginated, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#getSemanticsPaginated");
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
| **cmSemanticsPaginated** | [**CMSemanticsPaginated**](CMSemanticsPaginated.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

### Return type

[**CMSemanticsPaginatedResult**](CMSemanticsPaginatedResult.md)

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

<a id="optimizeIndexes"></a>
# **optimizeIndexes**
> JsonMessage optimizeIndexes(sessionId, cmOptimizeIndex, apIVersion)

Optimize Indexes

Force index optimization for a the given knowledge-base, now.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMOptimizeIndex cmOptimizeIndex = new CMOptimizeIndex(); // CMOptimizeIndex | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.optimizeIndexes(sessionId, cmOptimizeIndex, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#optimizeIndexes");
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
| **cmOptimizeIndex** | [**CMOptimizeIndex**](CMOptimizeIndex.md)|  | |
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

<a id="optimizeIndexesAbort"></a>
# **optimizeIndexesAbort**
> JsonMessage optimizeIndexesAbort(sessionId, cmOptimizeIndex, apIVersion)

Abort Index Optimization

Force index optimizer to abort a job.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMOptimizeIndex cmOptimizeIndex = new CMOptimizeIndex(); // CMOptimizeIndex | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.optimizeIndexesAbort(sessionId, cmOptimizeIndex, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#optimizeIndexesAbort");
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
| **cmOptimizeIndex** | [**CMOptimizeIndex**](CMOptimizeIndex.md)|  | |
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

<a id="redactDocument"></a>
# **redactDocument**
> byte[] redactDocument(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, sessionId)

Redact Document

Create a redacted version of a document as a PDF given its url.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String url = "url_example"; // String | the base-64 encoded (no-prefix) url of the document
    String entityCsv = "entityCsv_example"; // String | a csv list of entities to redact (e.g. person,location)
    String wordCsv = "wordCsv_example"; // String | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.)
    String allowWordsCsv = "allowWordsCsv_example"; // String | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.)
    String sessionId = "sessionId_example"; // String | an optional SimSage Session id.
    try {
      byte[] result = apiInstance.redactDocument(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#redactDocument");
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
| **entityCsv** | **String**| a csv list of entities to redact (e.g. person,location) | |
| **wordCsv** | **String**| a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) | |
| **allowWordsCsv** | **String**| a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) | |
| **sessionId** | **String**| an optional SimSage Session id. | [optional] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | fail response |  -  |
| **200** | OK response |  -  |

<a id="saveCategorization"></a>
# **saveCategorization**
> JsonMessage saveCategorization(sessionId, cmCategorization, apIVersion)

save categorization

create or update a specific categorization for a given org/kb

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMCategorization cmCategorization = new CMCategorization(); // CMCategorization | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.saveCategorization(sessionId, cmCategorization, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#saveCategorization");
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
| **cmCategorization** | [**CMCategorization**](CMCategorization.md)|  | |
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

<a id="saveSemantic"></a>
# **saveSemantic**
> JsonMessage saveSemantic(organisationId, kbId, sessionId, cmSemanticModelEdit, apIVersion)

Save Semantic

Create or update (save) a semantic in SimSage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSemanticModelEdit cmSemanticModelEdit = new CMSemanticModelEdit(); // CMSemanticModelEdit | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.saveSemantic(organisationId, kbId, sessionId, cmSemanticModelEdit, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#saveSemantic");
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
| **cmSemanticModelEdit** | [**CMSemanticModelEdit**](CMSemanticModelEdit.md)|  | |
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

<a id="saveSynSet"></a>
# **saveSynSet**
> JsonMessage saveSynSet(organisationId, kbId, sessionId, cmSynSet, apIVersion)

Save SynSet

Save (update/create) a syn-set in SimSage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSynSet cmSynSet = new CMSynSet(); // CMSynSet | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.saveSynSet(organisationId, kbId, sessionId, cmSynSet, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#saveSynSet");
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
| **cmSynSet** | [**CMSynSet**](CMSynSet.md)|  | |
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

<a id="saveSynonym"></a>
# **saveSynonym**
> JsonMessage saveSynonym(organisationId, kbId, sessionId, cmSynonym, apIVersion)

Save Synonym

Save (update/create) a synonym.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMSynonym cmSynonym = new CMSynonym(); // CMSynonym | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.saveSynonym(organisationId, kbId, sessionId, cmSynonym, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#saveSynonym");
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
| **cmSynonym** | [**CMSynonym**](CMSynonym.md)|  | |
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

<a id="tuneLanguageGraph"></a>
# **tuneLanguageGraph**
> JsonMessage tuneLanguageGraph(organisationId, kbId, sessionId, apIVersion)

Tune Graph

Create a tuned language graph for a given organisation/knowledge-base.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String kbId = "kbId_example"; // String | the knowledge-base (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.tuneLanguageGraph(organisationId, kbId, sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#tuneLanguageGraph");
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

<a id="version2"></a>
# **version2**
> CMVersion version2()

Version

Return the version of the SimSage Language Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    try {
      CMVersion result = apiInstance.version2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#version2");
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

