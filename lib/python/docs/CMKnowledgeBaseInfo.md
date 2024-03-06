# CMKnowledgeBaseInfo

Knowledge base-info represents information needed by external UX systems interacting with SimSage.  This object contains information of a SimSage knowledge-base.  The name, and id of, and sources inside this knowledge-base.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | the name of this knowledge-base | 
**id** | **str** | the knowledge-base id (its guid id) | 
**category_list** | [**List[SearchCategory]**](SearchCategory.md) | a list of metadata-categories present in this source, names and values. | 
**source_list** | [**List[CMSourceBaseInfo]**](CMSourceBaseInfo.md) | the list of sources that are in this knowledge-base | 
**project_kb** | **bool** | Flag to indicate whether this knowledge-base was created for an &#39;Automate&#39; data project | 

## Example

```python
from openapi_client.models.cm_knowledge_base_info import CMKnowledgeBaseInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CMKnowledgeBaseInfo from a JSON string
cm_knowledge_base_info_instance = CMKnowledgeBaseInfo.from_json(json)
# print the JSON string representation of the object
print CMKnowledgeBaseInfo.to_json()

# convert the object into a dict
cm_knowledge_base_info_dict = cm_knowledge_base_info_instance.to_dict()
# create an instance of CMKnowledgeBaseInfo from a dict
cm_knowledge_base_info_form_dict = cm_knowledge_base_info.from_dict(cm_knowledge_base_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


