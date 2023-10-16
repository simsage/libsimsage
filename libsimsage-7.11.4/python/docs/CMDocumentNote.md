# CMDocumentNote

A note attached to a document.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**url** | **str** | The unique URL of a document. | 
**note_id** | **int** | The id of the note, starting at 1 note of 0 means create a new note | 
**note_text** | **str** | The text of the note | 
**user_id** | **str** | The user&#39;s id | 
**email** | **str** | the email address of the user that made the change | 
**created** | **int** | a unix-timestamp of the creation date-time of this record | 

## Example

```python
from openapi_client.models.cm_document_note import CMDocumentNote

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentNote from a JSON string
cm_document_note_instance = CMDocumentNote.from_json(json)
# print the JSON string representation of the object
print CMDocumentNote.to_json()

# convert the object into a dict
cm_document_note_dict = cm_document_note_instance.to_dict()
# create an instance of CMDocumentNote from a dict
cm_document_note_form_dict = cm_document_note.from_dict(cm_document_note_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


