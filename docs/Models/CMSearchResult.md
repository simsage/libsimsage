# CMSearchResult
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **kbId** | **String** | the knowledge-base id (its guid id) | [default to null] |
| **url** | **String** | the url of the document that matched | [default to null] |
| **urlId** | **Integer** | the internal SimSage id for this url (unique only within a knowledge-base) | [default to null] |
| **sourceId** | **Integer** | the source-id of this result (ie. the source&#39;s id) | [default to null] |
| **title** | **String** | the title of this document/record (can be empty) | [default to null] |
| **author** | **String** | the author of this document/record (can be empty) | [default to null] |
| **textList** | **List** | A list of matching fragments in this document, with highlight markers. | [default to null] |
| **textIndex** | **Integer** | in case of multiple matches in textList, the best match index of these items starting at zero (0) | [default to null] |
| **score** | **Float** | the relative score of this match, the bigger, the better | [default to null] |
| **sortDesc** | **Boolean** | was this document along with any others sorted ascending or descending? | [default to null] |
| **qnaResult** | **Boolean** | is this item a Q&amp;A result or a search result? | [default to null] |
| **firstSentence** | **Integer** | the id of the first sentence in this result | [default to null] |
| **created** | **Long** | document creation date-time as a unix date-time | [default to null] |
| **uploaded** | **Long** | document uploaded to SimSage date-time as a unix date-time | [default to null] |
| **lastModified** | **Long** | document last-modified date-time as a unix date-time | [default to null] |
| **documentType** | **String** | the type of this document/record as a three or four letter file extension | [default to null] |
| **numSentences** | **Integer** | the total number of sentences in the body of this document | [default to null] |
| **numWords** | **Integer** | the total number of words and tokens (eg. &#39;.&#39;) in the body of this document | [default to null] |
| **numRelationships** | **Integer** | the total number of relationships expanded from the words in this document | [default to null] |
| **binarySize** | **Long** | the binary-size of the original document in bytes | [default to null] |
| **textSize** | **Integer** | the text-size of the original document in number of characters | [default to null] |
| **fileType** | **String** | the DROID file-type of this document/record (can be empty) | [default to null] |
| **crawled** | **Long** | document crawled (ie. picked up by SimSage) date-time as a unix date-time | [default to null] |
| **converted** | **Long** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time | [default to null] |
| **parsed** | **Long** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time | [default to null] |
| **indexed** | **Long** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time | [default to null] |
| **previewed** | **Long** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time | [default to null] |
| **similarDocumentList** | [**List**](CMSimilarDocument.md) | A list of similar documents matched by this query. | [default to null] |
| **relatedList** | [**List**](CMDocumentRelationship.md) | A list of similar documents matched by this query. | [default to null] |
| **metadata** | **Map** | A set of name-values of metadata associated with this document | [default to null] |
| **filename** | **String** | the filename of this document in the DMS system | [default to null] |
| **folderId** | **String** | the folderId of this item in the DMS system | [default to null] |
| **renderType** | **String** | how should this item be rendered? (default \&quot;rt search\&quot;) | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

