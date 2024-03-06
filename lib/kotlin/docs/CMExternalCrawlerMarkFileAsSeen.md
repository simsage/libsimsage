
# CMExternalCrawlerMarkFileAsSeen

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objectType** | **kotlin.String** | the type of this class, just in case this object is encrypted | 
**organisationId** | **kotlin.String** | the main organisation (its guid id) for this source/crawler | 
**kbId** | **kotlin.String** | the knowledge-base id of this context item, a guid-string | 
**sid** | **kotlin.String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**sourceId** | **kotlin.Int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**asset** | [**Asset**](Asset.md) |  | 
**encrypted** | **kotlin.Boolean** | Do we need to add transport encryption | 
**seed** | **kotlin.Int** | The seed used if encrypted | 



