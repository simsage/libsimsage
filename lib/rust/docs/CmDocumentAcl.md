# CmDocumentAcl

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acl** | **String** | Some acl value, can represent a user's email address or the name of a remote security-group. | 
**access** | **String** | is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty) | 
**is_user** | **bool** | \"true\" if this a security-user (email address), \"false\" if this ACL pertains to a security-group (group name) | 
**user** | Option<**bool**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


