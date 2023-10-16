# Organisation


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** |  | 
**enabled** | **bool** |  | 
**auto_create_sso_users** | **bool** |  | 
**auto_create_sso_domain_list** | **List[str]** |  | 
**auto_create_ssoacl_list** | **List[str]** |  | 
**auto_create_sso_role_list** | **List[str]** |  | 

## Example

```python
from openapi_client.models.organisation import Organisation

# TODO update the JSON string below
json = "{}"
# create an instance of Organisation from a JSON string
organisation_instance = Organisation.from_json(json)
# print the JSON string representation of the object
print Organisation.to_json()

# convert the object into a dict
organisation_dict = organisation_instance.to_dict()
# create an instance of Organisation from a dict
organisation_form_dict = organisation.from_dict(organisation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


