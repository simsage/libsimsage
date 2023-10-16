# CMUserNotification

A notification to a user from a subscription.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | The unique URL of a folder. | 
**source_id** | **int** | the source-id of the owner of this folder | 
**is_folder** | **bool** | is this a notification for a folder or a file? | 
**user_id** | **str** | the user to be notified, a guid | 
**who_id** | **str** | the user that made the change, a guid | 
**email** | **str** | the email address of the user that made the change | 
**notification_type** | **str** | the type of the notification | 
**description** | **str** | the contents of the notification | 
**created** | **int** | a unix-timestamp of the creation date-time of this record | 
**folder** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_user_notification import CMUserNotification

# TODO update the JSON string below
json = "{}"
# create an instance of CMUserNotification from a JSON string
cm_user_notification_instance = CMUserNotification.from_json(json)
# print the JSON string representation of the object
print CMUserNotification.to_json()

# convert the object into a dict
cm_user_notification_dict = cm_user_notification_instance.to_dict()
# create an instance of CMUserNotification from a dict
cm_user_notification_form_dict = cm_user_notification.from_dict(cm_user_notification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


