# CMGroup

A security-group object.  Groups can contain security users and are used to group/clump users.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) this group is associated with | 
**name** | **str** | the name of this group | 
**user_id_list** | **List[str]** | a list of user-ids (can be empty) part of this group | 

## Example

```python
from openapi_client.models.cm_group import CMGroup

# TODO update the JSON string below
json = "{}"
# create an instance of CMGroup from a JSON string
cm_group_instance = CMGroup.from_json(json)
# print the JSON string representation of the object
print CMGroup.to_json()

# convert the object into a dict
cm_group_dict = cm_group_instance.to_dict()
# create an instance of CMGroup from a dict
cm_group_form_dict = cm_group.from_dict(cm_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


