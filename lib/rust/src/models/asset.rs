/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// Asset : the asset that was seen



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct Asset {
    #[serde(rename = "url")]
    pub url: String,
    #[serde(rename = "parentUrl")]
    pub parent_url: String,
    #[serde(rename = "mimeType")]
    pub mime_type: String,
    #[serde(rename = "acls")]
    pub acls: Vec<crate::models::AssetAcl>,
    #[serde(rename = "deltaRootId")]
    pub delta_root_id: String,
    #[serde(rename = "title")]
    pub title: String,
    #[serde(rename = "author")]
    pub author: String,
    #[serde(rename = "binarySize")]
    pub binary_size: i64,
    #[serde(rename = "template")]
    pub template: String,
    #[serde(rename = "created")]
    pub created: i64,
    #[serde(rename = "lastModified")]
    pub last_modified: i64,
    #[serde(rename = "metadata")]
    pub metadata: ::std::collections::HashMap<String, String>,
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<String>,
    #[serde(rename = "previewImage", skip_serializing_if = "Option::is_none")]
    pub preview_image: Option<String>,
}

impl Asset {
    /// the asset that was seen
    pub fn new(url: String, parent_url: String, mime_type: String, acls: Vec<crate::models::AssetAcl>, delta_root_id: String, title: String, author: String, binary_size: i64, template: String, created: i64, last_modified: i64, metadata: ::std::collections::HashMap<String, String>) -> Asset {
        Asset {
            url,
            parent_url,
            mime_type,
            acls,
            delta_root_id,
            title,
            author,
            binary_size,
            template,
            created,
            last_modified,
            metadata,
            data: None,
            preview_image: None,
        }
    }
}


