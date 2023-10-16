# Org.OpenAPITools.Model.CMDocumentRelationship
A document that related to this document in some fashion (parent or child)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UrlId** | **int** | the url-id of this document | 
**IsChild** | **bool** | if true, this is a child relationship, otherwise a parent relationship | 
**RelatedUrlId** | **int** | the related document&#39;s id | 
**RelatedUrl** | **string** | the url of the related document | 
**WebUrl** | **string** | the web-url (if set) if there is a web-link for this document | 
**Title** | **string** | the title of the related document for display | 
**BinarySize** | **long** | size in bytes of the related document | 
**DocumentType** | **string** | the type of the related document | 
**Created** | **long** | The unix creation date-time of the related item | 
**LastModified** | **long** | The unix last-modified date-time of the related item | 
**Child** | **bool** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

