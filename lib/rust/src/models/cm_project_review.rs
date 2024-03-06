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
pub struct CmProjectReview {
    #[serde(rename = "projectDefinition")]
    pub project_definition: Box<crate::models::CmProjectDefinition>,
    #[serde(rename = "taskInfo")]
    pub task_info: Box<crate::models::CmTaskInfo>,
}

impl CmProjectReview {
    pub fn new(project_definition: crate::models::CmProjectDefinition, task_info: crate::models::CmTaskInfo) -> CmProjectReview {
        CmProjectReview {
            project_definition: Box::new(project_definition),
            task_info: Box::new(task_info),
        }
    }
}


