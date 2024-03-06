

# CMExternalCrawlerRenameFolder

An external image representation object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** | the type of this class, just in case this object is encrypted |  |
|**organisationId** | **String** | the main organisation (its guid id) for this source/crawler |  |
|**kbId** | **String** | the knowledge-base id of this context item, a guid-string |  |
|**sid** | **String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) |  |
|**oldFolderNameUrl** | **String** | the current document-folder name |  |
|**newFolderNameUrl** | **String** | the new document-folder name |  |
|**acls** | **String** | A list of security permission for the new document-folder.  Can be empty (ie. no security applied). |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |



