/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmDocumentSubscription : the document subscription



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmDocumentSubscription {
    /// the main organisation (its guid id) for this source/crawler
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id of this context item, a guid-string
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the user's id, a guid
    #[serde(rename = "userId")]
    pub user_id: String,
    /// the source-id of the owner of the url
    #[serde(rename = "sourceId")]
    pub source_id: i32,
    /// The parent of a folder or a file (a guid or an empty string for a top-level folder)
    #[serde(rename = "parentId")]
    pub parent_id: String,
    /// Either a file or a folder ID
    #[serde(rename = "objectId")]
    pub object_id: String,
    /// The unique URL of a document.
    #[serde(rename = "url")]
    pub url: String,
    /// the internal SimSage id for this url
    #[serde(rename = "urlId")]
    pub url_id: i32,
    /// The name of the folder or file
    #[serde(rename = "name")]
    pub name: String,
    /// is this a subscription to a folder or a file?
    #[serde(rename = "isFolder")]
    pub is_folder: bool,
    #[serde(rename = "folder", skip_serializing_if = "Option::is_none")]
    pub folder: Option<bool>,
}

impl CmDocumentSubscription {
    /// the document subscription
    pub fn new(organisation_id: String, kb_id: String, user_id: String, source_id: i32, parent_id: String, object_id: String, url: String, url_id: i32, name: String, is_folder: bool) -> CmDocumentSubscription {
        CmDocumentSubscription {
            organisation_id,
            kb_id,
            user_id,
            source_id,
            parent_id,
            object_id,
            url,
            url_id,
            name,
            is_folder,
            folder: None,
        }
    }
}


