# CMProjectSlice


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**project_id** | **str** |  | 
**name** | **str** |  | 
**description** | **str** |  | 
**action** | **str** |  | 
**reassignment_options** | [**List[CMSliceReassignment]**](CMSliceReassignment.md) |  | 

## Example

```python
from openapi_client.models.cm_project_slice import CMProjectSlice

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectSlice from a JSON string
cm_project_slice_instance = CMProjectSlice.from_json(json)
# print the JSON string representation of the object
print CMProjectSlice.to_json()

# convert the object into a dict
cm_project_slice_dict = cm_project_slice_instance.to_dict()
# create an instance of CMProjectSlice from a dict
cm_project_slice_form_dict = cm_project_slice.from_dict(cm_project_slice_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


