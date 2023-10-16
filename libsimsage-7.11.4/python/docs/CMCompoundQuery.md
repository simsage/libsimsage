# CMCompoundQuery


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | 
**components** | [**List[CMSliceQueryDefinition]**](CMSliceQueryDefinition.md) |  | 

## Example

```python
from openapi_client.models.cm_compound_query import CMCompoundQuery

# TODO update the JSON string below
json = "{}"
# create an instance of CMCompoundQuery from a JSON string
cm_compound_query_instance = CMCompoundQuery.from_json(json)
# print the JSON string representation of the object
print CMCompoundQuery.to_json()

# convert the object into a dict
cm_compound_query_dict = cm_compound_query_instance.to_dict()
# create an instance of CMCompoundQuery from a dict
cm_compound_query_form_dict = cm_compound_query.from_dict(cm_compound_query_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


