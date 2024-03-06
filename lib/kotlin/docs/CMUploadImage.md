
# CMUploadImage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objectType** | **kotlin.String** | the type of this class, just in case this object is encrypted | 
**organisationId** | **kotlin.String** | the organisation (its guid id) this image should go into. | 
**kbId** | **kotlin.String** | the knowledge-base (its guid id) this image should go into. | 
**sid** | **kotlin.String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**sourceId** | **kotlin.Int** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. | 
**url** | **kotlin.String** | A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. | 
**mimeType** | **kotlin.String** | The mime-type of this image, must be either image/jpeg or image/png. | 
**puid** | **kotlin.String** | The Pronom Unique ID for this image. | 
**&#x60;data&#x60;** | **kotlin.String** | the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. | 
**encrypted** | **kotlin.Boolean** | Do we need to add transport encryption | 
**seed** | **kotlin.Int** | The seed used if encrypted | 



