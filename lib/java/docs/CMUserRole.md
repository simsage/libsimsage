

# CMUserRole

A user's SimSage-role inside an organisation.  SimSage roles determine what a user can do/access inside SimSage and are specific to SimSage.  Roles include admin (a SimSage administrator, super-user), manager (a SimSage manager, a user that has super-user access to one and one organisation only), operator (a SimSage operator, a user that can access the SimSage operator interface for a specific organisation), dms (a SimSage user that can sign-in to our Document Management System interface, specific to an organisation).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id) this role applies to |  |
|**role** | **String** | the SimSage role inside this organisation |  |



