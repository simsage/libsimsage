# KnowledgebaseApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportKnowledgeBase**](KnowledgebaseApi.md#exportKnowledgeBase) | **POST** /api/knowledgebase/export | export Knowledge-base |
| [**getKnowledgeBase**](KnowledgebaseApi.md#getKnowledgeBase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base |
| [**getKnowledgeBases**](KnowledgebaseApi.md#getKnowledgeBases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases |
| [**getSearchInfo**](KnowledgebaseApi.md#getSearchInfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info |
| [**getSearchInfo2**](KnowledgebaseApi.md#getSearchInfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated] |
| [**removeKnowledgeBase**](KnowledgebaseApi.md#removeKnowledgeBase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base |
| [**updateKnowledgeBase**](KnowledgebaseApi.md#updateKnowledgeBase) | **PUT** /api/knowledgebase/save | Save Knowledge-base |
| [**version3**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version |


<a name="exportKnowledgeBase"></a>
# **exportKnowledgeBase**
> JsonMessage exportKnowledgeBase(session-id, CMKnowledgeBaseExport, API-Version)

export Knowledge-base

    starts the export of a knowledge-base using the passed in exporter config

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMKnowledgeBaseExport** | [**CMKnowledgeBaseExport**](../Models/CMKnowledgeBaseExport.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getKnowledgeBase"></a>
# **getKnowledgeBase**
> CMKnowledgeBase getKnowledgeBase(organisationId, kbId, session-id, API-Version)

Get Knowledge-base

    Return a knowledge base by id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **kbId** | **String**| the knowledge-base to get (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMKnowledgeBase**](../Models/CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getKnowledgeBases"></a>
# **getKnowledgeBases**
> List getKnowledgeBases(organisationId, session-id)

Get Knowledge-bases

    Return a list of knowledge bases for a given organisation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**List**](../Models/CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSearchInfo"></a>
# **getSearchInfo**
> CMInfo getSearchInfo(organisationId, clientId, API-Version)

Search Info

    return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **clientId** | **String**| the client&#39;s id (its guid id), pre-register this client as a known client. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMInfo**](../Models/CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSearchInfo2"></a>
# **getSearchInfo2**
> CMInfo getSearchInfo2(organisationId, API-Version)

Search Info [deprecated]

    Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**CMInfo**](../Models/CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeKnowledgeBase"></a>
# **removeKnowledgeBase**
> JsonMessage removeKnowledgeBase(organisationId, kbId, session-id, API-Version)

Delete Knowledge-base

    Delete a knowledge-base by Id.

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

<a name="updateKnowledgeBase"></a>
# **updateKnowledgeBase**
> KnowledgeBase updateKnowledgeBase(session-id, CMKnowledgeBase, API-Version)

Save Knowledge-base

    Save (Create or Update) a SimSage knowledge base item.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMKnowledgeBase** | [**CMKnowledgeBase**](../Models/CMKnowledgeBase.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**KnowledgeBase**](../Models/KnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="version3"></a>
# **version3**
> CMVersion version3()

Version

    Return the version of SimSage knowledge-base Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**CMVersion**](../Models/CMVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

