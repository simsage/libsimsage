
# CMUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | the user&#39;s id, a guid | 
**email** | **kotlin.String** | email address of this user (their sign-in and primary identity) | 
**firstName** | **kotlin.String** | the first-name of this user | 
**surname** | **kotlin.String** | the second-name (surname) of this user | 
**roles** | [**kotlin.collections.List&lt;CMUserRole&gt;**](CMUserRole.md) | a list of SimSage roles associated with this user | 
**operatorKBList** | [**kotlin.collections.List&lt;CMOperatorKnowledgeBase&gt;**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for | 
**groupList** | [**kotlin.collections.List&lt;CMGroup&gt;**](CMGroup.md) | a list of security-groups this user is part of (can be empty) | 
**jwtMatchNameValueCSV** | **kotlin.String** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching | 



