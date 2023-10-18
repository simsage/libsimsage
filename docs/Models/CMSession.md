# CMSession
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | the session-id, a guid | [default to null] |
| **userId** | **String** | the user associated with this session, their id, a guid | [default to null] |
| **organisationId** | **String** | the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) | [default to null] |
| **email** | **String** | email address of this user | [default to null] |
| **ipAddress** | **String** | the ip-address of the user logging in if captured | [default to null] |
| **lastAccess** | **Long** | a unix-timestamp of the last time this session was accessed/refreshed | [default to null] |
| **role** | **String** | the main/highest role of the user signed-in | [default to null] |
| **sessionType** | **String** | the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

