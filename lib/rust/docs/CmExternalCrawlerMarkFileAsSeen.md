# CmExternalCrawlerMarkFileAsSeen

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **String** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **String** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **String** | the knowledge-base id of this context item, a guid-string | 
**sid** | **String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) | 
**asset** | [**crate::models::Asset**](Asset.md) |  | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **i32** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


