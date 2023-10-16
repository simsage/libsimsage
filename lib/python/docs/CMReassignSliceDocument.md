# CMReassignSliceDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_id** | **str** |  | 
**organisation_id** | **str** |  | 
**document_key** | **str** |  | 
**new_user_id** | **str** |  | 
**new_slice_id** | **str** |  | 

## Example

```python
from openapi_client.models.cm_reassign_slice_document import CMReassignSliceDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMReassignSliceDocument from a JSON string
cm_reassign_slice_document_instance = CMReassignSliceDocument.from_json(json)
# print the JSON string representation of the object
print CMReassignSliceDocument.to_json()

# convert the object into a dict
cm_reassign_slice_document_dict = cm_reassign_slice_document_instance.to_dict()
# create an instance of CMReassignSliceDocument from a dict
cm_reassign_slice_document_form_dict = cm_reassign_slice_document.from_dict(cm_reassign_slice_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


