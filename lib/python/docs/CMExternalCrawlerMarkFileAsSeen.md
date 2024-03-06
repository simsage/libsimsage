# CMExternalCrawlerMarkFileAsSeen

An mark-file-as-seen object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object_type** | **str** | the type of this class, just in case this object is encrypted | 
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**sid** | **str** | the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**asset** | [**Asset**](Asset.md) |  | 
**encrypted** | **bool** | Do we need to add transport encryption | 
**seed** | **int** | The seed used if encrypted | 

## Example

```python
from openapi_client.models.cm_external_crawler_mark_file_as_seen import CMExternalCrawlerMarkFileAsSeen

# TODO update the JSON string below
json = "{}"
# create an instance of CMExternalCrawlerMarkFileAsSeen from a JSON string
cm_external_crawler_mark_file_as_seen_instance = CMExternalCrawlerMarkFileAsSeen.from_json(json)
# print the JSON string representation of the object
print CMExternalCrawlerMarkFileAsSeen.to_json()

# convert the object into a dict
cm_external_crawler_mark_file_as_seen_dict = cm_external_crawler_mark_file_as_seen_instance.to_dict()
# create an instance of CMExternalCrawlerMarkFileAsSeen from a dict
cm_external_crawler_mark_file_as_seen_form_dict = cm_external_crawler_mark_file_as_seen.from_dict(cm_external_crawler_mark_file_as_seen_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


