# Org.OpenAPITools.Model.CMDocumentSubscription
the document subscription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the main organisation (its guid id) for this source/crawler | 
**KbId** | **string** | the knowledge-base id of this context item, a guid-string | 
**UserId** | **string** | the user&#39;s id, a guid | 
**SourceId** | **int** | the source-id of the owner of the url | 
**ParentId** | **string** | The parent of a folder or a file (a guid or an empty string for a top-level folder) | 
**ObjectId** | **string** | Either a file or a folder ID | 
**Url** | **string** | The unique URL of a document. | 
**UrlId** | **int** | the internal SimSage id for this url | 
**Name** | **string** | The name of the folder or file | 
**IsFolder** | **bool** | is this a subscription to a folder or a file? | 
**Folder** | **bool** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

