/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmRestoreFromText : an object with the text to restore from



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmRestoreFromText {
    /// the organisation (its guid id).
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the base64 text to restore from.
    #[serde(rename = "base64Text")]
    pub base64_text: String,
    /// the file-type of the base64 text (must be text/plain)
    #[serde(rename = "fileType")]
    pub file_type: String,
}

impl CmRestoreFromText {
    /// an object with the text to restore from
    pub fn new(organisation_id: String, base64_text: String, file_type: String) -> CmRestoreFromText {
        CmRestoreFromText {
            organisation_id,
            base64_text,
            file_type,
        }
    }
}

