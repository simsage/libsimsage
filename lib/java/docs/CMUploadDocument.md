

# CMUploadDocument

An external document representation object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** | the type of this class, just in case this object is encrypted |  |
|**organisationId** | **String** | the organisation (its guid id) this document should go into. |  |
|**kbId** | **String** | the knowledge-base (its guid id) this document should go into. |  |
|**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |  |
|**sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. |  |
|**url** | **String** | A unique URL for this document. |  |
|**mimeType** | **String** | The mime-type of this document, must be a known-datatype to SimSage. |  |
|**puid** | **String** | The Pronom Unique ID for this document. |  |
|**acls** | **String** | A list of security permission for this document.  Can be empty (ie. no security applied). |  |
|**title** | **String** | The title of this document, can be empty. |  |
|**author** | **String** | The author of this document, can be empty. |  |
|**changeHash** | **String** | A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. |  |
|**contentHash** | **String** | A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. |  |
|**data** | **String** | the base64 encoded content of this document.  Must be prefixed with &#39;;base64,&#39;, can be empty indicating the content wasn&#39;t valid. |  |
|**binarySize** | **Integer** | the binary-size of the document in bytes if data is not set. |  |
|**text** | **String** | the text content of the asset (if set). |  |
|**created** | **Long** | a unix-timestamp of the creation date-time of this document |  |
|**lastModified** | **Long** | a unix-timestamp of the last-modified date-time of this document |  |
|**metadata** | **Map&lt;String, String&gt;** | a series of name values for other metadata values found in the container of this document |  |
|**categories** | [**List&lt;MDMetadataMapping&gt;**](MDMetadataMapping.md) | A list of special SimSage metadata categories for matching this document with.  Can be empty. |  |
|**size** | **Long** | The size of this document (the original) in bytes |  |
|**template** | **String** | A render template for this document.  This is only appropriate for Database and RESTful type sources. |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |
|**runId** | **Long** | the id (a unix timestamp) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. |  |



