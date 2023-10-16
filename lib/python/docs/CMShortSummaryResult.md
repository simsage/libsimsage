# CMShortSummaryResult

The result of a short summary for a given url

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base id (guid) to use | 
**url** | **str** | The unique URL of a document. | 
**summary** | **str** | The summary for this document. | 

## Example

```python
from openapi_client.models.cm_short_summary_result import CMShortSummaryResult

# TODO update the JSON string below
json = "{}"
# create an instance of CMShortSummaryResult from a JSON string
cm_short_summary_result_instance = CMShortSummaryResult.from_json(json)
# print the JSON string representation of the object
print CMShortSummaryResult.to_json()

# convert the object into a dict
cm_short_summary_result_dict = cm_short_summary_result_instance.to_dict()
# create an instance of CMShortSummaryResult from a dict
cm_short_summary_result_form_dict = cm_short_summary_result.from_dict(cm_short_summary_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


