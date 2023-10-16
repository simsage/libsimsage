# Org.OpenAPITools.Model.CMSynonymsPaginated
a synonym paginated filter object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id). | 
**KbId** | **string** | the knowledge-base (its guid id). | 
**PrevId** | **int** | pagination control, the last synonym we looked for previously | [optional] 
**PageSize** | **int** | the number of synonyms to return at a time. | 
**Filter** | **string** | An optional string filter to apply to all synonyms in the search.  Can be empty in which case SimSage will return all synonyms paginated. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

