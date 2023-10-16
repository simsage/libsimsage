# CMSemantic

A SimSAge semantic.  A semantic is an 'is-a' relationship.  A generalization/specialization relationship.  The 'word' (the more specialized part) is the primary-key/id of this relationship.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**word** | **str** | The word of a semantic is the more specific concept (eg. in &#39;John is a person&#39;, then &#39;John&#39; is the more specific concept, and &#39;person&#39; is the semantic). | 
**semantic** | **str** | The semantic is the more general concept (eg. in &#39;John is a person&#39;, &#39;person&#39; is the more general concept, and &#39;John&#39; is more specific). | 

## Example

```python
from openapi_client.models.cm_semantic import CMSemantic

# TODO update the JSON string below
json = "{}"
# create an instance of CMSemantic from a JSON string
cm_semantic_instance = CMSemantic.from_json(json)
# print the JSON string representation of the object
print CMSemantic.to_json()

# convert the object into a dict
cm_semantic_dict = cm_semantic_instance.to_dict()
# create an instance of CMSemantic from a dict
cm_semantic_form_dict = cm_semantic.from_dict(cm_semantic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


