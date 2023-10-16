# CMUserPasswordReset

the password reset object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | email address of the user wishing to reset their password. | 
**reset_id** | **str** | the reset-id/token sent to you by SimSage via email. | 
**password** | **str** | the new password for this user | 

## Example

```python
from openapi_client.models.cm_user_password_reset import CMUserPasswordReset

# TODO update the JSON string below
json = "{}"
# create an instance of CMUserPasswordReset from a JSON string
cm_user_password_reset_instance = CMUserPasswordReset.from_json(json)
# print the JSON string representation of the object
print CMUserPasswordReset.to_json()

# convert the object into a dict
cm_user_password_reset_dict = cm_user_password_reset_instance.to_dict()
# create an instance of CMUserPasswordReset from a dict
cm_user_password_reset_form_dict = cm_user_password_reset.from_dict(cm_user_password_reset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


