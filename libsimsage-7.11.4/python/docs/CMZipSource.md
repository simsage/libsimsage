# CMZipSource

a zip source model

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base (its guid id) | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 

## Example

```python
from openapi_client.models.cm_zip_source import CMZipSource

# TODO update the JSON string below
json = "{}"
# create an instance of CMZipSource from a JSON string
cm_zip_source_instance = CMZipSource.from_json(json)
# print the JSON string representation of the object
print CMZipSource.to_json()

# convert the object into a dict
cm_zip_source_dict = cm_zip_source_instance.to_dict()
# create an instance of CMZipSource from a dict
cm_zip_source_form_dict = cm_zip_source.from_dict(cm_zip_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


