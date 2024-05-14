# SignInAdmin


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_list** | [**List[Organisation]**](Organisation.md) |  | 
**shared_secret_salt** | **str** |  | 
**job_id** | **str** |  | 
**return_address** | **str** |  | 
**error_str** | **str** |  | 
**time_out** | **int** |  | 
**var_async** | **bool** |  | 
**is_return_result** | **bool** |  | 
**email** | **str** |  | 
**password** | **str** |  | 
**roles** | **List[str]** |  | 
**remote_address** | **str** |  | 
**session** | [**Session**](Session.md) |  | 
**user** | [**User**](User.md) |  | 
**organisation_id** | **str** |  | 
**return_result** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.sign_in_admin import SignInAdmin

# TODO update the JSON string below
json = "{}"
# create an instance of SignInAdmin from a JSON string
sign_in_admin_instance = SignInAdmin.from_json(json)
# print the JSON string representation of the object
print SignInAdmin.to_json()

# convert the object into a dict
sign_in_admin_dict = sign_in_admin_instance.to_dict()
# create an instance of SignInAdmin from a dict
sign_in_admin_form_dict = sign_in_admin.from_dict(sign_in_admin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


