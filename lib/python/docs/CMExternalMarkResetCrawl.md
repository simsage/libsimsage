# CMExternalMarkResetCrawl

An external image representation object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **str** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**sid** | **str** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**delta_reset_roots** | **List[str]** | optional for multi root delta crawlers the ids of the roots to reset | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **int** | The seed used if encrypted | 

## Example

```python
from openapi_client.models.cm_external_mark_reset_crawl import CMExternalMarkResetCrawl

# TODO update the JSON string below
json = "{}"
# create an instance of CMExternalMarkResetCrawl from a JSON string
cm_external_mark_reset_crawl_instance = CMExternalMarkResetCrawl.from_json(json)
# print the JSON string representation of the object
print CMExternalMarkResetCrawl.to_json()

# convert the object into a dict
cm_external_mark_reset_crawl_dict = cm_external_mark_reset_crawl_instance.to_dict()
# create an instance of CMExternalMarkResetCrawl from a dict
cm_external_mark_reset_crawl_form_dict = cm_external_mark_reset_crawl.from_dict(cm_external_mark_reset_crawl_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


