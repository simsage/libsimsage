
# CMKnowledgeBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the main organisation (its guid id) | 
**kbId** | **kotlin.String** | the knowledge-base id (its guid id) | 
**name** | **kotlin.String** | the name of this knowledge-base (must be unique within an organisation) | 
**email** | **kotlin.String** | the support email of the person to email with any UI generated questions | 
**securityId** | **kotlin.String** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. | 
**created** | **kotlin.Long** | when this knowledge-base was created, a unix date-time long | 
**maxQueriesPerDay** | **kotlin.Long** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. | 
**analyticsWindowInMonths** | **kotlin.Int** | How long to keep analytics for in months.  A value of zero (0) indicates forever | 
**enabled** | **kotlin.Boolean** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. | 
**operatorEnabled** | **kotlin.Boolean** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users. | 
**capacityWarnings** | **kotlin.Boolean** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. | 
**indexSchedule** | **kotlin.String** | the time-schedule for index-optimization, when active. | 
**lastIndexOptimizationTime** | **kotlin.Long** | the last time this triggered and ran as a unix date-time (read only) | 



