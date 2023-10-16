# CMProjectDefinition


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** |  | [optional] 
**task_id** | **str** |  | [optional] 
**organisation_id** | **str** |  | 
**project_frame** | [**CMProjectFrame**](CMProjectFrame.md) |  | 
**keyed_search_terms** | [**List[CMKeyedSearchTerm]**](CMKeyedSearchTerm.md) |  | [optional] 
**semantic_terms** | [**List[CMSemanticTerm]**](CMSemanticTerm.md) |  | [optional] 
**filters** | [**CMFilter**](CMFilter.md) |  | 
**validation_result** | **Dict[str, bool]** |  | [optional] 

## Example

```python
from openapi_client.models.cm_project_definition import CMProjectDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectDefinition from a JSON string
cm_project_definition_instance = CMProjectDefinition.from_json(json)
# print the JSON string representation of the object
print CMProjectDefinition.to_json()

# convert the object into a dict
cm_project_definition_dict = cm_project_definition_instance.to_dict()
# create an instance of CMProjectDefinition from a dict
cm_project_definition_form_dict = cm_project_definition.from_dict(cm_project_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


