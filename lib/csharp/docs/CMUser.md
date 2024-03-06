# Org.OpenAPITools.Model.CMUser
A SimSage user object for editing and reviewing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | the user&#39;s id, a guid | 
**Email** | **string** | email address of this user (their sign-in and primary identity) | 
**FirstName** | **string** | the first-name of this user | 
**Surname** | **string** | the second-name (surname) of this user | 
**Roles** | [**List&lt;CMUserRole&gt;**](CMUserRole.md) | a list of SimSage roles associated with this user | 
**OperatorKBList** | [**List&lt;CMOperatorKnowledgeBase&gt;**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for | 
**GroupList** | [**List&lt;CMGroup&gt;**](CMGroup.md) | a list of security-groups this user is part of (can be empty) | 
**JwtMatchNameValueCSV** | **string** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

