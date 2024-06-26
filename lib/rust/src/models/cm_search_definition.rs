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
pub struct CmSearchDefinition {
    #[serde(rename = "keyedQueries")]
    pub keyed_queries: Vec<crate::models::CmSearchTerm>,
    #[serde(rename = "semanticTermQueries")]
    pub semantic_term_queries: Vec<crate::models::CmSearchTerm>,
}

impl CmSearchDefinition {
    pub fn new(keyed_queries: Vec<crate::models::CmSearchTerm>, semantic_term_queries: Vec<crate::models::CmSearchTerm>) -> CmSearchDefinition {
        CmSearchDefinition {
            keyed_queries,
            semantic_term_queries,
        }
    }
}


