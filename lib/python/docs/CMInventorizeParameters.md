# CMInventorizeParameters

an inventory creation object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 

## Example

```python
from openapi_client.models.cm_inventorize_parameters import CMInventorizeParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CMInventorizeParameters from a JSON string
cm_inventorize_parameters_instance = CMInventorizeParameters.from_json(json)
# print the JSON string representation of the object
print CMInventorizeParameters.to_json()

# convert the object into a dict
cm_inventorize_parameters_dict = cm_inventorize_parameters_instance.to_dict()
# create an instance of CMInventorizeParameters from a dict
cm_inventorize_parameters_form_dict = cm_inventorize_parameters.from_dict(cm_inventorize_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


