# CMOrganisation
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | the organisation (its guid id). | [default to null] |
| **name** | **String** | the name of the organisation | [default to null] |
| **enabled** | **Boolean** | true if the organisation is enabled (active/operational) | [default to null] |
| **autoCreateSSOUsers** | **Boolean** | if enabled, SSO users will auto-create their accounts | [default to null] |
| **autoCreateSSODomainList** | **List** | a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) | [default to null] |
| **autoCreateSSOACLList** | **List** | a list of the ACLs initially assigned to each new user of they need creating | [default to null] |
| **autoCreateSSORoleList** | **List** | a list of the SimSage Roles initially assigned to each new user of they need creating | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

