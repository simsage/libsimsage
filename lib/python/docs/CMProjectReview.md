# CMProjectReview


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_definition** | [**CMProjectDefinition**](CMProjectDefinition.md) |  | 
**task_info** | [**CMTaskInfo**](CMTaskInfo.md) |  | 

## Example

```python
from openapi_client.models.cm_project_review import CMProjectReview

# TODO update the JSON string below
json = "{}"
# create an instance of CMProjectReview from a JSON string
cm_project_review_instance = CMProjectReview.from_json(json)
# print the JSON string representation of the object
print CMProjectReview.to_json()

# convert the object into a dict
cm_project_review_dict = cm_project_review_instance.to_dict()
# create an instance of CMProjectReview from a dict
cm_project_review_form_dict = cm_project_review.from_dict(cm_project_review_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


