# CMExportRedactedDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_id** | **str** |  | 
**url** | **str** |  | 
**export_native_format** | **bool** |  | 

## Example

```python
from openapi_client.models.cm_export_redacted_document import CMExportRedactedDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMExportRedactedDocument from a JSON string
cm_export_redacted_document_instance = CMExportRedactedDocument.from_json(json)
# print the JSON string representation of the object
print CMExportRedactedDocument.to_json()

# convert the object into a dict
cm_export_redacted_document_dict = cm_export_redacted_document_instance.to_dict()
# create an instance of CMExportRedactedDocument from a dict
cm_export_redacted_document_form_dict = cm_export_redacted_document.from_dict(cm_export_redacted_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


