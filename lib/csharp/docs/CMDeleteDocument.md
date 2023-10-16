# Org.OpenAPITools.Model.CMDeleteDocument
An external document delete object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id) this document is to be deleted for. | 
**KbId** | **string** | the knowledge-base (its guid id) this document is to be deleted for. | 
**Sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**SourceId** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document belongs to. | 
**Url** | **string** | A unique URL for this document. | 
**Encrypted** | **bool** | Do we need to add transport encryption | 
**Seed** | **int** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

