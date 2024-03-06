# CmUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the user's id, a guid | 
**email** | **String** | email address of this user (their sign-in and primary identity) | 
**first_name** | **String** | the first-name of this user | 
**surname** | **String** | the second-name (surname) of this user | 
**roles** | [**Vec<crate::models::CmUserRole>**](CMUserRole.md) | a list of SimSage roles associated with this user | 
**operator_kb_list** | [**Vec<crate::models::CmOperatorKnowledgeBase>**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for | 
**group_list** | [**Vec<crate::models::CmGroup>**](CMGroup.md) | a list of security-groups this user is part of (can be empty) | 
**jwt_match_name_value_csv** | **String** | an optional set of csv separated name1=value1,name2=value2 for JWT matching | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


