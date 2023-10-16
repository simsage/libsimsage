# CMNextDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**task_id** | **str** |  | 
**slice_id** | **str** |  | 
**included_statuses** | **List[str]** |  | 

## Example

```python
from openapi_client.models.cm_next_document import CMNextDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMNextDocument from a JSON string
cm_next_document_instance = CMNextDocument.from_json(json)
# print the JSON string representation of the object
print CMNextDocument.to_json()

# convert the object into a dict
cm_next_document_dict = cm_next_document_instance.to_dict()
# create an instance of CMNextDocument from a dict
cm_next_document_form_dict = cm_next_document.from_dict(cm_next_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


