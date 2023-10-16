# CMCrawlerStatus


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**project_title** | **str** |  | 
**project_type** | **str** |  | 
**crawler_id** | **str** |  | 
**crawler_name** | **str** |  | 
**start_time** | **int** |  | 
**end_time** | **int** |  | 
**is_running** | **bool** |  | 
**specific_json** | **str** |  | 

## Example

```python
from openapi_client.models.cm_crawler_status import CMCrawlerStatus

# TODO update the JSON string below
json = "{}"
# create an instance of CMCrawlerStatus from a JSON string
cm_crawler_status_instance = CMCrawlerStatus.from_json(json)
# print the JSON string representation of the object
print CMCrawlerStatus.to_json()

# convert the object into a dict
cm_crawler_status_dict = cm_crawler_status_instance.to_dict()
# create an instance of CMCrawlerStatus from a dict
cm_crawler_status_form_dict = cm_crawler_status.from_dict(cm_crawler_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


