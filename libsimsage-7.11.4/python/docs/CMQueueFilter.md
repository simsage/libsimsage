# CMQueueFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**page** | **int** |  | 
**page_size** | **int** |  | 
**sort_direction** | **int** |  | 
**sort_column** | **str** |  | 
**show_all** | **bool** |  | 

## Example

```python
from openapi_client.models.cm_queue_filter import CMQueueFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CMQueueFilter from a JSON string
cm_queue_filter_instance = CMQueueFilter.from_json(json)
# print the JSON string representation of the object
print CMQueueFilter.to_json()

# convert the object into a dict
cm_queue_filter_dict = cm_queue_filter_instance.to_dict()
# create an instance of CMQueueFilter from a dict
cm_queue_filter_form_dict = cm_queue_filter.from_dict(cm_queue_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


