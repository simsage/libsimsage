# BackupApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backup**](BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup |
| [**deleteBackup**](BackupApi.md#deleteBackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup |
| [**getBackup**](BackupApi.md#getBackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup |
| [**getBackupList**](BackupApi.md#getBackupList) | **GET** /api/backup/backups/{organisationId} | get backup list |
| [**restoreFromText**](BackupApi.md#restoreFromText) | **POST** /api/backup/restore | restore backup |


<a id="backup"></a>
# **backup**
> JsonMessage backup(sessionId, organisationId, regime)

create backup

Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    BackupApi apiInstance = new BackupApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid) to backup
    String regime = "regime_example"; // String | what to backup, one of 'all' (all organisations, requires admin privileges) or 'specific' (only the given organisation)
    try {
      JsonMessage result = apiInstance.backup(sessionId, organisationId, regime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupApi#backup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation&#39;s id (a guid) to backup | |
| **regime** | **String**| what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation) | |

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
| **200** | create backup OK response |  -  |
| **500** | could not create backup. |  -  |

<a id="deleteBackup"></a>
# **deleteBackup**
> List&lt;Backup&gt; deleteBackup(sessionId, organisationId, backupId)

remove backup

Delete a backup by ID and return list of all Backups present in this SimSage instance

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    BackupApi apiInstance = new BackupApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid) to backup
    Long backupId = 56L; // Long | the backup's id (along)
    try {
      List<Backup> result = apiInstance.deleteBackup(sessionId, organisationId, backupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupApi#deleteBackup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation&#39;s id (a guid) to backup | |
| **backupId** | **Long**| the backup&#39;s id (along) | |

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

<a id="getBackup"></a>
# **getBackup**
> Backup getBackup(sessionId, organisationId, backupId)

get backup

return the backup data for a given backup-id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    BackupApi apiInstance = new BackupApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid) for access control
    Long backupId = 56L; // Long | the backup's id (along)
    try {
      Backup result = apiInstance.getBackup(sessionId, organisationId, backupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupApi#getBackup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation&#39;s id (a guid) for access control | |
| **backupId** | **Long**| the backup&#39;s id (along) | |

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

<a id="getBackupList"></a>
# **getBackupList**
> List&lt;Backup&gt; getBackupList(sessionId, organisationId)

get backup list

Get a list of all Backups present in this SimSage instance

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    BackupApi apiInstance = new BackupApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid) to backup
    try {
      List<Backup> result = apiInstance.getBackupList(sessionId, organisationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupApi#getBackupList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **organisationId** | **String**| the organisation&#39;s id (a guid) to backup | |

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
| **500** | could not get backup-list. |  -  |
| **200** | get backup-list response |  -  |

<a id="restoreFromText"></a>
# **restoreFromText**
> JsonMessage restoreFromText(sessionId, cmRestoreFromText)

restore backup

Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.simsage.ai");

    BackupApi apiInstance = new BackupApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMRestoreFromText cmRestoreFromText = new CMRestoreFromText(); // CMRestoreFromText | 
    try {
      JsonMessage result = apiInstance.restoreFromText(sessionId, cmRestoreFromText);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupApi#restoreFromText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmRestoreFromText** | [**CMRestoreFromText**](CMRestoreFromText.md)|  | |

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

