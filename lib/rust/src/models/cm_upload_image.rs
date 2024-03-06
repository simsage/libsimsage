/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmUploadImage : An external image representation object.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmUploadImage {
    /// the type of this class, just in case this object is encrypted
    #[serde(rename = "objectType")]
    pub object_type: String,
    /// the organisation (its guid id) this image should go into.
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base (its guid id) this image should go into.
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
    #[serde(rename = "sid")]
    pub sid: String,
    /// the source-id of this crawler (ie. the crawler's id) this image came from.
    #[serde(rename = "sourceId")]
    pub source_id: i32,
    /// A unique URL for this image, this should be the same as the document's URL this image belongs to.
    #[serde(rename = "url")]
    pub url: String,
    /// The mime-type of this image, must be either image/jpeg or image/png.
    #[serde(rename = "mimeType")]
    pub mime_type: String,
    /// The Pronom Unique ID for this image.
    #[serde(rename = "puid")]
    pub puid: String,
    /// the base64 encoded content of this image.  Must be prefixed with ';base64,'.
    #[serde(rename = "data")]
    pub data: String,
    /// Do we need to add transport encryption
    #[serde(rename = "encrypted")]
    pub encrypted: bool,
    /// The seed used if encrypted
    #[serde(rename = "seed")]
    pub seed: i32,
}

impl CmUploadImage {
    /// An external image representation object.
    pub fn new(object_type: String, organisation_id: String, kb_id: String, sid: String, source_id: i32, url: String, mime_type: String, puid: String, data: String, encrypted: bool, seed: i32) -> CmUploadImage {
        CmUploadImage {
            object_type,
            organisation_id,
            kb_id,
            sid,
            source_id,
            url,
            mime_type,
            puid,
            data,
            encrypted,
            seed,
        }
    }
}

