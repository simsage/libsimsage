
# CMReturnStatistics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the organisation (its guid id) | 
**kbId** | **kotlin.String** | the knowledge-base id (its guid id) | 
**year** | **kotlin.Int** | the year of the request | 
**month** | **kotlin.Int** | the month of the request | 
**accessFrequency** | **kotlin.Int** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. | 
**queryWordFrequency** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt;** | The top list of queries (the strings) and their frequencies | 
**generalStatistics** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Long&gt;** | Some more general statistics (eg. number of documents) and their frequencies | 
**fileTypeStatistics** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt;** | The breakdown of file-types (by file extension) and their frequencies | 



