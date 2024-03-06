/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmZipSource : a zip source model



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmZipSource {
    /// the organisation (its guid id)
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base (its guid id)
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the source-id of this crawler (ie. the crawler's id)
    #[serde(rename = "sourceId")]
    pub source_id: i32,
}

impl CmZipSource {
    /// a zip source model
    pub fn new(organisation_id: String, kb_id: String, source_id: i32) -> CmZipSource {
        CmZipSource {
            organisation_id,
            kb_id,
            source_id,
        }
    }
}


