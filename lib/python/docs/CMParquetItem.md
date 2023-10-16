# CMParquetItem

A single parquet item, a name with a timestamp.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | the name / type of item | 
**time** | **int** | a unix-time for this parquet item | 

## Example

```python
from openapi_client.models.cm_parquet_item import CMParquetItem

# TODO update the JSON string below
json = "{}"
# create an instance of CMParquetItem from a JSON string
cm_parquet_item_instance = CMParquetItem.from_json(json)
# print the JSON string representation of the object
print CMParquetItem.to_json()

# convert the object into a dict
cm_parquet_item_dict = cm_parquet_item_instance.to_dict()
# create an instance of CMParquetItem from a dict
cm_parquet_item_form_dict = cm_parquet_item.from_dict(cm_parquet_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


