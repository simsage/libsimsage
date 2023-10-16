# Org.OpenAPITools.Model.JsonMessage
A generic SimSage message class used throughout the system.  This class can be used to either send a success message (information) or an error message (error) but will never send you both at the same time.  Version might not always be set but is the version of the service-layer you're communicating with.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | **string** | A possible error message, empty if information is set | 
**Information** | **string** | An informational message, empty if error is set | 
**VarVersion** | **string** | The version of this service (can be empty) | 
**Time** | **long** | The time this event occurred | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

