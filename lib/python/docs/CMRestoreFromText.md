# CMRestoreFromText

an object with the text to restore from

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**base64_text** | **str** | the base64 text to restore from. | 
**file_type** | **str** | the file-type of the base64 text (must be text/plain) | 

## Example

```python
from openapi_client.models.cm_restore_from_text import CMRestoreFromText

# TODO update the JSON string below
json = "{}"
# create an instance of CMRestoreFromText from a JSON string
cm_restore_from_text_instance = CMRestoreFromText.from_json(json)
# print the JSON string representation of the object
print CMRestoreFromText.to_json()

# convert the object into a dict
cm_restore_from_text_dict = cm_restore_from_text_instance.to_dict()
# create an instance of CMRestoreFromText from a dict
cm_restore_from_text_form_dict = cm_restore_from_text.from_dict(cm_restore_from_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


