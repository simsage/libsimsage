/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmCategorizationPaginatedList : A categorization pagination list.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmCategorizationPaginatedList {
    /// the organisation (its guid id)
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base (its guid id)
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// a list of categorizations, paginated
    #[serde(rename = "categorizationList")]
    pub categorization_list: Vec<crate::models::CmCategorization>,
    /// the total number of categorizations in SimSage for this org/kb
    #[serde(rename = "totalCategorizationCount")]
    pub total_categorization_count: i32,
}

impl CmCategorizationPaginatedList {
    /// A categorization pagination list.
    pub fn new(organisation_id: String, kb_id: String, categorization_list: Vec<crate::models::CmCategorization>, total_categorization_count: i32) -> CmCategorizationPaginatedList {
        CmCategorizationPaginatedList {
            organisation_id,
            kb_id,
            categorization_list,
            total_categorization_count,
        }
    }
}

