# LanguageApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDefaultSynSets**](LanguageApi.md#addDefaultSynSets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets
[**deleteAllSynonyms**](LanguageApi.md#deleteAllSynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms
[**deleteCategorization**](LanguageApi.md#deleteCategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization
[**deleteSemantic**](LanguageApi.md#deleteSemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic
[**deleteSynSet**](LanguageApi.md#deleteSynSet) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet
[**deleteSynonym**](LanguageApi.md#deleteSynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym
[**findSynSets**](LanguageApi.md#findSynSets) | **PUT** /api/language/find-syn-sets | Find SynSets
[**getCategorizationList**](LanguageApi.md#getCategorizationList) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list
[**getPaginated**](LanguageApi.md#getPaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated
[**getSemanticsPaginated**](LanguageApi.md#getSemanticsPaginated) | **PUT** /api/language/semantics | Semantics Paginated
[**optimizeIndexes**](LanguageApi.md#optimizeIndexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes
[**optimizeIndexesAbort**](LanguageApi.md#optimizeIndexesAbort) | **PUT** /api/language/optimize-indexes-abort | Abort Index Optimization
[**redactDocument**](LanguageApi.md#redactDocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document
[**saveCategorization**](LanguageApi.md#saveCategorization) | **PUT** /api/language/categorization | save categorization
[**saveSemantic**](LanguageApi.md#saveSemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic
[**saveSynSet**](LanguageApi.md#saveSynSet) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet
[**saveSynonym**](LanguageApi.md#saveSynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym
[**tuneLanguageGraph**](LanguageApi.md#tuneLanguageGraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph
[**version2**](LanguageApi.md#version2) | **GET** /api/language/version | Version


<a id="addDefaultSynSets"></a>
# **addDefaultSynSets**
> JsonMessage addDefaultSynSets(organisationId, kbId, sessionId, apIVersion)

Add all default SynSets

Add default syn-sets to the given org/kb

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.addDefaultSynSets(organisationId, kbId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#addDefaultSynSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#addDefaultSynSets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteAllSynonyms"></a>
# **deleteAllSynonyms**
> JsonMessage deleteAllSynonyms(organisationId, kbId, sessionId, apIVersion)

Delete All Synonyms

Delete all synonyms for a given org/kb

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base to delete/remove (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteAllSynonyms(organisationId, kbId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#deleteAllSynonyms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#deleteAllSynonyms")
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

<a id="deleteCategorization"></a>
# **deleteCategorization**
> JsonMessage deleteCategorization(organisationId, kbId, categorizationLabel, sessionId, apIVersion)

remove categorization

remove a specific categorization for a given org/kb

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val categorizationLabel : kotlin.String = categorizationLabel_example // kotlin.String | the metadata (name) to remove
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteCategorization(organisationId, kbId, categorizationLabel, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#deleteCategorization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#deleteCategorization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **categorizationLabel** | **kotlin.String**| the metadata (name) to remove |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteSemantic"></a>
# **deleteSemantic**
> JsonMessage deleteSemantic(organisationId, kbId, word, semantic, sessionId, apIVersion)

Delete Semantic

Remove an existing semantic from SimSage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val word : kotlin.String = John // kotlin.String | the word (more specific item) of the semantic to delete (eg. \"John\")
val semantic : kotlin.String = person // kotlin.String | the semantic of the word to delete (eg. \"person\")
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteSemantic(organisationId, kbId, word, semantic, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#deleteSemantic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#deleteSemantic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **word** | **kotlin.String**| the word (more specific item) of the semantic to delete (eg. \&quot;John\&quot;) |
 **semantic** | **kotlin.String**| the semantic of the word to delete (eg. \&quot;person\&quot;) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteSynSet"></a>
# **deleteSynSet**
> JsonMessage deleteSynSet(organisationId, kbId, lemma, sessionId, apIVersion)

Delete SynSet

Remove a syn-set from SimSage by lemma.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val lemma : kotlin.String = lemma_example // kotlin.String | the lemma (base word) of the syn-set to remove.
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteSynSet(organisationId, kbId, lemma, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#deleteSynSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#deleteSynSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **lemma** | **kotlin.String**| the lemma (base word) of the syn-set to remove. |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteSynonym"></a>
# **deleteSynonym**
> JsonMessage deleteSynonym(organisationId, kbId, id, sessionId, apIVersion)

Delete Synonym

Delete a synonym using its id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val id : kotlin.Int = 56 // kotlin.Int | the id of the synonym to remove.
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.deleteSynonym(organisationId, kbId, id, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#deleteSynonym")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#deleteSynonym")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **id** | **kotlin.Int**| the id of the synonym to remove. |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="findSynSets"></a>
# **findSynSets**
> CMSynSetList findSynSets(sessionId, cmSynSetFind, apIVersion)

Find SynSets

Find syn-sets using filters

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSynSetFind : CMSynSetFind =  // CMSynSetFind | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSynSetList = apiInstance.findSynSets(sessionId, cmSynSetFind, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#findSynSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#findSynSets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSynSetFind** | [**CMSynSetFind**](CMSynSetFind.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSynSetList**](CMSynSetList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCategorizationList"></a>
# **getCategorizationList**
> CMCategorizationPaginatedList getCategorizationList(organisationId, kbId, prevCategorizationLabel, pageSize, sessionId, apIVersion)

categorization list

get all categorizations for a given org/kb paginated

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val prevCategorizationLabel : kotlin.String = prevCategorizationLabel_example // kotlin.String | the previous categorization label for pagination, or null if first page
val pageSize : kotlin.Int = 56 // kotlin.Int | the size of the page returned
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMCategorizationPaginatedList = apiInstance.getCategorizationList(organisationId, kbId, prevCategorizationLabel, pageSize, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#getCategorizationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#getCategorizationList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **prevCategorizationLabel** | **kotlin.String**| the previous categorization label for pagination, or null if first page |
 **pageSize** | **kotlin.Int**| the size of the page returned |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMCategorizationPaginatedList**](CMCategorizationPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaginated"></a>
# **getPaginated**
> CMSynonymsPaginatedResult getPaginated(sessionId, cmSynonymsPaginated, apIVersion)

get Synonyms Paginated

return a paginated list of synonyms with optional filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSynonymsPaginated : CMSynonymsPaginated =  // CMSynonymsPaginated | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSynonymsPaginatedResult = apiInstance.getPaginated(sessionId, cmSynonymsPaginated, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#getPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#getPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSynonymsPaginated** | [**CMSynonymsPaginated**](CMSynonymsPaginated.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSynonymsPaginatedResult**](CMSynonymsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSemanticsPaginated"></a>
# **getSemanticsPaginated**
> CMSemanticsPaginatedResult getSemanticsPaginated(sessionId, cmSemanticsPaginated, apIVersion)

Semantics Paginated

Return a paginated list of semantics with an optional filter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSemanticsPaginated : CMSemanticsPaginated =  // CMSemanticsPaginated | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : CMSemanticsPaginatedResult = apiInstance.getSemanticsPaginated(sessionId, cmSemanticsPaginated, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#getSemanticsPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#getSemanticsPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSemanticsPaginated** | [**CMSemanticsPaginated**](CMSemanticsPaginated.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**CMSemanticsPaginatedResult**](CMSemanticsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="optimizeIndexes"></a>
# **optimizeIndexes**
> JsonMessage optimizeIndexes(sessionId, cmOptimizeIndex, apIVersion)

Optimize Indexes

Force index optimization for a the given knowledge-base, now.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmOptimizeIndex : CMOptimizeIndex =  // CMOptimizeIndex | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.optimizeIndexes(sessionId, cmOptimizeIndex, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#optimizeIndexes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#optimizeIndexes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmOptimizeIndex** | [**CMOptimizeIndex**](CMOptimizeIndex.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="optimizeIndexesAbort"></a>
# **optimizeIndexesAbort**
> JsonMessage optimizeIndexesAbort(sessionId, cmOptimizeIndex, apIVersion)

Abort Index Optimization

Force index optimizer to abort a job.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmOptimizeIndex : CMOptimizeIndex =  // CMOptimizeIndex | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.optimizeIndexesAbort(sessionId, cmOptimizeIndex, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#optimizeIndexesAbort")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#optimizeIndexesAbort")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmOptimizeIndex** | [**CMOptimizeIndex**](CMOptimizeIndex.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="redactDocument"></a>
# **redactDocument**
> kotlin.ByteArray redactDocument(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, sessionId)

Redact Document

Create a redacted version of a document as a PDF given its url.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val url : kotlin.String = url_example // kotlin.String | the base-64 encoded (no-prefix) url of the document
val entityCsv : kotlin.String = entityCsv_example // kotlin.String | a csv list of entities to redact (e.g. person,location)
val wordCsv : kotlin.String = wordCsv_example // kotlin.String | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.)
val allowWordsCsv : kotlin.String = allowWordsCsv_example // kotlin.String | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.)
val sessionId : kotlin.String = sessionId_example // kotlin.String | an optional SimSage Session id.
try {
    val result : kotlin.ByteArray = apiInstance.redactDocument(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#redactDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#redactDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **url** | **kotlin.String**| the base-64 encoded (no-prefix) url of the document |
 **entityCsv** | **kotlin.String**| a csv list of entities to redact (e.g. person,location) |
 **wordCsv** | **kotlin.String**| a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) |
 **allowWordsCsv** | **kotlin.String**| a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) |
 **sessionId** | **kotlin.String**| an optional SimSage Session id. | [optional]

### Return type

**kotlin.ByteArray**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="saveCategorization"></a>
# **saveCategorization**
> JsonMessage saveCategorization(sessionId, cmCategorization, apIVersion)

save categorization

create or update a specific categorization for a given org/kb

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmCategorization : CMCategorization =  // CMCategorization | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.saveCategorization(sessionId, cmCategorization, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#saveCategorization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#saveCategorization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmCategorization** | [**CMCategorization**](CMCategorization.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveSemantic"></a>
# **saveSemantic**
> JsonMessage saveSemantic(organisationId, kbId, sessionId, cmSemanticModelEdit, apIVersion)

Save Semantic

Create or update (save) a semantic in SimSage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSemanticModelEdit : CMSemanticModelEdit =  // CMSemanticModelEdit | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.saveSemantic(organisationId, kbId, sessionId, cmSemanticModelEdit, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#saveSemantic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#saveSemantic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSemanticModelEdit** | [**CMSemanticModelEdit**](CMSemanticModelEdit.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveSynSet"></a>
# **saveSynSet**
> JsonMessage saveSynSet(organisationId, kbId, sessionId, cmSynSet, apIVersion)

Save SynSet

Save (update/create) a syn-set in SimSage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSynSet : CMSynSet =  // CMSynSet | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.saveSynSet(organisationId, kbId, sessionId, cmSynSet, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#saveSynSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#saveSynSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSynSet** | [**CMSynSet**](CMSynSet.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveSynonym"></a>
# **saveSynonym**
> JsonMessage saveSynonym(organisationId, kbId, sessionId, cmSynonym, apIVersion)

Save Synonym

Save (update/create) a synonym.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmSynonym : CMSynonym =  // CMSynonym | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.saveSynonym(organisationId, kbId, sessionId, cmSynonym, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#saveSynonym")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#saveSynonym")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmSynonym** | [**CMSynonym**](CMSynonym.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tuneLanguageGraph"></a>
# **tuneLanguageGraph**
> JsonMessage tuneLanguageGraph(organisationId, kbId, sessionId, apIVersion)

Tune Graph

Create a tuned language graph for a given organisation/knowledge-base.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val kbId : kotlin.String = kbId_example // kotlin.String | the knowledge-base (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.tuneLanguageGraph(organisationId, kbId, sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#tuneLanguageGraph")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#tuneLanguageGraph")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **kbId** | **kotlin.String**| the knowledge-base (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="version2"></a>
# **version2**
> CMVersion version2()

Version

Return the version of the SimSage Language Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
try {
    val result : CMVersion = apiInstance.version2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#version2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#version2")
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

