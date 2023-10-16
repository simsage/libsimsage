# CMNewComment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**comment_level** | **str** |  | 
**comment** | **str** |  | 

## Example

```python
from openapi_client.models.cm_new_comment import CMNewComment

# TODO update the JSON string below
json = "{}"
# create an instance of CMNewComment from a JSON string
cm_new_comment_instance = CMNewComment.from_json(json)
# print the JSON string representation of the object
print CMNewComment.to_json()

# convert the object into a dict
cm_new_comment_dict = cm_new_comment_instance.to_dict()
# create an instance of CMNewComment from a dict
cm_new_comment_form_dict = cm_new_comment.from_dict(cm_new_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


