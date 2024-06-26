/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSessionVersion : A SimSage combined session / user and version object.  This is the object returned when you've signed-in successfully.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSessionVersion {
    #[serde(rename = "session")]
    pub session: Box<crate::models::CmSession>,
    #[serde(rename = "user")]
    pub user: Box<crate::models::CmUser>,
    /// list of organisations for admin users
    #[serde(rename = "organisationList")]
    pub organisation_list: Vec<crate::models::CmOrganisation>,
    /// version of this service
    #[serde(rename = "version")]
    pub version: String,
}

impl CmSessionVersion {
    /// A SimSage combined session / user and version object.  This is the object returned when you've signed-in successfully.
    pub fn new(session: crate::models::CmSession, user: crate::models::CmUser, organisation_list: Vec<crate::models::CmOrganisation>, version: String) -> CmSessionVersion {
        CmSessionVersion {
            session: Box::new(session),
            user: Box::new(user),
            organisation_list,
            version,
        }
    }
}


