# Org.OpenAPITools.Model.CMSemanticsPaginatedResult
A paginated semantics return list matching a request for the same.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganisationId** | **string** | the organisation (its guid id). | 
**KbId** | **string** | the knowledge-base (its guid id). | 
**Filter** | **string** | The filter that was used to find these items. | 
**SemanticList** | [**List&lt;CMSemantic&gt;**](CMSemantic.md) | the resulting list of semantics (return) | 
**NumSemantics** | **int** | the total number of semantics that matched. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

