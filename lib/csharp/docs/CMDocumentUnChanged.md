# Org.OpenAPITools.Model.CMDocumentUnChanged
An external document representation object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id) this document should go into. | 
**KbId** | **string** | the knowledge-base (its guid id) this document should go into. | 
**Sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**SourceId** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. | 
**Url** | **string** | A unique URL for this document. | 
**RunId** | **string** | the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

