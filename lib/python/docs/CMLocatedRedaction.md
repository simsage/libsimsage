# CMLocatedRedaction


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**redaction_type** | **str** |  | 
**query_id** | **int** |  | [optional] 
**word** | **str** |  | [optional] 
**redaction_key** | **str** |  | [optional] 
**is_redacted** | **bool** |  | 
**page** | **int** |  | 
**left** | **float** |  | 
**bottom** | **float** |  | 
**width** | **float** |  | 
**height** | **float** |  | 

## Example

```python
from openapi_client.models.cm_located_redaction import CMLocatedRedaction

# TODO update the JSON string below
json = "{}"
# create an instance of CMLocatedRedaction from a JSON string
cm_located_redaction_instance = CMLocatedRedaction.from_json(json)
# print the JSON string representation of the object
print CMLocatedRedaction.to_json()

# convert the object into a dict
cm_located_redaction_dict = cm_located_redaction_instance.to_dict()
# create an instance of CMLocatedRedaction from a dict
cm_located_redaction_form_dict = cm_located_redaction.from_dict(cm_located_redaction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


