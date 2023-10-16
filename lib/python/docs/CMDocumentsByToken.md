# CMDocumentsByToken


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**query_tokens** | [**List[CMQueryToken]**](CMQueryToken.md) |  | 
**page_size** | **int** |  | 
**offset** | **int** |  | 

## Example

```python
from openapi_client.models.cm_documents_by_token import CMDocumentsByToken

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentsByToken from a JSON string
cm_documents_by_token_instance = CMDocumentsByToken.from_json(json)
# print the JSON string representation of the object
print CMDocumentsByToken.to_json()

# convert the object into a dict
cm_documents_by_token_dict = cm_documents_by_token_instance.to_dict()
# create an instance of CMDocumentsByToken from a dict
cm_documents_by_token_form_dict = cm_documents_by_token.from_dict(cm_documents_by_token_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


