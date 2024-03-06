/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSynSetFind : a SynSet find object.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSynSetFind {
    /// the organisation (its guid id).
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base (its guid id).
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// pagination control, the page to get (starting at zero (0))
    #[serde(rename = "page")]
    pub page: i32,
    /// The number of results to return maximum
    #[serde(rename = "pageSize")]
    pub page_size: i32,
    /// the synset(s) to look for
    #[serde(rename = "filter")]
    pub filter: String,
}

impl CmSynSetFind {
    /// a SynSet find object.
    pub fn new(organisation_id: String, kb_id: String, page: i32, page_size: i32, filter: String) -> CmSynSetFind {
        CmSynSetFind {
            organisation_id,
            kb_id,
            page,
            page_size,
            filter,
        }
    }
}


