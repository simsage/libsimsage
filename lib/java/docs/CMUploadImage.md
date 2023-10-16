

# CMUploadImage

An external image representation object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** | the type of this class, just in case this object is encrypted |  |
|**organisationId** | **String** | the organisation (its guid id) this image should go into. |  |
|**kbId** | **String** | the knowledge-base (its guid id) this image should go into. |  |
|**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. |  |
|**url** | **String** | A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. |  |
|**mimeType** | **String** | The mime-type of this image, must be either image/jpeg or image/png. |  |
|**puid** | **String** | The Pronom Unique ID for this image. |  |
|**data** | **String** | the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |



