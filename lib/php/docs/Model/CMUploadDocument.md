# # CMUploadDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **string** | the type of this class, just in case this object is encrypted |
**organisation_id** | **string** | the organisation (its guid id) this document should go into. |
**kb_id** | **string** | the knowledge-base (its guid id) this document should go into. |
**sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. |
**url** | **string** | A unique URL for this document. |
**mime_type** | **string** | The mime-type of this document, must be a known-datatype to SimSage. |
**puid** | **string** | The Pronom Unique ID for this document. |
**acls** | **string** | A list of security permission for this document.  Can be empty (ie. no security applied). |
**title** | **string** | The title of this document, can be empty. |
**author** | **string** | The author of this document, can be empty. |
**change_hash** | **string** | A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. |
**content_hash** | **string** | A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. |
**data** | **string** | the base64 encoded content of this document.  Must be prefixed with &#39;;base64,&#39;, can be empty indicating the content wasn&#39;t valid. |
**binary_size** | **int** | the binary-size of the document in bytes if data is not set. |
**text** | **string** | the text content of the asset (if set). |
**created** | **int** | a unix-timestamp of the creation date-time of this document |
**last_modified** | **int** | a unix-timestamp of the last-modified date-time of this document |
**metadata** | **array<string,string>** | a series of name values for other metadata values found in the container of this document |
**categories** | [**\OpenAPI\Client\Model\MDMetadataMapping[]**](MDMetadataMapping.md) | A list of special SimSage metadata categories for matching this document with.  Can be empty. |
**size** | **int** | The size of this document (the original) in bytes |
**template** | **string** | A render template for this document.  This is only appropriate for Database and RESTful type sources. |
**encrypted** | **bool** | Do we need to add transport encryption |
**seed** | **int** | The seed used if encrypted |
**run_id** | **int** | the id (a unix timestamp) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
