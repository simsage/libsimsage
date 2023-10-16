# Org.OpenAPITools.Model.CMUpdateACLs
the ACLs for the object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the main organisation (its guid id) for this source/crawler | 
**KbId** | **string** | the knowledge-base id of this context item, a guid-string | 
**SourceId** | **int** | the source-id of the owner of the url | 
**ParentId** | **string** | the parent id of the update to update | 
**ObjectId** | **string** | the id of the update to update | 
**ItemType** | **string** | the type of item to update, one of source, file or folder | 
**Acls** | [**List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | the initial ACLs for this source-folder. | 
**ApplyToChildren** | **bool** | apply these ACLs to any children of this object? | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

