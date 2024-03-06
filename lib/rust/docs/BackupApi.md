# \BackupApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup
[**delete_backup**](BackupApi.md#delete_backup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup
[**get_backup**](BackupApi.md#get_backup) | **GET** /api/backup/{organisationId}/{backupId} | get backup
[**get_backup_list**](BackupApi.md#get_backup_list) | **GET** /api/backup/backups/{organisationId} | get backup list
[**restore_from_text**](BackupApi.md#restore_from_text) | **POST** /api/backup/restore | restore backup



## backup

> crate::models::JsonMessage backup(session_id, organisation_id, regime)
create backup

Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) to backup | [required] |
**regime** | **String** | what to backup, one of 'all' (all organisations, requires admin privileges) or 'specific' (only the given organisation) | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_backup

> Vec<crate::models::Backup> delete_backup(session_id, organisation_id, backup_id)
remove backup

Delete a backup by ID and return list of all Backups present in this SimSage instance

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) to backup | [required] |
**backup_id** | **i64** | the backup's id (along) | [required] |

### Return type

[**Vec<crate::models::Backup>**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_backup

> crate::models::Backup get_backup(session_id, organisation_id, backup_id)
get backup

return the backup data for a given backup-id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) for access control | [required] |
**backup_id** | **i64** | the backup's id (along) | [required] |

### Return type

[**crate::models::Backup**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_backup_list

> Vec<crate::models::Backup> get_backup_list(session_id, organisation_id)
get backup list

Get a list of all Backups present in this SimSage instance

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**organisation_id** | **String** | the organisation's id (a guid) to backup | [required] |

### Return type

[**Vec<crate::models::Backup>**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## restore_from_text

> crate::models::JsonMessage restore_from_text(session_id, cm_restore_from_text)
restore backup

Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_restore_from_text** | [**CmRestoreFromText**](CmRestoreFromText.md) |  | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

