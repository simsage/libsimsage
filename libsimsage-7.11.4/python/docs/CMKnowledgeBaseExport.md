# CMKnowledgeBaseExport

the knowledge-base export config

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** |  | 
**kb_id** | **str** |  | 
**exporter** | **str** |  | 
**export_config** | **Dict[str, object]** |  | 

## Example

```python
from openapi_client.models.cm_knowledge_base_export import CMKnowledgeBaseExport

# TODO update the JSON string below
json = "{}"
# create an instance of CMKnowledgeBaseExport from a JSON string
cm_knowledge_base_export_instance = CMKnowledgeBaseExport.from_json(json)
# print the JSON string representation of the object
print CMKnowledgeBaseExport.to_json()

# convert the object into a dict
cm_knowledge_base_export_dict = cm_knowledge_base_export_instance.to_dict()
# create an instance of CMKnowledgeBaseExport from a dict
cm_knowledge_base_export_form_dict = cm_knowledge_base_export.from_dict(cm_knowledge_base_export_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


