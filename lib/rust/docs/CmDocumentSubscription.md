# CmDocumentSubscription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **String** | the knowledge-base id of this context item, a guid-string | 
**user_id** | **String** | the user's id, a guid | 
**source_id** | **i32** | the source-id of the owner of the url | 
**parent_id** | **String** | The parent of a folder or a file (a guid or an empty string for a top-level folder) | 
**object_id** | **String** | Either a file or a folder ID | 
**url** | **String** | The unique URL of a document. | 
**url_id** | **i32** | the internal SimSage id for this url | 
**name** | **String** | The name of the folder or file | 
**is_folder** | **bool** | is this a subscription to a folder or a file? | 
**folder** | Option<**bool**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


