

# CMDocumentFolder

A document folder content item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **Integer** | the source-id of the owner of this folder |  |
|**url** | **String** | The unique URL of a document or folder. |  |
|**parentFolderId** | **String** | The id of the parent folder of this folder. |  |
|**folderId** | **String** | The id of this folder. |  |
|**urlId** | **Integer** | the internal SimSage id for this url |  |
|**folderName** | **String** | the display name of the folder |  |
|**itemType** | **String** | the type of folder (crawlerType for sources) |  |
|**folderList** | [**List&lt;CMDocumentFolder&gt;**](CMDocumentFolder.md) | the folder items in this folder |  |
|**fileList** | [**List&lt;CMDocument&gt;**](CMDocument.md) | the files in this folder |  |
|**acls** | [**List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | the security permissions for this item |  |



