# SignInCmd


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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
**organisation_list** | [**List[Organisation]**](Organisation.md) |  | 
**return_result** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.sign_in_cmd import SignInCmd

# TODO update the JSON string below
json = "{}"
# create an instance of SignInCmd from a JSON string
sign_in_cmd_instance = SignInCmd.from_json(json)
# print the JSON string representation of the object
print SignInCmd.to_json()

# convert the object into a dict
sign_in_cmd_dict = sign_in_cmd_instance.to_dict()
# create an instance of SignInCmd from a dict
sign_in_cmd_form_dict = sign_in_cmd.from_dict(sign_in_cmd_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


