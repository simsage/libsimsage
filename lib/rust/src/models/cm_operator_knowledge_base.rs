/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmOperatorKnowledgeBase : An association between a user (with an operator role) and a knowledge-base



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmOperatorKnowledgeBase {
    /// the user's id (its guid id) that is an operator
    #[serde(rename = "userId")]
    pub user_id: String,
    /// the organisation (its guid id) this operator applies to
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base (its guid id) this operator applies to
    #[serde(rename = "kbId")]
    pub kb_id: String,
}

impl CmOperatorKnowledgeBase {
    /// An association between a user (with an operator role) and a knowledge-base
    pub fn new(user_id: String, organisation_id: String, kb_id: String) -> CmOperatorKnowledgeBase {
        CmOperatorKnowledgeBase {
            user_id,
            organisation_id,
            kb_id,
        }
    }
}


