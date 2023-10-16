# CMRedaction


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**redaction_type** | **str** |  | 
**type_key** | **str** |  | 
**value** | **str** |  | 
**page** | **int** |  | 
**height** | **float** |  | 
**left** | **float** |  | 
**top** | **float** |  | 
**width** | **float** |  | 

## Example

```python
from openapi_client.models.cm_redaction import CMRedaction

# TODO update the JSON string below
json = "{}"
# create an instance of CMRedaction from a JSON string
cm_redaction_instance = CMRedaction.from_json(json)
# print the JSON string representation of the object
print CMRedaction.to_json()

# convert the object into a dict
cm_redaction_dict = cm_redaction_instance.to_dict()
# create an instance of CMRedaction from a dict
cm_redaction_form_dict = cm_redaction.from_dict(cm_redaction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


