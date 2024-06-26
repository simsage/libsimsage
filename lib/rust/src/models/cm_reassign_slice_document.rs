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
pub struct CmReassignSliceDocument {
    #[serde(rename = "taskId")]
    pub task_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "documentKey")]
    pub document_key: String,
    #[serde(rename = "newUserId")]
    pub new_user_id: String,
    #[serde(rename = "newSliceId")]
    pub new_slice_id: String,
}

impl CmReassignSliceDocument {
    pub fn new(task_id: String, organisation_id: String, document_key: String, new_user_id: String, new_slice_id: String) -> CmReassignSliceDocument {
        CmReassignSliceDocument {
            task_id,
            organisation_id,
            document_key,
            new_user_id,
            new_slice_id,
        }
    }
}


