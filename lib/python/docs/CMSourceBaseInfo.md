# CMSourceBaseInfo

Source base-info represents information needed by external UI systems interacting with SimSage.  This object has information pertaining to a source in SimSage.  Its name, id, what sort of a source it is, and what sort of security integration (if any) this source has.  This object is contained inside a CMKnowledgeBaseInfo object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | the name of this source | 
**source_id** | **int** | the id of this source | 
**source_type** | **str** | the type of this source | 
**custom_render** | **bool** | Does this source require custom render templates or use ordinary search-results? | 

## Example

```python
from openapi_client.models.cm_source_base_info import CMSourceBaseInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CMSourceBaseInfo from a JSON string
cm_source_base_info_instance = CMSourceBaseInfo.from_json(json)
# print the JSON string representation of the object
print CMSourceBaseInfo.to_json()

# convert the object into a dict
cm_source_base_info_dict = cm_source_base_info_instance.to_dict()
# create an instance of CMSourceBaseInfo from a dict
cm_source_base_info_form_dict = cm_source_base_info.from_dict(cm_source_base_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


