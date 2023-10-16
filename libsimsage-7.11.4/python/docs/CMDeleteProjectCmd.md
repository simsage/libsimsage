# CMDeleteProjectCmd


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_id** | **str** |  | 
**job_id** | **str** |  | 
**return_address** | **str** |  | 
**error_str** | **str** |  | 
**time_out** | **int** |  | 
**var_async** | **bool** |  | 
**is_return_result** | **bool** |  | 
**return_result** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_delete_project_cmd import CMDeleteProjectCmd

# TODO update the JSON string below
json = "{}"
# create an instance of CMDeleteProjectCmd from a JSON string
cm_delete_project_cmd_instance = CMDeleteProjectCmd.from_json(json)
# print the JSON string representation of the object
print CMDeleteProjectCmd.to_json()

# convert the object into a dict
cm_delete_project_cmd_dict = cm_delete_project_cmd_instance.to_dict()
# create an instance of CMDeleteProjectCmd from a dict
cm_delete_project_cmd_form_dict = cm_delete_project_cmd.from_dict(cm_delete_project_cmd_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


