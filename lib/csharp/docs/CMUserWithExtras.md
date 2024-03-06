# Org.OpenAPITools.Model.CMUserWithExtras
An object used for updating a SimSage user.  This object can be used to update the user's password too.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | the user&#39;s id (its guid id). | 
**Email** | **string** | the email of this user | 
**Password** | **string** | a password for this user (or blank if not to be changed) | 
**FirstName** | **string** | the first-name of this user | 
**Surname** | **string** | the last-name (surname) of this user | 
**Roles** | **string** | the roles to be associated with this user | 
**OperatorKBList** | **string** | the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. | 
**GroupList** | [**List&lt;CMGroup&gt;**](CMGroup.md) | a list of groups this user is part of (can be empty) | 
**JwtMatchNameValueCSV** | **string** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

