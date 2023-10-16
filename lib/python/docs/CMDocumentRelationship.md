# CMDocumentRelationship

A document that related to this document in some fashion (parent or child)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url_id** | **int** | the url-id of this document | 
**is_child** | **bool** | if true, this is a child relationship, otherwise a parent relationship | 
**related_url_id** | **int** | the related document&#39;s id | 
**related_url** | **str** | the url of the related document | 
**web_url** | **str** | the web-url (if set) if there is a web-link for this document | 
**title** | **str** | the title of the related document for display | 
**binary_size** | **int** | size in bytes of the related document | 
**document_type** | **str** | the type of the related document | 
**created** | **int** | The unix creation date-time of the related item | 
**last_modified** | **int** | The unix last-modified date-time of the related item | 
**child** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_document_relationship import CMDocumentRelationship

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentRelationship from a JSON string
cm_document_relationship_instance = CMDocumentRelationship.from_json(json)
# print the JSON string representation of the object
print CMDocumentRelationship.to_json()

# convert the object into a dict
cm_document_relationship_dict = cm_document_relationship_instance.to_dict()
# create an instance of CMDocumentRelationship from a dict
cm_document_relationship_form_dict = cm_document_relationship.from_dict(cm_document_relationship_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


