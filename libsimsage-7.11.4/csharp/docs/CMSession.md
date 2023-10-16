# Org.OpenAPITools.Model.CMSession
A session object, A session's id is the \"session-id\" used throughout the SimSage API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | the session-id, a guid | 
**UserId** | **string** | the user associated with this session, their id, a guid | 
**OrganisationId** | **string** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) | 
**Email** | **string** | email address of this user | 
**IpAddress** | **string** | the ip-address of the user logging in if captured | 
**LastAccess** | **long** | a unix-timestamp of the last time this session was accessed/refreshed | 
**Role** | **string** | the main/highest role of the user signed-in | 
**SessionType** | **string** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

