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
pub struct CmTaskInfo {
    #[serde(rename = "taskId")]
    pub task_id: String,
    #[serde(rename = "projectId")]
    pub project_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "sourceKbId")]
    pub source_kb_id: String,
    #[serde(rename = "crawlerKbId", skip_serializing_if = "Option::is_none")]
    pub crawler_kb_id: Option<String>,
    #[serde(rename = "projectType")]
    pub project_type: String,
    #[serde(rename = "projectTitle")]
    pub project_title: String,
    #[serde(rename = "projectNarrative")]
    pub project_narrative: String,
    #[serde(rename = "sliceId", skip_serializing_if = "Option::is_none")]
    pub slice_id: Option<String>,
    #[serde(rename = "processId")]
    pub process_id: String,
    #[serde(rename = "processName")]
    pub process_name: String,
    #[serde(rename = "taskType")]
    pub task_type: String,
    #[serde(rename = "taskName")]
    pub task_name: String,
    #[serde(rename = "dateCreated")]
    pub date_created: String,
    #[serde(rename = "dateCompleted", skip_serializing_if = "Option::is_none")]
    pub date_completed: Option<String>,
    #[serde(rename = "potentialUsers")]
    pub potential_users: String,
    #[serde(rename = "excludedUsers")]
    pub excluded_users: String,
    #[serde(rename = "potentialGroups")]
    pub potential_groups: String,
    #[serde(rename = "assignedUser", skip_serializing_if = "Option::is_none")]
    pub assigned_user: Option<String>,
}

impl CmTaskInfo {
    pub fn new(task_id: String, project_id: String, organisation_id: String, source_kb_id: String, project_type: String, project_title: String, project_narrative: String, process_id: String, process_name: String, task_type: String, task_name: String, date_created: String, potential_users: String, excluded_users: String, potential_groups: String) -> CmTaskInfo {
        CmTaskInfo {
            task_id,
            project_id,
            organisation_id,
            source_kb_id,
            crawler_kb_id: None,
            project_type,
            project_title,
            project_narrative,
            slice_id: None,
            process_id,
            process_name,
            task_type,
            task_name,
            date_created,
            date_completed: None,
            potential_users,
            excluded_users,
            potential_groups,
            assigned_user: None,
        }
    }
}


