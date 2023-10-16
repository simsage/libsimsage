

# CMSession

A session object, A session's id is the \"session-id\" used throughout the SimSage API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the session-id, a guid |  |
|**userId** | **String** | the user associated with this session, their id, a guid |  |
|**organisationId** | **String** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) |  |
|**email** | **String** | email address of this user |  |
|**ipAddress** | **String** | the ip-address of the user logging in if captured |  |
|**lastAccess** | **Long** | a unix-timestamp of the last time this session was accessed/refreshed |  |
|**role** | **String** | the main/highest role of the user signed-in |  |
|**sessionType** | **String** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) |  |



