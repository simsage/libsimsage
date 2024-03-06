# Org.OpenAPITools.Api.SemanticApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteTextToSearch**](SemanticApi.md#deletetexttosearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search |
| [**DocumentQuestionAndAnswer**](SemanticApi.md#documentquestionandanswer) | **POST** /api/semantic/document-qa | Document Q&amp;A |
| [**GetTextToSearchPaginated**](SemanticApi.md#gettexttosearchpaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings |
| [**RestfulClientQuery**](SemanticApi.md#restfulclientquery) | **POST** /api/semantic/query | Client Query |
| [**SaveTextToSearch**](SemanticApi.md#savetexttosearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item |
| [**ShortSummary**](SemanticApi.md#shortsummary) | **POST** /api/semantic/short-summary | Short summary |
| [**TryTextToSearchConversion**](SemanticApi.md#trytexttosearchconversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search |
| [**Version1**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version |

<a id="deletetexttosearch"></a>
# **DeleteTextToSearch**
> JsonMessage DeleteTextToSearch (string organisationId, string kbId, string word, string sessionId, string? aPIVersion = null)

Delete text-to-search

Remove an existing text-to-search item.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteTextToSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var word = sort();  // string | the word of the text-to-search word
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete text-to-search
                JsonMessage result = apiInstance.DeleteTextToSearch(organisationId, kbId, word, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.DeleteTextToSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteTextToSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete text-to-search
    ApiResponse<JsonMessage> response = apiInstance.DeleteTextToSearchWithHttpInfo(organisationId, kbId, word, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.DeleteTextToSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **word** | **string** | the word of the text-to-search word |  |
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

<a id="documentquestionandanswer"></a>
# **DocumentQuestionAndAnswer**
> CMDocumentQuestionAndAnswer DocumentQuestionAndAnswer (string sessionId, CMDocumentQuestionAndAnswer cMDocumentQuestionAndAnswer)

Document Q&A

Answer a question about a given document

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DocumentQuestionAndAnswerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDocumentQuestionAndAnswer = new CMDocumentQuestionAndAnswer(); // CMDocumentQuestionAndAnswer | 

            try
            {
                // Document Q&A
                CMDocumentQuestionAndAnswer result = apiInstance.DocumentQuestionAndAnswer(sessionId, cMDocumentQuestionAndAnswer);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.DocumentQuestionAndAnswer: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DocumentQuestionAndAnswerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Document Q&A
    ApiResponse<CMDocumentQuestionAndAnswer> response = apiInstance.DocumentQuestionAndAnswerWithHttpInfo(sessionId, cMDocumentQuestionAndAnswer);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.DocumentQuestionAndAnswerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDocumentQuestionAndAnswer** | [**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="gettexttosearchpaginated"></a>
# **GetTextToSearchPaginated**
> CMTextToSearchPaginatedReturn GetTextToSearchPaginated (string sessionId, CMTextToSearchPaginated cMTextToSearchPaginated, string? aPIVersion = null)

Text to Search mappings

Return a paginated list of text-to-search mappings with an optional filter.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetTextToSearchPaginatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMTextToSearchPaginated = new CMTextToSearchPaginated(); // CMTextToSearchPaginated | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Text to Search mappings
                CMTextToSearchPaginatedReturn result = apiInstance.GetTextToSearchPaginated(sessionId, cMTextToSearchPaginated, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.GetTextToSearchPaginated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetTextToSearchPaginatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Text to Search mappings
    ApiResponse<CMTextToSearchPaginatedReturn> response = apiInstance.GetTextToSearchPaginatedWithHttpInfo(sessionId, cMTextToSearchPaginated, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.GetTextToSearchPaginatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMTextToSearchPaginated** | [**CMTextToSearchPaginated**](CMTextToSearchPaginated.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | response |  -  |
| **500** | fail response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="restfulclientquery"></a>
# **RestfulClientQuery**
> CMClientQueryResult RestfulClientQuery (CMClientQuery cMClientQuery)

Client Query

a SimSage client asks a question or performs a keyword-search.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RestfulClientQueryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var cMClientQuery = new CMClientQuery(); // CMClientQuery | 

            try
            {
                // Client Query
                CMClientQueryResult result = apiInstance.RestfulClientQuery(cMClientQuery);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.RestfulClientQuery: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RestfulClientQueryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Client Query
    ApiResponse<CMClientQueryResult> response = apiInstance.RestfulClientQueryWithHttpInfo(cMClientQuery);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.RestfulClientQueryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMClientQuery** | [**CMClientQuery**](CMClientQuery.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savetexttosearch"></a>
# **SaveTextToSearch**
> JsonMessage SaveTextToSearch (string organisationId, string kbId, string sessionId, CMTextToSearchEdit cMTextToSearchEdit, string? aPIVersion = null)

Save a text-to-search item

Create or update (save) a text-to-search item.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveTextToSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMTextToSearchEdit = new CMTextToSearchEdit(); // CMTextToSearchEdit | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save a text-to-search item
                JsonMessage result = apiInstance.SaveTextToSearch(organisationId, kbId, sessionId, cMTextToSearchEdit, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.SaveTextToSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveTextToSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save a text-to-search item
    ApiResponse<JsonMessage> response = apiInstance.SaveTextToSearchWithHttpInfo(organisationId, kbId, sessionId, cMTextToSearchEdit, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.SaveTextToSearchWithHttpInfo: " + e.Message);
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
| **cMTextToSearchEdit** | [**CMTextToSearchEdit**](CMTextToSearchEdit.md) |  |  |
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

<a id="shortsummary"></a>
# **ShortSummary**
> CMShortSummaryResult ShortSummary (CMShortSummary cMShortSummary)

Short summary

Create a short summary for a given url / sentence

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ShortSummaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var cMShortSummary = new CMShortSummary(); // CMShortSummary | 

            try
            {
                // Short summary
                CMShortSummaryResult result = apiInstance.ShortSummary(cMShortSummary);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.ShortSummary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ShortSummaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Short summary
    ApiResponse<CMShortSummaryResult> response = apiInstance.ShortSummaryWithHttpInfo(cMShortSummary);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.ShortSummaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMShortSummary** | [**CMShortSummary**](CMShortSummary.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="trytexttosearchconversion"></a>
# **TryTextToSearchConversion**
> CMTextToSearchConversionReturn TryTextToSearchConversion (string sessionId, CMTextToSearchConversion cMTextToSearchConversion, string? aPIVersion = null)

try converting text-to-search

See the results of a text-to-search conversion

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TryTextToSearchConversionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMTextToSearchConversion = new CMTextToSearchConversion(); // CMTextToSearchConversion | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // try converting text-to-search
                CMTextToSearchConversionReturn result = apiInstance.TryTextToSearchConversion(sessionId, cMTextToSearchConversion, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.TryTextToSearchConversion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TryTextToSearchConversionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // try converting text-to-search
    ApiResponse<CMTextToSearchConversionReturn> response = apiInstance.TryTextToSearchConversionWithHttpInfo(sessionId, cMTextToSearchConversion, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.TryTextToSearchConversionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMTextToSearchConversion** | [**CMTextToSearchConversion**](CMTextToSearchConversion.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version1"></a>
# **Version1**
> CMVersion Version1 ()

Version

Get the version of SimSage Search Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new SemanticApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version1();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticApi.Version1: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version1WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.Version1WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticApi.Version1WithHttpInfo: " + e.Message);
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

