# SemanticApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTextToSearch**](SemanticApi.md#deleteTextToSearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search |
| [**documentQuestionAndAnswer**](SemanticApi.md#documentQuestionAndAnswer) | **POST** /api/semantic/document-qa | Document Q&amp;A |
| [**getTextToSearchPaginated**](SemanticApi.md#getTextToSearchPaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings |
| [**restfulClientQuery**](SemanticApi.md#restfulClientQuery) | **POST** /api/semantic/query | Client Query |
| [**saveTextToSearch**](SemanticApi.md#saveTextToSearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item |
| [**shortSummary**](SemanticApi.md#shortSummary) | **POST** /api/semantic/short-summary | Short summary |
| [**tryTextToSearchConversion**](SemanticApi.md#tryTextToSearchConversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search |
| [**version1**](SemanticApi.md#version1) | **GET** /api/semantic/version | Version |


<a name="deleteTextToSearch"></a>
# **deleteTextToSearch**
> JsonMessage deleteTextToSearch(organisationId, kbId, word, session-id, API-Version)

Delete text-to-search

    Remove an existing text-to-search item.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **word** | **String**| the word of the text-to-search word | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="documentQuestionAndAnswer"></a>
# **documentQuestionAndAnswer**
> CMDocumentQuestionAndAnswer documentQuestionAndAnswer(session-id, CMDocumentQuestionAndAnswer)

Document Q&amp;A

    Answer a question about a given document

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMDocumentQuestionAndAnswer** | [**CMDocumentQuestionAndAnswer**](../Models/CMDocumentQuestionAndAnswer.md)|  | |

### Return type

[**CMDocumentQuestionAndAnswer**](../Models/CMDocumentQuestionAndAnswer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getTextToSearchPaginated"></a>
# **getTextToSearchPaginated**
> CMTextToSearchPaginatedReturn getTextToSearchPaginated(session-id, CMTextToSearchPaginated, API-Version)

Text to Search mappings

    Return a paginated list of text-to-search mappings with an optional filter.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMTextToSearchPaginated** | [**CMTextToSearchPaginated**](../Models/CMTextToSearchPaginated.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMTextToSearchPaginatedReturn**](../Models/CMTextToSearchPaginatedReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="restfulClientQuery"></a>
# **restfulClientQuery**
> CMClientQueryResult restfulClientQuery(CMClientQuery)

Client Query

    a SimSage client asks a question or performs a keyword-search.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMClientQuery** | [**CMClientQuery**](../Models/CMClientQuery.md)|  | |

### Return type

[**CMClientQueryResult**](../Models/CMClientQueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveTextToSearch"></a>
# **saveTextToSearch**
> JsonMessage saveTextToSearch(organisationId, kbId, session-id, CMTextToSearchEdit, API-Version)

Save a text-to-search item

    Create or update (save) a text-to-search item.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMTextToSearchEdit** | [**CMTextToSearchEdit**](../Models/CMTextToSearchEdit.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="shortSummary"></a>
# **shortSummary**
> CMShortSummaryResult shortSummary(CMShortSummary)

Short summary

    Create a short summary for a given url / sentence

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMShortSummary** | [**CMShortSummary**](../Models/CMShortSummary.md)|  | |

### Return type

[**CMShortSummaryResult**](../Models/CMShortSummaryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="tryTextToSearchConversion"></a>
# **tryTextToSearchConversion**
> CMTextToSearchConversionReturn tryTextToSearchConversion(session-id, CMTextToSearchConversion, API-Version)

try converting text-to-search

    See the results of a text-to-search conversion

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMTextToSearchConversion** | [**CMTextToSearchConversion**](../Models/CMTextToSearchConversion.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMTextToSearchConversionReturn**](../Models/CMTextToSearchConversionReturn.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="version1"></a>
# **version1**
> CMVersion version1()

Version

    Get the version of SimSage Search Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

