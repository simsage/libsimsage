/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmUser : A SimSage user object for editing and reviewing.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmUser {
    /// the user's id, a guid
    #[serde(rename = "id")]
    pub id: String,
    /// email address of this user (their sign-in and primary identity)
    #[serde(rename = "email")]
    pub email: String,
    /// the first-name of this user
    #[serde(rename = "firstName")]
    pub first_name: String,
    /// the second-name (surname) of this user
    #[serde(rename = "surname")]
    pub surname: String,
    /// a list of SimSage roles associated with this user
    #[serde(rename = "roles")]
    pub roles: Vec<crate::models::CmUserRole>,
    /// a list of knowledge-bases this user is an operator for
    #[serde(rename = "operatorKBList")]
    pub operator_kb_list: Vec<crate::models::CmOperatorKnowledgeBase>,
    /// a list of security-groups this user is part of (can be empty)
    #[serde(rename = "groupList")]
    pub group_list: Vec<crate::models::CmGroup>,
    /// an optional set of csv separated name1=value1,name2=value2 for JWT matching
    #[serde(rename = "jwtMatchNameValueCSV")]
    pub jwt_match_name_value_csv: String,
}

impl CmUser {
    /// A SimSage user object for editing and reviewing.
    pub fn new(id: String, email: String, first_name: String, surname: String, roles: Vec<crate::models::CmUserRole>, operator_kb_list: Vec<crate::models::CmOperatorKnowledgeBase>, group_list: Vec<crate::models::CmGroup>, jwt_match_name_value_csv: String) -> CmUser {
        CmUser {
            id,
            email,
            first_name,
            surname,
            roles,
            operator_kb_list,
            group_list,
            jwt_match_name_value_csv,
        }
    }
}


