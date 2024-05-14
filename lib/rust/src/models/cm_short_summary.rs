/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmShortSummary : a client query object



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmShortSummary {
    /// the organisation (its guid id).
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id (guid) to use
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the client's id (a unique guid for keeping state against clients)
    #[serde(rename = "clientId")]
    pub client_id: String,
    /// The unique URL of a document.
    #[serde(rename = "url")]
    pub url: String,
    /// The sentence id to start from in the document.
    #[serde(rename = "sentenceId")]
    pub sentence_id: i32,
    /// The surrounding span / offset size for around the sentence
    #[serde(rename = "span")]
    pub span: i32,
}

impl CmShortSummary {
    /// a client query object
    pub fn new(organisation_id: String, kb_id: String, client_id: String, url: String, sentence_id: i32, span: i32) -> CmShortSummary {
        CmShortSummary {
            organisation_id,
            kb_id,
            client_id,
            url,
            sentence_id,
            span,
        }
    }
}


