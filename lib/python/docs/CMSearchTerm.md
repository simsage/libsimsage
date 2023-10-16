# CMSearchTerm


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**caption** | **str** |  | 
**search_usage** | **str** |  | 
**redaction_usage** | **str** |  | 
**default_value** | **str** |  | 
**sub_terms** | [**List[CMSubTerm]**](CMSubTerm.md) |  | 

## Example

```python
from openapi_client.models.cm_search_term import CMSearchTerm

# TODO update the JSON string below
json = "{}"
# create an instance of CMSearchTerm from a JSON string
cm_search_term_instance = CMSearchTerm.from_json(json)
# print the JSON string representation of the object
print CMSearchTerm.to_json()

# convert the object into a dict
cm_search_term_dict = cm_search_term_instance.to_dict()
# create an instance of CMSearchTerm from a dict
cm_search_term_form_dict = cm_search_term.from_dict(cm_search_term_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


