# CmDocumentUnChanged

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) this document should go into. | 
**kb_id** | **String** | the knowledge-base (its guid id) this document should go into. | 
**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) this document came from. | 
**url** | **String** | A unique URL for this document. | 
**run_id** | **String** | the id (a guid) of the current 'go through the source once'.  This is a unique per-run identifier. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


