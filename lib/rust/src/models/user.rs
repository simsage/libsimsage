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
pub struct User {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "email")]
    pub email: String,
    #[serde(rename = "firstName")]
    pub first_name: String,
    #[serde(rename = "surname")]
    pub surname: String,
    #[serde(rename = "passwordHash")]
    pub password_hash: String,
    #[serde(rename = "confirmed")]
    pub confirmed: bool,
    #[serde(rename = "roles")]
    pub roles: Vec<crate::models::UserRole>,
    #[serde(rename = "operatorKBList")]
    pub operator_kb_list: Vec<crate::models::OperatorKnowledgeBase>,
    #[serde(rename = "groupList")]
    pub group_list: Vec<crate::models::Group>,
    #[serde(rename = "jwtMatchNameValueCSV")]
    pub jwt_match_name_value_csv: String,
}

impl User {
    pub fn new(id: String, email: String, first_name: String, surname: String, password_hash: String, confirmed: bool, roles: Vec<crate::models::UserRole>, operator_kb_list: Vec<crate::models::OperatorKnowledgeBase>, group_list: Vec<crate::models::Group>, jwt_match_name_value_csv: String) -> User {
        User {
            id,
            email,
            first_name,
            surname,
            password_hash,
            confirmed,
            roles,
            operator_kb_list,
            group_list,
            jwt_match_name_value_csv,
        }
    }
}

