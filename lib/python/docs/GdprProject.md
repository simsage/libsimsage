# GdprProject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**created_by** | **str** |  | 
**last_modified_by** | **str** |  | 
**created** | **datetime** |  | 
**last_modified** | **datetime** |  | 
**last_result_update** | **datetime** |  | [optional] 
**project_type** | **str** |  | 
**status** | **str** |  | 
**search_details** | [**CMGdprSearchDetails**](CMGdprSearchDetails.md) |  | 

## Example

```python
from openapi_client.models.gdpr_project import GdprProject

# TODO update the JSON string below
json = "{}"
# create an instance of GdprProject from a JSON string
gdpr_project_instance = GdprProject.from_json(json)
# print the JSON string representation of the object
print GdprProject.to_json()

# convert the object into a dict
gdpr_project_dict = gdpr_project_instance.to_dict()
# create an instance of GdprProject from a dict
gdpr_project_form_dict = gdpr_project.from_dict(gdpr_project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


