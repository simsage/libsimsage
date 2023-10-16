# CMSemanticsPaginated

A semantic pagination object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**prev_word** | **str** | pagination control, the last semantic word we looked for previously | 
**page_size** | **int** | the number of semantics to return at a time. | 
**filter** | **str** | An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated. | 

## Example

```python
from openapi_client.models.cm_semantics_paginated import CMSemanticsPaginated

# TODO update the JSON string below
json = "{}"
# create an instance of CMSemanticsPaginated from a JSON string
cm_semantics_paginated_instance = CMSemanticsPaginated.from_json(json)
# print the JSON string representation of the object
print CMSemanticsPaginated.to_json()

# convert the object into a dict
cm_semantics_paginated_dict = cm_semantics_paginated_instance.to_dict()
# create an instance of CMSemanticsPaginated from a dict
cm_semantics_paginated_form_dict = cm_semantics_paginated.from_dict(cm_semantics_paginated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


