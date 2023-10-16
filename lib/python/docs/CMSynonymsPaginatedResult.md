# CMSynonymsPaginatedResult

A paginated synonym return list matching a request for the same.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**filter** | **str** | The filter that was used to find these items. | 
**synonym_list** | [**List[CMSynonym]**](CMSynonym.md) | the resulting list of synonyms (return) | 
**num_synonyms** | **int** | the total number of synonyms that matched. | 

## Example

```python
from openapi_client.models.cm_synonyms_paginated_result import CMSynonymsPaginatedResult

# TODO update the JSON string below
json = "{}"
# create an instance of CMSynonymsPaginatedResult from a JSON string
cm_synonyms_paginated_result_instance = CMSynonymsPaginatedResult.from_json(json)
# print the JSON string representation of the object
print CMSynonymsPaginatedResult.to_json()

# convert the object into a dict
cm_synonyms_paginated_result_dict = cm_synonyms_paginated_result_instance.to_dict()
# create an instance of CMSynonymsPaginatedResult from a dict
cm_synonyms_paginated_result_form_dict = cm_synonyms_paginated_result.from_dict(cm_synonyms_paginated_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


