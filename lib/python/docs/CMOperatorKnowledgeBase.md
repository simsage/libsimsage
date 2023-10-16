# CMOperatorKnowledgeBase

An association between a user (with an operator role) and a knowledge-base

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** | the user&#39;s id (its guid id) that is an operator | 
**organisation_id** | **str** | the organisation (its guid id) this operator applies to | 
**kb_id** | **str** | the knowledge-base (its guid id) this operator applies to | 

## Example

```python
from openapi_client.models.cm_operator_knowledge_base import CMOperatorKnowledgeBase

# TODO update the JSON string below
json = "{}"
# create an instance of CMOperatorKnowledgeBase from a JSON string
cm_operator_knowledge_base_instance = CMOperatorKnowledgeBase.from_json(json)
# print the JSON string representation of the object
print CMOperatorKnowledgeBase.to_json()

# convert the object into a dict
cm_operator_knowledge_base_dict = cm_operator_knowledge_base_instance.to_dict()
# create an instance of CMOperatorKnowledgeBase from a dict
cm_operator_knowledge_base_form_dict = cm_operator_knowledge_base.from_dict(cm_operator_knowledge_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


