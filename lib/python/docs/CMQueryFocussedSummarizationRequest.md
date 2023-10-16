# CMQueryFocussedSummarizationRequest

a query focussed summarization object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**query** | **str** | the query to use for a query | 
**maximum_number_of_documents** | **int** | the maximum number of documents to consider in a summarization event | 

## Example

```python
from openapi_client.models.cm_query_focussed_summarization_request import CMQueryFocussedSummarizationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CMQueryFocussedSummarizationRequest from a JSON string
cm_query_focussed_summarization_request_instance = CMQueryFocussedSummarizationRequest.from_json(json)
# print the JSON string representation of the object
print CMQueryFocussedSummarizationRequest.to_json()

# convert the object into a dict
cm_query_focussed_summarization_request_dict = cm_query_focussed_summarization_request_instance.to_dict()
# create an instance of CMQueryFocussedSummarizationRequest from a dict
cm_query_focussed_summarization_request_form_dict = cm_query_focussed_summarization_request.from_dict(cm_query_focussed_summarization_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


