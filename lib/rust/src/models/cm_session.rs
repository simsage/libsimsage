/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSession : A session object, A session's id is the \"session-id\" used throughout the SimSage API.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSession {
    /// the session-id, a guid
    #[serde(rename = "id")]
    pub id: String,
    /// the user associated with this session, their id, a guid
    #[serde(rename = "userId")]
    pub user_id: String,
    /// the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association)
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// email address of this user
    #[serde(rename = "email")]
    pub email: String,
    /// the ip-address of the user logging in if captured
    #[serde(rename = "ipAddress")]
    pub ip_address: String,
    /// a unix-timestamp of the last time this session was accessed/refreshed
    #[serde(rename = "lastAccess")]
    pub last_access: i64,
    /// the main/highest role of the user signed-in
    #[serde(rename = "role")]
    pub role: String,
    /// the type of sign-in (Anonymous (i.e. valid but search only) or SimSage)
    #[serde(rename = "sessionType")]
    pub session_type: String,
}

impl CmSession {
    /// A session object, A session's id is the \"session-id\" used throughout the SimSage API.
    pub fn new(id: String, user_id: String, organisation_id: String, email: String, ip_address: String, last_access: i64, role: String, session_type: String) -> CmSession {
        CmSession {
            id,
            user_id,
            organisation_id,
            email,
            ip_address,
            last_access,
            role,
            session_type,
        }
    }
}


