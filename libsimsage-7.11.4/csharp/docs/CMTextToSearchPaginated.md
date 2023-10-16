# Org.OpenAPITools.Model.CMTextToSearchPaginated
A text-to-search pagination object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id). | 
**KbId** | **string** | the knowledge-base (its guid id). | 
**PrevWord** | **string** | pagination control, the last text-to-search word we looked for previously | 
**PageSize** | **int** | the number of text-to-search to return at a time. | 
**Filter** | **string** | An optional string filter to apply to all text-to-search in the search.  Can be empty in which case SimSage will return all semantics paginated. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

