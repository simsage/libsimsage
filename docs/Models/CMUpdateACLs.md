# CMUpdateACLs
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the main organisation (its guid id) for this source/crawler | [default to null] |
| **kbId** | **String** | the knowledge-base id of this context item, a guid-string | [default to null] |
| **sourceId** | **Integer** | the source-id of the owner of the url | [default to null] |
| **parentId** | **String** | the parent id of the update to update | [default to null] |
| **objectId** | **String** | the id of the update to update | [default to null] |
| **itemType** | **String** | the type of item to update, one of source, file or folder | [default to null] |
| **acls** | [**List**](CMDocumentAcl.md) | the initial ACLs for this source-folder. | [default to null] |
| **applyToChildren** | **Boolean** | apply these ACLs to any children of this object? | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

