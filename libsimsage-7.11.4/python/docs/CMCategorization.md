# CMCategorization

A categorization object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base (its guid id) | 
**categorization_label** | **str** | the categorization label (the value field) for a categorization | 
**rule** | **str** | the SimSage SuperSearch rule to match for adding this categorization label to a document | 

## Example

```python
from openapi_client.models.cm_categorization import CMCategorization

# TODO update the JSON string below
json = "{}"
# create an instance of CMCategorization from a JSON string
cm_categorization_instance = CMCategorization.from_json(json)
# print the JSON string representation of the object
print CMCategorization.to_json()

# convert the object into a dict
cm_categorization_dict = cm_categorization_instance.to_dict()
# create an instance of CMCategorization from a dict
cm_categorization_form_dict = cm_categorization.from_dict(cm_categorization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


