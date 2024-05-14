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
pub struct CmSlicedDocumentFilter {
    #[serde(rename = "page")]
    pub page: i32,
    #[serde(rename = "pageSize")]
    pub page_size: i32,
    #[serde(rename = "sortDirection")]
    pub sort_direction: i32,
    #[serde(rename = "sortColumn")]
    pub sort_column: String,
    #[serde(rename = "statuses")]
    pub statuses: Vec<String>,
    #[serde(rename = "selectedUsers")]
    pub selected_users: Vec<String>,
    #[serde(rename = "selectedSources")]
    pub selected_sources: Vec<String>,
    #[serde(rename = "selectedConfidences")]
    pub selected_confidences: Vec<String>,
}

impl CmSlicedDocumentFilter {
    pub fn new(page: i32, page_size: i32, sort_direction: i32, sort_column: String, statuses: Vec<String>, selected_users: Vec<String>, selected_sources: Vec<String>, selected_confidences: Vec<String>) -> CmSlicedDocumentFilter {
        CmSlicedDocumentFilter {
            page,
            page_size,
            sort_direction,
            sort_column,
            statuses,
            selected_users,
            selected_sources,
            selected_confidences,
        }
    }
}


