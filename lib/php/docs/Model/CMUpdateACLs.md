# # CMUpdateACLs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the main organisation (its guid id) for this source/crawler |
**kb_id** | **string** | the knowledge-base id of this context item, a guid-string |
**source_id** | **int** | the source-id of the owner of the url |
**parent_id** | **string** | the parent id of the update to update |
**object_id** | **string** | the id of the update to update |
**item_type** | **string** | the type of item to update, one of source, file or folder |
**acls** | [**\OpenAPI\Client\Model\CMDocumentAcl[]**](CMDocumentAcl.md) | the initial ACLs for this source-folder. |
**apply_to_children** | **bool** | apply these ACLs to any children of this object? |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
