# BackupApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backup**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup |
| [**deleteBackup**](BackupApi.md#deleteBackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup |
| [**getBackup**](BackupApi.md#getBackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup |
| [**getBackupList**](BackupApi.md#getBackupList) | **GET** /api/backup/backups/{organisationId} | get backup list |
| [**restoreFromText**](BackupApi.md#restoreFromText) | **POST** /api/backup/restore | restore backup |


<a name="backup"></a>
# **backup**
> JsonMessage backup(session-id, organisationId, regime)

create backup

    Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) to backup | [default to null] |
| **regime** | **String**| what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation) | [default to null] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteBackup"></a>
# **deleteBackup**
> List deleteBackup(session-id, organisationId, backupId)

remove backup

    Delete a backup by ID and return list of all Backups present in this SimSage instance

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) to backup | [default to null] |
| **backupId** | **Long**| the backup&#39;s id (along) | [default to null] |

### Return type

[**List**](../Models/Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getBackup"></a>
# **getBackup**
> Backup getBackup(session-id, organisationId, backupId)

get backup

    return the backup data for a given backup-id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) for access control | [default to null] |
| **backupId** | **Long**| the backup&#39;s id (along) | [default to null] |

### Return type

[**Backup**](../Models/Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getBackupList"></a>
# **getBackupList**
> List getBackupList(session-id, organisationId)

get backup list

    Get a list of all Backups present in this SimSage instance

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) to backup | [default to null] |

### Return type

[**List**](../Models/Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="restoreFromText"></a>
# **restoreFromText**
> JsonMessage restoreFromText(session-id, CMRestoreFromText)

restore backup

    Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMRestoreFromText** | [**CMRestoreFromText**](../Models/CMRestoreFromText.md)|  | |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

