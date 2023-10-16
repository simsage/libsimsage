

# CMLoggerEntry

This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | the main message of the log entry |  |
|**type** | **String** | the type of log entry (eg. Debug, Info, Warn, Error) |  |
|**service** | **String** | the name of the service that generated this log |  |
|**stackTrace** | **String** | the stack traces if applicable |  |
|**created** | **Long** | unit date-time of this log |  |



