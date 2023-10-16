# CMSessionVersion

A SimSage combined session / user and version object.  This is the object returned when you've signed-in successfully.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**session** | [**CMSession**](CMSession.md) |  | 
**user** | [**CMUser**](CMUser.md) |  | 
**organisation_list** | [**List[CMOrganisation]**](CMOrganisation.md) | list of organisations for admin users | 
**version** | **str** | version of this service | 

## Example

```python
from openapi_client.models.cm_session_version import CMSessionVersion

# TODO update the JSON string below
json = "{}"
# create an instance of CMSessionVersion from a JSON string
cm_session_version_instance = CMSessionVersion.from_json(json)
# print the JSON string representation of the object
print CMSessionVersion.to_json()

# convert the object into a dict
cm_session_version_dict = cm_session_version_instance.to_dict()
# create an instance of CMSessionVersion from a dict
cm_session_version_form_dict = cm_session_version.from_dict(cm_session_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


