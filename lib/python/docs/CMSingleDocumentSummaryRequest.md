# CMSingleDocumentSummaryRequest

a document summarization object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**url** | **str** | the url of the document to summarize | 
**top** | **int** | the top-n sentences to return for the summary of the documents | 

## Example

```python
from openapi_client.models.cm_single_document_summary_request import CMSingleDocumentSummaryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CMSingleDocumentSummaryRequest from a JSON string
cm_single_document_summary_request_instance = CMSingleDocumentSummaryRequest.from_json(json)
# print the JSON string representation of the object
print CMSingleDocumentSummaryRequest.to_json()

# convert the object into a dict
cm_single_document_summary_request_dict = cm_single_document_summary_request_instance.to_dict()
# create an instance of CMSingleDocumentSummaryRequest from a dict
cm_single_document_summary_request_form_dict = cm_single_document_summary_request.from_dict(cm_single_document_summary_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


