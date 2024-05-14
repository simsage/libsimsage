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
pub struct CmLocatedRedaction {
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "sliceId")]
    pub slice_id: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
    #[serde(rename = "redactionType")]
    pub redaction_type: String,
    #[serde(rename = "queryId", skip_serializing_if = "Option::is_none")]
    pub query_id: Option<i32>,
    #[serde(rename = "word", skip_serializing_if = "Option::is_none")]
    pub word: Option<String>,
    #[serde(rename = "redactionKey", skip_serializing_if = "Option::is_none")]
    pub redaction_key: Option<String>,
    #[serde(rename = "isRedacted")]
    pub is_redacted: bool,
    #[serde(rename = "page")]
    pub page: i32,
    #[serde(rename = "left")]
    pub left: f32,
    #[serde(rename = "bottom")]
    pub bottom: f32,
    #[serde(rename = "width")]
    pub width: f32,
    #[serde(rename = "height")]
    pub height: f32,
}

impl CmLocatedRedaction {
    pub fn new(project_id: String, slice_id: String, document_key: String, redaction_type: String, is_redacted: bool, page: i32, left: f32, bottom: f32, width: f32, height: f32) -> CmLocatedRedaction {
        CmLocatedRedaction {
            project_id,
            slice_id,
            document_key,
            redaction_type,
            query_id: None,
            word: None,
            redaction_key: None,
            is_redacted,
            page,
            left,
            bottom,
            width,
            height,
        }
    }
}


