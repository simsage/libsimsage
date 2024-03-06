# DiscoveryApi

All URIs are relative to *https://demo.simsage.ai*

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
| [**setdocumentredactions**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument |  |
| [**storageBySource**](DiscoveryApi.md#storageBySource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage |
| [**summaryByDocumentType**](DiscoveryApi.md#summaryByDocumentType) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage |
| [**updateDocumentSet**](DiscoveryApi.md#updateDocumentSet) | **POST** /api/discovery/updatedocumentset |  |
| [**version5**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version |


<a name="allGdprProjects"></a>
# **allGdprProjects**
> Object allGdprProjects(organisationId, kbId, page, pageSize, textFilter, statusFilter, sortColumn, sortDirection, session-id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **page** | **Integer**| the page to render | [default to null] |
| **pageSize** | **Integer**| the page size to use | [default to null] |
| **textFilter** | **String**| the text filter passed in or blank if empty | [default to null] |
| **statusFilter** | **String**| the status filter passed in | [default to null] |
| **sortColumn** | **String**| the sort column used for the results | [default to null] |
| **sortDirection** | **Integer**| sort direction to use (0/1) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

<a name="applyRedactions"></a>
# **applyRedactions**
> Object applyRedactions(session-id, CMRedactionData)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMRedactionData** | [**CMRedactionData**](../Models/CMRedactionData.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="createGdprProject"></a>
# **createGdprProject**
> Object createGdprProject(session-id, CMCreateGdprProject)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMCreateGdprProject** | [**CMCreateGdprProject**](../Models/CMCreateGdprProject.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="deleteProject"></a>
# **deleteProject**
> Object deleteProject(session-id, CMDeleteProjectCmd)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDeleteProjectCmd** | [**CMDeleteProjectCmd**](../Models/CMDeleteProjectCmd.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="exportRedactedDoc"></a>
# **exportRedactedDoc**
> Object exportRedactedDoc(session-id, CMExportRedactedDocument)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMExportRedactedDocument** | [**CMExportRedactedDocument**](../Models/CMExportRedactedDocument.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="getGdprDocument"></a>
# **getGdprDocument**
> Object getGdprDocument(organisationId, kbId, projectId, url, session-id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **projectId** | **String**| Project Id for the items | [default to null] |
| **url** | **String**| The url of the document to retrieve | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

<a name="getPagedProjectDocuments"></a>
# **getPagedProjectDocuments**
> Object getPagedProjectDocuments(organisationId, kbId, projectId, page, pageSize, textFilter, typeFilter, statusFilter, sortColumn, sortDirection, session-id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **projectId** | **String**| Project Id for the items | [default to null] |
| **page** | **Integer**| the page to render | [default to null] |
| **pageSize** | **Integer**| the page size to use | [default to null] |
| **textFilter** | **String**| the text filter passed in or blank if empty | [default to null] |
| **typeFilter** | **String**| the type filter passed in | [default to null] |
| **statusFilter** | **String**| the status filter passed in | [default to null] |
| **sortColumn** | **String**| the sort column used for the results | [default to null] |
| **sortDirection** | **Integer**| sort direction to use (0/1) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

<a name="growthPerMonth"></a>
# **growthPerMonth**
> Object growthPerMonth(organisationId, kbId, session-id)

growth

    Get the storage growth delta per month

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

<a name="setdocumentredactions"></a>
# **setdocumentredactions**
> Object setdocumentredactions(session-id, CMRedactionData)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMRedactionData** | [**CMRedactionData**](../Models/CMRedactionData.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="storageBySource"></a>
# **storageBySource**
> Object storageBySource(organisationId, kbId, session-id)

storage

    Get the current amount of storage used by source

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

<a name="summaryByDocumentType"></a>
# **summaryByDocumentType**
> Object summaryByDocumentType(organisationId, kbId, session-id)

storage

    Get the current amount of storage used by source and document type

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

<a name="updateDocumentSet"></a>
# **updateDocumentSet**
> Object updateDocumentSet(session-id, CMUpdateDocumentSet)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMUpdateDocumentSet** | [**CMUpdateDocumentSet**](../Models/CMUpdateDocumentSet.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

<a name="version5"></a>
# **version5**
> CMVersion version5()

Version

    Get the version of SimSage Discovery Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

