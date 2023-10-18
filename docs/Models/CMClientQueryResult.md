# CMClientQueryResult
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **messageType** | **String** |  | [default to null] |
| **assignedOperatorId** | **String** | A unique id for this operator&#39;s session. | [default to null] |
| **operatorName** | **String** | the name of the operator for clients | [default to null] |
| **organisationId** | **String** | the organisation (its guid id). | [default to null] |
| **kbId** | **String** | the knowledge-base id (its guid id) | [default to null] |
| **text** | **String** | the text sent. | [default to null] |
| **hasResult** | **Boolean** | is there a result/reply or not? | [default to null] |
| **urlList** | **List** | a list of reference urls associated with this answer | [default to null] |
| **metadata** | **String** | metadata associated with the Question/Answer pair, user defined. | [default to null] |
| **qnaScore** | **Float** | how well the Q&amp;A matcher performed a value between 0.0 and 1.0 | [default to null] |
| **imageList** | **List** | A list of image urls associated with the Q&amp;A pair | [default to null] |
| **totalDocumentCount** | **Integer** | the total number of documents found (but not included necessarily) | [default to null] |
| **shardSizeList** | **List** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query. | [default to null] |
| **resultList** | [**List**](CMSearchResult.md) | the actual search results, one for each item found | [default to null] |
| **spellingCorrection** | **String** | a spelling correction suggestion if appropriate and enabled. | [default to null] |
| **semanticSet** | [**Map**](array.md) | A descriptor of semantic categories and words with frequencies in each category | [default to null] |
| **knowEmail** | **Boolean** | do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true. | [default to null] |
| **categoryList** | [**List**](SearchCategory.md) | updated categories (if applicable) with updated counts | [default to null] |
| **synSetList** | [**List**](CMSynSet.md) | A list of syn-sets used in the query | [default to null] |
| **customRender** | **Boolean** | Does this source require custom render templates or use ordinary search-results? | [default to null] |
| **savedSearchList** | [**List**](CMSavedSearch.md) | a list of previous searches if applicable | [default to null] |
| **querySummarization** | **String** | an optional summarization of the search results | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

