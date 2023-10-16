# OperatorKnowledgeBase


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** |  | 
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 

## Example

```python
from openapi_client.models.operator_knowledge_base import OperatorKnowledgeBase

# TODO update the JSON string below
json = "{}"
# create an instance of OperatorKnowledgeBase from a JSON string
operator_knowledge_base_instance = OperatorKnowledgeBase.from_json(json)
# print the JSON string representation of the object
print OperatorKnowledgeBase.to_json()

# convert the object into a dict
operator_knowledge_base_dict = operator_knowledge_base_instance.to_dict()
# create an instance of OperatorKnowledgeBase from a dict
operator_knowledge_base_form_dict = operator_knowledge_base.from_dict(operator_knowledge_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


