# CMClientQueryResult

A SimSage return search-result message for Q&A and semantic-search queries.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_type** | **str** |  | 
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**text** | **str** | the text sent. | 
**has_result** | **bool** | is there a result/reply or not? | 
**url_list** | **List[str]** | a list of reference urls associated with this answer | 
**metadata** | **str** | metadata associated with the Question/Answer pair, user defined. | 
**qna_score** | **float** | how well the Q&amp;A matcher performed a value between 0.0 and 1.0 | 
**image_list** | **List[str]** | A list of image urls associated with the Q&amp;A pair | 
**total_document_count** | **int** | the total number of documents found (but not included necessarily) | 
**shard_size_list** | **List[int]** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query. | 
**result_list** | [**List[CMSearchResult]**](CMSearchResult.md) | the actual search results, one for each item found | 
**spelling_correction** | **str** | a spelling correction suggestion if appropriate and enabled. | 
**semantic_set** | **Dict[str, List[CMWordFrequency]]** | A descriptor of semantic categories and words with frequencies in each category | 
**know_email** | **bool** | do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true. | 
**category_list** | [**List[SearchCategory]**](SearchCategory.md) | updated categories (if applicable) with updated counts | 
**syn_set_list** | [**List[CMSynSet]**](CMSynSet.md) | A list of syn-sets used in the query | 
**custom_render** | **bool** | Does this source require custom render templates or use ordinary search-results? | 
**source_id_to_counts** | **Dict[str, int]** | a map of sourceId -&gt; number of documents found inside this source | 
**document_type_to_counts** | **Dict[str, int]** | a map of document-type -&gt; number of documents found of this type | 
**saved_search_list** | [**List[CMSavedSearch]**](CMSavedSearch.md) | a list of previous searches if applicable | 
**query_summarization** | **str** | an optional summarization of the search results | 

## Example

```python
from openapi_client.models.cm_client_query_result import CMClientQueryResult

# TODO update the JSON string below
json = "{}"
# create an instance of CMClientQueryResult from a JSON string
cm_client_query_result_instance = CMClientQueryResult.from_json(json)
# print the JSON string representation of the object
print CMClientQueryResult.to_json()

# convert the object into a dict
cm_client_query_result_dict = cm_client_query_result_instance.to_dict()
# create an instance of CMClientQueryResult from a dict
cm_client_query_result_form_dict = cm_client_query_result.from_dict(cm_client_query_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


