# CMSemanticModelEdit

a semantic update/create object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**word** | **str** | The word of a semantic is the more specific concept (eg. in &#39;John is a person&#39;, then &#39;John&#39; is the more specific concept, and &#39;person&#39; is the semantic). | 
**prev_word** | **str** | The previous value for &#39;word&#39; if this is a semantic changing its word value (update) | 
**semantic** | **str** | The semantic is the more general concept (eg. in &#39;John is a person&#39;, &#39;person&#39; is the more general concept, and &#39;John&#39; is more specific). | 

## Example

```python
from openapi_client.models.cm_semantic_model_edit import CMSemanticModelEdit

# TODO update the JSON string below
json = "{}"
# create an instance of CMSemanticModelEdit from a JSON string
cm_semantic_model_edit_instance = CMSemanticModelEdit.from_json(json)
# print the JSON string representation of the object
print CMSemanticModelEdit.to_json()

# convert the object into a dict
cm_semantic_model_edit_dict = cm_semantic_model_edit_instance.to_dict()
# create an instance of CMSemanticModelEdit from a dict
cm_semantic_model_edit_form_dict = cm_semantic_model_edit.from_dict(cm_semantic_model_edit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


