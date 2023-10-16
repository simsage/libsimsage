# # CMReturnStatistics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the organisation (its guid id) |
**kb_id** | **string** | the knowledge-base id (its guid id) |
**year** | **int** | the year of the request |
**month** | **int** | the month of the request |
**access_frequency** | **int** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. |
**query_word_frequency** | **array<string,int>** | The top list of queries (the strings) and their frequencies |
**general_statistics** | **array<string,int>** | Some more general statistics (eg. number of documents) and their frequencies |
**file_type_statistics** | **array<string,int>** | The breakdown of file-types (by file extension) and their frequencies |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
