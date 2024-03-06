/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmRedactionData {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "kbId")]
    pub kb_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "url")]
    pub url: String,
    #[serde(rename = "redactions")]
    pub redactions: Vec<crate::models::CmRedaction>,
    #[serde(rename = "documentStatus")]
    pub document_status: DocumentStatus,
    #[serde(rename = "documentAction")]
    pub document_action: DocumentAction,
    #[serde(rename = "annotated")]
    pub annotated: bool,
    #[serde(rename = "createForExport")]
    pub create_for_export: bool,
    #[serde(rename = "exportNativeFormat")]
    pub export_native_format: bool,
}

impl CmRedactionData {
    pub fn new(organisation_id: String, kb_id: String, project_id: String, url: String, redactions: Vec<crate::models::CmRedaction>, document_status: DocumentStatus, document_action: DocumentAction, annotated: bool, create_for_export: bool, export_native_format: bool) -> CmRedactionData {
        CmRedactionData {
            organisation_id,
            kb_id,
            project_id,
            url,
            redactions,
            document_status,
            document_action,
            annotated,
            create_for_export,
            export_native_format,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum DocumentStatus {
    #[serde(rename = "NEW")]
    New,
    #[serde(rename = "IN_PROGRESS")]
    InProgress,
    #[serde(rename = "COMPLETED")]
    Completed,
}

impl Default for DocumentStatus {
    fn default() -> DocumentStatus {
        Self::New
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum DocumentAction {
    #[serde(rename = "NONE")]
    None,
    #[serde(rename = "REDACT")]
    Redact,
    #[serde(rename = "IGNORE")]
    Ignore,
    #[serde(rename = "DELETE")]
    Delete,
}

impl Default for DocumentAction {
    fn default() -> DocumentAction {
        Self::None
    }
}

