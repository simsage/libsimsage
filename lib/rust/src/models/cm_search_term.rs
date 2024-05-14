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
pub struct CmSearchTerm {
    #[serde(rename = "key")]
    pub key: String,
    #[serde(rename = "caption")]
    pub caption: String,
    #[serde(rename = "searchUsage")]
    pub search_usage: SearchUsage,
    #[serde(rename = "redactionUsage")]
    pub redaction_usage: RedactionUsage,
    #[serde(rename = "defaultValue")]
    pub default_value: String,
    #[serde(rename = "subTerms")]
    pub sub_terms: Vec<crate::models::CmSubTerm>,
}

impl CmSearchTerm {
    pub fn new(key: String, caption: String, search_usage: SearchUsage, redaction_usage: RedactionUsage, default_value: String, sub_terms: Vec<crate::models::CmSubTerm>) -> CmSearchTerm {
        CmSearchTerm {
            key,
            caption,
            search_usage,
            redaction_usage,
            default_value,
            sub_terms,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum SearchUsage {
    #[serde(rename = "REQUIRED")]
    Required,
    #[serde(rename = "NOT_AVAILABLE")]
    NotAvailable,
    #[serde(rename = "DEFAULT_ON")]
    DefaultOn,
    #[serde(rename = "DEFAULT_OFF")]
    DefaultOff,
}

impl Default for SearchUsage {
    fn default() -> SearchUsage {
        Self::Required
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RedactionUsage {
    #[serde(rename = "REQUIRED")]
    Required,
    #[serde(rename = "NOT_AVAILABLE")]
    NotAvailable,
    #[serde(rename = "DEFAULT_ON")]
    DefaultOn,
    #[serde(rename = "DEFAULT_OFF")]
    DefaultOff,
}

impl Default for RedactionUsage {
    fn default() -> RedactionUsage {
        Self::Required
    }
}

