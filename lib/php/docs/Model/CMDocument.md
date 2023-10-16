# # CMDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the organisation (its guid id) |
**kb_id** | **string** | the knowledge-base id (its guid id) |
**url** | **string** | A unique URL for this document. |
**url_id** | **int** | A unique URL-id for this document. |
**origin** | **string** | Where the document was sourced from (for external documents). |
**title** | **string** | The title of this document, can be empty. |
**author** | **string** | The author of this document, can be empty. |
**document_type** | **string** | The file extension of this document, its type. |
**created** | **int** | a unix-timestamp for the creation date-time of this document |
**uploaded** | **int** | a unix-timestamp for the upload date-time of this document to SimSage |
**last_modified** | **int** | a unix-timestamp for the last-modified date-time of this document |
**crawled** | **int** | a unix-timestamp for when a SimSage crawler last looked at this document |
**converted** | **int** | a unix-timestamp for when a SimSage converter last looked at this document |
**parsed** | **int** | a unix-timestamp for when a SimSage parser last looked at this document |
**indexed** | **int** | a unix-timestamp for when a SimSage indexer last looked at this document |
**previewed** | **int** | a unix-timestamp for when a SimSage image-converter last looked at this document |
**change_hash** | **string** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. |
**content_hash** | **string** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. |
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) |
**parent_url** | **string** | a related url if there is parentage to be considered for an item |
**acls** | [**\OpenAPI\Client\Model\CMDocumentAcl[]**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) |
**metadata** | **array<string,string>** | a series of name values for other metadata values found in the container of this document |
**num_sentences** | **int** | the number of sentences in this document. |
**num_words** | **int** | the total number of words in this document. |
**num_relationships** | **int** | the total number of relationships in this document. |
**binary_size** | **int** | the size of the original document&#39;s binary in bytes. |
**text_size** | **int** | the size of the converted document&#39;s text in bytes. |
**version_list** | [**\OpenAPI\Client\Model\CMDocumentVersion[]**](CMDocumentVersion.md) | list of binary versions of this document |
**note_list** | [**\OpenAPI\Client\Model\CMDocumentNote[]**](CMDocumentNote.md) | list of checkout notes about this document |
**activity_list** | [**\OpenAPI\Client\Model\CMDocumentAudit[]**](CMDocumentAudit.md) | list of activities for the last two months of this document |
**type_description** | **string** | a description of the type of this document |
**filename** | **string** | the filename of this document in the DMS system |
**folder_id** | **string** | the folderId of this item in the DMS system |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
