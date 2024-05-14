# AuthApi

All URIs are relative to *https://training.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGroup**](AuthApi.md#deleteGroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group |
| [**deleteOrganisation**](AuthApi.md#deleteOrganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation |
| [**getGroups**](AuthApi.md#getGroups) | **GET** /api/auth/groups/{organisationId} | Get Groups |
| [**getOTT**](AuthApi.md#getOTT) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token. |
| [**getUserOrganisationList**](AuthApi.md#getUserOrganisationList) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations |
| [**getUsersPaginated**](AuthApi.md#getUsersPaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated |
| [**groupEditInfo**](AuthApi.md#groupEditInfo) | **POST** /api/auth/group-edit-info/{organisationId} | Get Group edit information |
| [**importUsersAndGroups**](AuthApi.md#importUsersAndGroups) | **PUT** /api/auth/user/import |  |
| [**myRoles**](AuthApi.md#myRoles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles |
| [**removeUserFromOrganisation**](AuthApi.md#removeUserFromOrganisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation |
| [**resetPassword**](AuthApi.md#resetPassword) | **POST** /api/auth/reset-password | Perform a password-reset request. |
| [**resetPasswordRequest**](AuthApi.md#resetPasswordRequest) | **POST** /api/auth/reset-password-request | Password Reset Request |
| [**saveGroup**](AuthApi.md#saveGroup) | **PUT** /api/auth/group | Save Group |
| [**signIn**](AuthApi.md#signIn) | **POST** /api/auth/sign-in | Sign In |
| [**signInAdminUsingJWTMsal**](AuthApi.md#signInAdminUsingJWTMsal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In |
| [**signInAdminUsingSessionId**](AuthApi.md#signInAdminUsingSessionId) | **GET** /api/auth/admin/authenticate/session-id | session-id Sign-in |
| [**signInDmsUsingJWTMsal**](AuthApi.md#signInDmsUsingJWTMsal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**signInEvolveUsingJWTMsal**](AuthApi.md#signInEvolveUsingJWTMsal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**signInSearchUsingJWTMsal**](AuthApi.md#signInSearchUsingJWTMsal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**signOut**](AuthApi.md#signOut) | **DELETE** /api/auth/sign-out | Sign Out |
| [**updateOrganisation**](AuthApi.md#updateOrganisation) | **PUT** /api/auth/organisation | Save Organisation |
| [**updateUser**](AuthApi.md#updateUser) | **PUT** /api/auth/user/{organisationId} |  |
| [**version8**](AuthApi.md#version8) | **GET** /api/auth/version | Get Version |


<a id="deleteGroup"></a>
# **deleteGroup**
> JsonMessage deleteGroup(organisationId, name, sessionId)

Delete Group

Delete a group by name.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String name = "name_example"; // String | the name of the group to remove.
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      JsonMessage result = apiInstance.deleteGroup(organisationId, name, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deleteGroup");
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
| **organisationId** | **String**| the organisation (its guid id) | |
| **name** | **String**| the name of the group to remove. | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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
| **200** | delete group OK response |  -  |
| **500** | could not delete group |  -  |

<a id="deleteOrganisation"></a>
# **deleteOrganisation**
> JsonMessage deleteOrganisation(organisationId, sessionId)

Delete Organisation

Delete / remove an organisation and its knowledge bases.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      JsonMessage result = apiInstance.deleteOrganisation(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#deleteOrganisation");
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
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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
| **500** | could not remove organisation |  -  |
| **200** | remove organisation OK response |  -  |

<a id="getGroups"></a>
# **getGroups**
> CMGroupList getGroups(organisationId, sessionId)

Get Groups

Return a paginated, filtered list of groups for a given organisation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the main organisation (its guid id) to get users for
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      CMGroupList result = apiInstance.getGroups(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getGroups");
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
| **organisationId** | **String**| the main organisation (its guid id) to get users for | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**CMGroupList**](CMGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get group list |  -  |
| **200** | get a list of groups |  -  |

<a id="getOTT"></a>
# **getOTT**
> String getOTT(organisationId, sessionId)

Get a one-time token.

Get a one-time token associated with your session.  Can be used for download items.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      String result = apiInstance.getOTT(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getOTT");
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
| **organisationId** | **String**| the organisation (its guid id) | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get the one-time token as a string. |  -  |
| **500** | could not create a one-time token. |  -  |

<a id="getUserOrganisationList"></a>
# **getUserOrganisationList**
> List&lt;CMOrganisation&gt; getUserOrganisationList(filter, sessionId)

Get a list of Organisations

Return all organisations that a user has access to (read-only or write).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String filter = "filter_example"; // String | a text filter for partial string matching organisations
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<CMOrganisation> result = apiInstance.getUserOrganisationList(filter, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getUserOrganisationList");
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
| **filter** | **String**| a text filter for partial string matching organisations | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**List&lt;CMOrganisation&gt;**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not get organisation list |  -  |
| **200** | get a list of organisations |  -  |

<a id="getUsersPaginated"></a>
# **getUsersPaginated**
> CMUserList getUsersPaginated(organisationId, page, pageSize, filter, sessionId)

Get Users paginated

Return a paginated, filtered list of users for a given organisation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the main organisation (its guid id) to get users for
    Integer page = 56; // Integer | the starting page, starting at zero
    Integer pageSize = 56; // Integer | the number of users per page
    String filter = "filter_example"; // String | a text filter for partial string matching users
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      CMUserList result = apiInstance.getUsersPaginated(organisationId, page, pageSize, filter, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getUsersPaginated");
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
| **organisationId** | **String**| the main organisation (its guid id) to get users for | |
| **page** | **Integer**| the starting page, starting at zero | |
| **pageSize** | **Integer**| the number of users per page | |
| **filter** | **String**| a text filter for partial string matching users | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

[**CMUserList**](CMUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get users paginated response |  -  |
| **500** | could not get users paginated |  -  |

<a id="groupEditInfo"></a>
# **groupEditInfo**
> CMGroupList groupEditInfo(organisationId, sessionId, cmGroupEditInfo)

Get Group edit information

Return the information needed for the admin UX editing a group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the main organisation (its guid id) to get users for
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMGroupEditInfo cmGroupEditInfo = new CMGroupEditInfo(); // CMGroupEditInfo | 
    try {
      CMGroupList result = apiInstance.groupEditInfo(organisationId, sessionId, cmGroupEditInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#groupEditInfo");
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
| **organisationId** | **String**| the main organisation (its guid id) to get users for | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmGroupEditInfo** | [**CMGroupEditInfo**](CMGroupEditInfo.md)|  | |

### Return type

[**CMGroupList**](CMGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not return group edit information |  -  |
| **200** | return group edit information |  -  |

<a id="importUsersAndGroups"></a>
# **importUsersAndGroups**
> JsonMessage importUsersAndGroups(sessionId, cmImportUsers, apIVersion)



Import users and groups.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMImportUsers cmImportUsers = new CMImportUsers(); // CMImportUsers | 
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.importUsersAndGroups(sessionId, cmImportUsers, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#importUsersAndGroups");
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
| **cmImportUsers** | [**CMImportUsers**](CMImportUsers.md)|  | |
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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
| **500** | could not import users |  -  |
| **200** | import user OK response |  -  |

<a id="myRoles"></a>
# **myRoles**
> List&lt;String&gt; myRoles(organisationId, sessionId)

Get users application roles

Get Roles of logged in user for the logged in Organisation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      List<String> result = apiInstance.myRoles(organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#myRoles");
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
| **organisationId** | **String**| the organisation (its guid id) | |
| **sessionId** | **String**| a valid SimSage Session id. | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | project-type list response |  -  |
| **500** | could not get role list. |  -  |

<a id="removeUserFromOrganisation"></a>
# **removeUserFromOrganisation**
> JsonMessage removeUserFromOrganisation(userId, organisationId, sessionId)

Remove User from Organisation

Remove an existing user from an existing Organisation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String userId = "userId_example"; // String | the user's id (a guid)
    String organisationId = "organisationId_example"; // String | the organisation's id (a guid)
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      JsonMessage result = apiInstance.removeUserFromOrganisation(userId, organisationId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#removeUserFromOrganisation");
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
| **userId** | **String**| the user&#39;s id (a guid) | |
| **organisationId** | **String**| the organisation&#39;s id (a guid) | |
| **sessionId** | **String**| a valid SimSage Session id. | |

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
| **500** | could not remove user from organisation |  -  |
| **200** | remove user from organisation OK response |  -  |

<a id="resetPassword"></a>
# **resetPassword**
> JsonMessage resetPassword(cmUserPasswordReset)

Perform a password-reset request.

Reset Password

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    CMUserPasswordReset cmUserPasswordReset = new CMUserPasswordReset(); // CMUserPasswordReset | 
    try {
      JsonMessage result = apiInstance.resetPassword(cmUserPasswordReset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#resetPassword");
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
| **cmUserPasswordReset** | [**CMUserPasswordReset**](CMUserPasswordReset.md)|  | |

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
| **200** | an reset password OK response |  -  |
| **500** | could not reset-password |  -  |

<a id="resetPasswordRequest"></a>
# **resetPasswordRequest**
> JsonMessage resetPasswordRequest(cmPasswordResetRequest)

Password Reset Request

Start a password-reset request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    CMPasswordResetRequest cmPasswordResetRequest = new CMPasswordResetRequest(); // CMPasswordResetRequest | 
    try {
      JsonMessage result = apiInstance.resetPasswordRequest(cmPasswordResetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#resetPasswordRequest");
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
| **cmPasswordResetRequest** | [**CMPasswordResetRequest**](CMPasswordResetRequest.md)|  | |

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
| **500** | could not start password-reset |  -  |
| **200** | an email reset OK response |  -  |

<a id="saveGroup"></a>
# **saveGroup**
> JsonMessage saveGroup(sessionId, cmGroup)

Save Group

Save (update/create) a group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMGroup cmGroup = new CMGroup(); // CMGroup | 
    try {
      JsonMessage result = apiInstance.saveGroup(sessionId, cmGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#saveGroup");
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
| **cmGroup** | [**CMGroup**](CMGroup.md)|  | |

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
| **500** | could not save group |  -  |
| **200** | save a group OK response |  -  |

<a id="signIn"></a>
# **signIn**
> CMSessionVersion signIn(cmSignInParameters)

Sign In

Administrator Sign-in of an existing user using username/password.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    CMSignInParameters cmSignInParameters = new CMSignInParameters(); // CMSignInParameters | 
    try {
      CMSessionVersion result = apiInstance.signIn(cmSignInParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signIn");
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
| **cmSignInParameters** | [**CMSignInParameters**](CMSignInParameters.md)|  | |

### Return type

[**CMSessionVersion**](CMSessionVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | a sign-in response |  -  |
| **500** | could not sign-in username/password |  -  |

<a id="signInAdminUsingJWTMsal"></a>
# **signInAdminUsingJWTMsal**
> SignInAdmin signInAdminUsingJWTMsal(jwt)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String jwt = "jwt_example"; // String | a valid JWT token.
    try {
      SignInAdmin result = apiInstance.signInAdminUsingJWTMsal(jwt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signInAdminUsingJWTMsal");
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
| **jwt** | **String**| a valid JWT token. | |

### Return type

[**SignInAdmin**](SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | a sign-in admin response |  -  |
| **500** | could not sign-in |  -  |

<a id="signInAdminUsingSessionId"></a>
# **signInAdminUsingSessionId**
> SignInAdmin signInAdminUsingSessionId(sessionId)

session-id Sign-in

Sign-in a user using an existing session-id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    try {
      SignInAdmin result = apiInstance.signInAdminUsingSessionId(sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signInAdminUsingSessionId");
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

### Return type

[**SignInAdmin**](SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not sign-in |  -  |
| **200** | a sign-in response |  -  |

<a id="signInDmsUsingJWTMsal"></a>
# **signInDmsUsingJWTMsal**
> SignInDmsCmd signInDmsUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String jwt = "jwt_example"; // String | a valid JWT token.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    try {
      SignInDmsCmd result = apiInstance.signInDmsUsingJWTMsal(jwt, organisationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signInDmsUsingJWTMsal");
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
| **jwt** | **String**| a valid JWT token. | |
| **organisationId** | **String**| the organisation (its guid id) | |

### Return type

[**SignInDmsCmd**](SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not sign-in |  -  |
| **200** | a sign-in dms response |  -  |

<a id="signInEvolveUsingJWTMsal"></a>
# **signInEvolveUsingJWTMsal**
> SignInDmsCmd signInEvolveUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

Sign-in an Evolve user using an Msal JWT...

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String jwt = "jwt_example"; // String | a valid JWT token.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    try {
      SignInDmsCmd result = apiInstance.signInEvolveUsingJWTMsal(jwt, organisationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signInEvolveUsingJWTMsal");
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
| **jwt** | **String**| a valid JWT token. | |
| **organisationId** | **String**| the organisation (its guid id) | |

### Return type

[**SignInDmsCmd**](SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not sign-in |  -  |
| **200** | a sign-in Evolve response |  -  |

<a id="signInSearchUsingJWTMsal"></a>
# **signInSearchUsingJWTMsal**
> SignInCmd signInSearchUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String jwt = "jwt_example"; // String | Schema valid JWT token.
    String organisationId = "organisationId_example"; // String | the organisation (its guid id)
    try {
      SignInCmd result = apiInstance.signInSearchUsingJWTMsal(jwt, organisationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signInSearchUsingJWTMsal");
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
| **jwt** | **String**| Schema valid JWT token. | |
| **organisationId** | **String**| the organisation (its guid id) | |

### Return type

[**SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not sign-in |  -  |
| **200** | a sign-in search response |  -  |

<a id="signOut"></a>
# **signOut**
> JsonMessage signOut(sessionId, apIVersion)

Sign Out

Sign-out any signed-in user (owner of the session object only).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    String apIVersion = "1"; // String | 
    try {
      JsonMessage result = apiInstance.signOut(sessionId, apIVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#signOut");
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
| **apIVersion** | **String**|  | [optional] [enum: 1] |

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
| **500** | could not sign-out |  -  |
| **200** | a sign-out OK response |  -  |

<a id="updateOrganisation"></a>
# **updateOrganisation**
> CMOrganisation updateOrganisation(sessionId, cmOrganisation)

Save Organisation

Update or Create an organisation (save an organisation).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMOrganisation cmOrganisation = new CMOrganisation(); // CMOrganisation | 
    try {
      CMOrganisation result = apiInstance.updateOrganisation(sessionId, cmOrganisation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#updateOrganisation");
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
| **cmOrganisation** | [**CMOrganisation**](CMOrganisation.md)|  | |

### Return type

[**CMOrganisation**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | save organisation response |  -  |
| **500** | could not save organisation |  -  |

<a id="updateUser"></a>
# **updateUser**
> CMUserWithExtras updateUser(organisationId, sessionId, cmUserWithExtras)



Update or Create a user (save a user).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String organisationId = "organisationId_example"; // String | the main organisation (its guid id) to update a user in.
    String sessionId = "sessionId_example"; // String | a valid SimSage Session id.
    CMUserWithExtras cmUserWithExtras = new CMUserWithExtras(); // CMUserWithExtras | 
    try {
      CMUserWithExtras result = apiInstance.updateUser(organisationId, sessionId, cmUserWithExtras);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#updateUser");
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
| **organisationId** | **String**| the main organisation (its guid id) to update a user in. | |
| **sessionId** | **String**| a valid SimSage Session id. | |
| **cmUserWithExtras** | [**CMUserWithExtras**](CMUserWithExtras.md)|  | |

### Return type

[**CMUserWithExtras**](CMUserWithExtras.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not save user |  -  |
| **200** | save user response |  -  |

<a id="version8"></a>
# **version8**
> SignInCmd version8()

Get Version

Get the version of SimSage Auth Services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://training.simsage.ai");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      SignInCmd result = apiInstance.version8();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#version8");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the version response |  -  |
| **500** | could not get version |  -  |

