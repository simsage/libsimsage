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
pub struct CmKeyedSearchTerm {
    #[serde(rename = "key")]
    pub key: String,
    #[serde(rename = "redact")]
    pub redact: bool,
    #[serde(rename = "redactionDisabled")]
    pub redaction_disabled: bool,
    #[serde(rename = "rowRequired")]
    pub row_required: bool,
    #[serde(rename = "search")]
    pub search: bool,
    #[serde(rename = "searchDisabled")]
    pub search_disabled: bool,
    #[serde(rename = "value")]
    pub value: String,
    #[serde(rename = "subTerms")]
    pub sub_terms: Vec<crate::models::CmSearchSubTerm>,
}

impl CmKeyedSearchTerm {
    pub fn new(key: String, redact: bool, redaction_disabled: bool, row_required: bool, search: bool, search_disabled: bool, value: String, sub_terms: Vec<crate::models::CmSearchSubTerm>) -> CmKeyedSearchTerm {
        CmKeyedSearchTerm {
            key,
            redact,
            redaction_disabled,
            row_required,
            search,
            search_disabled,
            value,
            sub_terms,
        }
    }
}


