

# CMDocument

A document is the main data carrying entity in SimSage.  A document can literally be a document like a pdf file found on a file-server, or a database-record, or something captured from a remote system like a web-page, or an image on a web-page.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id) |  |
|**kbId** | **String** | the knowledge-base id (its guid id) |  |
|**url** | **String** | A unique URL for this document. |  |
|**urlId** | **Integer** | A unique URL-id for this document. |  |
|**origin** | **String** | Where the document was sourced from (for external documents). |  |
|**title** | **String** | The title of this document, can be empty. |  |
|**author** | **String** | The author of this document, can be empty. |  |
|**documentType** | **String** | The file extension of this document, its type. |  |
|**created** | **Long** | a unix-timestamp for the creation date-time of this document |  |
|**uploaded** | **Long** | a unix-timestamp for the upload date-time of this document to SimSage |  |
|**lastModified** | **Long** | a unix-timestamp for the last-modified date-time of this document |  |
|**crawled** | **Long** | a unix-timestamp for when a SimSage crawler last looked at this document |  |
|**converted** | **Long** | a unix-timestamp for when a SimSage converter last looked at this document |  |
|**parsed** | **Long** | a unix-timestamp for when a SimSage parser last looked at this document |  |
|**indexed** | **Long** | a unix-timestamp for when a SimSage indexer last looked at this document |  |
|**previewed** | **Long** | a unix-timestamp for when a SimSage image-converter last looked at this document |  |
|**changeHash** | **String** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. |  |
|**contentHash** | **String** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) |  |
|**parentUrl** | **String** | a related url if there is parentage to be considered for an item |  |
|**acls** | [**List&lt;CMDocumentAcl&gt;**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) |  |
|**metadata** | **Map&lt;String, String&gt;** | a series of name values for other metadata values found in the container of this document |  |
|**numSentences** | **Integer** | the number of sentences in this document. |  |
|**numWords** | **Integer** | the total number of words in this document. |  |
|**numRelationships** | **Integer** | the total number of relationships in this document. |  |
|**binarySize** | **Long** | the size of the original document&#39;s binary in bytes. |  |
|**textSize** | **Integer** | the size of the converted document&#39;s text in bytes. |  |
|**versionList** | [**List&lt;CMDocumentVersion&gt;**](CMDocumentVersion.md) | list of binary versions of this document |  |
|**noteList** | [**List&lt;CMDocumentNote&gt;**](CMDocumentNote.md) | list of checkout notes about this document |  |
|**activityList** | [**List&lt;CMDocumentAudit&gt;**](CMDocumentAudit.md) | list of activities for the last two months of this document |  |
|**typeDescription** | **String** | a description of the type of this document |  |
|**filename** | **String** | the filename of this document in the DMS system |  |
|**folderId** | **String** | the folderId of this item in the DMS system |  |



