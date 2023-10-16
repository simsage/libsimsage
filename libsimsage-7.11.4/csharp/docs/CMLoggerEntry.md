# Org.OpenAPITools.Model.CMLoggerEntry
This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** | the main message of the log entry | 
**Type** | **string** | the type of log entry (eg. Debug, Info, Warn, Error) | 
**Service** | **string** | the name of the service that generated this log | 
**StackTrace** | **string** | the stack traces if applicable | 
**Created** | **long** | unit date-time of this log | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

