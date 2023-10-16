# CMDocumentFolder

A document folder content item.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_id** | **int** | the source-id of the owner of this folder | 
**url** | **str** | The unique URL of a document or folder. | 
**parent_folder_id** | **str** | The id of the parent folder of this folder. | 
**folder_id** | **str** | The id of this folder. | 
**url_id** | **int** | the internal SimSage id for this url | 
**folder_name** | **str** | the display name of the folder | 
**item_type** | **str** | the type of folder (crawlerType for sources) | 
**folder_list** | [**List[CMDocumentFolder]**](CMDocumentFolder.md) | the folder items in this folder | 
**file_list** | [**List[CMDocument]**](CMDocument.md) | the files in this folder | 
**acls** | [**List[CMDocumentAcl]**](CMDocumentAcl.md) | the security permissions for this item | 

## Example

```python
from openapi_client.models.cm_document_folder import CMDocumentFolder

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentFolder from a JSON string
cm_document_folder_instance = CMDocumentFolder.from_json(json)
# print the JSON string representation of the object
print CMDocumentFolder.to_json()

# convert the object into a dict
cm_document_folder_dict = cm_document_folder_instance.to_dict()
# create an instance of CMDocumentFolder from a dict
cm_document_folder_form_dict = cm_document_folder.from_dict(cm_document_folder_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


