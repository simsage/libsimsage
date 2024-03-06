
# CMDocumentFolder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceId** | **kotlin.Int** | the source-id of the owner of this folder | 
**url** | **kotlin.String** | The unique URL of a document or folder. | 
**parentFolderId** | **kotlin.String** | The id of the parent folder of this folder. | 
**folderId** | **kotlin.String** | The id of this folder. | 
**urlId** | **kotlin.Int** | the internal SimSage id for this url | 
**folderName** | **kotlin.String** | the display name of the folder | 
**itemType** | **kotlin.String** | the type of folder (crawlerType for sources) | 
**folderList** | [**kotlin.collections.List&lt;CMDocumentFolder&gt;**](CMDocumentFolder.md) | the folder items in this folder | 
**fileList** | [**kotlin.collections.List&lt;CMDocument&gt;**](CMDocument.md) | the files in this folder | 
**acls** | [**kotlin.collections.List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | the security permissions for this item | 



