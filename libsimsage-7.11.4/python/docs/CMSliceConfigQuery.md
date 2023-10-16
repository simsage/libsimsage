# CMSliceConfigQuery


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | 
**token_list** | [**List[CMQueryToken]**](CMQueryToken.md) |  | 

## Example

```python
from openapi_client.models.cm_slice_config_query import CMSliceConfigQuery

# TODO update the JSON string below
json = "{}"
# create an instance of CMSliceConfigQuery from a JSON string
cm_slice_config_query_instance = CMSliceConfigQuery.from_json(json)
# print the JSON string representation of the object
print CMSliceConfigQuery.to_json()

# convert the object into a dict
cm_slice_config_query_dict = cm_slice_config_query_instance.to_dict()
# create an instance of CMSliceConfigQuery from a dict
cm_slice_config_query_form_dict = cm_slice_config_query.from_dict(cm_slice_config_query_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


