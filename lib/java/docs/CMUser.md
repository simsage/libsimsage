

# CMUser

A SimSage user object for editing and reviewing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the user&#39;s id, a guid |  |
|**email** | **String** | email address of this user (their sign-in and primary identity) |  |
|**firstName** | **String** | the first-name of this user |  |
|**surname** | **String** | the second-name (surname) of this user |  |
|**roles** | [**List&lt;CMUserRole&gt;**](CMUserRole.md) | a list of SimSage roles associated with this user |  |
|**operatorKBList** | [**List&lt;CMOperatorKnowledgeBase&gt;**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for |  |
|**groupList** | [**List&lt;CMGroup&gt;**](CMGroup.md) | a list of security-groups this user is part of (can be empty) |  |
|**jwtMatchNameValueCSV** | **String** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching |  |



