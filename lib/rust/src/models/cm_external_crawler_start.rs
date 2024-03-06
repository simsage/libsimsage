/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmExternalCrawlerStart : Start parameters.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmExternalCrawlerStart {
    /// the type of this class, just in case this object is encrypted
    #[serde(rename = "objectType")]
    pub object_type: String,
    /// the main organisation (its guid id) for this source/crawler
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id of this context item, a guid-string
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
    #[serde(rename = "sid")]
    pub sid: String,
    /// the source-id of this crawler (ie. the crawler's id)
    #[serde(rename = "sourceId")]
    pub source_id: i32,
    /// the id (a guid) of the current 'go through the source once'.  This is a unique per-run identifier.
    #[serde(rename = "runId")]
    pub run_id: String,
    /// Do we need to add transport encryption
    #[serde(rename = "encrypted")]
    pub encrypted: bool,
    /// The seed used if encrypted
    #[serde(rename = "seed")]
    pub seed: i32,
}

impl CmExternalCrawlerStart {
    /// Start parameters.
    pub fn new(object_type: String, organisation_id: String, kb_id: String, sid: String, source_id: i32, run_id: String, encrypted: bool, seed: i32) -> CmExternalCrawlerStart {
        CmExternalCrawlerStart {
            object_type,
            organisation_id,
            kb_id,
            sid,
            source_id,
            run_id,
            encrypted,
            seed,
        }
    }
}


