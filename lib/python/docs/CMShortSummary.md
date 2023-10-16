# CMShortSummary

a client query object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base id (guid) to use | 
**client_id** | **str** | the client&#39;s id (a unique guid for keeping state against clients) | 
**url** | **str** | The unique URL of a document. | 
**sentence_id** | **int** | The sentence id to start from in the document. | 
**span** | **int** | The surrounding span / offset size for around the sentence | 

## Example

```python
from openapi_client.models.cm_short_summary import CMShortSummary

# TODO update the JSON string below
json = "{}"
# create an instance of CMShortSummary from a JSON string
cm_short_summary_instance = CMShortSummary.from_json(json)
# print the JSON string representation of the object
print CMShortSummary.to_json()

# convert the object into a dict
cm_short_summary_dict = cm_short_summary_instance.to_dict()
# create an instance of CMShortSummary from a dict
cm_short_summary_form_dict = cm_short_summary.from_dict(cm_short_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


