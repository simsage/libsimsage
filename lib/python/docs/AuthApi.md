# openapi_client.AuthApi

All URIs are relative to *https://training.simsage.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_group**](AuthApi.md#delete_group) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group
[**delete_organisation**](AuthApi.md#delete_organisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation
[**get_groups**](AuthApi.md#get_groups) | **GET** /api/auth/groups/{organisationId} | Get Groups
[**get_ott**](AuthApi.md#get_ott) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token.
[**get_user_organisation_list**](AuthApi.md#get_user_organisation_list) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations
[**get_users_paginated**](AuthApi.md#get_users_paginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated
[**group_edit_info**](AuthApi.md#group_edit_info) | **POST** /api/auth/group-edit-info/{organisationId} | Get Group edit information
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


# **delete_group**
> JsonMessage delete_group(organisation_id, name, session_id)

Delete Group

Delete a group by name.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    name = 'name_example' # str | the name of the group to remove.
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Delete Group
        api_response = api_instance.delete_group(organisation_id, name, session_id)
        print("The response of AuthApi->delete_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->delete_group: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **name** | **str**| the name of the group to remove. | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**200** | delete group OK response |  -  |
**500** | could not delete group |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_organisation**
> JsonMessage delete_organisation(organisation_id, session_id)

Delete Organisation

Delete / remove an organisation and its knowledge bases.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Delete Organisation
        api_response = api_instance.delete_organisation(organisation_id, session_id)
        print("The response of AuthApi->delete_organisation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->delete_organisation: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**500** | could not remove organisation |  -  |
**200** | remove organisation OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_groups**
> CMGroupList get_groups(organisation_id, session_id)

Get Groups

Return a paginated, filtered list of groups for a given organisation.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_group_list import CMGroupList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the main organisation (its guid id) to get users for
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get Groups
        api_response = api_instance.get_groups(organisation_id, session_id)
        print("The response of AuthApi->get_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->get_groups: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the main organisation (its guid id) to get users for | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**500** | could not get group list |  -  |
**200** | get a list of groups |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ott**
> str get_ott(organisation_id, session_id)

Get a one-time token.

Get a one-time token associated with your session.  Can be used for download items.

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get a one-time token.
        api_response = api_instance.get_ott(organisation_id, session_id)
        print("The response of AuthApi->get_ott:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->get_ott: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get the one-time token as a string. |  -  |
**500** | could not create a one-time token. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_organisation_list**
> List[CMOrganisation] get_user_organisation_list(filter, session_id)

Get a list of Organisations

Return all organisations that a user has access to (read-only or write).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_organisation import CMOrganisation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    filter = 'filter_example' # str | a text filter for partial string matching organisations
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get a list of Organisations
        api_response = api_instance.get_user_organisation_list(filter, session_id)
        print("The response of AuthApi->get_user_organisation_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->get_user_organisation_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| a text filter for partial string matching organisations | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

[**List[CMOrganisation]**](CMOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | could not get organisation list |  -  |
**200** | get a list of organisations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_paginated**
> CMUserList get_users_paginated(organisation_id, page, page_size, filter, session_id)

Get Users paginated

Return a paginated, filtered list of users for a given organisation.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_user_list import CMUserList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the main organisation (its guid id) to get users for
    page = 56 # int | the starting page, starting at zero
    page_size = 56 # int | the number of users per page
    filter = 'filter_example' # str | a text filter for partial string matching users
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get Users paginated
        api_response = api_instance.get_users_paginated(organisation_id, page, page_size, filter, session_id)
        print("The response of AuthApi->get_users_paginated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->get_users_paginated: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the main organisation (its guid id) to get users for | 
 **page** | **int**| the starting page, starting at zero | 
 **page_size** | **int**| the number of users per page | 
 **filter** | **str**| a text filter for partial string matching users | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**200** | get users paginated response |  -  |
**500** | could not get users paginated |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **group_edit_info**
> CMGroupList group_edit_info(organisation_id, session_id, cm_group_edit_info)

Get Group edit information

Return the information needed for the admin UX editing a group

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_group_edit_info import CMGroupEditInfo
from openapi_client.models.cm_group_list import CMGroupList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the main organisation (its guid id) to get users for
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_group_edit_info = openapi_client.CMGroupEditInfo() # CMGroupEditInfo | 

    try:
        # Get Group edit information
        api_response = api_instance.group_edit_info(organisation_id, session_id, cm_group_edit_info)
        print("The response of AuthApi->group_edit_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->group_edit_info: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the main organisation (its guid id) to get users for | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_group_edit_info** | [**CMGroupEditInfo**](CMGroupEditInfo.md)|  | 

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
**500** | could not return group edit information |  -  |
**200** | return group edit information |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_users_and_groups**
> JsonMessage import_users_and_groups(session_id, cm_import_users, api_version=api_version)



Import users and groups.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_import_users import CMImportUsers
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_import_users = openapi_client.CMImportUsers() # CMImportUsers | 
    api_version = 'api_version_example' # str |  (optional)

    try:
        api_response = api_instance.import_users_and_groups(session_id, cm_import_users, api_version=api_version)
        print("The response of AuthApi->import_users_and_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->import_users_and_groups: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_import_users** | [**CMImportUsers**](CMImportUsers.md)|  | 
 **api_version** | **str**|  | [optional] 

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
**500** | could not import users |  -  |
**200** | import user OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **my_roles**
> List[str] my_roles(organisation_id, session_id)

Get users application roles

Get Roles of logged in user for the logged in Organisation

### Example

```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Get users application roles
        api_response = api_instance.my_roles(organisation_id, session_id)
        print("The response of AuthApi->my_roles:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->my_roles: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the organisation (its guid id) | 
 **session_id** | **str**| a valid SimSage Session id. | 

### Return type

**List[str]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | project-type list response |  -  |
**500** | could not get role list. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_user_from_organisation**
> JsonMessage remove_user_from_organisation(user_id, organisation_id, session_id)

Remove User from Organisation

Remove an existing user from an existing Organisation.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    user_id = 'user_id_example' # str | the user's id (a guid)
    organisation_id = 'organisation_id_example' # str | the organisation's id (a guid)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Remove User from Organisation
        api_response = api_instance.remove_user_from_organisation(user_id, organisation_id, session_id)
        print("The response of AuthApi->remove_user_from_organisation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->remove_user_from_organisation: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| the user&#39;s id (a guid) | 
 **organisation_id** | **str**| the organisation&#39;s id (a guid) | 
 **session_id** | **str**| a valid SimSage Session id. | 

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
**500** | could not remove user from organisation |  -  |
**200** | remove user from organisation OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_password**
> JsonMessage reset_password(cm_user_password_reset)

Perform a password-reset request.

Reset Password

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_user_password_reset import CMUserPasswordReset
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    cm_user_password_reset = openapi_client.CMUserPasswordReset() # CMUserPasswordReset | 

    try:
        # Perform a password-reset request.
        api_response = api_instance.reset_password(cm_user_password_reset)
        print("The response of AuthApi->reset_password:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->reset_password: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_user_password_reset** | [**CMUserPasswordReset**](CMUserPasswordReset.md)|  | 

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
**200** | an reset password OK response |  -  |
**500** | could not reset-password |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_password_request**
> JsonMessage reset_password_request(cm_password_reset_request)

Password Reset Request

Start a password-reset request.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_password_reset_request import CMPasswordResetRequest
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    cm_password_reset_request = openapi_client.CMPasswordResetRequest() # CMPasswordResetRequest | 

    try:
        # Password Reset Request
        api_response = api_instance.reset_password_request(cm_password_reset_request)
        print("The response of AuthApi->reset_password_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->reset_password_request: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_password_reset_request** | [**CMPasswordResetRequest**](CMPasswordResetRequest.md)|  | 

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
**500** | could not start password-reset |  -  |
**200** | an email reset OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_group**
> JsonMessage save_group(session_id, cm_group)

Save Group

Save (update/create) a group.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_group import CMGroup
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_group = openapi_client.CMGroup() # CMGroup | 

    try:
        # Save Group
        api_response = api_instance.save_group(session_id, cm_group)
        print("The response of AuthApi->save_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->save_group: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_group** | [**CMGroup**](CMGroup.md)|  | 

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
**500** | could not save group |  -  |
**200** | save a group OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_in**
> CMSessionVersion sign_in(cm_sign_in_parameters)

Sign In

Administrator Sign-in of an existing user using username/password.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_session_version import CMSessionVersion
from openapi_client.models.cm_sign_in_parameters import CMSignInParameters
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    cm_sign_in_parameters = openapi_client.CMSignInParameters() # CMSignInParameters | 

    try:
        # Sign In
        api_response = api_instance.sign_in(cm_sign_in_parameters)
        print("The response of AuthApi->sign_in:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_in: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cm_sign_in_parameters** | [**CMSignInParameters**](CMSignInParameters.md)|  | 

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
**200** | a sign-in response |  -  |
**500** | could not sign-in username/password |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_in_admin_using_jwt_msal**
> SignInAdmin sign_in_admin_using_jwt_msal(jwt)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_admin import SignInAdmin
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    jwt = 'jwt_example' # str | a valid JWT token.

    try:
        # JWT MSal Sign In
        api_response = api_instance.sign_in_admin_using_jwt_msal(jwt)
        print("The response of AuthApi->sign_in_admin_using_jwt_msal:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_in_admin_using_jwt_msal: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **str**| a valid JWT token. | 

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
**200** | a sign-in admin response |  -  |
**500** | could not sign-in |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_in_admin_using_session_id**
> SignInAdmin sign_in_admin_using_session_id(session_id)

session-id Sign-in

Sign-in a user using an existing session-id.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_admin import SignInAdmin
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # session-id Sign-in
        api_response = api_instance.sign_in_admin_using_session_id(session_id)
        print("The response of AuthApi->sign_in_admin_using_session_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_in_admin_using_session_id: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 

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
**500** | could not sign-in |  -  |
**200** | a sign-in response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_in_dms_using_jwt_msal**
> SignInDmsCmd sign_in_dms_using_jwt_msal(jwt, organisation_id)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_dms_cmd import SignInDmsCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    jwt = 'jwt_example' # str | a valid JWT token.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)

    try:
        # JWT MSal Sign In
        api_response = api_instance.sign_in_dms_using_jwt_msal(jwt, organisation_id)
        print("The response of AuthApi->sign_in_dms_using_jwt_msal:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_in_dms_using_jwt_msal: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **str**| a valid JWT token. | 
 **organisation_id** | **str**| the organisation (its guid id) | 

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
**500** | could not sign-in |  -  |
**200** | a sign-in dms response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_in_evolve_using_jwt_msal**
> SignInDmsCmd sign_in_evolve_using_jwt_msal(jwt, organisation_id)

JWT MSal Sign In

Sign-in an Evolve user using an Msal JWT...

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_dms_cmd import SignInDmsCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    jwt = 'jwt_example' # str | a valid JWT token.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)

    try:
        # JWT MSal Sign In
        api_response = api_instance.sign_in_evolve_using_jwt_msal(jwt, organisation_id)
        print("The response of AuthApi->sign_in_evolve_using_jwt_msal:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_in_evolve_using_jwt_msal: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **str**| a valid JWT token. | 
 **organisation_id** | **str**| the organisation (its guid id) | 

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
**500** | could not sign-in |  -  |
**200** | a sign-in Evolve response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_in_search_using_jwt_msal**
> SignInCmd sign_in_search_using_jwt_msal(jwt, organisation_id)

JWT MSal Sign In

Sign-in a user using an Msal JWT.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_cmd import SignInCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    jwt = 'jwt_example' # str | Schema valid JWT token.
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)

    try:
        # JWT MSal Sign In
        api_response = api_instance.sign_in_search_using_jwt_msal(jwt, organisation_id)
        print("The response of AuthApi->sign_in_search_using_jwt_msal:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_in_search_using_jwt_msal: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwt** | **str**| Schema valid JWT token. | 
 **organisation_id** | **str**| the organisation (its guid id) | 

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
**500** | could not sign-in |  -  |
**200** | a sign-in search response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sign_out**
> JsonMessage sign_out(session_id, api_version=api_version)

Sign Out

Sign-out any signed-in user (owner of the session object only).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.json_message import JsonMessage
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    api_version = 'api_version_example' # str |  (optional)

    try:
        # Sign Out
        api_response = api_instance.sign_out(session_id, api_version=api_version)
        print("The response of AuthApi->sign_out:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->sign_out: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **api_version** | **str**|  | [optional] 

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
**500** | could not sign-out |  -  |
**200** | a sign-out OK response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_organisation**
> CMOrganisation update_organisation(session_id, cm_organisation)

Save Organisation

Update or Create an organisation (save an organisation).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_organisation import CMOrganisation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_organisation = openapi_client.CMOrganisation() # CMOrganisation | 

    try:
        # Save Organisation
        api_response = api_instance.update_organisation(session_id, cm_organisation)
        print("The response of AuthApi->update_organisation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->update_organisation: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_organisation** | [**CMOrganisation**](CMOrganisation.md)|  | 

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
**200** | save organisation response |  -  |
**500** | could not save organisation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user**
> CMUserWithExtras update_user(organisation_id, session_id, cm_user_with_extras)



Update or Create a user (save a user).

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.cm_user_with_extras import CMUserWithExtras
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the main organisation (its guid id) to update a user in.
    session_id = 'session_id_example' # str | a valid SimSage Session id.
    cm_user_with_extras = openapi_client.CMUserWithExtras() # CMUserWithExtras | 

    try:
        api_response = api_instance.update_user(organisation_id, session_id, cm_user_with_extras)
        print("The response of AuthApi->update_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->update_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisation_id** | **str**| the main organisation (its guid id) to update a user in. | 
 **session_id** | **str**| a valid SimSage Session id. | 
 **cm_user_with_extras** | [**CMUserWithExtras**](CMUserWithExtras.md)|  | 

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
**500** | could not save user |  -  |
**200** | save user response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version8**
> SignInCmd version8()

Get Version

Get the version of SimSage Auth Services.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.sign_in_cmd import SignInCmd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://training.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://training.simsage.ai"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)

    try:
        # Get Version
        api_response = api_instance.version8()
        print("The response of AuthApi->version8:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->version8: %s\n" % e)
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
**200** | the version response |  -  |
**500** | could not get version |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

