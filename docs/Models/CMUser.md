# CMUser
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | the user&#39;s id, a guid | [default to null] |
| **email** | **String** | email address of this user (their sign-in and primary identity) | [default to null] |
| **firstName** | **String** | the first-name of this user | [default to null] |
| **surname** | **String** | the second-name (surname) of this user | [default to null] |
| **roles** | [**List**](CMUserRole.md) | a list of SimSage roles associated with this user | [default to null] |
| **operatorKBList** | [**List**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for | [default to null] |
| **groupList** | [**List**](CMGroup.md) | a list of security-groups this user is part of (can be empty) | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

