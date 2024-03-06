# CmSession

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the session-id, a guid | 
**user_id** | **String** | the user associated with this session, their id, a guid | 
**organisation_id** | **String** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) | 
**email** | **String** | email address of this user | 
**ip_address** | **String** | the ip-address of the user logging in if captured | 
**last_access** | **i64** | a unix-timestamp of the last time this session was accessed/refreshed | 
**role** | **String** | the main/highest role of the user signed-in | 
**session_type** | **String** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


