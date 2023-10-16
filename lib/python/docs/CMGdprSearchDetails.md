# CMGdprSearchDetails


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** |  | 
**last_name** | **str** |  | 
**document_title** | **str** |  | 
**other_identifiers** | [**List[Identifier]**](Identifier.md) |  | 

## Example

```python
from openapi_client.models.cm_gdpr_search_details import CMGdprSearchDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CMGdprSearchDetails from a JSON string
cm_gdpr_search_details_instance = CMGdprSearchDetails.from_json(json)
# print the JSON string representation of the object
print CMGdprSearchDetails.to_json()

# convert the object into a dict
cm_gdpr_search_details_dict = cm_gdpr_search_details_instance.to_dict()
# create an instance of CMGdprSearchDetails from a dict
cm_gdpr_search_details_form_dict = cm_gdpr_search_details.from_dict(cm_gdpr_search_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


