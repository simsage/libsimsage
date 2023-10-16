# Org.OpenAPITools.Model.CMDocumentFolder
A document folder content item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceId** | **int** | the source-id of the owner of this folder | 
**Url** | **string** | The unique URL of a document or folder. | 
**ParentFolderId** | **string** | The id of the parent folder of this folder. | 
**FolderId** | **string** | The id of this folder. | 
**UrlId** | **int** | the internal SimSage id for this url | 
**FolderName** | **string** | the display name of the folder | 
**ItemType** | **string** | the type of folder (crawlerType for sources) | 
**FolderList** | [**List&lt;CMDocumentFolder&gt;**](CMDocumentFolder.md) | the folder items in this folder | 
**FileList** | [**List&lt;CMDocument&gt;**](CMDocument.md) | the files in this folder | 
**Acls** | [**List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | the security permissions for this item | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

