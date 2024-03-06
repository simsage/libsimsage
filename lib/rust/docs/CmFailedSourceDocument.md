# CmFailedSourceDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **String** | the knowledge-base id (its guid id) for this source/crawler | 
**source_id** | **i32** | the source-id, primary key of the source | 
**source_system_id** | **String** | the unique id of the document in the source system, mostly same as web url | 
**web_url** | **String** | the web url to access the document, can be different from url | 
**run_id** | **i64** | the timestamp of the crawler run adding the exception | 
**error_message** | **String** | the error message added by the system | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **i32** | The seed used if encrypted | 
**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


