# CMSource
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **sourceId** | **Integer** | the source-id, primary key of the source | [default to null] |
| **organisationId** | **String** | the main organisation (its guid id) for this source/crawler | [default to null] |
| **kbId** | **String** | the knowledge-base id (its guid id) for this source/crawler | [default to null] |
| **nodeId** | **Integer** | the system&#39;s node id of this source (what kubernetes-node to run on, starting with zero, set NODE_ID in env to manipulate this value).  Sources will only run on machines with a matching node-id | [default to null] |
| **name** | **String** | the display-name (descriptive name) of this source.  The source&#39;s name must be unique within a knowledge-base. | [default to null] |
| **crawlerType** | **String** | the type of this source | [default to null] |
| **schedule** | **String** | the time-schedule of this crawler, when active and when not repeating in a weekly-per hour cycle in GMT time.  Empty string means not active at all | [default to null] |
| **deleteFiles** | **Boolean** | Should this crawler remove files that are no longer visible after a crawl completes without errors?  Used for sources that cannot report on file/data removal. | [default to null] |
| **allowAnonymous** | **Boolean** | Is the content of this crawler accessible anonymously (ie. no permissions/ACLs required).  Some crawlers like the web crawler always have this value as true.  NB.  Setting this flag to \&quot;true\&quot; will bypass any security on the source&#39;s own ACLs and make all its content available to everyone. | [default to null] |
| **processingLevel** | **String** | How much processing should SimSage give each file of this source.  As defined internally in ProcessingLevel.  level 1, CONVERT: convert all document binaries to text (creates metadata text).  level 2, PARSE: NLP process the files (creates sentences and tokens for all text).  level 3, INDEX: create inverted indexes for files (creates indexes). | [default to null] |
| **enablePreview** | **Boolean** | Generate per-document image-preview information as well as full HTML previews if set to \&quot;true\&quot;. | [default to null] |
| **filesPerSecond** | **Float** | Any value greater than 0.0 (can be fractional) indicates SimSage should limit how many requests it makes from the remote entity we&#39;re integrating with. | [default to null] |
| **specificJson** | **String** | A json string with specific values for this type of source.  Generated by the SimSage administrative system. | [default to null] |
| **sessionId** | **String** | a valid session-guid id. | [default to null] |
| **maxItems** | **Long** | Set a content limit for the maximum number of items to contain for this source.  A value of zero (0) indicates no limits. | [default to null] |
| **maxBotItems** | **Long** | Set a Question and Answer content limit for the maximum number of deep-learning Q&amp;A items this source can contain.  A value of zero (0) indicates no limits. | [default to null] |
| **customRender** | **Boolean** | Does this source require custom render templates or use ordinary search-results? | [default to null] |
| **edgeDeviceId** | **String** | The associated Edge device for this source (or empty string if not associated with one) | [default to null] |
| **qaMatchStrength** | **Float** | the default threshold for matching deep-learning vector matching results (value should be between 0.7 and 0.99) | [default to null] |
| **numResults** | **Integer** | the default number of search results to return from the semantic-search system | [default to null] |
| **numFragments** | **Integer** | the number of fragments to return per search-result from the semantic-search system.  Affects accuracy, a value of \&quot;1\&quot; will only look at the first match.  Higher values look for more matches inside a single document.  Too high a value will affect performance.  Default value \&quot;3\&quot;. | [default to null] |
| **numErrors** | **Integer** | the number of errors from the last source-run | [default to null] |
| **errorThreshold** | **Integer** | the number of errors allowed before failing the source and not force-removing any files at the end of a run through an external source. | [default to null] |
| **startTime** | **Long** | when the last run of this source started | [default to null] |
| **endTime** | **Long** | when the last run of this source finished | [default to null] |
| **acls** | [**List**](CMDocumentAcl.md) | A list for overwriting security permission for a source.  Can be empty.  Use this to override security on external systems. | [default to null] |
| **isCrawling** | **Boolean** | \&quot;true\&quot; if this source busy/active. | [default to null] |
| **numCrawledDocuments** | **Integer** | the number of documents seen by the crawler thus-far. | [default to null] |
| **numConvertedDocuments** | **Integer** | the number of documents converted by SimSage thus-far. | [default to null] |
| **numParsedDocuments** | **Integer** | the number of documents parsed by SimSage thus-far. | [default to null] |
| **numIndexedDocuments** | **Integer** | the number of documents indexed by SimSage thus-far. | [default to null] |
| **numFinishedDocuments** | **Integer** | the number of finished (fully processed) by SimSage thus-far. | [default to null] |
| **numTotalDocuments** | **Integer** | the total number of documents for this source in SimSage. | [default to null] |
| **useDefaultRelationships** | **Boolean** | \&quot;true\&quot; if this source is to use the default (built-in) SimSage relationships.  All user-defined relationships and language-entities will be used regardless of the value of this flag. | [default to null] |
| **isBusy** | **Boolean** | \&quot;true\&quot; if this source is currently being optimized / processed by the index-optimizer. | [default to null] |
| **autoOptimize** | **Boolean** | Do we run the index-optimizer automatically after this source finishes crawling? | [default to null] |
| **storeBinary** | **Boolean** | \&quot;true\&quot; if this source is to store all documents locally on the SimSage platform | [default to null] |
| **versioned** | **Boolean** | \&quot;true\&quot; if this source is to store all versions of documents locally on the SimSage platform | [default to null] |
| **writeToCassandra** | **Boolean** | \&quot;true\&quot; if this source is to write any changes direct to Cassandra, otherwise this source will collect indexes on disk first (for initial loading) | [default to null] |
| **processorConfig** | **String** | Json string defining any optional processors configured on the source | [default to null] |
| **enableDocumentSimilarity** | **Boolean** | enable document similarity calculations. | [default to null] |
| **documentSimilarityThreshold** | **Float** | the document similarity threshold for grouping documents, a value between 0.75 and 1.0 | [default to null] |
| **isExternal** | **Boolean** | is this crawler to be connected as an external source using our external crawler software? | [default to null] |
| **useOCR** | **Boolean** | enable OCR processing for files in this source? | [default to null] |
| **useSTT** | **Boolean** | enable Speech-to-text processing for files in this source? | [default to null] |
| **external** | **Boolean** |  | [optional] [default to null] |
| **crawling** | **Boolean** |  | [optional] [default to null] |
| **busy** | **Boolean** |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
