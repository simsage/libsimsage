# JsonMessage

A generic SimSage message class used throughout the system.  This class can be used to either send a success message (information) or an error message (error) but will never send you both at the same time.  Version might not always be set but is the version of the service-layer you're communicating with.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** | A possible error message, empty if information is set | 
**information** | **str** | An informational message, empty if error is set | 
**version** | **str** | The version of this service (can be empty) | 
**time** | **int** | The time this event occurred | 

## Example

```python
from openapi_client.models.json_message import JsonMessage

# TODO update the JSON string below
json = "{}"
# create an instance of JsonMessage from a JSON string
json_message_instance = JsonMessage.from_json(json)
# print the JSON string representation of the object
print JsonMessage.to_json()

# convert the object into a dict
json_message_dict = json_message_instance.to_dict()
# create an instance of JsonMessage from a dict
json_message_form_dict = json_message.from_dict(json_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


