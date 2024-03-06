# BackupApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup
[**deleteBackup**](BackupApi.md#deleteBackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup
[**getBackup**](BackupApi.md#getBackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup
[**getBackupList**](BackupApi.md#getBackupList) | **GET** /api/backup/backups/{organisationId} | get backup list
[**restoreFromText**](BackupApi.md#restoreFromText) | **POST** /api/backup/restore | restore backup


<a id="backup"></a>
# **backup**
> JsonMessage backup(sessionId, organisationId, regime)

create backup

Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid) to backup
val regime : kotlin.String = regime_example // kotlin.String | what to backup, one of 'all' (all organisations, requires admin privileges) or 'specific' (only the given organisation)
try {
    val result : JsonMessage = apiInstance.backup(sessionId, organisationId, regime)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#backup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#backup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) to backup |
 **regime** | **kotlin.String**| what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation) |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteBackup"></a>
# **deleteBackup**
> kotlin.collections.List&lt;Backup&gt; deleteBackup(sessionId, organisationId, backupId)

remove backup

Delete a backup by ID and return list of all Backups present in this SimSage instance

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid) to backup
val backupId : kotlin.Long = 789 // kotlin.Long | the backup's id (along)
try {
    val result : kotlin.collections.List<Backup> = apiInstance.deleteBackup(sessionId, organisationId, backupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#deleteBackup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#deleteBackup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) to backup |
 **backupId** | **kotlin.Long**| the backup&#39;s id (along) |

### Return type

[**kotlin.collections.List&lt;Backup&gt;**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBackup"></a>
# **getBackup**
> Backup getBackup(sessionId, organisationId, backupId)

get backup

return the backup data for a given backup-id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid) for access control
val backupId : kotlin.Long = 789 // kotlin.Long | the backup's id (along)
try {
    val result : Backup = apiInstance.getBackup(sessionId, organisationId, backupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#getBackup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#getBackup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) for access control |
 **backupId** | **kotlin.Long**| the backup&#39;s id (along) |

### Return type

[**Backup**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBackupList"></a>
# **getBackupList**
> kotlin.collections.List&lt;Backup&gt; getBackupList(sessionId, organisationId)

get backup list

Get a list of all Backups present in this SimSage instance

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid) to backup
try {
    val result : kotlin.collections.List<Backup> = apiInstance.getBackupList(sessionId, organisationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#getBackupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#getBackupList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) to backup |

### Return type

[**kotlin.collections.List&lt;Backup&gt;**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="restoreFromText"></a>
# **restoreFromText**
> JsonMessage restoreFromText(sessionId, cmRestoreFromText)

restore backup

Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmRestoreFromText : CMRestoreFromText =  // CMRestoreFromText | 
try {
    val result : JsonMessage = apiInstance.restoreFromText(sessionId, cmRestoreFromText)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#restoreFromText")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#restoreFromText")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmRestoreFromText** | [**CMRestoreFromText**](CMRestoreFromText.md)|  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

