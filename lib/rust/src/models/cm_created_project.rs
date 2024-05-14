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
pub struct CmCreatedProject {
    #[serde(rename = "defineProjectTaskId")]
    pub define_project_task_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
}

impl CmCreatedProject {
    pub fn new(define_project_task_id: String, project_id: String) -> CmCreatedProject {
        CmCreatedProject {
            define_project_task_id,
            project_id,
        }
    }
}


