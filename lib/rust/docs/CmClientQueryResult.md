# CmClientQueryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_type** | **String** |  | 
**assigned_operator_id** | **String** | A unique id for this operator's session. | 
**operator_name** | **String** | the name of the operator for clients | 
**organisation_id** | **String** | the organisation (its guid id). | 
**kb_id** | **String** | the knowledge-base id (its guid id) | 
**text** | **String** | the text sent. | 
**has_result** | **bool** | is there a result/reply or not? | 
**url_list** | **Vec<String>** | a list of reference urls associated with this answer | 
**metadata** | **String** | metadata associated with the Question/Answer pair, user defined. | 
**qna_score** | **f32** | how well the Q&A matcher performed a value between 0.0 and 1.0 | 
**image_list** | **Vec<String>** | A list of image urls associated with the Q&A pair | 
**total_document_count** | **i32** | the total number of documents found (but not included necessarily) | 
**shard_size_list** | **Vec<i32>** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query. | 
**result_list** | [**Vec<crate::models::CmSearchResult>**](CMSearchResult.md) | the actual search results, one for each item found | 
**spelling_correction** | **String** | a spelling correction suggestion if appropriate and enabled. | 
**semantic_set** | [**::std::collections::HashMap<String, Vec<crate::models::CmWordFrequency>>**](array.md) | A descriptor of semantic categories and words with frequencies in each category | 
**know_email** | **bool** | do we know the email address of this person?  if they've supplied it in the past this will be set to true. | 
**category_list** | [**Vec<crate::models::SearchCategory>**](SearchCategory.md) | updated categories (if applicable) with updated counts | 
**syn_set_list** | [**Vec<crate::models::CmSynSet>**](CMSynSet.md) | A list of syn-sets used in the query | 
**custom_render** | **bool** | Does this source require custom render templates or use ordinary search-results? | 
**saved_search_list** | [**Vec<crate::models::CmSavedSearch>**](CMSavedSearch.md) | a list of previous searches if applicable | 
**query_summarization** | **String** | an optional summarization of the search results | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


