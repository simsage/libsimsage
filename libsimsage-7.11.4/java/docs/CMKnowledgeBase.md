

# CMKnowledgeBase

A knowledge-base is SimSage's representation of a list of information silos belonging to an organisation.  A knowledge-base represents a second level of isolation between data in SimSage.  The first level is an Organisation.  Each organisation in SimSage has a list of knowledge-bases, strictly isolated from each other.  Each knowledge-base in turn can have many sources (information collectors that add items to a knowledge-base like a file-crawler, or a web-crawler)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the main organisation (its guid id) |  |
|**kbId** | **String** | the knowledge-base id (its guid id) |  |
|**name** | **String** | the name of this knowledge-base (must be unique within an organisation) |  |
|**email** | **String** | the support email of the person to email with any UI generated questions |  |
|**securityId** | **String** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. |  |
|**created** | **Long** | when this knowledge-base was created, a unix date-time long |  |
|**maxQueriesPerDay** | **Long** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. |  |
|**analyticsWindowInMonths** | **Integer** | How long to keep analytics for in months.  A value of zero (0) indicates forever |  |
|**enabled** | **Boolean** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. |  |
|**operatorEnabled** | **Boolean** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users. |  |
|**capacityWarnings** | **Boolean** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. |  |
|**indexSchedule** | **String** | the time-schedule for index-optimization, when active. |  |
|**lastIndexOptimizationTime** | **Long** | the last time this triggered and ran as a unix date-time (read only) |  |



