/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmClientQueryResult : A SimSage return search-result message for Q&A and semantic-search queries.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmClientQueryResult {
    #[serde(rename = "messageType")]
    pub message_type: String,
    /// the organisation (its guid id).
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id (its guid id)
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the text sent.
    #[serde(rename = "text")]
    pub text: String,
    /// is there a result/reply or not?
    #[serde(rename = "hasResult")]
    pub has_result: bool,
    /// a list of reference urls associated with this answer
    #[serde(rename = "urlList")]
    pub url_list: Vec<String>,
    /// metadata associated with the Question/Answer pair, user defined.
    #[serde(rename = "metadata")]
    pub metadata: String,
    /// how well the Q&A matcher performed a value between 0.0 and 1.0
    #[serde(rename = "qnaScore")]
    pub qna_score: f32,
    /// A list of image urls associated with the Q&A pair
    #[serde(rename = "imageList")]
    pub image_list: Vec<String>,
    /// the total number of documents found (but not included necessarily)
    #[serde(rename = "totalDocumentCount")]
    pub total_document_count: i32,
    /// Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query.
    #[serde(rename = "shardSizeList")]
    pub shard_size_list: Vec<i32>,
    /// the actual search results, one for each item found
    #[serde(rename = "resultList")]
    pub result_list: Vec<crate::models::CmSearchResult>,
    /// a spelling correction suggestion if appropriate and enabled.
    #[serde(rename = "spellingCorrection")]
    pub spelling_correction: String,
    /// A descriptor of semantic categories and words with frequencies in each category
    #[serde(rename = "semanticSet")]
    pub semantic_set: ::std::collections::HashMap<String, Vec<crate::models::CmWordFrequency>>,
    /// do we know the email address of this person?  if they've supplied it in the past this will be set to true.
    #[serde(rename = "knowEmail")]
    pub know_email: bool,
    /// updated categories (if applicable) with updated counts
    #[serde(rename = "categoryList")]
    pub category_list: Vec<crate::models::SearchCategory>,
    /// A list of syn-sets used in the query
    #[serde(rename = "synSetList")]
    pub syn_set_list: Vec<crate::models::CmSynSet>,
    /// Does this source require custom render templates or use ordinary search-results?
    #[serde(rename = "customRender")]
    pub custom_render: bool,
    /// a map of sourceId -> number of documents found inside this source
    #[serde(rename = "sourceIdToCounts")]
    pub source_id_to_counts: ::std::collections::HashMap<String, i32>,
    /// a map of document-type -> number of documents found of this type
    #[serde(rename = "documentTypeToCounts")]
    pub document_type_to_counts: ::std::collections::HashMap<String, i32>,
    /// a list of previous searches if applicable
    #[serde(rename = "savedSearchList")]
    pub saved_search_list: Vec<crate::models::CmSavedSearch>,
    /// an optional summarization of the search results
    #[serde(rename = "querySummarization")]
    pub query_summarization: String,
}

impl CmClientQueryResult {
    /// A SimSage return search-result message for Q&A and semantic-search queries.
    pub fn new(message_type: String, organisation_id: String, kb_id: String, text: String, has_result: bool, url_list: Vec<String>, metadata: String, qna_score: f32, image_list: Vec<String>, total_document_count: i32, shard_size_list: Vec<i32>, result_list: Vec<crate::models::CmSearchResult>, spelling_correction: String, semantic_set: ::std::collections::HashMap<String, Vec<crate::models::CmWordFrequency>>, know_email: bool, category_list: Vec<crate::models::SearchCategory>, syn_set_list: Vec<crate::models::CmSynSet>, custom_render: bool, source_id_to_counts: ::std::collections::HashMap<String, i32>, document_type_to_counts: ::std::collections::HashMap<String, i32>, saved_search_list: Vec<crate::models::CmSavedSearch>, query_summarization: String) -> CmClientQueryResult {
        CmClientQueryResult {
            message_type,
            organisation_id,
            kb_id,
            text,
            has_result,
            url_list,
            metadata,
            qna_score,
            image_list,
            total_document_count,
            shard_size_list,
            result_list,
            spelling_correction,
            semantic_set,
            know_email,
            category_list,
            syn_set_list,
            custom_render,
            source_id_to_counts,
            document_type_to_counts,
            saved_search_list,
            query_summarization,
        }
    }
}

