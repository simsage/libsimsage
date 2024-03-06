# CmDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | 
**kb_id** | **String** | the knowledge-base id (its guid id) | 
**url** | **String** | A unique URL for this document. | 
**url_id** | **i32** | A unique URL-id for this document. | 
**origin** | **String** | Where the document was sourced from (for external documents). | 
**title** | **String** | The title of this document, can be empty. | 
**author** | **String** | The author of this document, can be empty. | 
**document_type** | **String** | The file extension of this document, its type. | 
**created** | **i64** | a unix-timestamp for the creation date-time of this document | 
**uploaded** | **i64** | a unix-timestamp for the upload date-time of this document to SimSage | 
**last_modified** | **i64** | a unix-timestamp for the last-modified date-time of this document | 
**crawled** | **i64** | a unix-timestamp for when a SimSage crawler last looked at this document | 
**converted** | **i64** | a unix-timestamp for when a SimSage converter last looked at this document | 
**parsed** | **i64** | a unix-timestamp for when a SimSage parser last looked at this document | 
**indexed** | **i64** | a unix-timestamp for when a SimSage indexer last looked at this document | 
**previewed** | **i64** | a unix-timestamp for when a SimSage image-converter last looked at this document | 
**change_hash** | **String** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. | 
**content_hash** | **String** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) | 
**parent_url** | **String** | a related url if there is parentage to be considered for an item | 
**acls** | [**Vec<crate::models::CmDocumentAcl>**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) | 
**metadata** | **::std::collections::HashMap<String, String>** | a series of name values for other metadata values found in the container of this document | 
**num_sentences** | **i32** | the number of sentences in this document. | 
**num_words** | **i32** | the total number of words in this document. | 
**num_relationships** | **i32** | the total number of relationships in this document. | 
**binary_size** | **i64** | the size of the original document's binary in bytes. | 
**text_size** | **i32** | the size of the converted document's text in bytes. | 
**version_list** | [**Vec<crate::models::CmDocumentVersion>**](CMDocumentVersion.md) | list of binary versions of this document | 
**note_list** | [**Vec<crate::models::CmDocumentNote>**](CMDocumentNote.md) | list of checkout notes about this document | 
**activity_list** | [**Vec<crate::models::CmDocumentAudit>**](CMDocumentAudit.md) | list of activities for the last two months of this document | 
**type_description** | **String** | a description of the type of this document | 
**filename** | **String** | the filename of this document in the DMS system | 
**folder_id** | **String** | the folderId of this item in the DMS system | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


