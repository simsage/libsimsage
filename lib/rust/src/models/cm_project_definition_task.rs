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
pub struct CmProjectDefinitionTask {
    #[serde(rename = "taskInfo")]
    pub task_info: Box<crate::models::CmTaskInfo>,
    #[serde(rename = "detail")]
    pub detail: Box<crate::models::CmProjectDefinition>,
}

impl CmProjectDefinitionTask {
    pub fn new(task_info: crate::models::CmTaskInfo, detail: crate::models::CmProjectDefinition) -> CmProjectDefinitionTask {
        CmProjectDefinitionTask {
            task_info: Box::new(task_info),
            detail: Box::new(detail),
        }
    }
}


