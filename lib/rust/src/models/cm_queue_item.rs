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
pub struct CmQueueItem {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "processId")]
    pub process_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "taskId")]
    pub task_id: String,
    #[serde(rename = "projectType")]
    pub project_type: String,
    #[serde(rename = "taskType")]
    pub task_type: String,
    #[serde(rename = "taskScreen")]
    pub task_screen: String,
    #[serde(rename = "projectCreated")]
    pub project_created: String,
    #[serde(rename = "dateTaskCreated")]
    pub date_task_created: String,
    #[serde(rename = "projectTitle")]
    pub project_title: String,
    #[serde(rename = "taskName")]
    pub task_name: String,
    #[serde(rename = "assignedUser")]
    pub assigned_user: String,
    #[serde(rename = "potentialUsers")]
    pub potential_users: Vec<String>,
    #[serde(rename = "excludedUsers")]
    pub excluded_users: Vec<String>,
    #[serde(rename = "potentialGroups")]
    pub potential_groups: Vec<String>,
    #[serde(rename = "ownsItem")]
    pub owns_item: bool,
    #[serde(rename = "canClaim")]
    pub can_claim: bool,
    #[serde(rename = "canRelease")]
    pub can_release: bool,
    #[serde(rename = "lockType")]
    pub lock_type: String,
}

impl CmQueueItem {
    pub fn new(organisation_id: String, process_id: String, project_id: String, task_id: String, project_type: String, task_type: String, task_screen: String, project_created: String, date_task_created: String, project_title: String, task_name: String, assigned_user: String, potential_users: Vec<String>, excluded_users: Vec<String>, potential_groups: Vec<String>, owns_item: bool, can_claim: bool, can_release: bool, lock_type: String) -> CmQueueItem {
        CmQueueItem {
            organisation_id,
            process_id,
            project_id,
            task_id,
            project_type,
            task_type,
            task_screen,
            project_created,
            date_task_created,
            project_title,
            task_name,
            assigned_user,
            potential_users,
            excluded_users,
            potential_groups,
            owns_item,
            can_claim,
            can_release,
            lock_type,
        }
    }
}


