# KnowledgebaseApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportKnowledgeBase**](KnowledgebaseApi.md#exportKnowledgeBase) | **POST** /api/knowledgebase/export | export Knowledge-base
[**getKnowledgeBase**](KnowledgebaseApi.md#getKnowledgeBase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base
[**getKnowledgeBases**](KnowledgebaseApi.md#getKnowledgeBases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases
[**getSearchInfo**](KnowledgebaseApi.md#getSearchInfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info
[**getSearchInfo2**](KnowledgebaseApi.md#getSearchInfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated]
[**removeKnowledgeBase**](KnowledgebaseApi.md#removeKnowledgeBase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base
[**updateKnowledgeBase**](KnowledgebaseApi.md#updateKnowledgeBase) | **PUT** /api/knowledgebase/save | Save Knowledge-base
[**version3**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version


<a id="exportKnowledgeBase"></a>
# **exportKnowledgeBase**
> JsonMessage exportKnowledgeBase(sessionId, cmKnowledgeBaseExport, apIVersion)

export Knowledge-base

starts the export of a knowledge-base using the passed in exporter config

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmKnowledgeBaseExport : CMKnowledgeBaseExport =  // CMKnowledgeBaseExport | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.exportKnowledgeBase(sessionId, cmKnowledgeBaseExport, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#exportKnowledgeBase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#exportKnowledgeBase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmKnowledgeBaseExport** | [**CMKnowledgeBaseExport**](CMKnowledgeBaseExport.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getKnowledgeBase"></a>
# **getKnowledgeBase**
> CMKnowledgeBase getKnowledgeBase(organisationId, kbId, sessionId, apIVersion)

Get Knowledge-base

Return a knowledge base by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base to get (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMKnowledgeBase = apiInstance.getKnowledgeBase(organisationId, kbId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#getKnowledgeBase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#getKnowledgeBase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base to get (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMKnowledgeBase**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getKnowledgeBases"></a>
# **getKnowledgeBases**
> kotlin.collections.List&lt;CMKnowledgeBase&gt; getKnowledgeBases(organisationId, sessionId)

Get Knowledge-bases

Return a list of knowledge bases for a given organisation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<CMKnowledgeBase> = apiInstance.getKnowledgeBases(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#getKnowledgeBases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#getKnowledgeBases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.collections.List&lt;CMKnowledgeBase&gt;**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSearchInfo"></a>
# **getSearchInfo**
> CMInfo getSearchInfo(organisationId, clientId, apIVersion)

Search Info

return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val clientId : kotlin.String = clientId_example // kotlin.String | the client's id (its guid id), pre-register this client as a known client.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMInfo = apiInstance.getSearchInfo(organisationId, clientId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#getSearchInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#getSearchInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **clientId** | **kotlin.String**| the client&#39;s id (its guid id), pre-register this client as a known client. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSearchInfo2"></a>
# **getSearchInfo2**
> CMInfo getSearchInfo2(organisationId, apIVersion)

Search Info [deprecated]

Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMInfo = apiInstance.getSearchInfo2(organisationId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#getSearchInfo2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#getSearchInfo2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeKnowledgeBase"></a>
# **removeKnowledgeBase**
> JsonMessage removeKnowledgeBase(organisationId, kbId, sessionId, apIVersion)

Delete Knowledge-base

Delete a knowledge-base by Id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base to delete/remove (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.removeKnowledgeBase(organisationId, kbId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#removeKnowledgeBase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#removeKnowledgeBase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base to delete/remove (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateKnowledgeBase"></a>
# **updateKnowledgeBase**
> KnowledgeBase updateKnowledgeBase(sessionId, cmKnowledgeBase, apIVersion)

Save Knowledge-base

Save (Create or Update) a SimSage knowledge base item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmKnowledgeBase : CMKnowledgeBase =  // CMKnowledgeBase | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : KnowledgeBase = apiInstance.updateKnowledgeBase(sessionId, cmKnowledgeBase, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#updateKnowledgeBase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#updateKnowledgeBase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmKnowledgeBase** | [**CMKnowledgeBase**](CMKnowledgeBase.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**KnowledgeBase**](KnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="version3"></a>
# **version3**
> CMVersion version3()

Version

Return the version of SimSage knowledge-base Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgebaseApi()
try {
    val result : CMVersion = apiInstance.version3()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgebaseApi#version3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgebaseApi#version3")
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

