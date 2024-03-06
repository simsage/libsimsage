
# CMSearchResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kbId** | **kotlin.String** | the knowledge-base id (its guid id) | 
**url** | **kotlin.String** | the url of the document that matched | 
**urlId** | **kotlin.Int** | the internal SimSage id for this url (unique only within a knowledge-base) | 
**sourceId** | **kotlin.Int** | the source-id of this result (ie. the source&#39;s id) | 
**title** | **kotlin.String** | the title of this document/record (can be empty) | 
**author** | **kotlin.String** | the author of this document/record (can be empty) | 
**textList** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of matching fragments in this document, with highlight markers. | 
**textIndex** | **kotlin.Int** | in case of multiple matches in textList, the best match index of these items starting at zero (0) | 
**score** | **kotlin.Float** | the relative score of this match, the bigger, the better | 
**sortDesc** | **kotlin.Boolean** | was this document along with any others sorted ascending or descending? | 
**qnaResult** | **kotlin.Boolean** | is this item a Q&amp;A result or a search result? | 
**firstSentence** | **kotlin.Int** | the id of the first sentence in this result | 
**created** | **kotlin.Long** | document creation date-time as a unix date-time | 
**uploaded** | **kotlin.Long** | document uploaded to SimSage date-time as a unix date-time | 
**lastModified** | **kotlin.Long** | document last-modified date-time as a unix date-time | 
**documentType** | **kotlin.String** | the type of this document/record as a three or four letter file extension | 
**numSentences** | **kotlin.Int** | the total number of sentences in the body of this document | 
**numWords** | **kotlin.Int** | the total number of words and tokens (eg. &#39;.&#39;) in the body of this document | 
**numRelationships** | **kotlin.Int** | the total number of relationships expanded from the words in this document | 
**binarySize** | **kotlin.Long** | the binary-size of the original document in bytes | 
**textSize** | **kotlin.Int** | the text-size of the original document in number of characters | 
**fileType** | **kotlin.String** | the DROID file-type of this document/record (can be empty) | 
**crawled** | **kotlin.Long** | document crawled (ie. picked up by SimSage) date-time as a unix date-time | 
**converted** | **kotlin.Long** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time | 
**parsed** | **kotlin.Long** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time | 
**indexed** | **kotlin.Long** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time | 
**previewed** | **kotlin.Long** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time | 
**similarDocumentList** | [**kotlin.collections.List&lt;CMSimilarDocument&gt;**](CMSimilarDocument.md) | A list of similar documents matched by this query. | 
**relatedList** | [**kotlin.collections.List&lt;CMDocumentRelationship&gt;**](CMDocumentRelationship.md) | A list of similar documents matched by this query. | 
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | A set of name-values of metadata associated with this document | 
**filename** | **kotlin.String** | the filename of this document in the DMS system | 
**folderId** | **kotlin.String** | the folderId of this item in the DMS system | 
**renderType** | **kotlin.String** | how should this item be rendered? (default \&quot;rt search\&quot;) | 



