# \SemanticApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_text_to_search**](SemanticApi.md#delete_text_to_search) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search
[**document_question_and_answer**](SemanticApi.md#document_question_and_answer) | **POST** /api/semantic/document-qa | Document Q&A
[**get_text_to_search_paginated**](SemanticApi.md#get_text_to_search_paginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings
[**restful_client_query**](SemanticApi.md#restful_client_query) | **POST** /api/semantic/query | Client Query
[**save_text_to_search**](SemanticApi.md#save_text_to_search) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item
[**short_summary**](SemanticApi.md#short_summary) | **POST** /api/semantic/short-summary | Short summary
[**try_text_to_search_conversion**](SemanticApi.md#try_text_to_search_conversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search
[**version1**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version



## delete_text_to_search

> crate::models::JsonMessage delete_text_to_search(organisation_id, kb_id, word, session_id, api_version)
Delete text-to-search

Remove an existing text-to-search item.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**word** | **String** | the word of the text-to-search word | [required] |
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


## document_question_and_answer

> crate::models::CmDocumentQuestionAndAnswer document_question_and_answer(session_id, cm_document_question_and_answer)
Document Q&A

Answer a question about a given document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_document_question_and_answer** | [**CmDocumentQuestionAndAnswer**](CmDocumentQuestionAndAnswer.md) |  | [required] |

### Return type

[**crate::models::CmDocumentQuestionAndAnswer**](CMDocumentQuestionAndAnswer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_text_to_search_paginated

> crate::models::CmTextToSearchPaginatedReturn get_text_to_search_paginated(session_id, cm_text_to_search_paginated, api_version)
Text to Search mappings

Return a paginated list of text-to-search mappings with an optional filter.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_text_to_search_paginated** | [**CmTextToSearchPaginated**](CmTextToSearchPaginated.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmTextToSearchPaginatedReturn**](CMTextToSearchPaginatedReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## restful_client_query

> crate::models::CmClientQueryResult restful_client_query(cm_client_query)
Client Query

a SimSage client asks a question or performs a keyword-search.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_client_query** | [**CmClientQuery**](CmClientQuery.md) |  | [required] |

### Return type

[**crate::models::CmClientQueryResult**](CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_text_to_search

> crate::models::JsonMessage save_text_to_search(organisation_id, kb_id, session_id, cm_text_to_search_edit, api_version)
Save a text-to-search item

Create or update (save) a text-to-search item.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_text_to_search_edit** | [**CmTextToSearchEdit**](CmTextToSearchEdit.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## short_summary

> crate::models::CmShortSummaryResult short_summary(cm_short_summary)
Short summary

Create a short summary for a given url / sentence

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_short_summary** | [**CmShortSummary**](CmShortSummary.md) |  | [required] |

### Return type

[**crate::models::CmShortSummaryResult**](CMShortSummaryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## try_text_to_search_conversion

> crate::models::CmTextToSearchConversionReturn try_text_to_search_conversion(session_id, cm_text_to_search_conversion, api_version)
try converting text-to-search

See the results of a text-to-search conversion

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_text_to_search_conversion** | [**CmTextToSearchConversion**](CmTextToSearchConversion.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmTextToSearchConversionReturn**](CMTextToSearchConversionReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version1

> crate::models::CmVersion version1()
Version

Get the version of SimSage Search Services.

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

