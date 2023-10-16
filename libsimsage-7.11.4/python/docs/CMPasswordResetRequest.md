# CMPasswordResetRequest

the password request object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | email address of the user wishing to reset their password. | 

## Example

```python
from openapi_client.models.cm_password_reset_request import CMPasswordResetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CMPasswordResetRequest from a JSON string
cm_password_reset_request_instance = CMPasswordResetRequest.from_json(json)
# print the JSON string representation of the object
print CMPasswordResetRequest.to_json()

# convert the object into a dict
cm_password_reset_request_dict = cm_password_reset_request_instance.to_dict()
# create an instance of CMPasswordResetRequest from a dict
cm_password_reset_request_form_dict = cm_password_reset_request.from_dict(cm_password_reset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


