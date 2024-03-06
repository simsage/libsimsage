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
pub struct Backup {
    #[serde(rename = "backupId")]
    pub backup_id: i64,
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "data")]
    pub data: String,
}

impl Backup {
    pub fn new(backup_id: i64, organisation_id: String, name: String, data: String) -> Backup {
        Backup {
            backup_id,
            organisation_id,
            name,
            data,
        }
    }
}


