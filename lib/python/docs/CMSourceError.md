# CMSourceError

A source error object (if set) indicating something is wrong with the source.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | The error message | 
**created** | **int** | When this error was set, a unix date-time stamp | 

## Example

```python
from openapi_client.models.cm_source_error import CMSourceError

# TODO update the JSON string below
json = "{}"
# create an instance of CMSourceError from a JSON string
cm_source_error_instance = CMSourceError.from_json(json)
# print the JSON string representation of the object
print CMSourceError.to_json()

# convert the object into a dict
cm_source_error_dict = cm_source_error_instance.to_dict()
# create an instance of CMSourceError from a dict
cm_source_error_form_dict = cm_source_error.from_dict(cm_source_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


