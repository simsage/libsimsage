# CMRedactionDetails


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**project_id** | **str** |  | 
**document_key** | **str** |  | 
**redactions** | [**List[CMLocatedRedaction]**](CMLocatedRedaction.md) |  | 
**mode** | **str** |  | 

## Example

```python
from openapi_client.models.cm_redaction_details import CMRedactionDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CMRedactionDetails from a JSON string
cm_redaction_details_instance = CMRedactionDetails.from_json(json)
# print the JSON string representation of the object
print CMRedactionDetails.to_json()

# convert the object into a dict
cm_redaction_details_dict = cm_redaction_details_instance.to_dict()
# create an instance of CMRedactionDetails from a dict
cm_redaction_details_form_dict = cm_redaction_details.from_dict(cm_redaction_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


