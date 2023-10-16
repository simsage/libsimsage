# CMSimilarDocument

A document that is similar to another document.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | the url of the document that is similar | 
**url_id** | **int** | the url-id of the document that is similar | 
**similarity** | **float** | how similar that document is (e.g. 1.0 &#x3D; 100%) | 

## Example

```python
from openapi_client.models.cm_similar_document import CMSimilarDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMSimilarDocument from a JSON string
cm_similar_document_instance = CMSimilarDocument.from_json(json)
# print the JSON string representation of the object
print CMSimilarDocument.to_json()

# convert the object into a dict
cm_similar_document_dict = cm_similar_document_instance.to_dict()
# create an instance of CMSimilarDocument from a dict
cm_similar_document_form_dict = cm_similar_document.from_dict(cm_similar_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


