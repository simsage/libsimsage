# CMPagedProjectDocuments


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** |  | 
**results** | [**List[CMProjectDocument]**](CMProjectDocument.md) |  | 

## Example

```python
from openapi_client.models.cm_paged_project_documents import CMPagedProjectDocuments

# TODO update the JSON string below
json = "{}"
# create an instance of CMPagedProjectDocuments from a JSON string
cm_paged_project_documents_instance = CMPagedProjectDocuments.from_json(json)
# print the JSON string representation of the object
print CMPagedProjectDocuments.to_json()

# convert the object into a dict
cm_paged_project_documents_dict = cm_paged_project_documents_instance.to_dict()
# create an instance of CMPagedProjectDocuments from a dict
cm_paged_project_documents_form_dict = cm_paged_project_documents.from_dict(cm_paged_project_documents_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


