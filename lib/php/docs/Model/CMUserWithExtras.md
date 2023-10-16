# # CMUserWithExtras

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | the user&#39;s id (its guid id). |
**email** | **string** | the email of this user |
**password** | **string** | a password for this user (or blank if not to be changed) |
**first_name** | **string** | the first-name of this user |
**surname** | **string** | the last-name (surname) of this user |
**roles** | **string** | the roles to be associated with this user |
**operator_kb_list** | **string** | the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. |
**group_list** | [**\OpenAPI\Client\Model\CMGroup[]**](CMGroup.md) | a list of groups this user is part of (can be empty) |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
