# CMSlicedDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**source** | **str** |  | 
**extension** | **str** |  | 
**document_key** | **str** |  | 
**title** | **str** |  | 
**size** | **int** |  | 
**folder_id** | **str** |  | 
**count** | **int** |  | 
**confidence** | **int** |  | 
**status** | **str** |  | 
**assigned_user** | **str** |  | 
**owns_item** | **bool** |  | 
**can_claim** | **bool** |  | 

## Example

```python
from openapi_client.models.cm_sliced_document import CMSlicedDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMSlicedDocument from a JSON string
cm_sliced_document_instance = CMSlicedDocument.from_json(json)
# print the JSON string representation of the object
print CMSlicedDocument.to_json()

# convert the object into a dict
cm_sliced_document_dict = cm_sliced_document_instance.to_dict()
# create an instance of CMSlicedDocument from a dict
cm_sliced_document_form_dict = cm_sliced_document.from_dict(cm_sliced_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


