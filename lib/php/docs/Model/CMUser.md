# # CMUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | the user&#39;s id, a guid |
**email** | **string** | email address of this user (their sign-in and primary identity) |
**first_name** | **string** | the first-name of this user |
**surname** | **string** | the second-name (surname) of this user |
**roles** | [**\OpenAPI\Client\Model\CMUserRole[]**](CMUserRole.md) | a list of SimSage roles associated with this user |
**operator_kb_list** | [**\OpenAPI\Client\Model\CMOperatorKnowledgeBase[]**](CMOperatorKnowledgeBase.md) | a list of knowledge-bases this user is an operator for |
**group_list** | [**\OpenAPI\Client\Model\CMGroup[]**](CMGroup.md) | a list of security-groups this user is part of (can be empty) |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
