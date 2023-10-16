# OptimizeIndexesGetReportsCmd


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
**report_list** | **List[int]** |  | 
**return_result** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.optimize_indexes_get_reports_cmd import OptimizeIndexesGetReportsCmd

# TODO update the JSON string below
json = "{}"
# create an instance of OptimizeIndexesGetReportsCmd from a JSON string
optimize_indexes_get_reports_cmd_instance = OptimizeIndexesGetReportsCmd.from_json(json)
# print the JSON string representation of the object
print OptimizeIndexesGetReportsCmd.to_json()

# convert the object into a dict
optimize_indexes_get_reports_cmd_dict = optimize_indexes_get_reports_cmd_instance.to_dict()
# create an instance of OptimizeIndexesGetReportsCmd from a dict
optimize_indexes_get_reports_cmd_form_dict = optimize_indexes_get_reports_cmd.from_dict(optimize_indexes_get_reports_cmd_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


