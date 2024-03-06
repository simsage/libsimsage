# CmUserWithExtras

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the user's id (its guid id). | 
**email** | **String** | the email of this user | 
**password** | **String** | a password for this user (or blank if not to be changed) | 
**first_name** | **String** | the first-name of this user | 
**surname** | **String** | the last-name (surname) of this user | 
**roles** | **String** | the roles to be associated with this user | 
**operator_kb_list** | **String** | the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. | 
**group_list** | [**Vec<crate::models::CmGroup>**](CMGroup.md) | a list of groups this user is part of (can be empty) | 
**jwt_match_name_value_csv** | **String** | an optional set of csv separated name1=value1,name2=value2 for JWT matching | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


