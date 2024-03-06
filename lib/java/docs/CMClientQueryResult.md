

# CMClientQueryResult

A SimSage return search-result message for Q&A and semantic-search queries.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageType** | **String** |  |  |
|**organisationId** | **String** | the organisation (its guid id). |  |
|**kbId** | **String** | the knowledge-base id (its guid id) |  |
|**text** | **String** | the text sent. |  |
|**hasResult** | **Boolean** | is there a result/reply or not? |  |
|**urlList** | **List&lt;String&gt;** | a list of reference urls associated with this answer |  |
|**metadata** | **String** | metadata associated with the Question/Answer pair, user defined. |  |
|**qnaScore** | **Float** | how well the Q&amp;A matcher performed a value between 0.0 and 1.0 |  |
|**imageList** | **List&lt;String&gt;** | A list of image urls associated with the Q&amp;A pair |  |
|**totalDocumentCount** | **Integer** | the total number of documents found (but not included necessarily) |  |
|**shardSizeList** | **List&lt;Integer&gt;** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query. |  |
|**resultList** | [**List&lt;CMSearchResult&gt;**](CMSearchResult.md) | the actual search results, one for each item found |  |
|**spellingCorrection** | **String** | a spelling correction suggestion if appropriate and enabled. |  |
|**semanticSet** | **Map&lt;String, List&lt;CMWordFrequency&gt;&gt;** | A descriptor of semantic categories and words with frequencies in each category |  |
|**knowEmail** | **Boolean** | do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true. |  |
|**categoryList** | [**List&lt;SearchCategory&gt;**](SearchCategory.md) | updated categories (if applicable) with updated counts |  |
|**synSetList** | [**List&lt;CMSynSet&gt;**](CMSynSet.md) | A list of syn-sets used in the query |  |
|**customRender** | **Boolean** | Does this source require custom render templates or use ordinary search-results? |  |
|**sourceIdToCounts** | **Map&lt;String, Integer&gt;** | a map of sourceId -&gt; number of documents found inside this source |  |
|**documentTypeToCounts** | **Map&lt;String, Integer&gt;** | a map of document-type -&gt; number of documents found of this type |  |
|**savedSearchList** | [**List&lt;CMSavedSearch&gt;**](CMSavedSearch.md) | a list of previous searches if applicable |  |
|**querySummarization** | **String** | an optional summarization of the search results |  |



