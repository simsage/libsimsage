

# CMFailedSourceDocument

Description of an external document upload failure.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the main organisation (its guid id) for this source/crawler |  |
|**kbId** | **String** | the knowledge-base id (its guid id) for this source/crawler |  |
|**sourceId** | **Integer** | the source-id, primary key of the source |  |
|**sourceSystemId** | **String** | the unique id of the document in the source system, mostly same as web url |  |
|**webUrl** | **String** | the web url to access the document, can be different from url |  |
|**runId** | **Long** | the timestamp of the crawler run adding the exception |  |
|**errorMessage** | **String** | the error message added by the system |  |
|**encrypted** | **Boolean** | Do we need to add transport encryption |  |
|**seed** | **Integer** | The seed used if encrypted |  |
|**sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |  |



