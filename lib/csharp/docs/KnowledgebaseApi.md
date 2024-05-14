# Org.OpenAPITools.Api.KnowledgebaseApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ExportKnowledgeBase**](KnowledgebaseApi.md#exportknowledgebase) | **POST** /api/knowledgebase/export | export Knowledge-base |
| [**GetKnowledgeBase**](KnowledgebaseApi.md#getknowledgebase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base |
| [**GetKnowledgeBases**](KnowledgebaseApi.md#getknowledgebases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases |
| [**GetSearchInfo**](KnowledgebaseApi.md#getsearchinfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info |
| [**GetSearchInfo2**](KnowledgebaseApi.md#getsearchinfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated] |
| [**RemoveKnowledgeBase**](KnowledgebaseApi.md#removeknowledgebase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base |
| [**UpdateKnowledgeBase**](KnowledgebaseApi.md#updateknowledgebase) | **PUT** /api/knowledgebase/save | Save Knowledge-base |
| [**Version3**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version |

<a id="exportknowledgebase"></a>
# **ExportKnowledgeBase**
> JsonMessage ExportKnowledgeBase (string sessionId, CMKnowledgeBaseExport cMKnowledgeBaseExport, string? aPIVersion = null)

export Knowledge-base

starts the export of a knowledge-base using the passed in exporter config

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ExportKnowledgeBaseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMKnowledgeBaseExport = new CMKnowledgeBaseExport(); // CMKnowledgeBaseExport | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // export Knowledge-base
                JsonMessage result = apiInstance.ExportKnowledgeBase(sessionId, cMKnowledgeBaseExport, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.ExportKnowledgeBase: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportKnowledgeBaseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // export Knowledge-base
    ApiResponse<JsonMessage> response = apiInstance.ExportKnowledgeBaseWithHttpInfo(sessionId, cMKnowledgeBaseExport, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.ExportKnowledgeBaseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMKnowledgeBaseExport** | [**CMKnowledgeBaseExport**](CMKnowledgeBaseExport.md) |  |  |
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
| **200** | export knowledge-base OK response |  -  |
| **500** | could not get search info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getknowledgebase"></a>
# **GetKnowledgeBase**
> CMKnowledgeBase GetKnowledgeBase (string organisationId, string kbId, string sessionId, string? aPIVersion = null)

Get Knowledge-base

Return a knowledge base by id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetKnowledgeBaseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base to get (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get Knowledge-base
                CMKnowledgeBase result = apiInstance.GetKnowledgeBase(organisationId, kbId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.GetKnowledgeBase: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetKnowledgeBaseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Knowledge-base
    ApiResponse<CMKnowledgeBase> response = apiInstance.GetKnowledgeBaseWithHttpInfo(organisationId, kbId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.GetKnowledgeBaseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base to get (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | get knowledge-base response |  -  |
| **500** | could not get knowledge-base. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getknowledgebases"></a>
# **GetKnowledgeBases**
> List&lt;CMKnowledgeBase&gt; GetKnowledgeBases (string organisationId, string sessionId)

Get Knowledge-bases

Return a list of knowledge bases for a given organisation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetKnowledgeBasesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get Knowledge-bases
                List<CMKnowledgeBase> result = apiInstance.GetKnowledgeBases(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.GetKnowledgeBases: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetKnowledgeBasesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Knowledge-bases
    ApiResponse<List<CMKnowledgeBase>> response = apiInstance.GetKnowledgeBasesWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.GetKnowledgeBasesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **200** | get knowledge-base list response |  -  |
| **500** | could not get knowledge-base list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsearchinfo"></a>
# **GetSearchInfo**
> CMInfo GetSearchInfo (string organisationId, string clientId, string? aPIVersion = null)

Search Info

return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSearchInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var clientId = "clientId_example";  // string | the client's id (its guid id), pre-register this client as a known client.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Search Info
                CMInfo result = apiInstance.GetSearchInfo(organisationId, clientId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.GetSearchInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSearchInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search Info
    ApiResponse<CMInfo> response = apiInstance.GetSearchInfoWithHttpInfo(organisationId, clientId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.GetSearchInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **clientId** | **string** | the client&#39;s id (its guid id), pre-register this client as a known client. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | get search info response |  -  |
| **500** | could not get search info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsearchinfo2"></a>
# **GetSearchInfo2**
> CMInfo GetSearchInfo2 (string organisationId, string? aPIVersion = null)

Search Info [deprecated]

Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSearchInfo2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Search Info [deprecated]
                CMInfo result = apiInstance.GetSearchInfo2(organisationId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.GetSearchInfo2: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSearchInfo2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search Info [deprecated]
    ApiResponse<CMInfo> response = apiInstance.GetSearchInfo2WithHttpInfo(organisationId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.GetSearchInfo2WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | get search info response |  -  |
| **500** | could not get search info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="removeknowledgebase"></a>
# **RemoveKnowledgeBase**
> JsonMessage RemoveKnowledgeBase (string organisationId, string kbId, string sessionId, string? aPIVersion = null)

Delete Knowledge-base

Delete a knowledge-base by Id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RemoveKnowledgeBaseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base to delete/remove (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete Knowledge-base
                JsonMessage result = apiInstance.RemoveKnowledgeBase(organisationId, kbId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.RemoveKnowledgeBase: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RemoveKnowledgeBaseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Knowledge-base
    ApiResponse<JsonMessage> response = apiInstance.RemoveKnowledgeBaseWithHttpInfo(organisationId, kbId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.RemoveKnowledgeBaseWithHttpInfo: " + e.Message);
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
| **500** | could not delete knowledge-base. |  -  |
| **200** | delete knowledge-base OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateknowledgebase"></a>
# **UpdateKnowledgeBase**
> KnowledgeBase UpdateKnowledgeBase (string sessionId, CMKnowledgeBase cMKnowledgeBase, string? aPIVersion = null)

Save Knowledge-base

Save (Create or Update) a SimSage knowledge base item.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateKnowledgeBaseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMKnowledgeBase = new CMKnowledgeBase(); // CMKnowledgeBase | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Save Knowledge-base
                KnowledgeBase result = apiInstance.UpdateKnowledgeBase(sessionId, cMKnowledgeBase, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.UpdateKnowledgeBase: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateKnowledgeBaseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Knowledge-base
    ApiResponse<KnowledgeBase> response = apiInstance.UpdateKnowledgeBaseWithHttpInfo(sessionId, cMKnowledgeBase, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.UpdateKnowledgeBaseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMKnowledgeBase** | [**CMKnowledgeBase**](CMKnowledgeBase.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | save knowledge-base response |  -  |
| **500** | could not save knowledge-base. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version3"></a>
# **Version3**
> CMVersion Version3 ()

Version

Return the version of SimSage knowledge-base Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version3Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new KnowledgebaseApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version3();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KnowledgebaseApi.Version3: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version3WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.Version3WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KnowledgebaseApi.Version3WithHttpInfo: " + e.Message);
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
| **500** | could not get version. |  -  |
| **200** | get the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

