# CMRedactionData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_id** | **str** |  | 
**url** | **str** |  | 
**redactions** | [**List[CMRedaction]**](CMRedaction.md) |  | 
**document_status** | **str** |  | 
**document_action** | **str** |  | 
**annotated** | **bool** |  | 
**create_for_export** | **bool** |  | 
**export_native_format** | **bool** |  | 

## Example

```python
from openapi_client.models.cm_redaction_data import CMRedactionData

# TODO update the JSON string below
json = "{}"
# create an instance of CMRedactionData from a JSON string
cm_redaction_data_instance = CMRedactionData.from_json(json)
# print the JSON string representation of the object
print CMRedactionData.to_json()

# convert the object into a dict
cm_redaction_data_dict = cm_redaction_data_instance.to_dict()
# create an instance of CMRedactionData from a dict
cm_redaction_data_form_dict = cm_redaction_data.from_dict(cm_redaction_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


