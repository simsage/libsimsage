# CMSignInParameters

sign-in parameter object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | email address of the user logging in | 
**password** | **str** | this user&#39;s password | 

## Example

```python
from openapi_client.models.cm_sign_in_parameters import CMSignInParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CMSignInParameters from a JSON string
cm_sign_in_parameters_instance = CMSignInParameters.from_json(json)
# print the JSON string representation of the object
print CMSignInParameters.to_json()

# convert the object into a dict
cm_sign_in_parameters_dict = cm_sign_in_parameters_instance.to_dict()
# create an instance of CMSignInParameters from a dict
cm_sign_in_parameters_form_dict = cm_sign_in_parameters.from_dict(cm_sign_in_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


