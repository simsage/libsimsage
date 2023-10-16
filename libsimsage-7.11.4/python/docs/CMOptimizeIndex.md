# CMOptimizeIndex

an optimize indexes object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**optimize_all_indexes** | **bool** | Whether to optimize just the deltas (false) or the full set (true). | 

## Example

```python
from openapi_client.models.cm_optimize_index import CMOptimizeIndex

# TODO update the JSON string below
json = "{}"
# create an instance of CMOptimizeIndex from a JSON string
cm_optimize_index_instance = CMOptimizeIndex.from_json(json)
# print the JSON string representation of the object
print CMOptimizeIndex.to_json()

# convert the object into a dict
cm_optimize_index_dict = cm_optimize_index_instance.to_dict()
# create an instance of CMOptimizeIndex from a dict
cm_optimize_index_form_dict = cm_optimize_index.from_dict(cm_optimize_index_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


