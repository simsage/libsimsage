# Org.OpenAPITools.Api.CrawlerApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CrawlerExternalDocumentDelete**](CrawlerApi.md#crawlerexternaldocumentdelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
| [**CrawlerExternalDocumentUnChanged**](CrawlerApi.md#crawlerexternaldocumentunchanged) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged |
| [**CrawlerExternalDocumentUpload**](CrawlerApi.md#crawlerexternaldocumentupload) | **POST** /api/crawler/external/document/upload | Upload External Document |
| [**CrawlerExternalImageUpload**](CrawlerApi.md#crawlerexternalimageupload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
| [**Delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
| [**DeleteDocuments**](CrawlerApi.md#deletedocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents |
| [**EncryptedCommunications**](CrawlerApi.md#encryptedcommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
| [**ExternalCrawler**](CrawlerApi.md#externalcrawler) | **POST** /api/crawler/external/crawler | External Crawler |
| [**ExternalCrawlerFinished**](CrawlerApi.md#externalcrawlerfinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
| [**ExternalCrawlerStart**](CrawlerApi.md#externalcrawlerstart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
| [**GetCrawler**](CrawlerApi.md#getcrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
| [**GetSourceList**](CrawlerApi.md#getsourcelist) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
| [**OidcCode**](CrawlerApi.md#oidccode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
| [**ProcessAllFiles**](CrawlerApi.md#processallfiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
| [**ResetSourceDelta**](CrawlerApi.md#resetsourcedelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
| [**StartCrawler**](CrawlerApi.md#startcrawler) | **POST** /api/crawler/start | Start crawler |
| [**TestCrawler**](CrawlerApi.md#testcrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
| [**UpdateCrawler**](CrawlerApi.md#updatecrawler) | **POST** /api/crawler/crawler | Update Source |
| [**Version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |

<a id="crawlerexternaldocumentdelete"></a>
# **CrawlerExternalDocumentDelete**
> JsonMessage CrawlerExternalDocumentDelete (CMDeleteDocument cMDeleteDocument, string? aPIVersion = null)

Remove an External Document

Remove an external crawler document from SimSage.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CrawlerExternalDocumentDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMDeleteDocument = new CMDeleteDocument(); // CMDeleteDocument | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Remove an External Document
                JsonMessage result = apiInstance.CrawlerExternalDocumentDelete(cMDeleteDocument, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.CrawlerExternalDocumentDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CrawlerExternalDocumentDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove an External Document
    ApiResponse<JsonMessage> response = apiInstance.CrawlerExternalDocumentDeleteWithHttpInfo(cMDeleteDocument, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.CrawlerExternalDocumentDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMDeleteDocument** | [**CMDeleteDocument**](CMDeleteDocument.md) |  |  |
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
| **500** | could not remove external-crawler document. |  -  |
| **200** | remove external-crawler document OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="crawlerexternaldocumentunchanged"></a>
# **CrawlerExternalDocumentUnChanged**
> JsonMessage CrawlerExternalDocumentUnChanged (CMDocumentUnChanged cMDocumentUnChanged, string? aPIVersion = null)

Mark External Document Unchanged

An external crawler document marks a document as not having changed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CrawlerExternalDocumentUnChangedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMDocumentUnChanged = new CMDocumentUnChanged(); // CMDocumentUnChanged | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Mark External Document Unchanged
                JsonMessage result = apiInstance.CrawlerExternalDocumentUnChanged(cMDocumentUnChanged, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.CrawlerExternalDocumentUnChanged: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CrawlerExternalDocumentUnChangedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Mark External Document Unchanged
    ApiResponse<JsonMessage> response = apiInstance.CrawlerExternalDocumentUnChangedWithHttpInfo(cMDocumentUnChanged, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.CrawlerExternalDocumentUnChangedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMDocumentUnChanged** | [**CMDocumentUnChanged**](CMDocumentUnChanged.md) |  |  |
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
| **200** | mark external-crawler document unchanged OK response |  -  |
| **500** | could not mark external-document as unchanged. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="crawlerexternaldocumentupload"></a>
# **CrawlerExternalDocumentUpload**
> JsonMessage CrawlerExternalDocumentUpload (CMUploadDocument cMUploadDocument, string? aPIVersion = null)

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CrawlerExternalDocumentUploadExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMUploadDocument = new CMUploadDocument(); // CMUploadDocument | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Upload External Document
                JsonMessage result = apiInstance.CrawlerExternalDocumentUpload(cMUploadDocument, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.CrawlerExternalDocumentUpload: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CrawlerExternalDocumentUploadWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Upload External Document
    ApiResponse<JsonMessage> response = apiInstance.CrawlerExternalDocumentUploadWithHttpInfo(cMUploadDocument, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.CrawlerExternalDocumentUploadWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMUploadDocument** | [**CMUploadDocument**](CMUploadDocument.md) |  |  |
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
| **200** | upload external-crawler document OK response |  -  |
| **500** | could not start external crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="crawlerexternalimageupload"></a>
# **CrawlerExternalImageUpload**
> JsonMessage CrawlerExternalImageUpload (CMUploadImage cMUploadImage, string? aPIVersion = null)

Upload External Image

An external crawler uploads an image for a document.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CrawlerExternalImageUploadExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMUploadImage = new CMUploadImage(); // CMUploadImage | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Upload External Image
                JsonMessage result = apiInstance.CrawlerExternalImageUpload(cMUploadImage, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.CrawlerExternalImageUpload: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CrawlerExternalImageUploadWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Upload External Image
    ApiResponse<JsonMessage> response = apiInstance.CrawlerExternalImageUploadWithHttpInfo(cMUploadImage, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.CrawlerExternalImageUploadWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMUploadImage** | [**CMUploadImage**](CMUploadImage.md) |  |  |
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
| **200** | upload external-crawler document-image OK response |  -  |
| **500** | could not upload external-crawler document image. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="delete"></a>
# **Delete**
> JsonMessage Delete (string organisationId, string kbId, string sessionId, int sourceId, string? aPIVersion = null)

Delete source

Remove a source and all its content by its source-id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var kbId = "kbId_example";  // string | the knowledge-base's id (a guid)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var sourceId = 56;  // int | the crawler's id
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete source
                JsonMessage result = apiInstance.Delete(organisationId, kbId, sessionId, sourceId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.Delete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete source
    ApiResponse<JsonMessage> response = apiInstance.DeleteWithHttpInfo(organisationId, kbId, sessionId, sourceId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.DeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **kbId** | **string** | the knowledge-base&#39;s id (a guid) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **sourceId** | **int** | the crawler&#39;s id |  |
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
| **200** | remove a source OK response |  -  |
| **500** | could not remove source. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletedocuments"></a>
# **DeleteDocuments**
> CMSource DeleteDocuments (string organisationId, string kbId, string sessionId, int sourceId, string? aPIVersion = null)

Delete source's documents

Remove a source's documents and stop the crawler if it's running.  Return an updated sources.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteDocumentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var kbId = "kbId_example";  // string | the knowledge-base's id (a guid)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var sourceId = 56;  // int | the crawler's id
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Delete source's documents
                CMSource result = apiInstance.DeleteDocuments(organisationId, kbId, sessionId, sourceId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.DeleteDocuments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteDocumentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete source's documents
    ApiResponse<CMSource> response = apiInstance.DeleteDocumentsWithHttpInfo(organisationId, kbId, sessionId, sourceId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.DeleteDocumentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **kbId** | **string** | the knowledge-base&#39;s id (a guid) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **sourceId** | **int** | the crawler&#39;s id |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="encryptedcommunications"></a>
# **EncryptedCommunications**
> JsonMessage EncryptedCommunications (int seed, string body, string? aPIVersion = null)

Secure Communication

Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EncryptedCommunicationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var seed = 56;  // int | a random integer used for the communications
            var body = "body_example";  // string | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Secure Communication
                JsonMessage result = apiInstance.EncryptedCommunications(seed, body, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.EncryptedCommunications: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EncryptedCommunicationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Secure Communication
    ApiResponse<JsonMessage> response = apiInstance.EncryptedCommunicationsWithHttpInfo(seed, body, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.EncryptedCommunicationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **seed** | **int** | a random integer used for the communications |  |
| **body** | **string** |  |  |
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
| **500** | could not execute command. |  -  |
| **200** | secure communication result (various) |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="externalcrawler"></a>
# **ExternalCrawler**
> CMSource ExternalCrawler (CMExternalCrawler cMExternalCrawler, string? aPIVersion = null)

External Crawler

Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ExternalCrawlerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMExternalCrawler = new CMExternalCrawler(); // CMExternalCrawler | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // External Crawler
                CMSource result = apiInstance.ExternalCrawler(cMExternalCrawler, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.ExternalCrawler: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExternalCrawlerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // External Crawler
    ApiResponse<CMSource> response = apiInstance.ExternalCrawlerWithHttpInfo(cMExternalCrawler, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.ExternalCrawlerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMExternalCrawler** | [**CMExternalCrawler**](CMExternalCrawler.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="externalcrawlerfinished"></a>
# **ExternalCrawlerFinished**
> JsonMessage ExternalCrawlerFinished (CMExternalCrawlerStop cMExternalCrawlerStop, string? aPIVersion = null)

Stop External Crawler

An external crawler notifies SimSage it has finished its job, its run through the data once.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ExternalCrawlerFinishedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMExternalCrawlerStop = new CMExternalCrawlerStop(); // CMExternalCrawlerStop | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Stop External Crawler
                JsonMessage result = apiInstance.ExternalCrawlerFinished(cMExternalCrawlerStop, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.ExternalCrawlerFinished: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExternalCrawlerFinishedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Stop External Crawler
    ApiResponse<JsonMessage> response = apiInstance.ExternalCrawlerFinishedWithHttpInfo(cMExternalCrawlerStop, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.ExternalCrawlerFinishedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMExternalCrawlerStop** | [**CMExternalCrawlerStop**](CMExternalCrawlerStop.md) |  |  |
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
| **500** | could not stop external crawler. |  -  |
| **200** | external-crawler stop OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="externalcrawlerstart"></a>
# **ExternalCrawlerStart**
> JsonMessage ExternalCrawlerStart (CMExternalCrawlerStart cMExternalCrawlerStart, string? aPIVersion = null)

Start External Crawler

An external crawler notifies SimSage is it starting a new run.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ExternalCrawlerStartExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var cMExternalCrawlerStart = new CMExternalCrawlerStart(); // CMExternalCrawlerStart | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Start External Crawler
                JsonMessage result = apiInstance.ExternalCrawlerStart(cMExternalCrawlerStart, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.ExternalCrawlerStart: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExternalCrawlerStartWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Start External Crawler
    ApiResponse<JsonMessage> response = apiInstance.ExternalCrawlerStartWithHttpInfo(cMExternalCrawlerStart, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.ExternalCrawlerStartWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMExternalCrawlerStart** | [**CMExternalCrawlerStart**](CMExternalCrawlerStart.md) |  |  |
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
| **200** | external-crawler start OK response |  -  |
| **500** | could not start external crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcrawler"></a>
# **GetCrawler**
> CMSource GetCrawler (string organisationId, string kbId, int sourceId, string sessionId, string? aPIVersion = null)

Get source

Return the data-structure for a source by id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetCrawlerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var kbId = "kbId_example";  // string | the knowledge-base's id (a guid)
            var sourceId = 56;  // int | the crawler's id
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get source
                CMSource result = apiInstance.GetCrawler(organisationId, kbId, sourceId, sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.GetCrawler: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCrawlerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get source
    ApiResponse<CMSource> response = apiInstance.GetCrawlerWithHttpInfo(organisationId, kbId, sourceId, sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.GetCrawlerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **kbId** | **string** | the knowledge-base&#39;s id (a guid) |  |
| **sourceId** | **int** | the crawler&#39;s id |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsourcelist"></a>
# **GetSourceList**
> List&lt;CMSource&gt; GetSourceList (string sessionId, string organisationId, string kbId, string? aPIVersion = null)

Get source List

Get a list of sources for a given organisation / knowledge base.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetSourceListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var kbId = "kbId_example";  // string | the knowledge-base's id (a guid)
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Get source List
                List<CMSource> result = apiInstance.GetSourceList(sessionId, organisationId, kbId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.GetSourceList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSourceListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get source List
    ApiResponse<List<CMSource>> response = apiInstance.GetSourceListWithHttpInfo(sessionId, organisationId, kbId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.GetSourceListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **kbId** | **string** | the knowledge-base&#39;s id (a guid) |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="oidccode"></a>
# **OidcCode**
> void OidcCode (string oidcKey, Dictionary<string, string> allRequestParams)

OIDC code receiver

used for OIDC systems to receive codes

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class OidcCodeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var oidcKey = "oidcKey_example";  // string | the Dropbox OIDC key
            var allRequestParams = new Dictionary<string, string>(); // Dictionary<string, string> | 

            try
            {
                // OIDC code receiver
                apiInstance.OidcCode(oidcKey, allRequestParams);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.OidcCode: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the OidcCodeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // OIDC code receiver
    apiInstance.OidcCodeWithHttpInfo(oidcKey, allRequestParams);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.OidcCodeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **oidcKey** | **string** | the Dropbox OIDC key |  |
| **allRequestParams** | [**Dictionary&lt;string, string&gt;**](string.md) |  |  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="processallfiles"></a>
# **ProcessAllFiles**
> JsonMessage ProcessAllFiles (string sessionId, CMStartCrawler cMStartCrawler, string? aPIVersion = null)

Process all files of crawler/source

Start and force processing all files for a crawler/source

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ProcessAllFilesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMStartCrawler = new CMStartCrawler(); // CMStartCrawler | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Process all files of crawler/source
                JsonMessage result = apiInstance.ProcessAllFiles(sessionId, cMStartCrawler, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.ProcessAllFiles: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ProcessAllFilesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Process all files of crawler/source
    ApiResponse<JsonMessage> response = apiInstance.ProcessAllFilesWithHttpInfo(sessionId, cMStartCrawler, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.ProcessAllFilesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMStartCrawler** | [**CMStartCrawler**](CMStartCrawler.md) |  |  |
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
| **200** | start processing all OK response |  -  |
| **500** | could not start processing files. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="resetsourcedelta"></a>
# **ResetSourceDelta**
> CMSource ResetSourceDelta (string sessionId, string organisationId, string kbId, int sourceId, string? aPIVersion = null)

Reset Source delta-token

reset a SimSage source's delta token.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ResetSourceDeltaExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var kbId = "kbId_example";  // string | the knowledge-base's id (a guid)
            var sourceId = 56;  // int | the crawler's id
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Reset Source delta-token
                CMSource result = apiInstance.ResetSourceDelta(sessionId, organisationId, kbId, sourceId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.ResetSourceDelta: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ResetSourceDeltaWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Reset Source delta-token
    ApiResponse<CMSource> response = apiInstance.ResetSourceDeltaWithHttpInfo(sessionId, organisationId, kbId, sourceId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.ResetSourceDeltaWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **kbId** | **string** | the knowledge-base&#39;s id (a guid) |  |
| **sourceId** | **int** | the crawler&#39;s id |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="startcrawler"></a>
# **StartCrawler**
> JsonMessage StartCrawler (string sessionId, CMStartCrawler cMStartCrawler, string? aPIVersion = null)

Start crawler

Start a crawler by source-id if after it has stopped.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class StartCrawlerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMStartCrawler = new CMStartCrawler(); // CMStartCrawler | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Start crawler
                JsonMessage result = apiInstance.StartCrawler(sessionId, cMStartCrawler, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.StartCrawler: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StartCrawlerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Start crawler
    ApiResponse<JsonMessage> response = apiInstance.StartCrawlerWithHttpInfo(sessionId, cMStartCrawler, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.StartCrawlerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMStartCrawler** | [**CMStartCrawler**](CMStartCrawler.md) |  |  |
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
| **200** | start crawler OK response |  -  |
| **500** | could not start crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="testcrawler"></a>
# **TestCrawler**
> JsonMessage TestCrawler (string sessionId, string organisationId, string kbId, int sourceId, string? aPIVersion = null)

Test Crawler

Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TestCrawlerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var kbId = "kbId_example";  // string | the knowledge-base's id (a guid)
            var sourceId = 56;  // int | the crawler's id
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Test Crawler
                JsonMessage result = apiInstance.TestCrawler(sessionId, organisationId, kbId, sourceId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.TestCrawler: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TestCrawlerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Test Crawler
    ApiResponse<JsonMessage> response = apiInstance.TestCrawlerWithHttpInfo(sessionId, organisationId, kbId, sourceId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.TestCrawlerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **kbId** | **string** | the knowledge-base&#39;s id (a guid) |  |
| **sourceId** | **int** | the crawler&#39;s id |  |
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
| **200** | test crawler connection OK response |  -  |
| **500** | could not test crawler. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecrawler"></a>
# **UpdateCrawler**
> CMSource UpdateCrawler (string sessionId, CMSource cMSource, string? aPIVersion = null)

Update Source

Save (create or update) a SimSage source.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateCrawlerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMSource = new CMSource(); // CMSource | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Update Source
                CMSource result = apiInstance.UpdateCrawler(sessionId, cMSource, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.UpdateCrawler: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateCrawlerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update Source
    ApiResponse<CMSource> response = apiInstance.UpdateCrawlerWithHttpInfo(sessionId, cMSource, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.UpdateCrawlerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMSource** | [**CMSource**](CMSource.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version6"></a>
# **Version6**
> CMVersion Version6 ()

Version

Get the version of SimSage crawler-services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version6Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new CrawlerApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version6();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CrawlerApi.Version6: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version6WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.Version6WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CrawlerApi.Version6WithHttpInfo: " + e.Message);
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

