# CMSynonymsPaginated

a synonym paginated filter object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**prev_id** | **int** | pagination control, the last synonym we looked for previously | [optional] 
**page_size** | **int** | the number of synonyms to return at a time. | 
**filter** | **str** | An optional string filter to apply to all synonyms in the search.  Can be empty in which case SimSage will return all synonyms paginated. | 

## Example

```python
from openapi_client.models.cm_synonyms_paginated import CMSynonymsPaginated

# TODO update the JSON string below
json = "{}"
# create an instance of CMSynonymsPaginated from a JSON string
cm_synonyms_paginated_instance = CMSynonymsPaginated.from_json(json)
# print the JSON string representation of the object
print CMSynonymsPaginated.to_json()

# convert the object into a dict
cm_synonyms_paginated_dict = cm_synonyms_paginated_instance.to_dict()
# create an instance of CMSynonymsPaginated from a dict
cm_synonyms_paginated_form_dict = cm_synonyms_paginated.from_dict(cm_synonyms_paginated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


