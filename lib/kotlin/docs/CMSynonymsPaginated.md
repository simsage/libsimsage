
# CMSynonymsPaginated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the organisation (its guid id). | 
**kbId** | **kotlin.String** | the knowledge-base (its guid id). | 
**pageSize** | **kotlin.Int** | the number of synonyms to return at a time. | 
**filter** | **kotlin.String** | An optional string filter to apply to all synonyms in the search.  Can be empty in which case SimSage will return all synonyms paginated. | 
**prevId** | **kotlin.Int** | pagination control, the last synonym we looked for previously |  [optional]



