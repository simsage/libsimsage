# CMCrawlerStatusTask


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_info** | [**CMTaskInfo**](CMTaskInfo.md) |  | 
**detail** | [**CMCrawlerStatus**](CMCrawlerStatus.md) |  | 

## Example

```python
from openapi_client.models.cm_crawler_status_task import CMCrawlerStatusTask

# TODO update the JSON string below
json = "{}"
# create an instance of CMCrawlerStatusTask from a JSON string
cm_crawler_status_task_instance = CMCrawlerStatusTask.from_json(json)
# print the JSON string representation of the object
print CMCrawlerStatusTask.to_json()

# convert the object into a dict
cm_crawler_status_task_dict = cm_crawler_status_task_instance.to_dict()
# create an instance of CMCrawlerStatusTask from a dict
cm_crawler_status_task_form_dict = cm_crawler_status_task.from_dict(cm_crawler_status_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


