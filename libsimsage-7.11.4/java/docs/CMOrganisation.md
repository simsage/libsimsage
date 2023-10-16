

# CMOrganisation

A SimSage organisation object.  Represents a SimSage top-level tenant, aka. an organisation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the organisation (its guid id). |  |
|**name** | **String** | the name of the organisation |  |
|**enabled** | **Boolean** | true if the organisation is enabled (active/operational) |  |
|**autoCreateSSOUsers** | **Boolean** | if enabled, SSO users will auto-create their accounts |  |
|**autoCreateSSODomainList** | **List&lt;String&gt;** | a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) |  |
|**autoCreateSSOACLList** | **List&lt;String&gt;** | a list of the ACLs initially assigned to each new user of they need creating |  |
|**autoCreateSSORoleList** | **List&lt;String&gt;** | a list of the SimSage Roles initially assigned to each new user of they need creating |  |



