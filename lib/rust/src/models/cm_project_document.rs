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
pub struct CmProjectDocument {
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "source")]
    pub source: String,
    #[serde(rename = "extension")]
    pub extension: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
    #[serde(rename = "title")]
    pub title: String,
    #[serde(rename = "size")]
    pub size: i64,
    #[serde(rename = "folderId")]
    pub folder_id: String,
    #[serde(rename = "count")]
    pub count: i64,
    #[serde(rename = "confidence")]
    pub confidence: i32,
    #[serde(rename = "displayType")]
    pub display_type: String,
}

impl CmProjectDocument {
    pub fn new(project_id: String, source: String, extension: String, document_key: String, title: String, size: i64, folder_id: String, count: i64, confidence: i32, display_type: String) -> CmProjectDocument {
        CmProjectDocument {
            project_id,
            source,
            extension,
            document_key,
            title,
            size,
            folder_id,
            count,
            confidence,
            display_type,
        }
    }
}


