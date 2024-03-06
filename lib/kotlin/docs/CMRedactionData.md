
# CMRedactionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** |  | 
**kbId** | **kotlin.String** |  | 
**projectId** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**redactions** | [**kotlin.collections.List&lt;CMRedaction&gt;**](CMRedaction.md) |  | 
**documentStatus** | [**inline**](#DocumentStatus) |  | 
**documentAction** | [**inline**](#DocumentAction) |  | 
**annotated** | **kotlin.Boolean** |  | 
**createForExport** | **kotlin.Boolean** |  | 
**exportNativeFormat** | **kotlin.Boolean** |  | 


<a id="DocumentStatus"></a>
## Enum: documentStatus
Name | Value
---- | -----
documentStatus | NEW, IN_PROGRESS, COMPLETED


<a id="DocumentAction"></a>
## Enum: documentAction
Name | Value
---- | -----
documentAction | NONE, REDACT, IGNORE, DELETE



