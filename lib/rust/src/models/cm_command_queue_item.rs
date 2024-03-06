/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmCommandQueueItem : a progress/status item from the async command queue



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmCommandQueueItem {
    /// the job-id, primary key
    #[serde(rename = "jobId")]
    pub job_id: String,
    /// the name of the lock
    #[serde(rename = "key")]
    pub key: String,
    /// when this lock will expire as a Unix date-time
    #[serde(rename = "expiry")]
    pub expiry: i64,
}

impl CmCommandQueueItem {
    /// a progress/status item from the async command queue
    pub fn new(job_id: String, key: String, expiry: i64) -> CmCommandQueueItem {
        CmCommandQueueItem {
            job_id,
            key,
            expiry,
        }
    }
}


