# CMAddSourceFolder

the source-folder add object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**source_name** | **str** | the source-folder&#39;s new name. | 
**acls** | [**List[CMDocumentAcl]**](CMDocumentAcl.md) | the initial ACLs for this source-folder. | 

## Example

```python
from openapi_client.models.cm_add_source_folder import CMAddSourceFolder

# TODO update the JSON string below
json = "{}"
# create an instance of CMAddSourceFolder from a JSON string
cm_add_source_folder_instance = CMAddSourceFolder.from_json(json)
# print the JSON string representation of the object
print CMAddSourceFolder.to_json()

# convert the object into a dict
cm_add_source_folder_dict = cm_add_source_folder_instance.to_dict()
# create an instance of CMAddSourceFolder from a dict
cm_add_source_folder_form_dict = cm_add_source_folder.from_dict(cm_add_source_folder_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


