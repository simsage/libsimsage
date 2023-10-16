# CMCategorizationPaginatedList

A categorization pagination list.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base (its guid id) | 
**categorization_list** | [**List[CMCategorization]**](CMCategorization.md) | a list of categorizations, paginated | 
**total_categorization_count** | **int** | the total number of categorizations in SimSage for this org/kb | 

## Example

```python
from openapi_client.models.cm_categorization_paginated_list import CMCategorizationPaginatedList

# TODO update the JSON string below
json = "{}"
# create an instance of CMCategorizationPaginatedList from a JSON string
cm_categorization_paginated_list_instance = CMCategorizationPaginatedList.from_json(json)
# print the JSON string representation of the object
print CMCategorizationPaginatedList.to_json()

# convert the object into a dict
cm_categorization_paginated_list_dict = cm_categorization_paginated_list_instance.to_dict()
# create an instance of CMCategorizationPaginatedList from a dict
cm_categorization_paginated_list_form_dict = cm_categorization_paginated_list.from_dict(cm_categorization_paginated_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


