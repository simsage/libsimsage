# CMAddFolder

the folder add object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**source_id** | **int** | the source-id of the owner of the url | 
**folder_id** | **str** | the id of the folder. | 
**folder_name** | **str** | the folder&#39;s new name. | 
**prev_url** | **str** | pagination, the previous last URL for the page-set (null is first page) | [optional] 
**page_size** | **int** | page-size for a paginated set | 

## Example

```python
from openapi_client.models.cm_add_folder import CMAddFolder

# TODO update the JSON string below
json = "{}"
# create an instance of CMAddFolder from a JSON string
cm_add_folder_instance = CMAddFolder.from_json(json)
# print the JSON string representation of the object
print CMAddFolder.to_json()

# convert the object into a dict
cm_add_folder_dict = cm_add_folder_instance.to_dict()
# create an instance of CMAddFolder from a dict
cm_add_folder_form_dict = cm_add_folder.from_dict(cm_add_folder_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


