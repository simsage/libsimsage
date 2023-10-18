# CMKnowledgeBase
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the main organisation (its guid id) | [default to null] |
| **kbId** | **String** | the knowledge-base id (its guid id) | [default to null] |
| **name** | **String** | the name of this knowledge-base (must be unique within an organisation) | [default to null] |
| **email** | **String** | the support email of the person to email with any UI generated questions | [default to null] |
| **securityId** | **String** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. | [default to null] |
| **created** | **Long** | when this knowledge-base was created, a unix date-time long | [default to null] |
| **maxQueriesPerDay** | **Long** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. | [default to null] |
| **analyticsWindowInMonths** | **Integer** | How long to keep analytics for in months.  A value of zero (0) indicates forever | [default to null] |
| **enabled** | **Boolean** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. | [default to null] |
| **operatorEnabled** | **Boolean** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users. | [default to null] |
| **capacityWarnings** | **Boolean** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. | [default to null] |
| **indexSchedule** | **String** | the time-schedule for index-optimization, when active. | [default to null] |
| **lastIndexOptimizationTime** | **Long** | the last time this triggered and ran as a unix date-time (read only) | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

