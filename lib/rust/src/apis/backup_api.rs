/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};


/// struct for typed errors of method [`backup`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum BackupError {
    Status500(crate::models::JsonMessage),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`delete_backup`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteBackupError {
    Status500(crate::models::JsonMessage),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_backup`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetBackupError {
    Status500(crate::models::JsonMessage),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_backup_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetBackupListError {
    Status500(crate::models::JsonMessage),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`restore_from_text`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum RestoreFromTextError {
    Status500(crate::models::JsonMessage),
    UnknownValue(serde_json::Value),
}


/// Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.
pub async fn backup(configuration: &configuration::Configuration, session_id: &str, organisation_id: &str, regime: &str) -> Result<crate::models::JsonMessage, Error<BackupError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/backup/backup/{organisationId}/{regime}", local_var_configuration.base_path, organisationId=crate::apis::urlencode(organisation_id), regime=crate::apis::urlencode(regime));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("session-id", session_id.to_string());

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<BackupError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Delete a backup by ID and return list of all Backups present in this SimSage instance
pub async fn delete_backup(configuration: &configuration::Configuration, session_id: &str, organisation_id: &str, backup_id: i64) -> Result<Vec<crate::models::Backup>, Error<DeleteBackupError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/backup/backup/{organisationId}/{backupId}", local_var_configuration.base_path, organisationId=crate::apis::urlencode(organisation_id), backupId=backup_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("session-id", session_id.to_string());

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DeleteBackupError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// return the backup data for a given backup-id
pub async fn get_backup(configuration: &configuration::Configuration, session_id: &str, organisation_id: &str, backup_id: i64) -> Result<crate::models::Backup, Error<GetBackupError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/backup/{organisationId}/{backupId}", local_var_configuration.base_path, organisationId=crate::apis::urlencode(organisation_id), backupId=backup_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("session-id", session_id.to_string());

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetBackupError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get a list of all Backups present in this SimSage instance
pub async fn get_backup_list(configuration: &configuration::Configuration, session_id: &str, organisation_id: &str) -> Result<Vec<crate::models::Backup>, Error<GetBackupListError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/backup/backups/{organisationId}", local_var_configuration.base_path, organisationId=crate::apis::urlencode(organisation_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("session-id", session_id.to_string());

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetBackupListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.
pub async fn restore_from_text(configuration: &configuration::Configuration, session_id: &str, cm_restore_from_text: crate::models::CmRestoreFromText) -> Result<crate::models::JsonMessage, Error<RestoreFromTextError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/backup/restore", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("session-id", session_id.to_string());
    local_var_req_builder = local_var_req_builder.json(&cm_restore_from_text);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<RestoreFromTextError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

