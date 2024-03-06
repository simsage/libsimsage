/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmGroup : A security-group object.  Groups can contain security users and are used to group/clump users.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmGroup {
    /// the organisation (its guid id) this group is associated with
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the name of this group
    #[serde(rename = "name")]
    pub name: String,
    /// a list of user-ids (can be empty) part of this group
    #[serde(rename = "userIdList")]
    pub user_id_list: Vec<String>,
}

impl CmGroup {
    /// A security-group object.  Groups can contain security users and are used to group/clump users.
    pub fn new(organisation_id: String, name: String, user_id_list: Vec<String>) -> CmGroup {
        CmGroup {
            organisation_id,
            name,
            user_id_list,
        }
    }
}


