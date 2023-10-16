# CMDocumentTypeFrequency

An entity for holding document type and a count for that type.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_type** | **str** | The file extension of a document, its type. | 
**count** | **int** | The count of this type in SimSage. | 

## Example

```python
from openapi_client.models.cm_document_type_frequency import CMDocumentTypeFrequency

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentTypeFrequency from a JSON string
cm_document_type_frequency_instance = CMDocumentTypeFrequency.from_json(json)
# print the JSON string representation of the object
print CMDocumentTypeFrequency.to_json()

# convert the object into a dict
cm_document_type_frequency_dict = cm_document_type_frequency_instance.to_dict()
# create an instance of CMDocumentTypeFrequency from a dict
cm_document_type_frequency_form_dict = cm_document_type_frequency.from_dict(cm_document_type_frequency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


