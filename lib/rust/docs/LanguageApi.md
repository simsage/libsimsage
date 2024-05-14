# \LanguageApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_default_syn_sets**](LanguageApi.md#add_default_syn_sets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets
[**delete_all_synonyms**](LanguageApi.md#delete_all_synonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms
[**delete_categorization**](LanguageApi.md#delete_categorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization
[**delete_semantic**](LanguageApi.md#delete_semantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic
[**delete_syn_set**](LanguageApi.md#delete_syn_set) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet
[**delete_synonym**](LanguageApi.md#delete_synonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym
[**find_syn_sets**](LanguageApi.md#find_syn_sets) | **PUT** /api/language/find-syn-sets | Find SynSets
[**get_categorization_list**](LanguageApi.md#get_categorization_list) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list
[**get_paginated**](LanguageApi.md#get_paginated) | **PUT** /api/language/synonyms | get Synonyms Paginated
[**get_semantics_paginated**](LanguageApi.md#get_semantics_paginated) | **PUT** /api/language/semantics | Semantics Paginated
[**optimize_indexes**](LanguageApi.md#optimize_indexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes
[**optimize_indexes_abort**](LanguageApi.md#optimize_indexes_abort) | **PUT** /api/language/optimize-indexes-abort | Abort Index Optimization
[**redact_document**](LanguageApi.md#redact_document) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document
[**save_categorization**](LanguageApi.md#save_categorization) | **PUT** /api/language/categorization | save categorization
[**save_semantic**](LanguageApi.md#save_semantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic
[**save_syn_set**](LanguageApi.md#save_syn_set) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet
[**save_synonym**](LanguageApi.md#save_synonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym
[**tune_language_graph**](LanguageApi.md#tune_language_graph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph
[**version2**](LanguageApi.md#version2) | **GET** /api/language/version | Version



## add_default_syn_sets

> crate::models::JsonMessage add_default_syn_sets(organisation_id, kb_id, session_id, api_version)
Add all default SynSets

Add default syn-sets to the given org/kb

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_all_synonyms

> crate::models::JsonMessage delete_all_synonyms(organisation_id, kb_id, session_id, api_version)
Delete All Synonyms

Delete all synonyms for a given org/kb

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base to delete/remove (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_categorization

> crate::models::JsonMessage delete_categorization(organisation_id, kb_id, categorization_label, session_id, api_version)
remove categorization

remove a specific categorization for a given org/kb

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**categorization_label** | **String** | the metadata (name) to remove | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_semantic

> crate::models::JsonMessage delete_semantic(organisation_id, kb_id, word, semantic, session_id, api_version)
Delete Semantic

Remove an existing semantic from SimSage.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**word** | **String** | the word (more specific item) of the semantic to delete (eg. \"John\") | [required] |
**semantic** | **String** | the semantic of the word to delete (eg. \"person\") | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_syn_set

> crate::models::JsonMessage delete_syn_set(organisation_id, kb_id, lemma, session_id, api_version)
Delete SynSet

Remove a syn-set from SimSage by lemma.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**lemma** | **String** | the lemma (base word) of the syn-set to remove. | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_synonym

> crate::models::JsonMessage delete_synonym(organisation_id, kb_id, id, session_id, api_version)
Delete Synonym

Delete a synonym using its id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**id** | **i32** | the id of the synonym to remove. | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## find_syn_sets

> crate::models::CmSynSetList find_syn_sets(session_id, cm_syn_set_find, api_version)
Find SynSets

Find syn-sets using filters

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_syn_set_find** | [**CmSynSetFind**](CmSynSetFind.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSynSetList**](CMSynSetList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_categorization_list

> crate::models::CmCategorizationPaginatedList get_categorization_list(organisation_id, kb_id, prev_categorization_label, page_size, session_id, api_version)
categorization list

get all categorizations for a given org/kb paginated

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**prev_categorization_label** | **String** | the previous categorization label for pagination, or null if first page | [required] |
**page_size** | **i32** | the size of the page returned | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmCategorizationPaginatedList**](CMCategorizationPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_paginated

> crate::models::CmSynonymsPaginatedResult get_paginated(session_id, cm_synonyms_paginated, api_version)
get Synonyms Paginated

return a paginated list of synonyms with optional filtering.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_synonyms_paginated** | [**CmSynonymsPaginated**](CmSynonymsPaginated.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSynonymsPaginatedResult**](CMSynonymsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_semantics_paginated

> crate::models::CmSemanticsPaginatedResult get_semantics_paginated(session_id, cm_semantics_paginated, api_version)
Semantics Paginated

Return a paginated list of semantics with an optional filter.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_semantics_paginated** | [**CmSemanticsPaginated**](CmSemanticsPaginated.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSemanticsPaginatedResult**](CMSemanticsPaginatedResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## optimize_indexes

> crate::models::JsonMessage optimize_indexes(session_id, cm_optimize_index, api_version)
Optimize Indexes

Force index optimization for a the given knowledge-base, now.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_optimize_index** | [**CmOptimizeIndex**](CmOptimizeIndex.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## optimize_indexes_abort

> crate::models::JsonMessage optimize_indexes_abort(session_id, cm_optimize_index, api_version)
Abort Index Optimization

Force index optimizer to abort a job.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_optimize_index** | [**CmOptimizeIndex**](CmOptimizeIndex.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## redact_document

> String redact_document(organisation_id, kb_id, url, entity_csv, word_csv, allow_words_csv, session_id)
Redact Document

Create a redacted version of a document as a PDF given its url.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**url** | **String** | the base-64 encoded (no-prefix) url of the document | [required] |
**entity_csv** | **String** | a csv list of entities to redact (e.g. person,location) | [required] |
**word_csv** | **String** | a csv list of additional words to redact (e.g. John,Markov.  Use null for ignore.) | [required] |
**allow_words_csv** | **String** | a csv list of words to not-redact (e.g. John,Markov.  Use null for ignore.) | [required] |
**session_id** | Option<**String**> | an optional SimSage Session id. |  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_categorization

> crate::models::JsonMessage save_categorization(session_id, cm_categorization, api_version)
save categorization

create or update a specific categorization for a given org/kb

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_categorization** | [**CmCategorization**](CmCategorization.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_semantic

> crate::models::JsonMessage save_semantic(organisation_id, kb_id, session_id, cm_semantic_model_edit, api_version)
Save Semantic

Create or update (save) a semantic in SimSage.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_semantic_model_edit** | [**CmSemanticModelEdit**](CmSemanticModelEdit.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_syn_set

> crate::models::JsonMessage save_syn_set(organisation_id, kb_id, session_id, cm_syn_set, api_version)
Save SynSet

Save (update/create) a syn-set in SimSage.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_syn_set** | [**CmSynSet**](CmSynSet.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_synonym

> crate::models::JsonMessage save_synonym(organisation_id, kb_id, session_id, cm_synonym, api_version)
Save Synonym

Save (update/create) a synonym.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_synonym** | [**CmSynonym**](CmSynonym.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tune_language_graph

> crate::models::JsonMessage tune_language_graph(organisation_id, kb_id, session_id, api_version)
Tune Graph

Create a tuned language graph for a given organisation/knowledge-base.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version2

> crate::models::CmVersion version2()
Version

Return the version of the SimSage Language Services.

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::CmVersion**](CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

