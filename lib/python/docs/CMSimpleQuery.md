# CMSimpleQuery


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | 
**token_list** | [**List[CMQueryToken]**](CMQueryToken.md) |  | 

## Example

```python
from openapi_client.models.cm_simple_query import CMSimpleQuery

# TODO update the JSON string below
json = "{}"
# create an instance of CMSimpleQuery from a JSON string
cm_simple_query_instance = CMSimpleQuery.from_json(json)
# print the JSON string representation of the object
print CMSimpleQuery.to_json()

# convert the object into a dict
cm_simple_query_dict = cm_simple_query_instance.to_dict()
# create an instance of CMSimpleQuery from a dict
cm_simple_query_form_dict = cm_simple_query.from_dict(cm_simple_query_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


