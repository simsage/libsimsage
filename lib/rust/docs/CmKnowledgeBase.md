# CmKnowledgeBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) | 
**kb_id** | **String** | the knowledge-base id (its guid id) | 
**name** | **String** | the name of this knowledge-base (must be unique within an organisation) | 
**email** | **String** | the support email of the person to email with any UI generated questions | 
**security_id** | **String** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. | 
**created** | **i64** | when this knowledge-base was created, a unix date-time long | 
**max_queries_per_day** | **i64** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. | 
**analytics_window_in_months** | **i32** | How long to keep analytics for in months.  A value of zero (0) indicates forever | 
**enabled** | **bool** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. | 
**operator_enabled** | **bool** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base's operator from interacting with end-users. | 
**capacity_warnings** | **bool** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. | 
**index_schedule** | **String** | the time-schedule for index-optimization, when active. | 
**last_index_optimization_time** | **i64** | the last time this triggered and ran as a unix date-time (read only) | 
**is_optimizing** | **bool** | is the index optimizer active? | 
**optimization_progress** | **i32** | how far along is the optimizer if it is active (0% to 100%) | 
**optimizing** | Option<**bool**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


