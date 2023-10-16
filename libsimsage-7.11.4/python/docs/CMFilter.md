# CMFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**knowledge_base** | **str** |  | 
**filetypes** | **List[str]** |  | [optional] 
**sources** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.cm_filter import CMFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CMFilter from a JSON string
cm_filter_instance = CMFilter.from_json(json)
# print the JSON string representation of the object
print CMFilter.to_json()

# convert the object into a dict
cm_filter_dict = cm_filter_instance.to_dict()
# create an instance of CMFilter from a dict
cm_filter_form_dict = cm_filter.from_dict(cm_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


