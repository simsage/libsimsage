# CMGroupEditInfo

Information for editing groups in the admin interface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id_list** | **List[str]** | a list of user-ids (can be empty) part of this group | 
**active_users_page** | **int** | pagination into the active (userIdList) set of users | 
**active_users_filter** | **str** | a filter for first-name, surname, and/or email of the active users | 
**available_users_page** | **int** | pagination into the available set of users | 
**available_users_filter** | **str** | a filter for first-name, surname, and/or email of the available users | 
**page_size** | **int** | pagination size of both sets of information | 

## Example

```python
from openapi_client.models.cm_group_edit_info import CMGroupEditInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CMGroupEditInfo from a JSON string
cm_group_edit_info_instance = CMGroupEditInfo.from_json(json)
# print the JSON string representation of the object
print CMGroupEditInfo.to_json()

# convert the object into a dict
cm_group_edit_info_dict = cm_group_edit_info_instance.to_dict()
# create an instance of CMGroupEditInfo from a dict
cm_group_edit_info_form_dict = cm_group_edit_info.from_dict(cm_group_edit_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


