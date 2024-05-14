/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSingleDocumentSummaryRequest : a document summarization object.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSingleDocumentSummaryRequest {
    /// the organisation (its guid id)
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id (its guid id)
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the url of the document to summarize
    #[serde(rename = "url")]
    pub url: String,
    /// the top-n sentences to return for the summary of the documents
    #[serde(rename = "top")]
    pub top: i32,
}

impl CmSingleDocumentSummaryRequest {
    /// a document summarization object.
    pub fn new(organisation_id: String, kb_id: String, url: String, top: i32) -> CmSingleDocumentSummaryRequest {
        CmSingleDocumentSummaryRequest {
            organisation_id,
            kb_id,
            url,
            top,
        }
    }
}


