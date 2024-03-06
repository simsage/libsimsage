
# CMSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | the session-id, a guid | 
**userId** | **kotlin.String** | the user associated with this session, their id, a guid | 
**organisationId** | **kotlin.String** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) | 
**email** | **kotlin.String** | email address of this user | 
**ipAddress** | **kotlin.String** | the ip-address of the user logging in if captured | 
**lastAccess** | **kotlin.Long** | a unix-timestamp of the last time this session was accessed/refreshed | 
**role** | **kotlin.String** | the main/highest role of the user signed-in | 
**sessionType** | **kotlin.String** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) | 



