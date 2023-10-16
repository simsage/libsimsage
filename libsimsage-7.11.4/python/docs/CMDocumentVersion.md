# CMDocumentVersion

A version object description for a binary-document.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | The unique URL of this document. | 
**version** | **int** | version of this binary | 
**change_hash** | **str** | A unique hash-string identifying SimSage level changes of this document. | 
**created** | **int** | a unix-timestamp for the creation of this document version | 

## Example

```python
from openapi_client.models.cm_document_version import CMDocumentVersion

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentVersion from a JSON string
cm_document_version_instance = CMDocumentVersion.from_json(json)
# print the JSON string representation of the object
print CMDocumentVersion.to_json()

# convert the object into a dict
cm_document_version_dict = cm_document_version_instance.to_dict()
# create an instance of CMDocumentVersion from a dict
cm_document_version_form_dict = cm_document_version.from_dict(cm_document_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


