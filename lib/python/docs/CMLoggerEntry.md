# CMLoggerEntry

This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | the main message of the log entry | 
**type** | **str** | the type of log entry (eg. Debug, Info, Warn, Error) | 
**service** | **str** | the name of the service that generated this log | 
**stack_trace** | **str** | the stack traces if applicable | 
**created** | **int** | unit date-time of this log | 

## Example

```python
from openapi_client.models.cm_logger_entry import CMLoggerEntry

# TODO update the JSON string below
json = "{}"
# create an instance of CMLoggerEntry from a JSON string
cm_logger_entry_instance = CMLoggerEntry.from_json(json)
# print the JSON string representation of the object
print CMLoggerEntry.to_json()

# convert the object into a dict
cm_logger_entry_dict = cm_logger_entry_instance.to_dict()
# create an instance of CMLoggerEntry from a dict
cm_logger_entry_form_dict = cm_logger_entry.from_dict(cm_logger_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


