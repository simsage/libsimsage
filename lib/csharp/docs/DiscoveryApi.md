# Org.OpenAPITools.Api.DiscoveryApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AllGdprProjects**](DiscoveryApi.md#allgdprprojects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
| [**ApplyRedactions**](DiscoveryApi.md#applyredactions) | **POST** /api/discovery/applyredactions |  |
| [**CreateGdprProject**](DiscoveryApi.md#creategdprproject) | **POST** /api/discovery/createproject |  |
| [**DeleteProject**](DiscoveryApi.md#deleteproject) | **DELETE** /api/discovery/deleteproject |  |
| [**ExportRedactedDoc**](DiscoveryApi.md#exportredacteddoc) | **POST** /api/discovery/exportredacteddoc |  |
| [**GetGdprDocument**](DiscoveryApi.md#getgdprdocument) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} |  |
| [**GetPagedProjectDocuments**](DiscoveryApi.md#getpagedprojectdocuments) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
| [**GrowthPerMonth**](DiscoveryApi.md#growthpermonth) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth |
| [**Setdocumentredactions**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument |  |
| [**StorageBySource**](DiscoveryApi.md#storagebysource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage |
| [**SummaryByDocumentType**](DiscoveryApi.md#summarybydocumenttype) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage |
| [**UpdateDocumentSet**](DiscoveryApi.md#updatedocumentset) | **POST** /api/discovery/updatedocumentset |  |
| [**Version5**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version |

<a id="allgdprprojects"></a>
# **AllGdprProjects**
> Object AllGdprProjects (string organisationId, string kbId, int page, int pageSize, string textFilter, string statusFilter, string sortColumn, int sortDirection, string sessionId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AllGdprProjectsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var page = 56;  // int | the page to render
            var pageSize = 56;  // int | the page size to use
            var textFilter = "textFilter_example";  // string | the text filter passed in or blank if empty
            var statusFilter = "statusFilter_example";  // string | the status filter passed in
            var sortColumn = "sortColumn_example";  // string | the sort column used for the results
            var sortDirection = 56;  // int | sort direction to use (0/1)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                Object result = apiInstance.AllGdprProjects(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.AllGdprProjects: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AllGdprProjectsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.AllGdprProjectsWithHttpInfo(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.AllGdprProjectsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **page** | **int** | the page to render |  |
| **pageSize** | **int** | the page size to use |  |
| **textFilter** | **string** | the text filter passed in or blank if empty |  |
| **statusFilter** | **string** | the status filter passed in |  |
| **sortColumn** | **string** | the sort column used for the results |  |
| **sortDirection** | **int** | sort direction to use (0/1) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="applyredactions"></a>
# **ApplyRedactions**
> Object ApplyRedactions (string sessionId, CMRedactionData cMRedactionData)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ApplyRedactionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMRedactionData = new CMRedactionData(); // CMRedactionData | 

            try
            {
                Object result = apiInstance.ApplyRedactions(sessionId, cMRedactionData);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.ApplyRedactions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ApplyRedactionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.ApplyRedactionsWithHttpInfo(sessionId, cMRedactionData);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.ApplyRedactionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMRedactionData** | [**CMRedactionData**](CMRedactionData.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="creategdprproject"></a>
# **CreateGdprProject**
> Object CreateGdprProject (string sessionId, CMCreateGdprProject cMCreateGdprProject)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateGdprProjectExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMCreateGdprProject = new CMCreateGdprProject(); // CMCreateGdprProject | 

            try
            {
                Object result = apiInstance.CreateGdprProject(sessionId, cMCreateGdprProject);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.CreateGdprProject: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateGdprProjectWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.CreateGdprProjectWithHttpInfo(sessionId, cMCreateGdprProject);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.CreateGdprProjectWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMCreateGdprProject** | [**CMCreateGdprProject**](CMCreateGdprProject.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteproject"></a>
# **DeleteProject**
> Object DeleteProject (string sessionId, CMDeleteProjectCmd cMDeleteProjectCmd)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteProjectExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMDeleteProjectCmd = new CMDeleteProjectCmd(); // CMDeleteProjectCmd | 

            try
            {
                Object result = apiInstance.DeleteProject(sessionId, cMDeleteProjectCmd);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.DeleteProject: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteProjectWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DeleteProjectWithHttpInfo(sessionId, cMDeleteProjectCmd);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.DeleteProjectWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMDeleteProjectCmd** | [**CMDeleteProjectCmd**](CMDeleteProjectCmd.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportredacteddoc"></a>
# **ExportRedactedDoc**
> Object ExportRedactedDoc (string sessionId, CMExportRedactedDocument cMExportRedactedDocument)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ExportRedactedDocExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMExportRedactedDocument = new CMExportRedactedDocument(); // CMExportRedactedDocument | 

            try
            {
                Object result = apiInstance.ExportRedactedDoc(sessionId, cMExportRedactedDocument);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.ExportRedactedDoc: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportRedactedDocWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.ExportRedactedDocWithHttpInfo(sessionId, cMExportRedactedDocument);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.ExportRedactedDocWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMExportRedactedDocument** | [**CMExportRedactedDocument**](CMExportRedactedDocument.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getgdprdocument"></a>
# **GetGdprDocument**
> Object GetGdprDocument (string organisationId, string kbId, string projectId, string url, string sessionId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetGdprDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var projectId = "projectId_example";  // string | Project Id for the items
            var url = "url_example";  // string | The url of the document to retrieve
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                Object result = apiInstance.GetGdprDocument(organisationId, kbId, projectId, url, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.GetGdprDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetGdprDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.GetGdprDocumentWithHttpInfo(organisationId, kbId, projectId, url, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.GetGdprDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **projectId** | **string** | Project Id for the items |  |
| **url** | **string** | The url of the document to retrieve |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getpagedprojectdocuments"></a>
# **GetPagedProjectDocuments**
> Object GetPagedProjectDocuments (string organisationId, string kbId, string projectId, int page, int pageSize, string textFilter, string typeFilter, string statusFilter, string sortColumn, int sortDirection, string sessionId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPagedProjectDocumentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var projectId = "projectId_example";  // string | Project Id for the items
            var page = 56;  // int | the page to render
            var pageSize = 56;  // int | the page size to use
            var textFilter = "textFilter_example";  // string | the text filter passed in or blank if empty
            var typeFilter = "typeFilter_example";  // string | the type filter passed in
            var statusFilter = "statusFilter_example";  // string | the status filter passed in
            var sortColumn = "sortColumn_example";  // string | the sort column used for the results
            var sortDirection = 56;  // int | sort direction to use (0/1)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                Object result = apiInstance.GetPagedProjectDocuments(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.GetPagedProjectDocuments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPagedProjectDocumentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.GetPagedProjectDocumentsWithHttpInfo(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.GetPagedProjectDocumentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **kbId** | **string** | the knowledge-base (its guid id) |  |
| **projectId** | **string** | Project Id for the items |  |
| **page** | **int** | the page to render |  |
| **pageSize** | **int** | the page size to use |  |
| **textFilter** | **string** | the text filter passed in or blank if empty |  |
| **typeFilter** | **string** | the type filter passed in |  |
| **statusFilter** | **string** | the status filter passed in |  |
| **sortColumn** | **string** | the sort column used for the results |  |
| **sortDirection** | **int** | sort direction to use (0/1) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="growthpermonth"></a>
# **GrowthPerMonth**
> Object GrowthPerMonth (string organisationId, string kbId, string sessionId)

growth

Get the storage growth delta per month

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GrowthPerMonthExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // growth
                Object result = apiInstance.GrowthPerMonth(organisationId, kbId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.GrowthPerMonth: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GrowthPerMonthWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // growth
    ApiResponse<Object> response = apiInstance.GrowthPerMonthWithHttpInfo(organisationId, kbId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.GrowthPerMonthWithHttpInfo: " + e.Message);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="setdocumentredactions"></a>
# **Setdocumentredactions**
> Object Setdocumentredactions (string sessionId, CMRedactionData cMRedactionData)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SetdocumentredactionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMRedactionData = new CMRedactionData(); // CMRedactionData | 

            try
            {
                Object result = apiInstance.Setdocumentredactions(sessionId, cMRedactionData);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.Setdocumentredactions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SetdocumentredactionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.SetdocumentredactionsWithHttpInfo(sessionId, cMRedactionData);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.SetdocumentredactionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMRedactionData** | [**CMRedactionData**](CMRedactionData.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="storagebysource"></a>
# **StorageBySource**
> Object StorageBySource (string organisationId, string kbId, string sessionId)

storage

Get the current amount of storage used by source

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class StorageBySourceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // storage
                Object result = apiInstance.StorageBySource(organisationId, kbId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.StorageBySource: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StorageBySourceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // storage
    ApiResponse<Object> response = apiInstance.StorageBySourceWithHttpInfo(organisationId, kbId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.StorageBySourceWithHttpInfo: " + e.Message);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="summarybydocumenttype"></a>
# **SummaryByDocumentType**
> Object SummaryByDocumentType (string organisationId, string kbId, string sessionId)

storage

Get the current amount of storage used by source and document type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SummaryByDocumentTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var kbId = "kbId_example";  // string | the knowledge-base (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // storage
                Object result = apiInstance.SummaryByDocumentType(organisationId, kbId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.SummaryByDocumentType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SummaryByDocumentTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // storage
    ApiResponse<Object> response = apiInstance.SummaryByDocumentTypeWithHttpInfo(organisationId, kbId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.SummaryByDocumentTypeWithHttpInfo: " + e.Message);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatedocumentset"></a>
# **UpdateDocumentSet**
> Object UpdateDocumentSet (string sessionId, CMUpdateDocumentSet cMUpdateDocumentSet)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateDocumentSetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMUpdateDocumentSet = new CMUpdateDocumentSet(); // CMUpdateDocumentSet | 

            try
            {
                Object result = apiInstance.UpdateDocumentSet(sessionId, cMUpdateDocumentSet);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.UpdateDocumentSet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateDocumentSetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.UpdateDocumentSetWithHttpInfo(sessionId, cMUpdateDocumentSet);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.UpdateDocumentSetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMUpdateDocumentSet** | [**CMUpdateDocumentSet**](CMUpdateDocumentSet.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version5"></a>
# **Version5**
> CMVersion Version5 ()

Version

Get the version of SimSage Discovery Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version5Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://test.simsage.ai";
            var apiInstance = new DiscoveryApi(config);

            try
            {
                // Version
                CMVersion result = apiInstance.Version5();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscoveryApi.Version5: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version5WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Version
    ApiResponse<CMVersion> response = apiInstance.Version5WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiscoveryApi.Version5WithHttpInfo: " + e.Message);
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

