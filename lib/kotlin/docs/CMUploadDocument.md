
# CMUploadDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objectType** | **kotlin.String** | the type of this class, just in case this object is encrypted | 
**organisationId** | **kotlin.String** | the organisation (its guid id) this document should go into. | 
**kbId** | **kotlin.String** | the knowledge-base (its guid id) this document should go into. | 
**sid** | **kotlin.String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**sourceId** | **kotlin.Int** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. | 
**url** | **kotlin.String** | A unique URL for this document. | 
**mimeType** | **kotlin.String** | The mime-type of this document, must be a known-datatype to SimSage. | 
**puid** | **kotlin.String** | The Pronom Unique ID for this document. | 
**acls** | **kotlin.String** | A list of security permission for this document.  Can be empty (ie. no security applied). | 
**title** | **kotlin.String** | The title of this document, can be empty. | 
**author** | **kotlin.String** | The author of this document, can be empty. | 
**changeHash** | **kotlin.String** | A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. | 
**contentHash** | **kotlin.String** | A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. | 
**&#x60;data&#x60;** | **kotlin.String** | the base64 encoded content of this document.  Must be prefixed with &#39;;base64,&#39;, can be empty indicating the content wasn&#39;t valid. | 
**binarySize** | **kotlin.Int** | the binary-size of the document in bytes if data is not set. | 
**text** | **kotlin.String** | the text content of the asset (if set). | 
**created** | **kotlin.Long** | a unix-timestamp of the creation date-time of this document | 
**lastModified** | **kotlin.Long** | a unix-timestamp of the last-modified date-time of this document | 
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | a series of name values for other metadata values found in the container of this document | 
**categories** | [**kotlin.collections.List&lt;MDCategory&gt;**](MDCategory.md) | A list of special SimSage metadata categories for matching this document with.  Can be empty. | 
**propertySize** | **kotlin.Long** | The size of this document (the original) in bytes | 
**template** | **kotlin.String** | A render template for this document.  This is only appropriate for Database and RESTful type sources. | 
**encrypted** | **kotlin.Boolean** | Do we need to add transport encryption | 
**seed** | **kotlin.Int** | The seed used if encrypted | 
**runId** | **kotlin.String** | the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. | 



