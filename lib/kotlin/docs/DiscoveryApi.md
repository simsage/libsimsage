# DiscoveryApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allGdprProjects**](DiscoveryApi.md#allGdprProjects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
[**applyRedactions**](DiscoveryApi.md#applyRedactions) | **POST** /api/discovery/applyredactions | 
[**createGdprProject**](DiscoveryApi.md#createGdprProject) | **POST** /api/discovery/createproject | 
[**deleteProject**](DiscoveryApi.md#deleteProject) | **DELETE** /api/discovery/deleteproject | 
[**exportRedactedDoc**](DiscoveryApi.md#exportRedactedDoc) | **POST** /api/discovery/exportredacteddoc | 
[**getGdprDocument**](DiscoveryApi.md#getGdprDocument) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} | 
[**getPagedProjectDocuments**](DiscoveryApi.md#getPagedProjectDocuments) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
[**growthPerMonth**](DiscoveryApi.md#growthPerMonth) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth
[**setdocumentredactions**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument | 
[**storageBySource**](DiscoveryApi.md#storageBySource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage
[**summaryByDocumentType**](DiscoveryApi.md#summaryByDocumentType) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage
[**updateDocumentSet**](DiscoveryApi.md#updateDocumentSet) | **POST** /api/discovery/updatedocumentset | 
[**version5**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version


<a id="allGdprProjects"></a>
# **allGdprProjects**
> kotlin.Any allGdprProjects(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, sessionId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val page : kotlin.Int = 56 // kotlin.Int | the page to render
val pageSize : kotlin.Int = 56 // kotlin.Int | the page size to use
val textFilter : kotlin.String = textFilter_example // kotlin.String | the text filter passed in or blank if empty
val statusFilter : kotlin.String = statusFilter_example // kotlin.String | the status filter passed in
val sortColumn : kotlin.String = sortColumn_example // kotlin.String | the sort column used for the results
val sortDirection : kotlin.Int = 56 // kotlin.Int | sort direction to use (0/1)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.allGdprProjects(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#allGdprProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#allGdprProjects")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **page** | **kotlin.Int**| the page to render |
 **pageSize** | **kotlin.Int**| the page size to use |
 **textFilter** | **kotlin.String**| the text filter passed in or blank if empty |
 **statusFilter** | **kotlin.String**| the status filter passed in |
 **sortColumn** | **kotlin.String**| the sort column used for the results |
 **sortDirection** | **kotlin.Int**| sort direction to use (0/1) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a id="applyRedactions"></a>
# **applyRedactions**
> kotlin.Any applyRedactions(sessionId, cmRedactionData)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmRedactionData : CMRedactionData =  // CMRedactionData | 
try {
    val result : kotlin.Any = apiInstance.applyRedactions(sessionId, cmRedactionData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#applyRedactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#applyRedactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmRedactionData** | [**CMRedactionData**](CMRedactionData.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="createGdprProject"></a>
# **createGdprProject**
> kotlin.Any createGdprProject(sessionId, cmCreateGdprProject)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmCreateGdprProject : CMCreateGdprProject =  // CMCreateGdprProject | 
try {
    val result : kotlin.Any = apiInstance.createGdprProject(sessionId, cmCreateGdprProject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#createGdprProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#createGdprProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmCreateGdprProject** | [**CMCreateGdprProject**](CMCreateGdprProject.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="deleteProject"></a>
# **deleteProject**
> kotlin.Any deleteProject(sessionId, cmDeleteProjectCmd)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDeleteProjectCmd : CMDeleteProjectCmd =  // CMDeleteProjectCmd | 
try {
    val result : kotlin.Any = apiInstance.deleteProject(sessionId, cmDeleteProjectCmd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#deleteProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#deleteProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDeleteProjectCmd** | [**CMDeleteProjectCmd**](CMDeleteProjectCmd.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="exportRedactedDoc"></a>
# **exportRedactedDoc**
> kotlin.Any exportRedactedDoc(sessionId, cmExportRedactedDocument)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmExportRedactedDocument : CMExportRedactedDocument =  // CMExportRedactedDocument | 
try {
    val result : kotlin.Any = apiInstance.exportRedactedDoc(sessionId, cmExportRedactedDocument)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#exportRedactedDoc")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#exportRedactedDoc")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmExportRedactedDocument** | [**CMExportRedactedDocument**](CMExportRedactedDocument.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="getGdprDocument"></a>
# **getGdprDocument**
> kotlin.Any getGdprDocument(organisationId, kbId, projectId, url, sessionId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val projectId : kotlin.String = projectId_example // kotlin.String | Project Id for the items
val url : kotlin.String = url_example // kotlin.String | The url of the document to retrieve
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.getGdprDocument(organisationId, kbId, projectId, url, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#getGdprDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#getGdprDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **projectId** | **kotlin.String**| Project Id for the items |
 **url** | **kotlin.String**| The url of the document to retrieve |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a id="getPagedProjectDocuments"></a>
# **getPagedProjectDocuments**
> kotlin.Any getPagedProjectDocuments(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, sessionId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val projectId : kotlin.String = projectId_example // kotlin.String | Project Id for the items
val page : kotlin.Int = 56 // kotlin.Int | the page to render
val pageSize : kotlin.Int = 56 // kotlin.Int | the page size to use
val textFilter : kotlin.String = textFilter_example // kotlin.String | the text filter passed in or blank if empty
val typeFilter : kotlin.String = typeFilter_example // kotlin.String | the type filter passed in
val statusFilter : kotlin.String = statusFilter_example // kotlin.String | the status filter passed in
val sortColumn : kotlin.String = sortColumn_example // kotlin.String | the sort column used for the results
val sortDirection : kotlin.Int = 56 // kotlin.Int | sort direction to use (0/1)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.getPagedProjectDocuments(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#getPagedProjectDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#getPagedProjectDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **projectId** | **kotlin.String**| Project Id for the items |
 **page** | **kotlin.Int**| the page to render |
 **pageSize** | **kotlin.Int**| the page size to use |
 **textFilter** | **kotlin.String**| the text filter passed in or blank if empty |
 **typeFilter** | **kotlin.String**| the type filter passed in |
 **statusFilter** | **kotlin.String**| the status filter passed in |
 **sortColumn** | **kotlin.String**| the sort column used for the results |
 **sortDirection** | **kotlin.Int**| sort direction to use (0/1) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a id="growthPerMonth"></a>
# **growthPerMonth**
> kotlin.Any growthPerMonth(organisationId, kbId, sessionId)

growth

Get the storage growth delta per month

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.growthPerMonth(organisationId, kbId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#growthPerMonth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#growthPerMonth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a id="setdocumentredactions"></a>
# **setdocumentredactions**
> kotlin.Any setdocumentredactions(sessionId, cmRedactionData)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmRedactionData : CMRedactionData =  // CMRedactionData | 
try {
    val result : kotlin.Any = apiInstance.setdocumentredactions(sessionId, cmRedactionData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#setdocumentredactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#setdocumentredactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmRedactionData** | [**CMRedactionData**](CMRedactionData.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="storageBySource"></a>
# **storageBySource**
> kotlin.Any storageBySource(organisationId, kbId, sessionId)

storage

Get the current amount of storage used by source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.storageBySource(organisationId, kbId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#storageBySource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#storageBySource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a id="summaryByDocumentType"></a>
# **summaryByDocumentType**
> kotlin.Any summaryByDocumentType(organisationId, kbId, sessionId)

storage

Get the current amount of storage used by source and document type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.Any = apiInstance.summaryByDocumentType(organisationId, kbId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#summaryByDocumentType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#summaryByDocumentType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a id="updateDocumentSet"></a>
# **updateDocumentSet**
> kotlin.Any updateDocumentSet(sessionId, cmUpdateDocumentSet)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmUpdateDocumentSet : CMUpdateDocumentSet =  // CMUpdateDocumentSet | 
try {
    val result : kotlin.Any = apiInstance.updateDocumentSet(sessionId, cmUpdateDocumentSet)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#updateDocumentSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#updateDocumentSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmUpdateDocumentSet** | [**CMUpdateDocumentSet**](CMUpdateDocumentSet.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a id="version5"></a>
# **version5**
> CMVersion version5()

Version

Get the version of SimSage Discovery Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscoveryApi()
try {
    val result : CMVersion = apiInstance.version5()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscoveryApi#version5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscoveryApi#version5")
    e.printStackTrace()
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

