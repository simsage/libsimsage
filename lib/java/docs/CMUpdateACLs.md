

# CMUpdateACLs

the ACLs for the object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the main organisation (its guid id) for this source/crawler |  |
|**kbId** | **String** | the knowledge-base id of this context item, a guid-string |  |
|**sourceId** | **Integer** | the source-id of the owner of the url |  |
|**parentId** | **String** | the parent id of the update to update |  |
|**objectId** | **String** | the id of the update to update |  |
|**itemType** | **String** | the type of item to update, one of source, file or folder |  |
|**acls** | [**List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | the initial ACLs for this source-folder. |  |
|**applyToChildren** | **Boolean** | apply these ACLs to any children of this object? |  |



