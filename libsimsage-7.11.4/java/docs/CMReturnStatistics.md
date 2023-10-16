

# CMReturnStatistics

This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id) |  |
|**kbId** | **String** | the knowledge-base id (its guid id) |  |
|**year** | **Integer** | the year of the request |  |
|**month** | **Integer** | the month of the request |  |
|**accessFrequency** | **Integer** | A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. |  |
|**queryWordFrequency** | **Map&lt;String, Integer&gt;** | The top list of queries (the strings) and their frequencies |  |
|**generalStatistics** | **Map&lt;String, Long&gt;** | Some more general statistics (eg. number of documents) and their frequencies |  |
|**fileTypeStatistics** | **Map&lt;String, Integer&gt;** | The breakdown of file-types (by file extension) and their frequencies |  |



