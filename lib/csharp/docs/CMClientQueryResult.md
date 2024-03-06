# Org.OpenAPITools.Model.CMClientQueryResult
A SimSage return search-result message for Q&A and semantic-search queries.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageType** | **string** |  | 
**AssignedOperatorId** | **string** | A unique id for this operator&#39;s session. | 
**OperatorName** | **string** | the name of the operator for clients | 
**OrganisationId** | **string** | the organisation (its guid id). | 
**KbId** | **string** | the knowledge-base id (its guid id) | 
**Text** | **string** | the text sent. | 
**HasResult** | **bool** | is there a result/reply or not? | 
**UrlList** | **List&lt;string&gt;** | a list of reference urls associated with this answer | 
**Metadata** | **string** | metadata associated with the Question/Answer pair, user defined. | 
**QnaScore** | **float** | how well the Q&amp;A matcher performed a value between 0.0 and 1.0 | 
**ImageList** | **List&lt;string&gt;** | A list of image urls associated with the Q&amp;A pair | 
**TotalDocumentCount** | **int** | the total number of documents found (but not included necessarily) | 
**ShardSizeList** | **List&lt;int&gt;** | Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query. | 
**ResultList** | [**List&lt;CMSearchResult&gt;**](CMSearchResult.md) | the actual search results, one for each item found | 
**SpellingCorrection** | **string** | a spelling correction suggestion if appropriate and enabled. | 
**SemanticSet** | **Dictionary&lt;string, List&lt;CMWordFrequency&gt;&gt;** | A descriptor of semantic categories and words with frequencies in each category | 
**KnowEmail** | **bool** | do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true. | 
**CategoryList** | [**List&lt;SearchCategory&gt;**](SearchCategory.md) | updated categories (if applicable) with updated counts | 
**SynSetList** | [**List&lt;CMSynSet&gt;**](CMSynSet.md) | A list of syn-sets used in the query | 
**CustomRender** | **bool** | Does this source require custom render templates or use ordinary search-results? | 
**SavedSearchList** | [**List&lt;CMSavedSearch&gt;**](CMSavedSearch.md) | a list of previous searches if applicable | 
**QuerySummarization** | **string** | an optional summarization of the search results | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

