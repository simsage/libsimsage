# CMSemanticTerm


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**redact** | **bool** |  | 
**redaction_disabled** | **bool** |  | 
**search** | **bool** |  | 
**search_disabled** | **bool** |  | 
**caption** | **str** |  | 

## Example

```python
from openapi_client.models.cm_semantic_term import CMSemanticTerm

# TODO update the JSON string below
json = "{}"
# create an instance of CMSemanticTerm from a JSON string
cm_semantic_term_instance = CMSemanticTerm.from_json(json)
# print the JSON string representation of the object
print CMSemanticTerm.to_json()

# convert the object into a dict
cm_semantic_term_dict = cm_semantic_term_instance.to_dict()
# create an instance of CMSemanticTerm from a dict
cm_semantic_term_form_dict = cm_semantic_term.from_dict(cm_semantic_term_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


