# CMResultsSection


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query_tokens** | [**List[CMQueryToken]**](CMQueryToken.md) |  | 
**caption** | **str** |  | 
**has_sub_terms** | **bool** |  | 
**count** | **int** |  | 

## Example

```python
from openapi_client.models.cm_results_section import CMResultsSection

# TODO update the JSON string below
json = "{}"
# create an instance of CMResultsSection from a JSON string
cm_results_section_instance = CMResultsSection.from_json(json)
# print the JSON string representation of the object
print CMResultsSection.to_json()

# convert the object into a dict
cm_results_section_dict = cm_results_section_instance.to_dict()
# create an instance of CMResultsSection from a dict
cm_results_section_form_dict = cm_results_section.from_dict(cm_results_section_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


