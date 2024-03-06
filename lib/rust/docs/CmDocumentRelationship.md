# CmDocumentRelationship

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url_id** | **i32** | the url-id of this document | 
**is_child** | **bool** | if true, this is a child relationship, otherwise a parent relationship | 
**related_url_id** | **i32** | the related document's id | 
**related_url** | **String** | the url of the related document | 
**web_url** | **String** | the web-url (if set) if there is a web-link for this document | 
**title** | **String** | the title of the related document for display | 
**binary_size** | **i64** | size in bytes of the related document | 
**document_type** | **String** | the type of the related document | 
**created** | **i64** | The unix creation date-time of the related item | 
**last_modified** | **i64** | The unix last-modified date-time of the related item | 
**child** | Option<**bool**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


