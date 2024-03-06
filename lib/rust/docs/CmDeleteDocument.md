# CmDeleteDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) this document is to be deleted for. | 
**kb_id** | **String** | the knowledge-base (its guid id) this document is to be deleted for. | 
**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) this document belongs to. | 
**url** | **String** | A unique URL for this document. | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **i32** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


