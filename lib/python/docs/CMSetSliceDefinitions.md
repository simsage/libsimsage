# CMSetSliceDefinitions


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**task_id** | **str** |  | 
**slices** | [**List[CMSliceConfig]**](CMSliceConfig.md) |  | 

## Example

```python
from openapi_client.models.cm_set_slice_definitions import CMSetSliceDefinitions

# TODO update the JSON string below
json = "{}"
# create an instance of CMSetSliceDefinitions from a JSON string
cm_set_slice_definitions_instance = CMSetSliceDefinitions.from_json(json)
# print the JSON string representation of the object
print CMSetSliceDefinitions.to_json()

# convert the object into a dict
cm_set_slice_definitions_dict = cm_set_slice_definitions_instance.to_dict()
# create an instance of CMSetSliceDefinitions from a dict
cm_set_slice_definitions_form_dict = cm_set_slice_definitions.from_dict(cm_set_slice_definitions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


