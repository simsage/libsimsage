/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmTextToSearchConversionReturn : A result from a text-to-search try-out.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmTextToSearchConversionReturn {
    /// a return value of the try text-to-search
    #[serde(rename = "text")]
    pub text: String,
}

impl CmTextToSearchConversionReturn {
    /// A result from a text-to-search try-out.
    pub fn new(text: String) -> CmTextToSearchConversionReturn {
        CmTextToSearchConversionReturn {
            text,
        }
    }
}


