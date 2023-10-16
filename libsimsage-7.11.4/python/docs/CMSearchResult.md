# CMSearchResult

A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**url** | **str** | the url of the document that matched | 
**url_id** | **int** | the internal SimSage id for this url (unique only within a knowledge-base) | 
**source_id** | **int** | the source-id of this result (ie. the source&#39;s id) | 
**title** | **str** | the title of this document/record (can be empty) | 
**author** | **str** | the author of this document/record (can be empty) | 
**text_list** | **List[str]** | A list of matching fragments in this document, with highlight markers. | 
**text_index** | **int** | in case of multiple matches in textList, the best match index of these items starting at zero (0) | 
**score** | **float** | the relative score of this match, the bigger, the better | 
**sort_desc** | **bool** | was this document along with any others sorted ascending or descending? | 
**qna_result** | **bool** | is this item a Q&amp;A result or a search result? | 
**first_sentence** | **int** | the id of the first sentence in this result | 
**created** | **int** | document creation date-time as a unix date-time | 
**uploaded** | **int** | document uploaded to SimSage date-time as a unix date-time | 
**last_modified** | **int** | document last-modified date-time as a unix date-time | 
**document_type** | **str** | the type of this document/record as a three or four letter file extension | 
**num_sentences** | **int** | the total number of sentences in the body of this document | 
**num_words** | **int** | the total number of words and tokens (eg. &#39;.&#39;) in the body of this document | 
**num_relationships** | **int** | the total number of relationships expanded from the words in this document | 
**binary_size** | **int** | the binary-size of the original document in bytes | 
**text_size** | **int** | the text-size of the original document in number of characters | 
**file_type** | **str** | the DROID file-type of this document/record (can be empty) | 
**crawled** | **int** | document crawled (ie. picked up by SimSage) date-time as a unix date-time | 
**converted** | **int** | document conversion (ie. turned into text by SimSage) date-time as a unix date-time | 
**parsed** | **int** | document parsed (ie. language analyzed by SimSage) date-time as a unix date-time | 
**indexed** | **int** | document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time | 
**previewed** | **int** | document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time | 
**similar_document_list** | [**List[CMSimilarDocument]**](CMSimilarDocument.md) | A list of similar documents matched by this query. | 
**related_list** | [**List[CMDocumentRelationship]**](CMDocumentRelationship.md) | A list of similar documents matched by this query. | 
**metadata** | **Dict[str, str]** | A set of name-values of metadata associated with this document | 
**filename** | **str** | the filename of this document in the DMS system | 
**folder_id** | **str** | the folderId of this item in the DMS system | 
**render_type** | **str** | how should this item be rendered? (default \&quot;rt search\&quot;) | 

## Example

```python
from openapi_client.models.cm_search_result import CMSearchResult

# TODO update the JSON string below
json = "{}"
# create an instance of CMSearchResult from a JSON string
cm_search_result_instance = CMSearchResult.from_json(json)
# print the JSON string representation of the object
print CMSearchResult.to_json()

# convert the object into a dict
cm_search_result_dict = cm_search_result_instance.to_dict()
# create an instance of CMSearchResult from a dict
cm_search_result_form_dict = cm_search_result.from_dict(cm_search_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


