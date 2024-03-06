# CmSearchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kb_id** | **String** | the knowledge-base id (its guid id) | 
**url** | **String** | the url of the document that matched | 
**url_id** | **i32** | the internal SimSage id for this url (unique only within a knowledge-base) | 
**source_id** | **i32** | the source-id of this result (ie. the source's id) | 
**title** | **String** | the title of this document/record (can be empty) | 
**author** | **String** | the author of this document/record (can be empty) | 
**text_list** | **Vec<String>** | A list of matching fragments in this document, with highlight markers. | 
**text_index** | **i32** | in case of multiple matches in textList, the best match index of these items starting at zero (0) | 
**score** | **f32** | the relative score of this match, the bigger, the better | 
**sort_desc** | **bool** | was this document along with any others sorted ascending or descending? | 
**qna_result** | **bool** | is this item a Q&A result or a search result? | 
**first_sentence** | **i32** | the id of the first sentence in this result | 
**created** | **i64** | document creation date-time as a unix date-time | 
**uploaded** | **i64** | document uploaded to SimSage date-time as a unix date-time | 
**last_modified** | **i64** | document last-modified date-time as a unix date-time | 
**document_type** | **String** | the type of this document/record as a three or four letter file extension | 
**num_sentences** | **i32** | the total number of sentences in the body of this document | 
**num_words** | **i32** | the total number of words and tokens (eg. '.') in the body of this document | 
**num_relationships** | **i32** | the total number of relationships expanded from the words in this document | 
**binary_size** | **i64** | the binary-size of the original document in bytes | 
**text_size** | **i32** | the text-size of the original document in number of characters | 
**file_type** | **String** | the DROID file-type of this document/record (can be empty) | 
**crawled** | **i64** | document crawled (ie. picked up by SimSage) date-time as a unix date-time | 
**converted** | **i64** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time | 
**parsed** | **i64** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time | 
**indexed** | **i64** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time | 
**previewed** | **i64** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time | 
**similar_document_list** | [**Vec<crate::models::CmSimilarDocument>**](CMSimilarDocument.md) | A list of similar documents matched by this query. | 
**related_list** | [**Vec<crate::models::CmDocumentRelationship>**](CMDocumentRelationship.md) | A list of similar documents matched by this query. | 
**metadata** | **::std::collections::HashMap<String, String>** | A set of name-values of metadata associated with this document | 
**filename** | **String** | the filename of this document in the DMS system | 
**folder_id** | **String** | the folderId of this item in the DMS system | 
**render_type** | **String** | how should this item be rendered? (default \"rt search\") | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


