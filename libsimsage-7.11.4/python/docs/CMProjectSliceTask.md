# CMProjectSliceTask


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_info** | [**CMTaskInfo**](CMTaskInfo.md) |  | 
**detail** | [**CMProjectSlice**](CMProjectSlice.md) |  | 

## Example

```python
from openapi_client.models.cm_project_slice_task import CMProjectSliceTask

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectSliceTask from a JSON string
cm_project_slice_task_instance = CMProjectSliceTask.from_json(json)
# print the JSON string representation of the object
print CMProjectSliceTask.to_json()

# convert the object into a dict
cm_project_slice_task_dict = cm_project_slice_task_instance.to_dict()
# create an instance of CMProjectSliceTask from a dict
cm_project_slice_task_form_dict = cm_project_slice_task.from_dict(cm_project_slice_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


