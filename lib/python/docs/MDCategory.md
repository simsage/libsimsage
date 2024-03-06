# MDCategory

A SimSage category is a metadata description in SimSage.  This object represents a single piece of categorical data that is uploaded to SimSage from external sources as part of a CMDocumentUpload request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | The SimSage type of category | 
**display** | **str** | A friendly display name for any UI component rendering this component | 
**metadata** | **str** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. | 
**string_value_list** | **str** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**number_value_list** | **str** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**sort** | **bool** | Is this category to be sort-able in the UI? | 
**order** | **int** | What order does this item have in the UI display? | 
**sort_default** | **str** | Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. | 
**sort_asc_text** | **str** | If sortable, what label should the UI display for ascending sort? | 
**sort_desc_text** | **str** | If sortable, what label should the UI display for descending sort? | 

## Example

```python
from openapi_client.models.md_category import MDCategory

# TODO update the JSON string below
json = "{}"
# create an instance of MDCategory from a JSON string
md_category_instance = MDCategory.from_json(json)
# print the JSON string representation of the object
print MDCategory.to_json()

# convert the object into a dict
md_category_dict = md_category_instance.to_dict()
# create an instance of MDCategory from a dict
md_category_form_dict = md_category.from_dict(md_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


