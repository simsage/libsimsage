/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmDocumentRelationship : A document that related to this document in some fashion (parent or child)



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmDocumentRelationship {
    /// the url-id of this document
    #[serde(rename = "urlId")]
    pub url_id: i32,
    /// if true, this is a child relationship, otherwise a parent relationship
    #[serde(rename = "isChild")]
    pub is_child: bool,
    /// the related document's id
    #[serde(rename = "relatedUrlId")]
    pub related_url_id: i32,
    /// the url of the related document
    #[serde(rename = "relatedUrl")]
    pub related_url: String,
    /// the web-url (if set) if there is a web-link for this document
    #[serde(rename = "webUrl")]
    pub web_url: String,
    /// the title of the related document for display
    #[serde(rename = "title")]
    pub title: String,
    /// size in bytes of the related document
    #[serde(rename = "binarySize")]
    pub binary_size: i64,
    /// the type of the related document
    #[serde(rename = "documentType")]
    pub document_type: String,
    /// The unix creation date-time of the related item
    #[serde(rename = "created")]
    pub created: i64,
    /// The unix last-modified date-time of the related item
    #[serde(rename = "lastModified")]
    pub last_modified: i64,
    #[serde(rename = "child", skip_serializing_if = "Option::is_none")]
    pub child: Option<bool>,
}

impl CmDocumentRelationship {
    /// A document that related to this document in some fashion (parent or child)
    pub fn new(url_id: i32, is_child: bool, related_url_id: i32, related_url: String, web_url: String, title: String, binary_size: i64, document_type: String, created: i64, last_modified: i64) -> CmDocumentRelationship {
        CmDocumentRelationship {
            url_id,
            is_child,
            related_url_id,
            related_url,
            web_url,
            title,
            binary_size,
            document_type,
            created,
            last_modified,
            child: None,
        }
    }
}

