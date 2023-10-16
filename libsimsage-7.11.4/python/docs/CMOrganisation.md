# CMOrganisation

A SimSage organisation object.  Represents a SimSage top-level tenant, aka. an organisation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | the organisation (its guid id). | 
**name** | **str** | the name of the organisation | 
**enabled** | **bool** | true if the organisation is enabled (active/operational) | 
**auto_create_sso_users** | **bool** | if enabled, SSO users will auto-create their accounts | 
**auto_create_sso_domain_list** | **List[str]** | a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) | 
**auto_create_ssoacl_list** | **List[str]** | a list of the ACLs initially assigned to each new user of they need creating | 
**auto_create_sso_role_list** | **List[str]** | a list of the SimSage Roles initially assigned to each new user of they need creating | 

## Example

```python
from openapi_client.models.cm_organisation import CMOrganisation

# TODO update the JSON string below
json = "{}"
# create an instance of CMOrganisation from a JSON string
cm_organisation_instance = CMOrganisation.from_json(json)
# print the JSON string representation of the object
print CMOrganisation.to_json()

# convert the object into a dict
cm_organisation_dict = cm_organisation_instance.to_dict()
# create an instance of CMOrganisation from a dict
cm_organisation_form_dict = cm_organisation.from_dict(cm_organisation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


