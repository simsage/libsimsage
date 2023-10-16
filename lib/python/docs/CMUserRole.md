# CMUserRole

A user's SimSage-role inside an organisation.  SimSage roles determine what a user can do/access inside SimSage and are specific to SimSage.  Roles include admin (a SimSage administrator, super-user), manager (a SimSage manager, a user that has super-user access to one and one organisation only), operator (a SimSage operator, a user that can access the SimSage operator interface for a specific organisation), dms (a SimSage user that can sign-in to our Document Management System interface, specific to an organisation).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) this role applies to | 
**role** | **str** | the SimSage role inside this organisation | 

## Example

```python
from openapi_client.models.cm_user_role import CMUserRole

# TODO update the JSON string below
json = "{}"
# create an instance of CMUserRole from a JSON string
cm_user_role_instance = CMUserRole.from_json(json)
# print the JSON string representation of the object
print CMUserRole.to_json()

# convert the object into a dict
cm_user_role_dict = cm_user_role_instance.to_dict()
# create an instance of CMUserRole from a dict
cm_user_role_form_dict = cm_user_role.from_dict(cm_user_role_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


