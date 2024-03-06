# Org.OpenAPITools.Api.LanguageApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AddDefaultSynSets**](LanguageApi.md#adddefaultsynsets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets |
| [**DeleteAllSynonyms**](LanguageApi.md#deleteallsynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms |
| [**DeleteCategorization**](LanguageApi.md#deletecategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization |
| [**DeleteSemantic**](LanguageApi.md#deletesemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic |
| [**DeleteSynSet**](LanguageApi.md#deletesynset) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet |
| [**DeleteSynonym**](LanguageApi.md#deletesynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym |
| [**FindSynSets**](LanguageApi.md#findsynsets) | **PUT** /api/language/find-syn-sets | Find SynSets |
| [**GetCategorizationList**](LanguageApi.md#getcategorizationlist) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list |
| [**GetPaginated**](LanguageApi.md#getpaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated |
| [**GetSemanticsPaginated**](LanguageApi.md#getsemanticspaginated) | **PUT** /api/language/semantics | Semantics Paginated |
| [**OptimizeIndexes**](LanguageApi.md#optimizeindexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes |
| [**RedactDocument**](LanguageApi.md#redactdocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document |
| [**SaveCategorization**](LanguageApi.md#savecategorization) | **PUT** /api/language/categorization | save categorization |
| [**SaveSemantic**](LanguageApi.md#savesemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic |
| [**SaveSynSet**](LanguageApi.md#savesynset) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet |
| [**SaveSynonym**](LanguageApi.md#savesynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym |
| [**TuneLanguageGraph**](LanguageApi.md#tunelanguagegraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph |
| [**Version2**](LanguageApi.md#version2) | **GET** /api/language/version | Version |

<a id="adddefaultsynsets"></a>
# **AddDefaultSynSets**
> JsonMessage AddDefaultSynSets (string organisationId, string kbId, string sessionId, string? aPIVersion = null)

Add all default SynSets

Add default syn-sets to the given org/kb

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddDefaultSynSetsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Add all default SynSets
                JsonMessage result = apiInstance.AddDefaultSynSets(organisationId, kbId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.AddDefaultSynSets: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AddDefaultSynSetsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add all default SynSets
    ApiResponse<JsonMessage> response = apiInstance.AddDefaultSynSetsWithHttpInfo(organisationId, kbId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.AddDefaultSynSetsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteallsynonyms"></a>
# **DeleteAllSynonyms**
> JsonMessage DeleteAllSynonyms (string organisationId, string kbId, string sessionId, string? aPIVersion = null)

Delete All Synonyms

Delete all synonyms for a given org/kb

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteAllSynonymsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base to delete/remove (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete All Synonyms
                JsonMessage result = apiInstance.DeleteAllSynonyms(organisationId, kbId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.DeleteAllSynonyms: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteAllSynonymsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete All Synonyms
    ApiResponse<JsonMessage> response = apiInstance.DeleteAllSynonymsWithHttpInfo(organisationId, kbId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.DeleteAllSynonymsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base to delete/remove (its guid id) |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletecategorization"></a>
# **DeleteCategorization**
> JsonMessage DeleteCategorization (string organisationId, string kbId, string categorizationLabel, string sessionId, string? aPIVersion = null)

remove categorization

remove a specific categorization for a given org/kb

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteCategorizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var categorizationLabel = "categorizationLabel_example";  // string | the metadata (name) to remove
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // remove categorization
                JsonMessage result = apiInstance.DeleteCategorization(organisationId, kbId, categorizationLabel, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.DeleteCategorization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteCategorizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // remove categorization
    ApiResponse<JsonMessage> response = apiInstance.DeleteCategorizationWithHttpInfo(organisationId, kbId, categorizationLabel, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.DeleteCategorizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **categorizationLabel** | **string** | the metadata (name) to remove |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletesemantic"></a>
# **DeleteSemantic**
> JsonMessage DeleteSemantic (string organisationId, string kbId, string word, string semantic, string sessionId, string? aPIVersion = null)

Delete Semantic

Remove an existing semantic from SimSage.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteSemanticExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var word = John;  // string | the word (more specific item) of the semantic to delete (eg. \"John\")
            var semantic = person;  // string | the semantic of the word to delete (eg. \"person\")
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete Semantic
                JsonMessage result = apiInstance.DeleteSemantic(organisationId, kbId, word, semantic, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.DeleteSemantic: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteSemanticWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Semantic
    ApiResponse<JsonMessage> response = apiInstance.DeleteSemanticWithHttpInfo(organisationId, kbId, word, semantic, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.DeleteSemanticWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **word** | **string** | the word (more specific item) of the semantic to delete (eg. \&quot;John\&quot;) |  |
| **semantic** | **string** | the semantic of the word to delete (eg. \&quot;person\&quot;) |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletesynset"></a>
# **DeleteSynSet**
> JsonMessage DeleteSynSet (string organisationId, string kbId, string lemma, string sessionId, string? aPIVersion = null)

Delete SynSet

Remove a syn-set from SimSage by lemma.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteSynSetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var lemma = "lemma_example";  // string | the lemma (base word) of the syn-set to remove.
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete SynSet
                JsonMessage result = apiInstance.DeleteSynSet(organisationId, kbId, lemma, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.DeleteSynSet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteSynSetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete SynSet
    ApiResponse<JsonMessage> response = apiInstance.DeleteSynSetWithHttpInfo(organisationId, kbId, lemma, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.DeleteSynSetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **lemma** | **string** | the lemma (base word) of the syn-set to remove. |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletesynonym"></a>
# **DeleteSynonym**
> JsonMessage DeleteSynonym (string organisationId, string kbId, int id, string sessionId, string? aPIVersion = null)

Delete Synonym

Delete a synonym using its id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteSynonymExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var id = 56;  // int | the id of the synonym to remove.
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete Synonym
                JsonMessage result = apiInstance.DeleteSynonym(organisationId, kbId, id, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.DeleteSynonym: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteSynonymWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Synonym
    ApiResponse<JsonMessage> response = apiInstance.DeleteSynonymWithHttpInfo(organisationId, kbId, id, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.DeleteSynonymWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **id** | **int** | the id of the synonym to remove. |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="findsynsets"></a>
# **FindSynSets**
> CMSynSetList FindSynSets (string sessionId, CMSynSetFind cMSynSetFind, string? aPIVersion = null)

Find SynSets

Find syn-sets using filters

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FindSynSetsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSynSetFind = new CMSynSetFind(); // CMSynSetFind | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Find SynSets
                CMSynSetList result = apiInstance.FindSynSets(sessionId, cMSynSetFind, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.FindSynSets: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FindSynSetsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Find SynSets
    ApiResponse<CMSynSetList> response = apiInstance.FindSynSetsWithHttpInfo(sessionId, cMSynSetFind, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.FindSynSetsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSynSetFind** | [**CMSynSetFind**](CMSynSetFind.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcategorizationlist"></a>
# **GetCategorizationList**
> CMCategorizationPaginatedList GetCategorizationList (string organisationId, string kbId, string prevCategorizationLabel, int pageSize, string sessionId, string? aPIVersion = null)

categorization list

get all categorizations for a given org/kb paginated

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetCategorizationListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var prevCategorizationLabel = "prevCategorizationLabel_example";  // string | the previous categorization label for pagination, or null if first page
            var pageSize = 56;  // int | the size of the page returned
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // categorization list
                CMCategorizationPaginatedList result = apiInstance.GetCategorizationList(organisationId, kbId, prevCategorizationLabel, pageSize, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.GetCategorizationList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCategorizationListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // categorization list
    ApiResponse<CMCategorizationPaginatedList> response = apiInstance.GetCategorizationListWithHttpInfo(organisationId, kbId, prevCategorizationLabel, pageSize, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.GetCategorizationListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **prevCategorizationLabel** | **string** | the previous categorization label for pagination, or null if first page |  |
| **pageSize** | **int** | the size of the page returned |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getpaginated"></a>
# **GetPaginated**
> CMSynonymsPaginatedResult GetPaginated (string sessionId, CMSynonymsPaginated cMSynonymsPaginated, string? aPIVersion = null)

get Synonyms Paginated

return a paginated list of synonyms with optional filtering.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPaginatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSynonymsPaginated = new CMSynonymsPaginated(); // CMSynonymsPaginated | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // get Synonyms Paginated
                CMSynonymsPaginatedResult result = apiInstance.GetPaginated(sessionId, cMSynonymsPaginated, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.GetPaginated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPaginatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get Synonyms Paginated
    ApiResponse<CMSynonymsPaginatedResult> response = apiInstance.GetPaginatedWithHttpInfo(sessionId, cMSynonymsPaginated, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.GetPaginatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSynonymsPaginated** | [**CMSynonymsPaginated**](CMSynonymsPaginated.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsemanticspaginated"></a>
# **GetSemanticsPaginated**
> CMSemanticsPaginatedResult GetSemanticsPaginated (string sessionId, CMSemanticsPaginated cMSemanticsPaginated, string? aPIVersion = null)

Semantics Paginated

Return a paginated list of semantics with an optional filter.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSemanticsPaginatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSemanticsPaginated = new CMSemanticsPaginated(); // CMSemanticsPaginated | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Semantics Paginated
                CMSemanticsPaginatedResult result = apiInstance.GetSemanticsPaginated(sessionId, cMSemanticsPaginated, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.GetSemanticsPaginated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSemanticsPaginatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Semantics Paginated
    ApiResponse<CMSemanticsPaginatedResult> response = apiInstance.GetSemanticsPaginatedWithHttpInfo(sessionId, cMSemanticsPaginated, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.GetSemanticsPaginatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSemanticsPaginated** | [**CMSemanticsPaginated**](CMSemanticsPaginated.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="optimizeindexes"></a>
# **OptimizeIndexes**
> JsonMessage OptimizeIndexes (string sessionId, CMOptimizeIndex cMOptimizeIndex, string? aPIVersion = null)

Optimize Indexes

Force index optimization for a the given knowledge-base, now.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class OptimizeIndexesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMOptimizeIndex = new CMOptimizeIndex(); // CMOptimizeIndex | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Optimize Indexes
                JsonMessage result = apiInstance.OptimizeIndexes(sessionId, cMOptimizeIndex, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.OptimizeIndexes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the OptimizeIndexesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Optimize Indexes
    ApiResponse<JsonMessage> response = apiInstance.OptimizeIndexesWithHttpInfo(sessionId, cMOptimizeIndex, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.OptimizeIndexesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMOptimizeIndex** | [**CMOptimizeIndex**](CMOptimizeIndex.md) |  |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="redactdocument"></a>
# **RedactDocument**
> byte[] RedactDocument (string organisationId, string kbId, string url, string entityCsv, string wordCsv, string allowWordsCsv, string? sessionId = null)

Redact Document

Create a redacted version of a document as a PDF given its url.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RedactDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var url = "url_example";  // string | the base-64 encoded (no-prefix) url of the document
            var entityCsv = "entityCsv_example";  // string | a csv list of entities to redact (e.g. person,location)
            var wordCsv = "wordCsv_example";  // string | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.)
            var allowWordsCsv = "allowWordsCsv_example";  // string | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.)
            var sessionId = "sessionId_example";  // string? | an optional SimSage Session id. (optional) 

            try
            {
                // Redact Document
                byte[] result = apiInstance.RedactDocument(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.RedactDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RedactDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Redact Document
    ApiResponse<byte[]> response = apiInstance.RedactDocumentWithHttpInfo(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.RedactDocumentWithHttpInfo: " + e.Message);
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
| **entityCsv** | **string** | a csv list of entities to redact (e.g. person,location) |  |
| **wordCsv** | **string** | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) |  |
| **allowWordsCsv** | **string** | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) |  |
| **sessionId** | **string?** | an optional SimSage Session id. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savecategorization"></a>
# **SaveCategorization**
> JsonMessage SaveCategorization (string sessionId, CMCategorization cMCategorization, string? aPIVersion = null)

save categorization

create or update a specific categorization for a given org/kb

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveCategorizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMCategorization = new CMCategorization(); // CMCategorization | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // save categorization
                JsonMessage result = apiInstance.SaveCategorization(sessionId, cMCategorization, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.SaveCategorization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveCategorizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // save categorization
    ApiResponse<JsonMessage> response = apiInstance.SaveCategorizationWithHttpInfo(sessionId, cMCategorization, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.SaveCategorizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMCategorization** | [**CMCategorization**](CMCategorization.md) |  |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savesemantic"></a>
# **SaveSemantic**
> JsonMessage SaveSemantic (string organisationId, string kbId, string sessionId, CMSemanticModelEdit cMSemanticModelEdit, string? aPIVersion = null)

Save Semantic

Create or update (save) a semantic in SimSage.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveSemanticExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSemanticModelEdit = new CMSemanticModelEdit(); // CMSemanticModelEdit | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Semantic
                JsonMessage result = apiInstance.SaveSemantic(organisationId, kbId, sessionId, cMSemanticModelEdit, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.SaveSemantic: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveSemanticWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Semantic
    ApiResponse<JsonMessage> response = apiInstance.SaveSemanticWithHttpInfo(organisationId, kbId, sessionId, cMSemanticModelEdit, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.SaveSemanticWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSemanticModelEdit** | [**CMSemanticModelEdit**](CMSemanticModelEdit.md) |  |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savesynset"></a>
# **SaveSynSet**
> JsonMessage SaveSynSet (string organisationId, string kbId, string sessionId, CMSynSet cMSynSet, string? aPIVersion = null)

Save SynSet

Save (update/create) a syn-set in SimSage.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveSynSetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSynSet = new CMSynSet(); // CMSynSet | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save SynSet
                JsonMessage result = apiInstance.SaveSynSet(organisationId, kbId, sessionId, cMSynSet, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.SaveSynSet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveSynSetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save SynSet
    ApiResponse<JsonMessage> response = apiInstance.SaveSynSetWithHttpInfo(organisationId, kbId, sessionId, cMSynSet, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.SaveSynSetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSynSet** | [**CMSynSet**](CMSynSet.md) |  |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savesynonym"></a>
# **SaveSynonym**
> JsonMessage SaveSynonym (string organisationId, string kbId, string sessionId, CMSynonym cMSynonym, string? aPIVersion = null)

Save Synonym

Save (update/create) a synonym.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveSynonymExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSynonym = new CMSynonym(); // CMSynonym | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Synonym
                JsonMessage result = apiInstance.SaveSynonym(organisationId, kbId, sessionId, cMSynonym, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.SaveSynonym: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveSynonymWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Synonym
    ApiResponse<JsonMessage> response = apiInstance.SaveSynonymWithHttpInfo(organisationId, kbId, sessionId, cMSynonym, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.SaveSynonymWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSynonym** | [**CMSynonym**](CMSynonym.md) |  |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tunelanguagegraph"></a>
# **TuneLanguageGraph**
> JsonMessage TuneLanguageGraph (string organisationId, string kbId, string sessionId, string? aPIVersion = null)

Tune Graph

Create a tuned language graph for a given organisation/knowledge-base.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TuneLanguageGraphExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Tune Graph
                JsonMessage result = apiInstance.TuneLanguageGraph(organisationId, kbId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.TuneLanguageGraph: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TuneLanguageGraphWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Tune Graph
    ApiResponse<JsonMessage> response = apiInstance.TuneLanguageGraphWithHttpInfo(organisationId, kbId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.TuneLanguageGraphWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
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
| **500** | fail response |  -  |
| **200** | OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version2"></a>
# **Version2**
> CMVersion Version2 ()

Version

Return the version of the SimSage Language Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new LanguageApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version2();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LanguageApi.Version2: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.Version2WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LanguageApi.Version2WithHttpInfo: " + e.Message);
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

