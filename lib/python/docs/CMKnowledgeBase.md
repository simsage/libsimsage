# CMKnowledgeBase

A knowledge-base is SimSage's representation of a list of information silos belonging to an organisation.  A knowledge-base represents a second level of isolation between data in SimSage.  The first level is an Organisation.  Each organisation in SimSage has a list of knowledge-bases, strictly isolated from each other.  Each knowledge-base in turn can have many sources (information collectors that add items to a knowledge-base like a file-crawler, or a web-crawler)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**name** | **str** | the name of this knowledge-base (must be unique within an organisation) | 
**email** | **str** | the support email of the person to email with any UI generated questions | 
**security_id** | **str** | the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. | 
**created** | **int** | when this knowledge-base was created, a unix date-time long | 
**max_queries_per_day** | **int** | limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. | 
**analytics_window_in_months** | **int** | How long to keep analytics for in months.  A value of zero (0) indicates forever | 
**enabled** | **bool** | a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. | 
**operator_enabled** | **bool** | a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users. | 
**capacity_warnings** | **bool** | All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. | 
**index_schedule** | **str** | the time-schedule for index-optimization, when active. | 
**last_index_optimization_time** | **int** | the last time this triggered and ran as a unix date-time (read only) | 

## Example

```python
from openapi_client.models.cm_knowledge_base import CMKnowledgeBase

# TODO update the JSON string below
json = "{}"
# create an instance of CMKnowledgeBase from a JSON string
cm_knowledge_base_instance = CMKnowledgeBase.from_json(json)
# print the JSON string representation of the object
print CMKnowledgeBase.to_json()

# convert the object into a dict
cm_knowledge_base_dict = cm_knowledge_base_instance.to_dict()
# create an instance of CMKnowledgeBase from a dict
cm_knowledge_base_form_dict = cm_knowledge_base.from_dict(cm_knowledge_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


