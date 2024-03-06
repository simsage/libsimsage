# Org.OpenAPITools.Model.CMFailedSourceDocument
Description of an external document upload failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the main organisation (its guid id) for this source/crawler | 
**KbId** | **string** | the knowledge-base id (its guid id) for this source/crawler | 
**SourceId** | **int** | the source-id, primary key of the source | 
**SourceSystemId** | **string** | the unique id of the document in the source system, mostly same as web url | 
**WebUrl** | **string** | the web url to access the document, can be different from url | 
**RunId** | **long** | the timestamp of the crawler run adding the exception | 
**ErrorMessage** | **string** | the error message added by the system | 
**Encrypted** | **bool** | Do we need to add transport encryption | 
**Seed** | **int** | The seed used if encrypted | 
**Sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

