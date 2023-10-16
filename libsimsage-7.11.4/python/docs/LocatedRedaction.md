# LocatedRedaction


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**redaction_type** | **str** |  | 
**query_id** | **int** |  | [optional] 
**redaction_key** | **str** |  | [optional] 
**word** | **str** |  | [optional] 
**is_redacted** | **bool** |  | 
**page** | **int** |  | 
**left** | **float** |  | 
**bottom** | **float** |  | 
**width** | **float** |  | 
**height** | **float** |  | 

## Example

```python
from openapi_client.models.located_redaction import LocatedRedaction

# TODO update the JSON string below
json = "{}"
# create an instance of LocatedRedaction from a JSON string
located_redaction_instance = LocatedRedaction.from_json(json)
# print the JSON string representation of the object
print LocatedRedaction.to_json()

# convert the object into a dict
located_redaction_dict = located_redaction_instance.to_dict()
# create an instance of LocatedRedaction from a dict
located_redaction_form_dict = located_redaction.from_dict(located_redaction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


