# Org.OpenAPITools.Model.CMSynonymsPaginatedResult
A paginated synonym return list matching a request for the same.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id). | 
**KbId** | **string** | the knowledge-base (its guid id). | 
**Filter** | **string** | The filter that was used to find these items. | 
**SynonymList** | [**List&lt;CMSynonym&gt;**](CMSynonym.md) | the resulting list of synonyms (return) | 
**NumSynonyms** | **int** | the total number of synonyms that matched. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

