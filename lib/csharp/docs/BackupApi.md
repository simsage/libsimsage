# Org.OpenAPITools.Api.BackupApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**Backup**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup |
| [**DeleteBackup**](BackupApi.md#deletebackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup |
| [**GetBackup**](BackupApi.md#getbackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup |
| [**GetBackupList**](BackupApi.md#getbackuplist) | **GET** /api/backup/backups/{organisationId} | get backup list |
| [**RestoreFromText**](BackupApi.md#restorefromtext) | **POST** /api/backup/restore | restore backup |

<a id="backup"></a>
# **Backup**
> JsonMessage Backup (string sessionId, string organisationId, string regime)

create backup

Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BackupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new BackupApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid) to backup
            var regime = "regime_example";  // string | what to backup, one of 'all' (all organisations, requires admin privileges) or 'specific' (only the given organisation)

            try
            {
                // create backup
                JsonMessage result = apiInstance.Backup(sessionId, organisationId, regime);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BackupApi.Backup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BackupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // create backup
    ApiResponse<JsonMessage> response = apiInstance.BackupWithHttpInfo(sessionId, organisationId, regime);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BackupApi.BackupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) to backup |  |
| **regime** | **string** | what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation) |  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not create backup. |  -  |
| **200** | create backup OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletebackup"></a>
# **DeleteBackup**
> List&lt;Backup&gt; DeleteBackup (string sessionId, string organisationId, long backupId)

remove backup

Delete a backup by ID and return list of all Backups present in this SimSage instance

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteBackupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new BackupApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid) to backup
            var backupId = 789L;  // long | the backup's id (along)

            try
            {
                // remove backup
                List<Backup> result = apiInstance.DeleteBackup(sessionId, organisationId, backupId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BackupApi.DeleteBackup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteBackupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // remove backup
    ApiResponse<List<Backup>> response = apiInstance.DeleteBackupWithHttpInfo(sessionId, organisationId, backupId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BackupApi.DeleteBackupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) to backup |  |
| **backupId** | **long** | the backup&#39;s id (along) |  |

### Return type

[**List&lt;Backup&gt;**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not remove backup |  -  |
| **200** | remove backup, updated backup-list response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getbackup"></a>
# **GetBackup**
> Backup GetBackup (string sessionId, string organisationId, long backupId)

get backup

return the backup data for a given backup-id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBackupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new BackupApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid) for access control
            var backupId = 789L;  // long | the backup's id (along)

            try
            {
                // get backup
                Backup result = apiInstance.GetBackup(sessionId, organisationId, backupId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BackupApi.GetBackup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBackupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get backup
    ApiResponse<Backup> response = apiInstance.GetBackupWithHttpInfo(sessionId, organisationId, backupId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BackupApi.GetBackupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) for access control |  |
| **backupId** | **long** | the backup&#39;s id (along) |  |

### Return type

[**Backup**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get backup response. |  -  |
| **500** | could not get backup. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getbackuplist"></a>
# **GetBackupList**
> List&lt;Backup&gt; GetBackupList (string sessionId, string organisationId)

get backup list

Get a list of all Backups present in this SimSage instance

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBackupListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new BackupApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid) to backup

            try
            {
                // get backup list
                List<Backup> result = apiInstance.GetBackupList(sessionId, organisationId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BackupApi.GetBackupList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBackupListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // get backup list
    ApiResponse<List<Backup>> response = apiInstance.GetBackupListWithHttpInfo(sessionId, organisationId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BackupApi.GetBackupListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) to backup |  |

### Return type

[**List&lt;Backup&gt;**](Backup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get backup-list response |  -  |
| **500** | could not get backup-list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="restorefromtext"></a>
# **RestoreFromText**
> JsonMessage RestoreFromText (string sessionId, CMRestoreFromText cMRestoreFromText)

restore backup

Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RestoreFromTextExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://training.simsage.ai";
            var apiInstance = new BackupApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMRestoreFromText = new CMRestoreFromText(); // CMRestoreFromText | 

            try
            {
                // restore backup
                JsonMessage result = apiInstance.RestoreFromText(sessionId, cMRestoreFromText);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BackupApi.RestoreFromText: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RestoreFromTextWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // restore backup
    ApiResponse<JsonMessage> response = apiInstance.RestoreFromTextWithHttpInfo(sessionId, cMRestoreFromText);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BackupApi.RestoreFromTextWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMRestoreFromText** | [**CMRestoreFromText**](CMRestoreFromText.md) |  |  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | restore backup OK response |  -  |
| **500** | could not restore backup. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

