# CMSynonym

the synonym object to update or create.  If it has no id, it will be created, otherwise SimSage will use it's id to find it and update it.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | A unique id for this synonym, an integer | 
**words** | **str** | A csv list of words (per word with spaces and hyphens allowed) forming the synonyms | 

## Example

```python
from openapi_client.models.cm_synonym import CMSynonym

# TODO update the JSON string below
json = "{}"
# create an instance of CMSynonym from a JSON string
cm_synonym_instance = CMSynonym.from_json(json)
# print the JSON string representation of the object
print CMSynonym.to_json()

# convert the object into a dict
cm_synonym_dict = cm_synonym_instance.to_dict()
# create an instance of CMSynonym from a dict
cm_synonym_form_dict = cm_synonym.from_dict(cm_synonym_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


