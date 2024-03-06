# CmReturnStatistics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | 
**kb_id** | **String** | the knowledge-base id (its guid id) | 
**year** | **i32** | the year of the request | 
**month** | **i32** | the month of the request | 
**access_frequency** | **i32** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. | 
**query_word_frequency** | **::std::collections::HashMap<String, i32>** | The top list of queries (the strings) and their frequencies | 
**general_statistics** | **::std::collections::HashMap<String, i64>** | Some more general statistics (eg. number of documents) and their frequencies | 
**file_type_statistics** | **::std::collections::HashMap<String, i32>** | The breakdown of file-types (by file extension) and their frequencies | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


