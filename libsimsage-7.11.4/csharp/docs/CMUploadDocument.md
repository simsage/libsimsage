# Org.OpenAPITools.Model.CMUploadDocument
An external document representation object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ObjectType** | **string** | the type of this class, just in case this object is encrypted | 
**OrganisationId** | **string** | the organisation (its guid id) this document should go into. | 
**KbId** | **string** | the knowledge-base (its guid id) this document should go into. | 
**Sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**SourceId** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document came from. | 
**Url** | **string** | A unique URL for this document. | 
**MimeType** | **string** | The mime-type of this document, must be a known-datatype to SimSage. | 
**Puid** | **string** | The Pronom Unique ID for this document. | 
**Acls** | **string** | A list of security permission for this document.  Can be empty (ie. no security applied). | 
**Title** | **string** | The title of this document, can be empty. | 
**Author** | **string** | The author of this document, can be empty. | 
**ChangeHash** | **string** | A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. | 
**ContentHash** | **string** | A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. | 
**Data** | **string** | the base64 encoded content of this document.  Must be prefixed with &#39;;base64,&#39;, can be empty indicating the content wasn&#39;t valid. | 
**BinarySize** | **int** | the binary-size of the document in bytes if data is not set. | 
**Text** | **string** | the text content of the asset (if set). | 
**Created** | **long** | a unix-timestamp of the creation date-time of this document | 
**LastModified** | **long** | a unix-timestamp of the last-modified date-time of this document | 
**Metadata** | **Dictionary&lt;string, string&gt;** | a series of name values for other metadata values found in the container of this document | 
**Categories** | [**List&lt;MDCategory&gt;**](MDCategory.md) | A list of special SimSage metadata categories for matching this document with.  Can be empty. | 
**Size** | **long** | The size of this document (the original) in bytes | 
**Template** | **string** | A render template for this document.  This is only appropriate for Database and RESTful type sources. | 
**Encrypted** | **bool** | Do we need to add transport encryption | 
**Seed** | **int** | The seed used if encrypted | 
**RunId** | **string** | the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

