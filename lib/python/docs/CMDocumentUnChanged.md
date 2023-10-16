# CMDocumentUnChanged

An external document representation object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) this document should go into. | 
**kb_id** | **str** | the knowledge-base (its guid id) this document should go into. | 
**sid** | **str** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. | 
**url** | **str** | A unique URL for this document. | 
**run_id** | **str** | the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. | 

## Example

```python
from openapi_client.models.cm_document_un_changed import CMDocumentUnChanged

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentUnChanged from a JSON string
cm_document_un_changed_instance = CMDocumentUnChanged.from_json(json)
# print the JSON string representation of the object
print CMDocumentUnChanged.to_json()

# convert the object into a dict
cm_document_un_changed_dict = cm_document_un_changed_instance.to_dict()
# create an instance of CMDocumentUnChanged from a dict
cm_document_un_changed_form_dict = cm_document_un_changed.from_dict(cm_document_un_changed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


