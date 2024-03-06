# \KnowledgebaseApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**export_knowledge_base**](KnowledgebaseApi.md#export_knowledge_base) | **POST** /api/knowledgebase/export | export Knowledge-base
[**get_knowledge_base**](KnowledgebaseApi.md#get_knowledge_base) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base
[**get_knowledge_bases**](KnowledgebaseApi.md#get_knowledge_bases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases
[**get_search_info**](KnowledgebaseApi.md#get_search_info) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info
[**get_search_info2**](KnowledgebaseApi.md#get_search_info2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated]
[**remove_knowledge_base**](KnowledgebaseApi.md#remove_knowledge_base) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base
[**update_knowledge_base**](KnowledgebaseApi.md#update_knowledge_base) | **PUT** /api/knowledgebase/save | Save Knowledge-base
[**version3**](KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version



## export_knowledge_base

> crate::models::JsonMessage export_knowledge_base(session_id, cm_knowledge_base_export, api_version)
export Knowledge-base

starts the export of a knowledge-base using the passed in exporter config

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_knowledge_base_export** | [**CmKnowledgeBaseExport**](CmKnowledgeBaseExport.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_knowledge_base

> crate::models::CmKnowledgeBase get_knowledge_base(organisation_id, kb_id, session_id, api_version)
Get Knowledge-base

Return a knowledge base by id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base to get (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmKnowledgeBase**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_knowledge_bases

> Vec<crate::models::CmKnowledgeBase> get_knowledge_bases(organisation_id, session_id)
Get Knowledge-bases

Return a list of knowledge bases for a given organisation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**Vec<crate::models::CmKnowledgeBase>**](CMKnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_search_info

> crate::models::CmInfo get_search_info(organisation_id, client_id, api_version)
Search Info

return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**client_id** | **String** | the client's id (its guid id), pre-register this client as a known client. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_search_info2

> crate::models::CmInfo get_search_info2(organisation_id, api_version)
Search Info [deprecated]

Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmInfo**](CMInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_knowledge_base

> crate::models::JsonMessage remove_knowledge_base(organisation_id, kb_id, session_id, api_version)
Delete Knowledge-base

Delete a knowledge-base by Id.

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


## update_knowledge_base

> crate::models::KnowledgeBase update_knowledge_base(session_id, cm_knowledge_base, api_version)
Save Knowledge-base

Save (Create or Update) a SimSage knowledge base item.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_knowledge_base** | [**CmKnowledgeBase**](CmKnowledgeBase.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::KnowledgeBase**](KnowledgeBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version3

> crate::models::CmVersion version3()
Version

Return the version of SimSage knowledge-base Services.

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

