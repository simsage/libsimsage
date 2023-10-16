# CMDocumentLock

the document checkout request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**url** | **str** | The unique URL of a document. | 
**url_id** | **int** | the internal SimSage id for this url | 
**source_id** | **int** | the source-id of the owner of the url | 
**user_id** | **str** | the user&#39;s id, a guid | 
**name** | **str** | the name of the checkout folder/file object | 
**checkout_date** | **int** | a unix-timestamp for the creation of this checkout object | 

## Example

```python
from openapi_client.models.cm_document_lock import CMDocumentLock

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentLock from a JSON string
cm_document_lock_instance = CMDocumentLock.from_json(json)
# print the JSON string representation of the object
print CMDocumentLock.to_json()

# convert the object into a dict
cm_document_lock_dict = cm_document_lock_instance.to_dict()
# create an instance of CMDocumentLock from a dict
cm_document_lock_form_dict = cm_document_lock.from_dict(cm_document_lock_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


