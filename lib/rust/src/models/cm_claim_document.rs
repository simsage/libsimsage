/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmClaimDocument {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "sliceId")]
    pub slice_id: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
    #[serde(rename = "lock")]
    pub lock: bool,
    #[serde(rename = "force")]
    pub force: bool,
}

impl CmClaimDocument {
    pub fn new(organisation_id: String, project_id: String, slice_id: String, document_key: String, lock: bool, force: bool) -> CmClaimDocument {
        CmClaimDocument {
            organisation_id,
            project_id,
            slice_id,
            document_key,
            lock,
            force,
        }
    }
}


