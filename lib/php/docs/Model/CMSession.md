# # CMSession

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | the session-id, a guid |
**user_id** | **string** | the user associated with this session, their id, a guid |
**organisation_id** | **string** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) |
**email** | **string** | email address of this user |
**ip_address** | **string** | the ip-address of the user logging in if captured |
**last_access** | **int** | a unix-timestamp of the last time this session was accessed/refreshed |
**role** | **string** | the main/highest role of the user signed-in |
**session_type** | **string** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
