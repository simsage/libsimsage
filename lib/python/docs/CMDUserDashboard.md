# CMDUserDashboard

A user's dashboard contents.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** | the user&#39;s id, a guid | 
**lock_list** | [**List[CMDocument]**](CMDocument.md) | list of locked documents for this user | 
**bookmark_list** | [**List[CMDocumentBookmark]**](CMDocumentBookmark.md) | list of bookmarks for this user | 
**subscriptions** | [**CMSubscriptions**](CMSubscriptions.md) |  | 
**notification_list** | [**List[CMUserNotification]**](CMUserNotification.md) | list of DMS notifications for this user | 
**folder_root** | [**CMDocumentFolder**](CMDocumentFolder.md) |  | 
**saved_search_list** | [**List[CMSavedSearch]**](CMSavedSearch.md) | list of saved searches for this user | 
**category_list** | [**List[SearchCategory]**](SearchCategory.md) | Search categories / metadata searching | 
**user_list** | [**List[CMUser]**](CMUser.md) | list of users for ACLs | 
**group_list** | [**List[CMGroup]**](CMGroup.md) | list of groups for ACLs | 

## Example

```python
from openapi_client.models.cmd_user_dashboard import CMDUserDashboard

# TODO update the JSON string below
json = "{}"
# create an instance of CMDUserDashboard from a JSON string
cmd_user_dashboard_instance = CMDUserDashboard.from_json(json)
# print the JSON string representation of the object
print CMDUserDashboard.to_json()

# convert the object into a dict
cmd_user_dashboard_dict = cmd_user_dashboard_instance.to_dict()
# create an instance of CMDUserDashboard from a dict
cmd_user_dashboard_form_dict = cmd_user_dashboard.from_dict(cmd_user_dashboard_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


