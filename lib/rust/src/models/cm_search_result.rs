/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSearchResult : A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSearchResult {
    /// the knowledge-base id (its guid id)
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the url of the document that matched
    #[serde(rename = "url")]
    pub url: String,
    /// the internal SimSage id for this url (unique only within a knowledge-base)
    #[serde(rename = "urlId")]
    pub url_id: i32,
    /// the source-id of this result (ie. the source's id)
    #[serde(rename = "sourceId")]
    pub source_id: i32,
    /// the title of this document/record (can be empty)
    #[serde(rename = "title")]
    pub title: String,
    /// the author of this document/record (can be empty)
    #[serde(rename = "author")]
    pub author: String,
    /// A list of matching fragments in this document, with highlight markers.
    #[serde(rename = "textList")]
    pub text_list: Vec<String>,
    /// in case of multiple matches in textList, the best match index of these items starting at zero (0)
    #[serde(rename = "textIndex")]
    pub text_index: i32,
    /// the relative score of this match, the bigger, the better
    #[serde(rename = "score")]
    pub score: f32,
    /// was this document along with any others sorted ascending or descending?
    #[serde(rename = "sortDesc")]
    pub sort_desc: bool,
    /// is this item a Q&A result or a search result?
    #[serde(rename = "qnaResult")]
    pub qna_result: bool,
    /// the id of the first sentence in this result
    #[serde(rename = "firstSentence")]
    pub first_sentence: i32,
    /// document creation date-time as a unix date-time
    #[serde(rename = "created")]
    pub created: i64,
    /// document uploaded to SimSage date-time as a unix date-time
    #[serde(rename = "uploaded")]
    pub uploaded: i64,
    /// document last-modified date-time as a unix date-time
    #[serde(rename = "lastModified")]
    pub last_modified: i64,
    /// the type of this document/record as a three or four letter file extension
    #[serde(rename = "documentType")]
    pub document_type: String,
    /// the total number of sentences in the body of this document
    #[serde(rename = "numSentences")]
    pub num_sentences: i32,
    /// the total number of words and tokens (eg. '.') in the body of this document
    #[serde(rename = "numWords")]
    pub num_words: i32,
    /// the total number of relationships expanded from the words in this document
    #[serde(rename = "numRelationships")]
    pub num_relationships: i32,
    /// the binary-size of the original document in bytes
    #[serde(rename = "binarySize")]
    pub binary_size: i64,
    /// the text-size of the original document in number of characters
    #[serde(rename = "textSize")]
    pub text_size: i32,
    /// the DROID file-type of this document/record (can be empty)
    #[serde(rename = "fileType")]
    pub file_type: String,
    /// document crawled (ie. picked up by SimSage) date-time as a unix date-time
    #[serde(rename = "crawled")]
    pub crawled: i64,
    /// document conversion (ie. turned into text by SimSage) date-time as a unix date-time
    #[serde(rename = "converted")]
    pub converted: i64,
    /// document parsed (ie. language analyzed by SimSage) date-time as a unix date-time
    #[serde(rename = "parsed")]
    pub parsed: i64,
    /// document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time
    #[serde(rename = "indexed")]
    pub indexed: i64,
    /// document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time
    #[serde(rename = "previewed")]
    pub previewed: i64,
    /// A list of similar documents matched by this query.
    #[serde(rename = "similarDocumentList")]
    pub similar_document_list: Vec<crate::models::CmSimilarDocument>,
    /// A list of similar documents matched by this query.
    #[serde(rename = "relatedList")]
    pub related_list: Vec<crate::models::CmDocumentRelationship>,
    /// A set of name-values of metadata associated with this document
    #[serde(rename = "metadata")]
    pub metadata: ::std::collections::HashMap<String, String>,
    /// the filename of this document in the DMS system
    #[serde(rename = "filename")]
    pub filename: String,
    /// the folderId of this item in the DMS system
    #[serde(rename = "folderId")]
    pub folder_id: String,
    /// how should this item be rendered? (default \"rt search\")
    #[serde(rename = "renderType")]
    pub render_type: String,
}

impl CmSearchResult {
    /// A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.
    pub fn new(kb_id: String, url: String, url_id: i32, source_id: i32, title: String, author: String, text_list: Vec<String>, text_index: i32, score: f32, sort_desc: bool, qna_result: bool, first_sentence: i32, created: i64, uploaded: i64, last_modified: i64, document_type: String, num_sentences: i32, num_words: i32, num_relationships: i32, binary_size: i64, text_size: i32, file_type: String, crawled: i64, converted: i64, parsed: i64, indexed: i64, previewed: i64, similar_document_list: Vec<crate::models::CmSimilarDocument>, related_list: Vec<crate::models::CmDocumentRelationship>, metadata: ::std::collections::HashMap<String, String>, filename: String, folder_id: String, render_type: String) -> CmSearchResult {
        CmSearchResult {
            kb_id,
            url,
            url_id,
            source_id,
            title,
            author,
            text_list,
            text_index,
            score,
            sort_desc,
            qna_result,
            first_sentence,
            created,
            uploaded,
            last_modified,
            document_type,
            num_sentences,
            num_words,
            num_relationships,
            binary_size,
            text_size,
            file_type,
            crawled,
            converted,
            parsed,
            indexed,
            previewed,
            similar_document_list,
            related_list,
            metadata,
            filename,
            folder_id,
            render_type,
        }
    }
}

