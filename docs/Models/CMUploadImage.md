# CMUploadImage
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **objectType** | **String** | the type of this class, just in case this object is encrypted | [default to null] |
| **organisationId** | **String** | the organisation (its guid id) this image should go into. | [default to null] |
| **kbId** | **String** | the knowledge-base (its guid id) this image should go into. | [default to null] |
| **sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | [default to null] |
| **sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. | [default to null] |
| **url** | **String** | A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. | [default to null] |
| **mimeType** | **String** | The mime-type of this image, must be either image/jpeg or image/png. | [default to null] |
| **puid** | **String** | The Pronom Unique ID for this image. | [default to null] |
| **data** | **String** | the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. | [default to null] |
| **encrypted** | **Boolean** | Do we need to add transport encryption | [default to null] |
| **seed** | **Integer** | The seed used if encrypted | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

