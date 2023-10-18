# CMDocument
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the organisation (its guid id) | [default to null] |
| **kbId** | **String** | the knowledge-base id (its guid id) | [default to null] |
| **url** | **String** | A unique URL for this document. | [default to null] |
| **urlId** | **Integer** | A unique URL-id for this document. | [default to null] |
| **origin** | **String** | Where the document was sourced from (for external documents). | [default to null] |
| **title** | **String** | The title of this document, can be empty. | [default to null] |
| **author** | **String** | The author of this document, can be empty. | [default to null] |
| **documentType** | **String** | The file extension of this document, its type. | [default to null] |
| **created** | **Long** | a unix-timestamp for the creation date-time of this document | [default to null] |
| **uploaded** | **Long** | a unix-timestamp for the upload date-time of this document to SimSage | [default to null] |
| **lastModified** | **Long** | a unix-timestamp for the last-modified date-time of this document | [default to null] |
| **crawled** | **Long** | a unix-timestamp for when a SimSage crawler last looked at this document | [default to null] |
| **converted** | **Long** | a unix-timestamp for when a SimSage converter last looked at this document | [default to null] |
| **parsed** | **Long** | a unix-timestamp for when a SimSage parser last looked at this document | [default to null] |
| **indexed** | **Long** | a unix-timestamp for when a SimSage indexer last looked at this document | [default to null] |
| **previewed** | **Long** | a unix-timestamp for when a SimSage image-converter last looked at this document | [default to null] |
| **changeHash** | **String** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. | [default to null] |
| **contentHash** | **String** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. | [default to null] |
| **sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) | [default to null] |
| **parentUrl** | **String** | a related url if there is parentage to be considered for an item | [default to null] |
| **acls** | [**List**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) | [default to null] |
| **metadata** | **Map** | a series of name values for other metadata values found in the container of this document | [default to null] |
| **numSentences** | **Integer** | the number of sentences in this document. | [default to null] |
| **numWords** | **Integer** | the total number of words in this document. | [default to null] |
| **numRelationships** | **Integer** | the total number of relationships in this document. | [default to null] |
| **binarySize** | **Long** | the size of the original document&#39;s binary in bytes. | [default to null] |
| **textSize** | **Integer** | the size of the converted document&#39;s text in bytes. | [default to null] |
| **versionList** | [**List**](CMDocumentVersion.md) | list of binary versions of this document | [default to null] |
| **noteList** | [**List**](CMDocumentNote.md) | list of checkout notes about this document | [default to null] |
| **activityList** | [**List**](CMDocumentAudit.md) | list of activities for the last two months of this document | [default to null] |
| **typeDescription** | **String** | a description of the type of this document | [default to null] |
| **filename** | **String** | the filename of this document in the DMS system | [default to null] |
| **folderId** | **String** | the folderId of this item in the DMS system | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

