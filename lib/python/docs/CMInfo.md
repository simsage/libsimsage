# CMInfo

An Info record contains information for external UI systems wishing to interact with SimSage.  This information is for a single-organisation and contains all the knowledge-bases and their information for this organisation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) | 
**kb_list** | [**List[CMKnowledgeBaseInfo]**](CMKnowledgeBaseInfo.md) | the list of knowledge-base information items that belong to the given organisation. | 

## Example

```python
from openapi_client.models.cm_info import CMInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CMInfo from a JSON string
cm_info_instance = CMInfo.from_json(json)
# print the JSON string representation of the object
print CMInfo.to_json()

# convert the object into a dict
cm_info_dict = cm_info_instance.to_dict()
# create an instance of CMInfo from a dict
cm_info_form_dict = cm_info.from_dict(cm_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


