# CMQueueItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**process_id** | **str** |  | 
**project_id** | **str** |  | 
**task_id** | **str** |  | 
**project_type** | **str** |  | 
**task_type** | **str** |  | 
**task_screen** | **str** |  | 
**project_created** | **datetime** |  | 
**date_task_created** | **datetime** |  | 
**project_title** | **str** |  | 
**task_name** | **str** |  | 
**assigned_user** | **str** |  | 
**potential_users** | **List[str]** |  | 
**excluded_users** | **List[str]** |  | 
**potential_groups** | **List[str]** |  | 
**owns_item** | **bool** |  | 
**can_claim** | **bool** |  | 
**can_release** | **bool** |  | 
**lock_type** | **str** |  | 

## Example

```python
from openapi_client.models.cm_queue_item import CMQueueItem

# TODO update the JSON string below
json = "{}"
# create an instance of CMQueueItem from a JSON string
cm_queue_item_instance = CMQueueItem.from_json(json)
# print the JSON string representation of the object
print CMQueueItem.to_json()

# convert the object into a dict
cm_queue_item_dict = cm_queue_item_instance.to_dict()
# create an instance of CMQueueItem from a dict
cm_queue_item_form_dict = cm_queue_item.from_dict(cm_queue_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


