# CMFailedSourceDocument
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the main organisation (its guid id) for this source/crawler | [default to null] |
| **kbId** | **String** | the knowledge-base id (its guid id) for this source/crawler | [default to null] |
| **sourceId** | **Integer** | the source-id, primary key of the source | [default to null] |
| **sourceSystemId** | **String** | the unique id of the document in the source system, mostly same as web url | [default to null] |
| **webUrl** | **String** | the web url to access the document, can be different from url | [default to null] |
| **runId** | **Long** | the timestamp of the crawler run adding the exception | [default to null] |
| **errorMessage** | **String** | the error message added by the system | [default to null] |
| **encrypted** | **Boolean** | Do we need to add transport encryption | [default to null] |
| **seed** | **Integer** | The seed used if encrypted | [default to null] |
| **sid** | **String** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

