# CMGroupList

A security-group list.  A list of groups for security purposes.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_list** | [**List[CMGroup]**](CMGroup.md) | the list of filtered/paginated groups | 
**user_list** | [**List[CMUser]**](CMUser.md) | the list of users for all groups | 

## Example

```python
from openapi_client.models.cm_group_list import CMGroupList

# TODO update the JSON string below
json = "{}"
# create an instance of CMGroupList from a JSON string
cm_group_list_instance = CMGroupList.from_json(json)
# print the JSON string representation of the object
print CMGroupList.to_json()

# convert the object into a dict
cm_group_list_dict = cm_group_list_instance.to_dict()
# create an instance of CMGroupList from a dict
cm_group_list_form_dict = cm_group_list.from_dict(cm_group_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


