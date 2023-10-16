# CMChangeTaskPhase


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**task_id** | **str** |  | 
**new_phase** | **str** |  | 
**result** | **Dict[str, object]** |  | 

## Example

```python
from openapi_client.models.cm_change_task_phase import CMChangeTaskPhase

# TODO update the JSON string below
json = "{}"
# create an instance of CMChangeTaskPhase from a JSON string
cm_change_task_phase_instance = CMChangeTaskPhase.from_json(json)
# print the JSON string representation of the object
print CMChangeTaskPhase.to_json()

# convert the object into a dict
cm_change_task_phase_dict = cm_change_task_phase_instance.to_dict()
# create an instance of CMChangeTaskPhase from a dict
cm_change_task_phase_form_dict = cm_change_task_phase.from_dict(cm_change_task_phase_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


