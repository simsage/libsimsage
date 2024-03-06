/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmFailedSourceDocument : Description of an external document upload failure.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmFailedSourceDocument {
    /// the main organisation (its guid id) for this source/crawler
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id (its guid id) for this source/crawler
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the source-id, primary key of the source
    #[serde(rename = "sourceId")]
    pub source_id: i32,
    /// the unique id of the document in the source system, mostly same as web url
    #[serde(rename = "sourceSystemId")]
    pub source_system_id: String,
    /// the web url to access the document, can be different from url
    #[serde(rename = "webUrl")]
    pub web_url: String,
    /// the timestamp of the crawler run adding the exception
    #[serde(rename = "runId")]
    pub run_id: i64,
    /// the error message added by the system
    #[serde(rename = "errorMessage")]
    pub error_message: String,
    /// Do we need to add transport encryption
    #[serde(rename = "encrypted")]
    pub encrypted: bool,
    /// The seed used if encrypted
    #[serde(rename = "seed")]
    pub seed: i32,
    /// the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
    #[serde(rename = "sid")]
    pub sid: String,
}

impl CmFailedSourceDocument {
    /// Description of an external document upload failure.
    pub fn new(organisation_id: String, kb_id: String, source_id: i32, source_system_id: String, web_url: String, run_id: i64, error_message: String, encrypted: bool, seed: i32, sid: String) -> CmFailedSourceDocument {
        CmFailedSourceDocument {
            organisation_id,
            kb_id,
            source_id,
            source_system_id,
            web_url,
            run_id,
            error_message,
            encrypted,
            seed,
            sid,
        }
    }
}

