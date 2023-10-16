# Org.OpenAPITools.Model.CMKnowledgeBase
A knowledge-base is SimSage's representation of a list of information silos belonging to an organisation.  A knowledge-base represents a second level of isolation between data in SimSage.  The first level is an Organisation.  Each organisation in SimSage has a list of knowledge-bases, strictly isolated from each other.  Each knowledge-base in turn can have many sources (information collectors that add items to a knowledge-base like a file-crawler, or a web-crawler)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the main organisation (its guid id) | 
**KbId** | **string** | the knowledge-base id (its guid id) | 
**Name** | **string** | the name of this knowledge-base (must be unique within an organisation) | 
**Email** | **string** | the support email of the person to email with any UI generated questions | 
**SecurityId** | **string** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. | 
**Created** | **long** | when this knowledge-base was created, a unix date-time long | 
**MaxQueriesPerDay** | **long** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. | 
**AnalyticsWindowInMonths** | **int** | How long to keep analytics for in months.  A value of zero (0) indicates forever | 
**Enabled** | **bool** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. | 
**OperatorEnabled** | **bool** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users. | 
**CapacityWarnings** | **bool** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. | 
**IndexSchedule** | **string** | the time-schedule for index-optimization, when active. | 
**LastIndexOptimizationTime** | **long** | the last time this triggered and ran as a unix date-time (read only) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

