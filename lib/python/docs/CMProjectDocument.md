# CMProjectDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** |  | 
**source** | **str** |  | 
**extension** | **str** |  | 
**document_key** | **str** |  | 
**title** | **str** |  | 
**size** | **int** |  | 
**folder_id** | **str** |  | 
**count** | **int** |  | 
**confidence** | **int** |  | 
**display_type** | **str** |  | 

## Example

```python
from openapi_client.models.cm_project_document import CMProjectDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectDocument from a JSON string
cm_project_document_instance = CMProjectDocument.from_json(json)
# print the JSON string representation of the object
print CMProjectDocument.to_json()

# convert the object into a dict
cm_project_document_dict = cm_project_document_instance.to_dict()
# create an instance of CMProjectDocument from a dict
cm_project_document_form_dict = cm_project_document.from_dict(cm_project_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


