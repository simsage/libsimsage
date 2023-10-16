# # CMSearchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kb_id** | **string** | the knowledge-base id (its guid id) |
**url** | **string** | the url of the document that matched |
**url_id** | **int** | the internal SimSage id for this url (unique only within a knowledge-base) |
**source_id** | **int** | the source-id of this result (ie. the source&#39;s id) |
**title** | **string** | the title of this document/record (can be empty) |
**author** | **string** | the author of this document/record (can be empty) |
**text_list** | **string[]** | A list of matching fragments in this document, with highlight markers. |
**text_index** | **int** | in case of multiple matches in textList, the best match index of these items starting at zero (0) |
**score** | **float** | the relative score of this match, the bigger, the better |
**sort_desc** | **bool** | was this document along with any others sorted ascending or descending? |
**qna_result** | **bool** | is this item a Q&amp;A result or a search result? |
**first_sentence** | **int** | the id of the first sentence in this result |
**created** | **int** | document creation date-time as a unix date-time |
**uploaded** | **int** | document uploaded to SimSage date-time as a unix date-time |
**last_modified** | **int** | document last-modified date-time as a unix date-time |
**document_type** | **string** | the type of this document/record as a three or four letter file extension |
**num_sentences** | **int** | the total number of sentences in the body of this document |
**num_words** | **int** | the total number of words and tokens (eg. &#39;.&#39;) in the body of this document |
**num_relationships** | **int** | the total number of relationships expanded from the words in this document |
**binary_size** | **int** | the binary-size of the original document in bytes |
**text_size** | **int** | the text-size of the original document in number of characters |
**file_type** | **string** | the DROID file-type of this document/record (can be empty) |
**crawled** | **int** | document crawled (ie. picked up by SimSage) date-time as a unix date-time |
**converted** | **int** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time |
**parsed** | **int** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time |
**indexed** | **int** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time |
**previewed** | **int** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time |
**similar_document_list** | [**\OpenAPI\Client\Model\CMSimilarDocument[]**](CMSimilarDocument.md) | A list of similar documents matched by this query. |
**related_list** | [**\OpenAPI\Client\Model\CMDocumentRelationship[]**](CMDocumentRelationship.md) | A list of similar documents matched by this query. |
**metadata** | **array<string,string>** | A set of name-values of metadata associated with this document |
**filename** | **string** | the filename of this document in the DMS system |
**folder_id** | **string** | the folderId of this item in the DMS system |
**render_type** | **string** | how should this item be rendered? (default \&quot;rt search\&quot;) |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
