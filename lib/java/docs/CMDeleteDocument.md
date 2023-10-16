

# CMDeleteDocument

An external document delete object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id) this document is to be deleted for. |  |
|**kbId** | **String** | the knowledge-base (its guid id) this document is to be deleted for. |  |
|**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) this document belongs to. |  |
|**url** | **String** | A unique URL for this document. |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |



