/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */

/// CmReturnStatistics : This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CmReturnStatistics {
    /// the organisation (its guid id)
    #[serde(rename = "organisationId")]
    pub organisation_id: String,
    /// the knowledge-base id (its guid id)
    #[serde(rename = "kbId")]
    pub kb_id: String,
    /// the year of the request
    #[serde(rename = "year")]
    pub year: i32,
    /// the month of the request
    #[serde(rename = "month")]
    pub month: i32,
    /// A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month.
    #[serde(rename = "accessFrequency")]
    pub access_frequency: i32,
    /// The top list of queries (the strings) and their frequencies
    #[serde(rename = "queryWordFrequency")]
    pub query_word_frequency: ::std::collections::HashMap<String, i32>,
    /// Some more general statistics (eg. number of documents) and their frequencies
    #[serde(rename = "generalStatistics")]
    pub general_statistics: ::std::collections::HashMap<String, i64>,
    /// The breakdown of file-types (by file extension) and their frequencies
    #[serde(rename = "fileTypeStatistics")]
    pub file_type_statistics: ::std::collections::HashMap<String, i32>,
}

impl CmReturnStatistics {
    /// This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.
    pub fn new(organisation_id: String, kb_id: String, year: i32, month: i32, access_frequency: i32, query_word_frequency: ::std::collections::HashMap<String, i32>, general_statistics: ::std::collections::HashMap<String, i64>, file_type_statistics: ::std::collections::HashMap<String, i32>) -> CmReturnStatistics {
        CmReturnStatistics {
            organisation_id,
            kb_id,
            year,
            month,
            access_frequency,
            query_word_frequency,
            general_statistics,
            file_type_statistics,
        }
    }
}


