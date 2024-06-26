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
pub struct SignInDmsCmd {
    #[serde(rename = "jobId")]
    pub job_id: String,
    #[serde(rename = "returnAddress")]
    pub return_address: String,
    #[serde(rename = "errorStr")]
    pub error_str: String,
    #[serde(rename = "timeOut")]
    pub time_out: i64,
    #[serde(rename = "async")]
    pub r#async: bool,
    #[serde(rename = "isReturnResult")]
    pub is_return_result: bool,
    #[serde(rename = "email")]
    pub email: String,
    #[serde(rename = "password")]
    pub password: String,
    #[serde(rename = "roles")]
    pub roles: Vec<String>,
    #[serde(rename = "remoteAddress")]
    pub remote_address: String,
    #[serde(rename = "session")]
    pub session: Box<crate::models::Session>,
    #[serde(rename = "user")]
    pub user: Box<crate::models::User>,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "returnResult", skip_serializing_if = "Option::is_none")]
    pub return_result: Option<bool>,
}

impl SignInDmsCmd {
    pub fn new(job_id: String, return_address: String, error_str: String, time_out: i64, r#async: bool, is_return_result: bool, email: String, password: String, roles: Vec<String>, remote_address: String, session: crate::models::Session, user: crate::models::User, organisation_id: String) -> SignInDmsCmd {
        SignInDmsCmd {
            job_id,
            return_address,
            error_str,
            time_out,
            r#async,
            is_return_result,
            email,
            password,
            roles,
            remote_address,
            session: Box::new(session),
            user: Box::new(user),
            organisation_id,
            return_result: None,
        }
    }
}


