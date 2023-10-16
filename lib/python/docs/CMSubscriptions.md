# CMSubscriptions

A set of items subscribed to.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folder_list** | [**List[CMDocumentFolder]**](CMDocumentFolder.md) | list of folders subscribed to | 
**document_list** | [**List[CMDocument]**](CMDocument.md) | list of documents subscribed to | 

## Example

```python
from openapi_client.models.cm_subscriptions import CMSubscriptions

# TODO update the JSON string below
json = "{}"
# create an instance of CMSubscriptions from a JSON string
cm_subscriptions_instance = CMSubscriptions.from_json(json)
# print the JSON string representation of the object
print CMSubscriptions.to_json()

# convert the object into a dict
cm_subscriptions_dict = cm_subscriptions_instance.to_dict()
# create an instance of CMSubscriptions from a dict
cm_subscriptions_form_dict = cm_subscriptions.from_dict(cm_subscriptions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


