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
pub struct CmNewComment {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "sliceId")]
    pub slice_id: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
    #[serde(rename = "commentLevel")]
    pub comment_level: String,
    #[serde(rename = "comment")]
    pub comment: String,
    #[serde(rename = "isAuditEvent")]
    pub is_audit_event: bool,
}

impl CmNewComment {
    pub fn new(organisation_id: String, project_id: String, slice_id: String, document_key: String, comment_level: String, comment: String, is_audit_event: bool) -> CmNewComment {
        CmNewComment {
            organisation_id,
            project_id,
            slice_id,
            document_key,
            comment_level,
            comment,
            is_audit_event,
        }
    }
}

