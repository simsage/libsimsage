# CMSliceReassignment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slice_id** | **str** |  | 
**slice_name** | **str** |  | 
**users** | **List[str]** |  | 

## Example

```python
from openapi_client.models.cm_slice_reassignment import CMSliceReassignment

# TODO update the JSON string below
json = "{}"
# create an instance of CMSliceReassignment from a JSON string
cm_slice_reassignment_instance = CMSliceReassignment.from_json(json)
# print the JSON string representation of the object
print CMSliceReassignment.to_json()

# convert the object into a dict
cm_slice_reassignment_dict = cm_slice_reassignment_instance.to_dict()
# create an instance of CMSliceReassignment from a dict
cm_slice_reassignment_form_dict = cm_slice_reassignment.from_dict(cm_slice_reassignment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


