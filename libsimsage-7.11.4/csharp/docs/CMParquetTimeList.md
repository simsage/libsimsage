# Org.OpenAPITools.Model.CMParquetTimeList
This object is used to return a set of time-stamps (unix date-time items) related to the catalogue of inventory items inside SimSage for a given organisation/knowledge-base.  Each time-stamp represents a snapshot taken of the knowledge-base at a time by the user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id) | 
**KbId** | **string** | the knowledge-base id (its guid id) | 
**TimeList** | [**List&lt;CMParquetItem&gt;**](CMParquetItem.md) | a list of unix-times for parquet items in the system | 
**TotalCount** | **int** | the total (non paged) amount of items available | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

