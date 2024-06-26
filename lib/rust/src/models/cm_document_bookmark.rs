/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmDocumentBookmark : A bookmark to a document or folder.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmDocumentBookmark {
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
    /// The unique URL of a document.
    #[serde(rename = "url")]
    pub url: String,
    /// the internal SimSage id for this url
    #[serde(rename = "urlId")]
    pub url_id: i32,
    /// is this a bookmark to a folder or a file?
    #[serde(rename = "isFolder")]
    pub is_folder: bool,
    #[serde(rename = "folder", skip_serializing_if = "Option::is_none")]
    pub folder: Option<bool>,
}

impl CmDocumentBookmark {
    /// A bookmark to a document or folder.
    pub fn new(organisation_id: String, kb_id: String, user_id: String, source_id: i32, url: String, url_id: i32, is_folder: bool) -> CmDocumentBookmark {
        CmDocumentBookmark {
            organisation_id,
            kb_id,
            user_id,
            source_id,
            url,
            url_id,
            is_folder,
            folder: None,
        }
    }
}


