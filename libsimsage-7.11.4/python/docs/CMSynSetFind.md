# CMSynSetFind

a SynSet find object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base (its guid id). | 
**page** | **int** | pagination control, the page to get (starting at zero (0)) | 
**page_size** | **int** | The number of results to return maximum | 
**filter** | **str** | the synset(s) to look for | 

## Example

```python
from openapi_client.models.cm_syn_set_find import CMSynSetFind

# TODO update the JSON string below
json = "{}"
# create an instance of CMSynSetFind from a JSON string
cm_syn_set_find_instance = CMSynSetFind.from_json(json)
# print the JSON string representation of the object
print CMSynSetFind.to_json()

# convert the object into a dict
cm_syn_set_find_dict = cm_syn_set_find_instance.to_dict()
# create an instance of CMSynSetFind from a dict
cm_syn_set_find_form_dict = cm_syn_set_find.from_dict(cm_syn_set_find_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


