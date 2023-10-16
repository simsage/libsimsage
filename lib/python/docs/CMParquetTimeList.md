# CMParquetTimeList

This object is used to return a set of time-stamps (unix date-time items) related to the catalogue of inventory items inside SimSage for a given organisation/knowledge-base.  Each time-stamp represents a snapshot taken of the knowledge-base at a time by the user.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**time_list** | [**List[CMParquetItem]**](CMParquetItem.md) | a list of unix-times for parquet items in the system | 
**total_count** | **int** | the total (non paged) amount of items available | 

## Example

```python
from openapi_client.models.cm_parquet_time_list import CMParquetTimeList

# TODO update the JSON string below
json = "{}"
# create an instance of CMParquetTimeList from a JSON string
cm_parquet_time_list_instance = CMParquetTimeList.from_json(json)
# print the JSON string representation of the object
print CMParquetTimeList.to_json()

# convert the object into a dict
cm_parquet_time_list_dict = cm_parquet_time_list_instance.to_dict()
# create an instance of CMParquetTimeList from a dict
cm_parquet_time_list_form_dict = cm_parquet_time_list.from_dict(cm_parquet_time_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


