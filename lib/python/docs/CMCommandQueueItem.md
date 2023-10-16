# CMCommandQueueItem

a progress/status item from the async command queue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** | the job-id, primary key | 
**key** | **str** | the name of the lock | 
**expiry** | **int** | when this lock will expire as a Unix date-time | 

## Example

```python
from openapi_client.models.cm_command_queue_item import CMCommandQueueItem

# TODO update the JSON string below
json = "{}"
# create an instance of CMCommandQueueItem from a JSON string
cm_command_queue_item_instance = CMCommandQueueItem.from_json(json)
# print the JSON string representation of the object
print CMCommandQueueItem.to_json()

# convert the object into a dict
cm_command_queue_item_dict = cm_command_queue_item_instance.to_dict()
# create an instance of CMCommandQueueItem from a dict
cm_command_queue_item_form_dict = cm_command_queue_item.from_dict(cm_command_queue_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


