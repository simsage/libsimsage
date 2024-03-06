# CMFailedSourceDocument

Description of an external document upload failure.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id (its guid id) for this source/crawler | 
**source_id** | **int** | the source-id, primary key of the source | 
**source_system_id** | **str** | the unique id of the document in the source system, mostly same as web url | 
**web_url** | **str** | the web url to access the document, can be different from url | 
**run_id** | **int** | the timestamp of the crawler run adding the exception | 
**error_message** | **str** | the error message added by the system | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **int** | The seed used if encrypted | 
**sid** | **str** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 

## Example

```python
from openapi_client.models.cm_failed_source_document import CMFailedSourceDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMFailedSourceDocument from a JSON string
cm_failed_source_document_instance = CMFailedSourceDocument.from_json(json)
# print the JSON string representation of the object
print CMFailedSourceDocument.to_json()

# convert the object into a dict
cm_failed_source_document_dict = cm_failed_source_document_instance.to_dict()
# create an instance of CMFailedSourceDocument from a dict
cm_failed_source_document_form_dict = cm_failed_source_document.from_dict(cm_failed_source_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


