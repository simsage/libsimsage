

# CMExternalCrawlerStop

Stop parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** | the type of this class, just in case this object is encrypted |  |
|**organisationId** | **String** | the main organisation (its guid id) for this source/crawler |  |
|**kbId** | **String** | the knowledge-base id of this context item, a guid-string |  |
|**sid** | **String** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) |  |
|**numErrors** | **Integer** | the number of errors encountered during the run of this crawler |  |
|**runId** | **String** | the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |



