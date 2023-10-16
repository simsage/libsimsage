# Org.OpenAPITools.Model.CMSearchResult
A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**KbId** | **string** | the knowledge-base id (its guid id) | 
**Url** | **string** | the url of the document that matched | 
**UrlId** | **int** | the internal SimSage id for this url (unique only within a knowledge-base) | 
**SourceId** | **int** | the source-id of this result (ie. the source&#39;s id) | 
**Title** | **string** | the title of this document/record (can be empty) | 
**Author** | **string** | the author of this document/record (can be empty) | 
**TextList** | **List&lt;string&gt;** | A list of matching fragments in this document, with highlight markers. | 
**TextIndex** | **int** | in case of multiple matches in textList, the best match index of these items starting at zero (0) | 
**Score** | **float** | the relative score of this match, the bigger, the better | 
**SortDesc** | **bool** | was this document along with any others sorted ascending or descending? | 
**QnaResult** | **bool** | is this item a Q&amp;A result or a search result? | 
**FirstSentence** | **int** | the id of the first sentence in this result | 
**Created** | **long** | document creation date-time as a unix date-time | 
**Uploaded** | **long** | document uploaded to SimSage date-time as a unix date-time | 
**LastModified** | **long** | document last-modified date-time as a unix date-time | 
**DocumentType** | **string** | the type of this document/record as a three or four letter file extension | 
**NumSentences** | **int** | the total number of sentences in the body of this document | 
**NumWords** | **int** | the total number of words and tokens (eg. &#39;.&#39;) in the body of this document | 
**NumRelationships** | **int** | the total number of relationships expanded from the words in this document | 
**BinarySize** | **long** | the binary-size of the original document in bytes | 
**TextSize** | **int** | the text-size of the original document in number of characters | 
**FileType** | **string** | the DROID file-type of this document/record (can be empty) | 
**Crawled** | **long** | document crawled (ie. picked up by SimSage) date-time as a unix date-time | 
**Converted** | **long** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time | 
**Parsed** | **long** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time | 
**Indexed** | **long** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time | 
**Previewed** | **long** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time | 
**SimilarDocumentList** | [**List&lt;CMSimilarDocument&gt;**](CMSimilarDocument.md) | A list of similar documents matched by this query. | 
**RelatedList** | [**List&lt;CMDocumentRelationship&gt;**](CMDocumentRelationship.md) | A list of similar documents matched by this query. | 
**Metadata** | **Dictionary&lt;string, string&gt;** | A set of name-values of metadata associated with this document | 
**Filename** | **string** | the filename of this document in the DMS system | 
**FolderId** | **string** | the folderId of this item in the DMS system | 
**RenderType** | **string** | how should this item be rendered? (default \&quot;rt search\&quot;) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

