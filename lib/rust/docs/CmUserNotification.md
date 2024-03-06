# CmUserNotification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | The unique URL of a folder. | 
**source_id** | **i32** | the source-id of the owner of this folder | 
**is_folder** | **bool** | is this a notification for a folder or a file? | 
**user_id** | **String** | the user to be notified, a guid | 
**who_id** | **String** | the user that made the change, a guid | 
**email** | **String** | the email address of the user that made the change | 
**notification_type** | **String** | the type of the notification | 
**description** | **String** | the contents of the notification | 
**created** | **i64** | a unix-timestamp of the creation date-time of this record | 
**folder** | Option<**bool**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


