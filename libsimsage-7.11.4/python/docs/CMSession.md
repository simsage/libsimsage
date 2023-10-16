# CMSession

A session object, A session's id is the \"session-id\" used throughout the SimSage API.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | the session-id, a guid | 
**user_id** | **str** | the user associated with this session, their id, a guid | 
**organisation_id** | **str** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) | 
**email** | **str** | email address of this user | 
**ip_address** | **str** | the ip-address of the user logging in if captured | 
**last_access** | **int** | a unix-timestamp of the last time this session was accessed/refreshed | 
**role** | **str** | the main/highest role of the user signed-in | 
**session_type** | **str** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) | 

## Example

```python
from openapi_client.models.cm_session import CMSession

# TODO update the JSON string below
json = "{}"
# create an instance of CMSession from a JSON string
cm_session_instance = CMSession.from_json(json)
# print the JSON string representation of the object
print CMSession.to_json()

# convert the object into a dict
cm_session_dict = cm_session_instance.to_dict()
# create an instance of CMSession from a dict
cm_session_form_dict = cm_session.from_dict(cm_session_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


