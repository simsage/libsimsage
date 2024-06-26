/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSemanticsPaginated : A semantic pagination object.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSemanticsPaginated {
    /// the organisation (its guid id).
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base (its guid id).
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// pagination control, the last semantic word we looked for previously
    #[serde(rename = "prevWord")]
    pub prev_word: String,
    /// the number of semantics to return at a time.
    #[serde(rename = "pageSize")]
    pub page_size: i32,
    /// An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated.
    #[serde(rename = "filter")]
    pub filter: String,
}

impl CmSemanticsPaginated {
    /// A semantic pagination object.
    pub fn new(organisation_id: String, kb_id: String, prev_word: String, page_size: i32, filter: String) -> CmSemanticsPaginated {
        CmSemanticsPaginated {
            organisation_id,
            kb_id,
            prev_word,
            page_size,
            filter,
        }
    }
}


