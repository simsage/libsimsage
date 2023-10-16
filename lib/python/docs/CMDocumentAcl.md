# CMDocumentAcl

A document Access Control List (ACL) item.  This item represents a user's/group's access to a document (hasAccess or not).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acl** | **str** | Some acl value, can represent a user&#39;s email address or the name of a remote security-group. | 
**access** | **str** | is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty) | 
**is_user** | **bool** | \&quot;true\&quot; if this a security-user (email address), \&quot;false\&quot; if this ACL pertains to a security-group (group name) | 
**user** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_document_acl import CMDocumentAcl

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentAcl from a JSON string
cm_document_acl_instance = CMDocumentAcl.from_json(json)
# print the JSON string representation of the object
print CMDocumentAcl.to_json()

# convert the object into a dict
cm_document_acl_dict = cm_document_acl_instance.to_dict()
# create an instance of CMDocumentAcl from a dict
cm_document_acl_form_dict = cm_document_acl.from_dict(cm_document_acl_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


