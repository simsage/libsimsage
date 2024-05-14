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
pub struct CmSlicedDocumentRequest {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "taskId")]
    pub task_id: String,
    #[serde(rename = "sliceId")]
    pub slice_id: String,
    #[serde(rename = "filter")]
    pub filter: Box<crate::models::CmSlicedDocumentFilter>,
}

impl CmSlicedDocumentRequest {
    pub fn new(organisation_id: String, task_id: String, slice_id: String, filter: crate::models::CmSlicedDocumentFilter) -> CmSlicedDocumentRequest {
        CmSlicedDocumentRequest {
            organisation_id,
            task_id,
            slice_id,
            filter: Box::new(filter),
        }
    }
}


