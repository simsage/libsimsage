# CMProjectDefinitionTask


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_info** | [**CMTaskInfo**](CMTaskInfo.md) |  | 
**detail** | [**CMProjectDefinition**](CMProjectDefinition.md) |  | 

## Example

```python
from openapi_client.models.cm_project_definition_task import CMProjectDefinitionTask

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectDefinitionTask from a JSON string
cm_project_definition_task_instance = CMProjectDefinitionTask.from_json(json)
# print the JSON string representation of the object
print CMProjectDefinitionTask.to_json()

# convert the object into a dict
cm_project_definition_task_dict = cm_project_definition_task_instance.to_dict()
# create an instance of CMProjectDefinitionTask from a dict
cm_project_definition_task_form_dict = cm_project_definition_task.from_dict(cm_project_definition_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


