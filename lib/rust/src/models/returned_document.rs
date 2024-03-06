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
pub struct ReturnedDocument {
    #[serde(rename = "document")]
    pub document: String,
}

impl ReturnedDocument {
    pub fn new(document: String) -> ReturnedDocument {
        ReturnedDocument {
            document,
        }
    }
}


