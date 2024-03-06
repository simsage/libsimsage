
# CMDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the organisation (its guid id) | 
**kbId** | **kotlin.String** | the knowledge-base id (its guid id) | 
**url** | **kotlin.String** | A unique URL for this document. | 
**urlId** | **kotlin.Int** | A unique URL-id for this document. | 
**origin** | **kotlin.String** | Where the document was sourced from (for external documents). | 
**title** | **kotlin.String** | The title of this document, can be empty. | 
**author** | **kotlin.String** | The author of this document, can be empty. | 
**documentType** | **kotlin.String** | The file extension of this document, its type. | 
**created** | **kotlin.Long** | a unix-timestamp for the creation date-time of this document | 
**uploaded** | **kotlin.Long** | a unix-timestamp for the upload date-time of this document to SimSage | 
**lastModified** | **kotlin.Long** | a unix-timestamp for the last-modified date-time of this document | 
**crawled** | **kotlin.Long** | a unix-timestamp for when a SimSage crawler last looked at this document | 
**converted** | **kotlin.Long** | a unix-timestamp for when a SimSage converter last looked at this document | 
**parsed** | **kotlin.Long** | a unix-timestamp for when a SimSage parser last looked at this document | 
**indexed** | **kotlin.Long** | a unix-timestamp for when a SimSage indexer last looked at this document | 
**previewed** | **kotlin.Long** | a unix-timestamp for when a SimSage image-converter last looked at this document | 
**changeHash** | **kotlin.String** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. | 
**contentHash** | **kotlin.String** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. | 
**sourceId** | **kotlin.Int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**parentUrl** | **kotlin.String** | a related url if there is parentage to be considered for an item | 
**acls** | [**kotlin.collections.List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) | 
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | a series of name values for other metadata values found in the container of this document | 
**numSentences** | **kotlin.Int** | the number of sentences in this document. | 
**numWords** | **kotlin.Int** | the total number of words in this document. | 
**numRelationships** | **kotlin.Int** | the total number of relationships in this document. | 
**binarySize** | **kotlin.Long** | the size of the original document&#39;s binary in bytes. | 
**textSize** | **kotlin.Int** | the size of the converted document&#39;s text in bytes. | 
**versionList** | [**kotlin.collections.List&lt;CMDocumentVersion&gt;**](CMDocumentVersion.md) | list of binary versions of this document | 
**noteList** | [**kotlin.collections.List&lt;CMDocumentNote&gt;**](CMDocumentNote.md) | list of checkout notes about this document | 
**activityList** | [**kotlin.collections.List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md) | list of activities for the last two months of this document | 
**typeDescription** | **kotlin.String** | a description of the type of this document | 
**filename** | **kotlin.String** | the filename of this document in the DMS system | 
**folderId** | **kotlin.String** | the folderId of this item in the DMS system | 



