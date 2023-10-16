# CMUpdateACLs

the ACLs for the object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**source_id** | **int** | the source-id of the owner of the url | 
**parent_id** | **str** | the parent id of the update to update | 
**object_id** | **str** | the id of the update to update | 
**item_type** | **str** | the type of item to update, one of source, file or folder | 
**acls** | [**List[CMDocumentAcl]**](CMDocumentAcl.md) | the initial ACLs for this source-folder. | 
**apply_to_children** | **bool** | apply these ACLs to any children of this object? | 

## Example

```python
from openapi_client.models.cm_update_acls import CMUpdateACLs

# TODO update the JSON string below
json = "{}"
# create an instance of CMUpdateACLs from a JSON string
cm_update_acls_instance = CMUpdateACLs.from_json(json)
# print the JSON string representation of the object
print CMUpdateACLs.to_json()

# convert the object into a dict
cm_update_acls_dict = cm_update_acls_instance.to_dict()
# create an instance of CMUpdateACLs from a dict
cm_update_acls_form_dict = cm_update_acls.from_dict(cm_update_acls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


