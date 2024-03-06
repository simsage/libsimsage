/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmDocumentVersion : A version object description for a binary-document.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmDocumentVersion {
    /// The unique URL of this document.
    #[serde(rename = "url")]
    pub url: String,
    /// version of this binary
    #[serde(rename = "version")]
    pub version: i32,
    /// A unique hash-string identifying SimSage level changes of this document.
    #[serde(rename = "changeHash")]
    pub change_hash: String,
    /// a unix-timestamp for the creation of this document version
    #[serde(rename = "created")]
    pub created: i64,
}

impl CmDocumentVersion {
    /// A version object description for a binary-document.
    pub fn new(url: String, version: i32, change_hash: String, created: i64) -> CmDocumentVersion {
        CmDocumentVersion {
            url,
            version,
            change_hash,
            created,
        }
    }
}


