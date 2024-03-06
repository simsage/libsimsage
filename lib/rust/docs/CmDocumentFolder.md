# CmDocumentFolder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_id** | **i32** | the source-id of the owner of this folder | 
**url** | **String** | The unique URL of a document or folder. | 
**parent_folder_id** | **String** | The id of the parent folder of this folder. | 
**folder_id** | **String** | The id of this folder. | 
**url_id** | **i32** | the internal SimSage id for this url | 
**folder_name** | **String** | the display name of the folder | 
**item_type** | **String** | the type of folder (crawlerType for sources) | 
**folder_list** | [**Vec<crate::models::CmDocumentFolder>**](CMDocumentFolder.md) | the folder items in this folder | 
**file_list** | [**Vec<crate::models::CmDocument>**](CMDocument.md) | the files in this folder | 
**acls** | [**Vec<crate::models::CmDocumentAcl>**](CMDocumentAcl.md) | the security permissions for this item | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


