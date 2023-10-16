# CMProjectInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**caption** | **str** |  | 
**description** | **str** |  | 
**search** | [**CMSearchDefinition**](CMSearchDefinition.md) |  | 
**steps** | [**List[CMStepConfig]**](CMStepConfig.md) |  | 
**slice_actions** | **Dict[str, str]** |  | 
**screen_configs** | **Dict[str, Dict[str, object]]** |  | 

## Example

```python
from openapi_client.models.cm_project_info import CMProjectInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectInfo from a JSON string
cm_project_info_instance = CMProjectInfo.from_json(json)
# print the JSON string representation of the object
print CMProjectInfo.to_json()

# convert the object into a dict
cm_project_info_dict = cm_project_info_instance.to_dict()
# create an instance of CMProjectInfo from a dict
cm_project_info_form_dict = cm_project_info.from_dict(cm_project_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


