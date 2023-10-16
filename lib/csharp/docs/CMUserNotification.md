# Org.OpenAPITools.Model.CMUserNotification
A notification to a user from a subscription.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **string** | The unique URL of a folder. | 
**SourceId** | **int** | the source-id of the owner of this folder | 
**IsFolder** | **bool** | is this a notification for a folder or a file? | 
**UserId** | **string** | the user to be notified, a guid | 
**WhoId** | **string** | the user that made the change, a guid | 
**Email** | **string** | the email address of the user that made the change | 
**NotificationType** | **string** | the type of the notification | 
**Description** | **string** | the contents of the notification | 
**Created** | **long** | a unix-timestamp of the creation date-time of this record | 
**Folder** | **bool** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

