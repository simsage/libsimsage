# CMUploadDocument
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **objectType** | **String** | the type of this class, just in case this object is encrypted | [default to null] |
| **organisationId** | **String** | the organisation (its guid id) this document should go into. | [default to null] |
| **kbId** | **String** | the knowledge-base (its guid id) this document should go into. | [default to null] |
| **sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | [default to null] |
| **sourceId** | **Integer** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. | [default to null] |
| **url** | **String** | A unique URL for this document. | [default to null] |
| **mimeType** | **String** | The mime-type of this document, must be a known-datatype to SimSage. | [default to null] |
| **puid** | **String** | The Pronom Unique ID for this document. | [default to null] |
| **acls** | **String** | A list of security permission for this document.  Can be empty (ie. no security applied). | [default to null] |
| **title** | **String** | The title of this document, can be empty. | [default to null] |
| **author** | **String** | The author of this document, can be empty. | [default to null] |
| **changeHash** | **String** | A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. | [default to null] |
| **contentHash** | **String** | A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. | [default to null] |
| **data** | **String** | the base64 encoded content of this document.  Must be prefixed with &#39;;base64,&#39;, can be empty indicating the content wasn&#39;t valid. | [default to null] |
| **binarySize** | **Integer** | the binary-size of the document in bytes if data is not set. | [default to null] |
| **text** | **String** | the text content of the asset (if set). | [default to null] |
| **created** | **Long** | a unix-timestamp of the creation date-time of this document | [default to null] |
| **lastModified** | **Long** | a unix-timestamp of the last-modified date-time of this document | [default to null] |
| **metadata** | **Map** | a series of name values for other metadata values found in the container of this document | [default to null] |
| **categories** | [**List**](MDMetadataMapping.md) | A list of special SimSage metadata categories for matching this document with.  Can be empty. | [default to null] |
| **size** | **Long** | The size of this document (the original) in bytes | [default to null] |
| **template** | **String** | A render template for this document.  This is only appropriate for Database and RESTful type sources. | [default to null] |
| **encrypted** | **Boolean** | Do we need to add transport encryption | [default to null] |
| **seed** | **Integer** | The seed used if encrypted | [default to null] |
| **runId** | **Long** | the id (a unix timestamp) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

