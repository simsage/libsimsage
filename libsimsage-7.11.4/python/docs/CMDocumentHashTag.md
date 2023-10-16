# CMDocumentHashTag

the document hash-tag object.  A list of hash-tags.  Each hash-tag must start with a '#' and only contain a..z,A..Z.  Minimum size 3 characters, maximum size 50 characters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**url** | **str** | The unique URL of a document. | 
**hash_tag_list** | **List[str]** | a list of hash-tags for this document | 

## Example

```python
from openapi_client.models.cm_document_hash_tag import CMDocumentHashTag

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentHashTag from a JSON string
cm_document_hash_tag_instance = CMDocumentHashTag.from_json(json)
# print the JSON string representation of the object
print CMDocumentHashTag.to_json()

# convert the object into a dict
cm_document_hash_tag_dict = cm_document_hash_tag_instance.to_dict()
# create an instance of CMDocumentHashTag from a dict
cm_document_hash_tag_form_dict = cm_document_hash_tag.from_dict(cm_document_hash_tag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


