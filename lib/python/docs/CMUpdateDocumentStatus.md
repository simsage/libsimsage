# CMUpdateDocumentStatus


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**next_status** | **str** |  | 

## Example

```python
from openapi_client.models.cm_update_document_status import CMUpdateDocumentStatus

# TODO update the JSON string below
json = "{}"
# create an instance of CMUpdateDocumentStatus from a JSON string
cm_update_document_status_instance = CMUpdateDocumentStatus.from_json(json)
# print the JSON string representation of the object
print CMUpdateDocumentStatus.to_json()

# convert the object into a dict
cm_update_document_status_dict = cm_update_document_status_instance.to_dict()
# create an instance of CMUpdateDocumentStatus from a dict
cm_update_document_status_form_dict = cm_update_document_status.from_dict(cm_update_document_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


