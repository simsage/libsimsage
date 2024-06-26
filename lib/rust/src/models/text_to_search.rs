/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// TextToSearch : a list of text-to-search items



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct TextToSearch {
    #[serde(rename = "type")]
    pub r#type: String,
    #[serde(rename = "searchPart")]
    pub search_part: String,
    #[serde(rename = "matchWords")]
    pub match_words: Vec<Vec<String>>,
}

impl TextToSearch {
    /// a list of text-to-search items
    pub fn new(r#type: String, search_part: String, match_words: Vec<Vec<String>>) -> TextToSearch {
        TextToSearch {
            r#type,
            search_part,
            match_words,
        }
    }
}


