# \CrawlerApi

All URIs are relative to *https://demo.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crawler_delete_folder**](CrawlerApi.md#crawler_delete_folder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder
[**crawler_delete_url**](CrawlerApi.md#crawler_delete_url) | **POST** /api/crawler/external/crawler/delete-url | Delete document
[**crawler_external_document_delete**](CrawlerApi.md#crawler_external_document_delete) | **PUT** /api/crawler/external/document/delete | Remove an External Document
[**crawler_external_document_failed**](CrawlerApi.md#crawler_external_document_failed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document
[**crawler_external_document_un_changed**](CrawlerApi.md#crawler_external_document_un_changed) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged
[**crawler_external_document_upload**](CrawlerApi.md#crawler_external_document_upload) | **POST** /api/crawler/external/document/upload | Upload External Document
[**crawler_external_image_upload**](CrawlerApi.md#crawler_external_image_upload) | **POST** /api/crawler/external/document/upload/image | Upload External Image
[**crawler_rename_folder**](CrawlerApi.md#crawler_rename_folder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder
[**crawler_update_delta_token**](CrawlerApi.md#crawler_update_delta_token) | **POST** /api/crawler/external/crawler/delta-token | Update delta token
[**delete**](CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source
[**delete_documents**](CrawlerApi.md#delete_documents) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source's documents
[**encrypted_communications**](CrawlerApi.md#encrypted_communications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication
[**external_crawler**](CrawlerApi.md#external_crawler) | **POST** /api/crawler/external/crawler | External Crawler
[**external_crawler_finished**](CrawlerApi.md#external_crawler_finished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler
[**external_crawler_start**](CrawlerApi.md#external_crawler_start) | **POST** /api/crawler/external/crawler/start | Start External Crawler
[**get_crawler**](CrawlerApi.md#get_crawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source
[**get_failed_documents**](CrawlerApi.md#get_failed_documents) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List
[**get_source_list**](CrawlerApi.md#get_source_list) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List
[**oidc_code**](CrawlerApi.md#oidc_code) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver
[**process_all_files**](CrawlerApi.md#process_all_files) | **POST** /api/crawler/process-all-files | Process all files of crawler/source
[**reset_source_delta**](CrawlerApi.md#reset_source_delta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token
[**start_crawler**](CrawlerApi.md#start_crawler) | **POST** /api/crawler/start | Start crawler
[**test_crawler**](CrawlerApi.md#test_crawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler
[**update_crawler**](CrawlerApi.md#update_crawler) | **POST** /api/crawler/crawler | Update Source
[**version6**](CrawlerApi.md#version6) | **GET** /api/crawler/version | Version



## crawler_delete_folder

> crate::models::JsonMessage crawler_delete_folder(cm_external_crawler_delete_folder, api_version)
Delete document folder

An external crawler removes a document folder.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler_delete_folder** | [**CmExternalCrawlerDeleteFolder**](CmExternalCrawlerDeleteFolder.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_delete_url

> crate::models::JsonMessage crawler_delete_url(cm_external_crawler_delete_url, api_version)
Delete document

An external crawler removes a document.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler_delete_url** | [**CmExternalCrawlerDeleteUrl**](CmExternalCrawlerDeleteUrl.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_external_document_delete

> crate::models::JsonMessage crawler_external_document_delete(cm_delete_document, api_version)
Remove an External Document

Remove an external crawler document from SimSage.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_delete_document** | [**CmDeleteDocument**](CmDeleteDocument.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_external_document_failed

> crate::models::JsonMessage crawler_external_document_failed(cm_failed_source_document, api_version)
Upload External Document

An external crawler document wants to upload a document to SimSage.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_failed_source_document** | [**CmFailedSourceDocument**](CmFailedSourceDocument.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_external_document_un_changed

> crate::models::JsonMessage crawler_external_document_un_changed(cm_document_un_changed, api_version)
Mark External Document Unchanged

An external crawler document marks a document as not having changed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_document_un_changed** | [**CmDocumentUnChanged**](CmDocumentUnChanged.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_external_document_upload

> crate::models::JsonMessage crawler_external_document_upload(cm_upload_document, api_version)
Upload External Document

An external crawler document wants to upload a document to SimSage.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_upload_document** | [**CmUploadDocument**](CmUploadDocument.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_external_image_upload

> crate::models::JsonMessage crawler_external_image_upload(cm_upload_image, api_version)
Upload External Image

An external crawler uploads an image for a document.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_upload_image** | [**CmUploadImage**](CmUploadImage.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_rename_folder

> crate::models::JsonMessage crawler_rename_folder(cm_external_crawler_rename_folder, api_version)
Rename document folder

An external crawler renames a document folder.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler_rename_folder** | [**CmExternalCrawlerRenameFolder**](CmExternalCrawlerRenameFolder.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## crawler_update_delta_token

> crate::models::JsonMessage crawler_update_delta_token(cm_external_crawler_set_delta_token, api_version)
Update delta token

An external crawler updates a delta-token.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler_set_delta_token** | [**CmExternalCrawlerSetDeltaToken**](CmExternalCrawlerSetDeltaToken.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete

> crate::models::JsonMessage delete(organisation_id, kb_id, session_id, source_id, api_version)
Delete source

Remove a source and all its content by its source-id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**source_id** | **i32** | the crawler's id | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_documents

> crate::models::CmSource delete_documents(organisation_id, kb_id, session_id, source_id, api_version)
Delete source's documents

Remove a source's documents and stop the crawler if it's running.  Return an updated sources.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**source_id** | **i32** | the crawler's id | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## encrypted_communications

> crate::models::JsonMessage encrypted_communications(seed, body, api_version)
Secure Communication

Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**seed** | **i32** | a random integer used for the communications | [required] |
**body** | **String** |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## external_crawler

> crate::models::CmSource external_crawler(cm_external_crawler, api_version)
External Crawler

Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler** | [**CmExternalCrawler**](CmExternalCrawler.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## external_crawler_finished

> crate::models::JsonMessage external_crawler_finished(cm_external_crawler_stop, api_version)
Stop External Crawler

An external crawler notifies SimSage it has finished its job, its run through the data once.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler_stop** | [**CmExternalCrawlerStop**](CmExternalCrawlerStop.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## external_crawler_start

> crate::models::JsonMessage external_crawler_start(cm_external_crawler_start, api_version)
Start External Crawler

An external crawler notifies SimSage is it starting a new run.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_external_crawler_start** | [**CmExternalCrawlerStart**](CmExternalCrawlerStart.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_crawler

> crate::models::CmSource get_crawler(organisation_id, kb_id, source_id, session_id, api_version)
Get source

Return the data-structure for a source by id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**source_id** | **i32** | the crawler's id | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_failed_documents

> Vec<crate::models::CmSource> get_failed_documents(session_id, organisation_id, kb_id, source_id, page, page_size, api_version)
Get source List

Get a list of failed documents for a source.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**source_id** | **String** | the source  id (a number) | [required] |
**page** | **i32** | the page number for the list | [required] |
**page_size** | **i32** | the page size for the list | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmSource>**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_source_list

> Vec<crate::models::CmSource> get_source_list(session_id, organisation_id, kb_id, api_version)
Get source List

Get a list of sources for a given organisation / knowledge base.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**Vec<crate::models::CmSource>**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## oidc_code

> oidc_code(oidc_key, all_request_params)
OIDC code receiver

used for OIDC systems to receive codes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**oidc_key** | **String** | the Dropbox OIDC key | [required] |
**all_request_params** | [**::std::collections::HashMap<String, String>**](String.md) |  | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## process_all_files

> crate::models::JsonMessage process_all_files(session_id, cm_start_crawler, api_version)
Process all files of crawler/source

Start and force processing all files for a crawler/source

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_start_crawler** | [**CmStartCrawler**](CmStartCrawler.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reset_source_delta

> crate::models::CmSource reset_source_delta(session_id, organisation_id, kb_id, source_id, api_version)
Reset Source delta-token

reset a SimSage source's delta token.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**source_id** | **i32** | the crawler's id | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## start_crawler

> crate::models::JsonMessage start_crawler(session_id, cm_start_crawler, api_version)
Start crawler

Start a crawler by source-id if after it has stopped.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_start_crawler** | [**CmStartCrawler**](CmStartCrawler.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## test_crawler

> crate::models::JsonMessage test_crawler(session_id, organisation_id, kb_id, source_id, api_version)
Test Crawler

Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**kb_id** | **String** | the knowledge-base's id (a guid) | [required] |
**source_id** | **i32** | the crawler's id | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_crawler

> crate::models::CmSource update_crawler(session_id, cm_source, api_version)
Update Source

Save (create or update) a SimSage source.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_source** | [**CmSource**](CmSource.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::CmSource**](CMSource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version6

> crate::models::CmVersion version6()
Version

Get the version of SimSage crawler-services.

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

