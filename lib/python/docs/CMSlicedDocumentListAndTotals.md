# CMSlicedDocumentListAndTotals


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paged_results** | [**CMPagedResultsCMSlicedDocument**](CMPagedResultsCMSlicedDocument.md) |  | 
**all_docs** | **int** |  | 
**completed** | **int** |  | 
**quarantined** | **int** |  | 
**source_map** | **Dict[str, str]** |  | 
**user_map** | **Dict[str, str]** |  | 

## Example

```python
from openapi_client.models.cm_sliced_document_list_and_totals import CMSlicedDocumentListAndTotals

# TODO update the JSON string below
json = "{}"
# create an instance of CMSlicedDocumentListAndTotals from a JSON string
cm_sliced_document_list_and_totals_instance = CMSlicedDocumentListAndTotals.from_json(json)
# print the JSON string representation of the object
print CMSlicedDocumentListAndTotals.to_json()

# convert the object into a dict
cm_sliced_document_list_and_totals_dict = cm_sliced_document_list_and_totals_instance.to_dict()
# create an instance of CMSlicedDocumentListAndTotals from a dict
cm_sliced_document_list_and_totals_form_dict = cm_sliced_document_list_and_totals.from_dict(cm_sliced_document_list_and_totals_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


