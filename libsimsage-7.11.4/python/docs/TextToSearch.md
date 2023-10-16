# TextToSearch

a list of text-to-search items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | 
**search_part** | **str** |  | 
**match_words** | **List[List[str]]** |  | 

## Example

```python
from openapi_client.models.text_to_search import TextToSearch

# TODO update the JSON string below
json = "{}"
# create an instance of TextToSearch from a JSON string
text_to_search_instance = TextToSearch.from_json(json)
# print the JSON string representation of the object
print TextToSearch.to_json()

# convert the object into a dict
text_to_search_dict = text_to_search_instance.to_dict()
# create an instance of TextToSearch from a dict
text_to_search_form_dict = text_to_search.from_dict(text_to_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


