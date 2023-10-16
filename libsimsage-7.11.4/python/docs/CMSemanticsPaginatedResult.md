# CMSemanticsPaginatedResult

A paginated semantics return list matching a request for the same.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**filter** | **str** | The filter that was used to find these items. | 
**semantic_list** | [**List[CMSemantic]**](CMSemantic.md) | the resulting list of semantics (return) | 
**num_semantics** | **int** | the total number of semantics that matched. | 

## Example

```python
from openapi_client.models.cm_semantics_paginated_result import CMSemanticsPaginatedResult

# TODO update the JSON string below
json = "{}"
# create an instance of CMSemanticsPaginatedResult from a JSON string
cm_semantics_paginated_result_instance = CMSemanticsPaginatedResult.from_json(json)
# print the JSON string representation of the object
print CMSemanticsPaginatedResult.to_json()

# convert the object into a dict
cm_semantics_paginated_result_dict = cm_semantics_paginated_result_instance.to_dict()
# create an instance of CMSemanticsPaginatedResult from a dict
cm_semantics_paginated_result_form_dict = cm_semantics_paginated_result.from_dict(cm_semantics_paginated_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


