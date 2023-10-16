# CMCreateGdprProject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_details** | [**GdprProject**](GdprProject.md) |  | [optional] 

## Example

```python
from openapi_client.models.cm_create_gdpr_project import CMCreateGdprProject

# TODO update the JSON string below
json = "{}"
# create an instance of CMCreateGdprProject from a JSON string
cm_create_gdpr_project_instance = CMCreateGdprProject.from_json(json)
# print the JSON string representation of the object
print CMCreateGdprProject.to_json()

# convert the object into a dict
cm_create_gdpr_project_dict = cm_create_gdpr_project_instance.to_dict()
# create an instance of CMCreateGdprProject from a dict
cm_create_gdpr_project_form_dict = cm_create_gdpr_project.from_dict(cm_create_gdpr_project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


