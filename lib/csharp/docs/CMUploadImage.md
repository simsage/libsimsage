# Org.OpenAPITools.Model.CMUploadImage
An external image representation object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ObjectType** | **string** | the type of this class, just in case this object is encrypted | 
**OrganisationId** | **string** | the organisation (its guid id) this image should go into. | 
**KbId** | **string** | the knowledge-base (its guid id) this image should go into. | 
**Sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**SourceId** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. | 
**Url** | **string** | A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. | 
**MimeType** | **string** | The mime-type of this image, must be either image/jpeg or image/png. | 
**Puid** | **string** | The Pronom Unique ID for this image. | 
**Data** | **string** | the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. | 
**Encrypted** | **bool** | Do we need to add transport encryption | 
**Seed** | **int** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

