# CrawlerApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crawlerDeleteFolder**](CrawlerApi.md#crawlerDeleteFolder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder
[**crawlerDeleteUrl**](CrawlerApi.md#crawlerDeleteUrl) | **POST** /api/crawler/external/crawler/delete-url | Delete document
[**crawlerExternalDocumentDelete**](CrawlerApi.md#crawlerExternalDocumentDelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document
[**crawlerExternalDocumentFailed**](CrawlerApi.md#crawlerExternalDocumentFailed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document
[**crawlerExternalDocumentUnChanged**](CrawlerApi.md#crawlerExternalDocumentUnChanged) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged
[**crawlerExternalDocumentUpload**](CrawlerApi.md#crawlerExternalDocumentUpload) | **POST** /api/crawler/external/document/upload | Upload External Document
[**crawlerExternalImageUpload**](CrawlerApi.md#crawlerExternalImageUpload) | **POST** /api/crawler/external/document/upload/image | Upload External Image
[**crawlerRenameFolder**](CrawlerApi.md#crawlerRenameFolder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder
[**crawlerUpdateDeltaToken**](CrawlerApi.md#crawlerUpdateDeltaToken) | **POST** /api/crawler/external/crawler/delta-token | Update delta token
[**delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source
[**deleteDocuments**](CrawlerApi.md#deleteDocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents
[**encryptedCommunications**](CrawlerApi.md#encryptedCommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication
[**externalCrawler**](CrawlerApi.md#externalCrawler) | **POST** /api/crawler/external/crawler | External Crawler
[**externalCrawlerFinished**](CrawlerApi.md#externalCrawlerFinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler
[**externalCrawlerStart**](CrawlerApi.md#externalCrawlerStart) | **POST** /api/crawler/external/crawler/start | Start External Crawler
[**getCrawler**](CrawlerApi.md#getCrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source
[**getFailedDocuments**](CrawlerApi.md#getFailedDocuments) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List
[**getSourceList**](CrawlerApi.md#getSourceList) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List
[**oidcCode**](CrawlerApi.md#oidcCode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver
[**processAllFiles**](CrawlerApi.md#processAllFiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source
[**resetSourceDelta**](CrawlerApi.md#resetSourceDelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token
[**startCrawler**](CrawlerApi.md#startCrawler) | **POST** /api/crawler/start | Start crawler
[**testCrawler**](CrawlerApi.md#testCrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler
[**updateCrawler**](CrawlerApi.md#updateCrawler) | **POST** /api/crawler/crawler | Update Source
[**version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version


<a id="crawlerDeleteFolder"></a>
# **crawlerDeleteFolder**
> JsonMessage crawlerDeleteFolder(cmExternalCrawlerDeleteFolder, apIVersion)

Delete document folder

An external crawler removes a document folder.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawlerDeleteFolder : CMExternalCrawlerDeleteFolder =  // CMExternalCrawlerDeleteFolder | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerDeleteFolder(cmExternalCrawlerDeleteFolder, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerDeleteFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerDeleteFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawlerDeleteFolder** | [**CMExternalCrawlerDeleteFolder**](CMExternalCrawlerDeleteFolder.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerDeleteUrl"></a>
# **crawlerDeleteUrl**
> JsonMessage crawlerDeleteUrl(cmExternalCrawlerDeleteUrl, apIVersion)

Delete document

An external crawler removes a document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawlerDeleteUrl : CMExternalCrawlerDeleteUrl =  // CMExternalCrawlerDeleteUrl | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerDeleteUrl(cmExternalCrawlerDeleteUrl, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerDeleteUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerDeleteUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawlerDeleteUrl** | [**CMExternalCrawlerDeleteUrl**](CMExternalCrawlerDeleteUrl.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerExternalDocumentDelete"></a>
# **crawlerExternalDocumentDelete**
> JsonMessage crawlerExternalDocumentDelete(cmDeleteDocument, apIVersion)

Remove an External Document

Remove an external crawler document from SimSage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmDeleteDocument : CMDeleteDocument =  // CMDeleteDocument | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerExternalDocumentDelete(cmDeleteDocument, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerExternalDocumentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerExternalDocumentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmDeleteDocument** | [**CMDeleteDocument**](CMDeleteDocument.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerExternalDocumentFailed"></a>
# **crawlerExternalDocumentFailed**
> JsonMessage crawlerExternalDocumentFailed(cmFailedSourceDocument, apIVersion)

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmFailedSourceDocument : CMFailedSourceDocument =  // CMFailedSourceDocument | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerExternalDocumentFailed(cmFailedSourceDocument, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerExternalDocumentFailed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerExternalDocumentFailed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmFailedSourceDocument** | [**CMFailedSourceDocument**](CMFailedSourceDocument.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerExternalDocumentUnChanged"></a>
# **crawlerExternalDocumentUnChanged**
> JsonMessage crawlerExternalDocumentUnChanged(cmDocumentUnChanged, apIVersion)

Mark External Document Unchanged

An external crawler document marks a document as not having changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmDocumentUnChanged : CMDocumentUnChanged =  // CMDocumentUnChanged | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerExternalDocumentUnChanged(cmDocumentUnChanged, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerExternalDocumentUnChanged")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerExternalDocumentUnChanged")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmDocumentUnChanged** | [**CMDocumentUnChanged**](CMDocumentUnChanged.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerExternalDocumentUpload"></a>
# **crawlerExternalDocumentUpload**
> JsonMessage crawlerExternalDocumentUpload(cmUploadDocument, apIVersion)

Upload External Document

An external crawler document wants to upload a document to SimSage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmUploadDocument : CMUploadDocument =  // CMUploadDocument | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerExternalDocumentUpload(cmUploadDocument, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerExternalDocumentUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerExternalDocumentUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmUploadDocument** | [**CMUploadDocument**](CMUploadDocument.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerExternalImageUpload"></a>
# **crawlerExternalImageUpload**
> JsonMessage crawlerExternalImageUpload(cmUploadImage, apIVersion)

Upload External Image

An external crawler uploads an image for a document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmUploadImage : CMUploadImage =  // CMUploadImage | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerExternalImageUpload(cmUploadImage, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerExternalImageUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerExternalImageUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmUploadImage** | [**CMUploadImage**](CMUploadImage.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerRenameFolder"></a>
# **crawlerRenameFolder**
> JsonMessage crawlerRenameFolder(cmExternalCrawlerRenameFolder, apIVersion)

Rename document folder

An external crawler renames a document folder.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawlerRenameFolder : CMExternalCrawlerRenameFolder =  // CMExternalCrawlerRenameFolder | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerRenameFolder(cmExternalCrawlerRenameFolder, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerRenameFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerRenameFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawlerRenameFolder** | [**CMExternalCrawlerRenameFolder**](CMExternalCrawlerRenameFolder.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="crawlerUpdateDeltaToken"></a>
# **crawlerUpdateDeltaToken**
> JsonMessage crawlerUpdateDeltaToken(cmExternalCrawlerSetDeltaToken, apIVersion)

Update delta token

An external crawler updates a delta-token.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawlerSetDeltaToken : CMExternalCrawlerSetDeltaToken =  // CMExternalCrawlerSetDeltaToken | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.crawlerUpdateDeltaToken(cmExternalCrawlerSetDeltaToken, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#crawlerUpdateDeltaToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#crawlerUpdateDeltaToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawlerSetDeltaToken** | [**CMExternalCrawlerSetDeltaToken**](CMExternalCrawlerSetDeltaToken.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="delete"></a>
# **delete**
> JsonMessage delete(organisationId, kbId, sessionId, sourceId, apIVersion)

Delete source

Remove a source and all its content by its source-id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val sourceId : kotlin.Int = 56 // kotlin.Int | the crawler's id
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.delete(organisationId, kbId, sessionId, sourceId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#delete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **sourceId** | **kotlin.Int**| the crawler&#39;s id |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteDocuments"></a>
# **deleteDocuments**
> CMSource deleteDocuments(organisationId, kbId, sessionId, sourceId, apIVersion)

Delete source&#39;s documents

Remove a source&#39;s documents and stop the crawler if it&#39;s running.  Return an updated sources.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val sourceId : kotlin.Int = 56 // kotlin.Int | the crawler's id
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSource = apiInstance.deleteDocuments(organisationId, kbId, sessionId, sourceId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#deleteDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#deleteDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **sourceId** | **kotlin.Int**| the crawler&#39;s id |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="encryptedCommunications"></a>
# **encryptedCommunications**
> JsonMessage encryptedCommunications(seed, body, apIVersion)

Secure Communication

Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val seed : kotlin.Int = 56 // kotlin.Int | a random integer used for the communications
val body : kotlin.String = body_example // kotlin.String | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.encryptedCommunications(seed, body, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#encryptedCommunications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#encryptedCommunications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seed** | **kotlin.Int**| a random integer used for the communications |
 **body** | **kotlin.String**|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="externalCrawler"></a>
# **externalCrawler**
> CMSource externalCrawler(cmExternalCrawler, apIVersion)

External Crawler

Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawler : CMExternalCrawler =  // CMExternalCrawler | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSource = apiInstance.externalCrawler(cmExternalCrawler, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#externalCrawler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#externalCrawler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawler** | [**CMExternalCrawler**](CMExternalCrawler.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="externalCrawlerFinished"></a>
# **externalCrawlerFinished**
> JsonMessage externalCrawlerFinished(cmExternalCrawlerStop, apIVersion)

Stop External Crawler

An external crawler notifies SimSage it has finished its job, its run through the data once.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawlerStop : CMExternalCrawlerStop =  // CMExternalCrawlerStop | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.externalCrawlerFinished(cmExternalCrawlerStop, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#externalCrawlerFinished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#externalCrawlerFinished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawlerStop** | [**CMExternalCrawlerStop**](CMExternalCrawlerStop.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="externalCrawlerStart"></a>
# **externalCrawlerStart**
> JsonMessage externalCrawlerStart(cmExternalCrawlerStart, apIVersion)

Start External Crawler

An external crawler notifies SimSage is it starting a new run.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val cmExternalCrawlerStart : CMExternalCrawlerStart =  // CMExternalCrawlerStart | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.externalCrawlerStart(cmExternalCrawlerStart, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#externalCrawlerStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#externalCrawlerStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmExternalCrawlerStart** | [**CMExternalCrawlerStart**](CMExternalCrawlerStart.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCrawler"></a>
# **getCrawler**
> CMSource getCrawler(organisationId, kbId, sourceId, sessionId, apIVersion)

Get source

Return the data-structure for a source by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val sourceId : kotlin.Int = 56 // kotlin.Int | the crawler's id
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSource = apiInstance.getCrawler(organisationId, kbId, sourceId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#getCrawler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#getCrawler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **sourceId** | **kotlin.Int**| the crawler&#39;s id |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFailedDocuments"></a>
# **getFailedDocuments**
> kotlin.collections.List&lt;CMSource&gt; getFailedDocuments(sessionId, organisationId, kbId, sourceId, page, pageSize, apIVersion)

Get source List

Get a list of failed documents for a source.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val sourceId : kotlin.String = sourceId_example // kotlin.String | the source  id (a number)
val page : kotlin.Int = 56 // kotlin.Int | the page number for the list
val pageSize : kotlin.Int = 56 // kotlin.Int | the page size for the list
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMSource> = apiInstance.getFailedDocuments(sessionId, organisationId, kbId, sourceId, page, pageSize, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#getFailedDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#getFailedDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **sourceId** | **kotlin.String**| the source  id (a number) |
 **page** | **kotlin.Int**| the page number for the list |
 **pageSize** | **kotlin.Int**| the page size for the list |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMSource&gt;**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSourceList"></a>
# **getSourceList**
> kotlin.collections.List&lt;CMSource&gt; getSourceList(sessionId, organisationId, kbId, apIVersion)

Get source List

Get a list of sources for a given organisation / knowledge base.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CMSource> = apiInstance.getSourceList(sessionId, organisationId, kbId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#getSourceList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#getSourceList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**kotlin.collections.List&lt;CMSource&gt;**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="oidcCode"></a>
# **oidcCode**
> oidcCode(oidcKey, allRequestParams)

OIDC code receiver

used for OIDC systems to receive codes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val oidcKey : kotlin.String = oidcKey_example // kotlin.String | the Dropbox OIDC key
val allRequestParams : kotlin.collections.Map<kotlin.String, kotlin.String> =  // kotlin.collections.Map<kotlin.String, kotlin.String> | 
try {
    apiInstance.oidcCode(oidcKey, allRequestParams)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#oidcCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#oidcCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oidcKey** | **kotlin.String**| the Dropbox OIDC key |
 **allRequestParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="processAllFiles"></a>
# **processAllFiles**
> JsonMessage processAllFiles(sessionId, cmStartCrawler, apIVersion)

Process all files of crawler/source

Start and force processing all files for a crawler/source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmStartCrawler : CMStartCrawler =  // CMStartCrawler | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.processAllFiles(sessionId, cmStartCrawler, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#processAllFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#processAllFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmStartCrawler** | [**CMStartCrawler**](CMStartCrawler.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="resetSourceDelta"></a>
# **resetSourceDelta**
> CMSource resetSourceDelta(sessionId, organisationId, kbId, sourceId, apIVersion)

Reset Source delta-token

reset a SimSage source&#39;s delta token.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val sourceId : kotlin.Int = 56 // kotlin.Int | the crawler's id
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSource = apiInstance.resetSourceDelta(sessionId, organisationId, kbId, sourceId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#resetSourceDelta")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#resetSourceDelta")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **sourceId** | **kotlin.Int**| the crawler&#39;s id |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="startCrawler"></a>
# **startCrawler**
> JsonMessage startCrawler(sessionId, cmStartCrawler, apIVersion)

Start crawler

Start a crawler by source-id if after it has stopped.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmStartCrawler : CMStartCrawler =  // CMStartCrawler | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.startCrawler(sessionId, cmStartCrawler, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#startCrawler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#startCrawler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmStartCrawler** | [**CMStartCrawler**](CMStartCrawler.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="testCrawler"></a>
# **testCrawler**
> JsonMessage testCrawler(sessionId, organisationId, kbId, sourceId, apIVersion)

Test Crawler

Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base's id (a guid)
val sourceId : kotlin.Int = 56 // kotlin.Int | the crawler's id
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.testCrawler(sessionId, organisationId, kbId, sourceId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#testCrawler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#testCrawler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **kbId** | **kotlin.String**| the knowledge-base&#39;s id (a guid) |
 **sourceId** | **kotlin.Int**| the crawler&#39;s id |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateCrawler"></a>
# **updateCrawler**
> CMSource updateCrawler(sessionId, cmSource, apIVersion)

Update Source

Save (create or update) a SimSage source.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSource : CMSource =  // CMSource | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSource = apiInstance.updateCrawler(sessionId, cmSource, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#updateCrawler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#updateCrawler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSource** | [**CMSource**](CMSource.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="version6"></a>
# **version6**
> CMVersion version6()

Version

Get the version of SimSage crawler-services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CrawlerApi()
try {
    val result : CMVersion = apiInstance.version6()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrawlerApi#version6")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrawlerApi#version6")
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

