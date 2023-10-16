# CMUploadImage

An external image representation object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **str** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **str** | the organisation (its guid id) this image should go into. | 
**kb_id** | **str** | the knowledge-base (its guid id) this image should go into. | 
**sid** | **str** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. | 
**url** | **str** | A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. | 
**mime_type** | **str** | The mime-type of this image, must be either image/jpeg or image/png. | 
**puid** | **str** | The Pronom Unique ID for this image. | 
**data** | **str** | the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **int** | The seed used if encrypted | 

## Example

```python
from openapi_client.models.cm_upload_image import CMUploadImage

# TODO update the JSON string below
json = "{}"
# create an instance of CMUploadImage from a JSON string
cm_upload_image_instance = CMUploadImage.from_json(json)
# print the JSON string representation of the object
print CMUploadImage.to_json()

# convert the object into a dict
cm_upload_image_dict = cm_upload_image_instance.to_dict()
# create an instance of CMUploadImage from a dict
cm_upload_image_form_dict = cm_upload_image.from_dict(cm_upload_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


