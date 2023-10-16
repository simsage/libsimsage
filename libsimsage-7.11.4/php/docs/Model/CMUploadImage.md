# # CMUploadImage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **string** | the type of this class, just in case this object is encrypted |
**organisation_id** | **string** | the organisation (its guid id) this image should go into. |
**kb_id** | **string** | the knowledge-base (its guid id) this image should go into. |
**sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. |
**url** | **string** | A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. |
**mime_type** | **string** | The mime-type of this image, must be either image/jpeg or image/png. |
**puid** | **string** | The Pronom Unique ID for this image. |
**data** | **string** | the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. |
**encrypted** | **bool** | Do we need to add transport encryption |
**seed** | **int** | The seed used if encrypted |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
