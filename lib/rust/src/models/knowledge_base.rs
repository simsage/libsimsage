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
pub struct KnowledgeBase {
    #[serde(rename = "kbId")]
    pub kb_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "email")]
    pub email: String,
    #[serde(rename = "securityId")]
    pub security_id: String,
    #[serde(rename = "created")]
    pub created: i64,
    #[serde(rename = "maxQueriesPerDay")]
    pub max_queries_per_day: i64,
    #[serde(rename = "analyticsWindowInMonths")]
    pub analytics_window_in_months: i32,
    #[serde(rename = "enabled")]
    pub enabled: bool,
    #[serde(rename = "operatorEnabled")]
    pub operator_enabled: bool,
    #[serde(rename = "capacityWarnings")]
    pub capacity_warnings: bool,
    #[serde(rename = "indexSchedule")]
    pub index_schedule: String,
    #[serde(rename = "lastIndexOptimizationTime")]
    pub last_index_optimization_time: i64,
    #[serde(rename = "projectKb")]
    pub project_kb: bool,
}

impl KnowledgeBase {
    pub fn new(kb_id: String, organisation_id: String, name: String, email: String, security_id: String, created: i64, max_queries_per_day: i64, analytics_window_in_months: i32, enabled: bool, operator_enabled: bool, capacity_warnings: bool, index_schedule: String, last_index_optimization_time: i64, project_kb: bool) -> KnowledgeBase {
        KnowledgeBase {
            kb_id,
            organisation_id,
            name,
            email,
            security_id,
            created,
            max_queries_per_day,
            analytics_window_in_months,
            enabled,
            operator_enabled,
            capacity_warnings,
            index_schedule,
            last_index_optimization_time,
            project_kb,
        }
    }
}

