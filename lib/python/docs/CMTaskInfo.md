# CMTaskInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_id** | **str** |  | 
**project_id** | **str** |  | 
**organisation_id** | **str** |  | 
**source_kb_id** | **str** |  | 
**crawler_kb_id** | **str** |  | [optional] 
**project_type** | **str** |  | 
**project_title** | **str** |  | 
**project_narrative** | **str** |  | 
**slice_id** | **str** |  | [optional] 
**process_id** | **str** |  | 
**process_name** | **str** |  | 
**task_type** | **str** |  | 
**task_name** | **str** |  | 
**date_created** | **datetime** |  | 
**date_completed** | **datetime** |  | [optional] 
**potential_users** | **str** |  | 
**excluded_users** | **str** |  | 
**potential_groups** | **str** |  | 
**assigned_user** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.cm_task_info import CMTaskInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CMTaskInfo from a JSON string
cm_task_info_instance = CMTaskInfo.from_json(json)
# print the JSON string representation of the object
print CMTaskInfo.to_json()

# convert the object into a dict
cm_task_info_dict = cm_task_info_instance.to_dict()
# create an instance of CMTaskInfo from a dict
cm_task_info_form_dict = cm_task_info.from_dict(cm_task_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


