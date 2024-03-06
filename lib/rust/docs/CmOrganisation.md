# CmOrganisation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the organisation (its guid id). | 
**name** | **String** | the name of the organisation | 
**enabled** | **bool** | true if the organisation is enabled (active/operational) | 
**auto_create_sso_users** | **bool** | if enabled, SSO users will auto-create their accounts | 
**auto_create_sso_domain_list** | **Vec<String>** | a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) | 
**auto_create_ssoacl_list** | **Vec<String>** | a list of the ACLs initially assigned to each new user of they need creating | 
**auto_create_sso_role_list** | **Vec<String>** | a list of the SimSage Roles initially assigned to each new user of they need creating | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


