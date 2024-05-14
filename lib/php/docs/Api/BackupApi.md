# OpenAPI\Client\BackupApi

All URIs are relative to https://training.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**backup()**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup |
| [**deleteBackup()**](BackupApi.md#deleteBackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup |
| [**getBackup()**](BackupApi.md#getBackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup |
| [**getBackupList()**](BackupApi.md#getBackupList) | **GET** /api/backup/backups/{organisationId} | get backup list |
| [**restoreFromText()**](BackupApi.md#restoreFromText) | **POST** /api/backup/restore | restore backup |


## `backup()`

```php
backup($session_id, $organisation_id, $regime): \OpenAPI\Client\Model\JsonMessage
```

create backup

Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BackupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid) to backup
$regime = 'regime_example'; // string | what to backup, one of 'all' (all organisations, requires admin privileges) or 'specific' (only the given organisation)

try {
    $result = $apiInstance->backup($session_id, $organisation_id, $regime);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackupApi->backup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) to backup | |
| **regime** | **string**| what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation) | |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteBackup()`

```php
deleteBackup($session_id, $organisation_id, $backup_id): \OpenAPI\Client\Model\Backup[]
```

remove backup

Delete a backup by ID and return list of all Backups present in this SimSage instance

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BackupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid) to backup
$backup_id = 56; // int | the backup's id (along)

try {
    $result = $apiInstance->deleteBackup($session_id, $organisation_id, $backup_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackupApi->deleteBackup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) to backup | |
| **backup_id** | **int**| the backup&#39;s id (along) | |

### Return type

[**\OpenAPI\Client\Model\Backup[]**](../Model/Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBackup()`

```php
getBackup($session_id, $organisation_id, $backup_id): \OpenAPI\Client\Model\Backup
```

get backup

return the backup data for a given backup-id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BackupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid) for access control
$backup_id = 56; // int | the backup's id (along)

try {
    $result = $apiInstance->getBackup($session_id, $organisation_id, $backup_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackupApi->getBackup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) for access control | |
| **backup_id** | **int**| the backup&#39;s id (along) | |

### Return type

[**\OpenAPI\Client\Model\Backup**](../Model/Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBackupList()`

```php
getBackupList($session_id, $organisation_id): \OpenAPI\Client\Model\Backup[]
```

get backup list

Get a list of all Backups present in this SimSage instance

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BackupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid) to backup

try {
    $result = $apiInstance->getBackupList($session_id, $organisation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackupApi->getBackupList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) to backup | |

### Return type

[**\OpenAPI\Client\Model\Backup[]**](../Model/Backup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `restoreFromText()`

```php
restoreFromText($session_id, $cm_restore_from_text): \OpenAPI\Client\Model\JsonMessage
```

restore backup

Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BackupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_restore_from_text = new \OpenAPI\Client\Model\CMRestoreFromText(); // \OpenAPI\Client\Model\CMRestoreFromText

try {
    $result = $apiInstance->restoreFromText($session_id, $cm_restore_from_text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BackupApi->restoreFromText: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_restore_from_text** | [**\OpenAPI\Client\Model\CMRestoreFromText**](../Model/CMRestoreFromText.md)|  | |

### Return type

[**\OpenAPI\Client\Model\JsonMessage**](../Model/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
