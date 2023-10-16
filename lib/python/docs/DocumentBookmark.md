# DocumentBookmark


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** |  | 
**source_id** | **int** |  | 
**url** | **str** |  | 
**url_id** | **int** |  | 
**is_folder** | **bool** |  | 
**folder** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.document_bookmark import DocumentBookmark

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentBookmark from a JSON string
document_bookmark_instance = DocumentBookmark.from_json(json)
# print the JSON string representation of the object
print DocumentBookmark.to_json()

# convert the object into a dict
document_bookmark_dict = document_bookmark_instance.to_dict()
# create an instance of DocumentBookmark from a dict
document_bookmark_form_dict = document_bookmark.from_dict(document_bookmark_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


