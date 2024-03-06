/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmSubTerm {
    #[serde(rename = "key")]
    pub key: String,
    #[serde(rename = "caption")]
    pub caption: String,
    #[serde(rename = "type")]
    pub r#type: String,
}

impl CmSubTerm {
    pub fn new(key: String, caption: String, r#type: String) -> CmSubTerm {
        CmSubTerm {
            key,
            caption,
            r#type,
        }
    }
}


