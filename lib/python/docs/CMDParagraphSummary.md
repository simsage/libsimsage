# CMDParagraphSummary

A multiple document summarization result.  Multi Document Summarization (MSD) uses SimSage's graph to create relevant extracts of series of documents matching a specific query.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | the url this text came from | 
**text** | **str** | a paragraph of text | 
**score** | **float** | the score relative to the others of this sentence | 

## Example

```python
from openapi_client.models.cmd_paragraph_summary import CMDParagraphSummary

# TODO update the JSON string below
json = "{}"
# create an instance of CMDParagraphSummary from a JSON string
cmd_paragraph_summary_instance = CMDParagraphSummary.from_json(json)
# print the JSON string representation of the object
print CMDParagraphSummary.to_json()

# convert the object into a dict
cmd_paragraph_summary_dict = cmd_paragraph_summary_instance.to_dict()
# create an instance of CMDParagraphSummary from a dict
cmd_paragraph_summary_form_dict = cmd_paragraph_summary.from_dict(cmd_paragraph_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


