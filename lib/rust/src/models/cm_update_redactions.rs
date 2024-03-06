/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmUpdateRedactions {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "sliceId")]
    pub slice_id: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
    #[serde(rename = "nextStatus")]
    pub next_status: String,
    #[serde(rename = "redactions")]
    pub redactions: Vec<crate::models::CmLocatedRedaction>,
}

impl CmUpdateRedactions {
    pub fn new(organisation_id: String, project_id: String, slice_id: String, document_key: String, next_status: String, redactions: Vec<crate::models::CmLocatedRedaction>) -> CmUpdateRedactions {
        CmUpdateRedactions {
            organisation_id,
            project_id,
            slice_id,
            document_key,
            next_status,
            redactions,
        }
    }
}

