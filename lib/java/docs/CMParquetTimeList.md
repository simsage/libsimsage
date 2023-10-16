

# CMParquetTimeList

This object is used to return a set of time-stamps (unix date-time items) related to the catalogue of inventory items inside SimSage for a given organisation/knowledge-base.  Each time-stamp represents a snapshot taken of the knowledge-base at a time by the user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id) |  |
|**kbId** | **String** | the knowledge-base id (its guid id) |  |
|**timeList** | [**List&lt;CMParquetItem&gt;**](CMParquetItem.md) | a list of unix-times for parquet items in the system |  |
|**totalCount** | **Integer** | the total (non paged) amount of items available |  |



