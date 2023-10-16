# CMGetHtml

get an HTML preview of a document by page

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**url_id** | **int** | the url Id of the document | 
**url** | **str** | The unique URL of this document. | 
**page** | **int** | the page of this document get, starting at 1 | 
**html** | **str** | the HTML of the document returned | 
**width** | **int** | the display width of the HMTL document | 
**height** | **int** | the display height of the HMTL document | 
**num_pages** | **int** | the total number of pages in this document | 

## Example

```python
from openapi_client.models.cm_get_html import CMGetHtml

# TODO update the JSON string below
json = "{}"
# create an instance of CMGetHtml from a JSON string
cm_get_html_instance = CMGetHtml.from_json(json)
# print the JSON string representation of the object
print CMGetHtml.to_json()

# convert the object into a dict
cm_get_html_dict = cm_get_html_instance.to_dict()
# create an instance of CMGetHtml from a dict
cm_get_html_form_dict = cm_get_html.from_dict(cm_get_html_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


