/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmGroupList : A security-group list.  A list of groups for security purposes.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmGroupList {
    /// the list of filtered/paginated groups
    #[serde(rename = "groupList")]
    pub group_list: Vec<crate::models::CmGroup>,
    /// the list of users for all groups
    #[serde(rename = "userList")]
    pub user_list: Vec<crate::models::CmUser>,
}

impl CmGroupList {
    /// A security-group list.  A list of groups for security purposes.
    pub fn new(group_list: Vec<crate::models::CmGroup>, user_list: Vec<crate::models::CmUser>) -> CmGroupList {
        CmGroupList {
            group_list,
            user_list,
        }
    }
}


