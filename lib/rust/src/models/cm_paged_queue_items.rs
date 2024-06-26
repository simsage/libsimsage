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
pub struct CmPagedQueueItems {
    #[serde(rename = "total")]
    pub total: i64,
    #[serde(rename = "results")]
    pub results: Vec<crate::models::CmQueueItem>,
}

impl CmPagedQueueItems {
    pub fn new(total: i64, results: Vec<crate::models::CmQueueItem>) -> CmPagedQueueItems {
        CmPagedQueueItems {
            total,
            results,
        }
    }
}


