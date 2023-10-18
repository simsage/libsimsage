# LanguageApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDefaultSynSets**](LanguageApi.md#addDefaultSynSets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets |
| [**deleteAllSynonyms**](LanguageApi.md#deleteAllSynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms |
| [**deleteCategorization**](LanguageApi.md#deleteCategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization |
| [**deleteSemantic**](LanguageApi.md#deleteSemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic |
| [**deleteSynSet**](LanguageApi.md#deleteSynSet) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet |
| [**deleteSynonym**](LanguageApi.md#deleteSynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym |
| [**findSynSets**](LanguageApi.md#findSynSets) | **PUT** /api/language/find-syn-sets | Find SynSets |
| [**getCategorizationList**](LanguageApi.md#getCategorizationList) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list |
| [**getPaginated**](LanguageApi.md#getPaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated |
| [**getSemanticsPaginated**](LanguageApi.md#getSemanticsPaginated) | **PUT** /api/language/semantics | Semantics Paginated |
| [**optimizeIndexes**](LanguageApi.md#optimizeIndexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes |
| [**redactDocument**](LanguageApi.md#redactDocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document |
| [**saveCategorization**](LanguageApi.md#saveCategorization) | **PUT** /api/language/categorization | save categorization |
| [**saveSemantic**](LanguageApi.md#saveSemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic |
| [**saveSynSet**](LanguageApi.md#saveSynSet) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet |
| [**saveSynonym**](LanguageApi.md#saveSynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym |
| [**truncateSlowIndexes**](LanguageApi.md#truncateSlowIndexes) | **GET** /api/language/truncate-slow-indexes/{organisationId}/{kbId} | Truncate slow Indexes |
| [**tuneLanguageGraph**](LanguageApi.md#tuneLanguageGraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph |
| [**version2**](LanguageApi.md#version2) | **GET** /api/language/version | Version |


<a name="addDefaultSynSets"></a>
# **addDefaultSynSets**
> JsonMessage addDefaultSynSets(organisationId, kbId, session-id, API-Version)

Add all default SynSets

    Add default syn-sets to the given org/kb

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteAllSynonyms"></a>
# **deleteAllSynonyms**
> JsonMessage deleteAllSynonyms(organisationId, kbId, session-id, API-Version)

Delete All Synonyms

    Delete all synonyms for a given org/kb

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base to delete/remove (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteCategorization"></a>
# **deleteCategorization**
> JsonMessage deleteCategorization(organisationId, kbId, categorizationLabel, session-id, API-Version)

remove categorization

    remove a specific categorization for a given org/kb

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **categorizationLabel** | **String**| the metadata (name) to remove | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteSemantic"></a>
# **deleteSemantic**
> JsonMessage deleteSemantic(organisationId, kbId, word, semantic, session-id, API-Version)

Delete Semantic

    Remove an existing semantic from SimSage.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **word** | **String**| the word (more specific item) of the semantic to delete (eg. \&quot;John\&quot;) | [default to null] |
| **semantic** | **String**| the semantic of the word to delete (eg. \&quot;person\&quot;) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteSynSet"></a>
# **deleteSynSet**
> JsonMessage deleteSynSet(organisationId, kbId, lemma, session-id, API-Version)

Delete SynSet

    Remove a syn-set from SimSage by lemma.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **lemma** | **String**| the lemma (base word) of the syn-set to remove. | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteSynonym"></a>
# **deleteSynonym**
> JsonMessage deleteSynonym(organisationId, kbId, id, session-id, API-Version)

Delete Synonym

    Delete a synonym using its id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **id** | **Integer**| the id of the synonym to remove. | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="findSynSets"></a>
# **findSynSets**
> CMSynSetList findSynSets(session-id, CMSynSetFind, API-Version)

Find SynSets

    Find syn-sets using filters

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSynSetFind** | [**CMSynSetFind**](../Models/CMSynSetFind.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSynSetList**](../Models/CMSynSetList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getCategorizationList"></a>
# **getCategorizationList**
> CMCategorizationPaginatedList getCategorizationList(organisationId, kbId, prevCategorizationLabel, pageSize, session-id, API-Version)

categorization list

    get all categorizations for a given org/kb paginated

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **prevCategorizationLabel** | **String**| the previous categorization label for pagination, or null if first page | [default to null] |
| **pageSize** | **Integer**| the size of the page returned | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMCategorizationPaginatedList**](../Models/CMCategorizationPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getPaginated"></a>
# **getPaginated**
> CMSynonymsPaginatedResult getPaginated(session-id, CMSynonymsPaginated, API-Version)

get Synonyms Paginated

    return a paginated list of synonyms with optional filtering.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSynonymsPaginated** | [**CMSynonymsPaginated**](../Models/CMSynonymsPaginated.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSynonymsPaginatedResult**](../Models/CMSynonymsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getSemanticsPaginated"></a>
# **getSemanticsPaginated**
> CMSemanticsPaginatedResult getSemanticsPaginated(session-id, CMSemanticsPaginated, API-Version)

Semantics Paginated

    Return a paginated list of semantics with an optional filter.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSemanticsPaginated** | [**CMSemanticsPaginated**](../Models/CMSemanticsPaginated.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMSemanticsPaginatedResult**](../Models/CMSemanticsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="optimizeIndexes"></a>
# **optimizeIndexes**
> JsonMessage optimizeIndexes(session-id, CMOptimizeIndex, API-Version)

Optimize Indexes

    Force index optimization for a the given knowledge-base, now.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMOptimizeIndex** | [**CMOptimizeIndex**](../Models/CMOptimizeIndex.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="redactDocument"></a>
# **redactDocument**
> byte[] redactDocument(organisationId, kbId, url, entityCsv, wordCsv, allowWordsCsv, session-id)

Redact Document

    Create a redacted version of a document as a PDF given its url.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **url** | **String**| the base-64 encoded (no-prefix) url of the document | [default to null] |
| **entityCsv** | **String**| a csv list of entities to redact (e.g. person,location) | [default to null] |
| **wordCsv** | **String**| a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) | [default to null] |
| **allowWordsCsv** | **String**| a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) | [default to null] |
| **session-id** | **String**| an optional SimSage Session id. | [optional] [default to null] |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json

<a name="saveCategorization"></a>
# **saveCategorization**
> JsonMessage saveCategorization(session-id, CMCategorization, API-Version)

save categorization

    create or update a specific categorization for a given org/kb

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMCategorization** | [**CMCategorization**](../Models/CMCategorization.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveSemantic"></a>
# **saveSemantic**
> JsonMessage saveSemantic(organisationId, kbId, session-id, CMSemanticModelEdit, API-Version)

Save Semantic

    Create or update (save) a semantic in SimSage.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSemanticModelEdit** | [**CMSemanticModelEdit**](../Models/CMSemanticModelEdit.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveSynSet"></a>
# **saveSynSet**
> JsonMessage saveSynSet(organisationId, kbId, session-id, CMSynSet, API-Version)

Save SynSet

    Save (update/create) a syn-set in SimSage.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSynSet** | [**CMSynSet**](../Models/CMSynSet.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveSynonym"></a>
# **saveSynonym**
> JsonMessage saveSynonym(organisationId, kbId, session-id, CMSynonym, API-Version)

Save Synonym

    Save (update/create) a synonym.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMSynonym** | [**CMSynonym**](../Models/CMSynonym.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="truncateSlowIndexes"></a>
# **truncateSlowIndexes**
> JsonMessage truncateSlowIndexes(organisationId, kbId, session-id, API-Version)

Truncate slow Indexes

    Force slow-index truncation for a the given knowledge-base, now.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **kbId** | **String**| the knowledge-bases&#39; id (a guid) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="tuneLanguageGraph"></a>
# **tuneLanguageGraph**
> JsonMessage tuneLanguageGraph(organisationId, kbId, session-id, API-Version)

Tune Graph

    Create a tuned language graph for a given organisation/knowledge-base.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="version2"></a>
# **version2**
> CMVersion version2()

Version

    Return the version of the SimSage Language Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

