
# CMUpdateACLs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the main organisation (its guid id) for this source/crawler | 
**kbId** | **kotlin.String** | the knowledge-base id of this context item, a guid-string | 
**sourceId** | **kotlin.Int** | the source-id of the owner of the url | 
**parentId** | **kotlin.String** | the parent id of the update to update | 
**objectId** | **kotlin.String** | the id of the update to update | 
**itemType** | **kotlin.String** | the type of item to update, one of source, file or folder | 
**acls** | [**kotlin.collections.List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | the initial ACLs for this source-folder. | 
**applyToChildren** | **kotlin.Boolean** | apply these ACLs to any children of this object? | 



