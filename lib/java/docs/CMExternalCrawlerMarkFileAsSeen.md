

# CMExternalCrawlerMarkFileAsSeen

An mark-file-as-seen object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** | the type of this class, just in case this object is encrypted |  |
|**organisationId** | **String** | the main organisation (its guid id) for this source/crawler |  |
|**kbId** | **String** | the knowledge-base id of this context item, a guid-string |  |
|**sid** | **String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) |  |
|**asset** | [**Asset**](Asset.md) |  |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |



