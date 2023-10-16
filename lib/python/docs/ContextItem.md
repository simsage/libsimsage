# ContextItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kb_id** | **str** |  | 
**created** | **int** |  | 
**name_value** | **Dict[str, str]** |  | 
**syn_set_lemma** | **str** |  | 
**syn_set_cloud** | **List[str]** |  | 

## Example

```python
from openapi_client.models.context_item import ContextItem

# TODO update the JSON string below
json = "{}"
# create an instance of ContextItem from a JSON string
context_item_instance = ContextItem.from_json(json)
# print the JSON string representation of the object
print ContextItem.to_json()

# convert the object into a dict
context_item_dict = context_item_instance.to_dict()
# create an instance of ContextItem from a dict
context_item_form_dict = context_item.from_dict(context_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


