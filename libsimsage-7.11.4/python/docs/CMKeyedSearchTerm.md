# CMKeyedSearchTerm


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**redact** | **bool** |  | 
**redaction_disabled** | **bool** |  | 
**row_required** | **bool** |  | 
**search** | **bool** |  | 
**search_disabled** | **bool** |  | 
**value** | **str** |  | 
**sub_terms** | [**List[CMSearchSubTerm]**](CMSearchSubTerm.md) |  | 

## Example

```python
from openapi_client.models.cm_keyed_search_term import CMKeyedSearchTerm

# TODO update the JSON string below
json = "{}"
# create an instance of CMKeyedSearchTerm from a JSON string
cm_keyed_search_term_instance = CMKeyedSearchTerm.from_json(json)
# print the JSON string representation of the object
print CMKeyedSearchTerm.to_json()

# convert the object into a dict
cm_keyed_search_term_dict = cm_keyed_search_term_instance.to_dict()
# create an instance of CMKeyedSearchTerm from a dict
cm_keyed_search_term_form_dict = cm_keyed_search_term.from_dict(cm_keyed_search_term_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


