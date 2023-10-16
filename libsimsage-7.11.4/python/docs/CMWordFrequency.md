# CMWordFrequency

A word or piece of text with a frequency counter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**word** | **str** | the word | 
**frequency** | **int** | its frequency | 

## Example

```python
from openapi_client.models.cm_word_frequency import CMWordFrequency

# TODO update the JSON string below
json = "{}"
# create an instance of CMWordFrequency from a JSON string
cm_word_frequency_instance = CMWordFrequency.from_json(json)
# print the JSON string representation of the object
print CMWordFrequency.to_json()

# convert the object into a dict
cm_word_frequency_dict = cm_word_frequency_instance.to_dict()
# create an instance of CMWordFrequency from a dict
cm_word_frequency_form_dict = cm_word_frequency.from_dict(cm_word_frequency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


