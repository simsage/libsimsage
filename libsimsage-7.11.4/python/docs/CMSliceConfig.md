# CMSliceConfig


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**description** | **str** |  | 
**action** | **str** |  | 
**query** | [**CMSliceConfigQuery**](CMSliceConfigQuery.md) |  | 

## Example

```python
from openapi_client.models.cm_slice_config import CMSliceConfig

# TODO update the JSON string below
json = "{}"
# create an instance of CMSliceConfig from a JSON string
cm_slice_config_instance = CMSliceConfig.from_json(json)
# print the JSON string representation of the object
print CMSliceConfig.to_json()

# convert the object into a dict
cm_slice_config_dict = cm_slice_config_instance.to_dict()
# create an instance of CMSliceConfig from a dict
cm_slice_config_form_dict = cm_slice_config.from_dict(cm_slice_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


