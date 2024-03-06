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
pub struct CmRemoveSliceDocument {
    #[serde(rename = "taskId")]
    pub task_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
}

impl CmRemoveSliceDocument {
    pub fn new(task_id: String, organisation_id: String, document_key: String) -> CmRemoveSliceDocument {
        CmRemoveSliceDocument {
            task_id,
            organisation_id,
            document_key,
        }
    }
}

