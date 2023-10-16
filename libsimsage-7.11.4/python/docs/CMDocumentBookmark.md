# CMDocumentBookmark

A bookmark to a document or folder.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**user_id** | **str** | the user&#39;s id, a guid | 
**source_id** | **int** | the source-id of the owner of the url | 
**url** | **str** | The unique URL of a document. | 
**url_id** | **int** | the internal SimSage id for this url | 
**is_folder** | **bool** | is this a bookmark to a folder or a file? | 
**folder** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_document_bookmark import CMDocumentBookmark

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentBookmark from a JSON string
cm_document_bookmark_instance = CMDocumentBookmark.from_json(json)
# print the JSON string representation of the object
print CMDocumentBookmark.to_json()

# convert the object into a dict
cm_document_bookmark_dict = cm_document_bookmark_instance.to_dict()
# create an instance of CMDocumentBookmark from a dict
cm_document_bookmark_form_dict = cm_document_bookmark.from_dict(cm_document_bookmark_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


