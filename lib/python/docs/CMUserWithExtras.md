# CMUserWithExtras

An object used for updating a SimSage user.  This object can be used to update the user's password too.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | the user&#39;s id (its guid id). | 
**email** | **str** | the email of this user | 
**password** | **str** | a password for this user (or blank if not to be changed) | 
**first_name** | **str** | the first-name of this user | 
**surname** | **str** | the last-name (surname) of this user | 
**roles** | **str** | the roles to be associated with this user | 
**operator_kb_list** | **str** | the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. | 
**group_list** | [**List[CMGroup]**](CMGroup.md) | a list of groups this user is part of (can be empty) | 
**jwt_match_name_value_csv** | **str** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching | 

## Example

```python
from openapi_client.models.cm_user_with_extras import CMUserWithExtras

# TODO update the JSON string below
json = "{}"
# create an instance of CMUserWithExtras from a JSON string
cm_user_with_extras_instance = CMUserWithExtras.from_json(json)
# print the JSON string representation of the object
print CMUserWithExtras.to_json()

# convert the object into a dict
cm_user_with_extras_dict = cm_user_with_extras_instance.to_dict()
# create an instance of CMUserWithExtras from a dict
cm_user_with_extras_form_dict = cm_user_with_extras.from_dict(cm_user_with_extras_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


