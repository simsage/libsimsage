

# JsonMessage

A generic SimSage message class used throughout the system.  This class can be used to either send a success message (information) or an error message (error) but will never send you both at the same time.  Version might not always be set but is the version of the service-layer you're communicating with.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** | A possible error message, empty if information is set |  |
|**information** | **String** | An informational message, empty if error is set |  |
|**version** | **String** | The version of this service (can be empty) |  |
|**time** | **Long** | The time this event occurred |  |



