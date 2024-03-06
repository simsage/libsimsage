# # CMExternalCrawlerRenameFolder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **string** | the type of this class, just in case this object is encrypted |
**organisation_id** | **string** | the main organisation (its guid id) for this source/crawler |
**kb_id** | **string** | the knowledge-base id of this context item, a guid-string |
**sid** | **string** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. |
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) |
**old_folder_name_url** | **string** | the current document-folder name |
**new_folder_name_url** | **string** | the new document-folder name |
**acls** | **string** | A list of security permission for the new document-folder.  Can be empty (ie. no security applied). |
**encrypted** | **bool** | Do we need to add transport encryption |
**seed** | **int** | The seed used if encrypted |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
