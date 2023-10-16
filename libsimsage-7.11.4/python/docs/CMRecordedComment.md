# CMRecordedComment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **datetime** |  | 
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**comment_level** | **str** |  | 
**comment** | **str** |  | 
**user** | **str** |  | 

## Example

```python
from openapi_client.models.cm_recorded_comment import CMRecordedComment

# TODO update the JSON string below
json = "{}"
# create an instance of CMRecordedComment from a JSON string
cm_recorded_comment_instance = CMRecordedComment.from_json(json)
# print the JSON string representation of the object
print CMRecordedComment.to_json()

# convert the object into a dict
cm_recorded_comment_dict = cm_recorded_comment_instance.to_dict()
# create an instance of CMRecordedComment from a dict
cm_recorded_comment_form_dict = cm_recorded_comment.from_dict(cm_recorded_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


