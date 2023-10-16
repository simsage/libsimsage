# CMSavedSearch

A saved search item for a user.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this history item | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**user_id** | **str** | The user&#39;s id | 
**text** | **str** | the search text | 
**created** | **int** | a unix-timestamp of the creation date-time of this record | 
**top** | **int** | if set, the number of records to return for viewing | 

## Example

```python
from openapi_client.models.cm_saved_search import CMSavedSearch

# TODO update the JSON string below
json = "{}"
# create an instance of CMSavedSearch from a JSON string
cm_saved_search_instance = CMSavedSearch.from_json(json)
# print the JSON string representation of the object
print CMSavedSearch.to_json()

# convert the object into a dict
cm_saved_search_dict = cm_saved_search_instance.to_dict()
# create an instance of CMSavedSearch from a dict
cm_saved_search_form_dict = cm_saved_search.from_dict(cm_saved_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


