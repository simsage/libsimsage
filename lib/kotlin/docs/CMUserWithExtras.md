
# CMUserWithExtras

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | the user&#39;s id (its guid id). | 
**email** | **kotlin.String** | the email of this user | 
**password** | **kotlin.String** | a password for this user (or blank if not to be changed) | 
**firstName** | **kotlin.String** | the first-name of this user | 
**surname** | **kotlin.String** | the last-name (surname) of this user | 
**roles** | **kotlin.String** | the roles to be associated with this user | 
**operatorKBList** | **kotlin.String** | the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. | 
**groupList** | [**kotlin.collections.List&lt;CMGroup&gt;**](CMGroup.md) | a list of groups this user is part of (can be empty) | 
**jwtMatchNameValueCSV** | **kotlin.String** | an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching | 



