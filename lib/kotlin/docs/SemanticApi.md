# SemanticApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTextToSearch**](SemanticApi.md#deleteTextToSearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search
[**documentQuestionAndAnswer**](SemanticApi.md#documentQuestionAndAnswer) | **POST** /api/semantic/document-qa | Document Q&amp;A
[**getTextToSearchPaginated**](SemanticApi.md#getTextToSearchPaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings
[**restfulClientQuery**](SemanticApi.md#restfulClientQuery) | **POST** /api/semantic/query | Client Query
[**saveTextToSearch**](SemanticApi.md#saveTextToSearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item
[**shortSummary**](SemanticApi.md#shortSummary) | **POST** /api/semantic/short-summary | Short summary
[**tryTextToSearchConversion**](SemanticApi.md#tryTextToSearchConversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search
[**version1**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version


<a id="deleteTextToSearch"></a>
# **deleteTextToSearch**
> JsonMessage deleteTextToSearch(organisationId, kbId, word, sessionId, apIVersion)

Delete text-to-search

Remove an existing text-to-search item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val word : kotlin.String = sort() // kotlin.String | the word of the text-to-search word
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteTextToSearch(organisationId, kbId, word, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#deleteTextToSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#deleteTextToSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **word** | **kotlin.String**| the word of the text-to-search word |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documentQuestionAndAnswer"></a>
# **documentQuestionAndAnswer**
> CMDocumentQuestionAndAnswer documentQuestionAndAnswer(sessionId, cmDocumentQuestionAndAnswer)

Document Q&amp;A

Answer a question about a given document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmDocumentQuestionAndAnswer : CMDocumentQuestionAndAnswer =  // CMDocumentQuestionAndAnswer | 
try {
    val result : CMDocumentQuestionAndAnswer = apiInstance.documentQuestionAndAnswer(sessionId, cmDocumentQuestionAndAnswer)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#documentQuestionAndAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#documentQuestionAndAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmDocumentQuestionAndAnswer** | [**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)|  |

### Return type

[**CMDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getTextToSearchPaginated"></a>
# **getTextToSearchPaginated**
> CMTextToSearchPaginatedReturn getTextToSearchPaginated(sessionId, cmTextToSearchPaginated, apIVersion)

Text to Search mappings

Return a paginated list of text-to-search mappings with an optional filter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmTextToSearchPaginated : CMTextToSearchPaginated =  // CMTextToSearchPaginated | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMTextToSearchPaginatedReturn = apiInstance.getTextToSearchPaginated(sessionId, cmTextToSearchPaginated, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#getTextToSearchPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#getTextToSearchPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmTextToSearchPaginated** | [**CMTextToSearchPaginated**](CMTextToSearchPaginated.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMTextToSearchPaginatedReturn**](CMTextToSearchPaginatedReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="restfulClientQuery"></a>
# **restfulClientQuery**
> CMClientQueryResult restfulClientQuery(cmClientQuery)

Client Query

a SimSage client asks a question or performs a keyword-search.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val cmClientQuery : CMClientQuery =  // CMClientQuery | 
try {
    val result : CMClientQueryResult = apiInstance.restfulClientQuery(cmClientQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#restfulClientQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#restfulClientQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmClientQuery** | [**CMClientQuery**](CMClientQuery.md)|  |

### Return type

[**CMClientQueryResult**](CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveTextToSearch"></a>
# **saveTextToSearch**
> JsonMessage saveTextToSearch(organisationId, kbId, sessionId, cmTextToSearchEdit, apIVersion)

Save a text-to-search item

Create or update (save) a text-to-search item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmTextToSearchEdit : CMTextToSearchEdit =  // CMTextToSearchEdit | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.saveTextToSearch(organisationId, kbId, sessionId, cmTextToSearchEdit, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#saveTextToSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#saveTextToSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmTextToSearchEdit** | [**CMTextToSearchEdit**](CMTextToSearchEdit.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="shortSummary"></a>
# **shortSummary**
> CMShortSummaryResult shortSummary(cmShortSummary)

Short summary

Create a short summary for a given url / sentence

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val cmShortSummary : CMShortSummary =  // CMShortSummary | 
try {
    val result : CMShortSummaryResult = apiInstance.shortSummary(cmShortSummary)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#shortSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#shortSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmShortSummary** | [**CMShortSummary**](CMShortSummary.md)|  |

### Return type

[**CMShortSummaryResult**](CMShortSummaryResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tryTextToSearchConversion"></a>
# **tryTextToSearchConversion**
> CMTextToSearchConversionReturn tryTextToSearchConversion(sessionId, cmTextToSearchConversion, apIVersion)

try converting text-to-search

See the results of a text-to-search conversion

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmTextToSearchConversion : CMTextToSearchConversion =  // CMTextToSearchConversion | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMTextToSearchConversionReturn = apiInstance.tryTextToSearchConversion(sessionId, cmTextToSearchConversion, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#tryTextToSearchConversion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#tryTextToSearchConversion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmTextToSearchConversion** | [**CMTextToSearchConversion**](CMTextToSearchConversion.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMTextToSearchConversionReturn**](CMTextToSearchConversionReturn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="version1"></a>
# **version1**
> CMVersion version1()

Version

Get the version of SimSage Search Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SemanticApi()
try {
    val result : CMVersion = apiInstance.version1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SemanticApi#version1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SemanticApi#version1")
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

