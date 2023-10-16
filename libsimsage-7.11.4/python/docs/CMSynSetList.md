# CMSynSetList

A list of SynSets for returning from SimSage for viewing.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**list** | **str** | A list of CMSynSet items | 
**total_size** | **int** | the number of total SynSet items in your query | 

## Example

```python
from openapi_client.models.cm_syn_set_list import CMSynSetList

# TODO update the JSON string below
json = "{}"
# create an instance of CMSynSetList from a JSON string
cm_syn_set_list_instance = CMSynSetList.from_json(json)
# print the JSON string representation of the object
print CMSynSetList.to_json()

# convert the object into a dict
cm_syn_set_list_dict = cm_syn_set_list_instance.to_dict()
# create an instance of CMSynSetList from a dict
cm_syn_set_list_form_dict = cm_syn_set_list.from_dict(cm_syn_set_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


