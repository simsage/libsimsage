# CMReturnStatistics
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the organisation (its guid id) | [default to null] |
| **kbId** | **String** | the knowledge-base id (its guid id) | [default to null] |
| **year** | **Integer** | the year of the request | [default to null] |
| **month** | **Integer** | the month of the request | [default to null] |
| **accessFrequency** | **Integer** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. | [default to null] |
| **queryWordFrequency** | **Map** | The top list of queries (the strings) and their frequencies | [default to null] |
| **generalStatistics** | **Map** | Some more general statistics (eg. number of documents) and their frequencies | [default to null] |
| **fileTypeStatistics** | **Map** | The breakdown of file-types (by file extension) and their frequencies | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

