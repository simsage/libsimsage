
# CMDeleteDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the organisation (its guid id) this document is to be deleted for. | 
**kbId** | **kotlin.String** | the knowledge-base (its guid id) this document is to be deleted for. | 
**sid** | **kotlin.String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**sourceId** | **kotlin.Int** | the source-id of this crawler (ie. the crawler&#39;s id) this document belongs to. | 
**url** | **kotlin.String** | A unique URL for this document. | 
**encrypted** | **kotlin.Boolean** | Do we need to add transport encryption | 
**seed** | **kotlin.Int** | The seed used if encrypted | 



