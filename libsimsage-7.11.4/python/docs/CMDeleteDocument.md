# CMDeleteDocument

An external document delete object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) this document is to be deleted for. | 
**kb_id** | **str** | the knowledge-base (its guid id) this document is to be deleted for. | 
**sid** | **str** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document belongs to. | 
**url** | **str** | A unique URL for this document. | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **int** | The seed used if encrypted | 

## Example

```python
from openapi_client.models.cm_delete_document import CMDeleteDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMDeleteDocument from a JSON string
cm_delete_document_instance = CMDeleteDocument.from_json(json)
# print the JSON string representation of the object
print CMDeleteDocument.to_json()

# convert the object into a dict
cm_delete_document_dict = cm_delete_document_instance.to_dict()
# create an instance of CMDeleteDocument from a dict
cm_delete_document_form_dict = cm_delete_document.from_dict(cm_delete_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


