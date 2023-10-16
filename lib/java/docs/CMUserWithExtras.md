

# CMUserWithExtras

An object used for updating a SimSage user.  This object can be used to update the user's password too.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the user&#39;s id (its guid id). |  |
|**email** | **String** | the email of this user |  |
|**password** | **String** | a password for this user (or blank if not to be changed) |  |
|**firstName** | **String** | the first-name of this user |  |
|**surname** | **String** | the last-name (surname) of this user |  |
|**roles** | **String** | the roles to be associated with this user |  |
|**operatorKBList** | **String** | the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. |  |
|**groupList** | [**List&lt;CMGroup&gt;**](CMGroup.md) | a list of groups this user is part of (can be empty) |  |



