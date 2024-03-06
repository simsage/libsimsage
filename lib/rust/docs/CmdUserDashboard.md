# CmdUserDashboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **String** | the user's id, a guid | 
**lock_list** | [**Vec<crate::models::CmDocument>**](CMDocument.md) | list of locked documents for this user | 
**bookmark_list** | [**Vec<crate::models::CmDocumentBookmark>**](CMDocumentBookmark.md) | list of bookmarks for this user | 
**subscriptions** | [**crate::models::CmSubscriptions**](CMSubscriptions.md) |  | 
**notification_list** | [**Vec<crate::models::CmUserNotification>**](CMUserNotification.md) | list of DMS notifications for this user | 
**folder_root** | [**crate::models::CmDocumentFolder**](CMDocumentFolder.md) |  | 
**saved_search_list** | [**Vec<crate::models::CmSavedSearch>**](CMSavedSearch.md) | list of saved searches for this user | 
**category_list** | [**Vec<crate::models::SearchCategory>**](SearchCategory.md) | Search categories / metadata searching | 
**user_list** | [**Vec<crate::models::CmUser>**](CMUser.md) | list of users for ACLs | 
**group_list** | [**Vec<crate::models::CmGroup>**](CMGroup.md) | list of groups for ACLs | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


