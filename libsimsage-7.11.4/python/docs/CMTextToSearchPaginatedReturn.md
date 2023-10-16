# CMTextToSearchPaginatedReturn

A set of paginated text-to-search objects for a given organisation/knowledge-base with a total count.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text_to_search_list** | [**List[TextToSearch]**](TextToSearch.md) | a list of text-to-search items | 
**num_text_to_search** | **int** | the total number of text-to-search items | 

## Example

```python
from openapi_client.models.cm_text_to_search_paginated_return import CMTextToSearchPaginatedReturn

# TODO update the JSON string below
json = "{}"
# create an instance of CMTextToSearchPaginatedReturn from a JSON string
cm_text_to_search_paginated_return_instance = CMTextToSearchPaginatedReturn.from_json(json)
# print the JSON string representation of the object
print CMTextToSearchPaginatedReturn.to_json()

# convert the object into a dict
cm_text_to_search_paginated_return_dict = cm_text_to_search_paginated_return_instance.to_dict()
# create an instance of CMTextToSearchPaginatedReturn from a dict
cm_text_to_search_paginated_return_form_dict = cm_text_to_search_paginated_return.from_dict(cm_text_to_search_paginated_return_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


