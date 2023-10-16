# CMTextToSearchConversion

a try text-to-search object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**text** | **str** | the text to convert | 
**filter** | **str** | An optional string filter to apply to all text-to-search in the search.  Can be empty in which case SimSage will return all semantics paginated. | 

## Example

```python
from openapi_client.models.cm_text_to_search_conversion import CMTextToSearchConversion

# TODO update the JSON string below
json = "{}"
# create an instance of CMTextToSearchConversion from a JSON string
cm_text_to_search_conversion_instance = CMTextToSearchConversion.from_json(json)
# print the JSON string representation of the object
print CMTextToSearchConversion.to_json()

# convert the object into a dict
cm_text_to_search_conversion_dict = cm_text_to_search_conversion_instance.to_dict()
# create an instance of CMTextToSearchConversion from a dict
cm_text_to_search_conversion_form_dict = cm_text_to_search_conversion.from_dict(cm_text_to_search_conversion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


