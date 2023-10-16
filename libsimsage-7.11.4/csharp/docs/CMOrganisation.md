# Org.OpenAPITools.Model.CMOrganisation
A SimSage organisation object.  Represents a SimSage top-level tenant, aka. an organisation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | the organisation (its guid id). | 
**Name** | **string** | the name of the organisation | 
**Enabled** | **bool** | true if the organisation is enabled (active/operational) | 
**AutoCreateSSOUsers** | **bool** | if enabled, SSO users will auto-create their accounts | 
**AutoCreateSSODomainList** | **List&lt;string&gt;** | a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) | 
**AutoCreateSSOACLList** | **List&lt;string&gt;** | a list of the ACLs initially assigned to each new user of they need creating | 
**AutoCreateSSORoleList** | **List&lt;string&gt;** | a list of the SimSage Roles initially assigned to each new user of they need creating | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

