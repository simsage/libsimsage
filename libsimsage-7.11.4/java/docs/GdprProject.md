

# GdprProject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdBy** | **String** |  |  |
|**lastModifiedBy** | **String** |  |  |
|**created** | **OffsetDateTime** |  |  |
|**lastModified** | **OffsetDateTime** |  |  |
|**lastResultUpdate** | **OffsetDateTime** |  |  [optional] |
|**projectType** | [**ProjectTypeEnum**](#ProjectTypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**searchDetails** | [**CMGdprSearchDetails**](CMGdprSearchDetails.md) |  |  |



## Enum: ProjectTypeEnum

| Name | Value |
|---- | -----|
| FREESTYLE | &quot;FREESTYLE&quot; |
| RIGHT_TO_BE_FORGOTTEN_REQUEST | &quot;RIGHT_TO_BE_FORGOTTEN_REQUEST&quot; |
| DATA_ACCESS_REQUEST | &quot;DATA_ACCESS_REQUEST&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



