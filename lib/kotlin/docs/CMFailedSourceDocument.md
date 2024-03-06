
# CMFailedSourceDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the main organisation (its guid id) for this source/crawler | 
**kbId** | **kotlin.String** | the knowledge-base id (its guid id) for this source/crawler | 
**sourceId** | **kotlin.Int** | the source-id, primary key of the source | 
**sourceSystemId** | **kotlin.String** | the unique id of the document in the source system, mostly same as web url | 
**webUrl** | **kotlin.String** | the web url to access the document, can be different from url | 
**runId** | **kotlin.Long** | the timestamp of the crawler run adding the exception | 
**errorMessage** | **kotlin.String** | the error message added by the system | 
**encrypted** | **kotlin.Boolean** | Do we need to add transport encryption | 
**seed** | **kotlin.Int** | The seed used if encrypted | 
**sid** | **kotlin.String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | 



