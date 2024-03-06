# Org.OpenAPITools.Api.AuthApi

All URIs are relative to *https://demo.simsage.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteGroup**](AuthApi.md#deletegroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group |
| [**DeleteOrganisation**](AuthApi.md#deleteorganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation |
| [**GetGroups**](AuthApi.md#getgroups) | **GET** /api/auth/groups/{organisationId} | Get Groups |
| [**GetOTT**](AuthApi.md#getott) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token. |
| [**GetUserOrganisationList**](AuthApi.md#getuserorganisationlist) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations |
| [**GetUsersPaginated**](AuthApi.md#getuserspaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated |
| [**ImportUsersAndGroups**](AuthApi.md#importusersandgroups) | **PUT** /api/auth/user/import |  |
| [**MyRoles**](AuthApi.md#myroles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles |
| [**RemoveUserFromOrganisation**](AuthApi.md#removeuserfromorganisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation |
| [**ResetPassword**](AuthApi.md#resetpassword) | **POST** /api/auth/reset-password | Perform a password-reset request. |
| [**ResetPasswordRequest**](AuthApi.md#resetpasswordrequest) | **POST** /api/auth/reset-password-request | Password Reset Request |
| [**SaveGroup**](AuthApi.md#savegroup) | **PUT** /api/auth/group | Save Group |
| [**SignIn**](AuthApi.md#signin) | **POST** /api/auth/sign-in | Sign In |
| [**SignInAdminUsingJWTMsal**](AuthApi.md#signinadminusingjwtmsal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In |
| [**SignInDmsUsingJWTMsal**](AuthApi.md#signindmsusingjwtmsal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**SignInEvolveUsingJWTMsal**](AuthApi.md#signinevolveusingjwtmsal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**SignInSearchUsingJWTMsal**](AuthApi.md#signinsearchusingjwtmsal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**SignOut**](AuthApi.md#signout) | **DELETE** /api/auth/sign-out | Sign Out |
| [**UpdateOrganisation**](AuthApi.md#updateorganisation) | **PUT** /api/auth/organisation | Save Organisation |
| [**UpdateUser**](AuthApi.md#updateuser) | **PUT** /api/auth/user/{organisationId} |  |
| [**Version8**](AuthApi.md#version8) | **GET** /api/auth/version | Get Version |

<a id="deletegroup"></a>
# **DeleteGroup**
> JsonMessage DeleteGroup (string organisationId, string name, string sessionId)

Delete Group

Delete a group by name.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteGroupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var name = "name_example";  // string | the name of the group to remove.
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Delete Group
                JsonMessage result = apiInstance.DeleteGroup(organisationId, name, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.DeleteGroup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteGroupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Group
    ApiResponse<JsonMessage> response = apiInstance.DeleteGroupWithHttpInfo(organisationId, name, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.DeleteGroupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **name** | **string** | the name of the group to remove. |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **500** | could not delete group |  -  |
| **200** | delete group OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteorganisation"></a>
# **DeleteOrganisation**
> JsonMessage DeleteOrganisation (string organisationId, string sessionId)

Delete Organisation

Delete / remove an organisation and its knowledge bases.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteOrganisationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Delete Organisation
                JsonMessage result = apiInstance.DeleteOrganisation(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.DeleteOrganisation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteOrganisationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Organisation
    ApiResponse<JsonMessage> response = apiInstance.DeleteOrganisationWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.DeleteOrganisationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **200** | remove organisation OK response |  -  |
| **500** | could not remove organisation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getgroups"></a>
# **GetGroups**
> CMGroupList GetGroups (string organisationId, string sessionId)

Get Groups

Return a paginated, filtered list of groups for a given organisation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetGroupsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the main organisation (its guid id) to get users for
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get Groups
                CMGroupList result = apiInstance.GetGroups(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.GetGroups: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetGroupsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Groups
    ApiResponse<CMGroupList> response = apiInstance.GetGroupsWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.GetGroupsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the main organisation (its guid id) to get users for |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getott"></a>
# **GetOTT**
> string GetOTT (string organisationId, string sessionId)

Get a one-time token.

Get a one-time token associated with your session.  Can be used for download items.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetOTTExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get a one-time token.
                string result = apiInstance.GetOTT(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.GetOTT: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetOTTWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a one-time token.
    ApiResponse<string> response = apiInstance.GetOTTWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.GetOTTWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | could not create a one-time token. |  -  |
| **200** | get the one-time token as a string. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getuserorganisationlist"></a>
# **GetUserOrganisationList**
> List&lt;CMOrganisation&gt; GetUserOrganisationList (string filter, string sessionId)

Get a list of Organisations

Return all organisations that a user has access to (read-only or write).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetUserOrganisationListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var filter = "filter_example";  // string | a text filter for partial string matching organisations
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get a list of Organisations
                List<CMOrganisation> result = apiInstance.GetUserOrganisationList(filter, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.GetUserOrganisationList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetUserOrganisationListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a list of Organisations
    ApiResponse<List<CMOrganisation>> response = apiInstance.GetUserOrganisationListWithHttpInfo(filter, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.GetUserOrganisationListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **filter** | **string** | a text filter for partial string matching organisations |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getuserspaginated"></a>
# **GetUsersPaginated**
> CMUserList GetUsersPaginated (string organisationId, int page, int pageSize, string filter, string sessionId)

Get Users paginated

Return a paginated, filtered list of users for a given organisation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetUsersPaginatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the main organisation (its guid id) to get users for
            var page = 56;  // int | the starting page, starting at zero
            var pageSize = 56;  // int | the number of users per page
            var filter = "filter_example";  // string | a text filter for partial string matching users
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get Users paginated
                CMUserList result = apiInstance.GetUsersPaginated(organisationId, page, pageSize, filter, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.GetUsersPaginated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetUsersPaginatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Users paginated
    ApiResponse<CMUserList> response = apiInstance.GetUsersPaginatedWithHttpInfo(organisationId, page, pageSize, filter, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.GetUsersPaginatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the main organisation (its guid id) to get users for |  |
| **page** | **int** | the starting page, starting at zero |  |
| **pageSize** | **int** | the number of users per page |  |
| **filter** | **string** | a text filter for partial string matching users |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **500** | could not get users paginated |  -  |
| **200** | get users paginated response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importusersandgroups"></a>
# **ImportUsersAndGroups**
> JsonMessage ImportUsersAndGroups (string sessionId, CMImportUsers cMImportUsers, string? aPIVersion = null)



Import users and groups.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ImportUsersAndGroupsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMImportUsers = new CMImportUsers(); // CMImportUsers | 
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                JsonMessage result = apiInstance.ImportUsersAndGroups(sessionId, cMImportUsers, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.ImportUsersAndGroups: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportUsersAndGroupsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<JsonMessage> response = apiInstance.ImportUsersAndGroupsWithHttpInfo(sessionId, cMImportUsers, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.ImportUsersAndGroupsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMImportUsers** | [**CMImportUsers**](CMImportUsers.md) |  |  |
| **aPIVersion** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="myroles"></a>
# **MyRoles**
> List&lt;string&gt; MyRoles (string organisationId, string sessionId)

Get users application roles

Get Roles of logged in user for the logged in Organisation

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MyRolesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Get users application roles
                List<string> result = apiInstance.MyRoles(organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.MyRoles: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MyRolesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get users application roles
    ApiResponse<List<string>> response = apiInstance.MyRolesWithHttpInfo(organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.MyRolesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the organisation (its guid id) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

### Return type

**List<string>**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="removeuserfromorganisation"></a>
# **RemoveUserFromOrganisation**
> JsonMessage RemoveUserFromOrganisation (string userId, string organisationId, string sessionId)

Remove User from Organisation

Remove an existing user from an existing Organisation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RemoveUserFromOrganisationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var userId = "userId_example";  // string | the user's id (a guid)
            var organisationId = "organisationId_example";  // string | the organisation's id (a guid)
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.

            try
            {
                // Remove User from Organisation
                JsonMessage result = apiInstance.RemoveUserFromOrganisation(userId, organisationId, sessionId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.RemoveUserFromOrganisation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RemoveUserFromOrganisationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove User from Organisation
    ApiResponse<JsonMessage> response = apiInstance.RemoveUserFromOrganisationWithHttpInfo(userId, organisationId, sessionId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.RemoveUserFromOrganisationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | the user&#39;s id (a guid) |  |
| **organisationId** | **string** | the organisation&#39;s id (a guid) |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |

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
| **200** | remove user from organisation OK response |  -  |
| **500** | could not remove user from organisation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="resetpassword"></a>
# **ResetPassword**
> JsonMessage ResetPassword (CMUserPasswordReset cMUserPasswordReset)

Perform a password-reset request.

Reset Password

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ResetPasswordExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var cMUserPasswordReset = new CMUserPasswordReset(); // CMUserPasswordReset | 

            try
            {
                // Perform a password-reset request.
                JsonMessage result = apiInstance.ResetPassword(cMUserPasswordReset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.ResetPassword: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ResetPasswordWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Perform a password-reset request.
    ApiResponse<JsonMessage> response = apiInstance.ResetPasswordWithHttpInfo(cMUserPasswordReset);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.ResetPasswordWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMUserPasswordReset** | [**CMUserPasswordReset**](CMUserPasswordReset.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="resetpasswordrequest"></a>
# **ResetPasswordRequest**
> JsonMessage ResetPasswordRequest (CMPasswordResetRequest cMPasswordResetRequest)

Password Reset Request

Start a password-reset request.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ResetPasswordRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var cMPasswordResetRequest = new CMPasswordResetRequest(); // CMPasswordResetRequest | 

            try
            {
                // Password Reset Request
                JsonMessage result = apiInstance.ResetPasswordRequest(cMPasswordResetRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.ResetPasswordRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ResetPasswordRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Password Reset Request
    ApiResponse<JsonMessage> response = apiInstance.ResetPasswordRequestWithHttpInfo(cMPasswordResetRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.ResetPasswordRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMPasswordResetRequest** | [**CMPasswordResetRequest**](CMPasswordResetRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="savegroup"></a>
# **SaveGroup**
> JsonMessage SaveGroup (string sessionId, CMGroup cMGroup)

Save Group

Save (update/create) a group.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SaveGroupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMGroup = new CMGroup(); // CMGroup | 

            try
            {
                // Save Group
                JsonMessage result = apiInstance.SaveGroup(sessionId, cMGroup);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SaveGroup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SaveGroupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Group
    ApiResponse<JsonMessage> response = apiInstance.SaveGroupWithHttpInfo(sessionId, cMGroup);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SaveGroupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMGroup** | [**CMGroup**](CMGroup.md) |  |  |

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
| **200** | save a group OK response |  -  |
| **500** | could not save group |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="signin"></a>
# **SignIn**
> CMSessionVersion SignIn (CMSignInParameters cMSignInParameters)

Sign In

Administrator Sign-in of an existing user using username/password.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SignInExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var cMSignInParameters = new CMSignInParameters(); // CMSignInParameters | 

            try
            {
                // Sign In
                CMSessionVersion result = apiInstance.SignIn(cMSignInParameters);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SignIn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SignInWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sign In
    ApiResponse<CMSessionVersion> response = apiInstance.SignInWithHttpInfo(cMSignInParameters);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SignInWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cMSignInParameters** | [**CMSignInParameters**](CMSignInParameters.md) |  |  |

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
| **500** | could not sign-in username/password |  -  |
| **200** | a sign-in response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="signinadminusingjwtmsal"></a>
# **SignInAdminUsingJWTMsal**
> SignInAdmin SignInAdminUsingJWTMsal (string jwt)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SignInAdminUsingJWTMsalExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var jwt = "jwt_example";  // string | a valid JWT token.

            try
            {
                // JWT MSal Sign In
                SignInAdmin result = apiInstance.SignInAdminUsingJWTMsal(jwt);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SignInAdminUsingJWTMsal: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SignInAdminUsingJWTMsalWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // JWT MSal Sign In
    ApiResponse<SignInAdmin> response = apiInstance.SignInAdminUsingJWTMsalWithHttpInfo(jwt);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SignInAdminUsingJWTMsalWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jwt** | **string** | a valid JWT token. |  |

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
| **200** | a sign-in admin response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="signindmsusingjwtmsal"></a>
# **SignInDmsUsingJWTMsal**
> SignInDmsCmd SignInDmsUsingJWTMsal (string jwt, string organisationId)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SignInDmsUsingJWTMsalExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var jwt = "jwt_example";  // string | a valid JWT token.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)

            try
            {
                // JWT MSal Sign In
                SignInDmsCmd result = apiInstance.SignInDmsUsingJWTMsal(jwt, organisationId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SignInDmsUsingJWTMsal: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SignInDmsUsingJWTMsalWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // JWT MSal Sign In
    ApiResponse<SignInDmsCmd> response = apiInstance.SignInDmsUsingJWTMsalWithHttpInfo(jwt, organisationId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SignInDmsUsingJWTMsalWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jwt** | **string** | a valid JWT token. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="signinevolveusingjwtmsal"></a>
# **SignInEvolveUsingJWTMsal**
> SignInDmsCmd SignInEvolveUsingJWTMsal (string jwt, string organisationId)

JWT MSal Sign In

Sign-in an Evolve user using an Msal JWT...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SignInEvolveUsingJWTMsalExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var jwt = "jwt_example";  // string | a valid JWT token.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)

            try
            {
                // JWT MSal Sign In
                SignInDmsCmd result = apiInstance.SignInEvolveUsingJWTMsal(jwt, organisationId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SignInEvolveUsingJWTMsal: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SignInEvolveUsingJWTMsalWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // JWT MSal Sign In
    ApiResponse<SignInDmsCmd> response = apiInstance.SignInEvolveUsingJWTMsalWithHttpInfo(jwt, organisationId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SignInEvolveUsingJWTMsalWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jwt** | **string** | a valid JWT token. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |

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
| **200** | a sign-in Evolve response |  -  |
| **500** | could not sign-in |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="signinsearchusingjwtmsal"></a>
# **SignInSearchUsingJWTMsal**
> SignInCmd SignInSearchUsingJWTMsal (string jwt, string organisationId)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SignInSearchUsingJWTMsalExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var jwt = "jwt_example";  // string | Schema valid JWT token.
            var organisationId = "organisationId_example";  // string | the organisation (its guid id)

            try
            {
                // JWT MSal Sign In
                SignInCmd result = apiInstance.SignInSearchUsingJWTMsal(jwt, organisationId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SignInSearchUsingJWTMsal: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SignInSearchUsingJWTMsalWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // JWT MSal Sign In
    ApiResponse<SignInCmd> response = apiInstance.SignInSearchUsingJWTMsalWithHttpInfo(jwt, organisationId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SignInSearchUsingJWTMsalWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jwt** | **string** | Schema valid JWT token. |  |
| **organisationId** | **string** | the organisation (its guid id) |  |

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
| **200** | a sign-in search response |  -  |
| **500** | could not sign-in |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="signout"></a>
# **SignOut**
> JsonMessage SignOut (string sessionId, string? aPIVersion = null)

Sign Out

Sign-out any signed-in user (owner of the session object only).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SignOutExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var aPIVersion = "1";  // string? |  (optional) 

            try
            {
                // Sign Out
                JsonMessage result = apiInstance.SignOut(sessionId, aPIVersion);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.SignOut: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SignOutWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sign Out
    ApiResponse<JsonMessage> response = apiInstance.SignOutWithHttpInfo(sessionId, aPIVersion);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.SignOutWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **aPIVersion** | **string?** |  | [optional]  |

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
| **200** | a sign-out OK response |  -  |
| **500** | could not sign-out |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateorganisation"></a>
# **UpdateOrganisation**
> CMOrganisation UpdateOrganisation (string sessionId, CMOrganisation cMOrganisation)

Save Organisation

Update or Create an organisation (save an organisation).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateOrganisationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMOrganisation = new CMOrganisation(); // CMOrganisation | 

            try
            {
                // Save Organisation
                CMOrganisation result = apiInstance.UpdateOrganisation(sessionId, cMOrganisation);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.UpdateOrganisation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateOrganisationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Organisation
    ApiResponse<CMOrganisation> response = apiInstance.UpdateOrganisationWithHttpInfo(sessionId, cMOrganisation);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.UpdateOrganisationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMOrganisation** | [**CMOrganisation**](CMOrganisation.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateuser"></a>
# **UpdateUser**
> CMUserWithExtras UpdateUser (string organisationId, string sessionId, CMUserWithExtras cMUserWithExtras)



Update or Create a user (save a user).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);
            var organisationId = "organisationId_example";  // string | the main organisation (its guid id) to update a user in.
            var sessionId = "sessionId_example";  // string | a valid SimSage Session id.
            var cMUserWithExtras = new CMUserWithExtras(); // CMUserWithExtras | 

            try
            {
                CMUserWithExtras result = apiInstance.UpdateUser(organisationId, sessionId, cMUserWithExtras);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.UpdateUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CMUserWithExtras> response = apiInstance.UpdateUserWithHttpInfo(organisationId, sessionId, cMUserWithExtras);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.UpdateUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organisationId** | **string** | the main organisation (its guid id) to update a user in. |  |
| **sessionId** | **string** | a valid SimSage Session id. |  |
| **cMUserWithExtras** | [**CMUserWithExtras**](CMUserWithExtras.md) |  |  |

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
| **200** | save user response |  -  |
| **500** | could not save user |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="version8"></a>
# **Version8**
> SignInCmd Version8 ()

Get Version

Get the version of SimSage Auth Services.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Version8Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://demo.simsage.ai";
            var apiInstance = new AuthApi(config);

            try
            {
                // Get Version
                SignInCmd result = apiInstance.Version8();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AuthApi.Version8: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the Version8WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Version
    ApiResponse<SignInCmd> response = apiInstance.Version8WithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthApi.Version8WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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
| **500** | could not get version |  -  |
| **200** | the version response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

