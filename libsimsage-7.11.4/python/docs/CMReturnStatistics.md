# CMReturnStatistics

This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**year** | **int** | the year of the request | 
**month** | **int** | the month of the request | 
**access_frequency** | **int** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. | 
**query_word_frequency** | **Dict[str, int]** | The top list of queries (the strings) and their frequencies | 
**general_statistics** | **Dict[str, int]** | Some more general statistics (eg. number of documents) and their frequencies | 
**file_type_statistics** | **Dict[str, int]** | The breakdown of file-types (by file extension) and their frequencies | 

## Example

```python
from openapi_client.models.cm_return_statistics import CMReturnStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of CMReturnStatistics from a JSON string
cm_return_statistics_instance = CMReturnStatistics.from_json(json)
# print the JSON string representation of the object
print CMReturnStatistics.to_json()

# convert the object into a dict
cm_return_statistics_dict = cm_return_statistics_instance.to_dict()
# create an instance of CMReturnStatistics from a dict
cm_return_statistics_form_dict = cm_return_statistics.from_dict(cm_return_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


