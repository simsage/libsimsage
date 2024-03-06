/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmExternalCrawlerDeleteFolder : An external image representation object.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmExternalCrawlerDeleteFolder {
    /// the type of this class, just in case this object is encrypted
    #[serde(rename = "objectType")]
    pub object_type: String,
    /// the main organisation (its guid id) for this source/crawler
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id of this context item, a guid-string
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
    #[serde(rename = "sid")]
    pub sid: String,
    /// the source-id of this crawler (ie. the crawler's id)
    #[serde(rename = "sourceId")]
    pub source_id: i32,
    /// the document-folder to delete
    #[serde(rename = "folderUrl")]
    pub folder_url: String,
    /// Do we need to add transport encryption
    #[serde(rename = "encrypted")]
    pub encrypted: bool,
    /// The seed used if encrypted
    #[serde(rename = "seed")]
    pub seed: i32,
}

impl CmExternalCrawlerDeleteFolder {
    /// An external image representation object.
    pub fn new(object_type: String, organisation_id: String, kb_id: String, sid: String, source_id: i32, folder_url: String, encrypted: bool, seed: i32) -> CmExternalCrawlerDeleteFolder {
        CmExternalCrawlerDeleteFolder {
            object_type,
            organisation_id,
            kb_id,
            sid,
            source_id,
            folder_url,
            encrypted,
            seed,
        }
    }
}

