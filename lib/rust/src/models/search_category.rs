/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// SearchCategory : Search categories / metadata searching



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SearchCategory {
    #[serde(rename = "scType")]
    pub sc_type: ScType,
    #[serde(rename = "metadata")]
    pub metadata: String,
    #[serde(rename = "displayName")]
    pub display_name: String,
    #[serde(rename = "dataType")]
    pub data_type: String,
    #[serde(rename = "minValue")]
    pub min_value: i64,
    #[serde(rename = "maxValue")]
    pub max_value: i64,
    #[serde(rename = "items")]
    pub items: Vec<crate::models::NameCounterLevel>,
}

impl SearchCategory {
    /// Search categories / metadata searching
    pub fn new(sc_type: ScType, metadata: String, display_name: String, data_type: String, min_value: i64, max_value: i64, items: Vec<crate::models::NameCounterLevel>) -> SearchCategory {
        SearchCategory {
            sc_type,
            metadata,
            display_name,
            data_type,
            min_value,
            max_value,
            items,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ScType {
    #[serde(rename = "SCT_PLAIN")]
    Plain,
    #[serde(rename = "SCT_TWO_LEVEL")]
    TwoLevel,
    #[serde(rename = "SCT_NUMBER")]
    Number,
}

impl Default for ScType {
    fn default() -> ScType {
        Self::Plain
    }
}

