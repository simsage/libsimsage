# # CMClientQueryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_type** | **string** |  |
**organisation_id** | **string** | the organisation (its guid id). |
**kb_id** | **string** | the knowledge-base id (its guid id) |
**text** | **string** | the text sent. |
**has_result** | **bool** | is there a result/reply or not? |
**url_list** | **string[]** | a list of reference urls associated with this answer |
**metadata** | **string** | metadata associated with the Question/Answer pair, user defined. |
**qna_score** | **float** | how well the Q&amp;A matcher performed a value between 0.0 and 1.0 |
**image_list** | **string[]** | A list of image urls associated with the Q&amp;A pair |
**total_document_count** | **int** | the total number of documents found (but not included necessarily) |
**shard_size_list** | **int[]** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query. |
**result_list** | [**\OpenAPI\Client\Model\CMSearchResult[]**](CMSearchResult.md) | the actual search results, one for each item found |
**spelling_correction** | **string** | a spelling correction suggestion if appropriate and enabled. |
**semantic_set** | **array<string,\OpenAPI\Client\Model\CMWordFrequency[]>** | A descriptor of semantic categories and words with frequencies in each category |
**know_email** | **bool** | do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true. |
**category_list** | [**\OpenAPI\Client\Model\SearchCategory[]**](SearchCategory.md) | updated categories (if applicable) with updated counts |
**syn_set_list** | [**\OpenAPI\Client\Model\CMSynSet[]**](CMSynSet.md) | A list of syn-sets used in the query |
**custom_render** | **bool** | Does this source require custom render templates or use ordinary search-results? |
**source_id_to_counts** | **array<string,int>** | a map of sourceId -&gt; number of documents found inside this source |
**document_type_to_counts** | **array<string,int>** | a map of document-type -&gt; number of documents found of this type |
**saved_search_list** | [**\OpenAPI\Client\Model\CMSavedSearch[]**](CMSavedSearch.md) | a list of previous searches if applicable |
**query_summarization** | **string** | an optional summarization of the search results |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
