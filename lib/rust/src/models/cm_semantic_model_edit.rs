/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmSemanticModelEdit : a semantic update/create object



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSemanticModelEdit {
    /// The word of a semantic is the more specific concept (eg. in 'John is a person', then 'John' is the more specific concept, and 'person' is the semantic).
    #[serde(rename = "word")]
    pub word: String,
    /// The previous value for 'word' if this is a semantic changing its word value (update)
    #[serde(rename = "prevWord")]
    pub prev_word: String,
    /// The semantic is the more general concept (eg. in 'John is a person', 'person' is the more general concept, and 'John' is more specific).
    #[serde(rename = "semantic")]
    pub semantic: String,
}

impl CmSemanticModelEdit {
    /// a semantic update/create object
    pub fn new(word: String, prev_word: String, semantic: String) -> CmSemanticModelEdit {
        CmSemanticModelEdit {
            word,
            prev_word,
            semantic,
        }
    }
}


