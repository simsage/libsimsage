
# CMDocumentUnChanged

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the organisation (its guid id) this document should go into. | 
**kbId** | **kotlin.String** | the knowledge-base (its guid id) this document should go into. | 
**sid** | **kotlin.String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**sourceId** | **kotlin.Int** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. | 
**url** | **kotlin.String** | A unique URL for this document. | 
**runId** | **kotlin.String** | the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. | 



