
# GdprProject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdBy** | **kotlin.String** |  | 
**lastModifiedBy** | **kotlin.String** |  | 
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**projectType** | [**inline**](#ProjectType) |  | 
**status** | [**inline**](#Status) |  | 
**searchDetails** | [**CMGdprSearchDetails**](CMGdprSearchDetails.md) |  | 
**id** | **kotlin.String** |  |  [optional]
**lastResultUpdate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]


<a id="ProjectType"></a>
## Enum: projectType
Name | Value
---- | -----
projectType | FREESTYLE, RIGHT_TO_BE_FORGOTTEN_REQUEST, DATA_ACCESS_REQUEST


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | NEW, IN_PROGRESS, COMPLETED



