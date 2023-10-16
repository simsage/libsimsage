# CMCommentFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**comment_level** | **str** |  | 

## Example

```python
from openapi_client.models.cm_comment_filter import CMCommentFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CMCommentFilter from a JSON string
cm_comment_filter_instance = CMCommentFilter.from_json(json)
# print the JSON string representation of the object
print CMCommentFilter.to_json()

# convert the object into a dict
cm_comment_filter_dict = cm_comment_filter_instance.to_dict()
# create an instance of CMCommentFilter from a dict
cm_comment_filter_form_dict = cm_comment_filter.from_dict(cm_comment_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


