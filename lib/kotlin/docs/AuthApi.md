# AuthApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGroup**](AuthApi.md#deleteGroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group
[**deleteOrganisation**](AuthApi.md#deleteOrganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation
[**getGroups**](AuthApi.md#getGroups) | **GET** /api/auth/groups/{organisationId} | Get Groups
[**getOTT**](AuthApi.md#getOTT) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token.
[**getUserOrganisationList**](AuthApi.md#getUserOrganisationList) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations
[**getUsersPaginated**](AuthApi.md#getUsersPaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated
[**importUsersAndGroups**](AuthApi.md#importUsersAndGroups) | **PUT** /api/auth/user/import | 
[**myRoles**](AuthApi.md#myRoles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles
[**removeUserFromOrganisation**](AuthApi.md#removeUserFromOrganisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation
[**resetPassword**](AuthApi.md#resetPassword) | **POST** /api/auth/reset-password | Perform a password-reset request.
[**resetPasswordRequest**](AuthApi.md#resetPasswordRequest) | **POST** /api/auth/reset-password-request | Password Reset Request
[**saveGroup**](AuthApi.md#saveGroup) | **PUT** /api/auth/group | Save Group
[**signIn**](AuthApi.md#signIn) | **POST** /api/auth/sign-in | Sign In
[**signInAdminUsingJWTMsal**](AuthApi.md#signInAdminUsingJWTMsal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In
[**signInAdminUsingSessionId**](AuthApi.md#signInAdminUsingSessionId) | **GET** /api/auth/admin/authenticate/session-id | session-id Sign-in
[**signInDmsUsingJWTMsal**](AuthApi.md#signInDmsUsingJWTMsal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In
[**signInEvolveUsingJWTMsal**](AuthApi.md#signInEvolveUsingJWTMsal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In
[**signInSearchUsingJWTMsal**](AuthApi.md#signInSearchUsingJWTMsal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In
[**signOut**](AuthApi.md#signOut) | **DELETE** /api/auth/sign-out | Sign Out
[**updateOrganisation**](AuthApi.md#updateOrganisation) | **PUT** /api/auth/organisation | Save Organisation
[**updateUser**](AuthApi.md#updateUser) | **PUT** /api/auth/user/{organisationId} | 
[**version8**](AuthApi.md#version8) | **GET** /api/auth/version | Get Version


<a id="deleteGroup"></a>
# **deleteGroup**
> JsonMessage deleteGroup(organisationId, name, sessionId)

Delete Group

Delete a group by name.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val name : kotlin.String = name_example // kotlin.String | the name of the group to remove.
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : JsonMessage = apiInstance.deleteGroup(organisationId, name, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#deleteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#deleteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **name** | **kotlin.String**| the name of the group to remove. |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteOrganisation"></a>
# **deleteOrganisation**
> JsonMessage deleteOrganisation(organisationId, sessionId)

Delete Organisation

Delete / remove an organisation and its knowledge bases.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : JsonMessage = apiInstance.deleteOrganisation(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#deleteOrganisation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#deleteOrganisation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGroups"></a>
# **getGroups**
> CMGroupList getGroups(organisationId, sessionId)

Get Groups

Return a paginated, filtered list of groups for a given organisation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the main organisation (its guid id) to get users for
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMGroupList = apiInstance.getGroups(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#getGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#getGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the main organisation (its guid id) to get users for |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMGroupList**](CMGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOTT"></a>
# **getOTT**
> kotlin.String getOTT(organisationId, sessionId)

Get a one-time token.

Get a one-time token associated with your session.  Can be used for download items.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.String = apiInstance.getOTT(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#getOTT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#getOTT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUserOrganisationList"></a>
# **getUserOrganisationList**
> kotlin.collections.List&lt;CMOrganisation&gt; getUserOrganisationList(filter, sessionId)

Get a list of Organisations

Return all organisations that a user has access to (read-only or write).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val filter : kotlin.String = filter_example // kotlin.String | a text filter for partial string matching organisations
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<CMOrganisation> = apiInstance.getUserOrganisationList(filter, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#getUserOrganisationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#getUserOrganisationList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| a text filter for partial string matching organisations |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**kotlin.collections.List&lt;CMOrganisation&gt;**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUsersPaginated"></a>
# **getUsersPaginated**
> CMUserList getUsersPaginated(organisationId, page, pageSize, filter, sessionId)

Get Users paginated

Return a paginated, filtered list of users for a given organisation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the main organisation (its guid id) to get users for
val page : kotlin.Int = 56 // kotlin.Int | the starting page, starting at zero
val pageSize : kotlin.Int = 56 // kotlin.Int | the number of users per page
val filter : kotlin.String = filter_example // kotlin.String | a text filter for partial string matching users
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : CMUserList = apiInstance.getUsersPaginated(organisationId, page, pageSize, filter, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#getUsersPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#getUsersPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the main organisation (its guid id) to get users for |
 **page** | **kotlin.Int**| the starting page, starting at zero |
 **pageSize** | **kotlin.Int**| the number of users per page |
 **filter** | **kotlin.String**| a text filter for partial string matching users |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**CMUserList**](CMUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="importUsersAndGroups"></a>
# **importUsersAndGroups**
> JsonMessage importUsersAndGroups(sessionId, cmImportUsers, apIVersion)



Import users and groups.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmImportUsers : CMImportUsers =  // CMImportUsers | 
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.importUsersAndGroups(sessionId, cmImportUsers, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#importUsersAndGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#importUsersAndGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmImportUsers** | [**CMImportUsers**](CMImportUsers.md)|  |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="myRoles"></a>
# **myRoles**
> kotlin.collections.List&lt;kotlin.String&gt; myRoles(organisationId, sessionId)

Get users application roles

Get Roles of logged in user for the logged in Organisation

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.myRoles(organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#myRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#myRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the organisation (its guid id) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeUserFromOrganisation"></a>
# **removeUserFromOrganisation**
> JsonMessage removeUserFromOrganisation(userId, organisationId, sessionId)

Remove User from Organisation

Remove an existing user from an existing Organisation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val userId : kotlin.String = userId_example // kotlin.String | the user's id (a guid)
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation's id (a guid)
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : JsonMessage = apiInstance.removeUserFromOrganisation(userId, organisationId, sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#removeUserFromOrganisation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#removeUserFromOrganisation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| the user&#39;s id (a guid) |
 **organisationId** | **kotlin.String**| the organisation&#39;s id (a guid) |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="resetPassword"></a>
# **resetPassword**
> JsonMessage resetPassword(cmUserPasswordReset)

Perform a password-reset request.

Reset Password

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val cmUserPasswordReset : CMUserPasswordReset =  // CMUserPasswordReset | 
try {
    val result : JsonMessage = apiInstance.resetPassword(cmUserPasswordReset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#resetPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#resetPassword")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmUserPasswordReset** | [**CMUserPasswordReset**](CMUserPasswordReset.md)|  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="resetPasswordRequest"></a>
# **resetPasswordRequest**
> JsonMessage resetPasswordRequest(cmPasswordResetRequest)

Password Reset Request

Start a password-reset request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val cmPasswordResetRequest : CMPasswordResetRequest =  // CMPasswordResetRequest | 
try {
    val result : JsonMessage = apiInstance.resetPasswordRequest(cmPasswordResetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#resetPasswordRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#resetPasswordRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmPasswordResetRequest** | [**CMPasswordResetRequest**](CMPasswordResetRequest.md)|  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="saveGroup"></a>
# **saveGroup**
> JsonMessage saveGroup(sessionId, cmGroup)

Save Group

Save (update/create) a group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmGroup : CMGroup =  // CMGroup | 
try {
    val result : JsonMessage = apiInstance.saveGroup(sessionId, cmGroup)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#saveGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#saveGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmGroup** | [**CMGroup**](CMGroup.md)|  |

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="signIn"></a>
# **signIn**
> CMSessionVersion signIn(cmSignInParameters)

Sign In

Administrator Sign-in of an existing user using username/password.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val cmSignInParameters : CMSignInParameters =  // CMSignInParameters | 
try {
    val result : CMSessionVersion = apiInstance.signIn(cmSignInParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signIn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signIn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmSignInParameters** | [**CMSignInParameters**](CMSignInParameters.md)|  |

### Return type

[**CMSessionVersion**](CMSessionVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="signInAdminUsingJWTMsal"></a>
# **signInAdminUsingJWTMsal**
> SignInAdmin signInAdminUsingJWTMsal(jwt)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val jwt : kotlin.String = jwt_example // kotlin.String | a valid JWT token.
try {
    val result : SignInAdmin = apiInstance.signInAdminUsingJWTMsal(jwt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signInAdminUsingJWTMsal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signInAdminUsingJWTMsal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **kotlin.String**| a valid JWT token. |

### Return type

[**SignInAdmin**](SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signInAdminUsingSessionId"></a>
# **signInAdminUsingSessionId**
> SignInAdmin signInAdminUsingSessionId(sessionId)

session-id Sign-in

Sign-in a user using an existing session-id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
try {
    val result : SignInAdmin = apiInstance.signInAdminUsingSessionId(sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signInAdminUsingSessionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signInAdminUsingSessionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |

### Return type

[**SignInAdmin**](SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signInDmsUsingJWTMsal"></a>
# **signInDmsUsingJWTMsal**
> SignInDmsCmd signInDmsUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val jwt : kotlin.String = jwt_example // kotlin.String | a valid JWT token.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
try {
    val result : SignInDmsCmd = apiInstance.signInDmsUsingJWTMsal(jwt, organisationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signInDmsUsingJWTMsal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signInDmsUsingJWTMsal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **kotlin.String**| a valid JWT token. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |

### Return type

[**SignInDmsCmd**](SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signInEvolveUsingJWTMsal"></a>
# **signInEvolveUsingJWTMsal**
> SignInDmsCmd signInEvolveUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

Sign-in an Evolve user using an Msal JWT...

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val jwt : kotlin.String = jwt_example // kotlin.String | a valid JWT token.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
try {
    val result : SignInDmsCmd = apiInstance.signInEvolveUsingJWTMsal(jwt, organisationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signInEvolveUsingJWTMsal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signInEvolveUsingJWTMsal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **kotlin.String**| a valid JWT token. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |

### Return type

[**SignInDmsCmd**](SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signInSearchUsingJWTMsal"></a>
# **signInSearchUsingJWTMsal**
> SignInCmd signInSearchUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val jwt : kotlin.String = jwt_example // kotlin.String | Schema valid JWT token.
val organisationId : kotlin.String = organisationId_example // kotlin.String | the organisation (its guid id)
try {
    val result : SignInCmd = apiInstance.signInSearchUsingJWTMsal(jwt, organisationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signInSearchUsingJWTMsal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signInSearchUsingJWTMsal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **kotlin.String**| Schema valid JWT token. |
 **organisationId** | **kotlin.String**| the organisation (its guid id) |

### Return type

[**SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signOut"></a>
# **signOut**
> JsonMessage signOut(sessionId, apIVersion)

Sign Out

Sign-out any signed-in user (owner of the session object only).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val apIVersion : kotlin.String = apIVersion_example // kotlin.String | 
try {
    val result : JsonMessage = apiInstance.signOut(sessionId, apIVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#signOut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#signOut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **apIVersion** | **kotlin.String**|  | [optional] [enum: 1]

### Return type

[**JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateOrganisation"></a>
# **updateOrganisation**
> CMOrganisation updateOrganisation(sessionId, cmOrganisation)

Save Organisation

Update or Create an organisation (save an organisation).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmOrganisation : CMOrganisation =  // CMOrganisation | 
try {
    val result : CMOrganisation = apiInstance.updateOrganisation(sessionId, cmOrganisation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#updateOrganisation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#updateOrganisation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmOrganisation** | [**CMOrganisation**](CMOrganisation.md)|  |

### Return type

[**CMOrganisation**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateUser"></a>
# **updateUser**
> CMUserWithExtras updateUser(organisationId, sessionId, cmUserWithExtras)



Update or Create a user (save a user).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val organisationId : kotlin.String = organisationId_example // kotlin.String | the main organisation (its guid id) to update a user in.
val sessionId : kotlin.String = sessionId_example // kotlin.String | a valid SimSage Session id.
val cmUserWithExtras : CMUserWithExtras =  // CMUserWithExtras | 
try {
    val result : CMUserWithExtras = apiInstance.updateUser(organisationId, sessionId, cmUserWithExtras)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationId** | **kotlin.String**| the main organisation (its guid id) to update a user in. |
 **sessionId** | **kotlin.String**| a valid SimSage Session id. |
 **cmUserWithExtras** | [**CMUserWithExtras**](CMUserWithExtras.md)|  |

### Return type

[**CMUserWithExtras**](CMUserWithExtras.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="version8"></a>
# **version8**
> SignInCmd version8()

Get Version

Get the version of SimSage Auth Services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
try {
    val result : SignInCmd = apiInstance.version8()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#version8")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#version8")
    e.printStackTrace()
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

