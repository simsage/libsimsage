/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSynSetList : A list of SynSets for returning from SimSage for viewing.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSynSetList {
    /// A list of CMSynSet items
    #[serde(rename = "list")]
    pub list: String,
    /// the number of total SynSet items in your query
    #[serde(rename = "totalSize")]
    pub total_size: i32,
}

impl CmSynSetList {
    /// A list of SynSets for returning from SimSage for viewing.
    pub fn new(list: String, total_size: i32) -> CmSynSetList {
        CmSynSetList {
            list,
            total_size,
        }
    }
}


