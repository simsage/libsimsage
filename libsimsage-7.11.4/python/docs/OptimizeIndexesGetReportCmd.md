# OptimizeIndexesGetReportCmd


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** |  | 
**return_address** | **str** |  | 
**error_str** | **str** |  | 
**time_out** | **int** |  | 
**var_async** | **bool** |  | 
**is_return_result** | **bool** |  | 
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**id** | **int** |  | 
**number_of_shards** | **int** |  | 
**num_urls** | **int** |  | 
**index_set** | **int** |  | 
**num_urls_removed** | **int** |  | 
**total_offsets** | **int** |  | 
**metadata_item_count** | **int** |  | 
**number_of_total_indexes** | **int** |  | 
**num_optimized_indexes** | **int** |  | 
**num_indexes_removed** | **int** |  | 
**num_optimized_removed** | **int** |  | 
**num_indexes_up_to_date** | **int** |  | 
**byte_size** | **int** |  | 
**return_result** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.optimize_indexes_get_report_cmd import OptimizeIndexesGetReportCmd

# TODO update the JSON string below
json = "{}"
# create an instance of OptimizeIndexesGetReportCmd from a JSON string
optimize_indexes_get_report_cmd_instance = OptimizeIndexesGetReportCmd.from_json(json)
# print the JSON string representation of the object
print OptimizeIndexesGetReportCmd.to_json()

# convert the object into a dict
optimize_indexes_get_report_cmd_dict = optimize_indexes_get_report_cmd_instance.to_dict()
# create an instance of OptimizeIndexesGetReportCmd from a dict
optimize_indexes_get_report_cmd_form_dict = optimize_indexes_get_report_cmd.from_dict(optimize_indexes_get_report_cmd_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


