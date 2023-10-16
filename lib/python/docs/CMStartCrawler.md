# CMStartCrawler

the source id and org/kb to process.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base (its guid id) | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**url_list** | **str** | an optional list of URLs (comma separated) | 

## Example

```python
from openapi_client.models.cm_start_crawler import CMStartCrawler

# TODO update the JSON string below
json = "{}"
# create an instance of CMStartCrawler from a JSON string
cm_start_crawler_instance = CMStartCrawler.from_json(json)
# print the JSON string representation of the object
print CMStartCrawler.to_json()

# convert the object into a dict
cm_start_crawler_dict = cm_start_crawler_instance.to_dict()
# create an instance of CMStartCrawler from a dict
cm_start_crawler_form_dict = cm_start_crawler.from_dict(cm_start_crawler_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


