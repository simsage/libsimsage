
# CMOrganisation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | the organisation (its guid id). | 
**name** | **kotlin.String** | the name of the organisation | 
**enabled** | **kotlin.Boolean** | true if the organisation is enabled (active/operational) | 
**autoCreateSSOUsers** | **kotlin.Boolean** | if enabled, SSO users will auto-create their accounts | 
**autoCreateSSODomainList** | **kotlin.collections.List&lt;kotlin.String&gt;** | a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) | 
**autoCreateSSOACLList** | **kotlin.collections.List&lt;kotlin.String&gt;** | a list of the ACLs initially assigned to each new user of they need creating | 
**autoCreateSSORoleList** | **kotlin.collections.List&lt;kotlin.String&gt;** | a list of the SimSage Roles initially assigned to each new user of they need creating | 



