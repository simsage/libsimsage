# CMUpdateDocumentSet


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_details** | [**GdprProject**](GdprProject.md) |  | 
**job_id** | **str** |  | 
**return_address** | **str** |  | 
**error_str** | **str** |  | 
**time_out** | **int** |  | 
**var_async** | **bool** |  | 
**is_return_result** | **bool** |  | 
**return_result** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_update_document_set import CMUpdateDocumentSet

# TODO update the JSON string below
json = "{}"
# create an instance of CMUpdateDocumentSet from a JSON string
cm_update_document_set_instance = CMUpdateDocumentSet.from_json(json)
# print the JSON string representation of the object
print CMUpdateDocumentSet.to_json()

# convert the object into a dict
cm_update_document_set_dict = cm_update_document_set_instance.to_dict()
# create an instance of CMUpdateDocumentSet from a dict
cm_update_document_set_form_dict = cm_update_document_set.from_dict(cm_update_document_set_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


