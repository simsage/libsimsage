# CmUploadImage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **String** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **String** | the organisation (its guid id) this image should go into. | 
**kb_id** | **String** | the knowledge-base (its guid id) this image should go into. | 
**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) this image came from. | 
**url** | **String** | A unique URL for this image, this should be the same as the document's URL this image belongs to. | 
**mime_type** | **String** | The mime-type of this image, must be either image/jpeg or image/png. | 
**puid** | **String** | The Pronom Unique ID for this image. | 
**data** | **String** | the base64 encoded content of this image.  Must be prefixed with ';base64,'. | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **i32** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


