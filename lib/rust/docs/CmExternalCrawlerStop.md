# CmExternalCrawlerStop

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **String** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **String** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **String** | the knowledge-base id of this context item, a guid-string | 
**sid** | **String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) | 
**num_errors** | **i32** | the number of errors encountered during the run of this crawler | 
**num_files_seen** | **i64** | the number of files seen during the run of this crawler | 
**run_id** | **i64** | the id (a unix timestamp) of the current 'go through the source once'.  This is a unique per-run identifier. | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **i32** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


