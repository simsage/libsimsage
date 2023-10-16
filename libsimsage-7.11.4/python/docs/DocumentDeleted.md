# DocumentDeleted


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_id** | **int** |  | 
**url** | **str** |  | 
**user_id** | **str** |  | 
**deleted** | **int** |  | 

## Example

```python
from openapi_client.models.document_deleted import DocumentDeleted

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentDeleted from a JSON string
document_deleted_instance = DocumentDeleted.from_json(json)
# print the JSON string representation of the object
print DocumentDeleted.to_json()

# convert the object into a dict
document_deleted_dict = document_deleted_instance.to_dict()
# create an instance of DocumentDeleted from a dict
document_deleted_form_dict = document_deleted.from_dict(document_deleted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


