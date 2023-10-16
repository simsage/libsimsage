# CMSlicedDocumentFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** |  | 
**page_size** | **int** |  | 
**sort_direction** | **int** |  | 
**sort_column** | **str** |  | 
**statuses** | **List[str]** |  | 
**selected_users** | **List[str]** |  | 
**selected_sources** | **List[str]** |  | 
**selected_confidences** | **List[str]** |  | 

## Example

```python
from openapi_client.models.cm_sliced_document_filter import CMSlicedDocumentFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CMSlicedDocumentFilter from a JSON string
cm_sliced_document_filter_instance = CMSlicedDocumentFilter.from_json(json)
# print the JSON string representation of the object
print CMSlicedDocumentFilter.to_json()

# convert the object into a dict
cm_sliced_document_filter_dict = cm_sliced_document_filter_instance.to_dict()
# create an instance of CMSlicedDocumentFilter from a dict
cm_sliced_document_filter_form_dict = cm_sliced_document_filter.from_dict(cm_sliced_document_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


