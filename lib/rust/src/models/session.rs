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
pub struct Session {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "userId")]
    pub user_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "email")]
    pub email: String,
    #[serde(rename = "ipAddress")]
    pub ip_address: String,
    #[serde(rename = "lastAccess")]
    pub last_access: i64,
    #[serde(rename = "role")]
    pub role: String,
    #[serde(rename = "sessionType")]
    pub session_type: String,
    #[serde(rename = "contextStack")]
    pub context_stack: Vec<crate::models::ContextItem>,
}

impl Session {
    pub fn new(id: String, user_id: String, organisation_id: String, email: String, ip_address: String, last_access: i64, role: String, session_type: String, context_stack: Vec<crate::models::ContextItem>) -> Session {
        Session {
            id,
            user_id,
            organisation_id,
            email,
            ip_address,
            last_access,
            role,
            session_type,
            context_stack,
        }
    }
}


