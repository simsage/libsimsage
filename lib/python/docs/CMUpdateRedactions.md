# CMUpdateRedactions


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**next_status** | **str** |  | 
**redactions** | [**List[CMLocatedRedaction]**](CMLocatedRedaction.md) |  | 

## Example

```python
from openapi_client.models.cm_update_redactions import CMUpdateRedactions

# TODO update the JSON string below
json = "{}"
# create an instance of CMUpdateRedactions from a JSON string
cm_update_redactions_instance = CMUpdateRedactions.from_json(json)
# print the JSON string representation of the object
print CMUpdateRedactions.to_json()

# convert the object into a dict
cm_update_redactions_dict = cm_update_redactions_instance.to_dict()
# create an instance of CMUpdateRedactions from a dict
cm_update_redactions_form_dict = cm_update_redactions.from_dict(cm_update_redactions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


