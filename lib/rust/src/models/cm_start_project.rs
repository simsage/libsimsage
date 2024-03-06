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
pub struct CmStartProject {
    #[serde(rename = "taskId")]
    pub task_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
}

impl CmStartProject {
    pub fn new(task_id: String, organisation_id: String) -> CmStartProject {
        CmStartProject {
            task_id,
            organisation_id,
        }
    }
}


