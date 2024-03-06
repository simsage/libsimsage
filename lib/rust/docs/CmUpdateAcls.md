# CmUpdateAcls

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **String** | the knowledge-base id of this context item, a guid-string | 
**source_id** | **i32** | the source-id of the owner of the url | 
**parent_id** | **String** | the parent id of the update to update | 
**object_id** | **String** | the id of the update to update | 
**item_type** | **String** | the type of item to update, one of source, file or folder | 
**acls** | [**Vec<crate::models::CmDocumentAcl>**](CMDocumentAcl.md) | the initial ACLs for this source-folder. | 
**apply_to_children** | **bool** | apply these ACLs to any children of this object? | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


