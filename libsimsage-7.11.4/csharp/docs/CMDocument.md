# Org.OpenAPITools.Model.CMDocument
A document is the main data carrying entity in SimSage.  A document can literally be a document like a pdf file found on a file-server, or a database-record, or something captured from a remote system like a web-page, or an image on a web-page.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id) | 
**KbId** | **string** | the knowledge-base id (its guid id) | 
**Url** | **string** | A unique URL for this document. | 
**UrlId** | **int** | A unique URL-id for this document. | 
**Origin** | **string** | Where the document was sourced from (for external documents). | 
**Title** | **string** | The title of this document, can be empty. | 
**Author** | **string** | The author of this document, can be empty. | 
**DocumentType** | **string** | The file extension of this document, its type. | 
**Created** | **long** | a unix-timestamp for the creation date-time of this document | 
**Uploaded** | **long** | a unix-timestamp for the upload date-time of this document to SimSage | 
**LastModified** | **long** | a unix-timestamp for the last-modified date-time of this document | 
**Crawled** | **long** | a unix-timestamp for when a SimSage crawler last looked at this document | 
**Converted** | **long** | a unix-timestamp for when a SimSage converter last looked at this document | 
**Parsed** | **long** | a unix-timestamp for when a SimSage parser last looked at this document | 
**Indexed** | **long** | a unix-timestamp for when a SimSage indexer last looked at this document | 
**Previewed** | **long** | a unix-timestamp for when a SimSage image-converter last looked at this document | 
**ChangeHash** | **string** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. | 
**ContentHash** | **string** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. | 
**SourceId** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**ParentUrl** | **string** | a related url if there is parentage to be considered for an item | 
**Acls** | [**List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) | 
**Metadata** | **Dictionary&lt;string, string&gt;** | a series of name values for other metadata values found in the container of this document | 
**NumSentences** | **int** | the number of sentences in this document. | 
**NumWords** | **int** | the total number of words in this document. | 
**NumRelationships** | **int** | the total number of relationships in this document. | 
**BinarySize** | **long** | the size of the original document&#39;s binary in bytes. | 
**TextSize** | **int** | the size of the converted document&#39;s text in bytes. | 
**VersionList** | [**List&lt;CMDocumentVersion&gt;**](CMDocumentVersion.md) | list of binary versions of this document | 
**NoteList** | [**List&lt;CMDocumentNote&gt;**](CMDocumentNote.md) | list of checkout notes about this document | 
**ActivityList** | [**List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md) | list of activities for the last two months of this document | 
**TypeDescription** | **string** | a description of the type of this document | 
**Filename** | **string** | the filename of this document in the DMS system | 
**FolderId** | **string** | the folderId of this item in the DMS system | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

