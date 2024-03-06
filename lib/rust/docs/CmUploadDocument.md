# CmUploadDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **String** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **String** | the organisation (its guid id) this document should go into. | 
**kb_id** | **String** | the knowledge-base (its guid id) this document should go into. | 
**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **i32** | the source-id of this crawler (ie. the crawler's id) this document came from. | 
**url** | **String** | A unique URL for this document. | 
**mime_type** | **String** | The mime-type of this document, must be a known-datatype to SimSage. | 
**puid** | **String** | The Pronom Unique ID for this document. | 
**acls** | **String** | A list of security permission for this document.  Can be empty (ie. no security applied). | 
**title** | **String** | The title of this document, can be empty. | 
**author** | **String** | The author of this document, can be empty. | 
**change_hash** | **String** | A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. | 
**content_hash** | **String** | A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. | 
**data** | **String** | the base64 encoded content of this document.  Must be prefixed with ';base64,', can be empty indicating the content wasn't valid. | 
**binary_size** | **i32** | the binary-size of the document in bytes if data is not set. | 
**text** | **String** | the text content of the asset (if set). | 
**created** | **i64** | a unix-timestamp of the creation date-time of this document | 
**last_modified** | **i64** | a unix-timestamp of the last-modified date-time of this document | 
**metadata** | **::std::collections::HashMap<String, String>** | a series of name values for other metadata values found in the container of this document | 
**categories** | [**Vec<crate::models::MdMetadataMapping>**](MDMetadataMapping.md) | A list of special SimSage metadata categories for matching this document with.  Can be empty. | 
**size** | **i64** | The size of this document (the original) in bytes | 
**template** | **String** | A render template for this document.  This is only appropriate for Database and RESTful type sources. | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **i32** | The seed used if encrypted | 
**run_id** | **i64** | the id (a unix timestamp) of the current 'go through the source once'.  This is a unique per-run identifier. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


