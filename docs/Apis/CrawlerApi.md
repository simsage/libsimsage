# CrawlerApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crawlerDeleteFolder**](CrawlerApi.md#crawlerDeleteFolder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder |
| [**crawlerDeleteUrl**](CrawlerApi.md#crawlerDeleteUrl) | **POST** /api/crawler/external/crawler/delete-url | Delete document |
| [**crawlerExternalDocumentDelete**](CrawlerApi.md#crawlerExternalDocumentDelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
| [**crawlerExternalDocumentFailed**](CrawlerApi.md#crawlerExternalDocumentFailed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document |
| [**crawlerExternalDocumentUnChanged**](CrawlerApi.md#crawlerExternalDocumentUnChanged) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged |
| [**crawlerExternalDocumentUpload**](CrawlerApi.md#crawlerExternalDocumentUpload) | **POST** /api/crawler/external/document/upload | Upload External Document |
| [**crawlerExternalImageUpload**](CrawlerApi.md#crawlerExternalImageUpload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
| [**crawlerRenameFolder**](CrawlerApi.md#crawlerRenameFolder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder |
| [**crawlerUpdateDeltaToken**](CrawlerApi.md#crawlerUpdateDeltaToken) | **POST** /api/crawler/external/crawler/delta-token | Update delta token |
| [**delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
| [**deleteDocuments**](CrawlerApi.md#deleteDocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents |
| [**encryptedCommunications**](CrawlerApi.md#encryptedCommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
| [**externalCrawler**](CrawlerApi.md#externalCrawler) | **POST** /api/crawler/external/crawler | External Crawler |
| [**externalCrawlerFinished**](CrawlerApi.md#externalCrawlerFinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
| [**externalCrawlerStart**](CrawlerApi.md#externalCrawlerStart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
| [**getCrawler**](CrawlerApi.md#getCrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
| [**getFailedDocuments**](CrawlerApi.md#getFailedDocuments) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List |
| [**getSourceList**](CrawlerApi.md#getSourceList) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
| [**oidcCode**](CrawlerApi.md#oidcCode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
| [**processAllFiles**](CrawlerApi.md#processAllFiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
| [**resetSourceDelta**](CrawlerApi.md#resetSourceDelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
| [**startCrawler**](CrawlerApi.md#startCrawler) | **POST** /api/crawler/start | Start crawler |
| [**testCrawler**](CrawlerApi.md#testCrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
| [**updateCrawler**](CrawlerApi.md#updateCrawler) | **POST** /api/crawler/crawler | Update Source |
| [**version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |


<a name="crawlerDeleteFolder"></a>
# **crawlerDeleteFolder**
> JsonMessage crawlerDeleteFolder(CMExternalCrawlerDeleteFolder, API-Version)

Delete document folder

    An external crawler removes a document folder.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawlerDeleteFolder** | [**CMExternalCrawlerDeleteFolder**](../Models/CMExternalCrawlerDeleteFolder.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerDeleteUrl"></a>
# **crawlerDeleteUrl**
> JsonMessage crawlerDeleteUrl(CMExternalCrawlerDeleteUrl, API-Version)

Delete document

    An external crawler removes a document.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawlerDeleteUrl** | [**CMExternalCrawlerDeleteUrl**](../Models/CMExternalCrawlerDeleteUrl.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerExternalDocumentDelete"></a>
# **crawlerExternalDocumentDelete**
> JsonMessage crawlerExternalDocumentDelete(CMDeleteDocument, API-Version)

Remove an External Document

    Remove an external crawler document from SimSage.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMDeleteDocument** | [**CMDeleteDocument**](../Models/CMDeleteDocument.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerExternalDocumentFailed"></a>
# **crawlerExternalDocumentFailed**
> JsonMessage crawlerExternalDocumentFailed(CMFailedSourceDocument, API-Version)

Upload External Document

    An external crawler document wants to upload a document to SimSage.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMFailedSourceDocument** | [**CMFailedSourceDocument**](../Models/CMFailedSourceDocument.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerExternalDocumentUnChanged"></a>
# **crawlerExternalDocumentUnChanged**
> JsonMessage crawlerExternalDocumentUnChanged(CMDocumentUnChanged, API-Version)

Mark External Document Unchanged

    An external crawler document marks a document as not having changed.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMDocumentUnChanged** | [**CMDocumentUnChanged**](../Models/CMDocumentUnChanged.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerExternalDocumentUpload"></a>
# **crawlerExternalDocumentUpload**
> JsonMessage crawlerExternalDocumentUpload(CMUploadDocument, API-Version)

Upload External Document

    An external crawler document wants to upload a document to SimSage.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMUploadDocument** | [**CMUploadDocument**](../Models/CMUploadDocument.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerExternalImageUpload"></a>
# **crawlerExternalImageUpload**
> JsonMessage crawlerExternalImageUpload(CMUploadImage, API-Version)

Upload External Image

    An external crawler uploads an image for a document.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMUploadImage** | [**CMUploadImage**](../Models/CMUploadImage.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerRenameFolder"></a>
# **crawlerRenameFolder**
> JsonMessage crawlerRenameFolder(CMExternalCrawlerRenameFolder, API-Version)

Rename document folder

    An external crawler renames a document folder.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawlerRenameFolder** | [**CMExternalCrawlerRenameFolder**](../Models/CMExternalCrawlerRenameFolder.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="crawlerUpdateDeltaToken"></a>
# **crawlerUpdateDeltaToken**
> JsonMessage crawlerUpdateDeltaToken(CMExternalCrawlerSetDeltaToken, API-Version)

Update delta token

    An external crawler updates a delta-token.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawlerSetDeltaToken** | [**CMExternalCrawlerSetDeltaToken**](../Models/CMExternalCrawlerSetDeltaToken.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="delete"></a>
# **delete**
> JsonMessage delete(organisationId, kbId, session-id, sourceId, API-Version)

Delete source

    Remove a source and all its content by its source-id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **sourceId** | **Integer**| the crawler&#39;s id | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteDocuments"></a>
# **deleteDocuments**
> CMSource deleteDocuments(organisationId, kbId, session-id, sourceId, API-Version)

Delete source&#39;s documents

    Remove a source&#39;s documents and stop the crawler if it&#39;s running.  Return an updated sources.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **sourceId** | **Integer**| the crawler&#39;s id | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSource**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="encryptedCommunications"></a>
# **encryptedCommunications**
> JsonMessage encryptedCommunications(seed, body, API-Version)

Secure Communication

    Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **seed** | **Integer**| a random integer used for the communications | [default to null] |
| **body** | **String**|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="externalCrawler"></a>
# **externalCrawler**
> CMSource externalCrawler(CMExternalCrawler, API-Version)

External Crawler

    Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawler** | [**CMExternalCrawler**](../Models/CMExternalCrawler.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSource**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="externalCrawlerFinished"></a>
# **externalCrawlerFinished**
> JsonMessage externalCrawlerFinished(CMExternalCrawlerStop, API-Version)

Stop External Crawler

    An external crawler notifies SimSage it has finished its job, its run through the data once.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawlerStop** | [**CMExternalCrawlerStop**](../Models/CMExternalCrawlerStop.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="externalCrawlerStart"></a>
# **externalCrawlerStart**
> JsonMessage externalCrawlerStart(CMExternalCrawlerStart, API-Version)

Start External Crawler

    An external crawler notifies SimSage is it starting a new run.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMExternalCrawlerStart** | [**CMExternalCrawlerStart**](../Models/CMExternalCrawlerStart.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getCrawler"></a>
# **getCrawler**
> CMSource getCrawler(organisationId, kbId, sourceId, session-id, API-Version)

Get source

    Return the data-structure for a source by id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **sourceId** | **Integer**| the crawler&#39;s id | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSource**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getFailedDocuments"></a>
# **getFailedDocuments**
> List getFailedDocuments(session-id, organisationId, kbId, sourceId, page, pageSize, API-Version)

Get source List

    Get a list of failed documents for a source.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **sourceId** | **String**| the source  id (a number) | [default to null] |
| **page** | **Integer**| the page number for the list | [default to null] |
| **pageSize** | **Integer**| the page size for the list | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSourceList"></a>
# **getSourceList**
> List getSourceList(session-id, organisationId, kbId, API-Version)

Get source List

    Get a list of sources for a given organisation / knowledge base.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**List**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="oidcCode"></a>
# **oidcCode**
> oidcCode(oidcKey, allRequestParams)

OIDC code receiver

    used for OIDC systems to receive codes

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oidcKey** | **String**| the Dropbox OIDC key | [default to null] |
| **allRequestParams** | [**Map**](../Models/String.md)|  | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

<a name="processAllFiles"></a>
# **processAllFiles**
> JsonMessage processAllFiles(session-id, CMStartCrawler, API-Version)

Process all files of crawler/source

    Start and force processing all files for a crawler/source

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMStartCrawler** | [**CMStartCrawler**](../Models/CMStartCrawler.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="resetSourceDelta"></a>
# **resetSourceDelta**
> CMSource resetSourceDelta(session-id, organisationId, kbId, sourceId, API-Version)

Reset Source delta-token

    reset a SimSage source&#39;s delta token.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **sourceId** | **Integer**| the crawler&#39;s id | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSource**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="startCrawler"></a>
# **startCrawler**
> JsonMessage startCrawler(session-id, CMStartCrawler, API-Version)

Start crawler

    Start a crawler by source-id if after it has stopped.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMStartCrawler** | [**CMStartCrawler**](../Models/CMStartCrawler.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="testCrawler"></a>
# **testCrawler**
> JsonMessage testCrawler(session-id, organisationId, kbId, sourceId, API-Version)

Test Crawler

    Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-base&#39;s id (a guid) | [default to null] |
| **sourceId** | **Integer**| the crawler&#39;s id | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateCrawler"></a>
# **updateCrawler**
> CMSource updateCrawler(session-id, CMSource, API-Version)

Update Source

    Save (create or update) a SimSage source.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSource** | [**CMSource**](../Models/CMSource.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSource**](../Models/CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="version6"></a>
# **version6**
> CMVersion version6()

Version

    Get the version of SimSage crawler-services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

