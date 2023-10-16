# CMClaimDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**slice_id** | **str** |  | 
**document_key** | **str** |  | 
**lock** | **bool** |  | 
**force** | **bool** |  | 

## Example

```python
from openapi_client.models.cm_claim_document import CMClaimDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMClaimDocument from a JSON string
cm_claim_document_instance = CMClaimDocument.from_json(json)
# print the JSON string representation of the object
print CMClaimDocument.to_json()

# convert the object into a dict
cm_claim_document_dict = cm_claim_document_instance.to_dict()
# create an instance of CMClaimDocument from a dict
cm_claim_document_form_dict = cm_claim_document.from_dict(cm_claim_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


