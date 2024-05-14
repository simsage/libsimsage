# \DiscoveryApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all_gdpr_projects**](DiscoveryApi.md#all_gdpr_projects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
[**apply_redactions**](DiscoveryApi.md#apply_redactions) | **POST** /api/discovery/applyredactions | 
[**create_gdpr_project**](DiscoveryApi.md#create_gdpr_project) | **POST** /api/discovery/createproject | 
[**delete_project**](DiscoveryApi.md#delete_project) | **DELETE** /api/discovery/deleteproject | 
[**export_redacted_doc**](DiscoveryApi.md#export_redacted_doc) | **POST** /api/discovery/exportredacteddoc | 
[**get_gdpr_document**](DiscoveryApi.md#get_gdpr_document) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} | 
[**get_paged_project_documents**](DiscoveryApi.md#get_paged_project_documents) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
[**growth_per_month**](DiscoveryApi.md#growth_per_month) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth
[**setdocumentredactions**](DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument | 
[**storage_by_source**](DiscoveryApi.md#storage_by_source) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage
[**summary_by_document_type**](DiscoveryApi.md#summary_by_document_type) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage
[**update_document_set**](DiscoveryApi.md#update_document_set) | **POST** /api/discovery/updatedocumentset | 
[**version5**](DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version



## all_gdpr_projects

> serde_json::Value all_gdpr_projects(organisation_id, kb_id, page, page_size, text_filter, status_filter, sort_column, sort_direction, session_id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**page** | **i32** | the page to render | [required] |
**page_size** | **i32** | the page size to use | [required] |
**text_filter** | **String** | the text filter passed in or blank if empty | [required] |
**status_filter** | **String** | the status filter passed in | [required] |
**sort_column** | **String** | the sort column used for the results | [required] |
**sort_direction** | **i32** | sort direction to use (0/1) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apply_redactions

> serde_json::Value apply_redactions(session_id, cm_redaction_data)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_redaction_data** | [**CmRedactionData**](CmRedactionData.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_gdpr_project

> serde_json::Value create_gdpr_project(session_id, cm_create_gdpr_project)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_create_gdpr_project** | [**CmCreateGdprProject**](CmCreateGdprProject.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_project

> serde_json::Value delete_project(session_id, cm_delete_project_cmd)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_delete_project_cmd** | [**CmDeleteProjectCmd**](CmDeleteProjectCmd.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## export_redacted_doc

> serde_json::Value export_redacted_doc(session_id, cm_export_redacted_document)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_export_redacted_document** | [**CmExportRedactedDocument**](CmExportRedactedDocument.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_gdpr_document

> serde_json::Value get_gdpr_document(organisation_id, kb_id, project_id, url, session_id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**project_id** | **String** | Project Id for the items | [required] |
**url** | **String** | The url of the document to retrieve | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_paged_project_documents

> serde_json::Value get_paged_project_documents(organisation_id, kb_id, project_id, page, page_size, text_filter, type_filter, status_filter, sort_column, sort_direction, session_id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**project_id** | **String** | Project Id for the items | [required] |
**page** | **i32** | the page to render | [required] |
**page_size** | **i32** | the page size to use | [required] |
**text_filter** | **String** | the text filter passed in or blank if empty | [required] |
**type_filter** | **String** | the type filter passed in | [required] |
**status_filter** | **String** | the status filter passed in | [required] |
**sort_column** | **String** | the sort column used for the results | [required] |
**sort_direction** | **i32** | sort direction to use (0/1) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## growth_per_month

> serde_json::Value growth_per_month(organisation_id, kb_id, session_id)
growth

Get the storage growth delta per month

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setdocumentredactions

> serde_json::Value setdocumentredactions(session_id, cm_redaction_data)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_redaction_data** | [**CmRedactionData**](CmRedactionData.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## storage_by_source

> serde_json::Value storage_by_source(organisation_id, kb_id, session_id)
storage

Get the current amount of storage used by source

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## summary_by_document_type

> serde_json::Value summary_by_document_type(organisation_id, kb_id, session_id)
storage

Get the current amount of storage used by source and document type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**kb_id** | **String** | the knowledge-base (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_document_set

> serde_json::Value update_document_set(session_id, cm_update_document_set)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_update_document_set** | [**CmUpdateDocumentSet**](CmUpdateDocumentSet.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version5

> crate::models::CmVersion version5()
Version

Get the version of SimSage Discovery Services.

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

