# CMVersion

A generic version object.  Returns the version of whatever service you're communicating with, part of the /version commands of each micro-service.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **str** | version of this service | 

## Example

```python
from openapi_client.models.cm_version import CMVersion

# TODO update the JSON string below
json = "{}"
# create an instance of CMVersion from a JSON string
cm_version_instance = CMVersion.from_json(json)
# print the JSON string representation of the object
print CMVersion.to_json()

# convert the object into a dict
cm_version_dict = cm_version_instance.to_dict()
# create an instance of CMVersion from a dict
cm_version_form_dict = cm_version.from_dict(cm_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


