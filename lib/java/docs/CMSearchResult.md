

# CMSearchResult

A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kbId** | **String** | the knowledge-base id (its guid id) |  |
|**url** | **String** | the url of the document that matched |  |
|**urlId** | **Integer** | the internal SimSage id for this url (unique only within a knowledge-base) |  |
|**sourceId** | **Integer** | the source-id of this result (ie. the source&#39;s id) |  |
|**title** | **String** | the title of this document/record (can be empty) |  |
|**author** | **String** | the author of this document/record (can be empty) |  |
|**textList** | **List&lt;String&gt;** | A list of matching fragments in this document, with highlight markers. |  |
|**textIndex** | **Integer** | in case of multiple matches in textList, the best match index of these items starting at zero (0) |  |
|**score** | **Float** | the relative score of this match, the bigger, the better |  |
|**sortDesc** | **Boolean** | was this document along with any others sorted ascending or descending? |  |
|**qnaResult** | **Boolean** | is this item a Q&amp;A result or a search result? |  |
|**firstSentence** | **Integer** | the id of the first sentence in this result |  |
|**created** | **Long** | document creation date-time as a unix date-time |  |
|**uploaded** | **Long** | document uploaded to SimSage date-time as a unix date-time |  |
|**lastModified** | **Long** | document last-modified date-time as a unix date-time |  |
|**documentType** | **String** | the type of this document/record as a three or four letter file extension |  |
|**numSentences** | **Integer** | the total number of sentences in the body of this document |  |
|**numWords** | **Integer** | the total number of words and tokens (eg. &#39;.&#39;) in the body of this document |  |
|**numRelationships** | **Integer** | the total number of relationships expanded from the words in this document |  |
|**binarySize** | **Long** | the binary-size of the original document in bytes |  |
|**textSize** | **Integer** | the text-size of the original document in number of characters |  |
|**fileType** | **String** | the DROID file-type of this document/record (can be empty) |  |
|**crawled** | **Long** | document crawled (ie. picked up by SimSage) date-time as a unix date-time |  |
|**converted** | **Long** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time |  |
|**parsed** | **Long** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time |  |
|**indexed** | **Long** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time |  |
|**previewed** | **Long** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time |  |
|**similarDocumentList** | [**List&lt;CMSimilarDocument&gt;**](CMSimilarDocument.md) | A list of similar documents matched by this query. |  |
|**relatedList** | [**List&lt;CMDocumentRelationship&gt;**](CMDocumentRelationship.md) | A list of similar documents matched by this query. |  |
|**metadata** | **Map&lt;String, String&gt;** | A set of name-values of metadata associated with this document |  |
|**filename** | **String** | the filename of this document in the DMS system |  |
|**folderId** | **String** | the folderId of this item in the DMS system |  |
|**renderType** | **String** | how should this item be rendered? (default \&quot;rt search\&quot;) |  |



