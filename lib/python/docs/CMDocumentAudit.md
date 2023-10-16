# CMDocumentAudit

An audit record for a document.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**url** | **str** | The unique URL of a document. | 
**user_id** | **str** | The user&#39;s id | 
**email** | **str** | the email address of the user for this audit record | 
**description** | **str** | The description of the audit event | 
**created** | **int** | a unix-timestamp of the creation date-time of this record | 

## Example

```python
from openapi_client.models.cm_document_audit import CMDocumentAudit

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentAudit from a JSON string
cm_document_audit_instance = CMDocumentAudit.from_json(json)
# print the JSON string representation of the object
print CMDocumentAudit.to_json()

# convert the object into a dict
cm_document_audit_dict = cm_document_audit_instance.to_dict()
# create an instance of CMDocumentAudit from a dict
cm_document_audit_form_dict = cm_document_audit.from_dict(cm_document_audit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


