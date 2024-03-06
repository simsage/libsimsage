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
pub struct CmSearchSubTerm {
    #[serde(rename = "key")]
    pub key: String,
    #[serde(rename = "value")]
    pub value: String,
    #[serde(rename = "type")]
    pub r#type: String,
}

impl CmSearchSubTerm {
    pub fn new(key: String, value: String, r#type: String) -> CmSearchSubTerm {
        CmSearchSubTerm {
            key,
            value,
            r#type,
        }
    }
}


