# CMExternalCrawlerSetDeltaToken
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **objectType** | **String** | the type of this class, just in case this object is encrypted | [default to null] |
| **organisationId** | **String** | the main organisation (its guid id) for this source/crawler | [default to null] |
| **kbId** | **String** | the knowledge-base id of this context item, a guid-string | [default to null] |
| **sid** | **String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | [default to null] |
| **sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) | [default to null] |
| **deltaToken** | **String** | the delta-token to set. | [default to null] |
| **encrypted** | **Boolean** | Do we need to add transport encryption | [default to null] |
| **seed** | **Integer** | The seed used if encrypted | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

