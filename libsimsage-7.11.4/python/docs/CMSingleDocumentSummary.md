# CMSingleDocumentSummary

A document summarization result (extractive summarization)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | the url this text came from | 
**summary** | **List[str]** | the list of summary items for the given document | 

## Example

```python
from openapi_client.models.cm_single_document_summary import CMSingleDocumentSummary

# TODO update the JSON string below
json = "{}"
# create an instance of CMSingleDocumentSummary from a JSON string
cm_single_document_summary_instance = CMSingleDocumentSummary.from_json(json)
# print the JSON string representation of the object
print CMSingleDocumentSummary.to_json()

# convert the object into a dict
cm_single_document_summary_dict = cm_single_document_summary_instance.to_dict()
# create an instance of CMSingleDocumentSummary from a dict
cm_single_document_summary_form_dict = cm_single_document_summary.from_dict(cm_single_document_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


