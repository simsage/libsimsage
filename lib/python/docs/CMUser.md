# CMUser

A SimSage user object for editing and reviewing.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | the user&#39;s id, a guid | 
**email** | **str** | email address of this user (their sign-in and primary identity) | 
**first_name** | **str** | the first-name of this user | 
**surname** | **str** | the second-name (surname) of this user | 
**roles** | [**List[CMUserRole]**](CMUserRole.md) | a list of SimSage roles associated with this user | 
**operator_kb_list** | [**List[CMOperatorKnowledgeBase]**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for | 
**group_list** | [**List[CMGroup]**](CMGroup.md) | a list of security-groups this user is part of (can be empty) | 
**jwt_match_name_value_csv** | **str** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching | 

## Example

```python
from openapi_client.models.cm_user import CMUser

# TODO update the JSON string below
json = "{}"
# create an instance of CMUser from a JSON string
cm_user_instance = CMUser.from_json(json)
# print the JSON string representation of the object
print CMUser.to_json()

# convert the object into a dict
cm_user_dict = cm_user_instance.to_dict()
# create an instance of CMUser from a dict
cm_user_form_dict = cm_user.from_dict(cm_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


