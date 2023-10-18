# CMDeleteDocument
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the organisation (its guid id) this document is to be deleted for. | [default to null] |
| **kbId** | **String** | the knowledge-base (its guid id) this document is to be deleted for. | [default to null] |
| **sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | [default to null] |
| **sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) this document belongs to. | [default to null] |
| **url** | **String** | A unique URL for this document. | [default to null] |
| **encrypted** | **Boolean** | Do we need to add transport encryption | [default to null] |
| **seed** | **Integer** | The seed used if encrypted | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

