# \AuthApi

All URIs are relative to *https://test.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_group**](AuthApi.md#delete_group) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group
[**delete_organisation**](AuthApi.md#delete_organisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation
[**get_groups**](AuthApi.md#get_groups) | **GET** /api/auth/groups/{organisationId} | Get Groups
[**get_ott**](AuthApi.md#get_ott) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token.
[**get_user_organisation_list**](AuthApi.md#get_user_organisation_list) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations
[**get_users_paginated**](AuthApi.md#get_users_paginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated
[**import_users_and_groups**](AuthApi.md#import_users_and_groups) | **PUT** /api/auth/user/import | 
[**my_roles**](AuthApi.md#my_roles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles
[**remove_user_from_organisation**](AuthApi.md#remove_user_from_organisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation
[**reset_password**](AuthApi.md#reset_password) | **POST** /api/auth/reset-password | Perform a password-reset request.
[**reset_password_request**](AuthApi.md#reset_password_request) | **POST** /api/auth/reset-password-request | Password Reset Request
[**save_group**](AuthApi.md#save_group) | **PUT** /api/auth/group | Save Group
[**sign_in**](AuthApi.md#sign_in) | **POST** /api/auth/sign-in | Sign In
[**sign_in_admin_using_jwt_msal**](AuthApi.md#sign_in_admin_using_jwt_msal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In
[**sign_in_admin_using_session_id**](AuthApi.md#sign_in_admin_using_session_id) | **GET** /api/auth/admin/authenticate/session-id | session-id Sign-in
[**sign_in_dms_using_jwt_msal**](AuthApi.md#sign_in_dms_using_jwt_msal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In
[**sign_in_evolve_using_jwt_msal**](AuthApi.md#sign_in_evolve_using_jwt_msal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In
[**sign_in_search_using_jwt_msal**](AuthApi.md#sign_in_search_using_jwt_msal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In
[**sign_out**](AuthApi.md#sign_out) | **DELETE** /api/auth/sign-out | Sign Out
[**update_organisation**](AuthApi.md#update_organisation) | **PUT** /api/auth/organisation | Save Organisation
[**update_user**](AuthApi.md#update_user) | **PUT** /api/auth/user/{organisationId} | 
[**version8**](AuthApi.md#version8) | **GET** /api/auth/version | Get Version



## delete_group

> crate::models::JsonMessage delete_group(organisation_id, name, session_id)
Delete Group

Delete a group by name.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**name** | **String** | the name of the group to remove. | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_organisation

> crate::models::JsonMessage delete_organisation(organisation_id, session_id)
Delete Organisation

Delete / remove an organisation and its knowledge bases.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_groups

> crate::models::CmGroupList get_groups(organisation_id, session_id)
Get Groups

Return a paginated, filtered list of groups for a given organisation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) to get users for | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmGroupList**](CMGroupList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_ott

> String get_ott(organisation_id, session_id)
Get a one-time token.

Get a one-time token associated with your session.  Can be used for download items.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_user_organisation_list

> Vec<crate::models::CmOrganisation> get_user_organisation_list(filter, session_id)
Get a list of Organisations

Return all organisations that a user has access to (read-only or write).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**filter** | **String** | a text filter for partial string matching organisations | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**Vec<crate::models::CmOrganisation>**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_users_paginated

> crate::models::CmUserList get_users_paginated(organisation_id, page, page_size, filter, session_id)
Get Users paginated

Return a paginated, filtered list of users for a given organisation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) to get users for | [required] |
**page** | **i32** | the starting page, starting at zero | [required] |
**page_size** | **i32** | the number of users per page | [required] |
**filter** | **String** | a text filter for partial string matching users | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::CmUserList**](CMUserList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## import_users_and_groups

> crate::models::JsonMessage import_users_and_groups(session_id, cm_import_users, api_version)


Import users and groups.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_import_users** | [**CmImportUsers**](CmImportUsers.md) |  | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## my_roles

> Vec<String> my_roles(organisation_id, session_id)
Get users application roles

Get Roles of logged in user for the logged in Organisation

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

**Vec<String>**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_user_from_organisation

> crate::models::JsonMessage remove_user_from_organisation(user_id, organisation_id, session_id)
Remove User from Organisation

Remove an existing user from an existing Organisation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | **String** | the user's id (a guid) | [required] |
**organisation_id** | **String** | the organisation's id (a guid) | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reset_password

> crate::models::JsonMessage reset_password(cm_user_password_reset)
Perform a password-reset request.

Reset Password

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_user_password_reset** | [**CmUserPasswordReset**](CmUserPasswordReset.md) |  | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reset_password_request

> crate::models::JsonMessage reset_password_request(cm_password_reset_request)
Password Reset Request

Start a password-reset request.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_password_reset_request** | [**CmPasswordResetRequest**](CmPasswordResetRequest.md) |  | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## save_group

> crate::models::JsonMessage save_group(session_id, cm_group)
Save Group

Save (update/create) a group.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_group** | [**CmGroup**](CmGroup.md) |  | [required] |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_in

> crate::models::CmSessionVersion sign_in(cm_sign_in_parameters)
Sign In

Administrator Sign-in of an existing user using username/password.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cm_sign_in_parameters** | [**CmSignInParameters**](CmSignInParameters.md) |  | [required] |

### Return type

[**crate::models::CmSessionVersion**](CMSessionVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_in_admin_using_jwt_msal

> crate::models::SignInAdmin sign_in_admin_using_jwt_msal(jwt)
JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**jwt** | **String** | a valid JWT token. | [required] |

### Return type

[**crate::models::SignInAdmin**](SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_in_admin_using_session_id

> crate::models::SignInAdmin sign_in_admin_using_session_id(session_id)
session-id Sign-in

Sign-in a user using an existing session-id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |

### Return type

[**crate::models::SignInAdmin**](SignInAdmin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_in_dms_using_jwt_msal

> crate::models::SignInDmsCmd sign_in_dms_using_jwt_msal(jwt, organisation_id)
JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**jwt** | **String** | a valid JWT token. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |

### Return type

[**crate::models::SignInDmsCmd**](SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_in_evolve_using_jwt_msal

> crate::models::SignInDmsCmd sign_in_evolve_using_jwt_msal(jwt, organisation_id)
JWT MSal Sign In

Sign-in an Evolve user using an Msal JWT...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**jwt** | **String** | a valid JWT token. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |

### Return type

[**crate::models::SignInDmsCmd**](SignInDmsCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_in_search_using_jwt_msal

> crate::models::SignInCmd sign_in_search_using_jwt_msal(jwt, organisation_id)
JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**jwt** | **String** | Schema valid JWT token. | [required] |
**organisation_id** | **String** | the organisation (its guid id) | [required] |

### Return type

[**crate::models::SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sign_out

> crate::models::JsonMessage sign_out(session_id, api_version)
Sign Out

Sign-out any signed-in user (owner of the session object only).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**api_version** | Option<**String**> |  |  |

### Return type

[**crate::models::JsonMessage**](JsonMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_organisation

> crate::models::CmOrganisation update_organisation(session_id, cm_organisation)
Save Organisation

Update or Create an organisation (save an organisation).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_organisation** | [**CmOrganisation**](CmOrganisation.md) |  | [required] |

### Return type

[**crate::models::CmOrganisation**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_user

> crate::models::CmUserWithExtras update_user(organisation_id, session_id, cm_user_with_extras)


Update or Create a user (save a user).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organisation_id** | **String** | the main organisation (its guid id) to update a user in. | [required] |
**session_id** | **String** | a valid SimSage Session id. | [required] |
**cm_user_with_extras** | [**CmUserWithExtras**](CmUserWithExtras.md) |  | [required] |

### Return type

[**crate::models::CmUserWithExtras**](CMUserWithExtras.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## version8

> crate::models::SignInCmd version8()
Get Version

Get the version of SimSage Auth Services.

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::SignInCmd**](SignInCmd.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

