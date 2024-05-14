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
pub struct CmCrawlerStatusTask {
    #[serde(rename = "taskInfo")]
    pub task_info: Box<crate::models::CmTaskInfo>,
    #[serde(rename = "detail")]
    pub detail: Box<crate::models::CmCrawlerStatus>,
}

impl CmCrawlerStatusTask {
    pub fn new(task_info: crate::models::CmTaskInfo, detail: crate::models::CmCrawlerStatus) -> CmCrawlerStatusTask {
        CmCrawlerStatusTask {
            task_info: Box::new(task_info),
            detail: Box::new(detail),
        }
    }
}


