# CMQueryFocussedSummarization

A document summarization result (Multi Document Summarization)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**summary** | [**List[CMDParagraphSummary]**](CMDParagraphSummary.md) | the list of summary items | 
**message** | **str** | a possible return message if not empty | 

## Example

```python
from openapi_client.models.cm_query_focussed_summarization import CMQueryFocussedSummarization

# TODO update the JSON string below
json = "{}"
# create an instance of CMQueryFocussedSummarization from a JSON string
cm_query_focussed_summarization_instance = CMQueryFocussedSummarization.from_json(json)
# print the JSON string representation of the object
print CMQueryFocussedSummarization.to_json()

# convert the object into a dict
cm_query_focussed_summarization_dict = cm_query_focussed_summarization_instance.to_dict()
# create an instance of CMQueryFocussedSummarization from a dict
cm_query_focussed_summarization_form_dict = cm_query_focussed_summarization.from_dict(cm_query_focussed_summarization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


