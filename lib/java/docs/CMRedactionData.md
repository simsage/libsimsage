

# CMRedactionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** |  |  |
|**kbId** | **String** |  |  |
|**projectId** | **String** |  |  |
|**url** | **String** |  |  |
|**redactions** | [**List&lt;CMRedaction&gt;**](CMRedaction.md) |  |  |
|**documentStatus** | [**DocumentStatusEnum**](#DocumentStatusEnum) |  |  |
|**documentAction** | [**DocumentActionEnum**](#DocumentActionEnum) |  |  |
|**annotated** | **Boolean** |  |  |
|**createForExport** | **Boolean** |  |  |
|**exportNativeFormat** | **Boolean** |  |  |



## Enum: DocumentStatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



## Enum: DocumentActionEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| REDACT | &quot;REDACT&quot; |
| IGNORE | &quot;IGNORE&quot; |
| DELETE | &quot;DELETE&quot; |



