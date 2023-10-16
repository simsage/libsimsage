# CMSlicedDocumentRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**task_id** | **str** |  | 
**slice_id** | **str** |  | 
**filter** | [**CMSlicedDocumentFilter**](CMSlicedDocumentFilter.md) |  | 

## Example

```python
from openapi_client.models.cm_sliced_document_request import CMSlicedDocumentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CMSlicedDocumentRequest from a JSON string
cm_sliced_document_request_instance = CMSlicedDocumentRequest.from_json(json)
# print the JSON string representation of the object
print CMSlicedDocumentRequest.to_json()

# convert the object into a dict
cm_sliced_document_request_dict = cm_sliced_document_request_instance.to_dict()
# create an instance of CMSlicedDocumentRequest from a dict
cm_sliced_document_request_form_dict = cm_sliced_document_request.from_dict(cm_sliced_document_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


