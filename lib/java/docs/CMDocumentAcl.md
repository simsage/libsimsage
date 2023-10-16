

# CMDocumentAcl

A document Access Control List (ACL) item.  This item represents a user's/group's access to a document (hasAccess or not).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acl** | **String** | Some acl value, can represent a user&#39;s email address or the name of a remote security-group. |  |
|**access** | **String** | is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty) |  |
|**isUser** | **Boolean** | \&quot;true\&quot; if this a security-user (email address), \&quot;false\&quot; if this ACL pertains to a security-group (group name) |  |
|**user** | **Boolean** |  |  [optional] |



