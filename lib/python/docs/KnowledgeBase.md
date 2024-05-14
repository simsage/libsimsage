# KnowledgeBase


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kb_id** | **str** |  | 
**organisation_id** | **str** |  | 
**name** | **str** |  | 
**email** | **str** |  | 
**security_id** | **str** |  | 
**created** | **int** |  | 
**max_queries_per_day** | **int** |  | 
**analytics_window_in_months** | **int** |  | 
**enabled** | **bool** |  | 
**operator_enabled** | **bool** |  | 
**capacity_warnings** | **bool** |  | 
**index_schedule** | **str** |  | 
**last_index_optimization_time** | **int** |  | 
**project_kb** | **bool** |  | 
**is_optimizing** | **bool** |  | 
**optimization_progress** | **int** |  | 
**optimizing** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.knowledge_base import KnowledgeBase

# TODO update the JSON string below
json = "{}"
# create an instance of KnowledgeBase from a JSON string
knowledge_base_instance = KnowledgeBase.from_json(json)
# print the JSON string representation of the object
print KnowledgeBase.to_json()

# convert the object into a dict
knowledge_base_dict = knowledge_base_instance.to_dict()
# create an instance of KnowledgeBase from a dict
knowledge_base_form_dict = knowledge_base.from_dict(knowledge_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


