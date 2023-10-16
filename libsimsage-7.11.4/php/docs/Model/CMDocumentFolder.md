# # CMDocumentFolder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_id** | **int** | the source-id of the owner of this folder |
**url** | **string** | The unique URL of a document or folder. |
**parent_folder_id** | **string** | The id of the parent folder of this folder. |
**folder_id** | **string** | The id of this folder. |
**url_id** | **int** | the internal SimSage id for this url |
**folder_name** | **string** | the display name of the folder |
**item_type** | **string** | the type of folder (crawlerType for sources) |
**folder_list** | [**\OpenAPI\Client\Model\CMDocumentFolder[]**](CMDocumentFolder.md) | the folder items in this folder |
**file_list** | [**\OpenAPI\Client\Model\CMDocument[]**](CMDocument.md) | the files in this folder |
**acls** | [**\OpenAPI\Client\Model\CMDocumentAcl[]**](CMDocumentAcl.md) | the security permissions for this item |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
