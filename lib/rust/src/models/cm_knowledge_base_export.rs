/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmKnowledgeBaseExport : the knowledge-base export config



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmKnowledgeBaseExport {
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "kbId")]
    pub kb_id: String,
    #[serde(rename = "exporter")]
    pub exporter: String,
    #[serde(rename = "exportConfig")]
    pub export_config: ::std::collections::HashMap<String, serde_json::Value>,
}

impl CmKnowledgeBaseExport {
    /// the knowledge-base export config
    pub fn new(organisation_id: String, kb_id: String, exporter: String, export_config: ::std::collections::HashMap<String, serde_json::Value>) -> CmKnowledgeBaseExport {
        CmKnowledgeBaseExport {
            organisation_id,
            kb_id,
            exporter,
            export_config,
        }
    }
}


