# AuthApi

All URIs are relative to *https://test.simsage.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGroup**](AuthApi.md#deleteGroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group |
| [**deleteOrganisation**](AuthApi.md#deleteOrganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation |
| [**getGroups**](AuthApi.md#getGroups) | **GET** /api/auth/groups/{organisationId} | Get Groups |
| [**getOTT**](AuthApi.md#getOTT) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token. |
| [**getUserOrganisationList**](AuthApi.md#getUserOrganisationList) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations |
| [**getUsersPaginated**](AuthApi.md#getUsersPaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated |
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


<a name="deleteGroup"></a>
# **deleteGroup**
> JsonMessage deleteGroup(organisationId, name, session-id)

Delete Group

    Delete a group by name.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **name** | **String**| the name of the group to remove. | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteOrganisation"></a>
# **deleteOrganisation**
> JsonMessage deleteOrganisation(organisationId, session-id)

Delete Organisation

    Delete / remove an organisation and its knowledge bases.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> CMGroupList getGroups(organisationId, session-id)

Get Groups

    Return a paginated, filtered list of groups for a given organisation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the main organisation (its guid id) to get users for | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMGroupList**](../Models/CMGroupList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getOTT"></a>
# **getOTT**
> String getOTT(organisationId, session-id)

Get a one-time token.

    Get a one-time token associated with your session.  Can be used for download items.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUserOrganisationList"></a>
# **getUserOrganisationList**
> List getUserOrganisationList(filter, session-id)

Get a list of Organisations

    Return all organisations that a user has access to (read-only or write).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| a text filter for partial string matching organisations | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**List**](../Models/CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUsersPaginated"></a>
# **getUsersPaginated**
> CMUserList getUsersPaginated(organisationId, page, pageSize, filter, session-id)

Get Users paginated

    Return a paginated, filtered list of users for a given organisation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the main organisation (its guid id) to get users for | [default to null] |
| **page** | **Integer**| the starting page, starting at zero | [default to null] |
| **pageSize** | **Integer**| the number of users per page | [default to null] |
| **filter** | **String**| a text filter for partial string matching users | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**CMUserList**](../Models/CMUserList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="importUsersAndGroups"></a>
# **importUsersAndGroups**
> JsonMessage importUsersAndGroups(session-id, CMImportUsers, API-Version)



    Import users and groups.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMImportUsers** | [**CMImportUsers**](../Models/CMImportUsers.md)|  | |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="myRoles"></a>
# **myRoles**
> List myRoles(organisationId, session-id)

Get users application roles

    Get Roles of logged in user for the logged in Organisation

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

**List**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeUserFromOrganisation"></a>
# **removeUserFromOrganisation**
> JsonMessage removeUserFromOrganisation(userId, organisationId, session-id)

Remove User from Organisation

    Remove an existing user from an existing Organisation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| the user&#39;s id (a guid) | [default to null] |
| **organisationId** | **String**| the organisation&#39;s id (a guid) | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="resetPassword"></a>
# **resetPassword**
> JsonMessage resetPassword(CMUserPasswordReset)

Perform a password-reset request.

    Reset Password

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMUserPasswordReset** | [**CMUserPasswordReset**](../Models/CMUserPasswordReset.md)|  | |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="resetPasswordRequest"></a>
# **resetPasswordRequest**
> JsonMessage resetPasswordRequest(CMPasswordResetRequest)

Password Reset Request

    Start a password-reset request.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMPasswordResetRequest** | [**CMPasswordResetRequest**](../Models/CMPasswordResetRequest.md)|  | |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="saveGroup"></a>
# **saveGroup**
> JsonMessage saveGroup(session-id, CMGroup)

Save Group

    Save (update/create) a group.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMGroup** | [**CMGroup**](../Models/CMGroup.md)|  | |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="signIn"></a>
# **signIn**
> CMSessionVersion signIn(CMSignInParameters)

Sign In

    Administrator Sign-in of an existing user using username/password.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CMSignInParameters** | [**CMSignInParameters**](../Models/CMSignInParameters.md)|  | |

### Return type

[**CMSessionVersion**](../Models/CMSessionVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="signInAdminUsingJWTMsal"></a>
# **signInAdminUsingJWTMsal**
> SignInAdmin signInAdminUsingJWTMsal(jwt)

JWT MSal Sign In

    Sign-in a user using an Msal JWT.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwt** | **String**| a valid JWT token. | [default to null] |

### Return type

[**SignInAdmin**](../Models/SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="signInAdminUsingSessionId"></a>
# **signInAdminUsingSessionId**
> SignInAdmin signInAdminUsingSessionId(session-id)

session-id Sign-in

    Sign-in a user using an existing session-id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |

### Return type

[**SignInAdmin**](../Models/SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="signInDmsUsingJWTMsal"></a>
# **signInDmsUsingJWTMsal**
> SignInDmsCmd signInDmsUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

    Sign-in a user using an Msal JWT.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwt** | **String**| a valid JWT token. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |

### Return type

[**SignInDmsCmd**](../Models/SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="signInEvolveUsingJWTMsal"></a>
# **signInEvolveUsingJWTMsal**
> SignInDmsCmd signInEvolveUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

    Sign-in an Evolve user using an Msal JWT...

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwt** | **String**| a valid JWT token. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |

### Return type

[**SignInDmsCmd**](../Models/SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="signInSearchUsingJWTMsal"></a>
# **signInSearchUsingJWTMsal**
> SignInCmd signInSearchUsingJWTMsal(jwt, organisationId)

JWT MSal Sign In

    Sign-in a user using an Msal JWT.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwt** | **String**| Schema valid JWT token. | [default to null] |
| **organisationId** | **String**| the organisation (its guid id) | [default to null] |

### Return type

[**SignInCmd**](../Models/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="signOut"></a>
# **signOut**
> JsonMessage signOut(session-id, API-Version)

Sign Out

    Sign-out any signed-in user (owner of the session object only).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **API-Version** | **String**|  | [optional] [default to null] [enum: 1] |

### Return type

[**JsonMessage**](../Models/JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateOrganisation"></a>
# **updateOrganisation**
> CMOrganisation updateOrganisation(session-id, CMOrganisation)

Save Organisation

    Update or Create an organisation (save an organisation).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMOrganisation** | [**CMOrganisation**](../Models/CMOrganisation.md)|  | |

### Return type

[**CMOrganisation**](../Models/CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> CMUserWithExtras updateUser(organisationId, session-id, CMUserWithExtras)



    Update or Create a user (save a user).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organisationId** | **String**| the main organisation (its guid id) to update a user in. | [default to null] |
| **session-id** | **String**| a valid SimSage Session id. | [default to null] |
| **CMUserWithExtras** | [**CMUserWithExtras**](../Models/CMUserWithExtras.md)|  | |

### Return type

[**CMUserWithExtras**](../Models/CMUserWithExtras.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="version8"></a>
# **version8**
> SignInCmd version8()

Get Version

    Get the version of SimSage Auth Services.

### Parameters
This endpoint does not need any parameter.

### Return type

[**SignInCmd**](../Models/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

