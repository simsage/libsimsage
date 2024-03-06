# CmSynonymsPaginated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **String** | the organisation (its guid id). | 
**kb_id** | **String** | the knowledge-base (its guid id). | 
**prev_id** | Option<**i32**> | pagination control, the last synonym we looked for previously | [optional]
**page_size** | **i32** | the number of synonyms to return at a time. | 
**filter** | **String** | An optional string filter to apply to all synonyms in the search.  Can be empty in which case SimSage will return all synonyms paginated. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


