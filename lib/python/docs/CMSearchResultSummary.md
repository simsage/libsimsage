# CMSearchResultSummary


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_type** | **str** |  | 
**project_title** | **str** |  | 
**document_count** | **int** |  | 
**results** | [**List[CMResultsSection]**](CMResultsSection.md) |  | 

## Example

```python
from openapi_client.models.cm_search_result_summary import CMSearchResultSummary

# TODO update the JSON string below
json = "{}"
# create an instance of CMSearchResultSummary from a JSON string
cm_search_result_summary_instance = CMSearchResultSummary.from_json(json)
# print the JSON string representation of the object
print CMSearchResultSummary.to_json()

# convert the object into a dict
cm_search_result_summary_dict = cm_search_result_summary_instance.to_dict()
# create an instance of CMSearchResultSummary from a dict
cm_search_result_summary_form_dict = cm_search_result_summary.from_dict(cm_search_result_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


