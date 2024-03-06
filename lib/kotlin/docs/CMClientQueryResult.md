
# CMClientQueryResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageType** | **kotlin.String** |  | 
**assignedOperatorId** | **kotlin.String** | A unique id for this operator&#39;s session. | 
**operatorName** | **kotlin.String** | the name of the operator for clients | 
**organisationId** | **kotlin.String** | the organisation (its guid id). | 
**kbId** | **kotlin.String** | the knowledge-base id (its guid id) | 
**text** | **kotlin.String** | the text sent. | 
**hasResult** | **kotlin.Boolean** | is there a result/reply or not? | 
**urlList** | **kotlin.collections.List&lt;kotlin.String&gt;** | a list of reference urls associated with this answer | 
**metadata** | **kotlin.String** | metadata associated with the Question/Answer pair, user defined. | 
**qnaScore** | **kotlin.Float** | how well the Q&amp;A matcher performed a value between 0.0 and 1.0 | 
**imageList** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of image urls associated with the Q&amp;A pair | 
**totalDocumentCount** | **kotlin.Int** | the total number of documents found (but not included necessarily) | 
**shardSizeList** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query. | 
**resultList** | [**kotlin.collections.List&lt;CMSearchResult&gt;**](CMSearchResult.md) | the actual search results, one for each item found | 
**spellingCorrection** | **kotlin.String** | a spelling correction suggestion if appropriate and enabled. | 
**semanticSet** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;CMWordFrequency&gt;&gt;** | A descriptor of semantic categories and words with frequencies in each category | 
**knowEmail** | **kotlin.Boolean** | do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true. | 
**categoryList** | [**kotlin.collections.List&lt;SearchCategory&gt;**](SearchCategory.md) | updated categories (if applicable) with updated counts | 
**synSetList** | [**kotlin.collections.List&lt;CMSynSet&gt;**](CMSynSet.md) | A list of syn-sets used in the query | 
**customRender** | **kotlin.Boolean** | Does this source require custom render templates or use ordinary search-results? | 
**savedSearchList** | [**kotlin.collections.List&lt;CMSavedSearch&gt;**](CMSavedSearch.md) | a list of previous searches if applicable | 
**querySummarization** | **kotlin.String** | an optional summarization of the search results | 



