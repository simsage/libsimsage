# SearchCategory

Search categories / metadata searching

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sc_type** | **str** |  | 
**category_type** | **str** |  | 
**order** | **int** |  | 
**sort_default** | **str** |  | 
**sort_asc_text** | **str** |  | 
**sort_desc_text** | **str** |  | 
**metadata** | **str** |  | 
**display_name** | **str** |  | 
**sort** | **bool** |  | 
**min_value** | **int** |  | 
**max_value** | **int** |  | 
**items** | [**List[NameCounterLevel]**](NameCounterLevel.md) |  | 

## Example

```python
from openapi_client.models.search_category import SearchCategory

# TODO update the JSON string below
json = "{}"
# create an instance of SearchCategory from a JSON string
search_category_instance = SearchCategory.from_json(json)
# print the JSON string representation of the object
print SearchCategory.to_json()

# convert the object into a dict
search_category_dict = search_category_instance.to_dict()
# create an instance of SearchCategory from a dict
search_category_form_dict = search_category.from_dict(search_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


