# # CMKnowledgeBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the main organisation (its guid id) |
**kb_id** | **string** | the knowledge-base id (its guid id) |
**name** | **string** | the name of this knowledge-base (must be unique within an organisation) |
**email** | **string** | the support email of the person to email with any UI generated questions |
**security_id** | **string** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. |
**created** | **int** | when this knowledge-base was created, a unix date-time long |
**max_queries_per_day** | **int** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. |
**analytics_window_in_months** | **int** | How long to keep analytics for in months.  A value of zero (0) indicates forever |
**enabled** | **bool** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. |
**operator_enabled** | **bool** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users. |
**capacity_warnings** | **bool** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. |
**index_schedule** | **string** | the time-schedule for index-optimization, when active. |
**last_index_optimization_time** | **int** | the last time this triggered and ran as a unix date-time (read only) |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
