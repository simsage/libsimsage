# Org.OpenAPITools.Model.CMExternalCrawlerRenameFolder
An external image representation object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ObjectType** | **string** | the type of this class, just in case this object is encrypted | 
**OrganisationId** | **string** | the main organisation (its guid id) for this source/crawler | 
**KbId** | **string** | the knowledge-base id of this context item, a guid-string | 
**Sid** | **string** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**SourceId** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**OldFolderNameUrl** | **string** | the current document-folder name | 
**NewFolderNameUrl** | **string** | the new document-folder name | 
**Acls** | **string** | A list of security permission for the new document-folder.  Can be empty (ie. no security applied). | 
**Encrypted** | **bool** | Do we need to add transport encryption | 
**Seed** | **int** | The seed used if encrypted | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

