# CMTextToSearchEdit

a semantic update/create object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**search_type** | **str** | the type, either \&quot;and\&quot; or \&quot;sub\&quot; | 
**search_part** | **str** | the search-part | 
**match_word_csv** | **str** | A list of query matches | 

## Example

```python
from openapi_client.models.cm_text_to_search_edit import CMTextToSearchEdit

# TODO update the JSON string below
json = "{}"
# create an instance of CMTextToSearchEdit from a JSON string
cm_text_to_search_edit_instance = CMTextToSearchEdit.from_json(json)
# print the JSON string representation of the object
print CMTextToSearchEdit.to_json()

# convert the object into a dict
cm_text_to_search_edit_dict = cm_text_to_search_edit_instance.to_dict()
# create an instance of CMTextToSearchEdit from a dict
cm_text_to_search_edit_form_dict = cm_text_to_search_edit.from_dict(cm_text_to_search_edit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


