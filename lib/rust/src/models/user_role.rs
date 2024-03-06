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
pub struct UserRole {
    #[serde(rename = "userId")]
    pub user_id: String,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "role")]
    pub role: String,
}

impl UserRole {
    pub fn new(user_id: String, organisation_id: String, role: String) -> UserRole {
        UserRole {
            user_id,
            organisation_id,
            role,
        }
    }
}

