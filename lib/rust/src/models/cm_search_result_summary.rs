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
pub struct CmSearchResultSummary {
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "kbId")]
    pub kb_id: String,
    #[serde(rename = "projectType")]
    pub project_type: String,
    #[serde(rename = "projectTitle")]
    pub project_title: String,
    #[serde(rename = "documentCount")]
    pub document_count: i32,
    #[serde(rename = "results")]
    pub results: Vec<crate::models::CmResultsSection>,
}

impl CmSearchResultSummary {
    pub fn new(project_id: String, kb_id: String, project_type: String, project_title: String, document_count: i32, results: Vec<crate::models::CmResultsSection>) -> CmSearchResultSummary {
        CmSearchResultSummary {
            project_id,
            kb_id,
            project_type,
            project_title,
            document_count,
            results,
        }
    }
}

