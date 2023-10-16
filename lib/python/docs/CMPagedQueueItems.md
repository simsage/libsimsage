# CMPagedQueueItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** |  | 
**results** | [**List[CMQueueItem]**](CMQueueItem.md) |  | 

## Example

```python
from openapi_client.models.cm_paged_queue_items import CMPagedQueueItems

# TODO update the JSON string below
json = "{}"
# create an instance of CMPagedQueueItems from a JSON string
cm_paged_queue_items_instance = CMPagedQueueItems.from_json(json)
# print the JSON string representation of the object
print CMPagedQueueItems.to_json()

# convert the object into a dict
cm_paged_queue_items_dict = cm_paged_queue_items_instance.to_dict()
# create an instance of CMPagedQueueItems from a dict
cm_paged_queue_items_form_dict = cm_paged_queue_items.from_dict(cm_paged_queue_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


