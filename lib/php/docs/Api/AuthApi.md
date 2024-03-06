# OpenAPI\Client\AuthApi

All URIs are relative to https://demo.simsage.ai, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteGroup()**](AuthApi.md#deleteGroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group |
| [**deleteOrganisation()**](AuthApi.md#deleteOrganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation |
| [**getGroups()**](AuthApi.md#getGroups) | **GET** /api/auth/groups/{organisationId} | Get Groups |
| [**getOTT()**](AuthApi.md#getOTT) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token. |
| [**getUserOrganisationList()**](AuthApi.md#getUserOrganisationList) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations |
| [**getUsersPaginated()**](AuthApi.md#getUsersPaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated |
| [**importUsersAndGroups()**](AuthApi.md#importUsersAndGroups) | **PUT** /api/auth/user/import |  |
| [**myRoles()**](AuthApi.md#myRoles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles |
| [**removeUserFromOrganisation()**](AuthApi.md#removeUserFromOrganisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation |
| [**resetPassword()**](AuthApi.md#resetPassword) | **POST** /api/auth/reset-password | Perform a password-reset request. |
| [**resetPasswordRequest()**](AuthApi.md#resetPasswordRequest) | **POST** /api/auth/reset-password-request | Password Reset Request |
| [**saveGroup()**](AuthApi.md#saveGroup) | **PUT** /api/auth/group | Save Group |
| [**signIn()**](AuthApi.md#signIn) | **POST** /api/auth/sign-in | Sign In |
| [**signInAdminUsingJWTMsal()**](AuthApi.md#signInAdminUsingJWTMsal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In |
| [**signInDmsUsingJWTMsal()**](AuthApi.md#signInDmsUsingJWTMsal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**signInEvolveUsingJWTMsal()**](AuthApi.md#signInEvolveUsingJWTMsal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**signInSearchUsingJWTMsal()**](AuthApi.md#signInSearchUsingJWTMsal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In |
| [**signOut()**](AuthApi.md#signOut) | **DELETE** /api/auth/sign-out | Sign Out |
| [**updateOrganisation()**](AuthApi.md#updateOrganisation) | **PUT** /api/auth/organisation | Save Organisation |
| [**updateUser()**](AuthApi.md#updateUser) | **PUT** /api/auth/user/{organisationId} |  |
| [**version8()**](AuthApi.md#version8) | **GET** /api/auth/version | Get Version |


## `deleteGroup()`

```php
deleteGroup($organisation_id, $name, $session_id): \OpenAPI\Client\Model\JsonMessage
```

Delete Group

Delete a group by name.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$name = 'name_example'; // string | the name of the group to remove.
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->deleteGroup($organisation_id, $name, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->deleteGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **name** | **string**| the name of the group to remove. | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `deleteOrganisation()`

```php
deleteOrganisation($organisation_id, $session_id): \OpenAPI\Client\Model\JsonMessage
```

Delete Organisation

Delete / remove an organisation and its knowledge bases.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->deleteOrganisation($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->deleteOrganisation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `getGroups()`

```php
getGroups($organisation_id, $session_id): \OpenAPI\Client\Model\CMGroupList
```

Get Groups

Return a paginated, filtered list of groups for a given organisation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the main organisation (its guid id) to get users for
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getGroups($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->getGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the main organisation (its guid id) to get users for | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMGroupList**](../Model/CMGroupList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getOTT()`

```php
getOTT($organisation_id, $session_id): string
```

Get a one-time token.

Get a one-time token associated with your session.  Can be used for download items.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getOTT($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->getOTT: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUserOrganisationList()`

```php
getUserOrganisationList($filter, $session_id): \OpenAPI\Client\Model\CMOrganisation[]
```

Get a list of Organisations

Return all organisations that a user has access to (read-only or write).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$filter = 'filter_example'; // string | a text filter for partial string matching organisations
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getUserOrganisationList($filter, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->getUserOrganisationList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **string**| a text filter for partial string matching organisations | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMOrganisation[]**](../Model/CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUsersPaginated()`

```php
getUsersPaginated($organisation_id, $page, $page_size, $filter, $session_id): \OpenAPI\Client\Model\CMUserList
```

Get Users paginated

Return a paginated, filtered list of users for a given organisation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the main organisation (its guid id) to get users for
$page = 56; // int | the starting page, starting at zero
$page_size = 56; // int | the number of users per page
$filter = 'filter_example'; // string | a text filter for partial string matching users
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->getUsersPaginated($organisation_id, $page, $page_size, $filter, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->getUsersPaginated: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the main organisation (its guid id) to get users for | |
| **page** | **int**| the starting page, starting at zero | |
| **page_size** | **int**| the number of users per page | |
| **filter** | **string**| a text filter for partial string matching users | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

[**\OpenAPI\Client\Model\CMUserList**](../Model/CMUserList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `importUsersAndGroups()`

```php
importUsersAndGroups($session_id, $cm_import_users, $api_version): \OpenAPI\Client\Model\JsonMessage
```



Import users and groups.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_import_users = new \OpenAPI\Client\Model\CMImportUsers(); // \OpenAPI\Client\Model\CMImportUsers
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->importUsersAndGroups($session_id, $cm_import_users, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->importUsersAndGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_import_users** | [**\OpenAPI\Client\Model\CMImportUsers**](../Model/CMImportUsers.md)|  | |
| **api_version** | **string**|  | [optional] |

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

## `myRoles()`

```php
myRoles($organisation_id, $session_id): string[]
```

Get users application roles

Get Roles of logged in user for the logged in Organisation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->myRoles($organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->myRoles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the organisation (its guid id) | |
| **session_id** | **string**| a valid SimSage Session id. | |

### Return type

**string[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeUserFromOrganisation()`

```php
removeUserFromOrganisation($user_id, $organisation_id, $session_id): \OpenAPI\Client\Model\JsonMessage
```

Remove User from Organisation

Remove an existing user from an existing Organisation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id = 'user_id_example'; // string | the user's id (a guid)
$organisation_id = 'organisation_id_example'; // string | the organisation's id (a guid)
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->removeUserFromOrganisation($user_id, $organisation_id, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->removeUserFromOrganisation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **user_id** | **string**| the user&#39;s id (a guid) | |
| **organisation_id** | **string**| the organisation&#39;s id (a guid) | |
| **session_id** | **string**| a valid SimSage Session id. | |

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

## `resetPassword()`

```php
resetPassword($cm_user_password_reset): \OpenAPI\Client\Model\JsonMessage
```

Perform a password-reset request.

Reset Password

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_user_password_reset = new \OpenAPI\Client\Model\CMUserPasswordReset(); // \OpenAPI\Client\Model\CMUserPasswordReset

try {
    $result = $apiInstance->resetPassword($cm_user_password_reset);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->resetPassword: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_user_password_reset** | [**\OpenAPI\Client\Model\CMUserPasswordReset**](../Model/CMUserPasswordReset.md)|  | |

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

## `resetPasswordRequest()`

```php
resetPasswordRequest($cm_password_reset_request): \OpenAPI\Client\Model\JsonMessage
```

Password Reset Request

Start a password-reset request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_password_reset_request = new \OpenAPI\Client\Model\CMPasswordResetRequest(); // \OpenAPI\Client\Model\CMPasswordResetRequest

try {
    $result = $apiInstance->resetPasswordRequest($cm_password_reset_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->resetPasswordRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_password_reset_request** | [**\OpenAPI\Client\Model\CMPasswordResetRequest**](../Model/CMPasswordResetRequest.md)|  | |

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

## `saveGroup()`

```php
saveGroup($session_id, $cm_group): \OpenAPI\Client\Model\JsonMessage
```

Save Group

Save (update/create) a group.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_group = new \OpenAPI\Client\Model\CMGroup(); // \OpenAPI\Client\Model\CMGroup

try {
    $result = $apiInstance->saveGroup($session_id, $cm_group);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->saveGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_group** | [**\OpenAPI\Client\Model\CMGroup**](../Model/CMGroup.md)|  | |

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

## `signIn()`

```php
signIn($cm_sign_in_parameters): \OpenAPI\Client\Model\CMSessionVersion
```

Sign In

Administrator Sign-in of an existing user using username/password.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$cm_sign_in_parameters = new \OpenAPI\Client\Model\CMSignInParameters(); // \OpenAPI\Client\Model\CMSignInParameters

try {
    $result = $apiInstance->signIn($cm_sign_in_parameters);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->signIn: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cm_sign_in_parameters** | [**\OpenAPI\Client\Model\CMSignInParameters**](../Model/CMSignInParameters.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMSessionVersion**](../Model/CMSessionVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `signInAdminUsingJWTMsal()`

```php
signInAdminUsingJWTMsal($jwt): \OpenAPI\Client\Model\SignInAdmin
```

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$jwt = 'jwt_example'; // string | a valid JWT token.

try {
    $result = $apiInstance->signInAdminUsingJWTMsal($jwt);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->signInAdminUsingJWTMsal: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jwt** | **string**| a valid JWT token. | |

### Return type

[**\OpenAPI\Client\Model\SignInAdmin**](../Model/SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `signInDmsUsingJWTMsal()`

```php
signInDmsUsingJWTMsal($jwt, $organisation_id): \OpenAPI\Client\Model\SignInDmsCmd
```

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$jwt = 'jwt_example'; // string | a valid JWT token.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)

try {
    $result = $apiInstance->signInDmsUsingJWTMsal($jwt, $organisation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->signInDmsUsingJWTMsal: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jwt** | **string**| a valid JWT token. | |
| **organisation_id** | **string**| the organisation (its guid id) | |

### Return type

[**\OpenAPI\Client\Model\SignInDmsCmd**](../Model/SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `signInEvolveUsingJWTMsal()`

```php
signInEvolveUsingJWTMsal($jwt, $organisation_id): \OpenAPI\Client\Model\SignInDmsCmd
```

JWT MSal Sign In

Sign-in an Evolve user using an Msal JWT...

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$jwt = 'jwt_example'; // string | a valid JWT token.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)

try {
    $result = $apiInstance->signInEvolveUsingJWTMsal($jwt, $organisation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->signInEvolveUsingJWTMsal: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jwt** | **string**| a valid JWT token. | |
| **organisation_id** | **string**| the organisation (its guid id) | |

### Return type

[**\OpenAPI\Client\Model\SignInDmsCmd**](../Model/SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `signInSearchUsingJWTMsal()`

```php
signInSearchUsingJWTMsal($jwt, $organisation_id): \OpenAPI\Client\Model\SignInCmd
```

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$jwt = 'jwt_example'; // string | Schema valid JWT token.
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)

try {
    $result = $apiInstance->signInSearchUsingJWTMsal($jwt, $organisation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->signInSearchUsingJWTMsal: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jwt** | **string**| Schema valid JWT token. | |
| **organisation_id** | **string**| the organisation (its guid id) | |

### Return type

[**\OpenAPI\Client\Model\SignInCmd**](../Model/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `signOut()`

```php
signOut($session_id, $api_version): \OpenAPI\Client\Model\JsonMessage
```

Sign Out

Sign-out any signed-in user (owner of the session object only).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$api_version = 'api_version_example'; // string

try {
    $result = $apiInstance->signOut($session_id, $api_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->signOut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **api_version** | **string**|  | [optional] |

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

## `updateOrganisation()`

```php
updateOrganisation($session_id, $cm_organisation): \OpenAPI\Client\Model\CMOrganisation
```

Save Organisation

Update or Create an organisation (save an organisation).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_organisation = new \OpenAPI\Client\Model\CMOrganisation(); // \OpenAPI\Client\Model\CMOrganisation

try {
    $result = $apiInstance->updateOrganisation($session_id, $cm_organisation);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->updateOrganisation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_organisation** | [**\OpenAPI\Client\Model\CMOrganisation**](../Model/CMOrganisation.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMOrganisation**](../Model/CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateUser()`

```php
updateUser($organisation_id, $session_id, $cm_user_with_extras): \OpenAPI\Client\Model\CMUserWithExtras
```



Update or Create a user (save a user).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the main organisation (its guid id) to update a user in.
$session_id = 'session_id_example'; // string | a valid SimSage Session id.
$cm_user_with_extras = new \OpenAPI\Client\Model\CMUserWithExtras(); // \OpenAPI\Client\Model\CMUserWithExtras

try {
    $result = $apiInstance->updateUser($organisation_id, $session_id, $cm_user_with_extras);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->updateUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisation_id** | **string**| the main organisation (its guid id) to update a user in. | |
| **session_id** | **string**| a valid SimSage Session id. | |
| **cm_user_with_extras** | [**\OpenAPI\Client\Model\CMUserWithExtras**](../Model/CMUserWithExtras.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CMUserWithExtras**](../Model/CMUserWithExtras.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `version8()`

```php
version8(): \OpenAPI\Client\Model\SignInCmd
```

Get Version

Get the version of SimSage Auth Services.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->version8();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->version8: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\SignInCmd**](../Model/SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
