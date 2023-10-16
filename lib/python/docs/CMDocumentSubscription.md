# CMDocumentSubscription

the document subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the main organisation (its guid id) for this source/crawler | 
**kb_id** | **str** | the knowledge-base id of this context item, a guid-string | 
**user_id** | **str** | the user&#39;s id, a guid | 
**source_id** | **int** | the source-id of the owner of the url | 
**parent_id** | **str** | The parent of a folder or a file (a guid or an empty string for a top-level folder) | 
**object_id** | **str** | Either a file or a folder ID | 
**url** | **str** | The unique URL of a document. | 
**url_id** | **int** | the internal SimSage id for this url | 
**name** | **str** | The name of the folder or file | 
**is_folder** | **bool** | is this a subscription to a folder or a file? | 
**folder** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cm_document_subscription import CMDocumentSubscription

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentSubscription from a JSON string
cm_document_subscription_instance = CMDocumentSubscription.from_json(json)
# print the JSON string representation of the object
print CMDocumentSubscription.to_json()

# convert the object into a dict
cm_document_subscription_dict = cm_document_subscription_instance.to_dict()
# create an instance of CMDocumentSubscription from a dict
cm_document_subscription_form_dict = cm_document_subscription.from_dict(cm_document_subscription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


