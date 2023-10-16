# Org.OpenAPITools.Model.CMDUserDashboard
A user's dashboard contents.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | **string** | the user&#39;s id, a guid | 
**LockList** | [**List&lt;CMDocument&gt;**](CMDocument.md) | list of locked documents for this user | 
**BookmarkList** | [**List&lt;CMDocumentBookmark&gt;**](CMDocumentBookmark.md) | list of bookmarks for this user | 
**Subscriptions** | [**CMSubscriptions**](CMSubscriptions.md) |  | 
**NotificationList** | [**List&lt;CMUserNotification&gt;**](CMUserNotification.md) | list of DMS notifications for this user | 
**FolderRoot** | [**CMDocumentFolder**](CMDocumentFolder.md) |  | 
**SavedSearchList** | [**List&lt;CMSavedSearch&gt;**](CMSavedSearch.md) | list of saved searches for this user | 
**CategoryList** | [**List&lt;SearchCategory&gt;**](SearchCategory.md) | Search categories / metadata searching | 
**UserList** | [**List&lt;CMUser&gt;**](CMUser.md) | list of users for ACLs | 
**GroupList** | [**List&lt;CMGroup&gt;**](CMGroup.md) | list of groups for ACLs | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

