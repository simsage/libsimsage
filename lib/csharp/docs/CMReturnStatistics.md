# Org.OpenAPITools.Model.CMReturnStatistics
This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id) | 
**KbId** | **string** | the knowledge-base id (its guid id) | 
**Year** | **int** | the year of the request | 
**Month** | **int** | the month of the request | 
**AccessFrequency** | **int** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. | 
**QueryWordFrequency** | **Dictionary&lt;string, int&gt;** | The top list of queries (the strings) and their frequencies | 
**GeneralStatistics** | **Dictionary&lt;string, long&gt;** | Some more general statistics (eg. number of documents) and their frequencies | 
**FileTypeStatistics** | **Dictionary&lt;string, int&gt;** | The breakdown of file-types (by file extension) and their frequencies | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

