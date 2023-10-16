# CMSearchDefinition


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyed_queries** | [**List[CMSearchTerm]**](CMSearchTerm.md) |  | 
**semantic_term_queries** | [**List[CMSearchTerm]**](CMSearchTerm.md) |  | 

## Example

```python
from openapi_client.models.cm_search_definition import CMSearchDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of CMSearchDefinition from a JSON string
cm_search_definition_instance = CMSearchDefinition.from_json(json)
# print the JSON string representation of the object
print CMSearchDefinition.to_json()

# convert the object into a dict
cm_search_definition_dict = cm_search_definition_instance.to_dict()
# create an instance of CMSearchDefinition from a dict
cm_search_definition_form_dict = cm_search_definition.from_dict(cm_search_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


